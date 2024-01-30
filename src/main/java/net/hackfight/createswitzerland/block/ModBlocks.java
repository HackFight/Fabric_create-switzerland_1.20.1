package net.hackfight.createswitzerland.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hackfight.createswitzerland.CreateSwitzerland;
import net.hackfight.createswitzerland.fluid.ModFluids;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block MILK_CHOCOLATE_BLOCK = registerBlock("milk_chocolate_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0f, 3.0f)));
	public static final Block DARK_CHOCOLATE_BLOCK = registerBlock("dark_chocolate_block",
			new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0f, 3.0f)));
	public static final Block WHITE_CHOCOLATE_BLOCK = registerBlock("white_chocolate_block",
			new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0f, 3.0f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CreateSwitzerland.MOD_ID, name), block);
    }

	private static Block registerBlockWithoutBlockItem(String name, Block block) {
		return Registry.register(Registries.BLOCK, new Identifier(CreateSwitzerland.MOD_ID, name), block);
	}

    private static Item registerBlockItem(String name, Block block) {

        return Registry.register(Registries.ITEM, new Identifier(CreateSwitzerland.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {

        CreateSwitzerland.LOGGER.info("Registering blocks for " + CreateSwitzerland.MOD_ID);


    }
}
