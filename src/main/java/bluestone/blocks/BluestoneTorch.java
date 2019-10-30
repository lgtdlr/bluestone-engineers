package bluestone.blocks;

import bluestone.Main;
import bluestone.init.ModBlocks;
import bluestone.init.ModItems;
import bluestone.util.IHasModel;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BluestoneTorch extends BlockTorch implements IHasModel {
	
	public BluestoneTorch(String name, Material material) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setLightLevel(1.0F);
		setSoundType(SoundType.WOOD);

		setCreativeTab(Main.tabBluestone);

		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "normal");

	}
}
