package com.danvandeee.DannyEersteMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase {

	public RubyBlock(String name, Material material) {
		super(name, material);
		
		
		setSoundType(SoundType.METAL);
		setHardness(1.5F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(1.0F);
		
		//setLightOpacity(1);
	}

}
