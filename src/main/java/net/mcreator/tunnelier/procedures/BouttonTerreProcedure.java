package net.mcreator.tunnelier.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.tunnelier.network.TunnelierModVariables;

public class BouttonTerreProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).terre == true) {
			{
				boolean _setval = false;
				entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.terre = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = true;
				entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.terre = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
