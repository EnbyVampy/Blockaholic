package com.projektdeus.blockaholic.modcontent.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import static com.projektdeus.blockaholic.ModRegistry.BLOCKS;
import static com.projektdeus.blockaholic.ModRegistry.ITEMS;

public class Alien_Grass_Block {
    public static final DeferredBlock<Block> ALIEN_GRASS_BLOCK = BLOCKS.registerSimpleBlock(
            "alien_grass_block", BlockBehaviour.Properties.of()
                    .mapColor(MapColor.GRASS)
                    .strength(0.5f)
                    .randomTicks()
                    .sound(SoundType.GRASS)
    );

    public static final DeferredItem<BlockItem> ALIEN_GRASS_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(
            "alien_grass_block", ALIEN_GRASS_BLOCK);

    public static void register() {}
}