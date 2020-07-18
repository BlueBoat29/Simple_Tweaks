package com.blueboat.simpletweaks.items;

import com.blueboat.simpletweaks.SimpleTweaks;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;

public class QGoldAxe extends AxeItem{

	public QGoldAxe() {
		super(ItemTier.IRON, 6f, -3.1f,  new Item.Properties().group(SimpleTweaks.TAB));
		
	}

}
