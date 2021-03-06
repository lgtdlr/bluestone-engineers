package bluestone.blocks;

import bluestone.Main;
import bluestone.init.ModBlocks;
import bluestone.init.ModItems;
import bluestone.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BluestoneBlockBase extends Block implements IHasModel {
	public BluestoneBlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);

		setCreativeTab(Main.tabBluestone);

		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "normal");

	}

}
