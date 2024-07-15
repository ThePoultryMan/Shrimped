package io.github.thepoultryman.shrimped.items;

import io.github.thepoultryman.shrimped.registry.DataComponentRegistry;

public class ShrimpBin extends AbstractShrimpedItem {
    public ShrimpBin() {
        super(new Properties().stacksTo(1).component(DataComponentRegistry.SHRIMP_BIN_COUNT_COMPONENT.get(), new DataComponentRegistry.ShrimpBinCount(0)));
    }
}
