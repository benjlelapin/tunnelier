
package net.mcreator.tunnelier.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.tunnelier.procedures.ChairDeZombieEnCuivreLeJoueurTermineDutiliserLitemProcedure;

import java.util.List;

public class ChairDeZombieEnCuivreItem extends Item {
	public ChairDeZombieEnCuivreItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.3f).alwaysEat().meat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("baisse l'\u00E9nergie"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ChairDeZombieEnCuivreLeJoueurTermineDutiliserLitemProcedure.execute(entity);
		return retval;
	}
}
