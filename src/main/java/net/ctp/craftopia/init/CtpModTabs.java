
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ctp.craftopia.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CtpModTabs {
	public static CreativeModeTab TAB_CRAFTOPIA_FOOD;
	public static CreativeModeTab TAB_CRAFTOPIA_COMBAT;

	public static void load() {
		TAB_CRAFTOPIA_FOOD = new CreativeModeTab("tabcraftopia_food") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CtpModItems.STRAWBERRY.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_CRAFTOPIA_COMBAT = new CreativeModeTab("tabcraftopia_combat") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CtpModItems.ENDERIUM_ALLOY_ARMOR_CHESTPLATE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
