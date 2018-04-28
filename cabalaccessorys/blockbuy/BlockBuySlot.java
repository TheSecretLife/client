package cabalaccessorys.blockbuy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class BlockBuySlot extends Slot {
   public int field_75225_a;
   public EntityPlayer player;

   BlockBuySlot(BlockBuyInventory par2IInventory, int par3, int par4, int par5, EntityPlayer player) {
      super(par2IInventory, par3, par4, par5);
      this.player = player;
      this.field_75225_a = par3;
   }

   public boolean func_82869_a(EntityPlayer par1EntityPlayer) {
      return false;
   }

   public boolean func_75214_a(ItemStack par1ItemStack) {
      return false;
   }

   public int func_75219_a() {
      return 64;
   }

   public ItemStack func_75209_a(int p_75209_1_) {
      return this.field_75224_c.func_70298_a(this.field_75225_a, p_75209_1_);
   }
}
