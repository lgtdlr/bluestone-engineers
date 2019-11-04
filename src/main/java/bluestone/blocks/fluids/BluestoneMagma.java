package bluestone.blocks.fluids;

import java.util.Random;

import bluestone.init.ModBlocks;
import bluestone.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BluestoneMagma extends BlockFluidClassic {

	public BluestoneMagma(String name, Fluid fluid, Material material) {
		super(fluid, material);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.translucent = true;
		this.canCreateSources = true;
		this.lightValue = 5;
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);
		Random rand = new Random();
		int newXPos = pos.getX() + rand.nextInt(10)+3;
		int newYPos = pos.getY() + rand.nextInt(3);
		int newZPos = pos.getZ() + rand.nextInt(10)+3;
		entityIn.setPositionAndUpdate(newXPos, newYPos, newZPos);
		EntityEnderman magmaEnder = new EntityEnderman(worldIn);
		magmaEnder.setPositionAndUpdate(newXPos, newYPos, newZPos);
		worldIn.spawnEntity(magmaEnder);
		
		
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

}
