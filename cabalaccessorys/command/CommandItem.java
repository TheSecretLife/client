package cabalaccessorys.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;

public class CommandItem extends CommandBase {
   public String func_71517_b() {
      return "ids";
   }

   public String func_71518_a(ICommandSender icommandsender) {
      return "";
   }

   public void func_71515_b(ICommandSender icommandsender, String[] astring) {
      EntityPlayer player = (EntityPlayer)icommandsender;
      ItemStack hand = player.field_71071_by.func_70448_g();
      if (hand != null) {
         StringBuilder var10003 = (new StringBuilder()).append("§aID §z");
         hand.func_77973_b();
         player.func_145747_a(new ChatComponentText(var10003.append(Item.func_150891_b(hand.func_77973_b())).append(":").append(hand.func_77960_j()).toString()));
      } else {
         player.func_145747_a(new ChatComponentText("§cไม่มีไอเทมในมือ"));
      }

   }
}
