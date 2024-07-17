package io.github.thepoultryman.shrimped.client.entity;

import io.github.thepoultryman.shrimped.Shrimped;
import io.github.thepoultryman.shrimped.ShrimpedClient;
import io.github.thepoultryman.shrimped.entities.Shrimp;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class ShrimpRenderer extends MobRenderer<Shrimp, ShrimpModel> {
    public ShrimpRenderer(EntityRendererProvider.Context context) {
        super(context, new ShrimpModel(context.bakeLayer(ShrimpedClient.SHRIMP_MODEL_LAYER)), 0.3f);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Shrimp entity) {
        return ResourceLocation.fromNamespaceAndPath(Shrimped.MOD_ID, "textures/entity/shrimp/pink_shrimp.png");
    }
}

