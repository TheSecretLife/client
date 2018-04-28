package cabalaccessorys.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CommandGiveItem extends CommandBase {
   public String func_71517_b() {
      return "its";
   }

   public String func_71518_a(ICommandSender icommandsender) {
      return "";
   }

   public void func_71515_b(ICommandSender icommandsender, String[] astring) {
      EntityPlayer player = (EntityPlayer)icommandsender;
      int value1 = Integer.parseInt(astring[0]);
      int value2 = Integer.parseInt(astring[1]);
      if (player.field_71071_by.func_70447_i() >= 0) {
         ItemStack item = new ItemStack(Item.func_150899_d(value1), 1, value2);
         player.field_71071_by.func_70299_a(player.field_71071_by.func_70447_i(), item);
      }

   }
}
