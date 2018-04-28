package cabalaccessorys.blockshop;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class BlockShopContainer extends Container {
   public BlockShopContainer(EntityPlayer player, InventoryPlayer inventoryPlayer, BlockShopInventory inventoryCustom) {
      this.func_75146_a(new SlotSell(inventoryCustom, 0, 26, 8, player));
      this.func_75146_a(new SlotSell(inventoryCustom, 1, 26, 26, player));
      this.func_75146_a(new SlotSell(inventoryCustom, 2, 26, 44, player));
      this.func_75146_a(new SlotSell(inventoryCustom, 3, 152, 8, player));
      this.func_75146_a(new SlotSell(inventoryCustom, 4, 152, 26, player));
      this.func_75146_a(new SlotSell(inventoryCustom, 5, 152, 44, player));

      int i;
      for(i = 0; i < 3; ++i) {
         for(int j = 0; j < 9; ++j) {
            this.func_75146_a(new Slot(inventoryPlayer, j + i * 9 + 9, 48 + j * 18, 84 + i * 18));
         }
      }

      for(i = 0; i < 9; ++i) {
         this.func_75146_a(new Slot(inventoryPlayer, i, 48 + i * 18, 142));
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
