package cabalaccessorys.command;

import cabalaccessorys.RegisterItem;
import cabalaccessorys.data.PlayerData;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;

public class CommandMoney extends CommandBase {
   public String func_71517_b() {
      return "gold";
   }

   public String func_71518_a(ICommandSender icommandsender) {
      return "";
   }

   public void func_71515_b(ICommandSender icommandsender, String[] astring) {
      EntityPlayer player = (EntityPlayer)icommandsender;
      int value = Integer.parseInt(astring[0]);
      PlayerData px = PlayerData.get(player);
      if (Integer.parseInt(astring[0]) > 0) {
         if (player.field_71071_by.func_70447_i() >= 0) {
            if (px.Money - value > 0) {
               px.Money -= value;
               ItemStack give = new ItemStack(RegisterItem.coin1);
               NBTTagCompound nbt = give.field_77990_d;
               if (nbt == null) {
                  nbt = new NBTTagCompound();
                  nbt.func_74768_a("money", value);
               } else {
                  nbt.func_74768_a("money", value);
               }

               give.func_77982_d(nbt);
               player.field_71071_by.func_70441_a(give);
               px.guishop = true;
               player.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §eแลกเงินจำนวน §f" + value + " §eGold"));
            } else {
               player.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cเงินมีไม่พอสำหรับการแลกเงิน"));
            }
         } else {
            player.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cไม่มีช่องว่างสำหรับแลกเหรียญ"));
         }
      }

   }
}
