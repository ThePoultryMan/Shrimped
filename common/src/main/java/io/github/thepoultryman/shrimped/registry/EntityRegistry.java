package io.github.thepoultryman.shrimped.registry;

import dev.architectury.injectables.annotations.ExpectPlatform;
import io.github.thepoultryman.shrimped.entities.Shrimp;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import java.util.function.Supplier;

public class EntityRegistry {
    public static final Supplier<EntityType<Shrimp>> SHRIMP_ENTITY_TYPE = register(
            "shrimp",
            EntityType.Builder.of(Shrimp::new, MobCategory.WATER_CREATURE));

    public static void registerEntities() {}

    @ExpectPlatform
    public static <T extends Entity> Supplier<EntityType<T>> register(String id, EntityType.Builder<T> builder) {
        throw new RuntimeException("This should not happen. Please report this.");
    }
}
