package com.ironlabs.moregems.tools;

import com.ironlabs.moregems.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    RUBY(10, 1000, 20.0f, 100.0f, 12, () -> {
        return Ingredient.fromItems(ModItems.RUBY_SWORD.get());
    }),

    RUBY_PICKAXE(10, 1000, 20.0f, 100.0f, 12, () -> {
        return Ingredient.fromItems(ModItems.RUBY_AXE.get());
    }),

    RUBY_AXE(10, 1000, 20.0f, 100.0f, 12, () -> {
        return Ingredient.fromItems(ModItems.RUBY_PICKAXE.get());
    }),

    PINK_DIAMOND(10, 1000, 20.0f, 100.0f, 12, () -> {
        return Ingredient.fromItems(ModItems.PINK_DIAMOND_SWORD.get());
    });

    public static final String RUBY_SWORD = "ruby_sword";
    public static final String RUBY_PICK_AXE = "ruby_pickaxe";
    public static final String RUBY_AXE_TAG = "ruby_axe";
    public static final String PINK_DIAMOND_SWORD = "pink_diamond_sword";

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial(){
        return repairMaterial.get();
    }
}
