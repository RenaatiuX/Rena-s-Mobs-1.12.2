package RenaMobs.util.handler;

import RenaMobs.init.EntityInit;
import RenaMobs.init.ItemInit;
import RenaMobs.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel) 
			{
				((IHasModel)item).registerModels();
			}
			
			
		}
	}
	
	
	
	public static void preInitRegistries(FMLPreInitializationEvent event)
	{
		
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
	}
	
	public static void initRegistries(FMLInitializationEvent event)
	{
		
	}
	
	public static void postInitRegistries() 
	{
		
	}

}
