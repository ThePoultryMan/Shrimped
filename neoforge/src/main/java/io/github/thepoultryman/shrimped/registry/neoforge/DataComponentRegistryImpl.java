package io.github.thepoultryman.shrimped.registry.neoforge;

import io.github.thepoultryman.shrimped.Shrimped;
import io.github.thepoultryman.shrimped.registry.DataComponentRegistry;
import net.minecraft.core.component.DataComponentType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DataComponentRegistryImpl {
    public static final DeferredRegister.DataComponents DATA_COMPONENTS_REGISTRY = DeferredRegister.createDataComponents(Shrimped.MOD_ID);

    public static Supplier<DataComponentType<?>> register(String name) {
        DeferredHolder<DataComponentType<?>, DataComponentType<DataComponentRegistry.ShrimpBinCount>> DEFERRED_HOLDER = DATA_COMPONENTS_REGISTRY
                .register(
                        name,
                        () -> DataComponentType.<DataComponentRegistry.ShrimpBinCount>builder()
                                .persistent(DataComponentRegistry.SHRIMP_BIN_COUNT_CODEC)
                                .networkSynchronized(DataComponentRegistry.SHRIMP_BIN_COUNT_STREAM_CODEC)
                                .build()
                );
        return DEFERRED_HOLDER::get;
    }
}
