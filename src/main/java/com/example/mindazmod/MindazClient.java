package com.example.mindazmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;

public class MindazClient implements ClientModInitializer {
    private boolean wasAttacking = false;

    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player == null) return;

            boolean isAttacking = client.options.keyAttack.isPressed();
            if (isAttacking && !wasAttacking) {
                if (client.player.getMainHandStack().getItem() == MindazMod.MINDAZ_SWORD) {
                    ClientPlayNetworking.send(MindazMod.SPAWN_CLOUD_PACKET, PacketByteBufs.create());
                }
            }
            wasAttacking = isAttacking;
        });
    }
}
