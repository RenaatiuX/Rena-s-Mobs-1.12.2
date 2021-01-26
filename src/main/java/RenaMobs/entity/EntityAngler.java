package RenaMobs.entity;


import RenaMobs.entity.ai.AnglerAIWander;
import RenaMobs.entity.ai.AquaticAIFindWaterTarget;
import RenaMobs.entity.ai.AquaticAIGetInWater;
import net.minecraft.block.material.Material;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityLookHelper;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityAngler extends EntityMob {
	
	
	 private static final DataParameter<Boolean> MOVING = EntityDataManager.<Boolean>createKey(EntityAngler.class, DataSerializers.BOOLEAN);
	 public EntityAngler(World worldIn) {
		super(worldIn);
		this.stepHeight = 1;
		this.moveHelper = new EntityAngler.AnglerMoveHelper(this);
		this.setSize(1.0f, 1.0f);
		
		
	}
	 

	
	 @Override
	 protected int getExperiencePoints(EntityPlayer player) {
		
		return 5;
	}
	
	
	@Override
	public float getEyeHeight()
	{
		return 1.0F;
	}
	
	
	public boolean isPushedByWater()
    {
        return false;
    }
	
	 public float getBlockPathWeight(BlockPos pos) {
	        return this.world.getBlockState(pos.down()).getMaterial() == Material.WATER ? 10.0F : this.world.getLightBrightness(pos) - 0.5F;
	        
	    }
	
	@Override
	protected void initEntityAI() {
		
		this.tasks.addTask(1, new AquaticAIFindWaterTarget(this, 10, true));
		this.tasks.addTask(2, new AquaticAIGetInWater(this, 3.0D));
        this.tasks.addTask(3, new AnglerAIWander(this, 3));
		this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 12.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true)); 

		
	}
	
	 protected void applyEntityAttributes() {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
	        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
	    }
	 
	 protected PathNavigate createNavigator(World worldIn)
	    {
	        return new PathNavigateSwimmer(this, worldIn);
	    }
	 
	 protected void entityInit()
	    {
	        super.entityInit();
	        this.dataManager.register(MOVING, Boolean.valueOf(false));
	        
	    }
	 
	 public boolean isMoving()
	    {
	        return ((Boolean)this.dataManager.get(MOVING)).booleanValue();
	    }
	 
	 
	private void setMoving(boolean moving)
	    {
	        this.dataManager.set(MOVING, Boolean.valueOf(moving));
	    }
	    
	 public int getTalkInterval()
	    {
	        return 160;
	    }

	 
	 public int getVerticalFaceSpeed()
	    {
	        return 180;
	    }
	 
	 static class AnglerMoveHelper extends EntityMoveHelper
     {
         private final EntityAngler entityAngler;

         public AnglerMoveHelper(EntityAngler angler)
         {
             super(angler);
             this.entityAngler = angler;
         }

         public void onUpdateMoveHelper()
         {
             if (this.action == EntityMoveHelper.Action.MOVE_TO && !this.entityAngler.getNavigator().noPath())
             {
                 double d0 = this.posX - this.entityAngler.posX;
                 double d1 = this.posY - this.entityAngler.posY;
                 double d2 = this.posZ - this.entityAngler.posZ;
                 double d3 = (double)MathHelper.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
                 d1 = d1 / d3;
                 float f = (float)(MathHelper.atan2(d2, d0) * (180D / Math.PI)) - 90.0F;
                 this.entityAngler.rotationYaw = this.limitAngle(this.entityAngler.rotationYaw, f, 90.0F);
                 this.entityAngler.renderYawOffset = this.entityAngler.rotationYaw;
                 float f1 = (float)(this.speed * this.entityAngler.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue());
                 this.entityAngler.setAIMoveSpeed(this.entityAngler.getAIMoveSpeed() + (f1 - this.entityAngler.getAIMoveSpeed()) * 0.125F);
                 double d4 = Math.sin((double)(this.entityAngler.ticksExisted + this.entityAngler.getEntityId()) * 0.5D) * 0.05D;
                 double d5 = Math.cos((double)(this.entityAngler.rotationYaw * 0.017453292F));
                 double d6 = Math.sin((double)(this.entityAngler.rotationYaw * 0.017453292F));
                 this.entityAngler.motionX += d4 * d5;
                 this.entityAngler.motionZ += d4 * d6;
                 d4 = Math.sin((double)(this.entityAngler.ticksExisted + this.entityAngler.getEntityId()) * 0.75D) * 0.05D;
                 this.entityAngler.motionY += d4 * (d6 + d5) * 0.25D;
                 this.entityAngler.motionY += (double)this.entityAngler.getAIMoveSpeed() * d1 * 0.1D;
                 EntityLookHelper entitylookhelper = this.entityAngler.getLookHelper();
                 double d7 = this.entityAngler.posX + d0 / d3 * 2.0D;
                 double d8 = (double)this.entityAngler.getEyeHeight() + this.entityAngler.posY + d1 / d3;
                 double d9 = this.entityAngler.posZ + d2 / d3 * 2.0D;
                 double d10 = entitylookhelper.getLookPosX();
                 double d11 = entitylookhelper.getLookPosY();
                 double d12 = entitylookhelper.getLookPosZ();

                 if (!entitylookhelper.getIsLooking())
                 {
                     d10 = d7;
                     d11 = d8;
                     d12 = d9;
                 }

                 this.entityAngler.getLookHelper().setLookPosition(d10 + (d7 - d10) * 0.125D, d11 + (d8 - d11) * 0.125D, d12 + (d9 - d12) * 0.125D, 10.0F, 40.0F);
                 this.entityAngler.setMoving(true);
             }
             else
             {
                 this.entityAngler.setAIMoveSpeed(0.0F);
                 this.entityAngler.setMoving(false);
             }
         }
     }
	 
	 public boolean isNotColliding()
	    {
		 return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this);
	    }
	 
	 @Override
	 public boolean getCanSpawnHere() {
		 
		 return this.posY > 30 && this.posY < (double) this.world.getSeaLevel() && super.getCanSpawnHere();
		 }

	 
	 public static boolean isWaterBlock(World world, BlockPos pos) {
	        return world.getBlockState(pos).getMaterial() == Material.WATER;
	    }
	 
	 @Override
	    public boolean isInWater() {
		        return super.isInWater() || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
		    }
	 
	 @Override
	    public void travel(float strafe, float vertical, float forward) {
		 
		 if (this.isServerWorld() && this.isInWater()) {
	            
			 this.moveRelative(strafe, vertical, forward, 0.1F);
	            this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
	            this.motionX *= 0.9D;
	            this.motionY *= 0.9D;
	            this.motionZ *= 0.9D;

	            if (!this.isMoving())
	            {
	                this.motionY -= 0.005D;
	            }
	               
	            } else {
	                super.travel(strafe, vertical, forward);
	            
	        }
	   }
	        
	
	@Override
	protected SoundEvent getAmbientSound() {
		// TODO Auto-generated method stub
		return super.getAmbientSound();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		// TODO Auto-generated method stub
		return super.getHurtSound(damageSourceIn);
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		// TODO Auto-generated method stub
		return super.getDeathSound();
	}

	
	 protected boolean canDespawn()
	    {
	        return false;
	    }
	 
	 public boolean canBreatheUnderwater()
	    {
	        return true;
	    }
	 
	 public void onEntityUpdate()
	    {
	        int i = this.getAir();
	        super.onEntityUpdate();

	        if (this.isEntityAlive() && !this.isInWater())
	        {
	            --i;
	            this.setAir(i);

	            if (this.getAir() == -20)
	            {
	                this.setAir(0);
	                this.attackEntityFrom(DamageSource.DROWN, 2.0F);
	            }
	        }
	        else
	        {
	            this.setAir(300);
	        }
	    }
	 
	 protected boolean isValidLightLevel()
	    {
	        return true;
	    }




	 
	   
}