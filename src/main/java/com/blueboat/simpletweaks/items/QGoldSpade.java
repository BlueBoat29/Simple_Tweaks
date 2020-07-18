package com.blueboat.simpletweaks.items;

import com.blueboat.simpletweaks.SimpleTweaks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.ShovelItem;

public class QGoldSpade extends ShovelItem{

	public QGoldSpade() {
		super(ItemTier.IRON, 1.5f, -3, new Item.Properties().group(SimpleTweaks.TAB));

	}

}
