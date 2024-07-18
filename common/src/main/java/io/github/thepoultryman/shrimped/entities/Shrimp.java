package io.github.thepoultryman.shrimped.entities;

import io.github.thepoultryman.shrimped.registry.DataComponentRegistry;
import io.github.thepoultryman.shrimped.registry.ItemRegistry;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.AbstractSchoolingFish;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Shrimp extends AbstractSchoolingFish {

    public Shrimp(EntityType<? extends AbstractSchoolingFish> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder getShrimpAttributes() {
        return WaterAnimal.createMobAttributes().add(Attributes.MAX_HEALTH, 5);
    }

    @Override
    protected @NotNull InteractionResult mobInteract(Player player, InteractionHand interactionHand) {
        ItemStack itemInHand = player.getItemInHand(interactionHand);
        if (itemInHand.is(ItemRegistry.SHRIMP_BIN.get())) {
            if (!this.level().isClientSide()) {
                Integer countComponent = itemInHand.getComponents().get(DataComponentRegistry.SHRIMP_BIN_COUNT_COMPONENT.get());
                if (countComponent != null && countComponent <= 5) {
                    itemInHand.set(DataComponentRegistry.SHRIMP_BIN_COUNT_COMPONENT.get(), countComponent + 1);
                    return InteractionResult.SUCCESS;
                }
            }
            return InteractionResult.CONSUME;
        }
        return InteractionResult.PASS;
    }

    @Override
    protected @NotNull SoundEvent getFlopSound() {
        return SoundEvents.COD_FLOP;
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(ItemRegistry.SHRIMP_BIN.get());
    }
}
