package npcseller.container;

import java.util.Timer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;

public class SlotCustom extends Slot {
   public static int select = 0;
   public EntityPlayer player;

   public SlotCustom(IInventory p_i1824_1_, int p_i1824_2_, int p_i1824_3_, int p_i1824_4_, EntityPlayer p) {
      super(p_i1824_1_, p_i1824_2_, p_i1824_3_, p_i1824_4_);
      this.player = p;
   }

   public boolean func_75214_a(ItemStack item) {
      return this.player.field_71075_bZ.field_75098_d;
   }

   public boolean func_82869_a(EntityPlayer par1EntityPlayer) {
      if (par1EntityPlayer.field_71075_bZ.field_75098_d) {
         return true;
      } else {
         if (par1EntityPlayer.field_70170_p.field_72995_K) {
            if (TimerConfirm.getCountdown() == 0) {
               Timer timer = new Timer();
               TimerConfirm.setCountdown(2);
               timer.schedule(new TimerConfirm(), 0L, 1000L);
               select = this.field_75222_d + 9;
            } else {
               par1EntityPlayer.func_146105_b(new ChatComponentTranslation("§cคุณคลิกเลือกสินค้าเร็วเกินไป!", new Object[0]));
            }
         }

         return false;
      }
   }
}
