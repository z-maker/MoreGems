package com.ironlabs.moregems.world.gen;


import com.ironlabs.moregems.MoreGems;
import com.ironlabs.moregems.init.ModEntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = MoreGems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntitySpawns {

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {

            // Nether Mobs
            if (biome.getCategory() == Biome.Category.NETHER) { }

            // End Mobs
            else if (biome.getCategory() == Biome.Category.THEEND) { }

            // Overworld Mobs
            else {
                if (biome.getCategory() != Biome.Category.OCEAN) {
                    biome.getSpawns(EntityClassification.CREATURE)
                            .add(new Biome.SpawnListEntry(ModEntityType.HOG.get(), 10, 3, 5));
                }
            }
        }
    }
}
