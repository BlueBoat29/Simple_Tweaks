package com.blueboat.simpletweaks.items;

import com.blueboat.simpletweaks.SimpleTweaks;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;

public class QGoldHoe extends HoeItem{

	public QGoldHoe() {
		super(ItemTier.IRON, -2, -1, new Item.Properties().group(SimpleTweaks.TAB));

	}

}
