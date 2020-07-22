package com.blueboat.simpletweaks.potions;

import com.blueboat.simpletweaks.util.RegistryHandler;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.DamageSource;

public class BetterPoison extends Effect{

	public BetterPoison() {
		super(EffectType.HARMFUL, 125461);

	}

	
	@Override
	public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) 
	{
		if (this == RegistryHandler.BETTER_POISON.get()) {
			entityLivingBaseIn.attackEntityFrom(DamageSource.MAGIC, 1.0F);
	      }
				
	}
	
	@Override
	public boolean isReady(int duration, int amplifier) {
	      if (this == RegistryHandler.BETTER_POISON.get()) {
	         int k = 20 >> amplifier;
	         if (k > 0) {
	            return duration % k == 0;
	         } else {
	            return true;
	         }
	      }
	      return true;
	}
}
