package bluestone.util.handlers;

import bluestone.entities.EntityLaser;
import bluestone.entities.RenderLaser;
import bluestone.init.ModBlocks;
import bluestone.util.Reference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerCustomMeshesAndStates() {
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(ModBlocks.BLUESTONE_MAGMA), new ItemMeshDefinition() {
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return new ModelResourceLocation(Reference.MOD_ID + ":bluestone_magma", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.BLUESTONE_MAGMA, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				// TODO Auto-generated method stub
				return new ModelResourceLocation(Reference.MOD_ID + ":bluestone_magma", "fluid");
			}
		});
	}
	
	
	
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityLaser.class, new IRenderFactory<EntityLaser>() {

			@Override
			public Render<? super EntityLaser> createRenderFor(RenderManager manager) {
				// TODO Auto-generated method stub
				return new RenderLaser(manager);
			}
			
		});
	}
}
