package com.github.kmfisk.zfc.data;

import com.github.kmfisk.zfc.ZawaFacilityConstruction;
import com.github.kmfisk.zfc.block.ZFCBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ZFCBlockStateProvider extends BlockStateProvider {
    public ZFCBlockStateProvider(DataGenerator dataGenerator, ExistingFileHelper fileHelper) {
        super(dataGenerator, ZawaFacilityConstruction.MOD_ID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
//        simpleBlock(ZFCBlocks.SIMPLEBLOCK.get());
    }
}
