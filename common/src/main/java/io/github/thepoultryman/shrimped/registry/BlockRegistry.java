package io.github.thepoultryman.shrimped.registry;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class BlockRegistry {
    public static void registerBlocks() {
    }

    @ExpectPlatform
    private static void register(String id, Supplier<Block> blockSupplier) {
        throw new RuntimeException("This should never happen. Please report this.");
    }
}
