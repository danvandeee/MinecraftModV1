package com.danvandeee.DannyEersteMod.Items;

import com.danvandeee.DannyEersteMod.Main;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ArrowYellow extends ItemBase {
	
	public ArrowYellow (String name) {
		super(name);
		
	}
	 
	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter)
	    {
	        EntityTippedArrow entitytippedarrow = new EntityTippedArrow(worldIn, shooter);
	        entitytippedarrow.setPotionEffect(stack);
	        return entitytippedarrow;
	    }

	    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.EntityPlayer player)
	    {
	        int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.INFINITY, bow);
	        return enchant <= 0 ? false : this.getClass() == ArrowYellow.class;
	    }
	

}
