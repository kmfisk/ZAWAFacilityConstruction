package com.github.kmfisk.zfc.data;

import com.github.kmfisk.zfc.ZawaFacilityConstruction;
import com.github.kmfisk.zfc.block.ZFCBlocks;
import net.minecraft.block.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ZFCBlockStateProvider extends BlockStateProvider {
    public ZFCBlockStateProvider(DataGenerator dataGenerator, ExistingFileHelper fileHelper) {
        super(dataGenerator, ZawaFacilityConstruction.MOD_ID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (String type : new String[]{"acacia", /*"bamboo",*/ "birch", /*"cherry",*/ "dark_oak", "jungle", /*"mangrove",*/ "oak", "spruce", "crimson", "warped"}) {
            balconyFenceSet(ZFCBlocks.BALCONY_FENCES.get(type).get(), ZFCBlocks.BALCONY_FENCE_GATES.get(type).get(), "minecraft:block/" + type + "_planks");
        }
        fineCableFenceSet(ZFCBlocks.FINE_CABLE_FENCES.get("acacia").get(), /*ZFCBlocks.FINE_CABLE_FENCE_GATES.get("acacia").get(),*/ Blocks.STRIPPED_ACACIA_LOG, Blocks.ACACIA_LOG);
        fineCableFenceSet(ZFCBlocks.FINE_CABLE_FENCES.get("birch").get(), /*ZFCBlocks.FINE_CABLE_FENCE_GATES.get("birch").get(),*/ Blocks.STRIPPED_BIRCH_LOG, Blocks.BIRCH_LOG);
        fineCableFenceSet(ZFCBlocks.FINE_CABLE_FENCES.get("dark_oak").get(), /*ZFCBlocks.FINE_CABLE_FENCE_GATES.get("dark_oak").get(),*/ Blocks.STRIPPED_DARK_OAK_LOG, Blocks.DARK_OAK_LOG);
        fineCableFenceSet(ZFCBlocks.FINE_CABLE_FENCES.get("jungle").get(), /*ZFCBlocks.FINE_CABLE_FENCE_GATES.get("jungle").get(),*/ Blocks.STRIPPED_JUNGLE_LOG, Blocks.JUNGLE_LOG);
        fineCableFenceSet(ZFCBlocks.FINE_CABLE_FENCES.get("oak").get(), /*ZFCBlocks.FINE_CABLE_FENCE_GATES.get("oak").get(),*/ Blocks.STRIPPED_OAK_LOG, Blocks.OAK_LOG);
        fineCableFenceSet(ZFCBlocks.FINE_CABLE_FENCES.get("spruce").get(), /*ZFCBlocks.FINE_CABLE_FENCE_GATES.get("spruce").get(),*/ Blocks.STRIPPED_SPRUCE_LOG, Blocks.SPRUCE_LOG);
        fineCableFenceSet(ZFCBlocks.FINE_CABLE_FENCES.get("crimson").get(), /*ZFCBlocks.FINE_CABLE_FENCE_GATES.get("crimson").get(),*/ Blocks.STRIPPED_CRIMSON_STEM, Blocks.CRIMSON_STEM);
        fineCableFenceSet(ZFCBlocks.FINE_CABLE_FENCES.get("warped").get(), /*ZFCBlocks.FINE_CABLE_FENCE_GATES.get("warped").get(),*/ Blocks.STRIPPED_WARPED_STEM, Blocks.WARPED_STEM);
        strippedFineCableFenceSet(ZFCBlocks.STRIPPED_FINE_CABLE_FENCES.get("acacia").get(), /*ZFCBlocks.STRIPPED_FINE_CABLE_FENCE_GATES.get("acacia").get(),*/ Blocks.STRIPPED_ACACIA_LOG);
        strippedFineCableFenceSet(ZFCBlocks.STRIPPED_FINE_CABLE_FENCES.get("birch").get(), /*ZFCBlocks.STRIPPED_FINE_CABLE_FENCE_GATES.get("birch").get(),*/ Blocks.STRIPPED_BIRCH_LOG);
        strippedFineCableFenceSet(ZFCBlocks.STRIPPED_FINE_CABLE_FENCES.get("dark_oak").get(), /*ZFCBlocks.STRIPPED_FINE_CABLE_FENCE_GATES.get("dark_oak").get(),*/ Blocks.STRIPPED_DARK_OAK_LOG);
        strippedFineCableFenceSet(ZFCBlocks.STRIPPED_FINE_CABLE_FENCES.get("jungle").get(), /*ZFCBlocks.STRIPPED_FINE_CABLE_FENCE_GATES.get("jungle").get(),*/ Blocks.STRIPPED_JUNGLE_LOG);
        strippedFineCableFenceSet(ZFCBlocks.STRIPPED_FINE_CABLE_FENCES.get("oak").get(), /*ZFCBlocks.STRIPPED_FINE_CABLE_FENCE_GATES.get("oak").get(),*/ Blocks.STRIPPED_OAK_LOG);
        strippedFineCableFenceSet(ZFCBlocks.STRIPPED_FINE_CABLE_FENCES.get("spruce").get(), /*ZFCBlocks.STRIPPED_FINE_CABLE_FENCE_GATES.get("spruce").get(),*/ Blocks.STRIPPED_SPRUCE_LOG);
        strippedFineCableFenceSet(ZFCBlocks.STRIPPED_FINE_CABLE_FENCES.get("crimson").get(), /*ZFCBlocks.STRIPPED_FINE_CABLE_FENCE_GATES.get("crimson").get(),*/ Blocks.STRIPPED_CRIMSON_STEM);
        strippedFineCableFenceSet(ZFCBlocks.STRIPPED_FINE_CABLE_FENCES.get("warped").get(), /*ZFCBlocks.STRIPPED_FINE_CABLE_FENCE_GATES.get("warped").get(),*/ Blocks.STRIPPED_WARPED_STEM);

        branchFenceSet(ZFCBlocks.BRANCH_FENCES.get("acacia").get(), ZFCBlocks.BRANCH_FENCE_GATES.get("acacia").get(), Blocks.STRIPPED_ACACIA_LOG);
        branchFenceSet(ZFCBlocks.BRANCH_FENCES.get("birch").get(), ZFCBlocks.BRANCH_FENCE_GATES.get("birch").get(), Blocks.STRIPPED_BIRCH_LOG);
        branchFenceSet(ZFCBlocks.BRANCH_FENCES.get("dark_oak").get(), ZFCBlocks.BRANCH_FENCE_GATES.get("dark_oak").get(), Blocks.STRIPPED_DARK_OAK_LOG);
        branchFenceSet(ZFCBlocks.BRANCH_FENCES.get("jungle").get(), ZFCBlocks.BRANCH_FENCE_GATES.get("jungle").get(), Blocks.STRIPPED_JUNGLE_LOG);
        branchFenceSet(ZFCBlocks.BRANCH_FENCES.get("oak").get(), ZFCBlocks.BRANCH_FENCE_GATES.get("oak").get(), Blocks.STRIPPED_OAK_LOG);
        branchFenceSet(ZFCBlocks.BRANCH_FENCES.get("spruce").get(), ZFCBlocks.BRANCH_FENCE_GATES.get("spruce").get(), Blocks.STRIPPED_SPRUCE_LOG);
        branchFenceSet(ZFCBlocks.BRANCH_FENCES.get("crimson").get(), ZFCBlocks.BRANCH_FENCE_GATES.get("crimson").get(), Blocks.STRIPPED_CRIMSON_STEM);
        branchFenceSet(ZFCBlocks.BRANCH_FENCES.get("warped").get(), ZFCBlocks.BRANCH_FENCE_GATES.get("warped").get(), Blocks.STRIPPED_WARPED_STEM);

        heavyStockFenceSet(ZFCBlocks.HEAVY_STOCK_FENCES.get("acacia").get(), ZFCBlocks.HEAVY_STOCK_FENCE_GATES.get("acacia").get(), Blocks.STRIPPED_ACACIA_LOG, Blocks.GRAY_CONCRETE);
        heavyStockFenceSet(ZFCBlocks.HEAVY_STOCK_FENCES.get("birch").get(), ZFCBlocks.HEAVY_STOCK_FENCE_GATES.get("birch").get(), Blocks.STRIPPED_BIRCH_LOG, Blocks.GRAY_CONCRETE);
        heavyStockFenceSet(ZFCBlocks.HEAVY_STOCK_FENCES.get("dark_oak").get(), ZFCBlocks.HEAVY_STOCK_FENCE_GATES.get("dark_oak").get(), Blocks.STRIPPED_DARK_OAK_LOG, Blocks.GRAY_CONCRETE);
        heavyStockFenceSet(ZFCBlocks.HEAVY_STOCK_FENCES.get("jungle").get(), ZFCBlocks.HEAVY_STOCK_FENCE_GATES.get("jungle").get(), Blocks.STRIPPED_JUNGLE_LOG, Blocks.GRAY_CONCRETE);
        heavyStockFenceSet(ZFCBlocks.HEAVY_STOCK_FENCES.get("oak").get(), ZFCBlocks.HEAVY_STOCK_FENCE_GATES.get("oak").get(), Blocks.STRIPPED_OAK_LOG, Blocks.GRAY_CONCRETE);
        heavyStockFenceSet(ZFCBlocks.HEAVY_STOCK_FENCES.get("spruce").get(), ZFCBlocks.HEAVY_STOCK_FENCE_GATES.get("spruce").get(), Blocks.STRIPPED_SPRUCE_LOG, Blocks.GRAY_CONCRETE);
        heavyStockFenceSet(ZFCBlocks.HEAVY_STOCK_FENCES.get("crimson").get(), ZFCBlocks.HEAVY_STOCK_FENCE_GATES.get("crimson").get(), Blocks.STRIPPED_CRIMSON_STEM, Blocks.GRAY_CONCRETE);
        heavyStockFenceSet(ZFCBlocks.HEAVY_STOCK_FENCES.get("warped").get(), ZFCBlocks.HEAVY_STOCK_FENCE_GATES.get("warped").get(), Blocks.STRIPPED_CRIMSON_STEM, Blocks.GRAY_CONCRETE);

        minimalistFenceSet(ZFCBlocks.MINIMALISTIC_FENCES.get("acacia").get(), Blocks.ACACIA_PLANKS, Blocks.GRAY_CONCRETE);
        minimalistFenceSet(ZFCBlocks.MINIMALISTIC_FENCES.get("birch").get(), Blocks.BIRCH_PLANKS, Blocks.GRAY_CONCRETE);
        minimalistFenceSet(ZFCBlocks.MINIMALISTIC_FENCES.get("dark_oak").get(), Blocks.DARK_OAK_PLANKS, Blocks.GRAY_CONCRETE);
        minimalistFenceSet(ZFCBlocks.MINIMALISTIC_FENCES.get("jungle").get(), Blocks.JUNGLE_PLANKS, Blocks.GRAY_CONCRETE);
        minimalistFenceSet(ZFCBlocks.MINIMALISTIC_FENCES.get("oak").get(), Blocks.OAK_PLANKS, Blocks.GRAY_CONCRETE);
        minimalistFenceSet(ZFCBlocks.MINIMALISTIC_FENCES.get("spruce").get(), Blocks.SPRUCE_PLANKS, Blocks.GRAY_CONCRETE);
        minimalistFenceSet(ZFCBlocks.MINIMALISTIC_FENCES.get("crimson").get(), Blocks.CRIMSON_PLANKS, Blocks.GRAY_CONCRETE);
        minimalistFenceSet(ZFCBlocks.MINIMALISTIC_FENCES.get("warped").get(), Blocks.WARPED_PLANKS, Blocks.GRAY_CONCRETE);

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

        barsSet(ZFCBlocks.HEAVY_DUTY_BARS.get(), ZFCBlocks.HEAVY_DUTY_DOOR.get(), ZFCBlocks.HEAVY_DUTY_FENCE.get(), ZFCBlocks.HEAVY_DUTY_SLAB.get(), ZFCBlocks.HEAVY_DUTY_TRAPDOOR.get());
        barsSet(ZFCBlocks.VERTICAL_BARS.get(), ZFCBlocks.VERTICAL_BARS_DOOR.get(), ZFCBlocks.VERTICAL_BARS_FENCE.get(), ZFCBlocks.VERTICAL_BARS_SLAB.get(), ZFCBlocks.VERTICAL_BARS_TRAPDOOR.get());
        barsSet(ZFCBlocks.CAST_IRON_BARS.get(), ZFCBlocks.CAST_IRON_DOOR.get(), ZFCBlocks.CAST_IRON_FENCE.get(), ZFCBlocks.CAST_IRON_SLAB.get(), ZFCBlocks.CAST_IRON_TRAPDOOR.get());
    }

    public void balconyFenceSet(FenceBlock fenceBlock, FenceGateBlock gateBlock, String planksTexture) {
        String fenceName = fenceBlock.getRegistryName().toString();
        fourWayBlock(fenceBlock,
                models().withExistingParent(fenceName + "_post", ZawaFacilityConstruction.MOD_ID + ":block/balcony_fence_post").texture("0", planksTexture),
                models().withExistingParent(fenceName + "_side", ZawaFacilityConstruction.MOD_ID + ":block/balcony_fence_side").texture("0", planksTexture));

        String gateName = gateBlock.getRegistryName().toString();
        ModelFile gateClosed = models().withExistingParent(gateName + "_closed", ZawaFacilityConstruction.MOD_ID + ":block/balcony_fence_gate_closed").texture("0", planksTexture);
        ModelFile gateOpen = models().withExistingParent(gateName + "_open", ZawaFacilityConstruction.MOD_ID + ":block/balcony_fence_gate_open").texture("0", planksTexture);
        getVariantBuilder(gateBlock).forAllStatesExcept(blockState -> {
            ModelFile model = gateClosed;
            if (blockState.getValue(FenceGateBlock.OPEN)) {
                model = gateOpen;
            }
            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationY((int) blockState.getValue(FenceGateBlock.FACING).toYRot())
                    .uvLock(true)
                    .build();
        }, FenceGateBlock.POWERED);
    }

    public void branchFenceSet(FenceBlock fenceBlock, FenceGateBlock gateBlock, Block strippedLog) {
        String fenceName = fenceBlock.getRegistryName().toString();
        fourWayBlock(fenceBlock,
                models().withExistingParent(fenceName + "_post", ZawaFacilityConstruction.MOD_ID + ":block/branch_fence_post").texture("0", blockTexture(strippedLog)).texture("1", blockTexture(fenceBlock)),
                models().withExistingParent(fenceName + "_side", ZawaFacilityConstruction.MOD_ID + ":block/branch_fence_side").texture("0", blockTexture(strippedLog)).texture("1", blockTexture(fenceBlock)));

        String gateName = gateBlock.getRegistryName().toString();
        ModelFile gateClosed = models().withExistingParent(gateName + "_closed", ZawaFacilityConstruction.MOD_ID + ":block/branch_fence_gate_closed").texture("0", blockTexture(strippedLog)).texture("1", blockTexture(fenceBlock));
        ModelFile gateOpen = models().withExistingParent(gateName + "_open", ZawaFacilityConstruction.MOD_ID + ":block/branch_fence_gate_open").texture("0", blockTexture(strippedLog)).texture("1", blockTexture(fenceBlock));
        getVariantBuilder(gateBlock).forAllStatesExcept(blockState -> {
            ModelFile model = gateClosed;
            if (blockState.getValue(FenceGateBlock.OPEN)) {
                model = gateOpen;
            }
            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationY((int) blockState.getValue(FenceGateBlock.FACING).toYRot())
                    .uvLock(true)
                    .build();
        }, FenceGateBlock.POWERED);
    }

    public void fineCableFenceSet(FenceBlock fenceBlock, /*FenceGateBlock gateBlock,*/ Block strippedLog, Block log) {
        String fenceName = fenceBlock.getRegistryName().toString();
        fourWayBlock(fenceBlock,
                models().withExistingParent(fenceName + "_post", ZawaFacilityConstruction.MOD_ID + ":block/fine_cable_fence_post").texture("2", blockTexture(strippedLog)).texture("3", blockTexture(log)),
                models().withExistingParent(fenceName + "_side", ZawaFacilityConstruction.MOD_ID + ":block/fine_cable_fence_side").texture("2", blockTexture(strippedLog)).texture("3", blockTexture(log)));

//        String gateName = gateBlock.getRegistryName().toString();
//        ModelFile gateClosed = models().withExistingParent(gateName + "_closed", ZawaFacilityConstruction.MOD_ID + ":block/fine_cable_fence_gate_closed").texture("2", blockTexture(strippedLog)).texture("3", blockTexture(log));
//        ModelFile gateOpen = models().withExistingParent(gateName + "_open", ZawaFacilityConstruction.MOD_ID + ":block/fine_cable_fence_gate_open").texture("2", blockTexture(strippedLog)).texture("3", blockTexture(log));
//        getVariantBuilder(gateBlock).forAllStatesExcept(blockState -> {
//            ModelFile model = gateClosed;
//            if (blockState.getValue(FenceGateBlock.OPEN)) {
//                model = gateOpen;
//            }
//            return ConfiguredModel.builder()
//                    .modelFile(model)
//                    .rotationY((int) blockState.getValue(FenceGateBlock.FACING).toYRot())
//                    .uvLock(true)
//                    .build();
//        }, FenceGateBlock.POWERED);
    }

    public void strippedFineCableFenceSet(FenceBlock fenceBlock, /*FenceGateBlock gateBlock,*/ Block strippedLog) {
        String fenceName = fenceBlock.getRegistryName().toString();
        fourWayBlock(fenceBlock,
                models().withExistingParent(fenceName + "_post", ZawaFacilityConstruction.MOD_ID + ":block/stripped_fine_cable_fence_post").texture("2", blockTexture(strippedLog)).texture("3", appendTexture(strippedLog, "_top")),
                models().withExistingParent(fenceName + "_side", ZawaFacilityConstruction.MOD_ID + ":block/stripped_fine_cable_fence_side").texture("2", blockTexture(strippedLog)).texture("3", appendTexture(strippedLog, "_top")));

//        String gateName = gateBlock.getRegistryName().toString();
//        ModelFile gateClosed = models().withExistingParent(gateName + "_closed", ZawaFacilityConstruction.MOD_ID + ":block/stripped_fine_cable_fence_gate_closed").texture("2", blockTexture(strippedLog)).texture("3", appendTexture(strippedLog, "_top"));
//        ModelFile gateOpen = models().withExistingParent(gateName + "_open", ZawaFacilityConstruction.MOD_ID + ":block/stripped_fine_cable_fence_gate_open").texture("2", blockTexture(strippedLog)).texture("3", appendTexture(strippedLog, "_top"));
//        getVariantBuilder(gateBlock).forAllStatesExcept(blockState -> {
//            ModelFile model = gateClosed;
//            if (blockState.getValue(FenceGateBlock.OPEN)) {
//                model = gateOpen;
//            }
//            return ConfiguredModel.builder()
//                    .modelFile(model)
//                    .rotationY((int) blockState.getValue(FenceGateBlock.FACING).toYRot())
//                    .uvLock(true)
//                    .build();
//        }, FenceGateBlock.POWERED);
    }

    public void heavyStockFenceSet(FenceBlock fenceBlock, FenceGateBlock gateBlock, Block strippedLog, Block concrete) {
        String fenceName = fenceBlock.getRegistryName().toString();
        fourWayBlock(fenceBlock,
                models().withExistingParent(fenceName + "_post", ZawaFacilityConstruction.MOD_ID + ":block/heavy_stock_fence_post").texture("2", blockTexture(strippedLog)),
                models().withExistingParent(fenceName + "_side", ZawaFacilityConstruction.MOD_ID + ":block/heavy_stock_fence_side").texture("2", blockTexture(strippedLog)));

        String gateName = gateBlock.getRegistryName().toString();
        ModelFile gateClosed = models().withExistingParent(gateName + "_closed", ZawaFacilityConstruction.MOD_ID + ":block/heavy_stock_fence_gate_closed").texture("2", blockTexture(strippedLog)).texture("4", blockTexture(concrete));
        ModelFile gateOpen = models().withExistingParent(gateName + "_open", ZawaFacilityConstruction.MOD_ID + ":block/heavy_stock_fence_gate_open").texture("2", blockTexture(strippedLog)).texture("4", blockTexture(concrete));
        getVariantBuilder(gateBlock).forAllStatesExcept(blockState -> {
            ModelFile model = gateClosed;
            if (blockState.getValue(FenceGateBlock.OPEN)) {
                model = gateOpen;
            }
            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationY((int) blockState.getValue(FenceGateBlock.FACING).toYRot())
                    .uvLock(true)
                    .build();
        }, FenceGateBlock.POWERED);
    }

    public void minimalistFenceSet(FenceBlock fenceBlock, Block planks, Block concrete) {
        String fenceName = fenceBlock.getRegistryName().toString();
        fourWayBlock(fenceBlock,
                models().withExistingParent(fenceName + "_post", ZawaFacilityConstruction.MOD_ID + ":block/minimalist_fence_post").texture("0", blockTexture(concrete)).texture("1", blockTexture(planks)),
                models().withExistingParent(fenceName + "_side", ZawaFacilityConstruction.MOD_ID + ":block/minimalist_fence_side").texture("0", blockTexture(concrete)).texture("1", blockTexture(planks)));
    }

    public void blockSet(Block block, SlabBlock slabBlock, StairsBlock stairsBlock, WallBlock wallBlock) {
        simpleBlock(block);
        slabBlock(slabBlock, blockTexture(block), blockTexture(block));
        stairsBlock(stairsBlock, blockTexture(block));
        wallBlock(wallBlock, blockTexture(block));
        models().wallInventory(wallBlock.getRegistryName().getPath() + "_inventory", blockTexture(block));
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
