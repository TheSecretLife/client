package npcseller;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockC extends BlockContainer {
   public BlockC() {
      super(Material.field_151573_f);
      this.func_149647_a(Main.BlockTab);
      this.func_149676_a(-0.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F);
   }

   public void func_149749_a(World world, int x, int y, int z, Block block, int meta) {
      super.func_149749_a(world, x, y, z, block, meta);
   }

   public void func_149689_a(World par1World, int par2, int par3, int par4, EntityLivingBase placer, ItemStack stack) {
      int l = MathHelper.func_76128_c((double)(placer.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      if (l == 0) {
         par1World.func_72921_c(par2, par3, par4, 5, 2);
      }

      if (l == 1) {
         par1World.func_72921_c(par2, par3, par4, 2, 2);
      }

      if (l == 2) {
         par1World.func_72921_c(par2, par3, par4, 3, 2);
      }

      if (l == 3) {
         par1World.func_72921_c(par2, par3, par4, 4, 2);
      }

      ((TileC)par1World.func_147438_o(par2, par3, par4)).setNamenpc("ร้านขายของ");
      if (stack.func_82837_s()) {
         ((TileC)par1World.func_147438_o(par2, par3, par4)).setCustomName(stack.func_82833_r());
      }

   }

   public boolean func_149727_a(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
      if (!world.field_72995_K) {
         if (player.field_71075_bZ.field_75098_d && !player.func_70093_af()) {
            player.openGui(Main.instance, Main.GUI_SETITEM, world, x, y, z);
         } else if (player.field_71075_bZ.field_75098_d && player.func_70093_af()) {
            player.openGui(Main.instance, Main.GUI_NPCPLAYER, world, x, y, z);
         } else {
            player.openGui(Main.instance, Main.GUI_NPCPLAYER, world, x, y, z);
         }
      }

      return true;
   }

   public TileEntity func_149915_a(World world, int var2) {
      return new TileC();
   }

   public int func_149645_b() {
      return -1;
   }

   public boolean func_149662_c() {
      return false;
   }

   public boolean func_149686_d() {
      return false;
   }
}
