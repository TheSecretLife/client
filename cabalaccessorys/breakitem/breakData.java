package cabalaccessorys.breakitem;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class breakData extends Container {
   private static final int ARMOR_START = 2;
   private static final int ARMOR_END = 5;
   private static final int INV_START = 6;
   private static final int INV_END = 32;
   private static final int HOTBAR_START = 33;
   private static final int HOTBAR_END = 41;

   public breakData(EntityPlayer player, InventoryPlayer inventoryPlayer, breakInventory inventoryCustom) {
      this.func_75146_a(new breakSlot(inventoryCustom, 0, 61, 24, player));
      this.func_75146_a(new breakRewardSlot(inventoryCustom, 1, 61, 54, player));

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

   public boolean func_75145_c(EntityPlayer player) {
      return true;
   }

   public ItemStack func_82846_b(EntityPlayer player, int par2) {
      return null;
   }
}
