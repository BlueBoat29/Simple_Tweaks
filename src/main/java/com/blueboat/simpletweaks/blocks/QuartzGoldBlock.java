package com.blueboat.simpletweaks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class QuartzGoldBlock extends Block{

	public QuartzGoldBlock() {
		super(Block.Properties.create(Material.IRON)
				.sound(SoundType.METAL)
				.hardnessAndResistance(5f, 30f)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(2)
				);
	}

}
