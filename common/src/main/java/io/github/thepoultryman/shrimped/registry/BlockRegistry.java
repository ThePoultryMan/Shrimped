package io.github.thepoultryman.shrimped.registry;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class BlockRegistry {
    public static void registerBlocks() {
        register("tank", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)));
    }

    @ExpectPlatform
    private static void register(String id, Supplier<Block> blockSupplier) {
        throw new RuntimeException("This should never happen. Please report this.");
    }
}