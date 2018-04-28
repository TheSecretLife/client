package ext.command;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.NumberInvalidException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;

public class CMDSetExpiredItem extends CommandBase {
   public String func_71517_b() {
      return "itd";
   }

   public String func_71518_a(ICommandSender icommandsender) {
      return "/itd time timevalue";
   }

   public void func_71515_b(ICommandSender sender, String[] astring) {
      EntityPlayer player = (EntityPlayer)sender;
      ItemStack stack = player.field_71071_by.func_70448_g();
      if (stack != null) {
         NBTTagCompound nbt = stack.func_77978_p();
         if (nbt == null) {
            nbt = new NBTTagCompound();
         }

         String timeStamp = (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")).format(Calendar.getInstance().getTime());
         nbt.func_74757_a("chkitem", false);
         nbt.func_74778_a("time", astring[0]);
         nbt.func_74778_a("timevalue", astring[1]);
         if (astring[1].toLowerCase().matches("d")) {
            player.func_146105_b(new ChatComponentTranslation("§aระยะเวลารวม §e" + astring[0] + " §aวัน", new Object[0]));
         } else if (astring[1].toLowerCase().matches("h")) {
            player.func_146105_b(new ChatComponentTranslation("§aระยะเวลารวม §e" + astring[0] + " §aชม.", new Object[0]));
         } else if (astring[1].toLowerCase().matches("s")) {
            player.func_146105_b(new ChatComponentTranslation("§aระยะเวลารวม §e" + astring[0] + " §aวินาที", new Object[0]));
         } else if (astring[1].toLowerCase().matches("m")) {
            player.func_146105_b(new ChatComponentTranslation("§aระยะเวลารวม §e" + astring[0] + " §aเดือน", new Object[0]));
         } else if (astring[1].toLowerCase().matches("mn")) {
            player.func_146105_b(new ChatComponentTranslation("§aระยะเวลารวม §e" + astring[0] + " §aนาที", new Object[0]));
         }

         stack.func_77982_d(nbt);
      }

   }

   public int compareTo(Object arg0) {
      return 0;
   }

   public static Item getItemByText(ICommandSender p_147179_0_, String p_147179_1_) {
      Item item = (Item)Item.field_150901_e.func_82594_a(p_147179_1_);
      if (item == null) {
         try {
            Item item1 = Item.func_150899_d(Integer.parseInt(p_147179_1_));
            if (item1 != null) {
               ChatComponentTranslation chatcomponenttranslation = new ChatComponentTranslation("commands.generic.deprecatedId", new Object[]{Item.field_150901_e.func_148750_c(item1)});
               chatcomponenttranslation.func_150256_b().func_150238_a(EnumChatFormatting.GRAY);
               p_147179_0_.func_145747_a(chatcomponenttranslation);
            }

            item = item1;
         } catch (NumberFormatException var5) {
            ;
         }
      }

      if (item == null) {
         throw new NumberInvalidException("commands.give.notFound", new Object[]{p_147179_1_});
      } else {
         return item;
      }
   }
}
