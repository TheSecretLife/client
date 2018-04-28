package cabalaccessorys.blockshop.npc;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class BlockShopContainerNPC extends Container {
   public BlockShopContainerNPC(EntityPlayer player, InventoryPlayer inventoryPlayer, BlockShopInventoryNPC sW) {
      int i;
      int j;
      for(i = 0; i < 3; ++i) {
         for(j = 0; j < 9; ++j) {
            this.func_75146_a(new SlotSellNPC(sW, j + i * 9 + 9, 12 + j * 18, 8 + i * 18, player));
         }
      }

      for(i = 0; i < 3; ++i) {
         for(j = 0; j < 9; ++j) {
            this.func_75146_a(new Slot(inventoryPlayer, j + i * 9 + 9, 46 + j * 18, 82 + i * 18));
         }
      }

      for(i = 0; i < 9; ++i) {
         this.func_75146_a(new Slot(inventoryPlayer, i, 46 + i * 18, 141));
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
