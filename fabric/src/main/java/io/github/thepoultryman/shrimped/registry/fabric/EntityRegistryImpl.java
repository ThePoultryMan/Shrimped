package io.github.thepoultryman.shrimped.registry.fabric;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

import java.util.function.Supplier;

public class EntityRegistryImpl {
    public static <T extends Entity> Supplier<EntityType<T>> register(String id, EntityType.Builder<T> builder) {
        throw new RuntimeException("This should not happen. Please report this.");
    }
}
