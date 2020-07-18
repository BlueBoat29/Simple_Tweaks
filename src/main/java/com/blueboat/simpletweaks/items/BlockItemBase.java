package com.blueboat.simpletweaks.items;

import com.blueboat.simpletweaks.SimpleTweaks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem{

	public BlockItemBase(Block blockIn) {
		super(blockIn, new Item.Properties().group(SimpleTweaks.TAB));
	}

}
