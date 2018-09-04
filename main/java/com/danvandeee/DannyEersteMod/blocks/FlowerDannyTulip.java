package com.danvandeee.DannyEersteMod.blocks;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FlowerDannyTulip extends BlockBase {
	
	
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
