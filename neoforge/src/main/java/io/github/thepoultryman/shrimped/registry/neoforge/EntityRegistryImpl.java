package io.github.thepoultryman.shrimped.registry.neoforge;

import io.github.thepoultryman.shrimped.Shrimped;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EntityRegistryImpl {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE_REGISTRY = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, Shrimped.MOD_ID);

    public static <T extends Entity> Supplier<EntityType<T>> register(String id, EntityType.Builder<T> builder) {
        return ENTITY_TYPE_REGISTRY.register(id, () -> builder.build(id));
    }
}
