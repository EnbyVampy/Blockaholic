package com.projektdeus.blockaholic;

import com.projektdeus.blockaholic.modcontent.blocks.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import static com.projektdeus.blockaholic.Blockaholic.MODID;
import static com.projektdeus.blockaholic.modcontent.blocks.Alien_Log_Block.ALIEN_LOG_BLOCK;


public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BLOCKAHOLIC_BLOCKS_TAB = CREATIVE_MODE_TABS.register(
            "blockaholic_blocks_tab", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.blockaholic.1")) //The language key for the title of your CreativeModeTab
                .withTabsBefore(CreativeModeTabs.COMBAT)
                        .icon(() -> new ItemStack(ALIEN_LOG_BLOCK.get()))
                .displayItems((parameters, output) -> {

                    output.accept(Alien_Dirt_Block.ALIEN_DIRT_BLOCK_ITEM.get());
                    output.accept(Alien_Grass_Block.ALIEN_GRASS_BLOCK_ITEM.get());
                    output.accept(Alien_Leaves_Block.ALIEN_LEAVES_BLOCK_ITEM.get());
                    output.accept(Alien_Log_Block.ALIEN_LOG_BLOCK_ITEM.get());
                    output.accept(Alien_Dirt_Ore_Block.ALIEN_DIRT_ORE_BLOCK_ITEM.get());

            }).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BLOCKAHOLIC_ITEMS_TAB = CREATIVE_MODE_TABS.register(
            "blockaholic_items_tab", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.blockaholic.2")) //The language key for the title of your CreativeModeTab
                .withTabsBefore(CreativeModeTabs.COMBAT)
                .icon(() -> new ItemStack(ALIEN_LOG_BLOCK.get()))
                .displayItems((parameters, output) -> {

                    output.accept(Alien_Fruit_Block.ALIEN_FRUIT_BLOCK_ITEM.get());
                    output.accept(Alien_Tall_Grass_Block.ALIEN_TALL_GRASS_BLOCK_ITEM.get());

                }).build());

}
