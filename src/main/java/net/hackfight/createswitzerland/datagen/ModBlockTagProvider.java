package net.hackfight.createswitzerland.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hackfight.createswitzerland.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

	@Override
	protected void configure(RegistryWrapper.WrapperLookup arg) {

		getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
				.add(ModBlocks.HAZEL_LOG)
				.add(ModBlocks.HAZEL_WOOD)
				.add(ModBlocks.STRIPPED_HAZEL_LOG)
				.add(ModBlocks.STRIPPED_HAZEL_WOOD);
	}
}
