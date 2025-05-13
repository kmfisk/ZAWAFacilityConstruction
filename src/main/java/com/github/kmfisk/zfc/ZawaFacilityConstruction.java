package com.github.kmfisk.zfc;

import com.github.kmfisk.zfc.block.ZFCBlocks;
import com.github.kmfisk.zfc.data.*;
import com.github.kmfisk.zfc.item.ZFCItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ZawaFacilityConstruction.MOD_ID)
public class ZawaFacilityConstruction {
    public static final String MOD_ID = "zfc";

    public ZawaFacilityConstruction() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ZFCItems.REGISTRAR.register(bus);
        ZFCBlocks.REGISTRAR.register(bus);

        bus.addListener(this::gatherData);
        bus.addListener(this::setupClient);
    }

    private void setupClient(final FMLClientSetupEvent event) {
        ZFCBlocks.setRenderLayers();
    }

    private void gatherData(final GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        if (event.includeServer()) {
//            ZFCBlockTagsProvider blockTagsProvider = new ZFCBlockTagsProvider(dataGenerator, event.getExistingFileHelper());
//            dataGenerator.addProvider(blockTagsProvider);
//            dataGenerator.addProvider(new ZFCItemTagsProvider(dataGenerator, blockTagsProvider, event.getExistingFileHelper()));
            dataGenerator.addProvider(new ZFCRecipeProvider(dataGenerator));
            dataGenerator.addProvider(new ZFCLootTableProvider(dataGenerator));
        }
        if (event.includeClient()) {
            dataGenerator.addProvider(new ZFCBlockStateProvider(dataGenerator, event.getExistingFileHelper()));
            dataGenerator.addProvider(new ZFCItemProvider(dataGenerator, event.getExistingFileHelper()));
        }
    }
}
