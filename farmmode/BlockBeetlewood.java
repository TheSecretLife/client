package farmmode;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockBeetlewood extends BlockContainer {
   public BlockBeetlewood() {
      super(Material.field_151571_B);
      this.func_149676_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.func_149658_d("fantasyland:BlockWood");
      this.func_149711_c(2.0F);
      this.func_149647_a(ModStart.BlockTab);
   }

   public TileEntity func_149915_a(World w, int i) {
      return new TeBeetleWood();
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

   public void func_149689_a(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
      EntityPlayer Player = (EntityPlayer)par5EntityLivingBase;
      byte b0 = 0;
      int l = MathHelper.func_76128_c((double)(par5EntityLivingBase.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      if (l == 0) {
         b0 = 2;
      }

      if (l == 1) {
         b0 = 5;
      }

      if (l == 2) {
         b0 = 3;
      }

      if (l == 3) {
         b0 = 4;
      }

      par1World.func_72921_c(par2, par3, par4, b0, 2);
   }
}
