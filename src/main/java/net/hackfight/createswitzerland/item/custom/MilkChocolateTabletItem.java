package net.hackfight.createswitzerland.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MilkChocolateTabletItem extends Item {

	public MilkChocolateTabletItem(Settings settings) {
		super(settings);
	}


	public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
		if (!world.isClient) {

			Iterator<StatusEffectInstance> iterator = user.getActiveStatusEffects().values().iterator();

			ArrayList<StatusEffectInstance> effects = new ArrayList<StatusEffectInstance>();

			while (iterator.hasNext()) {
				effects.add(iterator.next());
			}

            for (StatusEffectInstance statusEffectInstance : effects) {
                StatusEffect effect = statusEffectInstance.getEffectType();

                if (!effect.isBeneficial()) {
                    user.removeStatusEffect(effect);
                }
            }
		}

		return super.finishUsing(stack, world, user);
	}
}
