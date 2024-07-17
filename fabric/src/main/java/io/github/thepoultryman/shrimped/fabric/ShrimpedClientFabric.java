package io.github.thepoultryman.shrimped.fabric;

import io.github.thepoultryman.shrimped.ShrimpedClient;
import net.fabricmc.api.ClientModInitializer;

public class ShrimpedClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ShrimpedClient.init();
    }
}
