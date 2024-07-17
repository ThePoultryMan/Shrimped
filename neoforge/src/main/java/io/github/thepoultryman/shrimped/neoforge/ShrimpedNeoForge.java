package io.github.thepoultryman.shrimped.neoforge;

import io.github.thepoultryman.shrimped.Shrimped;
import io.github.thepoultryman.shrimped.ShrimpedClient;
import io.github.thepoultryman.shrimped.client.entity.ShrimpModel;
import io.github.thepoultryman.shrimped.client.entity.ShrimpRenderer;
import io.github.thepoultryman.shrimped.registry.EntityRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@Mod(Shrimped.MOD_ID)
public class ShrimpedNeoForge {
    public ShrimpedNeoForge(IEventBus eventBus, Dist dist) {
        Shrimped.init();

        if (dist.isClient()) {
            eventBus.addListener(ShrimpedNeoForge::registerEntityRenderers);
            eventBus.addListener(ShrimpedNeoForge::registerLayerDefinitions);
        }
    }

    private static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityRegistry.SHRIMP_ENTITY_TYPE.get(), ShrimpRenderer::new);
    }

    private static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ShrimpedClient.SHRIMP_MODEL_LAYER, ShrimpModel::createBodyLayer);
    }
}