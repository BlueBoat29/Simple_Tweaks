package com.blueboat.simpletweaks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class SoulCoalOre extends OreBlock{

	public SoulCoalOre() {
		super(Block.Properties
				.create(Material.EARTH)
				.sound(SoundType.GROUND)
				.hardnessAndResistance(1f, 3f)
				.harvestLevel(0)		
				.harvestTool(ToolType.SHOVEL));
						
	}
	
	@Override
	public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silkTouch){
		return 2;
	}

}
