package com.danvandeee.DannyEersteMod.init;

import java.util.ArrayList;
import java.util.List;

import com.danvandeee.DannyEersteMod.Items.ArrowYellow;
import com.danvandeee.DannyEersteMod.Items.DannyItemFood;
import com.danvandeee.DannyEersteMod.Items.ItemBase;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.ForgeRegistries;



public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item DANSTICK = new ItemBase("danstick");
	public static final Item DANSTEEN = new ItemBase("dansteen");
	
	
	public static final Item ARROWYELLOW = new ArrowYellow("arrowyellow");
	
	//public static final Item CACTUS_BIT = new ItemFood(2, 0.3F, false).setUnlocalizedName("danny_cactus_chunk");
	public static final Item CACTUS_BIT = new DannyItemFood("danny_cactus_chunk", 20, 0.0F, false);
	
	
	
}
