package com.ironlabs.moregems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PinkDiamondBlock extends Block {

    public final static String BLOCK_NAME = "pink_diamond_block";

    public PinkDiamondBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f,6.0f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
