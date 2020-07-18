package com.blueboat.simpletweaks.items;

import com.blueboat.simpletweaks.SimpleTweaks;
import com.blueboat.simpletweaks.util.RegistryHandler;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GrindingBowlItem extends Item {

	public GrindingBowlItem() {
		super(new Item.Properties().group(SimpleTweaks.TAB).maxStackSize(1));
	}
	
	@Override
	public boolean hasContainerItem()
	{
		return true;		
	}
	
	@Override
	public final ItemStack getContainerItem(ItemStack item) 
	{
		return RegistryHandler.GRINDING_BOWL.get().getDefaultInstance();
		
	}	
}