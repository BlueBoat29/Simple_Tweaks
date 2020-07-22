package com.blueboat.simpletweaks.items;

import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemStack;

public class EnchantBook extends Item{

	public EnchantBook(Properties builder) {
		super(builder);
		// TODO Auto-generated constructor stub
	}

	 public boolean hasEffect(ItemStack stack) {
	      return true;
	   }

	   /**
	    * Checks isDamagable and if it cannot be stacked
	    */
	   public boolean isEnchantable(ItemStack stack) {
	      return false;
	   }
}
