package io.github.thepoultryman.shrimped.registry.neoforge;

import io.github.thepoultryman.shrimped.Shrimped;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ItemRegistryImpl {
    public static final DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.createItems(Shrimped.MOD_ID);

    public static void register(String id, Supplier<Item> itemSupplier) {
        ITEM_REGISTRY.register(id, itemSupplier);
    }
}
