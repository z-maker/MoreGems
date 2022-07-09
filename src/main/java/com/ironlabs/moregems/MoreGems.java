package com.ironlabs.moregems;

import com.ironlabs.moregems.entities.DuckEntity;
import com.ironlabs.moregems.entities.HogEntity;
import com.ironlabs.moregems.init.ModBlocks;
import com.ironlabs.moregems.init.ModEntityType;
import com.ironlabs.moregems.init.ModItems;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;

@Mod("more_gems")
public class MoreGems
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "more_gems";

    public MoreGems() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModEntityType.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());

        //RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    //Add a line for every mob to set custom attributes
    private void setup(final FMLCommonSetupEvent event){
        DeferredWorkQueue.runLater(()->{
            GlobalEntityTypeAttributes.put(
                    ModEntityType.HOG.get(),
                    HogEntity.setCustomAttributes().func_233813_a_()
            );
            GlobalEntityTypeAttributes.put(
                    ModEntityType.DUCK.get(),
                    DuckEntity.setCustomAttributes().func_233813_a_()
            );
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    //Creative tabs
    public static final ItemGroup GEMS_TAB = new ItemGroup("gems_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }
    };

//[15:47:51] [Worker-Main-2/ERROR] [minecraft/GlobalEntityTypeAttributes]: Entity more_gems:hog has no attributes
}
