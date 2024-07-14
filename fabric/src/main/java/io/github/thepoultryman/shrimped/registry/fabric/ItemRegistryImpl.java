package io.github.thepoultryman.shrimped.registry.fabric;

import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ItemRegistryImpl {
    public static <T extends Item> void register(String id, Supplier<T> itemSupplier) {
    }
}
