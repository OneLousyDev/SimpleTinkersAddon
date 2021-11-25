package com.lousiesmods.simplefarmworld.handler.registry;

import com.lousiesmods.simplefarmworld.util.Reference;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);
	
	public static final RegistryObject<Item> PORTAL = ITEMS.register("teleporter", () -> new BlockItem(BlockRegistry.PORTAL.get(), new Item.Properties().tab(ItemGroup.TAB_BREWING)));
	
	public static void registerItems()
	{
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
