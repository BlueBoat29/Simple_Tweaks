package com.blueboat.simpletweaks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class NetherThatchBlock extends Block{

	public NetherThatchBlock() {
		super(Block.Properties.create(Material.PLANTS)
				.sound(SoundType.PLANT)
				.hardnessAndResistance(1f, 5f)
				.harvestTool(ToolType.AXE)
				.harvestLevel(0)
				);
	}

	
}
