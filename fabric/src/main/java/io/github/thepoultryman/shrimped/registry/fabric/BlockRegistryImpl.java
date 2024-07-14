package io.github.thepoultryman.shrimped.registry.fabric;

import io.github.thepoultryman.shrimped.Shrimped;
import io.github.thepoultryman.shrimped.registry.ItemRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class BlockRegistryImpl {
    public static void register(String id, Supplier<Block> blockSupplier, Item.Properties itemProperties) {
        Block block = Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(Shrimped.MOD_ID, id), blockSupplier.get());
        ItemRegistry.register(id, () -> new BlockItem(block, itemProperties));
    }
}
