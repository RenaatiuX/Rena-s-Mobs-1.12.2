package RenaMobs.entity.render;

import RenaMobs.entity.EntityFenix;
import RenaMobs.entity.model.Fenix;
import RenaMobs.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFenix extends RenderLiving<EntityFenix>
{

public static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MODID + ":textures/entity/fenix.png");
	
	public RenderFenix(RenderManager manager)
	{
		super(manager, new Fenix(), 1.0F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityFenix entity)
	{
		return TEXTURE;
	}

}
