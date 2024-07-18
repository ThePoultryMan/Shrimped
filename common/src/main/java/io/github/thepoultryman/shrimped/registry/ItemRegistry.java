package io.github.thepoultryman.shrimped.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.thepoultryman.shrimped.Shrimped;
import io.github.thepoultryman.shrimped.items.ShrimpBin;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(Shrimped.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<ShrimpBin> SHRIMP_BIN = ITEM_REGISTRY.register("shrimp_bin", ShrimpBin::new);

    public static void registerItems() {
        ITEM_REGISTRY.register();
    }
}
