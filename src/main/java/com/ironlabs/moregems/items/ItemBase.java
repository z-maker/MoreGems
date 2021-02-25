package com.ironlabs.moregems.items;

import com.ironlabs.moregems.MoreGems;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public static final String RUBY_ITEM = "ruby";
    public static final String PINK_DIAMOND_ITEM = "pink_diamond";


    public ItemBase() {
        super(new Properties().group(MoreGems.GEMS_TAB));
    }
}
