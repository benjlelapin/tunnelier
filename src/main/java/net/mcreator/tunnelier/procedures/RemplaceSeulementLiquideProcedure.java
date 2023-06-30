package net.mcreator.tunnelier.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class RemplaceSeulementLiquideProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() instanceof LiquidBlock) {
			if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.NETHER)) {
				world.setBlock(new BlockPos(x, y, z), Blocks.NETHER_BRICKS.defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x, y, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
			}
		}
	}
}
