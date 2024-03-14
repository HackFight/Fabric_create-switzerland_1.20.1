package net.hackfight.createswitzerland.util;

import net.hackfight.createswitzerland.CreateSwitzerland;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

	public static class Blocks{


		private static TagKey<Block> createTag(String name) {
			return TagKey.of(RegistryKeys.BLOCK, new Identifier(CreateSwitzerland.MOD_ID, name));
		}
	}

	public static class Items{

		public static final TagKey<Item> CHOCOLATE_TABLET = createTag("chocolate_tablet");

		private static TagKey<Item> createTag(String name) {
			return TagKey.of(RegistryKeys.ITEM, new Identifier(CreateSwitzerland.MOD_ID, name));
		}
	}
}
