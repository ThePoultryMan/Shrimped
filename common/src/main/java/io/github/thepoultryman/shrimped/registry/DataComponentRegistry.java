package io.github.thepoultryman.shrimped.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.thepoultryman.shrimped.Shrimped;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.util.ExtraCodecs;

import java.util.function.Supplier;

public class DataComponentRegistry {
    public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENT_REGISTER = DeferredRegister.create(Shrimped.MOD_ID, Registries.DATA_COMPONENT_TYPE);

    public static final RegistrySupplier<DataComponentType<Integer>> SHRIMP_BIN_COUNT_COMPONENT = register(
            "shrimp_bin_count",
            () -> DataComponentType.<Integer>builder()
                    .persistent(ExtraCodecs.intRange(0, 5))
                    .networkSynchronized(ByteBufCodecs.VAR_INT)
                    .build()
    );

    public static void registerDataComponents() {
        DATA_COMPONENT_REGISTER.register();
    }

    public static <T> RegistrySupplier<DataComponentType<T>> register(String name, Supplier<DataComponentType<T>> builderSupplier) {
        return DATA_COMPONENT_REGISTER.register(name, builderSupplier);
    }
}
