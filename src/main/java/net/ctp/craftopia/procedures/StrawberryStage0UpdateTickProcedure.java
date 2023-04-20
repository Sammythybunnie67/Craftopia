package net.ctp.craftopia.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.ctp.craftopia.init.CtpModBlocks;

public class StrawberryStage0UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState stage3 = Blocks.AIR.defaultBlockState();
		BlockState stage2 = Blocks.AIR.defaultBlockState();
		BlockState stage4 = Blocks.AIR.defaultBlockState();
		BlockState stage1 = Blocks.AIR.defaultBlockState();
		BlockState stage0 = Blocks.AIR.defaultBlockState();
		stage0 = CtpModBlocks.STRAWBERRY_SEEDS.get().defaultBlockState();
		stage1 = CtpModBlocks.STRAWBERRY_STAGE_ONE.get().defaultBlockState();
		stage2 = CtpModBlocks.STRAWBERRY_STAGE_TWO.get().defaultBlockState();
		stage3 = CtpModBlocks.STRAWBERRY_STAGE_THREE.get().defaultBlockState();
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "GrowthTime") <= 0) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == stage0.getBlock() && stage1.canSurvive(world, new BlockPos(x, y, z))) {
				world.setBlock(new BlockPos(x, y, z), stage1, 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == stage1.getBlock() && stage2.canSurvive(world, new BlockPos(x, y, z))) {
				world.setBlock(new BlockPos(x, y, z), stage2, 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == stage2.getBlock() && stage3.canSurvive(world, new BlockPos(x, y, z))) {
				world.setBlock(new BlockPos(x, y, z), stage3, 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == stage3.getBlock() && stage3.canSurvive(world, new BlockPos(x, y, z))) {
				world.setBlock(new BlockPos(x, y, z), stage3, 3);
			}
		}
	}
}
