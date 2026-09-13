package com.example.mindazmod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import java.util.Random;

public class CloudBlock extends Block {
    public CloudBlock() {
        super(AbstractBlock.Settings.of(Material.WOOL)
                .strength(0.3f)
                .sounds(BlockSoundGroup.WOOL)
                .nonOpaque());
    }

    @Override
    public void onBlockAdded(BlockState state, net.minecraft.world.World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (!world.isClient) {
            world.getBlockTickScheduler().schedule(pos, this, 200);
        }
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!world.isClient) {
            world.removeBlock(pos, false);
        }
    }
}
