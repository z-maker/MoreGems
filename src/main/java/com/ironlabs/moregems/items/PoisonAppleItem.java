package com.ironlabs.moregems.items;

import com.ironlabs.moregems.MoreGems;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PoisonAppleItem extends Item {

    public PoisonAppleItem() {
        super(new Properties()
                .group(MoreGems.GEMS_TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.NAUSEA, 300, 0), 1)
                        .effect(new EffectInstance(Effects.POISON, 300, 1), 1)
                        .effect(new EffectInstance(Effects.HUNGER, 300, 0), 0.3f)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
