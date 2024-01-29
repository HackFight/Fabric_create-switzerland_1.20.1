package net.hackfight.createswitzerland.datagen;

import com.simibubi.create.AllItems;

import com.simibubi.create.AllRecipeTypes;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hackfight.createswitzerland.block.ModBlocks;
import net.hackfight.createswitzerland.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

	@Override
	public void generate(Consumer<RecipeJsonProvider> exporter) {

		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, AllItems.BAR_OF_CHOCOLATE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MILK_CHOCOLATE_BLOCK);
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BAR_OF_DARK_CHOCOLATE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_CHOCOLATE_BLOCK);
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BAR_OF_WHITE_CHOCOLATE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CHOCOLATE_BLOCK);
	}
}