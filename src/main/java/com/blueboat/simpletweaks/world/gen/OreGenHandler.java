package com.blueboat.simpletweaks.world.gen;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

import com.blueboat.simpletweaks.SimpleTweaks;
import com.blueboat.simpletweaks.util.RegistryHandler;;

@EventBusSubscriber(modid = SimpleTweaks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGenHandler {

	public static OreFeatureConfig.FillerBlockType SOUL_SOIL = OreFeatureConfig.FillerBlockType.create("SOUL_SOIL", "soul_soil", new BlockMatcher(Blocks.field_235336_cN_));
	public static OreFeatureConfig.FillerBlockType SANDSTONE = OreFeatureConfig.FillerBlockType.create("SANDSTONE", "sandstone", new BlockMatcher(Blocks.SANDSTONE));
	
	
	@SubscribeEvent
	public static void GenerateOres(FMLLoadCompleteEvent event) {
		for(Biome biome: ForgeRegistries.BIOMES) 
		{
			if(biome.getCategory() == Biome.Category.THEEND) {}
			else if(biome.getCategory() == Biome.Category.NETHER) 
			{ if(biome == Biomes.field_235252_ay_) {
				GenOre(biome, 30, 3, 5, 200, SOUL_SOIL, RegistryHandler.SOUL_COAL_ORE.get().getDefaultState(), 15);
				}
			}
			else 
			{
				GenOre(biome, 10, 20, 3, 100, SANDSTONE, RegistryHandler.HARD_SAND_BLOCK.get().getDefaultState(), 64);				
			}
		}
	}

	private static void GenOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockState, int size) 
	{
		CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
		OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockState, size);
		ConfiguredPlacement<CountRangeConfig> config = Placement.COUNT_RANGE.configure(range);
		biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
		
	}

}
