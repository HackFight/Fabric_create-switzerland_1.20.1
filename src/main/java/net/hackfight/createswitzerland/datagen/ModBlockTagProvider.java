package net.hackfight.createswitzerland.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hackfight.createswitzerland.block.ModBlocks;
import net.minecraft.block.Block;
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

		getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
				.add(ModBlocks.HAZEL_LOG)
				.add(ModBlocks.HAZEL_PLANKS);

		getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
				.add(ModBlocks.HAZEL_LEAVES);

		getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
				.add(ModBlocks.CARAMEL_BLOCK)
				.add(ModBlocks.CARAMEL_SLAB)
				.add(ModBlocks.CARAMEL_STAIRS)
				.add(ModBlocks.DARK_CHOCOLATE_BLOCK)
				.add(ModBlocks.DARK_CHOCOLATE_STAIRS)
				.add(ModBlocks.DARK_CHOCOLATE_SLAB)
				.add(ModBlocks.MILK_CHOCOLATE_BLOCK)
				.add(ModBlocks.MILK_CHOCOLATE_STAIRS)
				.add(ModBlocks.MILK_CHOCOLATE_SLAB)
				.add(ModBlocks.WHITE_CHOCOLATE_BLOCK)
				.add(ModBlocks.WHITE_CHOCOLATE_STAIRS)
				.add(ModBlocks.WHITE_CHOCOLATE_SLAB);


	}
}
