package com.danvandeee.DannyEersteMod.Items;

import com.danvandeee.DannyEersteMod.Main;
import com.danvandeee.DannyEersteMod.init.ModItems;
import com.danvandeee.DannyEersteMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
		setUnlocalizedName(name);	
		setRegistryName(name);
		setCreativeTab(Main.tabDanMod); 
		ModItems.ITEMS.add(this);
		
	}
	
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
