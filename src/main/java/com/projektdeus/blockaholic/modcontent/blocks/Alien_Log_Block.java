package com.projektdeus.blockaholic.modcontent.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import static com.projektdeus.blockaholic.ModRegistry.BLOCKS;
import static com.projektdeus.blockaholic.ModRegistry.ITEMS;

public class Alien_Log_Block extends RotatedPillarBlock {
    public static final DeferredBlock<Block> ALIEN_LOG_BLOCK = BLOCKS.register(
            "alien_log_block",
            () -> new Alien_Log_Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .strength(0.5f)
                    .sound(SoundType.WOOD))
    );

    public static final DeferredItem<BlockItem> ALIEN_LOG_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(
            "alien_log_block", ALIEN_LOG_BLOCK
    );

    public Alien_Log_Block(Properties properties) {
        super(properties);
    }

    public static void register() {}
}
