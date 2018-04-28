package cabalaccessorys.command;

import cabalaccessorys.data.PlayerData;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class CommandIamOP extends CommandBase {
   public String func_71517_b() {
      return "iamop";
   }

   public String func_71518_a(ICommandSender icommandsender) {
      return "";
   }

   public void func_71515_b(ICommandSender icommandsender, String[] astring) {
      EntityPlayer player = (EntityPlayer)icommandsender;
      PlayerData px = PlayerData.get(player);
      if (!px.op) {
         px.op = true;
         player.func_145747_a(new ChatComponentText("§aฉันคือ OP"));
      } else {
         px.op = false;
         player.func_145747_a(new ChatComponentText("§cฉันไม่ใช่ OP"));
      }

   }
}
