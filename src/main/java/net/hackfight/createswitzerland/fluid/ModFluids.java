package net.hackfight.createswitzerland.fluid;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hackfight.createswitzerland.CreateSwitzerland;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {

	public static FlowableFluid DARK_CHOCOLATE;
	public static FlowableFluid DARK_CHOCOLATE_FLOWING;
	public static Block DARK_CHOCOLATE_FLUID_BLOCK;
	public static Item DARK_CHOCOLATE_BUCKET;

	public static FlowableFluid WHITE_CHOCOLATE;
	public static FlowableFluid WHITE_CHOCOLATE_FLOWING;
	public static Block WHITE_CHOCOLATE_FLUID_BLOCK;
	public static Item WHITE_CHOCOLATE_BUCKET;

	public static FlowableFluid CARAMEL;
	public static FlowableFluid CARAMEL_FLOWING;
	public static Block CARAMEL_FLUID_BLOCK;
	public static Item CARAMEL_BUCKET;

	public static void registerModFluids(){
		CreateSwitzerland.LOGGER.info("Registering mod fluids for " + CreateSwitzerland.MOD_ID);

		DARK_CHOCOLATE = Registry.register(Registries.FLUID, new Identifier(CreateSwitzerland.MOD_ID, "dark_chocolate"), new DarkChocolateFluid.Still());
		DARK_CHOCOLATE_FLOWING = Registry.register(Registries.FLUID, new Identifier(CreateSwitzerland.MOD_ID, "flowing_dark_chocolate"), new DarkChocolateFluid.Flowing());
		DARK_CHOCOLATE_FLUID_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateSwitzerland.MOD_ID, "dark_chocolate"), new FluidBlock(ModFluids.DARK_CHOCOLATE, FabricBlockSettings.copyOf(Blocks.WATER)){ });
		DARK_CHOCOLATE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateSwitzerland.MOD_ID, "dark_chocolate_bucket"), new BucketItem(ModFluids.DARK_CHOCOLATE, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));

		WHITE_CHOCOLATE = Registry.register(Registries.FLUID, new Identifier(CreateSwitzerland.MOD_ID, "white_chocolate"), new WhiteChocolateFluid.Still());
		WHITE_CHOCOLATE_FLOWING = Registry.register(Registries.FLUID, new Identifier(CreateSwitzerland.MOD_ID, "flowing_white_chocolate"), new WhiteChocolateFluid.Flowing());
		WHITE_CHOCOLATE_FLUID_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateSwitzerland.MOD_ID, "white_chocolate"), new FluidBlock(ModFluids.WHITE_CHOCOLATE, FabricBlockSettings.copyOf(Blocks.WATER)){ });
		WHITE_CHOCOLATE_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateSwitzerland.MOD_ID, "white_chocolate_bucket"), new BucketItem(ModFluids.WHITE_CHOCOLATE, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));

		CARAMEL = Registry.register(Registries.FLUID, new Identifier(CreateSwitzerland.MOD_ID, "caramel"), new CaramelFluid.Still());
		CARAMEL_FLOWING = Registry.register(Registries.FLUID, new Identifier(CreateSwitzerland.MOD_ID, "flowing_caramel"), new CaramelFluid.Flowing());
		CARAMEL_FLUID_BLOCK = Registry.register(Registries.BLOCK, new Identifier(CreateSwitzerland.MOD_ID, "caramel"), new FluidBlock(ModFluids.CARAMEL, FabricBlockSettings.copyOf(Blocks.WATER)){ });
		CARAMEL_BUCKET = Registry.register(Registries.ITEM, new Identifier(CreateSwitzerland.MOD_ID, "caramel_bucket"), new BucketItem(ModFluids.CARAMEL, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));
	}

	private static FlowableFluid register(String name, FlowableFluid flowingFluid){
		return Registry.register(Registries.FLUID, new Identifier(CreateSwitzerland.MOD_ID, name), flowingFluid);
	}
}
