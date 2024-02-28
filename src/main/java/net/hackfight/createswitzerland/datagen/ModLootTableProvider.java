package net.hackfight.createswitzerland.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.hackfight.createswitzerland.block.ModBlocks;
import net.hackfight.createswitzerland.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

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

		addDrop(ModBlocks.HAZEL_SAPLING);
		addDrop(ModBlocks.HAZEL_LOG);
		addDrop(ModBlocks.HAZEL_WOOD);
		addDrop(ModBlocks.STRIPPED_HAZEL_LOG);
		addDrop(ModBlocks.STRIPPED_HAZEL_WOOD);
		addDrop(ModBlocks.HAZEL_PLANKS);

		addDrop(ModBlocks.HAZEL_LEAVES, hazelLeavesDrops(ModBlocks.HAZEL_LEAVES, ModBlocks.HAZEL_SAPLING, 0.05F));
    }

	public LootTable.Builder hazelLeavesDrops(Block leaves, Block drop, float... chance) {
		return this.leavesDrops(leaves, drop, chance).pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).conditionally(WITHOUT_SILK_TOUCH_NOR_SHEARS).with(((LeafEntry.Builder)this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(ModItems.HAZELNUT))).conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, new float[]{0.05F, 0.055555557F, 0.0625F, 0.08333334F, 0.25F}))));
	}
}
