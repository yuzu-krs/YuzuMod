package com.Yuzu.YuzuMod.main;

import com.Yuzu.YuzuMod.regi.tab.YuzuModTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("yuzumod")
public class YuzuMod {
    public static final String MOD_ID="yuzumod";

    public YuzuMod(){
        IEventBus bus= FMLJavaModLoadingContext.get().getModEventBus();
        YuzuModTabs.MOD_TABS.register(bus);
    }

}
