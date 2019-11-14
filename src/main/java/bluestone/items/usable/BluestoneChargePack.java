package bluestone.items.usable;

import java.util.List;

import bluestone.items.ItemBase;
import bluestone.util.IHasModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class BluestoneChargePack extends ItemBase implements IHasModel {
	public BluestoneChargePack (String name) {
		super(name);
		setMaxStackSize(1);
		setMaxDamage(50);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
		ItemStack item1 = playerIn.getHeldItem(handIn);
		int refill = 0;
		
		for(int i=0; i< playerIn.inventory.getSizeInventory();i++) {
			
			if(playerIn.inventory.getStackInSlot(i).getDisplayName().equals("Redstone")||playerIn.inventory.getStackInSlot(i).getDisplayName().equals("Block of Redstone")) {
				refill = playerIn.inventory.getStackInSlot(i).getDisplayName().equals("Redstone") ? 2:10;
				
				
				
				if( item1.getItemDamage()>0 && item1.getItemDamage()<50 ){	
					playerIn.inventory.decrStackSize(i, 1);
					item1.setItemDamage(item1.getItemDamage()-refill);
					//Minecraft.getMinecraft().player.sendChatMessage("Current Charge: " + Integer.toString(50-item1.getItemDamage()) +"/50"); //TEST
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
				}
				else if(item1.getItemDamage()==0){
					this.getDurabilityForDisplay(item1);
					return new ActionResult<ItemStack>(EnumActionResult.FAIL, playerIn.getHeldItem(handIn));
				}
				else
					item1.setItemDamage(49);
			}
			
		}
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
		

	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add("Charge: " + Integer.toString(50-stack.getItemDamage()) +"/50");
	}
	
	
}
