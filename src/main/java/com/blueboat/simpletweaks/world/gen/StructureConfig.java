package com.blueboat.simpletweaks.world.gen;
import org.apache.commons.lang3.tuple.Pair;

import com.legacy.structure_gel.util.ConfigTemplates;

import net.minecraftforge.common.ForgeConfigSpec;


public class StructureConfig {
	public static final Common COMMON;
	public static final ForgeConfigSpec COMMON_SPEC;
	static
	{
		Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
		COMMON_SPEC = specPair.getRight();
		COMMON = specPair.getLeft();
	}

	public static class Common
	{
		public final ConfigTemplates.BiomeStructureConfig ruined_watchtower;
		

		public Common(ForgeConfigSpec.Builder builder)
		{
			this.ruined_watchtower = new ConfigTemplates.BiomeStructureConfig(builder, "ruined_watchtower", 1, 20, 8, "desert");
		}
	}
}
