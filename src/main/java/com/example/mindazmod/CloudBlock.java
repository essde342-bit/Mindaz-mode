package com.example.mindazmod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class CloudBlock extends Block {
    public CloudBlock() {
        super(FabricBlockSettings.of(Material.WOOL).strength(0.3f).nonOpaque());
    }
}
