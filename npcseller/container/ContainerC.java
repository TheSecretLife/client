package npcseller.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerC extends Container {
   private EntityPlayer player;
   private IInventory chest;

   public ContainerC(IInventory playerInventory, IInventory chestInventory) {
      this.chest = chestInventory;
      this.player = ((InventoryPlayer)playerInventory).field_70458_d;
      chestInventory.func_70295_k_();
      this.layoutContainer(playerInventory, chestInventory, ((InventoryPlayer)playerInventory).field_70458_d);
   }

   public boolean func_75145_c(EntityPlayer player) {
      return this.chest.func_70300_a(player);
   }

   public ItemStack func_82846_b(EntityPlayer p, int i) {
      ItemStack itemstack = null;
      return (ItemStack)itemstack;
   }

   public void func_75134_a(EntityPlayer entityplayer) {
      super.func_75134_a(entityplayer);
      this.chest.func_70305_f();
   }

   protected void layoutContainer(IInventory playerInventory, IInventory chestInventory, EntityPlayer p) {
      int x;
      int j;
      for(x = 0; x < 3; ++x) {
         for(j = 0; j < 9; ++j) {
            this.func_75146_a(new SlotCustom(chestInventory, j + (x + 1) * 9, 12 + j * 18, 7 + x * 18, p));
         }
      }

      for(x = 0; x < 3; ++x) {
         for(j = 0; j < 9; ++j) {
            this.func_75146_a(new Slot(playerInventory, j + (x + 1) * 9, 46 + j * 18, 82 + x * 18));
         }
      }

      for(x = 0; x < 9; ++x) {
         this.func_75146_a(new Slot(playerInventory, x, 46 + x * 18, 142));
      }

   }

   public EntityPlayer getPlayer() {
      return this.player;
   }
}
