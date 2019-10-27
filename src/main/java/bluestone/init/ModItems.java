package bluestone.init;

import java.util.ArrayList;
import java.util.List;

import bluestone.items.ItemBase;
import bluestone.items.usable.ToolAxe;
import bluestone.items.usable.ToolHoe;
import bluestone.items.usable.ToolPickaxe;
import bluestone.items.usable.ToolSpade;
import bluestone.items.usable.ToolSword;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Mats
	public static final ToolMaterial TOOL_MATERIAL_BLUESTONE = EnumHelper.addToolMaterial("material_bluestone", 3, 131, 6.0F, 3.0F, 22);
	public static final ArmorMaterial ARMOR_MATERIAL_BLUESTONE = EnumHelper.addArmorMaterial("material_bluestone", ":bluestone_dust", 10, 
			                                                     new int[]{2, 5, 6, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	//Wearable
	
	//Usable
	public static final ItemSword BLUESTONE_SWORD = new ToolSword("bluestone_sword", TOOL_MATERIAL_BLUESTONE);
	public static final ItemPickaxe BLUESTONE_PICKAXE = new ToolPickaxe("bluestone_pickaxe", TOOL_MATERIAL_BLUESTONE);
	public static final ItemSpade BLUESTONE_SHOVEL = new ToolSpade("bluestone_shovel", TOOL_MATERIAL_BLUESTONE);
	public static final ItemAxe BLUESTONE_AXE = new ToolAxe("bluestone_axe", TOOL_MATERIAL_BLUESTONE);
	public static final ItemHoe BLUESTONE_HOE = new ToolHoe("bluestone_hoe", TOOL_MATERIAL_BLUESTONE);
	
	//Custom Items
	public static final Item BLUESTONE_DUST = new ItemBase("bluestone_dust");
	
}
