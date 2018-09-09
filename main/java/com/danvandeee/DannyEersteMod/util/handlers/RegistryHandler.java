package com.danvandeee.DannyEersteMod.util.handlers;

import com.danvandeee.DannyEersteMod.init.ModBlocks;
import com.danvandeee.DannyEersteMod.init.ModItems;
import com.danvandeee.DannyEersteMod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
		
		
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		
		
	}
	
	@SubscribeEvent
	public static void onIRecipeRegister(RegistryEvent.Register<IRecipe> event) {
		
		event.getRegistry().registerAll();
		
	}
	
	
	
	
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		
		for (Item item : ModItems.ITEMS) {
			if (item instanceof IHasModel) {
				
				((IHasModel)item).registerModels();
				
				
			}
			
			
		}
		
		for (Block block : ModBlocks.BLOCKS) {
			if (block instanceof IHasModel) {
				
				((IHasModel)block).registerModels();
				
				
			}
			
			
		}
		
		
		
	}
	
	
}
