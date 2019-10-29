package bluestone.entities;

import bluestone.util.Reference;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLaser extends RenderArrow<EntityLaser>{

	public RenderLaser(RenderManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityLaser entity) {
		// TODO Auto-generated method stub
		return new ResourceLocation(Reference.MOD_ID + ":textures/entity/arrows/bluestone_laser.png");
	}

}
