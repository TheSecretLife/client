package cabalaccessorys.command;

import cabalaccessorys.data.PlayerData;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class CommandDungeon extends CommandBase {
   public String func_71517_b() {
      return "dunmode";
   }

   public String func_71518_a(ICommandSender icommandsender) {
      return "";
   }

   public void func_71515_b(ICommandSender icommandsender, String[] astring) {
      EntityPlayer player = (EntityPlayer)icommandsender;
      PlayerData px = PlayerData.get(player);
      int value = Integer.parseInt(astring[0]);
      if (value == 1) {
         px.dungeon = true;
         px.pvp = 2;
         player.func_145747_a(new ChatComponentText("§aเข้าสู่โหมดดันเจี้ยน"));
      } else {
         px.dungeon = false;
         px.pvp = 0;
         player.func_145747_a(new ChatComponentText("§aออกจากโหมดดันเจี้ยน"));
      }

   }
}
