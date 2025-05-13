package com.github.kmfisk.zfc.data;

import com.github.kmfisk.zfc.ZawaFacilityConstruction;
import com.github.kmfisk.zfc.block.ZFCBlocks;
import com.github.kmfisk.zfc.item.ZFCItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ZFCItemProvider extends ItemModelProvider {
    public ZFCItemProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ZawaFacilityConstruction.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        singleTexture(ZFCItems.FIRSTITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
//                "layer0", new ResourceLocation(ZawaFacilityConstruction.MOD_ID, "item/firstitem"));
//        withExistingParent(ZFCBlocks.FIRSTBLOCK_ITEM.get().getRegistryName().getPath(), new ResourceLocation(ZawaFacilityConstruction.MOD_ID, "block/firstblock"));
    }
}
