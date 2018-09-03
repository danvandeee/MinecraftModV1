package com.danvandeee.DannyEersteMod;

import com.danvandeee.DannyEersteMod.init.ModItems;
import com.danvandeee.DannyEersteMod.proxy.CommonProxy;
import com.danvandeee.DannyEersteMod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		
		
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
		
		
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event) {
		
		
		
	}
	
	public static CreativeTabs tabDanMod = new CreativeTabs("tab_DanMod") {
		
		@Override
		public ItemStack getTabIconItem() {
			
			return new ItemStack(ModItems.RUBY);
		}
		
	};
	
	
	

}
