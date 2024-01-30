package net.hackfight.createswitzerland.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.hackfight.createswitzerland.block.ModBlocks;
import net.hackfight.createswitzerland.fluid.ModFluids;
import net.hackfight.createswitzerland.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MILK_CHOCOLATE_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_CHOCOLATE_BLOCK);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_CHOCOLATE_BLOCK);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ModItems.SWISS_FLAG_ICON, Models.GENERATED);
		itemModelGenerator.register(ModItems.CRUSHED_COCOA_BEANS, Models.GENERATED);
		itemModelGenerator.register(ModItems.COCOA_POWDER, Models.GENERATED);
		itemModelGenerator.register(ModItems.COCOA_BUTTER, Models.GENERATED);
		itemModelGenerator.register(ModItems.CRUSHED_FLOWER,Models.GENERATED);
		itemModelGenerator.register(ModItems.BAR_OF_DARK_CHOCOLATE, Models.GENERATED);
		itemModelGenerator.register(ModItems.BAR_OF_WHITE_CHOCOLATE, Models.GENERATED);
		itemModelGenerator.register(ModFluids.DARK_CHOCOLATE_BUCKET, Models.GENERATED);
		itemModelGenerator.register(ModFluids.WHITE_CHOCOLATE_BUCKET, Models.GENERATED);
		itemModelGenerator.register(ModItems.DARK_CHOCOLATE_GLAZED_BERRIES, Models.GENERATED);
		itemModelGenerator.register(ModItems.WHITE_CHOCOLATE_GLAZED_BERRIES, Models.GENERATED);
	}
}
