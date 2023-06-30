package net.mcreator.tunnelier.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.tunnelier.network.TunnelierModVariables;

public class RocheTexteProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Roche : " + (entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).roche;
	}
}
