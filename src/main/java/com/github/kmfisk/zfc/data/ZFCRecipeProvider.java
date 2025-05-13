package com.github.kmfisk.zfc.data;

import com.github.kmfisk.zfc.block.ZFCBlocks;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class ZFCRecipeProvider extends RecipeProvider {
    public ZFCRecipeProvider(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
//        ShapedRecipeBuilder.shaped(ZFCBlocks.FIRSTBLOCK.get())
//                .pattern("xxx")
//                .pattern("x#x")
//                .pattern("xxx")
//                .define('x', Tags.Items.COBBLESTONE)
//                .define('#', Tags.Items.DYES_RED)
//                .group("mytutorial")
//                .unlockedBy("cobblestone", InventoryChangeTrigger.Instance.hasItems(Blocks.COBBLESTONE))
//                .save(consumer);
    }
}
