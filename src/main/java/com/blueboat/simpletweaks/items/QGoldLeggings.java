package com.blueboat.simpletweaks.items;

import com.blueboat.simpletweaks.SimpleTweaks;
import com.blueboat.simpletweaks.util.SimpleTweaksArmorMaterial;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class QGoldLeggings extends ArmorItem{

	public QGoldLeggings() {
		super(SimpleTweaksArmorMaterial.QUARTZGOLD, EquipmentSlotType.LEGS, new Item.Properties().group(SimpleTweaks.TAB));

	}

}
