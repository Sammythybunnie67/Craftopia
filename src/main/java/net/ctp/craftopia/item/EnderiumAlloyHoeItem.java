
package net.ctp.craftopia.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.ctp.craftopia.init.CtpModTabs;
import net.ctp.craftopia.init.CtpModItems;

public class EnderiumAlloyHoeItem extends HoeItem {
	public EnderiumAlloyHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2859;
			}

			public float getSpeed() {
				return 17f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 11;
			}

			public int getEnchantmentValue() {
				return 80;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CtpModItems.ENDERIUM_ALLOY_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(CtpModTabs.TAB_CRAFTOPIA_COMBAT));
	}
}
