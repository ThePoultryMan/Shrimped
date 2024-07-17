package io.github.thepoultryman.shrimped;

import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import io.github.thepoultryman.shrimped.client.entity.ShrimpModel;
import io.github.thepoultryman.shrimped.client.entity.ShrimpRenderer;
import io.github.thepoultryman.shrimped.registry.EntityRegistry;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ShrimpedClient {
    public static final ModelLayerLocation SHRIMP_MODEL_LAYER = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(Shrimped.MOD_ID, "shrimp"), "main");

    public static void init() {
        EntityRendererRegistry.register(EntityRegistry.SHRIMP_ENTITY_TYPE, ShrimpRenderer::new);
        EntityModelLayerRegistry.register(SHRIMP_MODEL_LAYER, ShrimpModel::createBodyLayer);
    }
}
