package farmmode;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockSeaPlant extends Block {
   public BlockSeaPlant(Material p_i149691_1_) {
      super(p_i149691_1_);
      float var2 = 0.375F;
      this.func_149676_a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, 1.0F, 0.5F + var2);
      this.func_149675_a(true);
      this.func_149711_c(0.1F);
      this.func_149647_a(ModStart.BlockTab);
   }

   protected final void checkBlockCoordValid(World par1World, int par2, int par3, int par4) {
      if (!this.func_149718_j(par1World, par2, par3, par4)) {
         this.func_149697_b(par1World, par2, par3, par4, par1World.func_72805_g(par2, par3, par4), 0);
         par1World.func_147468_f(par2, par3, par4);
      }

   }

   public boolean func_149718_j(World var1, int var2, int var3, int var4) {
      return super.func_149742_c(var1, var2, var3, var4) ? this.func_149718_j(var1, var2, var3, var4) : false;
   }

   public AxisAlignedBB func_149668_a(World par1World, int par2, int par3, int par4) {
      return null;
   }

   public boolean func_149662_c() {
      return false;
   }

   public boolean func_149686_d() {
      return false;
   }

   public int func_149645_b() {
      return 1;
   }
}
