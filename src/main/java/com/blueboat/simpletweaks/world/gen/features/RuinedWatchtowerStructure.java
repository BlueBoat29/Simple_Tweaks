package com.blueboat.simpletweaks.world.gen.features;

import com.legacy.structure_gel.structures.GelConfigStructure;
import com.legacy.structure_gel.structures.GelStructureStart;
import com.legacy.structure_gel.util.ConfigTemplates.StructureConfigBuilder;
import com.mojang.serialization.Codec;

import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class RuinedWatchtowerStructure extends GelConfigStructure<NoFeatureConfig>{

	public RuinedWatchtowerStructure(Codec<NoFeatureConfig> codec, StructureConfigBuilder config) {
		super(codec, config);

	}

	@Override
	public int getSeed() {

		return 56843;
	}

	@Override
	public IStartFactory<NoFeatureConfig> getStartFactory() {

		return RuinedWatchtowerStructure.Start::new;
	}

	
	public static class Start extends GelStructureStart<NoFeatureConfig>
	{

		public Start(Structure<NoFeatureConfig> structureIn, int chunkX, int chunkZ, MutableBoundingBox boundsIn, int referenceIn, long seed)
		{
			super(structureIn, chunkX, chunkZ, boundsIn, referenceIn, seed);
		}

		@Override
		public void func_230364_a_(ChunkGenerator p_230364_1_, TemplateManager p_230364_2_, int p_230364_3_,
				int p_230364_4_, Biome p_230364_5_, NoFeatureConfig p_230364_6_) {
			
		}		
	}
}
