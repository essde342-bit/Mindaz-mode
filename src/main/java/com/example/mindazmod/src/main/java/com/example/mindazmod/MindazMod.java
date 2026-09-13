package com.example.mindazmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MindazMod implements ModInitializer {
    public static final String MOD_ID = "mindazmod";

    // Создаем блок облака
    public static final Block CLOUD_BLOCK = new Block(AbstractBlock.Settings.create().strength(0.3f).nonOpaque());
    
    // Создаем предмет
    public static final Item MINDAZ_SWORD = new Item(new Item.Settings().maxCount(1)); 

    @Override
    public void onInitialize() {
        Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, "cloud"), CLOUD_BLOCK);
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "cloud"), new BlockItem(CLOUD_BLOCK, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "mindaz"), MINDAZ_SWORD);
    }
}
