package bluestone.items.usable;

import bluestone.Main;
import bluestone.init.ModItems;
import bluestone.items.ItemBase;
import bluestone.util.IHasModel;
import net.minecraft.client.Minecraft;
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
		setCreativeTab(Main.tabBluestone);

		ModItems.ITEMS.add(this);
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
		ItemStack item1 = playerIn.getHeldItem(handIn);

		for(int i=0; i< playerIn.inventory.getSizeInventory();i++) {
			if(playerIn.inventory.getStackInSlot(i).getDisplayName().equals("Redstone")||playerIn.inventory.getStackInSlot(i).getDisplayName().equals("Redstone Ore")) {
				int refill = playerIn.inventory.getStackInSlot(i).getDisplayName().equals("Redstone") ? 2:10;
				
				Minecraft.getMinecraft().player.sendChatMessage(Integer.toString(50-item1.getItemDamage())+"/50"); //TEST
				
				if( item1.getItemDamage()>0 && item1.getItemDamage()<50 ){	
					playerIn.inventory.decrStackSize(i, 1);
					item1.setItemDamage(item1.getItemDamage()-refill);
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
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
