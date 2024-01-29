package net.hackfight.createswitzerland.fluid;

import net.hackfight.createswitzerland.CreateSwitzerland;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {

	public static final FlowableFluid DARK_CHOCOLATE = register("dark_chocolate", new DarkChocolateFluid.Still());
	public static final FlowableFluid DARK_CHOCOLATE_FLOWING = register("dark_chocolate_flowing", new DarkChocolateFluid.Flowing());

	private static FlowableFluid register(String name, FlowableFluid flowingFluid){
		return Registry.register(Registries.FLUID, new Identifier(CreateSwitzerland.MOD_ID, name), flowingFluid);
	}
}
