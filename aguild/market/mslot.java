package aguild.market;

import aguild.mod;
import aguild.packetclick;
import aguild.playerdata;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class mslot extends Slot {
   public int field_75225_a;
   public EntityPlayer player;

   mslot(minv par2IInventory, int par3, int par4, int par5, EntityPlayer player) {
      super(par2IInventory, par3, par4, par5);
      this.player = player;
      this.field_75225_a = par3;
   }

   public void func_82870_a(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack) {
      this.func_75218_e();
   }

   public boolean func_82869_a(EntityPlayer par1EntityPlayer) {
      playerdata px = playerdata.get(this.player);
      if (this.player.field_71075_bZ.field_75098_d) {
         return super.func_82869_a(par1EntityPlayer);
      } else {
         if (this.player.field_70170_p.field_72995_K) {
            mod.network.sendToServer(new packetclick(63, "", this.field_75225_a));
            mod.network.sendToServer(new packetclick(5, "", 0));
            this.player.func_71053_j();
            mod.network.sendToServer(new packetclick(61, "", 0));
         }

         return false;
      }
   }

   public int func_75219_a() {
      return 64;
   }

   public boolean func_75214_a(ItemStack par1ItemStack) {
      if (par1ItemStack == null) {
         return true;
      } else if (par1ItemStack.func_77973_b() instanceof Item) {
         playerdata px = playerdata.get(this.player);
         if (this.player.field_71075_bZ.field_75098_d) {
            if (!this.player.field_70170_p.field_72995_K) {
               px.slotid = this.field_75225_a;
            }

            if (this.player.field_70170_p.field_72995_K) {
               this.player.openGui(mod.instance, 11, this.player.field_70170_p, (int)this.player.field_70165_t, (int)this.player.field_70163_u, (int)this.player.field_70161_v);
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void func_75215_d(ItemStack par1ItemStack) {
      if (this.field_75224_c != null) {
         this.field_75224_c.func_70299_a(this.field_75225_a, par1ItemStack);
      }

      this.func_75218_e();
   }

   public void func_75218_e() {
      this.field_75224_c.func_70296_d();
   }
}
