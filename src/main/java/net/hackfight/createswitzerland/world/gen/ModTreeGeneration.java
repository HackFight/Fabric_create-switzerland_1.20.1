package net.hackfight.createswitzerland.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.hackfight.createswitzerland.world.ModPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {

	public static void generateTrees()
	{
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
				GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.HAZEL_PLACED_KEY);
	}
}
