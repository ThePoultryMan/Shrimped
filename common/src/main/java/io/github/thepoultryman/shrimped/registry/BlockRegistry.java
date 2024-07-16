package io.github.thepoultryman.shrimped.registry;

import dev.architectury.registry.registries.DeferredRegister;
import io.github.thepoultryman.shrimped.Shrimped;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCK_REGISTER = DeferredRegister.create(Shrimped.MOD_ID, Registries.BLOCK);

    public static void registerBlocks() {
        register("tank", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)), new Item.Properties());
    }

    private static void register(String id, Supplier<Block> blockSupplier, Item.Properties itemProperties) {
        Supplier<? extends Block> block = BLOCK_REGISTER.register(id, blockSupplier);
        ItemRegistry.ITEM_REGISTRY.register(id, () -> new BlockItem(block.get(), itemProperties));
    }
}
