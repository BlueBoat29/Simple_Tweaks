package com.blueboat.simpletweaks.items;

import com.blueboat.simpletweaks.SimpleTweaks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;

public class QGoldSword extends SwordItem{

	public QGoldSword() {
		super(ItemTier.IRON, 3, -2.4f, new Item.Properties().group(SimpleTweaks.TAB));

	}

}
