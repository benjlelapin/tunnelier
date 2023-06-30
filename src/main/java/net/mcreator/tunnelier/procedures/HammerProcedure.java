package net.mcreator.tunnelier.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.core.Direction;

import net.mcreator.tunnelier.network.TunnelierModVariables;

public class HammerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double boucle = 0;
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(-10, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		if (!entity.isShiftKeyDown()) {
			if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.WEST) {
				X = x + 1;
				Y = y - 1;
				Z = z - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2;
				for (int index0 = 0; index0 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index0++) {
					for (int index1 = 0; index1 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index1++) {
						CasseBlocProcedure.execute(world, x, Y, Z, entity);
						RemplaceLiquideProcedure.execute(world, X, Y, Z);
						Z = Z + 1;
					}
					Z = z - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2;
					Y = Y + 1;
				}
				boucle = 0;
				for (int index2 = 0; index2 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie + 1); index2++) {
					RemplaceLiquideProcedure.execute(world, x, ((y - 1) - 1 + boucle), ((z - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1));
					RemplaceLiquideProcedure.execute(world, x, (y - 1 + (entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie),
							((z - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1 + boucle));
					RemplaceLiquideProcedure.execute(world, x, ((y - 1 + (entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie) - boucle),
							(z + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1));
					RemplaceLiquideProcedure.execute(world, x, ((y - 1) - 1), ((z + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1) - boucle));
					boucle = boucle + 1;
				}
			}
			if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.EAST) {
				X = x - 1;
				Y = y - 1;
				Z = z - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2;
				for (int index3 = 0; index3 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index3++) {
					for (int index4 = 0; index4 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index4++) {
						CasseBlocProcedure.execute(world, x, Y, Z, entity);
						RemplaceLiquideProcedure.execute(world, X, Y, Z);
						Z = Z + 1;
					}
					Z = z - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2;
					Y = Y + 1;
				}
				boucle = 0;
				for (int index5 = 0; index5 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie + 1); index5++) {
					RemplaceLiquideProcedure.execute(world, x, ((y - 1) - 1 + boucle), ((z - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1));
					RemplaceLiquideProcedure.execute(world, x, (y - 1 + (entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie),
							((z - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1 + boucle));
					RemplaceLiquideProcedure.execute(world, x, ((y - 1 + (entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie) - boucle),
							(z + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1));
					RemplaceLiquideProcedure.execute(world, x, ((y - 1) - 1), ((z + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1) - boucle));
					boucle = boucle + 1;
				}
			}
			if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.NORTH) {
				X = x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2;
				Y = y - 1;
				Z = z + 1;
				for (int index6 = 0; index6 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index6++) {
					for (int index7 = 0; index7 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index7++) {
						CasseBlocProcedure.execute(world, X, Y, z, entity);
						RemplaceLiquideProcedure.execute(world, X, Y, Z);
						X = X + 1;
					}
					Y = Y + 1;
					X = x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2;
				}
				boucle = 0;
				for (int index8 = 0; index8 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie + 1); index8++) {
					RemplaceLiquideProcedure.execute(world, ((x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1), ((y - 1) - 1 + boucle), z);
					RemplaceLiquideProcedure.execute(world, ((x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1 + boucle),
							(y - 1 + (entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie), z);
					RemplaceLiquideProcedure.execute(world, (x + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1),
							((y - 1 + (entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie) - boucle), z);
					RemplaceLiquideProcedure.execute(world, ((x + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1) - boucle), ((y - 1) - 1), z);
					boucle = boucle + 1;
				}
			}
			if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.SOUTH) {
				X = x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2;
				Y = y - 1;
				Z = z - 1;
				for (int index9 = 0; index9 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index9++) {
					for (int index10 = 0; index10 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index10++) {
						CasseBlocProcedure.execute(world, X, Y, z, entity);
						RemplaceLiquideProcedure.execute(world, X, Y, Z);
						X = X + 1;
					}
					Y = Y + 1;
					X = x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2;
				}
				boucle = 0;
				for (int index11 = 0; index11 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie + 1); index11++) {
					RemplaceLiquideProcedure.execute(world, ((x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1), ((y - 1) - 1 + boucle), z);
					RemplaceLiquideProcedure.execute(world, ((x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1 + boucle),
							(y - 1 + (entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie), z);
					RemplaceLiquideProcedure.execute(world, (x + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1),
							((y - 1 + (entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie) - boucle), z);
					RemplaceLiquideProcedure.execute(world, ((x + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1) - boucle), ((y - 1) - 1), z);
					boucle = boucle + 1;
				}
			}
			if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.DOWN) {
				X = x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2;
				Y = y + 1;
				Z = z - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2;
				for (int index12 = 0; index12 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index12++) {
					for (int index13 = 0; index13 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index13++) {
						CasseBlocProcedure.execute(world, X, y, Z, entity);
						RemplaceLiquideProcedure.execute(world, X, Y, Z);
						X = X + 1;
					}
					X = x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2;
					Z = Z + 1;
				}
				boucle = 0;
				for (int index14 = 0; index14 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie + 1); index14++) {
					RemplaceLiquideProcedure.execute(world, ((x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1), y,
							((z - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1 + boucle));
					RemplaceLiquideProcedure.execute(world, ((x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1 + boucle), y,
							(z + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1));
					RemplaceLiquideProcedure.execute(world, (x + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1), y,
							((z + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1) - boucle));
					RemplaceLiquideProcedure.execute(world, ((x + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1) - boucle), y,
							((z - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1));
					boucle = boucle + 1;
				}
			}
			if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.UP) {
				X = x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2;
				Y = y - 1;
				Z = z - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2;
				for (int index15 = 0; index15 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index15++) {
					for (int index16 = 0; index16 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index16++) {
						CasseBlocProcedure.execute(world, X, y, Z, entity);
						RemplaceLiquideProcedure.execute(world, X, Y, Z);
						X = X + 1;
					}
					X = x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2;
					Z = Z + 1;
				}
				boucle = 0;
				for (int index17 = 0; index17 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie + 1); index17++) {
					RemplaceLiquideProcedure.execute(world, ((x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1), y,
							((z - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1 + boucle));
					RemplaceLiquideProcedure.execute(world, ((x - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1 + boucle), y,
							(z + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1));
					RemplaceLiquideProcedure.execute(world, (x + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1), y,
							((z + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1) - boucle));
					RemplaceLiquideProcedure.execute(world, ((x + ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1) - boucle), y,
							((z - ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) - 1));
					boucle = boucle + 1;
				}
			}
		}
	}
}
