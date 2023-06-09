
package net.ctp.craftopia.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.ctp.craftopia.init.CtpModTabs;
import net.ctp.craftopia.init.CtpModItems;

public abstract class EnderiumAlloyArmorItem extends ArmorItem {
	public EnderiumAlloyArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 85;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{5, 14, 12, 5}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 51;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CtpModItems.ENDERIUM_ALLOY_INGOT.get()));
			}

			@Override
			public String getName() {
				return "enderium_alloy_armor";
			}

			@Override
			public float getToughness() {
				return 5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends EnderiumAlloyArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CtpModTabs.TAB_CRAFTOPIA_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ctp:textures/models/armor/enderiumalloy_layer_1.png";
		}
	}

	public static class Chestplate extends EnderiumAlloyArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CtpModTabs.TAB_CRAFTOPIA_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ctp:textures/models/armor/enderiumalloy_layer_1.png";
		}
	}

	public static class Leggings extends EnderiumAlloyArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CtpModTabs.TAB_CRAFTOPIA_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ctp:textures/models/armor/enderiumalloy_layer_2.png";
		}
	}

	public static class Boots extends EnderiumAlloyArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CtpModTabs.TAB_CRAFTOPIA_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ctp:textures/models/armor/enderiumalloy_layer_1.png";
		}
	}
}
