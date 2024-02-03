package net.hackfight.createswitzerland.item;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
	public static final FoodComponent BAR_OF_DARK_CHOCOLATE = new FoodComponent.Builder().hunger(6).saturationModifier(0.3F).build();
	public static final FoodComponent BAR_OF_WHITE_CHOCOLATE = new FoodComponent.Builder().hunger(6).saturationModifier(0.3F).build();

	public static final FoodComponent DARK_CHOCOLATE_GLAZED_BERRIES = new FoodComponent.Builder().hunger(7).saturationModifier(0.8F).build();
	public static final FoodComponent WHITE_CHOCOLATE_GLAZED_BERRIES = new FoodComponent.Builder().hunger(7).saturationModifier(0.8F).build();
	public static final FoodComponent MILK_CHOCOLATE_TABLET = new FoodComponent.Builder().hunger(10).saturationModifier(0.9F).alwaysEdible().build();
}
