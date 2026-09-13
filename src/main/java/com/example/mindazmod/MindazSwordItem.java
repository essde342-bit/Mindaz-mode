package com.example.mindazmod;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;

public class MindazSwordItem extends SwordItem {
    public MindazSwordItem(Settings settings) {
        super(ToolMaterials.NETHERITE, 3, -2.4f, settings);
    }
}
