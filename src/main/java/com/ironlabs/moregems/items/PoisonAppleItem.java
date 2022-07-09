package com.ironlabs.moregems.items;

import com.ironlabs.moregems.MoreGems;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.function.Supplier;

public class PoisonAppleItem extends Item {

    public PoisonAppleItem() {

        super(new Properties()
                .group(MoreGems.GEMS_TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.2f)
                        .effect(effectInstanceSupplier(Effects.GLOWING),1f)
                        .effect(effectInstanceSupplier(Effects.NIGHT_VISION),1f)
                        .effect(effectInstanceSupplier(Effects.STRENGTH),1f)
                        .effect(effectInstanceSupplier(Effects.HERO_OF_THE_VILLAGE),1f)
                        .effect(effectInstanceSupplier(Effects.REGENERATION),1f)
                        .setAlwaysEdible()
                        .build())
        );
    }

    public static Supplier<EffectInstance> effectInstanceSupplier(Effect effect){
        return () -> new EffectInstance(effect,600,1);
    }

}
