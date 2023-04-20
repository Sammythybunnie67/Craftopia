package net.ctp.craftopia.block.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.ctp.craftopia.init.CtpModBlockEntities;

public class StrawberrySeedsBlockEntity extends BlockEntity {
	public StrawberrySeedsBlockEntity(BlockPos pos, BlockState state) {
		super(CtpModBlockEntities.STRAWBERRY_SEEDS.get(), pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithFullMetadata();
	}
}
