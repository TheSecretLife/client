package aguild.market;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class mda extends Container {
   public mda(EntityPlayer player, InventoryPlayer inventoryPlayer, minv inventoryCustom) {
      int j;
      for(int x = 0; x < 3; ++x) {
         for(j = 0; j < 9; ++j) {
            if (x == 0) {
               this.func_75146_a(new mslot(inventoryCustom, j, 8 + j * 18, 0 + x * 18 + 25, player));
            } else if (x == 1) {
               this.func_75146_a(new mslot(inventoryCustom, 9 + j, 8 + j * 18, 0 + x * 18 + 25, player));
            } else if (x == 2) {
               this.func_75146_a(new mslot(inventoryCustom, 18 + j, 8 + j * 18, 0 + x * 18 + 25, player));
            }
         }
      }

      int i;
      for(i = 0; i < 3; ++i) {
         for(j = 0; j < 9; ++j) {
            this.func_75146_a(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
         }
      }

      for(i = 0; i < 9; ++i) {
         this.func_75146_a(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
      }

   }

   public boolean func_75145_c(EntityPlayer player) {
      return true;
   }

   public ItemStack func_82846_b(EntityPlayer player, int par2) {
      return null;
   }

   public void func_75134_a(EntityPlayer p) {
      super.func_75134_a(p);
   }
}
