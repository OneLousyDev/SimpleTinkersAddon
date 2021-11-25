package com.lousiesmods.simplefarmworld.handler.registry;

import com.lousiesmods.simplefarmworld.block.BlockTeleporter;
import com.lousiesmods.simplefarmworld.util.Reference;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry 
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);
	
	public static final RegistryObject<Block> PORTAL = BLOCKS.register("teleporter", BlockTeleporter::new);
	
	public static void registerBlocks()
	{
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
