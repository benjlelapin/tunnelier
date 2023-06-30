package net.mcreator.tunnelier.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.tunnelier.network.TunnelierModVariables;

public class DioriteTexteProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Diorite : " + (entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).diorite;
	}
}
