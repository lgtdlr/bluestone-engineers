package bluestone.items.usable;

import bluestone.Main;
import bluestone.init.ModItems;
import bluestone.util.IHasModel;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class BluestoneBow extends ItemBow implements IHasModel {

	public BluestoneBow(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxDamage(2000);
		setCreativeTab(Main.tabBluestone);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public int getItemEnchantability() {
		return 25;
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
