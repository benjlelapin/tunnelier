package net.mcreator.tunnelier.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.tunnelier.world.inventory.BlocsRecuperesMenu;
import net.mcreator.tunnelier.procedures.TerreTexteProcedure;
import net.mcreator.tunnelier.procedures.RocheTexteProcedure;
import net.mcreator.tunnelier.procedures.PierredesabimesTexteProcedure;
import net.mcreator.tunnelier.procedures.PierreTexteProcedure;
import net.mcreator.tunnelier.procedures.GraniteTexteProcedure;
import net.mcreator.tunnelier.procedures.DioriteTexteProcedure;
import net.mcreator.tunnelier.procedures.AndesiteTexteProcedure;
import net.mcreator.tunnelier.network.BlocsRecuperesButtonMessage;
import net.mcreator.tunnelier.TunnelierMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BlocsRecuperesScreen extends AbstractContainerScreen<BlocsRecuperesMenu> {
	private final static HashMap<String, Object> guistate = BlocsRecuperesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_terre;
	Button button_roche;
	Button button_pierre;
	Button button_andesite;
	Button button_granite;
	Button button_diorite;
	Button button_pierre_des_abimes;

	public BlocsRecuperesScreen(BlocsRecuperesMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 280;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("tunnelier:textures/screens/blocs_recuperes.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack,

				TerreTexteProcedure.execute(entity), 8, 10, -12829636);
		this.font.draw(poseStack,

				RocheTexteProcedure.execute(entity), 104, 11, -12829636);
		this.font.draw(poseStack,

				PierreTexteProcedure.execute(entity), 193, 11, -12829636);
		this.font.draw(poseStack,

				AndesiteTexteProcedure.execute(entity), 27, 56, -12829636);
		this.font.draw(poseStack,

				GraniteTexteProcedure.execute(entity), 156, 57, -12829636);
		this.font.draw(poseStack,

				DioriteTexteProcedure.execute(entity), 25, 102, -12829636);
		this.font.draw(poseStack,

				PierredesabimesTexteProcedure.execute(entity), 126, 103, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_terre = new Button(this.leftPos + 18, this.topPos + 24, 51, 20, Component.translatable("gui.tunnelier.blocs_recuperes.button_terre"), e -> {
			if (true) {
				TunnelierMod.PACKET_HANDLER.sendToServer(new BlocsRecuperesButtonMessage(0, x, y, z));
				BlocsRecuperesButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_terre", button_terre);
		this.addRenderableWidget(button_terre);
		button_roche = new Button(this.leftPos + 111, this.topPos + 24, 51, 20, Component.translatable("gui.tunnelier.blocs_recuperes.button_roche"), e -> {
			if (true) {
				TunnelierMod.PACKET_HANDLER.sendToServer(new BlocsRecuperesButtonMessage(1, x, y, z));
				BlocsRecuperesButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_roche", button_roche);
		this.addRenderableWidget(button_roche);
		button_pierre = new Button(this.leftPos + 204, this.topPos + 24, 56, 20, Component.translatable("gui.tunnelier.blocs_recuperes.button_pierre"), e -> {
			if (true) {
				TunnelierMod.PACKET_HANDLER.sendToServer(new BlocsRecuperesButtonMessage(2, x, y, z));
				BlocsRecuperesButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_pierre", button_pierre);
		this.addRenderableWidget(button_pierre);
		button_andesite = new Button(this.leftPos + 35, this.topPos + 70, 67, 20, Component.translatable("gui.tunnelier.blocs_recuperes.button_andesite"), e -> {
			if (true) {
				TunnelierMod.PACKET_HANDLER.sendToServer(new BlocsRecuperesButtonMessage(3, x, y, z));
				BlocsRecuperesButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_andesite", button_andesite);
		this.addRenderableWidget(button_andesite);
		button_granite = new Button(this.leftPos + 169, this.topPos + 70, 61, 20, Component.translatable("gui.tunnelier.blocs_recuperes.button_granite"), e -> {
			if (true) {
				TunnelierMod.PACKET_HANDLER.sendToServer(new BlocsRecuperesButtonMessage(4, x, y, z));
				BlocsRecuperesButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_granite", button_granite);
		this.addRenderableWidget(button_granite);
		button_diorite = new Button(this.leftPos + 35, this.topPos + 116, 61, 20, Component.translatable("gui.tunnelier.blocs_recuperes.button_diorite"), e -> {
			if (true) {
				TunnelierMod.PACKET_HANDLER.sendToServer(new BlocsRecuperesButtonMessage(5, x, y, z));
				BlocsRecuperesButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:button_diorite", button_diorite);
		this.addRenderableWidget(button_diorite);
		button_pierre_des_abimes = new Button(this.leftPos + 135, this.topPos + 117, 113, 20, Component.translatable("gui.tunnelier.blocs_recuperes.button_pierre_des_abimes"), e -> {
			if (true) {
				TunnelierMod.PACKET_HANDLER.sendToServer(new BlocsRecuperesButtonMessage(6, x, y, z));
				BlocsRecuperesButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:button_pierre_des_abimes", button_pierre_des_abimes);
		this.addRenderableWidget(button_pierre_des_abimes);
	}
}
