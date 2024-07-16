package io.github.thepoultryman.shrimped.registry;

import dev.architectury.registry.registries.DeferredRegister;
import io.github.thepoultryman.shrimped.Shrimped;
import io.github.thepoultryman.shrimped.entities.Shrimp;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import java.util.function.Supplier;

public class EntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE_REGISTER = DeferredRegister.create(Shrimped.MOD_ID, Registries.ENTITY_TYPE);

    public static final Supplier<EntityType<Shrimp>> SHRIMP_ENTITY_TYPE = register(
            "shrimp",
            EntityType.Builder.of(Shrimp::new, MobCategory.WATER_CREATURE));

    public static void registerEntities() {
        ENTITY_TYPE_REGISTER.register();
    }

    public static <T extends Entity> Supplier<EntityType<T>> register(String id, EntityType.Builder<T> builder) {
        return ENTITY_TYPE_REGISTER.register(id, () -> builder.build(id));
    }
}
