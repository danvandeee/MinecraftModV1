package com.danvandeee.DannyEersteMod.blocks;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FlowerDannyTulip extends BlockBase implements net.minecraftforge.common.IPlantable {
	
	
	// private static final BlockFlower.EnumFlowerType[][] TYPES_FOR_BLOCK = new BlockFlower.EnumFlowerType[BlockFlower.EnumFlowerColor.values().length][];
     //private final BlockFlower.EnumFlowerColor blockType;
     //private final int meta;
    // private String name = "bloempie";
   //  private  String unlocalizedName = "bloempie";
	
		public FlowerDannyTulip (String name) {
			super(name, Material.WOOD);
			
			
			setSoundType(SoundType.METAL);
			setHardness(1.5F);
			setResistance(10.0F);
			//setHarvestLevel("pickaxe", 1);
			setLightLevel(1.0F);
			
			//setLightOpacity(1);
			
			
			
			
			
		}


		@Override
		public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean isOpaqueCube(IBlockState state)
	    {
	        return false;
	    }
		
		@Override
		public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }
		
		@Override
	    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
	    {
	        if (this == Blocks.WHEAT)          return net.minecraftforge.common.EnumPlantType.Crop;
	        if (this == Blocks.CARROTS)        return net.minecraftforge.common.EnumPlantType.Crop;
	        if (this == Blocks.POTATOES)       return net.minecraftforge.common.EnumPlantType.Crop;
	        if (this == Blocks.BEETROOTS)      return net.minecraftforge.common.EnumPlantType.Crop;
	        if (this == Blocks.MELON_STEM)     return net.minecraftforge.common.EnumPlantType.Crop;
	        if (this == Blocks.PUMPKIN_STEM)   return net.minecraftforge.common.EnumPlantType.Crop;
	       // if (this == Blocks.DEADBUSH)       return net.minecraftforge.common.EnumPlantType.Desert;
	        if (this == Blocks.WATERLILY)      return net.minecraftforge.common.EnumPlantType.Water;
	      //  if (this == Blocks.RED_MUSHROOM)   return net.minecraftforge.common.EnumPlantType.Cave;
	       // if (this == Blocks.BROWN_MUSHROOM) return net.minecraftforge.common.EnumPlantType.Cave;
	        if (this == Blocks.NETHER_WART)    return net.minecraftforge.common.EnumPlantType.Nether;
	        if (this == Blocks.SAPLING)        return net.minecraftforge.common.EnumPlantType.Plains;
	      //  if (this == Blocks.TALLGRASS)      return net.minecraftforge.common.EnumPlantType.Plains;
	       // if (this == Blocks.DOUBLE_PLANT)   return net.minecraftforge.common.EnumPlantType.Plains;
	      //  if (this == Blocks.RED_FLOWER)     return net.minecraftforge.common.EnumPlantType.Plains;
	      //  if (this == Blocks.YELLOW_FLOWER)  return net.minecraftforge.common.EnumPlantType.Plains;
	        return net.minecraftforge.common.EnumPlantType.Plains;
	    }


	    @SideOnly(Side.CLIENT)
	    public BlockRenderLayer getBlockLayer()
	    {
	        return BlockRenderLayer.CUTOUT;
	    }

	    /**
	     * Get the geometry of the queried face at the given position and state. This is used to decide whether things like
	     * buttons are allowed to be placed on the face, or how glass panes connect to the face, among other things.
	     * <p>
	     * Common values are {@code SOLID}, which is the default, and {@code UNDEFINED}, which represents something that
	     * does not fit the other descriptions and will generally cause other things not to connect to the face.
	     * 
	     * @return an approximation of the form of the given face
	     */
	    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }
		
		
		/*
		
		public String toString()
        {
            return this.name;
        }

        public String getName()
        {
            return this.name;
        }

        public String getUnlocalizedName()
        {
            return this.unlocalizedName;
        }
	
	*/
	
	
}
