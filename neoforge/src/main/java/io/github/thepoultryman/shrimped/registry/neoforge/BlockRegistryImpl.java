package io.github.thepoultryman.shrimped.registry.neoforge;

import io.github.thepoultryman.shrimped.Shrimped;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlockRegistryImpl {
    public static final DeferredRegister<Block> BLOCK_REGISTRY = DeferredRegister.createBlocks(Shrimped.MOD_ID);

    private static void register(String id, Supplier<Block> blockSupplier) {
        BLOCK_REGISTRY.register(id, blockSupplier);
    }
}
