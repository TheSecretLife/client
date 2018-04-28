package cabalaccessorys.command;

import cabalaccessorys.data.PlayerData;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class CommandFaction extends CommandBase {
   public String func_71517_b() {
      return "fac";
   }

   public String func_71518_a(ICommandSender icommandsender) {
      return "";
   }

   public void func_71515_b(ICommandSender icommandsender, String[] astring) {
      EntityPlayer player = (EntityPlayer)icommandsender;
      PlayerData px = PlayerData.get(player);
      int value = Integer.parseInt(astring[0]);
      if (value == 1) {
         px.faction = 1;
         player.func_70096_w().func_75692_b(11, Integer.valueOf(1));
         player.func_145747_a(new ChatComponentText("§aเลือกฝ่าย §bCapella"));
      } else if (value == 2) {
         px.faction = 2;
         player.func_70096_w().func_75692_b(11, Integer.valueOf(2));
         player.func_145747_a(new ChatComponentText("§aเลือกฝ่าย §cProcyon"));
      } else {
         px.faction = 0;
         player.func_70096_w().func_75692_b(11, Integer.valueOf(0));
         player.func_145747_a(new ChatComponentText("§aไม่เลือกฝ่าย"));
      }

   }
}
