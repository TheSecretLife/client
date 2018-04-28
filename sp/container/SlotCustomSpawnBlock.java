package sp.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class SlotCustomSpawnBlock extends Slot {
   public static int select = 0;

   public SlotCustomSpawnBlock(IInventory p_i1824_1_, int p_i1824_2_, int p_i1824_3_, int p_i1824_4_) {
      super(p_i1824_1_, p_i1824_2_, p_i1824_3_, p_i1824_4_);
   }

   public boolean func_75214_a(ItemStack itemStack) {
      return !(itemStack.func_77973_b() instanceof ItemBlock);
   }

   public boolean func_82869_a(EntityPlayer par1EntityPlayer) {
      return true;
   }
}
