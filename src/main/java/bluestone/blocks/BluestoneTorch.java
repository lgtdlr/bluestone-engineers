package bluestone.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BluestoneTorch extends BluestoneBlockTorchBase {
	
	public BluestoneTorch(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.WOOD);
		setLightLevel(1.0F);		
	}
}
