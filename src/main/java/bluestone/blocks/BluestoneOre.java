package bluestone.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BluestoneOre extends BluestoneBlockBase {

	public BluestoneOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.5F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(1.0F);
		
	}
}

