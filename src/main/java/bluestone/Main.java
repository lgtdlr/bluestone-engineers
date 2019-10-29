package bluestone;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.Mod.EventHandler;
import bluestone.init.ModEntities;
import bluestone.init.ModFluids;
import bluestone.init.ModItems;
import bluestone.init.SmeltingRecipes;
import bluestone.proxy.CommonProxy;
import bluestone.util.Reference;
import bluestone.util.handlers.RenderHandler;
import bluestone.world.Generator;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		ModFluids.registerFluids();
		RenderHandler.registerCustomMeshesAndStates();
		GameRegistry.registerWorldGenerator(new Generator(), 3);
		ModEntities.registerEntities();
		RenderHandler.registerEntityRenders();
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		SmeltingRecipes.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabBluestone = new CreativeTabs("tab_bluestone") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.BLUESTONE_DUST);
		}
	};
	
	static {
		FluidRegistry.enableUniversalBucket();
	}
}
