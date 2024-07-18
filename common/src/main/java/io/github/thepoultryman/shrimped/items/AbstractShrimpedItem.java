package io.github.thepoultryman.shrimped.items;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.Item;

import java.util.List;

public abstract class AbstractShrimpedItem extends Item {
    public AbstractShrimpedItem(Properties properties) {
        super(properties);
    }

    protected void addTooltipLine(List<Component> componentList, String... lines) {
        for (String line : lines) {
            this.createStyledLine(componentList, Component.translatable(line));
        }
    }

    protected void addTooltipLine(List<Component> componentList, String line, Object... objects) {
        this.createStyledLine(componentList, Component.translatable(line, objects));
    }

    private void createStyledLine(List<Component> componentList, MutableComponent component) {
        componentList.add(component.setStyle(Style.EMPTY.withColor(0xaaaaaa)));
    }
}
