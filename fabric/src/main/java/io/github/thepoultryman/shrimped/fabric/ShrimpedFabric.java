package io.github.thepoultryman.shrimped.fabric;

import io.github.thepoultryman.shrimped.Shrimped;
import net.fabricmc.api.ModInitializer;

public class ShrimpedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Shrimped.init();
    }
}