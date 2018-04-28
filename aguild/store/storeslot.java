package aguild.store;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class storeslot extends Slot {
   public int field_75225_a;
   public EntityPlayer player;

   storeslot(sinv par2IInventory, int par3, int par4, int par5, EntityPlayer player) {
      super(par2IInventory, par3, par4, par5);
      this.player = player;
      this.field_75225_a = par3;
   }

   public boolean func_82869_a(EntityPlayer par1EntityPlayer) {
      return super.func_82869_a(par1EntityPlayer);
   }

   public int func_75219_a() {
      return 64;
   }

   public boolean func_75214_a(ItemStack par1ItemStack) {
      if (par1ItemStack == null) {
         return true;
      } else {
         return par1ItemStack.func_77973_b() instanceof Item;
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
      if (!this.player.field_70170_p.field_72995_K) {
         ;
      }

   }
}
