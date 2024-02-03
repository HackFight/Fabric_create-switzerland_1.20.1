package net.hackfight.createswitzerland.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.hackfight.createswitzerland.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MILK_CHOCOLATE_BLOCK);
		addDrop(ModBlocks.DARK_CHOCOLATE_BLOCK);
		addDrop(ModBlocks.WHITE_CHOCOLATE_BLOCK);

		addDrop(ModBlocks.WHITE_CHOCOLATE_STAIRS);
		addDrop(ModBlocks.WHITE_CHOCOLATE_STAIRS);
		addDrop(ModBlocks.WHITE_CHOCOLATE_STAIRS);

		addDrop(ModBlocks.WHITE_CHOCOLATE_SLAB, slabDrops(ModBlocks.MILK_CHOCOLATE_SLAB));
		addDrop(ModBlocks.WHITE_CHOCOLATE_SLAB, slabDrops(ModBlocks.DARK_CHOCOLATE_SLAB));
		addDrop(ModBlocks.WHITE_CHOCOLATE_SLAB, slabDrops(ModBlocks.WHITE_CHOCOLATE_SLAB));
    }
}
