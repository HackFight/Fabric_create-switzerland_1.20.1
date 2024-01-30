package net.hackfight.createswitzerland.fluid;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public abstract class WhiteChocolateFluid extends FlowableFluid {

	@Override
	protected boolean isInfinite(World world) {
		return false;
	}

	@Override
	protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state) {
		final BlockEntity blockEntity = state.hasBlockEntity() ? world.getBlockEntity(pos) : null;
		Block.dropStacks(state, world, pos, blockEntity);
	}

	@Override
	public int getFlowSpeed(WorldView world) {
		return 2;
	}

	@Override
	public int getLevelDecreasePerBlock(WorldView world) {
		return 2;
	}

	@Override
	public int getLevel(FluidState state) {
		return 0;
	}

	@Override
	public int getTickRate(WorldView world) {
		return 30;
	}

	@Override
	protected float getBlastResistance() {
		return 100.0F;
	}

	@Override
	public boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
		return false;
	}

	@Override
	public Fluid getStill() {
		return ModFluids.WHITE_CHOCOLATE;
	}

	@Override
	public Fluid getFlowing() {
		return ModFluids.WHITE_CHOCOLATE_FLOWING;
	}

	@Override
	public Item getBucketItem() {
		return ModFluids.WHITE_CHOCOLATE_BUCKET;
	}

	@Override
	public BlockState toBlockState(FluidState state) {
		return ModFluids.WHITE_CHOCOLATE_FLUID_BLOCK.getDefaultState().with(FluidBlock.LEVEL, getBlockStateLevel(state));
	}

	@Override
	public boolean isStill(FluidState state) {
		return false;
	}

	@Override
	public boolean matchesType(Fluid fluid) {
		return fluid == getStill() || fluid == getFlowing();
	}

	public static class Flowing extends WhiteChocolateFluid {

		@Override
		protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
			super.appendProperties(builder);
			builder.add(LEVEL);
		}

		@Override
		public int getLevel(FluidState state) {
			return state.get(LEVEL);
		}

		@Override
		public boolean isStill(FluidState state) {
			return false;
		}
	}

	public static class Still extends WhiteChocolateFluid {

		@Override
		public int getLevel(FluidState state) {
			return 8;
		}

		@Override
		public boolean isStill(FluidState state) {
			return true;
		}
	}
}
