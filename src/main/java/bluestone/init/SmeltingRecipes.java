package bluestone.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
public static void init() {
	GameRegistry.addSmelting(ModBlocks.BLUESTONE_ORE, new ItemStack(ModItems.BLUESTONE_DUST,3 ), 1.5F);
}
}
