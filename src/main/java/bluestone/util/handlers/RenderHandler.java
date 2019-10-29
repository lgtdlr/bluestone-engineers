package bluestone.util.handlers;

import bluestone.entities.EntityLaser;
import bluestone.entities.RenderLaser;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RenderHandler {
	
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityLaser.class, new IRenderFactory<EntityLaser>() {

			@Override
			public Render<? super EntityLaser> createRenderFor(RenderManager manager) {
				// TODO Auto-generated method stub
				return new RenderLaser(manager);
			}
			
		});
	}
}
