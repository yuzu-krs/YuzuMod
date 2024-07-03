package com.Yuzu.YuzuMod.regi.tab;

import com.Yuzu.YuzuMod.main.YuzuMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class YuzuModTabs {
    public  static final DeferredRegister<CreativeModeTab> MOD_TABS=DeferredRegister.create(Registries.CREATIVE_MODE_TAB, YuzuMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> Yuzu_MAIN=MOD_TABS.register("yuzu_mod",
            ()-> {
                return CreativeModeTab.builder()
                        .icon(() -> new ItemStack(Blocks.CHERRY_PLANKS))
                        .title(Component.translatable("itemGroup.yuzu_main"))
                        .displayItems((param, output) -> {
                            for (Item item : YuzuMain.items) {
                                output.accept(item);
                            }
                        })
                        .build();

            });



}
