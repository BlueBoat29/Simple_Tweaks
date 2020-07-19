package com.blueboat.simpletweaks.world.gen.features;

import com.legacy.structure_gel.structures.GelConfigStructure;
import com.legacy.structure_gel.structures.GelStructureStart;
import com.legacy.structure_gel.util.ConfigTemplates.StructureConfigBuilder;
import com.mojang.serialization.Codec;

import net.minecraft.util.math.BlockPos;
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
		public void func_230364_a_(ChunkGenerator generator, TemplateManager templateManagerIn, int chunkX, int chunkZ, Biome biomeIn, NoFeatureConfig config)
		{
			BlockPos pos = new BlockPos(chunkX * 16 + this.rand.nextInt(5), 0, chunkZ * 16 + this.rand.nextInt(5));
			RuinedWatchtowerPeice.assemble(generator, templateManagerIn, pos, this.components, this.rand);
			this.recalculateStructureSize();
			this.components.forEach(c -> c.offset(0, -1, 0));
		}


	
		
	}
}
