package com.github.kmfisk.zawafc;

import com.github.kmfisk.zawafc.block.ZFCBlocks;
import com.github.kmfisk.zawafc.item.ZFCItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ZawaFacilityConstruction.MOD_ID)
public class ZawaFacilityConstruction {
    public static final String MOD_ID = "zawafc";

    public ZawaFacilityConstruction() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ZFCItems.REGISTRAR.register(bus);
        ZFCBlocks.REGISTRAR.register(bus);
        bus.addListener(this::setupClient);
    }

    private void setupClient(final FMLClientSetupEvent event) {
        ZFCBlocks.setRenderLayers();
    }
}
