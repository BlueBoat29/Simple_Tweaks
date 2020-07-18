package com.blueboat.simpletweaks.util;

import java.util.Set;

import com.blueboat.simpletweaks.SimpleTweaks;
import com.blueboat.simpletweaks.world.gen.StructureConfig;
import com.blueboat.simpletweaks.world.gen.features.RuinedWatchtowerPeice;
import com.blueboat.simpletweaks.world.gen.features.RuinedWatchtowerStructure;
import com.legacy.structure_gel.util.RegistryHelper;
import com.mojang.datafixers.util.Pair;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.fml.config.ModConfig;


public class StructureRegister {
	
	public StructureRegister() {
		
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, StructureConfig.COMMON_SPEC);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonInit);

	}
	
	public void commonInit(final FMLCommonSetupEvent event)
	{
		for (Biome biome : ForgeRegistries.BIOMES.getValues())
		{			
			Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(biome);
			
			if (biome == Biomes.field_235254_j_) {
			RegistryHelper.addStructure(Biomes.field_235254_j_, Structures.RUINED_WATCHTOWER.getFirst());
			}
		}
	}

	public static ResourceLocation locate(String key)
	{
		return new ResourceLocation(SimpleTweaks.MOD_ID, key);
	}

	@Mod.EventBusSubscriber(modid = SimpleTweaks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Structures
	{
		public static Pair<Structure<NoFeatureConfig>, IStructurePieceType> RUINED_WATCHTOWER;
		
		@SubscribeEvent
		public static void onRegistry(final RegistryEvent.Register<Structure<?>> event)
		{
			IForgeRegistry<Structure<?>> registry = event.getRegistry();
			RUINED_WATCHTOWER = RegistryHelper.registerStructureAndPiece(registry, locate("ruined_watchtower"), new RuinedWatchtowerStructure(NoFeatureConfig.field_236558_a_, StructureConfig.COMMON.ruined_watchtower), RuinedWatchtowerPeice.Piece::new);			
		}
	}

}
