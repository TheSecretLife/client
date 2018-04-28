package cabalaccessorys.command;

import cabalaccessorys.data.PlayerData;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class CommandMode extends CommandBase {
   public String func_71517_b() {
      return "nmode";
   }

   public String func_71518_a(ICommandSender icommandsender) {
      return "";
   }

   public void func_71515_b(ICommandSender icommandsender, String[] astring) {
      EntityPlayer player = (EntityPlayer)icommandsender;
      PlayerData px = PlayerData.get(player);
      int value = Integer.parseInt(astring[0]);
      if (value == 0) {
         px.normalmode = false;
         player.field_71068_ca = px.Level;
         px.guishop = true;
         player.func_70691_i(9000.0F);
         player.func_145747_a(new ChatComponentText("§eเปลี่ยนสู่โหมด MMORPG"));
      } else {
         px.normalmode = true;
         px.applyHP(player);
         player.func_145747_a(new ChatComponentText("§eเปลี่ยนสู่โหมด Survival"));
      }

   }
}
