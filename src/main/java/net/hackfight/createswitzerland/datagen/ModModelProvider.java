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

		BlockStateModelGenerator.BlockTexturePool milkChocolatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MILK_CHOCOLATE_BLOCK);
		BlockStateModelGenerator.BlockTexturePool darkChocolatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_CHOCOLATE_BLOCK);
		BlockStateModelGenerator.BlockTexturePool whiteChocolatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_CHOCOLATE_BLOCK);

		milkChocolatePool.stairs(ModBlocks.MILK_CHOCOLATE_STAIRS);
		darkChocolatePool.stairs(ModBlocks.DARK_CHOCOLATE_STAIRS);
		whiteChocolatePool.stairs(ModBlocks.WHITE_CHOCOLATE_STAIRS);

		milkChocolatePool.slab(ModBlocks.MILK_CHOCOLATE_SLAB);
		darkChocolatePool.slab(ModBlocks.DARK_CHOCOLATE_SLAB);
		whiteChocolatePool.slab(ModBlocks.WHITE_CHOCOLATE_SLAB);
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

		itemModelGenerator.register(ModItems.MILK_CHOCOLATE_TABLET, Models.GENERATED);

		itemModelGenerator.register(ModFluids.DARK_CHOCOLATE_BUCKET, Models.GENERATED);
		itemModelGenerator.register(ModFluids.WHITE_CHOCOLATE_BUCKET, Models.GENERATED);

		itemModelGenerator.register(ModItems.DARK_CHOCOLATE_GLAZED_BERRIES, Models.GENERATED);
		itemModelGenerator.register(ModItems.WHITE_CHOCOLATE_GLAZED_BERRIES, Models.GENERATED);
	}
}
