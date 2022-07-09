package com.ironlabs.moregems.init;

import com.ironlabs.moregems.MoreGems;
import com.ironlabs.moregems.blocks.PinkDiamondBlock;
import com.ironlabs.moregems.items.ItemBase;
import com.ironlabs.moregems.items.ModSpawnEggItem;
import com.ironlabs.moregems.items.PoisonAppleItem;
import com.ironlabs.moregems.util.enums.ModArmorMaterial;
import com.ironlabs.moregems.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreGems.MOD_ID);

    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register(ItemBase.RUBY_ITEM, ItemBase::new);
    public static final RegistryObject<Item> PINK_DIAMOND = ITEMS.register(ItemBase.PINK_DIAMOND_ITEM, ItemBase::new);

    public static final RegistryObject<PoisonAppleItem> POISON_APPLE = ITEMS.register("poison_apple", PoisonAppleItem::new);

    public static final RegistryObject<ModSpawnEggItem> HOG_SPAWN_EGG = ITEMS.register("hog_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityType.HOG, 0xE1A68B, 0x99593B, new Item.Properties().group(MoreGems.GEMS_TAB)));

    public static final RegistryObject<ModSpawnEggItem> DUCK_SPAWN_EGG = ITEMS.register("duck_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityType.DUCK, 0xE1A68B, 0x99593B, new Item.Properties().group(MoreGems.GEMS_TAB)));

    // Block Items
    // Ruby blocks
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",
            () -> new BlockItem(ModBlocks.RUBY_BLOCK.get(), new Item.Properties().group(MoreGems.GEMS_TAB)));

    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore",
            () -> new BlockItem(ModBlocks.RUBY_ORE.get(), new Item.Properties().group(MoreGems.GEMS_TAB)));

    // Pink diamond blocks
    public static final RegistryObject<Item> PINK_DIAMOND_BLOCK = ITEMS.register(PinkDiamondBlock.BLOCK_NAME,
            () -> new BlockItem(ModBlocks.PINK_DIAMOND_BLOCK.get(), new Item.Properties().group(MoreGems.GEMS_TAB)));

    public static final RegistryObject<Item> OVEN_ITEM = ITEMS.register("oven",
            () -> new BlockItem(ModBlocks.OVEN.get(), new Item.Properties().group(MoreGems.GEMS_TAB)));
    // Tools
    //Ruby tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModItemTier.RUBY, 2, -2.4F,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModItemTier.RUBY, 0, -2.8F,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModItemTier.RUBY, 0.5F, -3.0F,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModItemTier.RUBY, 5, -3.1F,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModItemTier.RUBY, -3, -1.0F,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));
    //Pink diamond tools
    public static final RegistryObject<SwordItem> PINK_DIAMOND_SWORD = ITEMS.register("pink_diamond_sword",
            () -> new SwordItem(ModItemTier.PINK_DIAMOND, 2, -2.8f,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));
    // Armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));

    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));

    public static final RegistryObject<ArmorItem> PRINCESS_HELMET = ITEMS.register("princess_helmet",
            () -> new ArmorItem(ModArmorMaterial.PRINCESS_ARMOR, EquipmentSlotType.HEAD,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));

    public static final RegistryObject<ArmorItem> PRINCESS_CHESTPLATE = ITEMS.register("princess_chestplate",
            () -> new ArmorItem(ModArmorMaterial.PRINCESS_ARMOR, EquipmentSlotType.CHEST,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));

    public static final RegistryObject<ArmorItem> PRINCESS_LEGGINGS = ITEMS.register("princess_leggings",
            () -> new ArmorItem(ModArmorMaterial.PRINCESS_ARMOR, EquipmentSlotType.LEGS,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));

    public static final RegistryObject<ArmorItem> PRINCESS_BOOTS = ITEMS.register("princess_boots",
            () -> new ArmorItem(ModArmorMaterial.PRINCESS_ARMOR, EquipmentSlotType.FEET,
                    new Item.Properties().group(MoreGems.GEMS_TAB)));
}
