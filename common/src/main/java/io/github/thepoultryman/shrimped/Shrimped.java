package io.github.thepoultryman.shrimped;

import io.github.thepoultryman.shrimped.registry.BlockRegistry;
import io.github.thepoultryman.shrimped.registry.DataComponentRegistry;
import io.github.thepoultryman.shrimped.registry.EntityRegistry;
import io.github.thepoultryman.shrimped.registry.ItemRegistry;

public class Shrimped
{
	public static final String MOD_ID = "shrimped";

	public static void init() {
		BlockRegistry.registerBlocks();
		DataComponentRegistry.registerDataComponents();
		ItemRegistry.registerItems();
		EntityRegistry.registerEntities();
	}
}
