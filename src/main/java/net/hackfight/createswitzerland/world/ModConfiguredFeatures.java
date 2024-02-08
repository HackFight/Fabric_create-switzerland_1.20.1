package net.hackfight.createswitzerland.world;

import net.hackfight.createswitzerland.CreateSwitzerland;
import net.hackfight.createswitzerland.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {

	public static final RegistryKey<ConfiguredFeature<?, ?>> HAZEL_KEY = registerKey("hazel");

	public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context)
	{
		register(context, HAZEL_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
				BlockStateProvider.of(ModBlocks.HAZEL_LOG),
				new StraightTrunkPlacer(4,3,2),

				BlockStateProvider.of(ModBlocks.HAZEL_LEAVES),
				new BlobFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(1), 4),

				new TwoLayersFeatureSize(1, 0, 2)).build()
		);
	}

	public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(CreateSwitzerland.MOD_ID, name));
	}

	private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
																				   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
		context.register(key, new ConfiguredFeature<>(feature, configuration));
	}
}
