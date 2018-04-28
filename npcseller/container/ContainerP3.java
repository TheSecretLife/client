package npcseller.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerP3 extends Container {
   private EntityPlayer player;
   private IInventory chest;

   public ContainerP3(IInventory playerInventory, IInventory chestInventory) {
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
      this.player.field_71071_by.func_70295_k_();
      this.player.field_71071_by.func_70296_d();
   }

   protected void layoutContainer(IInventory playerInventory, IInventory chestInventory, EntityPlayer p) {
      int x;
      int j;
      for(x = 0; x < 3; ++x) {
         for(j = 0; j < 9; ++j) {
            this.func_75146_a(new SlotCustom(chestInventory, j + (x + 1) * 9, 15 + j * 18, 11 + x * 18, p));
         }
      }

      for(x = 0; x < 3; ++x) {
         for(j = 0; j < 9; ++j) {
            this.func_75146_a(new Slot(playerInventory, j + (x + 1) * 9, -4 + j * 18, 89 + x * 18));
         }
      }

      for(x = 0; x < 9; ++x) {
         this.func_75146_a(new Slot(playerInventory, x, -4 + x * 18, 148));
      }

   }

   public EntityPlayer getPlayer() {
      return this.player;
   }
}
