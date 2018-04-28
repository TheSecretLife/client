package aguild.store;

import aguild.WorldData;
import aguild.playerdata;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class sda extends Container {
   public sda(EntityPlayer player, InventoryPlayer inventoryPlayer, sinv inventoryCustom) {
      int j;
      for(int x = 0; x < 3; ++x) {
         for(j = 0; j < 9; ++j) {
            if (x == 0) {
               this.func_75146_a(new Slot(inventoryCustom, j, 8 + j * 18, 0 + x * 18 + 25));
            } else if (x == 1) {
               this.func_75146_a(new Slot(inventoryCustom, 9 + j, 8 + j * 18, 0 + x * 18 + 25));
            } else if (x == 2) {
               this.func_75146_a(new Slot(inventoryCustom, 18 + j, 8 + j * 18, 0 + x * 18 + 25));
            }
         }
      }

      int i;
      for(i = 0; i < 3; ++i) {
         for(j = 0; j < 9; ++j) {
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

   public void func_75134_a(EntityPlayer p) {
      super.func_75134_a(p);
      playerdata px = playerdata.get(p);
      WorldData data = WorldData.forWorld(p.field_70170_p, px.guildname);
      NBTTagCompound tag = data.getData();
      NBTTagCompound comp = new NBTTagCompound();
      comp = comp.func_74775_l(WorldData.key + px.guildname);
      data.func_76187_b(comp);
      data.func_76185_a();
   }
}
