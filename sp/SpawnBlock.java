package sp;

import cabalaccessorys.Start;
import farmmode.ModStart;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class SpawnBlock extends BlockContainer {
   public SpawnBlock() {
      super(Material.field_151571_B);
      this.func_149676_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.func_149658_d("mob_spawner");
      this.func_149711_c(-1.0F);
      this.func_149647_a(ModStart.BlockTab);
   }

   public TileEntity func_149915_a(World world, int par1) {
      return new SpawnBlockTileEntity();
   }

   public void func_149689_a(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.func_76128_c((double)(entity.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      if (l == 0) {
         world.func_72921_c(x, y, z, 5, 2);
      }

      if (l == 1) {
         world.func_72921_c(x, y, z, 2, 2);
      }

      if (l == 2) {
         world.func_72921_c(x, y, z, 3, 2);
      }

      if (l == 3) {
         world.func_72921_c(x, y, z, 4, 2);
      }

   }

   public boolean func_149727_a(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
      if (!world.field_72995_K) {
         if (player.field_71075_bZ.field_75098_d && !player.func_70093_af()) {
            if (!((SpawnBlockTileEntity)world.func_147438_o(x, y, z)).status) {
               player.openGui(Start.instance, Start.Sp, world, x, y, z);
            } else {
               player.func_146105_b(new ChatComponentTranslation(EnumChatFormatting.RED + "ไม่สามารถเซ็ตซ้ำได้", new Object[0]));
            }
         }

         if (player.field_71075_bZ.field_75098_d && player.func_70093_af()) {
            player.func_146105_b(new ChatComponentTranslation(EnumChatFormatting.WHITE + "จำนวนการเกิด " + ((SpawnBlockTileEntity)world.func_147438_o(x, y, z)).count, new Object[0]));
         }
      }

      return true;
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
