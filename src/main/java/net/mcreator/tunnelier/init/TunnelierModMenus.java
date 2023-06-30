
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tunnelier.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.tunnelier.world.inventory.BlocsRecuperesMenu;
import net.mcreator.tunnelier.TunnelierMod;

public class TunnelierModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TunnelierMod.MODID);
	public static final RegistryObject<MenuType<BlocsRecuperesMenu>> BLOCS_RECUPERES = REGISTRY.register("blocs_recuperes", () -> IForgeMenuType.create(BlocsRecuperesMenu::new));
}
