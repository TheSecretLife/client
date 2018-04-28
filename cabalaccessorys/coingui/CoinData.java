package cabalaccessorys.coingui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class CoinData extends Container {
   private static final int ARMOR_START = 6;
   private static final int ARMOR_END = 9;
   private static final int INV_START = 10;
   private static final int INV_END = 36;
   private static final int HOTBAR_START = 37;
   private static final int HOTBAR_END = 45;

   public CoinData(EntityPlayer player, InventoryPlayer inventoryPlayer, CoinInventory inventoryCustom) {
      this.func_75146_a(new CoinSlot(inventoryCustom, 0, 44, 8, player));
      this.func_75146_a(new CoinSlot(inventoryCustom, 1, 44, 26, player));
      this.func_75146_a(new CoinSlot(inventoryCustom, 2, 44, 44, player));
      this.func_75146_a(new CoinSlot(inventoryCustom, 3, 152, 8, player));
      this.func_75146_a(new CoinSlot(inventoryCustom, 4, 152, 26, player));
      this.func_75146_a(new CoinSlot(inventoryCustom, 5, 152, 44, player));

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
