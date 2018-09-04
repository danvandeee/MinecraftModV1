package com.danvandeee.DannyEersteMod.init;

import java.util.ArrayList;
import java.util.List;

import com.danvandeee.DannyEersteMod.blocks.BlockBase;
import com.danvandeee.DannyEersteMod.blocks.ChesterBlock;
import com.danvandeee.DannyEersteMod.blocks.ChesterBlock.Type;
import com.danvandeee.DannyEersteMod.blocks.FlowerDannyTulip;
import com.danvandeee.DannyEersteMod.blocks.RubyBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON);
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	
	public static final Block DANNY_BLOCK = new BlockBase("danny_block", Material.WOOD);
	
	public static final Block DANNY_TULIP = new FlowerDannyTulip("danny_tulip");
	
	public static final Block CHESTER_BLOCK = new ChesterBlock("chester_block", 0);


	
	
	
}
