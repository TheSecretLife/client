package farmmode;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

public class ItemWaterPlant extends Item {
   private Block isFull;

   public ItemWaterPlant(String unlocalizedName) {
      this.func_77637_a(ModStart.PlantTab);
      this.func_77625_d(1);
      this.func_77656_e(30);
      this.func_77664_n();
      this.func_77655_b(unlocalizedName);
      this.func_111206_d("fantasyland:" + unlocalizedName);
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack st, EntityPlayer pl, List lt, boolean bl) {
      lt.add("§fคลิกขวาเพื่อรดน้ำต้นไม้");
      lt.add("§fคลิกขวาที่แหล่งน้ำเพื่อเติมน้ำ");
   }

   public ItemStack func_77659_a(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
      boolean flag = this.isFull == Blocks.field_150350_a;
      MovingObjectPosition movingobjectposition = this.func_77621_a(p_77659_2_, p_77659_3_, flag);
      if (movingobjectposition == null) {
         return p_77659_1_;
      } else {
         if (movingobjectposition.field_72313_a == MovingObjectType.BLOCK) {
            int i = movingobjectposition.field_72311_b;
            int j = movingobjectposition.field_72312_c;
            int k = movingobjectposition.field_72309_d;
            Material material = p_77659_2_.func_147439_a(i, j, k).func_149688_o();
            if (p_77659_2_.func_147439_a(i, j + 1, k) == Blocks.field_150355_j) {
               p_77659_2_.func_147468_f(i, j + 1, k);
               p_77659_1_.func_77964_b(0);
               p_77659_2_.func_72956_a(p_77659_3_, "liquid.water", 20.0F, 20.0F);
            }
         }

         return p_77659_1_;
      }
   }
}
