package com.blueboat.simpletweaks.world.gen.features;

import java.util.List;
import java.util.Random;

import com.blueboat.simpletweaks.SimpleTweaks;
import com.blueboat.simpletweaks.world.gen.StructureRegister;
import com.legacy.structure_gel.structures.GelStructurePiece;
import com.legacy.structure_gel.structures.jigsaw.JigsawPoolBuilder;
import com.legacy.structure_gel.structures.jigsaw.JigsawRegistryHelper;
import com.legacy.structure_gel.structures.processors.RandomBlockSwapProcessor;

import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.jigsaw.JigsawManager;
import net.minecraft.world.gen.feature.jigsaw.JigsawPiece;
import net.minecraft.world.gen.feature.structure.StructurePiece;
import net.minecraft.world.gen.feature.template.TemplateManager;



public class RuinedWatchtowerPeice {
	public static void assemble(ChunkGenerator chunkGen, TemplateManager template, BlockPos pos, List<StructurePiece> pieces, SharedSeedRandom seed)
	{
		JigsawManager.func_236823_a_(StructureRegister.locate("ruined_watchtower/ruined_watchtower_1"), 7, RuinedWatchtowerPeice.Piece::new, chunkGen, template, pos, pieces, seed, true, true);
	}

	public static void init()
	{
	}

	static
	{
		JigsawRegistryHelper registry = new JigsawRegistryHelper(SimpleTweaks.MOD_ID, "ruined_watchtower/");
		JigsawPoolBuilder basicPoolBuilder = registry.builder().processors(new RandomBlockSwapProcessor(Blocks.field_235412_nv_, 0.65F, Blocks.field_235412_nv_.getDefaultState()));
		registry.register("ruined_watchtower", basicPoolBuilder.clone().names("ruined_watchtower_1").build());
		
	}

	public static class Piece extends GelStructurePiece
	{
		public Piece(TemplateManager template, JigsawPiece jigsawPiece, BlockPos pos, int groundLevelDelta, Rotation rotation, MutableBoundingBox boundingBox)
		{
			super(StructureRegister.Structures.RUINED_WATCHTOWER.getSecond(), template, jigsawPiece, pos, groundLevelDelta, rotation, boundingBox);
		}

		public Piece(TemplateManager template, CompoundNBT nbt)
		{
			super(template, nbt, StructureRegister.Structures.RUINED_WATCHTOWER.getSecond());
		}

		@Override
		public void handleDataMarker(String key, IWorld world, BlockPos pos, Random rand, MutableBoundingBox bounds) {
	
			
		}
	}
}
