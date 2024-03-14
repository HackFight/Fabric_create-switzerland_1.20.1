package net.hackfight.createswitzerland.projectile;

import com.simibubi.create.AllItems;
import com.simibubi.create.Create;
import com.simibubi.create.content.equipment.potatoCannon.PotatoCannonProjectileType;

import net.hackfight.createswitzerland.CreateSwitzerland;
import net.hackfight.createswitzerland.item.ModItems;
import net.minecraft.util.Identifier;

public class ModPotatoProjectiles {
	public static final PotatoCannonProjectileType

			BAR_OF_MILK_CHOCOLATE = create("bar_of_milk_chocolate").damage(16)
				.reloadTicks(20)
				.knockback(2.0f)
				.velocity(1.0f)
				.soundPitch(0.80f)
				.registerAndAssign(AllItems.BAR_OF_CHOCOLATE),

			BAR_OF_DARK_CHOCOLATE = create("bar_of_dark_chocolate").damage(16)
					.reloadTicks(20)
					.knockback(2.0f)
					.velocity(1.0f)
					.soundPitch(0.80f)
					.registerAndAssign(ModItems.BAR_OF_DARK_CHOCOLATE),

			BAR_OF_WHITE_CHOCOLATE = create("bar_of_white_chocolate").damage(16)
					.reloadTicks(20)
					.knockback(2.0f)
					.velocity(1.0f)
					.soundPitch(0.80f)
					.registerAndAssign(ModItems.BAR_OF_WHITE_CHOCOLATE)
	;


	private static PotatoCannonProjectileType.Builder create(String name) {
		return new PotatoCannonProjectileType.Builder(new Identifier(CreateSwitzerland.MOD_ID, name));
	}

	public static void registerModPotatoProjectiles() {

		CreateSwitzerland.LOGGER.info("Registering potato projectiles for " + CreateSwitzerland.MOD_ID);
	}
}
