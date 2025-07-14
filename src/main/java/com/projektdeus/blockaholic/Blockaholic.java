package com.projektdeus.blockaholic;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(Blockaholic.MODID)
public class Blockaholic {

    public static final String MODID = "blockaholic";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Blockaholic(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Registering mod content");
        ModRegistry.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);
    }


}
