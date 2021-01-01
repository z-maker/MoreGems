package com.ironlabs.moregems.armor;

import com.ironlabs.moregems.MoreGems;
import com.ironlabs.moregems.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    RUBY(MoreGems.MOD_ID + ":ruby", 25,new int[]{2,5,5,2},18,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10f, () -> Ingredient.fromItems(RegistryHandler.RUBY.get())),

    PINK_DIAMOND(MoreGems.MOD_ID + ":pink_diamond", 25,new int[]{2,5,5,2},18,
        SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10f, () -> Ingredient.fromItems(RegistryHandler.PINK_DIAMOND.get())),

    PRINCESS_ARMOR(MoreGems.MOD_ID + ":princess_armor", 25, new int[]{2,5,5,10},25,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10f, () -> Ingredient.fromItems(RegistryHandler.RUBY.get()))
    ;


    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13} ;
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmount;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmount, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmount = damageReductionAmount;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmount[slotIn.getIndex()] ;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }


}
