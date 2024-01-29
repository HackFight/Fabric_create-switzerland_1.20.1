package net.hackfight.createswitzerland;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.hackfight.createswitzerland.fluid.ModFluids;
import net.minecraft.client.texture.Sprite;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.screen.PlayerScreenHandler;

public class CreateSwitzerlandClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

		FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.DARK_CHOCOLATE, ModFluids.DARK_CHOCOLATE_FLOWING, new SimpleFluidRenderHandler(
				new Identifier(CreateSwitzerland.MOD_ID, "fluid/dark_chocolate_still"),
				new Identifier(CreateSwitzerland.MOD_ID, "fluid/dark_chocolate_flow")
		));

		FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.DARK_CHOCOLATE_FLOWING, ModFluids.DARK_CHOCOLATE_FLOWING, new SimpleFluidRenderHandler(
				new Identifier(CreateSwitzerland.MOD_ID, "fluid/dark_chocolate_still"),
				new Identifier(CreateSwitzerland.MOD_ID, "fluid/dark_chocolate_flow")
		));
    }
}
