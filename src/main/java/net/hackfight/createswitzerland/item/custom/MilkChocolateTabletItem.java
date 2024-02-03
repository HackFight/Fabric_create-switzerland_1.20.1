package net.hackfight.createswitzerland.item.custom;

import net.hackfight.createswitzerland.mixin.CustomLivingEntityInvoker;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Iterator;



public class MilkChocolateTabletItem extends Item {

	public MilkChocolateTabletItem(Settings settings) {
		super(settings);
	}


	public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {

		if (!world.isClient) {

			Iterator<StatusEffectInstance> iterator = user.getActiveStatusEffects().values().iterator();

			while (iterator.hasNext()) {

				StatusEffectInstance effect = iterator.next();
				if(effect.getEffectType().isBeneficial()) {
					user.removeStatusEffect(effect.getEffectType());
					iterator.remove();
				}
			}
		}

		return super.finishUsing(stack, world, user);
	}
}
