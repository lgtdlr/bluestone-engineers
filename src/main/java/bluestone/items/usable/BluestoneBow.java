package bluestone.items.usable;

import bluestone.Main;
import bluestone.init.ModItems;
import bluestone.util.IHasModel;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class BluestoneBow extends ItemBow implements IHasModel {

	public BluestoneBow(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxDamage(2000);
		setCreativeTab(Main.tabBluestone);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	protected boolean isArrow(ItemStack stack){
        return (stack.getItem() == ModItems.BLUESTONE_LASER);
    }
	
	@Override
	public int getItemEnchantability() {
		return 25;
	}
	
	public static float getArrowVelocity(int charge)
    {
        return 20.0F;
    }
	
	@Override
	public int getMaxItemUseDuration(ItemStack stack)
    {
        return 100000;
    }
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
