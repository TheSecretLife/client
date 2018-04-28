package srcpet;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class cdata extends Container {
   public cdata(EntityPlayer player, InventoryPlayer inventoryPlayer, cinv inventoryCustom) {
      this.func_75146_a(new cslot(inventoryCustom, 0, 78, 27, player));

      int i;
      for(i = 0; i < 3; ++i) {
         for(int j = 0; j < 9; ++j) {
            this.func_75146_a(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
         }
      }

      for(i = 0; i < 9; ++i) {
         this.func_75146_a(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
      }

   }

   public ItemStack func_82846_b(EntityPlayer player, int par2) {
      return null;
   }

   public boolean func_75145_c(EntityPlayer player) {
      return true;
   }
}
