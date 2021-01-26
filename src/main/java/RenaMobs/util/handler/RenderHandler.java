package RenaMobs.util.handler;

import RenaMobs.entity.EntityAmmyt;
import RenaMobs.entity.EntityAngler;
import RenaMobs.entity.render.RenderAmmyt;
import RenaMobs.entity.render.RenderAngler;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityAmmyt.class, new IRenderFactory<EntityAmmyt>() 
		{
			@Override
			public Render<? super EntityAmmyt> createRenderFor(RenderManager manager)
			{
				return new RenderAmmyt(manager);
			}
			
			
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityAngler.class, new IRenderFactory<EntityAngler>() 
		{
			@Override
			public Render<? super EntityAngler> createRenderFor(RenderManager manager)
			{
				return new RenderAngler(manager);
			}
			
			
		});
	}
}
