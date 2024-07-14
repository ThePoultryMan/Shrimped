package io.github.thepoultryman.shrimped.forge;

import io.github.thepoultryman.shrimped.Shrimped;
import net.neoforged.fml.common.Mod;

@Mod(Shrimped.MOD_ID)
public class ShrimpedForge {
    public ShrimpedForge() {
        Shrimped.init();
    }
}