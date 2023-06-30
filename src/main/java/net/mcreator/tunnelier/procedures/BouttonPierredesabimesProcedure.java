package net.mcreator.tunnelier.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.tunnelier.network.TunnelierModVariables;

public class BouttonPierredesabimesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).pierredesabimes == true) {
			{
				boolean _setval = false;
				entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pierredesabimes = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = true;
				entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pierredesabimes = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
