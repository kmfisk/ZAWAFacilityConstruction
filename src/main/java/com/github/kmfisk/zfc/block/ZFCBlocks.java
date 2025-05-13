package com.github.kmfisk.zfc.block;

import com.github.kmfisk.zfc.ZawaFacilityConstruction;
import com.github.kmfisk.zfc.item.ZFCItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.block.ZawaFenceBlock;
import org.zawamod.zawa.world.block.ZawaFenceGateBlock;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ZFCBlocks {
    public static final DeferredRegister<Block> REGISTRAR = DeferredRegister.create(ForgeRegistries.BLOCKS, ZawaFacilityConstruction.MOD_ID);

    // AMENITIES
//    public static final RegistryObject<Block> DRINKING_FOUNTAIN = registerWithItem("drinking_fountain", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
//    public static final RegistryObject<Block> ZOO_DRINKING_FOUNTAIN = registerWithItem("zoo_drinking_fountain", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COIN_FEEDER = registerWithItem("coin_feeder", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
//    public static final RegistryObject<Block> BLACK_WIRE_SHELF = registerWithItem("black_wire_shelf", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
//    public static final RegistryObject<Block> GREEN_WIRE_SHELF = registerWithItem("green_wire_shelf", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
//    public static final RegistryObject<Block> STEEL_WIRE_SHELF = registerWithItem("steel_wire_shelf", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    // FENCES
    public static final Map<String, RegistryObject<Block>> FINE_CABLE_FENCES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> FINE_CABLE_FENCE_GATES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> STRIPPED_FINE_CABLE_FENCES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> STRIPPED_FINE_CABLE_FENCE_GATES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BRANCH_FENCES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BRANCH_FENCE_GATES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BALCONY_FENCES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BALCONY_FENCE_GATES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> HEAVY_STOCK_FENCES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> HEAVY_STOCK_FENCE_GATES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> MINIMALISTIC_FENCES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> WOOD_BARRIER_FENCES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> WOOD_BARRIER_FENCE_GATES = new HashMap<>();

    // RAILS
    public static final Map<String, RegistryObject<Block>> WOOD_RAILS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> STONE_RAILS = new HashMap<>();
    public static final RegistryObject<Block> METAL_RAIL = registerWithItem("metal_rail", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    // BLOCK SETS
    public static final RegistryObject<Block> BIG_MIXED_STONE = registerWithItem("big_mixed_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<SlabBlock> BIG_MIXED_STONE_SLAB = registerWithItem("big_mixed_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BIG_MIXED_STONE.get())));
    public static final RegistryObject<StairsBlock> BIG_MIXED_STONE_STAIRS = registerWithItem("big_mixed_stone_stairs", () -> new StairsBlock(() -> BIG_MIXED_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BIG_MIXED_STONE.get())));
    public static final RegistryObject<WallBlock> BIG_MIXED_STONE_WALL = registerWithItem("big_mixed_stone_wall", () -> new WallBlock(AbstractBlock.Properties.copy(BIG_MIXED_STONE.get())));
    public static final RegistryObject<Block> BIG_MIXED_RED_SANDSTONE = registerWithItem("big_mixed_red_sandstone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<SlabBlock> BIG_MIXED_RED_SANDSTONE_SLAB = registerWithItem("big_mixed_red_sandstone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BIG_MIXED_RED_SANDSTONE.get())));
    public static final RegistryObject<StairsBlock> BIG_MIXED_RED_SANDSTONE_STAIRS = registerWithItem("big_mixed_red_sandstone_stairs", () -> new StairsBlock(() -> BIG_MIXED_RED_SANDSTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BIG_MIXED_RED_SANDSTONE.get())));
    public static final RegistryObject<WallBlock> BIG_MIXED_RED_SANDSTONE_WALL = registerWithItem("big_mixed_red_sandstone_wall", () -> new WallBlock(AbstractBlock.Properties.copy(BIG_MIXED_RED_SANDSTONE.get())));
    public static final RegistryObject<Block> BIG_MIXED_SANDSTONE = registerWithItem("big_mixed_sandstone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<SlabBlock> BIG_MIXED_SANDSTONE_SLAB = registerWithItem("big_mixed_sandstone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BIG_MIXED_SANDSTONE.get())));
    public static final RegistryObject<StairsBlock> BIG_MIXED_SANDSTONE_STAIRS = registerWithItem("big_mixed_sandstone_stairs", () -> new StairsBlock(() -> BIG_MIXED_SANDSTONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BIG_MIXED_SANDSTONE.get())));
    public static final RegistryObject<WallBlock> BIG_MIXED_SANDSTONE_WALL = registerWithItem("big_mixed_sandstone_wall", () -> new WallBlock(AbstractBlock.Properties.copy(BIG_MIXED_SANDSTONE.get())));
    public static final RegistryObject<Block> MIXED_BLACK_STONE = registerWithItem("mixed_black_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<SlabBlock> MIXED_BLACK_STONE_SLAB = registerWithItem("mixed_black_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(MIXED_BLACK_STONE.get())));
    public static final RegistryObject<StairsBlock> MIXED_BLACK_STONE_STAIRS = registerWithItem("mixed_black_stone_stairs", () -> new StairsBlock(() -> MIXED_BLACK_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(MIXED_BLACK_STONE.get())));
    public static final RegistryObject<WallBlock> MIXED_BLACK_STONE_WALL = registerWithItem("mixed_black_stone_wall", () -> new WallBlock(AbstractBlock.Properties.copy(MIXED_BLACK_STONE.get())));
    public static final RegistryObject<Block> BIG_MIXED_BLACK_STONE = registerWithItem("big_mixed_black_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<SlabBlock> BIG_MIXED_BLACK_STONE_SLAB = registerWithItem("big_mixed_black_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BIG_MIXED_BLACK_STONE.get())));
    public static final RegistryObject<StairsBlock> BIG_MIXED_BLACK_STONE_STAIRS = registerWithItem("big_mixed_black_stone_stairs", () -> new StairsBlock(() -> BIG_MIXED_BLACK_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BIG_MIXED_BLACK_STONE.get())));
    public static final RegistryObject<WallBlock> BIG_MIXED_BLACK_STONE_WALL = registerWithItem("big_mixed_black_stone_wall", () -> new WallBlock(AbstractBlock.Properties.copy(BIG_MIXED_BLACK_STONE.get())));
    public static final RegistryObject<Block> MIXED_DARK_STONE = registerWithItem("mixed_dark_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<SlabBlock> MIXED_DARK_STONE_SLAB = registerWithItem("mixed_dark_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(MIXED_DARK_STONE.get())));
    public static final RegistryObject<StairsBlock> MIXED_DARK_STONE_STAIRS = registerWithItem("mixed_dark_stone_stairs", () -> new StairsBlock(() -> MIXED_DARK_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(MIXED_DARK_STONE.get())));
    public static final RegistryObject<WallBlock> MIXED_DARK_STONE_WALL = registerWithItem("mixed_dark_stone_wall", () -> new WallBlock(AbstractBlock.Properties.copy(MIXED_DARK_STONE.get())));
    public static final RegistryObject<Block> BIG_MIXED_DARK_STONE = registerWithItem("big_mixed_dark_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<SlabBlock> BIG_MIXED_DARK_STONE_SLAB = registerWithItem("big_mixed_dark_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BIG_MIXED_DARK_STONE.get())));
    public static final RegistryObject<StairsBlock> BIG_MIXED_DARK_STONE_STAIRS = registerWithItem("big_mixed_dark_stone_stairs", () -> new StairsBlock(() -> BIG_MIXED_DARK_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BIG_MIXED_DARK_STONE.get())));
    public static final RegistryObject<WallBlock> BIG_MIXED_DARK_STONE_WALL = registerWithItem("big_mixed_dark_stone_wall", () -> new WallBlock(AbstractBlock.Properties.copy(BIG_MIXED_DARK_STONE.get())));
    public static final RegistryObject<Block> MIXED_RIVER_STONE = registerWithItem("mixed_river_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<SlabBlock> MIXED_RIVER_STONE_SLAB = registerWithItem("mixed_river_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(MIXED_RIVER_STONE.get())));
    public static final RegistryObject<StairsBlock> MIXED_RIVER_STONE_STAIRS = registerWithItem("mixed_river_stone_stairs", () -> new StairsBlock(() -> MIXED_RIVER_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(MIXED_RIVER_STONE.get())));
    public static final RegistryObject<WallBlock> MIXED_RIVER_STONE_WALL = registerWithItem("mixed_river_stone_wall", () -> new WallBlock(AbstractBlock.Properties.copy(MIXED_RIVER_STONE.get())));
    public static final RegistryObject<Block> BIG_MIXED_RIVER_STONE = registerWithItem("big_mixed_river_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<SlabBlock> BIG_MIXED_RIVER_STONE_SLAB = registerWithItem("big_mixed_river_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BIG_MIXED_RIVER_STONE.get())));
    public static final RegistryObject<StairsBlock> BIG_MIXED_RIVER_STONE_STAIRS = registerWithItem("big_mixed_river_stone_stairs", () -> new StairsBlock(() -> BIG_MIXED_RIVER_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BIG_MIXED_RIVER_STONE.get())));
    public static final RegistryObject<WallBlock> BIG_MIXED_RIVER_STONE_WALL = registerWithItem("big_mixed_river_stone_wall", () -> new WallBlock(AbstractBlock.Properties.copy(BIG_MIXED_RIVER_STONE.get())));
    public static final RegistryObject<Block> MIXED_WHITE_STONE = registerWithItem("mixed_white_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<SlabBlock> MIXED_WHITE_STONE_SLAB = registerWithItem("mixed_white_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(MIXED_WHITE_STONE.get())));
    public static final RegistryObject<StairsBlock> MIXED_WHITE_STONE_STAIRS = registerWithItem("mixed_white_stone_stairs", () -> new StairsBlock(() -> MIXED_WHITE_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(MIXED_WHITE_STONE.get())));
    public static final RegistryObject<WallBlock> MIXED_WHITE_STONE_WALL = registerWithItem("mixed_white_stone_wall", () -> new WallBlock(AbstractBlock.Properties.copy(MIXED_WHITE_STONE.get())));
    public static final RegistryObject<Block> BIG_MIXED_WHITE_STONE = registerWithItem("big_mixed_white_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<SlabBlock> BIG_MIXED_WHITE_STONE_SLAB = registerWithItem("big_mixed_white_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BIG_MIXED_WHITE_STONE.get())));
    public static final RegistryObject<StairsBlock> BIG_MIXED_WHITE_STONE_STAIRS = registerWithItem("big_mixed_white_stone_stairs", () -> new StairsBlock(() -> BIG_MIXED_WHITE_STONE.get().defaultBlockState(), AbstractBlock.Properties.copy(BIG_MIXED_WHITE_STONE.get())));
    public static final RegistryObject<WallBlock> BIG_MIXED_WHITE_STONE_WALL = registerWithItem("big_mixed_white_stone_wall", () -> new WallBlock(AbstractBlock.Properties.copy(BIG_MIXED_WHITE_STONE.get())));

    // BAR SETS
    public static final RegistryObject<Block> HEAVY_DUTY_BARS = registerWithItem("heavy_duty_bars", () -> new GlassBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).requiresCorrectToolForDrops().strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).noOcclusion().isValidSpawn(ZFCBlocks::neverSpawns).isRedstoneConductor(ZFCBlocks::never).isSuffocating(ZFCBlocks::never).isViewBlocking(ZFCBlocks::never)));
    public static final RegistryObject<DoorBlock> HEAVY_DUTY_BARS_DOOR = registerWithItem("heavy_duty_bars_door", () -> new DoorBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<PaneBlock> HEAVY_DUTY_BARS_FENCE = registerWithItem("heavy_duty_bars_fence", () -> new PaneBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<SlabBlock> HEAVY_DUTY_BARS_SLAB = registerWithItem("heavy_duty_bars_slab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> HEAVY_DUTY_BARS_TRAPDOOR = registerWithItem("heavy_duty_bars_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(3.0F).sound(SoundType.METAL).noOcclusion().isValidSpawn(ZFCBlocks::neverSpawns)));
    public static final RegistryObject<Block> VERTICAL_BARS = registerWithItem("vertical_bars", () -> new GlassBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).requiresCorrectToolForDrops().strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).noOcclusion().isValidSpawn(ZFCBlocks::neverSpawns).isRedstoneConductor(ZFCBlocks::never).isSuffocating(ZFCBlocks::never).isViewBlocking(ZFCBlocks::never)));
    public static final RegistryObject<DoorBlock> VERTICAL_BARS_DOOR = registerWithItem("vertical_bars_door", () -> new DoorBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<PaneBlock> VERTICAL_BARS_FENCE = registerWithItem("vertical_bars_fence", () -> new PaneBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<SlabBlock> VERTICAL_BARS_SLAB = registerWithItem("vertical_bars_slab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> VERTICAL_BARS_TRAPDOOR = registerWithItem("vertical_bars_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(3.0F).sound(SoundType.METAL).noOcclusion().isValidSpawn(ZFCBlocks::neverSpawns)));
    public static final RegistryObject<Block> CAST_IRON_BARS = registerWithItem("cast_iron_bars", () -> new GlassBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).requiresCorrectToolForDrops().strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).noOcclusion().isValidSpawn(ZFCBlocks::neverSpawns).isRedstoneConductor(ZFCBlocks::never).isSuffocating(ZFCBlocks::never).isViewBlocking(ZFCBlocks::never)));
    public static final RegistryObject<DoorBlock> CAST_IRON_BARS_DOOR = registerWithItem("cast_iron_bars_door", () -> new DoorBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<PaneBlock> CAST_IRON_BARS_FENCE = registerWithItem("cast_iron_bars_fence", () -> new PaneBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<SlabBlock> CAST_IRON_BARS_SLAB = registerWithItem("cast_iron_bars_slab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(2.0F, 3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<TrapDoorBlock> CAST_IRON_BARS_TRAPDOOR = registerWithItem("cast_iron_bars_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(3.0F).sound(SoundType.METAL).noOcclusion().isValidSpawn(ZFCBlocks::neverSpawns)));

    // ETC
    public static final RegistryObject<Block> DRAINAGE_PIPE = registerWithItem("drainage_pipe", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    static {
        for (String type : new String[]{"acacia", /*"bamboo",*/ "birch", /*"cherry",*/ "dark_oak", "jungle", /*"mangrove",*/ "oak", "spruce", "crimson", "warped"}) {
            FINE_CABLE_FENCES.put(type, registerWithItem(type + "_fine_cable_fence", () -> new ZawaFenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 3.0F).harvestTool(ToolType.AXE).sound(SoundType.WOOD))));
            FINE_CABLE_FENCE_GATES.put(type, registerWithItem(type + "_fine_cable_fence_gate", () -> new ZawaFenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 3.0F).harvestTool(ToolType.AXE).sound(SoundType.WOOD))));
            STRIPPED_FINE_CABLE_FENCES.put(type, registerWithItem("stripped_" + type + "_fine_cable_fence", () -> new ZawaFenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 3.0F).harvestTool(ToolType.AXE).sound(SoundType.WOOD))));
            STRIPPED_FINE_CABLE_FENCE_GATES.put(type, registerWithItem("stripped_" + type + "_fine_cable_fence_gate", () -> new ZawaFenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 3.0F).harvestTool(ToolType.AXE).sound(SoundType.WOOD))));
            BRANCH_FENCES.put(type, registerWithItem(type + "_branch_fence", () -> new ZawaFenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 3.0F).harvestTool(ToolType.AXE).sound(SoundType.WOOD))));
            BRANCH_FENCE_GATES.put(type, registerWithItem(type + "_branch_fence_gate", () -> new ZawaFenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 3.0F).harvestTool(ToolType.AXE).sound(SoundType.WOOD))));
            BALCONY_FENCES.put(type, registerWithItem(type + "_balcony_fence", () -> new ZawaFenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 3.0F).harvestTool(ToolType.AXE).sound(SoundType.WOOD))));
            BALCONY_FENCE_GATES.put(type, registerWithItem(type + "_balcony_fence_gate", () -> new ZawaFenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 3.0F).harvestTool(ToolType.AXE).sound(SoundType.WOOD))));
            HEAVY_STOCK_FENCES.put(type, registerWithItem(type + "_heavy_stock_fence", () -> new ZawaFenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 3.0F).harvestTool(ToolType.AXE).sound(SoundType.WOOD))));
            HEAVY_STOCK_FENCE_GATES.put(type, registerWithItem(type + "_heavy_stock_fence_gate", () -> new ZawaFenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 3.0F).harvestTool(ToolType.AXE).sound(SoundType.WOOD))));
            MINIMALISTIC_FENCES.put(type, registerWithItem(type + "_minimalistic_fence", () -> new ZawaFenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 3.0F).harvestTool(ToolType.AXE).sound(SoundType.WOOD))));
            WOOD_BARRIER_FENCES.put(type, registerWithItem(type + "_barrier_fence", () -> new ZawaFenceBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 3.0F).harvestTool(ToolType.AXE).sound(SoundType.WOOD))));
            WOOD_BARRIER_FENCE_GATES.put(type, registerWithItem(type + "_barrier_fence_gate", () -> new ZawaFenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 3.0F).harvestTool(ToolType.AXE).sound(SoundType.WOOD))));
            WOOD_RAILS.put(type, registerWithItem(type + "_wood_rail", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))));
        }

        for (String type : new String[]{"andesite", "cobblestone", "diorite", "granite", "sandstone", "stone", "stone_brick"}) {
            STONE_RAILS.put(type, registerWithItem(type + "_stone_rail", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))));
        }
    }

    private static boolean neverSpawns(BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> type) {
        return false;
    }

    private static boolean never(BlockState state, IBlockReader reader, BlockPos pos) {
        return false;
    }

    private static <T extends Block> RegistryObject<T> registerWithItem(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = REGISTRAR.register(name, block);
        ZFCItems.REGISTRAR.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties().tab(Zawa.DECORATIONS_GROUP)));
        return registryObject;
    }

    public static void setRenderLayers() {
        RenderType cutoutMipped = RenderType.cutoutMipped();
        RenderType cutout = RenderType.cutout();

        RenderTypeLookup.setRenderLayer(HEAVY_DUTY_BARS_FENCE.get(), cutoutMipped);
        RenderTypeLookup.setRenderLayer(HEAVY_DUTY_BARS_SLAB.get(), cutoutMipped);
        RenderTypeLookup.setRenderLayer(VERTICAL_BARS_FENCE.get(), cutoutMipped);
        RenderTypeLookup.setRenderLayer(VERTICAL_BARS_SLAB.get(), cutoutMipped);
        RenderTypeLookup.setRenderLayer(CAST_IRON_BARS_FENCE.get(), cutoutMipped);
        RenderTypeLookup.setRenderLayer(CAST_IRON_BARS_SLAB.get(), cutoutMipped);

        RenderTypeLookup.setRenderLayer(HEAVY_DUTY_BARS.get(), cutout);
        RenderTypeLookup.setRenderLayer(HEAVY_DUTY_BARS_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(HEAVY_DUTY_BARS_TRAPDOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(VERTICAL_BARS.get(), cutout);
        RenderTypeLookup.setRenderLayer(VERTICAL_BARS_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(VERTICAL_BARS_TRAPDOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(CAST_IRON_BARS.get(), cutout);
        RenderTypeLookup.setRenderLayer(CAST_IRON_BARS_DOOR.get(), cutout);
        RenderTypeLookup.setRenderLayer(CAST_IRON_BARS_TRAPDOOR.get(), cutout);
    }
}
