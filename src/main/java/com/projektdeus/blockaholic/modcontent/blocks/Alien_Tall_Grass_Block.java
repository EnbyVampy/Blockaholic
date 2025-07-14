package com.projektdeus.blockaholic.modcontent.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import static com.projektdeus.blockaholic.ModRegistry.BLOCKS;
import static com.projektdeus.blockaholic.ModRegistry.ITEMS;

public class Alien_Tall_Grass_Block extends Block {

    private static final VoxelShape SHAPE = Shapes.or(
            Block.box(0,0,8,16,16,8),
            Block.box(0,0,8,16,16,8),
            Block.box(2,0,2,14,15,14)
    );

    public Alien_Tall_Grass_Block(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    // Block registration
    public static final DeferredBlock<Block> ALIEN_TALL_GRASS_BLOCK = BLOCKS.register(
            "alien_tall_grass_block", () -> new Alien_Tall_Grass_Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .replaceable()
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.GRASS)
            )
    );

    // Block item registration
    public static final DeferredItem<BlockItem> ALIEN_TALL_GRASS_BLOCK_ITEM = ITEMS.register(
            "alien_tall_grass_block", () -> new BlockItem(
                    ALIEN_TALL_GRASS_BLOCK.get(),
                    new Item.Properties()
            )
    );

    public static void register() {
        // Intentionally left empty for now
    }
}
