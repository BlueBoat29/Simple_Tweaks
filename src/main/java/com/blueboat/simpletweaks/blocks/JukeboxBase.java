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
/*
	 public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
	      super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
	      CompoundNBT compoundnbt = stack.getOrCreateTag();
	      if (compoundnbt.contains("BlockEntityTag")) {
	         CompoundNBT compoundnbt1 = compoundnbt.getCompound("BlockEntityTag");
	         if (compoundnbt1.contains("RecordItem")) {
	            worldIn.setBlockState(pos, state.with(HAS_RECORD, Boolean.valueOf(true)), 2);
	         }
	      }

	   }

	   public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
	      if (state.get(HAS_RECORD)) {
	         this.dropRecord(worldIn, pos);
	         state = state.with(HAS_RECORD, Boolean.valueOf(false));
	         worldIn.setBlockState(pos, state, 2);
	         return ActionResultType.func_233537_a_(worldIn.isRemote);
	      } else {
	         return ActionResultType.PASS;
	      }
	   }

	   public void insertRecord(IWorld worldIn, BlockPos pos, BlockState state, ItemStack recordStack) {
	      TileEntity tileentity = worldIn.getTileEntity(pos);
	      if (tileentity instanceof JukeboxTileEntity) {
	         ((JukeboxTileEntity)tileentity).setRecord(recordStack.copy());
	         worldIn.setBlockState(pos, state.with(HAS_RECORD, Boolean.valueOf(true)), 2);
	      }
	   }

	   private void dropRecord(World worldIn, BlockPos pos) {
	      if (!worldIn.isRemote) {
	         TileEntity tileentity = worldIn.getTileEntity(pos);
	         if (tileentity instanceof JukeboxTileEntity) {
	            JukeboxTileEntity jukeboxtileentity = (JukeboxTileEntity)tileentity;
	            ItemStack itemstack = jukeboxtileentity.getRecord();
	            if (!itemstack.isEmpty()) {
	               worldIn.playEvent(1010, pos, 0);
	               jukeboxtileentity.clear();
	               double d0 = (double)(worldIn.rand.nextFloat() * 0.7F) + (double)0.15F;
	               double d1 = (double)(worldIn.rand.nextFloat() * 0.7F) + (double)0.060000002F + 0.6D;
	               double d2 = (double)(worldIn.rand.nextFloat() * 0.7F) + (double)0.15F;
	               ItemStack itemstack1 = itemstack.copy();
	               ItemEntity itementity = new ItemEntity(worldIn, (double)pos.getX() + d0, (double)pos.getY() + d1, (double)pos.getZ() + d2, itemstack1);
	               itementity.setDefaultPickupDelay();
	               worldIn.addEntity(itementity);
	            }
	         }
	      }
	   }

	   public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
	      if (!state.isIn(newState.getBlock())) {
	         this.dropRecord(worldIn, pos);
	         super.onReplaced(state, worldIn, pos, newState, isMoving);
	      }
	   }

	   public TileEntity createNewTileEntity(IBlockReader worldIn) {
	      return new JukeboxTileEntity();
	   }

	   /**
	    * @deprecated call via {@link IBlockState#hasComparatorInputOverride()} whenever possible. Implementing/overriding
	    * is fine.
	    */
	  /* public boolean hasComparatorInputOverride(BlockState state) {
	      return true;
	   }

	   /**
	    * @deprecated call via {@link IBlockState#getComparatorInputOverride(World,BlockPos)} whenever possible.
	    * Implementing/overriding is fine.
	    */
	 /*  public int getComparatorInputOverride(BlockState blockState, World worldIn, BlockPos pos) {
	      TileEntity tileentity = worldIn.getTileEntity(pos);
	      if (tileentity instanceof JukeboxTileEntity) {
	         Item item = ((JukeboxTileEntity)tileentity).getRecord().getItem();
	         if (item instanceof MusicDiscItem) {
	            return ((MusicDiscItem)item).getComparatorValue();
	         }
	      }

	      return 0;
	   }

	   /**
	    * The type of render function called. MODEL for mixed tesr and static model, MODELBLOCK_ANIMATED for TESR-only,
	    * LIQUID for vanilla liquids, INVISIBLE to skip all rendering
	    * @deprecated call via {@link IBlockState#getRenderType()} whenever possible. Implementing/overriding is fine.
	    */
	 
