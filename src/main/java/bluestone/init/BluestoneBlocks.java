package bluestone.init;

import java.util.ArrayList;
import java.util.List;

import bluestone.blocks.BluestoneBlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BluestoneBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block BLUESTONE_BLOCK = new BluestoneBlockBase("bluestone_block", Material.IRON);
	 
}
