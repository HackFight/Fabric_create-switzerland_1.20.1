package net.hackfight.createswitzerland.item;

import com.simibubi.create.AllFluids;
import com.simibubi.create.AllItems;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hackfight.createswitzerland.CreateSwitzerland;
import net.hackfight.createswitzerland.block.ModBlocks;
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
                    .icon(() -> new ItemStack(Items.COCOA_BEANS)).entries((displayContext, entries) -> {

                        entries.add(Items.COCOA_BEANS);
                        entries.add(ModItems.CRUSHED_COCOA_BEANS);
                        entries.add(ModItems.COCOA_POWDER);
                        entries.add(ModItems.COCOA_BUTTER);
						entries.add(ModItems.CRUSHED_FLOWER);
                        entries.add(Items.MILK_BUCKET);
                        entries.add(Items.SUGAR);
						entries.add(AllItems.BAR_OF_CHOCOLATE);
						entries.add(ModItems.BAR_OF_DARK_CHOCOLATE);
						entries.add(ModItems.BAR_OF_WHITE_CHOCOLATE);
                        entries.add(ModBlocks.MILK_CHOCOLATE_BLOCK);
						entries.add(ModBlocks.DARK_CHOCOLATE_BLOCK);
						entries.add(ModBlocks.WHITE_CHOCOLATE_BLOCK);
						entries.add(AllFluids.CHOCOLATE.get().getBucketItem());
						entries.add(ModItems.DARK_CHOCOLATE_BUCKET);

                    }).build());
    public static void registerItemGroups()
    {
        CreateSwitzerland.LOGGER.info("Registering item groups for " + CreateSwitzerland.MOD_ID);
    }
}
