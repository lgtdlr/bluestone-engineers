package bluestone.blocks.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidBluestoneMagma extends Fluid {

	public FluidBluestoneMagma(String name, ResourceLocation still, ResourceLocation flowing, ResourceLocation overlay) {
		super(name, still, flowing, overlay);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(name);
		this.setViscosity(6000);
		this.setLuminosity(5);
	}

}
