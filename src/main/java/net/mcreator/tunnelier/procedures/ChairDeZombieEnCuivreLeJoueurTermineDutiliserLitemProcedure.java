package net.mcreator.tunnelier.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.tunnelier.network.TunnelierModVariables;

public class ChairDeZombieEnCuivreLeJoueurTermineDutiliserLitemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie - 1;
			entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.energie = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal(((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).energie + " energie")), (false));
	}
}
