package bluestone.init;

import java.util.ArrayList;
import java.util.List;

import bluestone.blocks.BluestoneBlock;
import bluestone.blocks.BluestoneOre;
import bluestone.blocks.BluestoneTorch;
import bluestone.blocks.fluids.BluestoneMagma;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block BLUESTONE_ORE = new BluestoneOre("bluestone_ore", Material.ROCK);
	public static final Block BLUESTONE_BLOCK = new BluestoneBlock("bluestone_block", Material.ROCK);
	public static final Block BLUESTONE_TORCH = new BluestoneTorch("bluestone_torch", Material.REDSTONE_LIGHT);
	public static final Block BLUESTONE_MAGMA = new BluestoneMagma("bluestone_magma", ModFluids.BLUESTONE_MAGMA, Material.LAVA);
	public static final Block RICH_BLUESTONE_ORE = new BluestoneOre("rich_bluestone_ore", Material.ROCK);
}
