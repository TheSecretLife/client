package cabalaccessorys.blockbuy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

public class BlockBuyData extends Container {
   public BlockBuyData(EntityPlayer player, InventoryPlayer inventoryPlayer, BlockBuyInventory inventoryCustom) {
      this.func_75146_a(new BlockBuySlot(inventoryCustom, 0, 26, 8, player));
      this.func_75146_a(new BlockBuySlot(inventoryCustom, 1, 26, 26, player));
      this.func_75146_a(new BlockBuySlot(inventoryCustom, 2, 26, 44, player));
      this.func_75146_a(new BlockBuySlot(inventoryCustom, 3, 152, 8, player));
      this.func_75146_a(new BlockBuySlot(inventoryCustom, 4, 152, 26, player));
      this.func_75146_a(new BlockBuySlot(inventoryCustom, 5, 152, 44, player));
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
