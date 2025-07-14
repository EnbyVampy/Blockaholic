package com.projektdeus.blockaholic;

import net.neoforged.bus.api.IEventBus;
import com.projektdeus.blockaholic.modcontent.blocks.*;

import net.neoforged.neoforge.registries.DeferredRegister;

import static com.projektdeus.blockaholic.Blockaholic.MODID;


public class ModRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static void register(IEventBus eventBus) {
        // Register deferred registers once
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);

        // Register your blocks (they shouldn't re-register the event bus!)
        Alien_Dirt_Block.register();
        Alien_Grass_Block.register();
        Alien_Dirt_Ore_Block.register();
        Alien_Leaves_Block.register();
        Alien_Log_Block.register();
        Alien_Fruit_Block.register();
        Alien_Tall_Grass_Block.register();
    }

//    static void registerEntities() {}
//    static void registerWorldGen() {}
//    static void registerSounds() {}
//    static void registerContainerTypes() {}
//    static void registerRecipeSerializers() {}
//    static void registerRecipeTypes() {}
//    static void registerAdvancements() {}
//    static void registerCommands() {}
//    static void registerLootModifiers() {}
//    static void registerTags() {}
//    static void registerFeatures() {}
//    static void registerDimensionTypes() {}
//    static void registerDimension() {}
//    static void registerVillagers() {}
//    static void registerBiomes() {}
//    static void registerPaintings() {}
//    static void registerEffects() {}
//    static void registerPotions() {}
//    static void registerRecipeBook() {}
//    static void registerRecipeSerializersForge() {}
//    static void registerRecipeTypesForge() {}
//    static void registerGlobalLootModifiers() {}
//    static void registerGlobalLootModifiersForge() {}










}
