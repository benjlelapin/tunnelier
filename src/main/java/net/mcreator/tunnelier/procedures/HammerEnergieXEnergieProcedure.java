package net.mcreator.tunnelier.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;

import net.mcreator.tunnelier.network.TunnelierModVariables;

public class HammerEnergieXEnergieProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Axe1 = 0;
		double Axe2 = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double boucle1 = 0;
		double boucle2 = 0;
		double Axe1bis = 0;
		double Axe3 = 0;
		double boucle3 = 0;
		double bouclepeau = 0;
		double Axe1Peau1 = 0;
		double Axe2Peau1 = 0;
		double Axe1Peau2 = 0;
		double Axe2Peau2 = 0;
		double Axe1Peau3 = 0;
		double Axe2Peau3 = 0;
		double Axe1Peau4 = 0;
		double Axe2Peau4 = 0;
		double XPeau1 = 0;
		double Ypeau1 = 0;
		double ZPeau1 = 0;
		double XPeau2 = 0;
		double YPeau2 = 0;
		double ZPeau2 = 0;
		double XPeau3 = 0;
		double YPeau3 = 0;
		double ZPeau3 = 0;
		double XPeau4 = 0;
		double YPeau4 = 0;
		double ZPeau4 = 0;
		if (!entity.isShiftKeyDown()) {
			boucle1 = 0;
			boucle2 = 0;
			boucle3 = 0;
			for (int index0 = 0; index0 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie / 2); index0++) {
				for (int index1 = 0; index1 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index1++) {
					for (int index2 = 0; index2 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index2++) {
						Axe1 = (((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) * (-1) + boucle1;
						Axe1bis = (((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) * (-1) + boucle2;
						Axe2 = boucle2 - 1;
						Axe3 = boucle3;
						if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getDirection()) == Direction.DOWN) {
							X = x + Axe1;
							Y = y + Axe3;
							Z = z + Axe1bis;
						}
						if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.UP) {
							X = x + Axe1;
							Y = y - Axe3;
							Z = z + Axe1bis;
						}
						if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getDirection()) == Direction.NORTH) {
							X = x + Axe1;
							Y = y + Axe2;
							Z = z + Axe3;
						}
						if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getDirection()) == Direction.SOUTH) {
							X = x + Axe1;
							Y = y + Axe2;
							Z = z - Axe3;
						}
						if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getDirection()) == Direction.WEST) {
							X = x + Axe3;
							Y = y + Axe2;
							Z = z + Axe1;
						}
						if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
								.getDirection()) == Direction.EAST) {
							X = x - Axe3;
							Y = y + Axe2;
							Z = z + Axe1;
						}
						RemplaceSeulementLiquideProcedure.execute(world, X, Y, Z);
						CasseBlocProcedure.execute(world, X, Y, Z, entity);
						boucle1 = boucle1 + 1;
					}
					boucle1 = 0;
					boucle2 = boucle2 + 1;
				}
				for (int index3 = 0; index3 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie + 1); index3++) {
					Axe1Peau1 = (-1) * (((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 - 1);
					Axe1Peau2 = (-1) * (((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 - 1) + bouclepeau;
					Axe1Peau3 = ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1;
					Axe1Peau4 = (((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2 + 1) - bouclepeau;
					Axe2Peau1 = -2 + bouclepeau;
					Axe2Peau2 = -1 + (entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie;
					Axe2Peau3 = (-1 + (entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie) - bouclepeau;
					Axe2Peau4 = -2;
					if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.DOWN) {
						XPeau1 = x + Axe1Peau1;
						Ypeau1 = y + boucle3;
						ZPeau1 = z + Axe1Peau1 + bouclepeau;
						XPeau2 = x + Axe1Peau2 + bouclepeau;
						YPeau2 = y + boucle3;
						ZPeau2 = z + Axe1Peau2;
						XPeau3 = x + Axe1Peau3;
						YPeau3 = y + boucle3;
						ZPeau3 = (z + Axe1Peau3) - bouclepeau;
						XPeau4 = (x + Axe1Peau4) - bouclepeau;
						YPeau4 = y + boucle3;
						ZPeau4 = z + Axe1Peau4;
					}
					if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.UP) {
						XPeau1 = x + Axe1Peau1;
						Ypeau1 = y - boucle3;
						ZPeau1 = z + Axe1Peau1 + bouclepeau;
						XPeau2 = x + Axe1Peau2 + bouclepeau;
						YPeau2 = y - boucle3;
						ZPeau2 = z + Axe1Peau2;
						XPeau3 = x + Axe1Peau3;
						YPeau3 = y - boucle3;
						ZPeau3 = (z + Axe1Peau3) - bouclepeau;
						XPeau4 = (x + Axe1Peau4) - bouclepeau;
						YPeau4 = y - boucle3;
						ZPeau4 = z + Axe1Peau4;
					}
					if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.NORTH) {
						XPeau1 = x + Axe1Peau1;
						Ypeau1 = y + Axe2Peau1;
						ZPeau1 = z + boucle3;
						XPeau2 = x + Axe1Peau2;
						YPeau2 = y + Axe2Peau2;
						ZPeau2 = z + boucle3;
						XPeau3 = x + Axe1Peau3;
						YPeau3 = y + Axe2Peau3;
						ZPeau3 = z + boucle3;
						XPeau4 = x + Axe1Peau4;
						YPeau4 = y + Axe2Peau4;
						ZPeau4 = z + boucle3;
					}
					if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.SOUTH) {
						XPeau1 = x + Axe1Peau1;
						Ypeau1 = y + Axe2Peau1;
						ZPeau1 = z - boucle3;
						XPeau2 = x + Axe1Peau2;
						YPeau2 = y + Axe2Peau2;
						ZPeau2 = z - boucle3;
						XPeau3 = x + Axe1Peau3;
						YPeau3 = y + Axe2Peau3;
						ZPeau3 = z - boucle3;
						XPeau4 = x + Axe1Peau4;
						YPeau4 = y + Axe2Peau4;
						ZPeau4 = z - boucle3;
					}
					if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.WEST) {
						XPeau1 = x + boucle3;
						Ypeau1 = y + Axe2Peau1;
						ZPeau1 = z + Axe1Peau1;
						XPeau2 = x + boucle3;
						YPeau2 = y + Axe2Peau2;
						ZPeau2 = z + Axe1Peau2;
						XPeau3 = x + boucle3;
						YPeau3 = y + Axe2Peau3;
						ZPeau3 = z + Axe1Peau3;
						XPeau4 = x + boucle3;
						YPeau4 = y + Axe2Peau4;
						ZPeau4 = z + Axe1Peau4;
					}
					if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.EAST) {
						XPeau1 = x - boucle3;
						Ypeau1 = y + Axe2Peau1;
						ZPeau1 = z + Axe1Peau1;
						XPeau2 = x - boucle3;
						YPeau2 = y + Axe2Peau2;
						ZPeau2 = z + Axe1Peau2;
						XPeau3 = x - boucle3;
						YPeau3 = y + Axe2Peau3;
						ZPeau3 = z + Axe1Peau3;
						XPeau4 = x - boucle3;
						YPeau4 = y + Axe2Peau4;
						ZPeau4 = z + Axe1Peau4;
					}
					RemplaceLiquideProcedure.execute(world, XPeau1, Ypeau1, ZPeau1);
					RemplaceLiquideProcedure.execute(world, XPeau2, YPeau2, ZPeau2);
					RemplaceLiquideProcedure.execute(world, XPeau3, YPeau3, ZPeau3);
					RemplaceLiquideProcedure.execute(world, XPeau4, YPeau4, ZPeau4);
					bouclepeau = bouclepeau + 1;
				}
				boucle1 = 0;
				boucle2 = 0;
				boucle3 = boucle3 + 1;
			}
			boucle1 = 0;
			boucle2 = 0;
			for (int index4 = 0; index4 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index4++) {
				for (int index5 = 0; index5 < (int) ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie); index5++) {
					Axe1 = (((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) * (-1) + boucle1;
					Axe1bis = (((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1) / 2) * (-1) + boucle2;
					Axe2 = boucle2 - 1;
					Axe3 = (entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie / 2;
					if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.DOWN) {
						X = x + Axe1;
						Y = y + Axe3;
						Z = z + Axe1bis;
					}
					if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.UP) {
						X = x + Axe1;
						Y = y - Axe3;
						Z = z + Axe1bis;
					}
					if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.NORTH) {
						X = x + Axe1;
						Y = y + Axe2;
						Z = z + Axe3;
					}
					if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.SOUTH) {
						X = x + Axe1;
						Y = y + Axe2;
						Z = z - Axe3;
					}
					if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.WEST) {
						X = x + Axe3;
						Y = y + Axe2;
						Z = z + Axe1;
					}
					if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.EAST) {
						X = x - Axe3;
						Y = y + Axe2;
						Z = z + Axe1;
					}
					RemplaceLiquideProcedure.execute(world, X, Y, Z);
					boucle1 = boucle1 + 1;
				}
				boucle1 = 0;
				boucle2 = boucle2 + 1;
			}
		}
	}
}
