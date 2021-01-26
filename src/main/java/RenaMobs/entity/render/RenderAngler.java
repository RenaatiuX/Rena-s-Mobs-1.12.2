package RenaMobs.entity.render;

import RenaMobs.entity.EntityAngler;
import RenaMobs.entity.model.Angler;
import RenaMobs.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAngler extends RenderLiving<EntityAngler>
{

	public static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MODID + ":textures/entity/angler.png");
	
	public RenderAngler(RenderManager manager)
	{
		super(manager, new Angler(), 1.0F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityAngler entity)
	{
		return TEXTURE;
	}
}
