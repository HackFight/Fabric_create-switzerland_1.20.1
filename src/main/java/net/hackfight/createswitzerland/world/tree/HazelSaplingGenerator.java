package net.hackfight.createswitzerland.world.tree;

import net.hackfight.createswitzerland.world.ModConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import org.jetbrains.annotations.Nullable;

public class HazelSaplingGenerator extends SaplingGenerator {
	@Nullable
	@Override
	protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
		return ModConfiguredFeatures.HAZEL_KEY;
	}
}
