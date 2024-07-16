package io.github.thepoultryman.shrimped.neoforge;

import io.github.thepoultryman.shrimped.Shrimped;
import io.github.thepoultryman.shrimped.registry.neoforge.EntityRegistryImpl;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Shrimped.MOD_ID)
public class ShrimpedNeoForge {
    public ShrimpedNeoForge(IEventBus eventBus) {
        EntityRegistryImpl.ENTITY_TYPE_REGISTRY.register(eventBus);

        Shrimped.init();
    }
}