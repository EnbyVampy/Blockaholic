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

public class Alien_Leaves_Block {
    public static final DeferredBlock<Block> ALIEN_LEAVES_BLOCK = BLOCKS.registerSimpleBlock(
            "alien_leaves_block", BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .strength(0.2f)
                    .noOcclusion()
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos) -> false)
                    .sound(SoundType.GRASS)
    );

    public static final DeferredItem<BlockItem> ALIEN_LEAVES_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(
            "alien_leaves_block", ALIEN_LEAVES_BLOCK);

    public static void register() {}
}