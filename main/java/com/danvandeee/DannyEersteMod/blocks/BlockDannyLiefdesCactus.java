package com.danvandeee.DannyEersteMod.blocks;

import java.util.Random;
import java.util.function.Predicate;

import com.danvandeee.DannyEersteMod.Main;
import com.danvandeee.DannyEersteMod.blocks.interfacesdanny.CheckerofInstance;
import com.danvandeee.DannyEersteMod.init.ModBlocks;
import com.danvandeee.DannyEersteMod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockDannyLiefdesCactus extends BlockBase implements net.minecraftforge.common.IPlantable , CheckerofInstance// , CheckerofInstance
	{
		private boolean isCactus = true;
	    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 15);
	    protected static final AxisAlignedBB CACTUS_COLLISION_AABB = new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
	    protected static final AxisAlignedBB CACTUS_AABB = new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 1.0D, 0.9375D);

 
	    
	    public BlockDannyLiefdesCactus(String name)
	    {
	    	super(Material.CACTUS);
	        this.setDefaultState(this.blockState.getBaseState().withProperty(AGE, Integer.valueOf(0)));
	        this.setTickRandomly(true);
	        //this.setCreativeTab(CreativeTabs.DECORATIONS);
	        this.setHardness(3f);
	        
	        setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.tabDanMod);
			
			setdannyModName(name);
	        
	        ModBlocks.BLOCKS.add(this);
			ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	        
	    }

	    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
	        if (!worldIn.isAreaLoaded(pos, 1)) return; // Forge: prevent growing cactus from loading unloaded chunks with block update
	        BlockPos blockpos = pos.up();

	        if (worldIn.isAirBlock(blockpos))
	        {
	            int i;

	            for (i = 1; worldIn.getBlockState(pos.down(i)).getBlock() == this; ++i)
	            {
	                ;
	            }

	            if (i < 3)
	            {
	                int j = ((Integer)state.getValue(AGE)).intValue();

	                if(net.minecraftforge.common.ForgeHooks.onCropsGrowPre(worldIn, blockpos, state, true))
	                {
	                if (j == 15)
	                {
	                    worldIn.setBlockState(blockpos, this.getDefaultState());
	                    IBlockState iblockstate = state.withProperty(AGE, Integer.valueOf(0));
	                    worldIn.setBlockState(pos, iblockstate, 4);
	                    iblockstate.neighborChanged(worldIn, blockpos, this, pos);
	                }
	                else
	                {
	                    worldIn.setBlockState(pos, state.withProperty(AGE, Integer.valueOf(j + 1)), 4);
	                }
	                net.minecraftforge.common.ForgeHooks.onCropsGrowPost(worldIn, pos, state, worldIn.getBlockState(pos));
	                }
	            }
	        }
	    }

	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return CACTUS_COLLISION_AABB;
	    }

	    /**
	     * Return an AABB (in world coords!) that should be highlighted when the player is targeting this Block
	     */
	    @SideOnly(Side.CLIENT)
	    public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World worldIn, BlockPos pos)
	    {
	        return CACTUS_AABB.offset(pos);
	    }

	    public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

	    /**
	     * Used to determine ambient occlusion and culling when rebuilding chunks for render
	     */
	    public boolean isOpaqueCube(IBlockState state)
	    {
	        return false;
	    }

	    /**
	     * Checks if this block can be placed exactly at the given position.
	     */
	    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	    {
	        return super.canPlaceBlockAt(worldIn, pos) ? this.canBlockStay(worldIn, pos) : false;
	    }

	    /**
	     * Called when a neighboring block was changed and marks that this state should perform any checks during a neighbor
	     * change. Cases may include when redstone power is updated, cactus blocks popping off due to a neighboring solid
	     * block, etc.
	     */
	    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
	    {
	        if (!this.canBlockStay(worldIn, pos))
	        {
	            worldIn.destroyBlock(pos, true);
	        }
	    }

	    public boolean canBlockStay(World worldIn, BlockPos pos)
	    {
	        for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
	        {
	            Material material = worldIn.getBlockState(pos.offset(enumfacing)).getMaterial();

	            if (material.isSolid() || material == Material.LAVA)
	            {
	                return false;
	            }
	        }

	        IBlockState state = worldIn.getBlockState(pos.down());
	        
	        //dannycode
	        System.out.println("dannymessage: cansustainplant: " + state.getBlock().canSustainPlant(state, worldIn, pos.down(), EnumFacing.UP, this)) ;
	        System.out.println("dannymessage: state.getblock: " + state.getBlock()) ;
	        System.out.println("dannymessage: state: " + state + "worldin: "+  worldIn + "posdonw: "+pos.down() +"enumfacing: "+ EnumFacing.UP + "this: "+ this) ;
	        
	        
	       return state.getBlock().canSustainPlant(state, worldIn, pos.down(), EnumFacing.UP, this) && !worldIn.getBlockState(pos.up()).getMaterial().isLiquid();
	    //return ((getifCactus (state.getBlock()) || state.getBlock().canSustainPlant(state, worldIn, pos.down(), EnumFacing.UP, this)) && !worldIn.getBlockState(pos.up()).getMaterial().isLiquid());
	    }

	    /**
	     * Called When an Entity Collided with the Block
	     */
	    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	    {
	        entityIn.attackEntityFrom(DamageSource.CACTUS, 1.0F);
	    }

	    /**
	     * Convert the given metadata into a BlockState for this Block
	     */
	    public IBlockState getStateFromMeta(int meta)
	    {
	        return this.getDefaultState().withProperty(AGE, Integer.valueOf(meta));
	    }

	    @SideOnly(Side.CLIENT)
	    public BlockRenderLayer getBlockLayer()
	    {
	        return BlockRenderLayer.CUTOUT;
	    }

	    /**
	     * Convert the BlockState into the correct metadata value
	     */
	    public int getMetaFromState(IBlockState state)
	    {
	        return ((Integer)state.getValue(AGE)).intValue();
	    }

	    @Override
	    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
	    {
	        return net.minecraftforge.common.EnumPlantType.Desert;
	    }

	    @Override
	    public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos)
	    {
	        return getDefaultState();
	    }

	    protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {AGE});
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
	    
	    
	    private boolean getifCactus (Block block) {
			
	    	if (block instanceof CheckerofInstance) {
	    		
	    		
	    		return true;
	    	}
	    	else {
	    	return false;
	    	}
	    	
	    }

		@Override
		public String isInstanceType() {
			// TODO Auto-generated method stub
			return getdannyModName();
		}
		
		/**
	     * Get the Item that this Block should drop when harvested.
	     */
	    public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return ModItems.CACTUS_BIT;
	    }
	    
	    public int quantityDropped(Random random)
	    {
	        return 3 + random.nextInt(5);
	    }
	    
	    
	    
	}