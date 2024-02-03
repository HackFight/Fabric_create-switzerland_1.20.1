package net.hackfight.createswitzerland.mixin;

import com.google.common.collect.Maps;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.Map;

@Mixin(LivingEntity.class)
public interface CustomLivingEntityInvoker {
	@Invoker("onStatusEffectRemoved")
	public void onStatusEffectRemoved(StatusEffectInstance effect);
}
