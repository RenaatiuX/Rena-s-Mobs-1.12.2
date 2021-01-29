package RenaMobs.init;

import RenaMobs.Main;
import RenaMobs.entity.EntityAmmyt;
import RenaMobs.entity.EntityAngler;
import RenaMobs.entity.EntityFenix;
import RenaMobs.util.Reference;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	private static int id = 0;
	
	public static void registerEntities()
	{
		

			//registry
			/*The method is: 
			EntityRegistry.registerModEntity(registryName, entityClass, entityName, id, mod, trackingRange, updateFrequency, sendsVelocityUpdates, eggPrimary, eggSecondary);*/
			EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "ammyt"),EntityAmmyt.class, "ammyt", id++, Main.instance, 1024, 1, true, 11437146, 000000);
			EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "angler"),EntityAngler.class, "angler", id++, Main.instance, 1024, 1, true, 11437146, 000000);
			EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID, "fenix"),EntityFenix.class, "fenix", id++, Main.instance, 1024, 1, true, 11437146, 000000);

			//spawns
			EntityRegistry.addSpawn(EntityAmmyt.class, 20, 1, 2, EnumCreatureType.MONSTER, Biomes.DESERT, Biomes.DESERT_HILLS);
			
			EntityRegistry.addSpawn(EntityAngler.class, 20, 1, 2, EnumCreatureType.MONSTER, Biomes.OCEAN, Biomes.DEEP_OCEAN);
			EntitySpawnPlacementRegistry.setPlacementType(EntityAngler.class, EntityLiving.SpawnPlacementType.IN_WATER);
			
			EntityRegistry.addSpawn(EntityFenix.class, 20, 1, 2, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS, Biomes.TAIGA_HILLS);
			EntitySpawnPlacementRegistry.setPlacementType(EntityFenix.class, EntityLiving.SpawnPlacementType.IN_AIR);
			
			
			
		}	
	}
	
	

