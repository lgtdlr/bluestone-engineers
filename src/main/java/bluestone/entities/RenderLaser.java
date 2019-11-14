package bluestone.entities;

import bluestone.util.Reference;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLaser extends RenderArrow<EntityLaser>{

	public RenderLaser(RenderManager manager) {
		super(manager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityLaser entity) {
		return new ResourceLocation(Reference.MOD_ID + ":textures/entity/arrows/bluestone_laser.png");
	}

}
