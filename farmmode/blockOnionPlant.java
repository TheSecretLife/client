package farmmode;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class blockOnionPlant extends BlockContainer {
   public blockOnionPlant() {
      super(Material.field_151571_B);
      this.func_149676_a(0.4F, 0.0F, 0.4F, 0.6F, 1.0F, 0.6F);
      this.func_149658_d("fantasyland:blockMakeer");
      this.func_149711_c(0.5F);
      this.func_149647_a(ModStart.BlockTab);
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

   public TileEntity func_149915_a(World world, int par1) {
      return new TeOnion();
   }

   public void func_149689_a(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
      EntityPlayer Player = (EntityPlayer)par5EntityLivingBase;
      par1World.func_72921_c(par2, par3, par4, 1, 2);
   }

   public boolean func_149727_a(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
      ItemStack hand = par5EntityPlayer.field_71071_by.func_70448_g();
      if (!par1World.field_72995_K) {
         if (par1World.func_72805_g(par2, par3, par4) == 5) {
            ItemStack item = new ItemStack(ReqFarmItem.Onion);
            this.func_149642_a(par1World, par2, par3, par4, item);
            par1World.func_72921_c(par2, par3, par4, 3, 2);
            if (hand != null && hand.func_77973_b() == ReqFarmItem.Water && par1World.func_147439_a(par2, par3 - 1, par4) == ReqFarmItem.BlockFarmA) {
               par1World.func_147449_b(par2, par3 - 1, par4, ReqFarmItem.BlockFarmB);
               hand.func_77972_a(1, par5EntityPlayer);
            }
         } else if (hand != null && hand.func_77973_b() == ReqFarmItem.Water && par1World.func_147439_a(par2, par3 - 1, par4) == ReqFarmItem.BlockFarmA) {
            par1World.func_147449_b(par2, par3 - 1, par4, ReqFarmItem.BlockFarmB);
            hand.func_77972_a(1, par5EntityPlayer);
         }
      }

      return false;
   }
}
