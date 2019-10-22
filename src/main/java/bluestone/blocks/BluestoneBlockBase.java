package bluestone.blocks;

import bluestone.Main;
import bluestone.init.BluestoneBlocks;
import bluestone.init.ModItems;
import bluestone.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.util.Random;

public class BluestoneBlockBase extends Block implements IHasModel {
	public BluestoneBlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.REDSTONE);

		BluestoneBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "normal");

	}
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random random) {
		float f1 = (float) x+ 0.5F;
		float f2 = (float) y+ 1.1F;
		float f3 = (float) z+ 0.5F;
		float f4 = random.nextFloat() * 0.6F - 0.3F;
		float f5 = random.nextFloat() * -0.6F - - 0.3F;
		
		world.spawnParticle(EnumParticleTypes.FLAME, (double)(f1+f4), (double)f2 , (double)(f3+f5), 1.0D, 1.0D, 1.0D,1);
		
	}
}
