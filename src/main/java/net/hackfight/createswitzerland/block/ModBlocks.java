package net.hackfight.createswitzerland.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.hackfight.createswitzerland.CreateSwitzerland;
import net.hackfight.createswitzerland.fluid.ModFluids;
import net.hackfight.createswitzerland.world.tree.HazelSaplingGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
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
	public static final Block CARAMEL_BLOCK = registerBlock("caramel_block",
			new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0f, 3.0f)));

	public static final Block MILK_CHOCOLATE_STAIRS = registerBlock("milk_chocolate_stairs",
			new StairsBlock(ModBlocks.MILK_CHOCOLATE_BLOCK.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0f, 3.0f)));
	public static final Block DARK_CHOCOLATE_STAIRS = registerBlock("dark_chocolate_stairs",
			new StairsBlock(ModBlocks.DARK_CHOCOLATE_BLOCK.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0f, 3.0f)));
	public static final Block WHITE_CHOCOLATE_STAIRS = registerBlock("white_chocolate_stairs",
			new StairsBlock(ModBlocks.WHITE_CHOCOLATE_BLOCK.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0f, 3.0f)));
	public static final Block CARAMEL_STAIRS = registerBlock("caramel_stairs",
			new StairsBlock(ModBlocks.CARAMEL_BLOCK.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0f, 3.0f)));

	public static final Block MILK_CHOCOLATE_SLAB = registerBlock("milk_chocolate_slab",
			new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0f, 3.0f)));
	public static final Block DARK_CHOCOLATE_SLAB = registerBlock("dark_chocolate_slab",
			new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0f, 3.0f)));
	public static final Block WHITE_CHOCOLATE_SLAB = registerBlock("white_chocolate_slab",
			new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0f, 3.0f)));
	public static final Block CARAMEL_SLAB = registerBlock("caramel_slab",
			new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.BROWN).strength(2.0f, 3.0f)));

	public static final Block HAZEL_LOG = registerBlock("hazel_log",
			new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
	public static final Block HAZEL_WOOD = registerBlock("hazel_wood",
			new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
	public static final Block STRIPPED_HAZEL_LOG = registerBlock("stripped_hazel_log",
			new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
	public static final Block STRIPPED_HAZEL_WOOD = registerBlock("stripped_hazel_wood",
			new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

	public static final Block HAZEL_PLANKS = registerBlock("hazel_planks",
			new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
	public static final Block HAZEL_LEAVES = registerBlock("hazel_leaves",
			new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));

	public static final Block HAZEL_SAPLING = registerBlock("hazel_sapling",
			new SaplingBlock(new HazelSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

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

	public static void registerStrippableBlocks() {

		StrippableBlockRegistry.register(ModBlocks.HAZEL_LOG, ModBlocks.STRIPPED_HAZEL_LOG);
		StrippableBlockRegistry.register(ModBlocks.HAZEL_WOOD, ModBlocks.STRIPPED_HAZEL_WOOD);
	}

	public static void registerFlammableBlocks()
	{
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HAZEL_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HAZEL_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HAZEL_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HAZEL_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HAZEL_WOOD, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_HAZEL_WOOD, 30, 60);
	}
}
