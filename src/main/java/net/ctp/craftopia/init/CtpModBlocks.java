
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ctp.craftopia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.ctp.craftopia.block.StrawberryStageTwoBlock;
import net.ctp.craftopia.block.StrawberryStageThreeBlock;
import net.ctp.craftopia.block.StrawberryStageOneBlock;
import net.ctp.craftopia.block.StrawberrySeedsBlock;
import net.ctp.craftopia.block.SteelBlockBlock;
import net.ctp.craftopia.block.EnderiumAlloyBlockBlock;
import net.ctp.craftopia.CtpMod;

public class CtpModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CtpMod.MODID);
	public static final RegistryObject<Block> ENDERIUM_ALLOY_BLOCK = REGISTRY.register("enderium_alloy_block", () -> new EnderiumAlloyBlockBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> STRAWBERRY_SEEDS = REGISTRY.register("strawberry_seeds", () -> new StrawberrySeedsBlock());
	public static final RegistryObject<Block> STRAWBERRY_STAGE_ONE = REGISTRY.register("strawberry_stage_one", () -> new StrawberryStageOneBlock());
	public static final RegistryObject<Block> STRAWBERRY_STAGE_TWO = REGISTRY.register("strawberry_stage_two", () -> new StrawberryStageTwoBlock());
	public static final RegistryObject<Block> STRAWBERRY_STAGE_THREE = REGISTRY.register("strawberry_stage_three", () -> new StrawberryStageThreeBlock());
}
