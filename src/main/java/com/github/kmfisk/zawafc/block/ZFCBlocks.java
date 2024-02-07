package com.github.kmfisk.zawafc.block;

import com.github.kmfisk.zawafc.ZawaFacilityConstruction;
import com.github.kmfisk.zawafc.item.ZFCItems;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;

import java.util.function.Supplier;

public class ZFCBlocks {
    public static final DeferredRegister<Block> REGISTRAR = DeferredRegister.create(ForgeRegistries.BLOCKS, ZawaFacilityConstruction.MOD_ID);



    private static <T extends Block> RegistryObject<T> registerWithItem(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = REGISTRAR.register(name, block);
        ZFCItems.REGISTRAR.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties().tab(Zawa.DECORATIONS_GROUP)));
        return registryObject;
    }

    public static void setRenderLayers() {
        RenderType cutoutMipped = RenderType.cutoutMipped();
    }
}
