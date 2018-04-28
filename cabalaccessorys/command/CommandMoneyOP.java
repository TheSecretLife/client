package cabalaccessorys.command;

import cabalaccessorys.Start;
import cabalaccessorys.SynPacNewket;
import cabalaccessorys.data.PlayerData;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;

public class CommandMoneyOP extends CommandBase {
   public String func_71517_b() {
      return "goldop";
   }

   public String func_71518_a(ICommandSender icommandsender) {
      return "";
   }

   public void func_71515_b(ICommandSender icommandsender, String[] astring) {
      EntityPlayer player = (EntityPlayer)icommandsender;
      int value = Integer.parseInt(astring[0]);
      PlayerData px = PlayerData.get(player);
      if (Integer.parseInt(astring[0]) >= 0) {
         if (px.op) {
            px.Money = value;
            player.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §6เพิ่มค่าเงินสำหรับ OP " + value));
            Start.networkChannel.sendTo(new SynPacNewket(player), (EntityPlayerMP)player);
         } else {
            player.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cต้องเป็น OP ก่อน /iamop " + value));
         }
      }

   }
}
