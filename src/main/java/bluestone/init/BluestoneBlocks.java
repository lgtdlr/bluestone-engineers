package bluestone.init;

import java.util.ArrayList;
import java.util.List;

import bluestone.Main;
import bluestone.blocks.BluestoneBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BluestoneBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block BLUESTONE_BLOCK = new BluestoneBlock("bluestone_block", Material.ROCK, ModItems.BLUESTONE_DUST, 1, 5).setHardness(3f).setResistance(5f).setCreativeTab(Main.tabBluestone);


}