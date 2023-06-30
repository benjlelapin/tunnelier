package net.mcreator.tunnelier.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class RemplaceLiquideProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() instanceof LiquidBlock || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.KELP_PLANT
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.TALL_SEAGRASS || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SEAGRASS
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.KELP) {
			if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.NETHER)) {
				world.setBlock(new BlockPos(x, y, z), Blocks.NETHER_BRICKS.defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x, y, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SAND) {
			world.setBlock(new BlockPos(x, y, z), Blocks.SANDSTONE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GRAVEL) {
			world.setBlock(new BlockPos(x, y, z), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
		}
	}
}
