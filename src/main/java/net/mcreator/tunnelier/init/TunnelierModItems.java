
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tunnelier.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.tunnelier.item.TunnelierItem;
import net.mcreator.tunnelier.item.PommeenCuivreItem;
import net.mcreator.tunnelier.item.ChairDeZombieEnCuivreItem;
import net.mcreator.tunnelier.TunnelierMod;

public class TunnelierModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TunnelierMod.MODID);
	public static final RegistryObject<Item> POMMEEN_CUIVRE = REGISTRY.register("pommeen_cuivre", () -> new PommeenCuivreItem());
	public static final RegistryObject<Item> TUNNELIER = REGISTRY.register("tunnelier", () -> new TunnelierItem());
	public static final RegistryObject<Item> CHAIR_DE_ZOMBIE_EN_CUIVRE = REGISTRY.register("chair_de_zombie_en_cuivre", () -> new ChairDeZombieEnCuivreItem());
}
