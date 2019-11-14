package bluestone.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BluestoneOre extends BluestoneBlockBase {
//	Item itemDrop;
//	int minDrop=1;
//	int maxDrop=1;
//	
//	public BluestoneOre(String name, Material material) {
//		super(name, material);
//	}
//
//	public BluestoneOre(String name, Material material, Item toDrop) {
//		this(name, material, toDrop, 1, 1);
//	}
//
//	public BluestoneOre(String name, Material material, Item toDrop, int dropAmount) {
//		this(name, material, toDrop, dropAmount, dropAmount);	
//	}

	public BluestoneOre(String name, Material material) {
		super(name, material);
//		this.itemDrop = itemDrop;
//		this.minDrop = minDrop;
//		this.maxDrop= maxDrop;
		setSoundType(SoundType.STONE);
		setHardness(5.5F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(1.0F);
		

//	}
//	@Override
//	public Item getItemDropped(IBlockState state, Random random, int i)  {
//		return itemDrop == null? Item.getItemFromBlock(this):itemDrop;
//	}
//
//	@Override
//	public int quantityDropped(Random random) {
//		return this.minDrop + random.nextInt(this.maxDrop-this.minDrop+1);
//	}
//	@Override
//	public int quantityDroppedWithBonus(int fortune, Random random)
//	{
//		if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(this.getDefaultState(), random, fortune))
//		{
//			int i = random.nextInt(fortune + 2) - 1;
//			if (i < 0)
//			{
//				i = 0;
//			}
//			return this.quantityDropped(random) * (i + 1);
//		}
//		else
//		{
//			return this.quantityDropped(random);
//		}
	}
}

