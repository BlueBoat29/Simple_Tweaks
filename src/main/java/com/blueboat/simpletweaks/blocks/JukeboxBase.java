package com.blueboat.simpletweaks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class JukeboxBase extends Block{
	
	
	public JukeboxBase() {
		super(Block.Properties.create(Material.WOOD)
				.sound(SoundType.WOOD)
				.hardnessAndResistance(2f, 30f)
				.harvestTool(ToolType.AXE)
				.harvestLevel(0)
				);
		
	}
}

