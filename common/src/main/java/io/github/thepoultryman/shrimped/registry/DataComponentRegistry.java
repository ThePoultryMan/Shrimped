package io.github.thepoultryman.shrimped.registry;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import dev.architectury.injectables.annotations.ExpectPlatform;
import io.netty.buffer.ByteBuf;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;

import java.util.function.Supplier;

public class DataComponentRegistry {
    public static final Codec<ShrimpBinCount> SHRIMP_BIN_COUNT_CODEC = RecordCodecBuilder.create(instance ->
        instance.group(
                Codec.INT.fieldOf("count").forGetter(ShrimpBinCount::count)
        ).apply(instance, ShrimpBinCount::new)
    );
    public static final StreamCodec<ByteBuf, ShrimpBinCount> SHRIMP_BIN_COUNT_STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.INT, ShrimpBinCount::count,
            ShrimpBinCount::new
    );
    public static final Supplier<DataComponentType<ShrimpBinCount>> SHRIMP_BIN_COUNT_COMPONENT = register(
            "shrimp_bin_count",
            () -> DataComponentType.<DataComponentRegistry.ShrimpBinCount>builder()
            .persistent(DataComponentRegistry.SHRIMP_BIN_COUNT_CODEC)
            .networkSynchronized(DataComponentRegistry.SHRIMP_BIN_COUNT_STREAM_CODEC)
            .build());

    public static void registerDataComponents() {}

    @ExpectPlatform
    public static <T> Supplier<DataComponentType<T>> register(String name, Supplier<DataComponentType<T>> builderSupplier) {
        throw new RuntimeException("This should not happen. Please report this.");
    }

    public record ShrimpBinCount(int count) {}
}
