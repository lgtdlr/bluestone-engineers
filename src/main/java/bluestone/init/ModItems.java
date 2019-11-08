package bluestone.init;

import java.util.ArrayList;
import java.util.List;

import bluestone.items.ItemBase;
import bluestone.items.projectiles.BluestoneLaser;
import bluestone.items.usable.ToolAxe;
import bluestone.items.usable.BluestoneBow;
import bluestone.items.usable.BluestoneChargePack;
import bluestone.items.usable.BluestoneGun;
import bluestone.items.usable.ToolHoe;
import bluestone.items.usable.ToolPickaxe;
import bluestone.items.usable.ToolSpade;
import bluestone.items.usable.ToolSword;
import bluestone.items.wearable.ArmorBase;
import bluestone.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Mats
	public static final ToolMaterial TOOL_MATERIAL_BLUESTONE = EnumHelper.addToolMaterial("material_bluestone", 3, 131, 6.0F, 3.0F, 22);
	public static final ArmorMaterial ARMOR_MATERIAL_BLUESTONE = EnumHelper.addArmorMaterial("material_bluestone", Reference.MOD_ID + ":bluestone", 10, 
			                                                     new int[]{2, 5, 6, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	//Wearable
	public static final Item BLUESTONE_HELMET = new ArmorBase("bluestone_helmet", ARMOR_MATERIAL_BLUESTONE, 1, EntityEquipmentSlot.HEAD);
	public static final Item BLUESTONE_CHESTPLATE = new ArmorBase("bluestone_chestplate", ARMOR_MATERIAL_BLUESTONE, 1, EntityEquipmentSlot.CHEST);
	public static final Item BLUESTONE_LEGGINGS = new ArmorBase("bluestone_leggings", ARMOR_MATERIAL_BLUESTONE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BLUESTONE_BOOTS = new ArmorBase("bluestone_boots", ARMOR_MATERIAL_BLUESTONE, 1, EntityEquipmentSlot.FEET);
	
	//Usable
	public static final ItemSword BLUESTONE_SWORD = new ToolSword("bluestone_sword", TOOL_MATERIAL_BLUESTONE);
	public static final ItemPickaxe BLUESTONE_PICKAXE = new ToolPickaxe("bluestone_pickaxe", TOOL_MATERIAL_BLUESTONE);
	public static final ItemSpade BLUESTONE_SHOVEL = new ToolSpade("bluestone_shovel", TOOL_MATERIAL_BLUESTONE);
	public static final ItemAxe BLUESTONE_AXE = new ToolAxe("bluestone_axe", TOOL_MATERIAL_BLUESTONE);
	public static final ItemHoe BLUESTONE_HOE = new ToolHoe("bluestone_hoe", TOOL_MATERIAL_BLUESTONE);
	public static final ItemBow BLUESTONE_GUN = new BluestoneGun("bluestone_laser_gun");
	public static final ItemBow Bluestone_Bow = new BluestoneBow("bluestone_bow");
	
	//Custom Items
	public static final Item BLUESTONE_DUST = new ItemBase("bluestone_dust");
	public static final Item BLUESTONE_INGOT = new ItemBase("bluestone_ingot");
	public static final ItemArrow BLUESTONE_LASER = new BluestoneLaser("bluestone_laser");
	public static final Item BLUESTONE_CHARGE_PACK = new BluestoneChargePack("bluestone_charge_pack");
	
}
