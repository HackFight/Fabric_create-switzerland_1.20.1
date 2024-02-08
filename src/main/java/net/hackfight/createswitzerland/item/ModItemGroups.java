package net.hackfight.createswitzerland.item;

import com.simibubi.create.AllFluids;
import com.simibubi.create.AllItems;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hackfight.createswitzerland.CreateSwitzerland;
import net.hackfight.createswitzerland.block.ModBlocks;
import net.hackfight.createswitzerland.fluid.ModFluids;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SWISS_CONFISSERY = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CreateSwitzerland.MOD_ID, "swiss_confissery"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.swiss_confissery"))
                    .icon(() -> new ItemStack(ModItems.MILK_CHOCOLATE_TABLET)).entries((displayContext, entries) -> {

                        entries.add(Items.COCOA_BEANS);
                        entries.add(ModItems.CRUSHED_COCOA_BEANS);
                        entries.add(ModItems.COCOA_POWDER);
                        entries.add(ModItems.COCOA_BUTTER);
						entries.add(ModItems.CRUSHED_FLOWER);
						entries.add(Items.SWEET_BERRIES);
						entries.add(ModItems.HAZELNUT);
                        entries.add(Items.MILK_BUCKET);
                        entries.add(Items.SUGAR);
						entries.add(Items.PAPER);
						entries.add(ModItems.GOLDEN_LEAF);

						entries.add(AllItems.BAR_OF_CHOCOLATE);
						entries.add(ModItems.BAR_OF_DARK_CHOCOLATE);
						entries.add(ModItems.BAR_OF_WHITE_CHOCOLATE);
						entries.add(ModItems.BAR_OF_CARAMEL);

						entries.add(ModItems.MILK_CHOCOLATE_TABLET);
						entries.add(ModItems.DARK_CHOCOLATE_TABLET);
						entries.add(ModItems.WHITE_CHOCOLATE_TABLET);

						entries.add(AllItems.CHOCOLATE_BERRIES);
						entries.add(ModItems.DARK_CHOCOLATE_GLAZED_BERRIES);
						entries.add(ModItems.WHITE_CHOCOLATE_GLAZED_BERRIES);

						entries.add(AllFluids.CHOCOLATE.get().getBucketItem());
						entries.add(ModFluids.DARK_CHOCOLATE_BUCKET);
						entries.add(ModFluids.WHITE_CHOCOLATE_BUCKET);
						entries.add(ModFluids.CARAMEL_BUCKET);

                        entries.add(ModBlocks.MILK_CHOCOLATE_BLOCK);
						entries.add(ModBlocks.MILK_CHOCOLATE_STAIRS);
						entries.add(ModBlocks.MILK_CHOCOLATE_SLAB);

						entries.add(ModBlocks.DARK_CHOCOLATE_BLOCK);
						entries.add(ModBlocks.DARK_CHOCOLATE_STAIRS);
						entries.add(ModBlocks.DARK_CHOCOLATE_SLAB);

						entries.add(ModBlocks.WHITE_CHOCOLATE_BLOCK);
						entries.add(ModBlocks.WHITE_CHOCOLATE_STAIRS);
						entries.add(ModBlocks.WHITE_CHOCOLATE_SLAB);

						entries.add(ModBlocks.CARAMEL_BLOCK);
						entries.add(ModBlocks.CARAMEL_STAIRS);
						entries.add(ModBlocks.CARAMEL_SLAB);

                    }).build());

	public static final ItemGroup SWISS_WOOD = Registry.register(Registries.ITEM_GROUP,
			new Identifier(CreateSwitzerland.MOD_ID, "swiss_wood"),
			FabricItemGroup.builder().displayName(Text.translatable("itemgroup.swiss_confissery"))
					.icon(() -> new ItemStack(ModItems.HAZELNUT)).entries((displayContext, entries) -> {

						entries.add(ModBlocks.HAZEL_SAPLING);
						entries.add(ModItems.HAZELNUT);
						entries.add(ModBlocks.HAZEL_LOG);
						entries.add(ModBlocks.HAZEL_WOOD);
						entries.add(ModBlocks.STRIPPED_HAZEL_LOG);
						entries.add(ModBlocks.STRIPPED_HAZEL_WOOD);
						entries.add(ModBlocks.HAZEL_PLANKS);
						entries.add(ModBlocks.HAZEL_LEAVES);

					}).build());
    public static void registerItemGroups()
    {
        CreateSwitzerland.LOGGER.info("Registering item groups for " + CreateSwitzerland.MOD_ID);
    }
}
