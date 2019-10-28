package bluestone.blocks;

import bluestone.Main;
import bluestone.init.BluestoneBlocks;
import bluestone.init.ModItems;
import bluestone.util.IHasModel;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BluestoneBlockTorchBase extends BlockTorch implements IHasModel {
	
	public BluestoneBlockTorchBase(String name, Material material) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);

		setCreativeTab(Main.tabBluestone);

		BluestoneBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "normal");

	}
}
