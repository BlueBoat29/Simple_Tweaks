package com.blueboat.simpletweaks.world.gen.features;

import java.util.List;
import java.util.Random;

import com.blueboat.simpletweaks.SimpleTweaks;
import com.blueboat.simpletweaks.util.StructureRegister;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.legacy.structure_gel.structures.GelStructurePiece;
import com.legacy.structure_gel.structures.jigsaw.JigsawPoolBuilder;
import com.legacy.structure_gel.structures.jigsaw.JigsawRegistryHelper;
import com.legacy.structure_gel.structures.processors.RandomBlockSwapProcessor;

import net.minecraft.block.Blocks;
import net.minecraft.block.ChestBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTables;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.properties.ChestType;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.MobSpawnerTileEntity;
import net.minecraft.util.Direction;
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
import net.minecraft.world.gen.feature.template.AlwaysTrueRuleTest;
import net.minecraft.world.gen.feature.template.RandomBlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleEntry;
import net.minecraft.world.gen.feature.template.RuleStructureProcessor;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraftforge.registries.ForgeRegistries;



public class RuinedWatchtowerPeice {
	public static void assemble(ChunkGenerator chunkGen, TemplateManager template, BlockPos pos, List<StructurePiece> pieces, SharedSeedRandom seed)
	{
		JigsawManager.func_236823_a_(StructureRegister.locate("tower/root"), 7, RuinedWatchtowerPeice.Piece::new, chunkGen, template, pos, pieces, seed, true, true);
	}

	public static void init()
	{
	}

	static
	{
		/**
		 * This is a processor from Structure Gel API for making a single block swap. It
		 * exists as a shorthand way of writing the processor below it for a simple
		 * swap.
		 */
		RandomBlockSwapProcessor cobbleToMossy = new RandomBlockSwapProcessor(Blocks.COBBLESTONE, 0.2F, Blocks.MOSSY_COBBLESTONE.getDefaultState());
		RandomBlockSwapProcessor goldDecay = new RandomBlockSwapProcessor(Blocks.GOLD_BLOCK, 0.3F, Blocks.AIR.getDefaultState());

		//@formatter:off
		RuleStructureProcessor brickDecay = new RuleStructureProcessor(ImmutableList.of(
				new RuleEntry(new RandomBlockMatchRuleTest(Blocks.STONE_BRICKS, 0.15F), AlwaysTrueRuleTest.INSTANCE, Blocks.MOSSY_STONE_BRICKS.getDefaultState()),
				new RuleEntry(new RandomBlockMatchRuleTest(Blocks.STONE_BRICKS, 0.3F), AlwaysTrueRuleTest.INSTANCE, Blocks.CRACKED_STONE_BRICKS.getDefaultState())));
		//@formatter:on

		/**
		 * This registry is used in combination with JigsawPoolBuilders. The prefix
		 * ("tower/") is optional, but allows you to cut down some typing since your
		 * resource locations may need to start with it.
		 * 
		 * If you need to change the prefix, you can use .setPrefix on the registry to
		 * create a clone of it.
		 * 
		 * In the future, any string input using this registry will become a
		 * ResourceLocation with this format. modid:prefixtext ->
		 * dungeons_plus:tower/text
		 */
		
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

		/**
		 * When placing a tile entity in place of the structure block, you first need to
		 * set the space to air. If you don't, the chest you place won't be a chest tile
		 * entity. setAir is a simple shortcut to do this.
		 * 
		 * The value I enter into the structure block is formatted with arguments
		 * separated by "-". So in these cases, I use formats like "chest-west-left" and
		 * "spawner-minecraft:vex". Using String.split, I can issolate these values.
		 */
	}
}
