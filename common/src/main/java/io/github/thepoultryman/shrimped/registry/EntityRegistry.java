package io.github.thepoultryman.shrimped.registry;

import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.thepoultryman.shrimped.Shrimped;
import io.github.thepoultryman.shrimped.entities.Shrimp;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

import java.util.function.Supplier;

public class EntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE_REGISTER = DeferredRegister.create(Shrimped.MOD_ID, Registries.ENTITY_TYPE);

    public static final RegistrySupplier<EntityType<Shrimp>> SHRIMP_ENTITY_TYPE = register(
            "shrimp",
            EntityType.Builder.of(Shrimp::new, MobCategory.WATER_CREATURE).eyeHeight(0.09375f),
            Shrimp::getShrimpAttributes);

    public static void registerEntities() {
        ENTITY_TYPE_REGISTER.register();
        EntityAttributeRegistry.register(SHRIMP_ENTITY_TYPE, Shrimp::getShrimpAttributes);
    }

    public static <T extends LivingEntity> RegistrySupplier<EntityType<T>> register(String id, EntityType.Builder<T> builder, Supplier<AttributeSupplier.Builder> attributeBuilder) {
        return ENTITY_TYPE_REGISTER.register(id, () -> builder.build(id));
    }
}
