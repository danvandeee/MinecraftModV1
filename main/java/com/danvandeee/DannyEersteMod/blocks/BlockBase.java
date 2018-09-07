package com.danvandeee.DannyEersteMod.blocks;

import com.danvandeee.DannyEersteMod.Main;
import com.danvandeee.DannyEersteMod.init.ModBlocks;
import com.danvandeee.DannyEersteMod.init.ModItems;
import com.danvandeee.DannyEersteMod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBase extends Block implements IHasModel {

	private String dannyModName = "none"; 
	
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
	
	
	protected void setdannyModName (String modname) {
		this.dannyModName = modname;
		
	}
	
	protected String getdannyModName () {
		
		return this.dannyModName;
		
	}
	
	
	 public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, net.minecraftforge.common.IPlantable plantable)
	    {
	        IBlockState plant = plantable.getPlant(world, pos.offset(direction));
	        net.minecraftforge.common.EnumPlantType plantType = plantable.getPlantType(world, pos.offset(direction));

	        if (plant.getBlock() == com.danvandeee.DannyEersteMod.init.ModBlocks.DANNY_LIEFDES_CACTUS)
	        {
	            return (this.equals(com.danvandeee.DannyEersteMod.init.ModBlocks.DANNY_LIEFDES_CACTUS) || this.equals(net.minecraft.init.Blocks.SAND));
	        }
	        
	        if (plant.getBlock() == net.minecraft.init.Blocks.REEDS && this.equals(net.minecraft.init.Blocks.REEDS))
	        {
	            return true;
	        }

	        return false;
	    }
	 
	 
	 
	 public String toString()
	    {
	        return "Block{" + REGISTRY.getNameForObject(this) + "}";
	    }
	
	//super.canPlaceBlockAt(worldIn, pos)
	
	/*
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        return super.canPlaceBlockAt(worldIn, pos);
    }
	
	*/
	
	
	
	 
	
	
	
}
