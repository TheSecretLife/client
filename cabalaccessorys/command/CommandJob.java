package cabalaccessorys.command;

import cabalaccessorys.data.PlayerData;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class CommandJob extends CommandBase {
   public String func_71517_b() {
      return "job";
   }

   public String func_71518_a(ICommandSender icommandsender) {
      return "";
   }

   public void func_71515_b(ICommandSender icommandsender, String[] astring) {
      EntityPlayer player = (EntityPlayer)icommandsender;
      PlayerData px = PlayerData.get(player);
      int value = Integer.parseInt(astring[0]);
      px.job = value;
      player.func_70096_w().func_75692_b(12, value);
      if (value == 1) {
         player.func_145747_a(new ChatComponentText("§aเลือกคลาส §aWarrior"));
      } else if (value == 2) {
         player.func_145747_a(new ChatComponentText("§aเลือกคลาส §cViking"));
      } else if (value == 3) {
         player.func_145747_a(new ChatComponentText("§aเลือกคลาส §bAssassin"));
      } else {
         player.func_145747_a(new ChatComponentText("§aเลือกคลาส §eNovice"));
      }

   }
}
