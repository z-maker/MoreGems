package com.ironlabs.moregems.util;

import com.ironlabs.moregems.MoreGems;
import com.ironlabs.moregems.blocks.BlockItemBase;
import com.ironlabs.moregems.blocks.PinkDiamondBlock;
import com.ironlabs.moregems.blocks.RubyBlock;
import com.ironlabs.moregems.items.ItemBase;
import com.ironlabs.moregems.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new
            DeferredRegister<>(ForgeRegistries.ITEMS, MoreGems.MOD_ID);

    public static final DeferredRegister<Block> BLOCKS = new
            DeferredRegister<>(ForgeRegistries.BLOCKS, MoreGems.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> RUBY = ITEMS.register(ItemBase.RUBY_ITEM, ItemBase::new);
    public static final RegistryObject<Item> PINK_DIAMOND = ITEMS.register(ItemBase.PINK_DIAMOND_ITEM, ItemBase::new);

    //Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register(ModItemTier.RUBY_SWORD,()->
            new SwordItem(ModItemTier.RUBY,2, -2.4f,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));

    public static final RegistryObject<SwordItem> PINK_DIAMOND_SWORD = ITEMS.register(ModItemTier.PINK_DIAMOND_SWORD,()->
            new SwordItem(ModItemTier.PINK_DIAMOND,2, -2.4f,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));

    //Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register(RubyBlock.BLOCK_NAME,RubyBlock::new);
    public static final RegistryObject<Block> PINK_DIAMOND_BLOCK = BLOCKS.register(PinkDiamondBlock.BLOCK_NAME,PinkDiamondBlock::new);

    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register(RubyBlock.BLOCK_NAME, ()-> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> PINK_DIAMOND_BLOCK_ITEM = ITEMS.register(PinkDiamondBlock.BLOCK_NAME, ()-> new BlockItemBase(PINK_DIAMOND_BLOCK.get()));

}