package com.lousiesmods.simplefarmworld;

import com.lousiesmods.simplefarmworld.handler.registry.BiomeRegistry;
import com.lousiesmods.simplefarmworld.handler.registry.BlockRegistry;
import com.lousiesmods.simplefarmworld.handler.registry.ItemRegistry;
import com.lousiesmods.simplefarmworld.util.Reference;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class SimpleFarmWorld
{
    public static final Logger LOGGER = LogManager.getLogger();

    public SimpleFarmWorld()
    {
    	BlockRegistry.registerBlocks();
    	ItemRegistry.registerItems();
    	
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	BiomeDictionary.addTypes(RegistryKey.create(Registry.BIOME_REGISTRY, BiomeRegistry.FARM_WORLD.getId()), BiomeRegistry.Type.FARM_WORLD);
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
    	
    }
}