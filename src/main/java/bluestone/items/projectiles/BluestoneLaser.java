package bluestone.items.projectiles;

import bluestone.Main;
import bluestone.entities.EntityLaser;
import bluestone.init.ModItems;
import bluestone.util.IHasModel;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BluestoneLaser extends ItemArrow{
	
	public BluestoneLaser(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) {
		EntityLaser entityLaser = new EntityLaser(worldIn, shooter);
		return entityLaser;
	}
}
