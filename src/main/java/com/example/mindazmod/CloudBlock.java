package com.example.mindazmod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class CloudBlock extends Block {
    public CloudBlock() {
        super(AbstractBlock.Settings.of(Material.WOOL).strength(0.3f).nonOpaque());
    }
}
