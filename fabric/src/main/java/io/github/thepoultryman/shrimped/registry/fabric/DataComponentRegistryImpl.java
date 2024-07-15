package io.github.thepoultryman.shrimped.registry.fabric;

import net.minecraft.core.component.DataComponentType;

import java.util.function.Supplier;

public class DataComponentRegistryImpl {
    public static Supplier<DataComponentType<?>> register(String name) {
        throw new RuntimeException("This should not happen. Please report this.");
    }
}
