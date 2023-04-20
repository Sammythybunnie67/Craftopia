
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ctp.craftopia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.ctp.craftopia.item.StrawberryItem;
import net.ctp.craftopia.item.SteelSwordItem;
import net.ctp.craftopia.item.SteelShovelItem;
import net.ctp.craftopia.item.SteelPickaxeItem;
import net.ctp.craftopia.item.SteelIngotItem;
import net.ctp.craftopia.item.SteelHoeItem;
import net.ctp.craftopia.item.SteelAxeItem;
import net.ctp.craftopia.item.SteelArmorItem;
import net.ctp.craftopia.item.EnderiumAlloySwordItem;
import net.ctp.craftopia.item.EnderiumAlloyShovelItem;
import net.ctp.craftopia.item.EnderiumAlloyPickaxeItem;
import net.ctp.craftopia.item.EnderiumAlloyIngotItem;
import net.ctp.craftopia.item.EnderiumAlloyHoeItem;
import net.ctp.craftopia.item.EnderiumAlloyAxeItem;
import net.ctp.craftopia.item.EnderiumAlloyArmorItem;
import net.ctp.craftopia.item.EmeradSwordItem;
import net.ctp.craftopia.item.EmeradShovelItem;
import net.ctp.craftopia.item.EmeradPickaxeItem;
import net.ctp.craftopia.item.EmeradHoeItem;
import net.ctp.craftopia.item.EmeradAxeItem;
import net.ctp.craftopia.CtpMod;

public class CtpModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CtpMod.MODID);
	public static final RegistryObject<Item> EMERAD_SWORD = REGISTRY.register("emerad_sword", () -> new EmeradSwordItem());
	public static final RegistryObject<Item> EMERAD_AXE = REGISTRY.register("emerad_axe", () -> new EmeradAxeItem());
	public static final RegistryObject<Item> EMERAD_PICKAXE = REGISTRY.register("emerad_pickaxe", () -> new EmeradPickaxeItem());
	public static final RegistryObject<Item> EMERAD_SHOVEL = REGISTRY.register("emerad_shovel", () -> new EmeradShovelItem());
	public static final RegistryObject<Item> EMERAD_HOE = REGISTRY.register("emerad_hoe", () -> new EmeradHoeItem());
	public static final RegistryObject<Item> ENDERIUM_ALLOY_ARMOR_HELMET = REGISTRY.register("enderium_alloy_armor_helmet", () -> new EnderiumAlloyArmorItem.Helmet());
	public static final RegistryObject<Item> ENDERIUM_ALLOY_ARMOR_CHESTPLATE = REGISTRY.register("enderium_alloy_armor_chestplate", () -> new EnderiumAlloyArmorItem.Chestplate());
	public static final RegistryObject<Item> ENDERIUM_ALLOY_ARMOR_LEGGINGS = REGISTRY.register("enderium_alloy_armor_leggings", () -> new EnderiumAlloyArmorItem.Leggings());
	public static final RegistryObject<Item> ENDERIUM_ALLOY_ARMOR_BOOTS = REGISTRY.register("enderium_alloy_armor_boots", () -> new EnderiumAlloyArmorItem.Boots());
	public static final RegistryObject<Item> ENDERIUM_ALLOY_SWORD = REGISTRY.register("enderium_alloy_sword", () -> new EnderiumAlloySwordItem());
	public static final RegistryObject<Item> ENDERIUM_ALLOY_AXE = REGISTRY.register("enderium_alloy_axe", () -> new EnderiumAlloyAxeItem());
	public static final RegistryObject<Item> ENDERIUM_ALLOY_PICKAXE = REGISTRY.register("enderium_alloy_pickaxe", () -> new EnderiumAlloyPickaxeItem());
	public static final RegistryObject<Item> ENDERIUM_ALLOY_SHOVEL = REGISTRY.register("enderium_alloy_shovel", () -> new EnderiumAlloyShovelItem());
	public static final RegistryObject<Item> ENDERIUM_ALLOY_HOE = REGISTRY.register("enderium_alloy_hoe", () -> new EnderiumAlloyHoeItem());
	public static final RegistryObject<Item> STEEL_ARMOR_HELMET = REGISTRY.register("steel_armor_helmet", () -> new SteelArmorItem.Helmet());
	public static final RegistryObject<Item> STEEL_ARMOR_CHESTPLATE = REGISTRY.register("steel_armor_chestplate", () -> new SteelArmorItem.Chestplate());
	public static final RegistryObject<Item> STEEL_ARMOR_LEGGINGS = REGISTRY.register("steel_armor_leggings", () -> new SteelArmorItem.Leggings());
	public static final RegistryObject<Item> STEEL_ARMOR_BOOTS = REGISTRY.register("steel_armor_boots", () -> new SteelArmorItem.Boots());
	public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
	public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new SteelAxeItem());
	public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
	public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new SteelShovelItem());
	public static final RegistryObject<Item> STEEL_HOE = REGISTRY.register("steel_hoe", () -> new SteelHoeItem());
	public static final RegistryObject<Item> ENDERIUM_ALLOY_BLOCK = block(CtpModBlocks.ENDERIUM_ALLOY_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEEL_BLOCK = block(CtpModBlocks.STEEL_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> ENDERIUM_ALLOY_INGOT = REGISTRY.register("enderium_alloy_ingot", () -> new EnderiumAlloyIngotItem());
	public static final RegistryObject<Item> STRAWBERRY = REGISTRY.register("strawberry", () -> new StrawberryItem());
	public static final RegistryObject<Item> STRAWBERRY_SEEDS = block(CtpModBlocks.STRAWBERRY_SEEDS, CreativeModeTab.TAB_FOOD);
	public static final RegistryObject<Item> STRAWBERRY_STAGE_ONE = block(CtpModBlocks.STRAWBERRY_STAGE_ONE, null);
	public static final RegistryObject<Item> STRAWBERRY_STAGE_TWO = block(CtpModBlocks.STRAWBERRY_STAGE_TWO, null);
	public static final RegistryObject<Item> STRAWBERRY_STAGE_THREE = block(CtpModBlocks.STRAWBERRY_STAGE_THREE, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
