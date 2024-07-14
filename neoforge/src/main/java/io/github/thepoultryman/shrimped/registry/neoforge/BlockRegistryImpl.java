package io.github.thepoultryman.shrimped.registry.neoforge;

import io.github.thepoultryman.shrimped.Shrimped;
import io.github.thepoultryman.shrimped.registry.ItemRegistry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlockRegistryImpl {
    public static final DeferredRegister<Block> BLOCK_REGISTRY = DeferredRegister.createBlocks(Shrimped.MOD_ID);

    public static void register(String id, Supplier<Block> blockSupplier, Item.Properties itemProperties) {
        DeferredHolder<Block, ? extends Block> blockHolder = BLOCK_REGISTRY.register(id, blockSupplier);
        ItemRegistry.register(id, () -> new BlockItem(blockHolder.get(), itemProperties));
    }
}
