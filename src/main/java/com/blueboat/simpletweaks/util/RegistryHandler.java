package com.blueboat.simpletweaks.util;

import com.blueboat.simpletweaks.SimpleTweaks;
import com.blueboat.simpletweaks.blocks.JukeboxBase;
import com.blueboat.simpletweaks.blocks.NetherThatchBlock;
import com.blueboat.simpletweaks.blocks.NetherThatchSlab;
import com.blueboat.simpletweaks.blocks.NetherThatchStair;
import com.blueboat.simpletweaks.blocks.QuartzGoldBlock;
import com.blueboat.simpletweaks.blocks.SoulCoalOre;
import com.blueboat.simpletweaks.blocks.WitheredGlass;
import com.blueboat.simpletweaks.blocks.WitheredGlassPane;
import com.blueboat.simpletweaks.items.BlockItemBase;
import com.blueboat.simpletweaks.items.CoalChunck;
import com.blueboat.simpletweaks.items.ItemBase;
import com.blueboat.simpletweaks.items.QGoldAxe;
import com.blueboat.simpletweaks.items.QGoldBoots;
import com.blueboat.simpletweaks.items.QGoldChestplate;
import com.blueboat.simpletweaks.items.QGoldHead;
import com.blueboat.simpletweaks.items.QGoldHoe;
import com.blueboat.simpletweaks.items.QGoldLeggings;
import com.blueboat.simpletweaks.items.QGoldPickaxe;
import com.blueboat.simpletweaks.items.QGoldSpade;
import com.blueboat.simpletweaks.items.QGoldSword;
import com.blueboat.simpletweaks.items.GrindingBowlItem;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
	private static final String MODID = SimpleTweaks.MOD_ID;
	public final static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
	public final static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
	
	public static void Init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());		
	}
	
	//Items
	public static final RegistryObject<Item> GRINDING_BOWL = ITEMS.register("grinding_bowl", GrindingBowlItem::new);
	public static final RegistryObject<Item> WITHERED_SHARD = ITEMS.register("withered_shard", ItemBase::new);
	public static final RegistryObject<Item> BLACKISH_DUST = ITEMS.register("blackish_dust", ItemBase::new);
	public static final RegistryObject<Item> BLANK_DISC = ITEMS.register("blank_disc", ItemBase::new);
	public static final RegistryObject<Item> REDDISH_DUST = ITEMS.register("reddish_dust", ItemBase::new);
	public static final RegistryObject<Item> RED_BLANK_DISC = ITEMS.register("red_blank_disc", ItemBase::new);
	public static final RegistryObject<Item> QUARTZ_DUST = ITEMS.register("quartz_dust", ItemBase::new);
	public static final RegistryObject<Item> QUARTZ_GOLD_DUST = ITEMS.register("quartz_gold_dust",ItemBase::new);
	public static final RegistryObject<Item> QUARTZ_GOLD_INGOT = ITEMS.register("quartz_gold_ingot", ItemBase::new);
	public static final RegistryObject<Item> COAL_CHUNK = ITEMS.register("coal_chunck", CoalChunck::new);
	
	//Tools
	public static final RegistryObject<Item> QUARTZ_GOLD_SWORD = ITEMS.register("quartz_gold_sword", QGoldSword::new);
	public static final RegistryObject<Item> QUARTZ_GOLD_PICKAXE = ITEMS.register("quartz_gold_pickaxe", QGoldPickaxe::new);
	public static final RegistryObject<Item> QUARTZ_GOLD_AXE = ITEMS.register("quartz_gold_axe", QGoldAxe::new);
	public static final RegistryObject<Item> QUARTZ_GOLD_SHOVEL = ITEMS.register("quartz_gold_shovel", QGoldSpade::new);
	public static final RegistryObject<Item> QUARTZ_GOLD_HOE = ITEMS.register("quartz_gold_hoe", QGoldHoe::new);
	
	//Armor
	public static final RegistryObject<Item> QUARTZ_GOLD_HELMET = ITEMS.register("quartz_gold_helmet", QGoldHead::new);
	public static final RegistryObject<Item> QUARTZ_GOLD_CHESTPLATE = ITEMS.register("quartz_gold_chestplate", QGoldChestplate::new);
	public static final RegistryObject<Item> QUARTZ_GOLD_LEGGINGS = ITEMS.register("quartz_gold_leggings", QGoldLeggings::new);
	public static final RegistryObject<Item> QUARTZ_GOLD_BOOTS = ITEMS.register("quartz_gold_boots", QGoldBoots::new);
	
	//Blocks
	public static final RegistryObject<Block> WITHERED_GLASS_BLOCK = BLOCKS.register("withered_glass_block", WitheredGlass::new);
	public static final RegistryObject<Block> WITHERED_GLASS_PANE_BLOCK = BLOCKS.register("withered_glass_pane_block", WitheredGlassPane::new);
	public static final RegistryObject<Block> QUARTZ_GOLD_BLOCK = BLOCKS.register("quartz_gold_block", QuartzGoldBlock::new);
	public static final RegistryObject<Block> CRIMSON_JUKEBOX_BLOCK = BLOCKS.register("crimson_jukebox_block", JukeboxBase::new);
	public static final RegistryObject<Block> WARPED_JUKEBOX_BLOCK = BLOCKS.register("warped_jukebox_block", JukeboxBase::new);
	public static final RegistryObject<Block> CRIMSON_THATCH_BLOCK = BLOCKS.register("crimson_thatch_block", NetherThatchBlock::new);
	public static final RegistryObject<Block> CRIMSON_THATCH_SLAB_BLOCK = BLOCKS.register("crimson_thatch_slab_block", NetherThatchSlab::new);
	public static final RegistryObject<Block> CRIMSON_THATCH_STAIR_BLOCK = BLOCKS.register("crimson_thatch_stair_block", NetherThatchStair::new);
	public static final RegistryObject<Block> WARPED_THATCH_BLOCK = BLOCKS.register("warped_thatch_block", NetherThatchBlock::new);
	public static final RegistryObject<Block> WARPED_THATCH_SLAB_BLOCK = BLOCKS.register("warped_thatch_slab_block", NetherThatchSlab::new);
	public static final RegistryObject<Block> WARPED_THATCH_STAIR_BLOCK = BLOCKS.register("warped_thatch_stair_block", NetherThatchStair::new);
	public static final RegistryObject<Block> SOUL_COAL_ORE = BLOCKS.register("soul_coal_ore", SoulCoalOre::new);
	
	//Block Items
	public static final RegistryObject<Item> WITHERED_GLASS_BLOCK_ITEM = ITEMS.register("withered_glass_block_item", () -> new BlockItemBase(WITHERED_GLASS_BLOCK.get()));
	public static final RegistryObject<Item> QUARTZ_GOLD_BLOCK_ITEM = ITEMS.register("quartz_gold_block_item", () -> new BlockItemBase(QUARTZ_GOLD_BLOCK.get()));
	public static final RegistryObject<Item> WITHERD_GLASS_PANE_BLOCK_ITEM = ITEMS.register("withered_glass_pane_block_item", () -> new BlockItemBase(WITHERED_GLASS_PANE_BLOCK.get()));
	public static final RegistryObject<Item> CRIMSON_JUKEBOX_BLOCK_ITEM = ITEMS.register("crimson_jukebox_block_item", () -> new BlockItemBase(CRIMSON_JUKEBOX_BLOCK.get()));
	public static final RegistryObject<Item> WARPED_JUKEBOX_BLOCK_ITEM = ITEMS.register("warped_jukebox_block_item", () -> new BlockItemBase(WARPED_JUKEBOX_BLOCK.get()));
	public static final RegistryObject<Item> CRIMSON_THATCH_BLOCK_ITEM= ITEMS.register("crimson_thatch_block_item", () -> new BlockItemBase(CRIMSON_THATCH_BLOCK.get()));
	public static final RegistryObject<Item> CRIMSON_THATCH_SLAB_BLOCK_ITEM= ITEMS.register("crimson_thatch_slab_block_item", () -> new BlockItemBase(CRIMSON_THATCH_SLAB_BLOCK.get()));
	public static final RegistryObject<Item> CRIMSON_THATCH_STAIR_BLOCK_ITEM= ITEMS.register("crimson_thatch_stair_block_item", () -> new BlockItemBase(CRIMSON_THATCH_STAIR_BLOCK.get()));
	public static final RegistryObject<Item> WARPED_THATCH_BLOCK_ITEM= ITEMS.register("warped_thatch_block_item", () -> new BlockItemBase(WARPED_THATCH_BLOCK.get()));
	public static final RegistryObject<Item> WARPED_THATCH_SLAB_BLOCK_ITEM= ITEMS.register("warped_thatch_slab_block_item", () -> new BlockItemBase(WARPED_THATCH_SLAB_BLOCK.get()));
	public static final RegistryObject<Item> WARPED_THATCH_STAIR_BLOCK_ITEM= ITEMS.register("warped_thatch_stair_block_item", () -> new BlockItemBase(WARPED_THATCH_STAIR_BLOCK.get()));
	public static final RegistryObject<Item> SOUL_COAL_ORE_ITEM = ITEMS.register("soul_coal_ore_item", () -> new BlockItemBase(SOUL_COAL_ORE.get()));
}

