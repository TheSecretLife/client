package cabalaccessorys.command;

import cabalaccessorys.data.PlayerData;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class CommandCanShop extends CommandBase {
   public String func_71517_b() {
      return "canshop";
   }

   public String func_71518_a(ICommandSender icommandsender) {
      return "";
   }

   public void func_71515_b(ICommandSender icommandsender, String[] astring) {
      EntityPlayer player = (EntityPlayer)icommandsender;
      PlayerData px = PlayerData.get(player);
      int value = Integer.parseInt(astring[0]);
      if (value == 1) {
         px.canshop = true;
         player.func_145747_a(new ChatComponentText("§aตั้งร้านค้าได้"));
      } else {
         px.canshop = false;
      }

   }
}
