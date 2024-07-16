package io.github.thepoultryman.shrimped.neoforge;

import dev.architectury.platform.hooks.EventBusesHooks;
import io.github.thepoultryman.shrimped.Shrimped;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Shrimped.MOD_ID)
public class ShrimpedNeoForge {
    public ShrimpedNeoForge(IEventBus eventBus) {
        EventBusesHooks.whenAvailable(Shrimped.MOD_ID, bus ->
                Shrimped.init());
    }
}