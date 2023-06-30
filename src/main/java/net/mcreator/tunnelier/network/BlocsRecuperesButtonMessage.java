
package net.mcreator.tunnelier.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.tunnelier.world.inventory.BlocsRecuperesMenu;
import net.mcreator.tunnelier.procedures.BouttonTerreProcedure;
import net.mcreator.tunnelier.procedures.BouttonRocheProcedure;
import net.mcreator.tunnelier.procedures.BouttonPierredesabimesProcedure;
import net.mcreator.tunnelier.procedures.BouttonPierreProcedure;
import net.mcreator.tunnelier.procedures.BouttonGraniteProcedure;
import net.mcreator.tunnelier.procedures.BouttonDioriteProcedure;
import net.mcreator.tunnelier.procedures.BouttonAndesiteProcedure;
import net.mcreator.tunnelier.TunnelierMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlocsRecuperesButtonMessage {
	private final int buttonID, x, y, z;

	public BlocsRecuperesButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BlocsRecuperesButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BlocsRecuperesButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BlocsRecuperesButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = BlocsRecuperesMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			BouttonTerreProcedure.execute(entity);
		}
		if (buttonID == 1) {

			BouttonRocheProcedure.execute(entity);
		}
		if (buttonID == 2) {

			BouttonPierreProcedure.execute(entity);
		}
		if (buttonID == 3) {

			BouttonAndesiteProcedure.execute(entity);
		}
		if (buttonID == 4) {

			BouttonGraniteProcedure.execute(entity);
		}
		if (buttonID == 5) {

			BouttonDioriteProcedure.execute(entity);
		}
		if (buttonID == 6) {

			BouttonPierredesabimesProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TunnelierMod.addNetworkMessage(BlocsRecuperesButtonMessage.class, BlocsRecuperesButtonMessage::buffer, BlocsRecuperesButtonMessage::new, BlocsRecuperesButtonMessage::handler);
	}
}
