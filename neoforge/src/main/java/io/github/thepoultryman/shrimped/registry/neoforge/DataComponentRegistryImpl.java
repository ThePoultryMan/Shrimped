package io.github.thepoultryman.shrimped.registry.neoforge;

import io.github.thepoultryman.shrimped.Shrimped;
import net.minecraft.core.component.DataComponentType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DataComponentRegistryImpl {
    public static final DeferredRegister.DataComponents DATA_COMPONENTS_REGISTRY = DeferredRegister.createDataComponents(Shrimped.MOD_ID);

    public static <T> Supplier<DataComponentType<T>> register(String name, Supplier<DataComponentType<T>> builderSupplier) {
        DeferredHolder<DataComponentType<?>, DataComponentType<T>> DEFERRED_HOLDER = DATA_COMPONENTS_REGISTRY
                .register(
                        name,
                        builderSupplier
                );
        return DEFERRED_HOLDER;
    }
}
