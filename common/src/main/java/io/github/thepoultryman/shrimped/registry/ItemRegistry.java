package io.github.thepoultryman.shrimped.registry;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ItemRegistry {
    public static void registerItems() {}

    @ExpectPlatform
    public static void register(String id, Supplier<Item> itemSupplier) {
        throw new RuntimeException("This should never happen. Please report this.");
    }
}