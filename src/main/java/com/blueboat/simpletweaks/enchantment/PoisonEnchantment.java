package com.blueboat.simpletweaks.enchantment;

import com.blueboat.simpletweaks.SimpleTweaks;
import com.blueboat.simpletweaks.util.RegistryHandler;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class PoisonEnchantment extends Enchantment{

	public PoisonEnchantment(Enchantment.Rarity rarityIn, EquipmentSlotType... slots) {
		super(rarityIn, EnchantmentType.WEAPON, slots);

	}
	
	@Override
	public int getMinEnchantability(int enchantmentLevel) {
	      return 10 + 20 * (enchantmentLevel - 1);
   }
	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
	      return super.getMinEnchantability(enchantmentLevel) + 50;
   }
	
	@Override
	public int getMaxLevel() {
	      return 3;
   }
	
	@Override
	public int getMinLevel() {
	      return 1;
	 }
	
	@Override
	public boolean isTreasureEnchantment() {
	      return true;
	}
	
	@Override
	 protected boolean canApplyTogether(Enchantment ench) {
	      return ench.equals(Enchantments.FIRE_ASPECT) ? false : true;
	}
	
	@Mod.EventBusSubscriber(modid = SimpleTweaks.MOD_ID, bus = Bus.FORGE)
	public static class InflictPoison
	{
		@SubscribeEvent
		public static void DoPoison(AttackEntityEvent event) 
		{
			int level = EnchantmentHelper.getMaxEnchantmentLevel(RegistryHandler.POISON_BARB.get(), event.getEntityLiving());
			
			if(level > 0) {
				if(event.getTarget().isAlive()) 
				{
					LivingEntity target = (LivingEntity) event.getTarget();
					target.addPotionEffect(new EffectInstance(Effects.POISON, 140));
				}
			}
			
		}
		
		
	}

}

