
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ctp.craftopia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.ctp.craftopia.block.entity.StrawberryStageTwoBlockEntity;
import net.ctp.craftopia.block.entity.StrawberryStageThreeBlockEntity;
import net.ctp.craftopia.block.entity.StrawberryStageOneBlockEntity;
import net.ctp.craftopia.block.entity.StrawberrySeedsBlockEntity;
import net.ctp.craftopia.CtpMod;

public class CtpModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CtpMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> STRAWBERRY_SEEDS = register("strawberry_seeds", CtpModBlocks.STRAWBERRY_SEEDS, StrawberrySeedsBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRAWBERRY_STAGE_ONE = register("strawberry_stage_one", CtpModBlocks.STRAWBERRY_STAGE_ONE, StrawberryStageOneBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRAWBERRY_STAGE_TWO = register("strawberry_stage_two", CtpModBlocks.STRAWBERRY_STAGE_TWO, StrawberryStageTwoBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRAWBERRY_STAGE_THREE = register("strawberry_stage_three", CtpModBlocks.STRAWBERRY_STAGE_THREE, StrawberryStageThreeBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
