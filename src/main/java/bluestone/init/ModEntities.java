package bluestone.init;

import bluestone.Main;
import bluestone.entities.EntityLaser;
import bluestone.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	
	public static void registerEntities() {
		registerArrow("bluestone_laser", EntityLaser.class, Reference.ENTITY_LASER);
	}
	
	private static void registerArrow(String name, Class<? extends Entity> entity, int id) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, 100, 20, true);
	}
}
