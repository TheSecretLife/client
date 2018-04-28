package cabalaccessorys;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class AccessoryData extends Container {
   public AccessoryData(EntityPlayer player, InventoryPlayer inventoryPlayer, AccessoryInventory inventoryCustom) {
      this.func_75146_a(new SlotWing(inventoryCustom, 0, 88, 5, player));
      this.func_75146_a(new SlotAmulet(inventoryCustom, 1, 107, 5, player));
      this.func_75146_a(new SlotCard(inventoryCustom, 6, 88, 24, player));
      this.func_75146_a(new SlotCard(inventoryCustom, 7, 107, 24, player));
      this.func_75146_a(new SlotEaring(inventoryCustom, 2, 88, 42, player));
      this.func_75146_a(new SlotEaring(inventoryCustom, 3, 107, 42, player));
      this.func_75146_a(new SlotRing(inventoryCustom, 4, 88, 61, player));
      this.func_75146_a(new SlotRing(inventoryCustom, 5, 107, 61, player));

      int i;
      for(i = 0; i < 4; ++i) {
         this.func_75146_a(new SlotArmor(player, inventoryPlayer, inventoryPlayer.func_70302_i_() - 1 - i, 6, 4 + i * 19, i));
      }

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

   public void func_75134_a(EntityPlayer p) {
      super.func_75134_a(p);
   }

   public boolean func_75145_c(EntityPlayer p_75145_1_) {
      return true;
   }
}
