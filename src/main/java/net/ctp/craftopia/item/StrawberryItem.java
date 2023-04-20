
package net.ctp.craftopia.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.ctp.craftopia.init.CtpModTabs;

public class StrawberryItem extends Item {
	public StrawberryItem() {
		super(new Item.Properties().tab(CtpModTabs.TAB_CRAFTOPIA_FOOD).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(6).saturationMod(1.1f)

				.build()));
	}

	@Override
	public int getEnchantmentValue() {
		return -10;
	}
}
