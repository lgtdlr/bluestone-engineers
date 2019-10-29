package bluestone.init;

import bluestone.blocks.fluids.FluidBluestoneMagma;
import bluestone.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {
	
	public static final Fluid BLUESTONE_MAGMA = new FluidBluestoneMagma("bluestone_magma", new ResourceLocation(Reference.MOD_ID + ":blocks/bluestone_magma_still"), new ResourceLocation(Reference.MOD_ID + ":blocks/bluestone_magma_flow"), new ResourceLocation(Reference.MOD_ID + ":blocks/bluestone_magma_overlay"));
	
	public static void registerFluids() {
		registerFluid(BLUESTONE_MAGMA);
	}

	private static void registerFluid(Fluid fluid) {
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
		
	}
}
