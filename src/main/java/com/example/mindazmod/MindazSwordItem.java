package com.example.mindazmod;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MindazSwordItem extends SwordItem {
    public MindazSwordItem(Settings settings) {
        super(ToolMaterials.NETHERITE, 3, -2.4f, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && !stack.hasGlint()) {
            stack.addEnchantment(Enchantments.SHARPNESS, 7);
            stack.addEnchantment(Enchantments.FIRE_ASPECT, 2);
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    public static void spawnCloudPlatform(World world, PlayerEntity player) {
        if (world.isClient) return;

        BlockPos centerPos = player.getBlockPos().down();
        for (int x = -1; x <= 1; x++) {
            for (int z = -1; z <= 1; z++) {
                BlockPos targetPos = centerPos.add(x, 0, z);
                if (world.getBlockState(targetPos).isAir() || world.getBlockState(targetPos).getMaterial().isReplaceable()) {
                    world.setBlockState(targetPos, MindazMod.CLOUD_BLOCK.getDefaultState());
                }
            }
        }
    }
}
