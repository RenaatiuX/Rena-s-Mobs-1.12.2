package RenaMobs.entity;



import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityAmmyt extends EntityMob
{

	
	
	public EntityAmmyt(World worldIn) {
		super(worldIn);
		this.setSize(2F, 2F);
		
	}


	
	@Override
	protected void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0D, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 12.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true)); 
	}
	
	 
	@Override
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(64.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(4.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5.0D);;
    }
	
	@Override
	public float getEyeHeight()
	{
		return 1.8F;
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


	@Override
	public boolean getCanSpawnHere() {
		
		return true;
	}
	
	 protected boolean canDespawn()
	    {
	        return false;
	    }

	


}