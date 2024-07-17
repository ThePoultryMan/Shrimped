package io.github.thepoultryman.shrimped.neoforge;

import io.github.thepoultryman.shrimped.Shrimped;
import io.github.thepoultryman.shrimped.ShrimpedClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Shrimped.MOD_ID)
public class ShrimpedNeoForge {
    public ShrimpedNeoForge(IEventBus eventBus, Dist dist) {
        Shrimped.init();

        if (dist.isClient()) {
            ShrimpedClient.init();
        }
    }
}