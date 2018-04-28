package aguild;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;

public class commandguild extends CommandBase {
   public String func_71517_b() {
      return "guild";
   }

   public String func_71518_a(ICommandSender icommandsender) {
      return "";
   }

   public void func_71515_b(ICommandSender icommandsender, String[] astring) {
      EntityPlayer player = (EntityPlayer)icommandsender;
      playerdata px = playerdata.get(player);
      WorldData data = WorldData.forWorld(player.field_70170_p);
      NBTTagCompound tag = data.getData();
      String rule = astring[0];
      boolean oldrule = tag.func_74767_n("canhome");
      if (rule.equalsIgnoreCase("open")) {
         tag.func_74757_a("canhome", true);
         data.func_76185_a();
         player.func_145747_a(new ChatComponentText("§aกำหนดให้โลกนี้สามารถเซ็ตบ้านกิลได้"));
      } else if (rule.equalsIgnoreCase("close")) {
         tag.func_74757_a("canhome", false);
         data.func_76185_a();
         player.func_145747_a(new ChatComponentText("§cยกเลิกให้โลกนี้ไม่สามารถเซ็ตบ้านกิล"));
      } else if (rule.equalsIgnoreCase("waroff")) {
         tag.func_74757_a("warstats", false);
         data.func_76185_a();
         player.func_145747_a(new ChatComponentText("§cปิด War"));
      } else if (rule.equalsIgnoreCase("waron")) {
         tag.func_74757_a("warstats", true);
         data.func_76185_a();
         player.func_145747_a(new ChatComponentText("§bเปิด War"));
      } else if (rule.equalsIgnoreCase("shop")) {
         mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
         player.openGui(mod.instance, 10, player.field_70170_p, (int)player.field_70165_t, (int)player.field_70163_u, (int)player.field_70161_v);
      } else if (rule.equalsIgnoreCase("time")) {
         int h = Integer.parseInt(astring[1]);
         tag.func_74768_a("time_h", h);
         tag.func_74757_a("warstats", false);
         data.func_76185_a();
         player.func_145747_a(new ChatComponentText("§aเซ็ตให้หินกิลเกิดเวลา §z" + h + ":00 §aนาฬิกา"));
      } else if (rule.equalsIgnoreCase("give")) {
         String st = astring[1];
         String guild;
         int exp;
         if (st.equalsIgnoreCase("lv")) {
            guild = astring[2].toLowerCase();
            exp = Integer.parseInt(astring[3]);
            tag.func_74768_a("lv" + guild, exp);
            player.func_145747_a(new ChatComponentText("§aกำหนด Lv ให้กิล §6" + guild + " §aเป็น Lv §z" + exp));
         } else if (st.equalsIgnoreCase("exp")) {
            guild = astring[2].toLowerCase();
            exp = Integer.parseInt(astring[3]);
            tag.func_74768_a("exp" + guild, exp);
            player.func_145747_a(new ChatComponentText("§aกำหนด exp ให้กิล §6" + guild + " §aเป็น exp §z" + exp));
         } else if (st.equalsIgnoreCase("winwar")) {
            guild = astring[2].toLowerCase();
            String win = astring[3].toLowerCase();
            if (win.equalsIgnoreCase("true")) {
               tag.func_74757_a("winwar" + guild, true);
            } else if (win.equalsIgnoreCase("false")) {
               tag.func_74757_a("winwar" + guild, false);
            }

            player.func_145747_a(new ChatComponentText("§aกำหนด winwar ให้กิล §6" + guild + " §aเป็น winwar §z" + win));
         }

         data.func_76185_a();
         if (px.inguild) {
            guild = px.guildname.toLowerCase();
            px.ghost = tag.func_74779_i("host" + guild);
            px.mem01 = tag.func_74779_i("mem01" + guild);
            px.mem02 = tag.func_74779_i("mem02" + guild);
            px.mem03 = tag.func_74779_i("mem03" + guild);
            px.mem04 = tag.func_74779_i("mem04" + guild);
            px.mem05 = tag.func_74779_i("mem05" + guild);
            px.mem06 = tag.func_74779_i("mem06" + guild);
            px.mem07 = tag.func_74779_i("mem07" + guild);
            px.mem08 = tag.func_74779_i("mem08" + guild);
            px.mem09 = tag.func_74779_i("mem09" + guild);
            px.mem10 = tag.func_74779_i("mem10" + guild);
            px.mem11 = tag.func_74779_i("mem11" + guild);
            px.mem12 = tag.func_74779_i("mem12" + guild);
            px.mem13 = tag.func_74779_i("mem13" + guild);
            px.mem14 = tag.func_74779_i("mem14" + guild);
            px.mem15 = tag.func_74779_i("mem15" + guild);
            px.mem16 = tag.func_74779_i("mem16" + guild);
            px.mem17 = tag.func_74779_i("mem17" + guild);
            px.mem18 = tag.func_74779_i("mem18" + guild);
            px.mem19 = tag.func_74779_i("mem19" + guild);
            px.mem20 = tag.func_74779_i("mem20" + guild);
            px.mem21 = tag.func_74779_i("mem21" + guild);
            px.mem22 = tag.func_74779_i("mem22" + guild);
            px.mem23 = tag.func_74779_i("mem23" + guild);
            px.mem24 = tag.func_74779_i("mem24" + guild);
            px.mem25 = tag.func_74779_i("mem25" + guild);
            px.mem26 = tag.func_74779_i("mem26" + guild);
            px.mem27 = tag.func_74779_i("mem27" + guild);
            px.mem28 = tag.func_74779_i("mem28" + guild);
            px.mem29 = tag.func_74779_i("mem29" + guild);
            px.guildlv = tag.func_74762_e("lv" + guild);
            px.guildexp = tag.func_74762_e("exp" + guild);
            px.winwar = tag.func_74767_n("winwar" + guild);
            px.enemy = tag.func_74779_i("enemy" + guild);
         } else {
            px.ghost = "";
            px.mem01 = "";
            px.mem02 = "";
            px.mem03 = "";
            px.mem04 = "";
            px.mem05 = "";
            px.mem06 = "";
            px.mem07 = "";
            px.mem08 = "";
            px.mem09 = "";
         }

         mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
      } else {
         player.func_145747_a(new ChatComponentText("§cกรุณาใส่คำสั่ง  §e/homeguild open §cหรือ §e/homeguildclose §cเท่านั้น"));
      }

   }
}
