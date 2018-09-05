package com.danvandeee.DannyEersteMod.blocks;

import com.danvandeee.DannyEersteMod.Main;
import com.danvandeee.DannyEersteMod.init.ModBlocks;
import com.danvandeee.DannyEersteMod.init.ModItems;
import com.danvandeee.DannyEersteMod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBase extends Block implements IHasModel {

	public BlockBase (String name, Material material){
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabDanMod);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
		
	}
	
	public BlockBase (Material material){
		super(material);
	}
	
	
	
	public BlockBase(Material materialIn, MapColor color)
    {
		super(materialIn, color);
       
    }
	
	

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	
	
	//super.canPlaceBlockAt(worldIn, pos)
	
	
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        return super.canPlaceBlockAt(worldIn, pos);
    }
	
}
