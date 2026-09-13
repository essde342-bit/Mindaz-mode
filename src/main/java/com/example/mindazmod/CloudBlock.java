package com.example.mindazmod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class CloudBlock extends Block {
    public CloudBlock() {
        super(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).strength(0.3f).nonOpaque());
    }
}
