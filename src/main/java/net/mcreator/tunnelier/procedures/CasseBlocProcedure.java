package net.mcreator.tunnelier.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.tunnelier.network.TunnelierModVariables;

public class CasseBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock())));
				entityToSpawn.setPickUpDelay(0);
				_level.addFreshEntity(entityToSpawn);
			}
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DIRT) {
				if ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).terre == true) {
					{
						BlockPos _pos = new BlockPos(x, y, z);
						Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
				} else {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			} else {
				if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.STONE) {
					if ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).roche == true) {
						{
							BlockPos _pos = new BlockPos(x, y, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					} else {
						world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					}
				} else {
					if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COBBLESTONE) {
						if ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).pierre == true) {
							{
								BlockPos _pos = new BlockPos(x, y, z);
								Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
								world.destroyBlock(_pos, false);
							}
						} else {
							world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					} else {
						if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DIORITE) {
							if ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).diorite == true) {
								{
									BlockPos _pos = new BlockPos(x, y, z);
									Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
									world.destroyBlock(_pos, false);
								}
							} else {
								world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							}
						} else {
							if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GRANITE) {
								if ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).granite == true) {
									{
										BlockPos _pos = new BlockPos(x, y, z);
										Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
										world.destroyBlock(_pos, false);
									}
								} else {
									world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								}
							} else {
								if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.ANDESITE) {
									if ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).andesite == true) {
										{
											BlockPos _pos = new BlockPos(x, y, z);
											Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
											world.destroyBlock(_pos, false);
										}
									} else {
										world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
									}
								} else {
									if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE) {
										if ((entity.getCapability(TunnelierModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TunnelierModVariables.PlayerVariables())).pierredesabimes == true) {
											{
												BlockPos _pos = new BlockPos(x, y, z);
												Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
												world.destroyBlock(_pos, false);
											}
										} else {
											world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
										}
									} else {
										{
											BlockPos _pos = new BlockPos(x, y, z);
											Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
											world.destroyBlock(_pos, false);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
