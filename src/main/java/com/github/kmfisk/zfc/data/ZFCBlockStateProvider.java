package com.github.kmfisk.zfc.data;

import com.github.kmfisk.zfc.ZawaFacilityConstruction;
import com.github.kmfisk.zfc.block.ZFCBlocks;
import net.minecraft.block.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ZFCBlockStateProvider extends BlockStateProvider {
    public ZFCBlockStateProvider(DataGenerator dataGenerator, ExistingFileHelper fileHelper) {
        super(dataGenerator, ZawaFacilityConstruction.MOD_ID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockSet(ZFCBlocks.BIG_MIXED_STONE.get(), ZFCBlocks.BIG_MIXED_STONE_SLAB.get(), ZFCBlocks.BIG_MIXED_STONE_STAIRS.get(), ZFCBlocks.BIG_MIXED_STONE_WALL.get());
        blockSet(ZFCBlocks.BIG_MIXED_RED_SANDSTONE.get(), ZFCBlocks.BIG_MIXED_RED_SANDSTONE_SLAB.get(), ZFCBlocks.BIG_MIXED_RED_SANDSTONE_STAIRS.get(), ZFCBlocks.BIG_MIXED_RED_SANDSTONE_WALL.get());
        blockSet(ZFCBlocks.BIG_MIXED_SANDSTONE.get(), ZFCBlocks.BIG_MIXED_SANDSTONE_SLAB.get(), ZFCBlocks.BIG_MIXED_SANDSTONE_STAIRS.get(), ZFCBlocks.BIG_MIXED_SANDSTONE_WALL.get());
        blockSet(ZFCBlocks.MIXED_BLACK_STONE.get(), ZFCBlocks.MIXED_BLACK_STONE_SLAB.get(), ZFCBlocks.MIXED_BLACK_STONE_STAIRS.get(), ZFCBlocks.MIXED_BLACK_STONE_WALL.get());
        blockSet(ZFCBlocks.BIG_MIXED_BLACK_STONE.get(), ZFCBlocks.BIG_MIXED_BLACK_STONE_SLAB.get(), ZFCBlocks.BIG_MIXED_BLACK_STONE_STAIRS.get(), ZFCBlocks.BIG_MIXED_BLACK_STONE_WALL.get());
        blockSet(ZFCBlocks.MIXED_DARK_STONE.get(), ZFCBlocks.MIXED_DARK_STONE_SLAB.get(), ZFCBlocks.MIXED_DARK_STONE_STAIRS.get(), ZFCBlocks.MIXED_DARK_STONE_WALL.get());
        blockSet(ZFCBlocks.BIG_MIXED_DARK_STONE.get(), ZFCBlocks.BIG_MIXED_DARK_STONE_SLAB.get(), ZFCBlocks.BIG_MIXED_DARK_STONE_STAIRS.get(), ZFCBlocks.BIG_MIXED_DARK_STONE_WALL.get());
        blockSet(ZFCBlocks.MIXED_RIVER_STONE.get(), ZFCBlocks.MIXED_RIVER_STONE_SLAB.get(), ZFCBlocks.MIXED_RIVER_STONE_STAIRS.get(), ZFCBlocks.MIXED_RIVER_STONE_WALL.get());
        blockSet(ZFCBlocks.BIG_MIXED_RIVER_STONE.get(), ZFCBlocks.BIG_MIXED_RIVER_STONE_SLAB.get(), ZFCBlocks.BIG_MIXED_RIVER_STONE_STAIRS.get(), ZFCBlocks.BIG_MIXED_RIVER_STONE_WALL.get());
        blockSet(ZFCBlocks.MIXED_WHITE_STONE.get(), ZFCBlocks.MIXED_WHITE_STONE_SLAB.get(), ZFCBlocks.MIXED_WHITE_STONE_STAIRS.get(), ZFCBlocks.MIXED_WHITE_STONE_WALL.get());
        blockSet(ZFCBlocks.BIG_MIXED_WHITE_STONE.get(), ZFCBlocks.BIG_MIXED_WHITE_STONE_SLAB.get(), ZFCBlocks.BIG_MIXED_WHITE_STONE_STAIRS.get(), ZFCBlocks.BIG_MIXED_WHITE_STONE_WALL.get());

        barsSet(ZFCBlocks.HEAVY_DUTY_BARS.get(), ZFCBlocks.HEAVY_DUTY_BARS_DOOR.get(), ZFCBlocks.HEAVY_DUTY_BARS_FENCE.get(), ZFCBlocks.HEAVY_DUTY_BARS_SLAB.get(), ZFCBlocks.HEAVY_DUTY_BARS_TRAPDOOR.get());
        barsSet(ZFCBlocks.VERTICAL_BARS.get(), ZFCBlocks.VERTICAL_BARS_DOOR.get(), ZFCBlocks.VERTICAL_BARS_FENCE.get(), ZFCBlocks.VERTICAL_BARS_SLAB.get(), ZFCBlocks.VERTICAL_BARS_TRAPDOOR.get());
        barsSet(ZFCBlocks.CAST_IRON_BARS.get(), ZFCBlocks.CAST_IRON_BARS_DOOR.get(), ZFCBlocks.CAST_IRON_BARS_FENCE.get(), ZFCBlocks.CAST_IRON_BARS_SLAB.get(), ZFCBlocks.CAST_IRON_BARS_TRAPDOOR.get());
    }

    public void blockSet(Block block, SlabBlock slabBlock, StairsBlock stairsBlock, WallBlock wallBlock) {
        simpleBlock(block);
        slabBlock(slabBlock, blockTexture(block), blockTexture(block));
        stairsBlock(stairsBlock, blockTexture(block));
        wallBlock(wallBlock, blockTexture(block));
    }

    public void barsSet(Block block, DoorBlock doorBlock, PaneBlock fenceBlock, SlabBlock slabBlock, TrapDoorBlock trapdoorBlock) {
        simpleBlock(block);
        doorBlock(doorBlock, appendTexture(doorBlock, "_bottom"), appendTexture(doorBlock, "_top"));
        paneBlock(fenceBlock, blockTexture(block), blockTexture(block));
        slabBlock(slabBlock, blockTexture(block), blockTexture(block));
        trapdoorBlock(trapdoorBlock, blockTexture(trapdoorBlock), true);
    }

    private ResourceLocation appendTexture(Block block, String append) {
        ResourceLocation name = block.getRegistryName();
        return new ResourceLocation(name.getNamespace(), "block/" + name.getPath() + append);
    }
}
