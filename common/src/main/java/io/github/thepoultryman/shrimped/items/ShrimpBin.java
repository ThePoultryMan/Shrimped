package io.github.thepoultryman.shrimped.items;

import io.github.thepoultryman.shrimped.registry.DataComponentRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class ShrimpBin extends AbstractShrimpedItem {
    public ShrimpBin() {
        super(new Properties().stacksTo(1).component(DataComponentRegistry.SHRIMP_BIN_COUNT_COMPONENT.get(), 0));
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> list, TooltipFlag tooltipFlag) {
        this.addTooltipLine(list, "shrimped.item.tooltip", itemStack.getOrDefault(DataComponentRegistry.SHRIMP_BIN_COUNT_COMPONENT.get(), "?"));
    }
}
