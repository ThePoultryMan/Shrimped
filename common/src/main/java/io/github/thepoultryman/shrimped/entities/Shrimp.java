package io.github.thepoultryman.shrimped.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.level.Level;

public class Shrimp extends PathfinderMob {
    public Shrimp(EntityType<? extends PathfinderMob> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder getShrimpAttributes() {
        return AttributeSupplier.builder();
    }
}
