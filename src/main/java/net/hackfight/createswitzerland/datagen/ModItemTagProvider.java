package net.hackfight.createswitzerland.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hackfight.createswitzerland.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

	@Override
	protected void configure(RegistryWrapper.WrapperLookup arg) {

		getOrCreateTagBuilder(ItemTags.PLANKS)
				.add(ModBlocks.HAZEL_PLANKS.asItem());

		getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
				.add(ModBlocks.HAZEL_LOG.asItem())
				.add(ModBlocks.HAZEL_WOOD.asItem())
				.add(ModBlocks.STRIPPED_HAZEL_LOG.asItem())
				.add(ModBlocks.STRIPPED_HAZEL_WOOD.asItem());
	}
}
