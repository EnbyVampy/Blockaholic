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

public class Alien_Dirt_Block {
    public static final DeferredBlock<Block> ALIEN_DIRT_BLOCK = BLOCKS.registerSimpleBlock(
            "alien_dirt_block", BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .strength(0.5f)
                    .sound(SoundType.GRASS)
    );

    public static final DeferredItem<BlockItem> ALIEN_DIRT_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(
            "alien_dirt_block", ALIEN_DIRT_BLOCK);

    public static void register() {}
}





