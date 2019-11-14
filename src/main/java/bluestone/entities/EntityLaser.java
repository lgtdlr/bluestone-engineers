package bluestone.entities;

import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class EntityLaser extends EntityArrow {

	public EntityLaser(World worldIn) {
		super(worldIn);
		this.pickupStatus = EntityArrow.PickupStatus.DISALLOWED;
	}

	public EntityLaser(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
		this.pickupStatus = EntityArrow.PickupStatus.DISALLOWED;
	}

	public EntityLaser(World worldIn, EntityLivingBase shooter) {
		super(worldIn, shooter);
		this.pickupStatus = EntityArrow.PickupStatus.DISALLOWED;
	}

	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(Items.REDSTONE);
	}

	@Override
	protected void arrowHit(EntityLivingBase living) {
		super.arrowHit(living);
		living.setGlowing(true);
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (this.world.isRemote && this.inGround && this.timeInGround % 5 == 0) {
			this.spawnParticles(1);
		} else {
			this.spawnParticles(2);
		}
	}

	private void spawnParticles(int particleCount) {
		Random rand = new Random();
		int i = rand.nextInt(15);
		double zSpeed = (double) (i >> 0 & 255) / 255.0D;
		for (int j = 0; j < particleCount; ++j) {
			this.world.spawnParticle(EnumParticleTypes.REDSTONE,
					this.posX + (this.rand.nextDouble() - 0.5D) * (double) this.width,
					this.posY + this.rand.nextDouble() * (double) this.height,
					this.posZ + (this.rand.nextDouble() - 0.5D) * (double) this.width, 0.0, 0.0, zSpeed);
		}
	}

	@Override
	public void onCollideWithPlayer(EntityPlayer entityIn) {
		if (!this.world.isRemote && this.inGround && this.arrowShake <= 0) {
			boolean flag = this.pickupStatus == EntityArrow.PickupStatus.ALLOWED
					|| this.pickupStatus == EntityArrow.PickupStatus.CREATIVE_ONLY
							&& entityIn.capabilities.isCreativeMode;
			this.setDead();
			if (this.pickupStatus == EntityArrow.PickupStatus.ALLOWED
					&& !entityIn.inventory.addItemStackToInventory(this.getArrowStack())) {
				flag = false;
				this.setDead();
			}

			if (flag) {
				this.setDead();
			}
		}

	}
}
