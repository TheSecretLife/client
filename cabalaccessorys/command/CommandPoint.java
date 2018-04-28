package cabalaccessorys.command;

import cabalaccessorys.RegisterItem;
import cabalaccessorys.data.PlayerData;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;

public class CommandPoint extends CommandBase {
   public String func_71517_b() {
      return "point";
   }

   public String func_71518_a(ICommandSender icommandsender) {
      return "";
   }

   public void func_71515_b(ICommandSender icommandsender, String[] astring) {
      EntityPlayer player = (EntityPlayer)icommandsender;
      PlayerData px = PlayerData.get(player);
      if (player.field_71071_by.func_70447_i() >= 0) {
         if (px.iconomypoint - 50 >= 0) {
            px.iconomypoint -= 50;
            ItemStack give = new ItemStack(RegisterItem.newmoney);
            player.field_71071_by.func_70441_a(give);
            px.guishop = true;
            player.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §eแลกพ้อย §f50 §ePoint"));
         } else {
            player.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cพ้อยมีไม่พอสำหรับการแลก"));
         }
      } else {
         player.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cไม่มีช่องว่างสำหรับแลกพ้อย"));
      }

   }
}
