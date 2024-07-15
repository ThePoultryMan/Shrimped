package io.github.thepoultryman.shrimped.registry.fabric;

import net.minecraft.core.component.DataComponentType;

import java.util.function.Supplier;

public class DataComponentRegistryImpl {
    public static <T> Supplier<DataComponentType<T>> register(String name, Supplier<DataComponentType<T>> builderSupplier) {
        throw new RuntimeException("This should not happen. Please report this.");
    }
}
