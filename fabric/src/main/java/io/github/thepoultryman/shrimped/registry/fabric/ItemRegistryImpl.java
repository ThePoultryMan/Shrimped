package io.github.thepoultryman.shrimped.registry.fabric;

import io.github.thepoultryman.shrimped.Shrimped;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ItemRegistryImpl {
    public static <T extends Item> void register(String id, Supplier<T> itemSupplier) {
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Shrimped.MOD_ID, id), itemSupplier.get());
    }
}
