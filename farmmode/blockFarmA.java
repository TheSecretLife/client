package farmmode;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class blockFarmA extends Block {
   @SideOnly(Side.CLIENT)
   private IIcon field_150035_a;
   @SideOnly(Side.CLIENT)
   private IIcon field_150034_b;
   private static final String __OBFID = "CL_00000221";

   public blockFarmA() {
      super(Material.field_151571_B);
      this.func_149676_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.func_149658_d("fantasyland:blockFarmA");
      this.func_149711_c(1.0F);
      this.func_149647_a(ModStart.BlockTab);
   }

   public boolean func_149727_a(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
      ItemStack hand = par5EntityPlayer.field_71071_by.func_70448_g();
      if (!par1World.field_72995_K && hand != null && hand.func_77973_b() == ReqFarmItem.Water) {
         par1World.func_147449_b(par2, par3, par4, ReqFarmItem.BlockFarmB);
         hand.func_77972_a(1, par5EntityPlayer);
      }

      return false;
   }

   public int func_149745_a(Random p_149745_1_) {
      return 1;
   }

   public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
      return Item.func_150898_a(ReqFarmItem.BlockFarmA);
   }

   public void func_149689_a(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
      EntityPlayer Player = (EntityPlayer)par5EntityLivingBase;
   }

   @SideOnly(Side.CLIENT)
   public IIcon func_149691_a(int p_149691_1_, int p_149691_2_) {
      return p_149691_1_ == 1 ? this.field_150035_a : (p_149691_1_ == 0 ? Blocks.field_150344_f.func_149733_h(p_149691_1_) : (p_149691_1_ != 2 && p_149691_1_ != 4 ? this.field_149761_L : this.field_150034_b));
   }

   @SideOnly(Side.CLIENT)
   public void func_149651_a(IIconRegister p_149651_1_) {
      this.field_149761_L = p_149651_1_.func_94245_a(this.func_149641_N() + "_side");
      this.field_150035_a = p_149651_1_.func_94245_a(this.func_149641_N() + "_top");
      this.field_150034_b = p_149651_1_.func_94245_a(this.func_149641_N() + "_side");
   }
}
