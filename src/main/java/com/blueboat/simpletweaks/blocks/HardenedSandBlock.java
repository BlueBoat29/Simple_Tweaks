package com.blueboat.simpletweaks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HardenedSandBlock extends Block{

	public static Properties properties = Block.Properties.create(Material.ROCK)
			.sound(SoundType.SAND)
			.hardnessAndResistance(1f, 2f).harvestTool(ToolType.PICKAXE).harvestLevel(0);
			
	
	public HardenedSandBlock() {
		super(properties);

	}

}
