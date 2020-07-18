package com.blueboat.simpletweaks.items;

import com.blueboat.simpletweaks.SimpleTweaks;
import com.blueboat.simpletweaks.util.SimpleTweaksArmorMaterial;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class QGoldChestplate extends ArmorItem{

	public QGoldChestplate() {
		super(SimpleTweaksArmorMaterial.QUARTZGOLD, EquipmentSlotType.CHEST, new Item.Properties().group(SimpleTweaks.TAB));

	}

}
