package srcpet;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class cslot extends Slot {
   public int field_75225_a;
   public EntityPlayer player;

   cslot(cinv par2IInventory, int par3, int par4, int par5, EntityPlayer player) {
      super(par2IInventory, par3, par4, par5);
      this.player = player;
      this.field_75225_a = par3;
   }

   public boolean func_82869_a(EntityPlayer par1EntityPlayer) {
      return super.func_82869_a(par1EntityPlayer);
   }

   public int func_75219_a() {
      return 1;
   }

   public boolean func_75214_a(ItemStack par1ItemStack) {
      if (par1ItemStack == null) {
         return true;
      } else {
         return par1ItemStack.func_77973_b() instanceof itempet;
      }
   }

   public void func_75218_e() {
      this.field_75224_c.func_70296_d();
      data px = data.get(this.player);
      px.petcall(this.player);
   }
}
