package io.github.thepoultryman.shrimped;

import io.github.thepoultryman.shrimped.registry.BlockRegistry;

public class Shrimped
{
	public static final String MOD_ID = "shrimped";

	public static void init() {
		BlockRegistry.registerBlocks();
	}
}
