package com.github.kmfisk.zfc.data;

import com.github.kmfisk.zfc.block.ZFCBlocks;
import net.minecraft.data.DataGenerator;

public class ZFCLootTableProvider extends BaseLootTableProvider {
    public ZFCLootTableProvider(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void addTables() {
//        lootTables.put(ZFCBlocks.FIRSTBLOCK.get(), createStandardTable("firstblock", ZFCBlocks.FIRSTBLOCK.get()));
    }
}
