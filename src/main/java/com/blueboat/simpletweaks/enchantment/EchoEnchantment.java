package com.blueboat.simpletweaks.enchantment;

import com.blueboat.simpletweaks.SimpleTweaks;
import com.blueboat.simpletweaks.util.RegistryHandler;
import com.google.common.collect.Multimap;

import net.minecraft.client.particle.EnchantmentTableParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class EchoEnchantment extends Enchantment{

	public EchoEnchantment(Rarity rarityIn, EquipmentSlotType... slots) {
		super(rarityIn, EnchantmentType.WEAPON, slots);
		// TODO Auto-generated constructor stub
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
	      return 5;
   }
	
	@Mod.EventBusSubscriber(modid = SimpleTweaks.MOD_ID, bus = Bus.FORGE)
	public static class Echo 
	{
		@SubscribeEvent
		public static void DoEchoDamage(AttackEntityEvent event) 
		{
			int level = EnchantmentHelper.getEnchantmentLevel(RegistryHandler.ECHO.get(), event.getEntityLiving().getHeldItemMainhand());
			int sharpLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.SHARPNESS, event.getEntityLiving().getHeldItemMainhand());
					
			float bonusDamage = 0;
			
			switch(sharpLevel) 
			{
			case 1: bonusDamage = 1; 
				break;
			case 2: bonusDamage = 1.25f;
				break;
			case 3: bonusDamage = 2;
				break;
			case 4: bonusDamage = 2.25f;
				break;
			case 5: bonusDamage = 3;
				break;
			default: break;
			}
			
			if(level > 0 && event.getTarget().isAlive()) 
			{
				LivingEntity target = (LivingEntity) event.getTarget();
				World world = event.getEntityLiving().world;
				/*
				ITextComponent name = event.getEntityLiving().getHeldItemMainhand().getDisplayName();
				event.getEntityLiving().getHeldItemMainhand().clearCustomName();
				ITextComponent trueName = event.getEntityLiving().getHeldItemMainhand().getDisplayName();
				event.getEntityLiving().getHeldItemMainhand().setDisplayName(name);
				*/
				String numbers = event.getEntityLiving().getHeldItemMainhand().getAttributeModifiers(EquipmentSlotType.MAINHAND)
									.values().toString().replaceAll("[^0-9]", "");
				int number = numbers.charAt(0) - '0';
				number++;
				SimpleTweaks.LOGGER.debug(number);
				
				float trueDamage =  (number + bonusDamage) * (level * .1f);
				SimpleTweaks.LOGGER.debug(trueDamage);
				for (int i = 0; i <= level * 5; i++)
				{
					world.addParticle(ParticleTypes.DRAGON_BREATH, target.getPosX(), target.getPosYEye(), target.getPosZ(), Math.random() * .25, -.05, Math.random() * .25);
					world.addParticle(ParticleTypes.DRAGON_BREATH, target.getPosX(), target.getPosYEye(), target.getPosZ(), -Math.random() * .25, -.05, -Math.random() * .25);
					world.addParticle(ParticleTypes.DRAGON_BREATH, target.getPosX(), target.getPosYEye(), target.getPosZ(), Math.random() * .25, -.05, -Math.random() * .25);
					world.addParticle(ParticleTypes.DRAGON_BREATH, target.getPosX(), target.getPosYEye(), target.getPosZ(), -Math.random() * .25, -.05, Math.random() * .25);
				}			
				target.setHealth(target.getHealth() - trueDamage);
				SimpleTweaks.LOGGER.debug(target.getHealth());
			}
		}
		
	}
	
}
