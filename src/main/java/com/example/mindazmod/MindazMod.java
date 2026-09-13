package com.example.mindazmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MindazMod implements ModInitializer {
    public static final String MOD_ID = "mindazmod";

    public static final Block CLOUD_BLOCK = new CloudBlock();
    public static final Item MINDAZ_SWORD = new MindazSwordItem(new FabricItemSettings());

    @Override
    public void onInitialize() {
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "cloud"), CLOUD_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cloud"), new BlockItem(CLOUD_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "mindaz"), MINDAZ_SWORD);
    }
}
