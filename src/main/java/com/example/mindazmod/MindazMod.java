package com.example.mindazmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MindazMod implements ModInitializer {
    public static final String MOD_ID = "mindazmod";

    public static final Block CLOUD_BLOCK = new CloudBlock();
    public static final Item MINDAZ_SWORD = new MindazSwordItem(new Item.Settings().group(ItemGroup.COMBAT));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cloud"), CLOUD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cloud"), new BlockItem(CLOUD_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mindaz"), MINDAZ_SWORD);
    }
}
