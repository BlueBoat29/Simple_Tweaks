package com.blueboat.simpletweaks.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class WitheredGlass extends Block{

	public WitheredGlass() {
		super(Block.Properties.create(Material.GLASS)
				.hardnessAndResistance(.4f, 2f)
				.sound(SoundType.GLASS).notSolid()
				);	
		
		
		   	
	   }
	@SuppressWarnings("deprecation")
	@OnlyIn(Dist.CLIENT)
	   public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
	      return adjacentBlockState.isIn(this) ? true : super.isSideInvisible(state, adjacentBlockState, side);
	   }
	 
	
}
