package net.hackfight.createswitzerland.item;

import com.mojang.datafixers.util.Pair;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ConsumableItem extends Item {
	public ConsumableItem(Settings settings) {
		super(settings);
	}

	public void affectConsumer(ItemStack itemStack, World world, LivingEntity userEntity) {

	}
}
