package com.projektdeus.blockaholic.modcontent.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
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

public class Alien_Fruit_Block extends Block {

    // Custom shape for the fruit block
    private static final VoxelShape SHAPE = Shapes.or(
            Block.box(6, 0, 6, 10, 4, 10), // fruit
            Block.box(7, 4, 7, 9, 5, 9)    // stem
    );

    public Alien_Fruit_Block(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    // Block registration
    public static final DeferredBlock<Block> ALIEN_FRUIT_BLOCK = BLOCKS.register(
            "alien_fruit_block", () -> new Alien_Fruit_Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .strength(0.2f)
                    .noOcclusion()
                    .sound(SoundType.CROP)
            )
    );

    // Block item registration (with food properties)
    public static final DeferredItem<BlockItem> ALIEN_FRUIT_BLOCK_ITEM = ITEMS.register(
            "alien_fruit_block", () -> new BlockItem(
                    ALIEN_FRUIT_BLOCK.get(),
                    new Item.Properties().food(
                            new FoodProperties.Builder()
                                    .nutrition(4)
                                    .saturationModifier(0.3f)
                                    .build()
                    )
            )
    );

    // Optional: for consistency with your registration system
    public static void register() {
        // Intentionally left blank
    }
}
