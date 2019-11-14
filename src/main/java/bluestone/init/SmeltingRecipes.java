package bluestone.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
public static void init() {
	GameRegistry.addSmelting(ModBlocks.BLUESTONE_ORE, new ItemStack(ModItems.BLUESTONE_DUST,3 ), 1.5F);
	GameRegistry.addSmelting(ModBlocks.RICH_BLUESTONE_ORE, new ItemStack(ModItems.BLUESTONE_DUST,8 ), 1.5F);
}
}
