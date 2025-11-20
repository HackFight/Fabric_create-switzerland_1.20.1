package net.hackfight.createswitzerland.item;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;

import java.util.Set;

public class HotCocoa extends DrinkableItem{
	public HotCocoa(Settings settings) {
		super(settings);
	}

	@Override
	public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
		if (!world.isClient()) {
			affectConsumer(stack, world, user);
			// TODO -- ADD STATUS EFFECT FOR DRINKING HOT CHOCOLATE HERE
		}

		ItemStack recipeRemainder = stack.getRecipeRemainder();

		if (stack.isFood()) {
			super.finishUsing(stack, world, user);
		} else if (user instanceof PlayerEntity player){
			if (player instanceof ServerPlayerEntity serverPlayerEntity) {
				Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
			}
			player.incrementStat(Stats.USED.getOrCreateStat(this));
			if (!player.getAbilities().creativeMode) {
				stack.decrement(1);
			}
		}

		if (stack.isEmpty())
			return recipeRemainder;

		if (user instanceof PlayerEntity playerEntity && !playerEntity.getAbilities().creativeMode && !playerEntity.getInventory().insertStack(recipeRemainder))
			playerEntity.dropItem(recipeRemainder, false);
		return stack;
	}
}
