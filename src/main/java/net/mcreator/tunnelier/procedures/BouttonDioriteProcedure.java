package net.mcreator.tunnelier.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.tunnelier.network.TunnelierModVariables;

public class BouttonDioriteProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).diorite == true) {
			{
				boolean _setval = false;
				entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.diorite = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = true;
				entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.diorite = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
