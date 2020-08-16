package com.ironlabs.moregems.blocks;

import com.ironlabs.moregems.MoreGems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block blockIn) {
        super(blockIn, new Item.Properties().group(MoreGems.GEMS_TAB));
    }
}
