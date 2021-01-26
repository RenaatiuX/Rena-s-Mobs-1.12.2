package RenaMobs.entity.render;

import RenaMobs.entity.EntityAmmyt;
import RenaMobs.entity.model.Ammyt;
import RenaMobs.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAmmyt extends RenderLiving<EntityAmmyt>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MODID + ":textures/entity/ammyt.png");
	
	public RenderAmmyt(RenderManager manager)
	{
		super(manager, new Ammyt(), 1.0F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityAmmyt entity)
	{
		return TEXTURE;
	}
	
	
	
	
}