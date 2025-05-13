package com.github.kmfisk.zfc.data;

import com.github.kmfisk.zfc.ZawaFacilityConstruction;
import com.github.kmfisk.zfc.block.ZFCBlocks;
import net.minecraft.block.Block;
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
        blockItem(ZFCBlocks.BIG_MIXED_STONE.get());
        blockItem(ZFCBlocks.BIG_MIXED_STONE_SLAB.get());
        blockItem(ZFCBlocks.BIG_MIXED_STONE_STAIRS.get());
        blockItemAppend(ZFCBlocks.BIG_MIXED_STONE_WALL.get(), "_inventory");
        blockItem(ZFCBlocks.BIG_MIXED_RED_SANDSTONE.get());
        blockItem(ZFCBlocks.BIG_MIXED_RED_SANDSTONE_SLAB.get());
        blockItem(ZFCBlocks.BIG_MIXED_RED_SANDSTONE_STAIRS.get());
        blockItemAppend(ZFCBlocks.BIG_MIXED_RED_SANDSTONE_WALL.get(), "_inventory");
        blockItem(ZFCBlocks.BIG_MIXED_SANDSTONE.get());
        blockItem(ZFCBlocks.BIG_MIXED_SANDSTONE_SLAB.get());
        blockItem(ZFCBlocks.BIG_MIXED_SANDSTONE_STAIRS.get());
        blockItemAppend(ZFCBlocks.BIG_MIXED_SANDSTONE_WALL.get(), "_inventory");
        blockItem(ZFCBlocks.MIXED_BLACK_STONE.get());
        blockItem(ZFCBlocks.MIXED_BLACK_STONE_SLAB.get());
        blockItem(ZFCBlocks.MIXED_BLACK_STONE_STAIRS.get());
        blockItemAppend(ZFCBlocks.MIXED_BLACK_STONE_WALL.get(), "_inventory");
        blockItem(ZFCBlocks.BIG_MIXED_BLACK_STONE.get());
        blockItem(ZFCBlocks.BIG_MIXED_BLACK_STONE_SLAB.get());
        blockItem(ZFCBlocks.BIG_MIXED_BLACK_STONE_STAIRS.get());
        blockItemAppend(ZFCBlocks.BIG_MIXED_BLACK_STONE_WALL.get(), "_inventory");
        blockItem(ZFCBlocks.MIXED_DARK_STONE.get());
        blockItem(ZFCBlocks.MIXED_DARK_STONE_SLAB.get());
        blockItem(ZFCBlocks.MIXED_DARK_STONE_STAIRS.get());
        blockItemAppend(ZFCBlocks.MIXED_DARK_STONE_WALL.get(), "_inventory");
        blockItem(ZFCBlocks.BIG_MIXED_DARK_STONE.get());
        blockItem(ZFCBlocks.BIG_MIXED_DARK_STONE_SLAB.get());
        blockItem(ZFCBlocks.BIG_MIXED_DARK_STONE_STAIRS.get());
        blockItemAppend(ZFCBlocks.BIG_MIXED_DARK_STONE_WALL.get(), "_inventory");
        blockItem(ZFCBlocks.MIXED_RIVER_STONE.get());
        blockItem(ZFCBlocks.MIXED_RIVER_STONE_SLAB.get());
        blockItem(ZFCBlocks.MIXED_RIVER_STONE_STAIRS.get());
        blockItemAppend(ZFCBlocks.MIXED_RIVER_STONE_WALL.get(), "_inventory");
        blockItem(ZFCBlocks.BIG_MIXED_RIVER_STONE.get());
        blockItem(ZFCBlocks.BIG_MIXED_RIVER_STONE_SLAB.get());
        blockItem(ZFCBlocks.BIG_MIXED_RIVER_STONE_STAIRS.get());
        blockItemAppend(ZFCBlocks.BIG_MIXED_RIVER_STONE_WALL.get(), "_inventory");
        blockItem(ZFCBlocks.MIXED_WHITE_STONE.get());
        blockItem(ZFCBlocks.MIXED_WHITE_STONE_SLAB.get());
        blockItem(ZFCBlocks.MIXED_WHITE_STONE_STAIRS.get());
        blockItemAppend(ZFCBlocks.MIXED_WHITE_STONE_WALL.get(), "_inventory");
        blockItem(ZFCBlocks.BIG_MIXED_WHITE_STONE.get());
        blockItem(ZFCBlocks.BIG_MIXED_WHITE_STONE_SLAB.get());
        blockItem(ZFCBlocks.BIG_MIXED_WHITE_STONE_STAIRS.get());
        blockItemAppend(ZFCBlocks.BIG_MIXED_WHITE_STONE_WALL.get(), "_inventory");

        blockItem(ZFCBlocks.HEAVY_DUTY_BARS.get());
        itemGenerated(ZFCBlocks.HEAVY_DUTY_DOOR.get(), ITEM_FOLDER);
        itemGeneratedNamed(ZFCBlocks.HEAVY_DUTY_FENCE.get(), BLOCK_FOLDER, ZFCBlocks.HEAVY_DUTY_BARS.get().getRegistryName().getPath());
        blockItem(ZFCBlocks.HEAVY_DUTY_SLAB.get());
        blockItemAppend(ZFCBlocks.HEAVY_DUTY_TRAPDOOR.get(), "_bottom");
        blockItem(ZFCBlocks.VERTICAL_BARS.get());
        itemGenerated(ZFCBlocks.VERTICAL_BARS_DOOR.get(), ITEM_FOLDER);
        itemGeneratedNamed(ZFCBlocks.VERTICAL_BARS_FENCE.get(), BLOCK_FOLDER, ZFCBlocks.VERTICAL_BARS.get().getRegistryName().getPath());
        blockItem(ZFCBlocks.VERTICAL_BARS_SLAB.get());
        blockItemAppend(ZFCBlocks.VERTICAL_BARS_TRAPDOOR.get(), "_bottom");
        blockItem(ZFCBlocks.CAST_IRON_BARS.get());
        itemGenerated(ZFCBlocks.CAST_IRON_DOOR.get(), ITEM_FOLDER);
        itemGeneratedNamed(ZFCBlocks.CAST_IRON_FENCE.get(), BLOCK_FOLDER, ZFCBlocks.CAST_IRON_BARS.get().getRegistryName().getPath());
        blockItem(ZFCBlocks.CAST_IRON_SLAB.get());
        blockItemAppend(ZFCBlocks.CAST_IRON_TRAPDOOR.get(), "_bottom");
    }

    public void blockItem(Block block) {
        String name = block.getRegistryName().getPath();
        withExistingParent(name, new ResourceLocation(ZawaFacilityConstruction.MOD_ID, "block/" + name));
    }

    public void blockItemAppend(Block block, String append) {
        String name = block.getRegistryName().getPath();
        withExistingParent(name, new ResourceLocation(ZawaFacilityConstruction.MOD_ID, "block/" + name + append));
    }

    public void itemGenerated(Block block, String textureLoc) {
        String name = block.getRegistryName().getPath();
        singleTexture(name, new ResourceLocation("item/generated"), "layer0", new ResourceLocation(ZawaFacilityConstruction.MOD_ID, textureLoc + "/" + name));
    }

    public void itemGeneratedNamed(Block block, String textureLoc, String textureName) {
        String name = block.getRegistryName().getPath();
        singleTexture(name, new ResourceLocation("item/generated"), "layer0", new ResourceLocation(ZawaFacilityConstruction.MOD_ID, textureLoc + "/" + textureName));
    }
}
