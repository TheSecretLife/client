package sp.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerSpawnBlock extends Container {
   private EntityPlayer player;
   private IInventory chest;

   public ContainerSpawnBlock(IInventory playerInventory, IInventory chestInventory) {
      this.chest = chestInventory;
      this.player = ((InventoryPlayer)playerInventory).field_70458_d;
      chestInventory.func_70295_k_();
      this.layoutContainer(playerInventory, chestInventory);
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

   protected void layoutContainer(IInventory playerInventory, IInventory chestInventory) {
      int i;
      int j;
      for(i = 0; i < 3; ++i) {
         for(j = 0; j < 3; ++j) {
            this.func_75146_a(new SlotCustomSpawnBlock(chestInventory, j + (i + 1) * 3, 2 + j * 18, 2 + i * 18));
         }
      }

      for(i = 0; i < 3; ++i) {
         for(j = 0; j < 9; ++j) {
            this.func_75146_a(new Slot(playerInventory, j + (i + 1) * 9, 2 + j * 18, 68 + i * 18));
         }
      }

      for(i = 0; i < 9; ++i) {
         this.func_75146_a(new Slot(playerInventory, i, 2 + i * 18, 127));
      }

   }

   public EntityPlayer getPlayer() {
      return this.player;
   }
}
