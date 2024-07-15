package io.github.thepoultryman.shrimped.items;

import net.minecraft.core.component.DataComponentType;
import net.minecraft.world.item.Item;

public abstract class AbstractShrimpedItem extends Item {
    public AbstractShrimpedItem(Properties properties) {
        super(properties);
    }

    public <T> T getComponent(DataComponentType<? extends T> componentType) {
        return this.components().get(componentType);
    }
}
