package com.blueboat.simpletweaks.items;

import com.blueboat.simpletweaks.SimpleTweaks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;

public class QGoldPickaxe extends PickaxeItem{

	public QGoldPickaxe() {
		super(ItemTier.IRON, 2, -2.6f, new Item.Properties().group(SimpleTweaks.TAB));
		
	}

}
