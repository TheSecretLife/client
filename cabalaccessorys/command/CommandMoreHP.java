package cabalaccessorys.command;

import cabalaccessorys.data.PlayerData;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class CommandMoreHP extends CommandBase {
   public String func_71517_b() {
      return "morehp";
   }

   public String func_71518_a(ICommandSender icommandsender) {
      return "";
   }

   public void func_71515_b(ICommandSender icommandsender, String[] astring) {
      EntityPlayer player = (EntityPlayer)icommandsender;
      PlayerData px = PlayerData.get(player);
      int value = Integer.parseInt(astring[0]);
      if (value == 0) {
         px.morehp = true;
         px.applyHP(player);
         px.guishop = true;
         player.func_70691_i(20000.0F);
         player.func_145747_a(new ChatComponentText("§aเพิ่ม HP10000 ชั่วคราว"));
      } else {
         px.morehp = false;
         px.applyHP(player);
         px.guishop = true;
         player.func_70691_i(20000.0F);
         player.func_145747_a(new ChatComponentText("§eHP กลับสู่ภาวะปกติ"));
      }

   }
}
