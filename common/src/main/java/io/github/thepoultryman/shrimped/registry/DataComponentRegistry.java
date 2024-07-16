package io.github.thepoultryman.shrimped.registry;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.thepoultryman.shrimped.Shrimped;
import io.netty.buffer.ByteBuf;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;

import java.util.function.Supplier;

public class DataComponentRegistry {
    public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENT_REGISTER = DeferredRegister.create(Shrimped.MOD_ID, Registries.DATA_COMPONENT_TYPE);

    public static final Codec<ShrimpBinCount> SHRIMP_BIN_COUNT_CODEC = RecordCodecBuilder.create(instance ->
        instance.group(
                Codec.INT.fieldOf("count").forGetter(ShrimpBinCount::count)
        ).apply(instance, ShrimpBinCount::new)
    );
    public static final StreamCodec<ByteBuf, ShrimpBinCount> SHRIMP_BIN_COUNT_STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.INT, ShrimpBinCount::count,
            ShrimpBinCount::new
    );
    public static final RegistrySupplier<DataComponentType<ShrimpBinCount>> SHRIMP_BIN_COUNT_COMPONENT = register(
            "shrimp_bin_count",
            () -> DataComponentType.<DataComponentRegistry.ShrimpBinCount>builder()
            .persistent(DataComponentRegistry.SHRIMP_BIN_COUNT_CODEC)
            .networkSynchronized(DataComponentRegistry.SHRIMP_BIN_COUNT_STREAM_CODEC)
            .build());

    public static void registerDataComponents() {
        DATA_COMPONENT_REGISTER.register();
    }

    public static <T> RegistrySupplier<DataComponentType<T>> register(String name, Supplier<DataComponentType<T>> builderSupplier) {
        return DATA_COMPONENT_REGISTER.register(name, builderSupplier);
    }

    public record ShrimpBinCount(int count) {}
}
