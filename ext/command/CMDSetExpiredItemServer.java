package ext.command;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.NumberInvalidException;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import utilities.ExpireItemSystem;

public class CMDSetExpiredItemServer extends CommandBase {
   public String func_71517_b() {
      return "itemday";
   }

   public String func_71518_a(ICommandSender icommandsender) {
      return "/itemday <player> iditem count time timevalue";
   }

   public void func_71515_b(ICommandSender sender, String[] astring) {
      World world = sender.func_130014_f_();
      if (!world.field_72995_K) {
         EntityPlayerMP entityplayermp = func_82359_c(sender, astring[0]);
         Item item = getItemByText(sender, astring[1]);
         int i = 1;
         int j = false;
         if (astring.length >= 3) {
            i = func_71532_a(sender, astring[2], 1, 64);
         }

         ItemStack itemstack = new ItemStack(item, i, 0);
         if (itemstack != null) {
            NBTTagCompound nbt = itemstack.func_77978_p();
            if (nbt == null) {
               nbt = new NBTTagCompound();
            }

            String timeStamp = (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")).format(Calendar.getInstance().getTime());
            nbt.func_74778_a("Ctime", timeStamp);
            nbt.func_74778_a("time", astring[3]);
            nbt.func_74778_a("timevalue", astring[4]);
            if (astring[4].toLowerCase().matches("d")) {
               System.out.println("Expired time " + astring[3] + " day");
               nbt.func_74778_a("Dtime", ExpireItemSystem.getCalDay(astring[3]));
            } else if (astring[4].toLowerCase().matches("h")) {
               System.out.println("Expired time " + astring[3] + " hour");
               nbt.func_74778_a("Dtime", ExpireItemSystem.getCalHour(astring[3]));
            } else if (astring[4].toLowerCase().matches("s")) {
               System.out.println("Expired time " + astring[3] + " second");
               nbt.func_74778_a("Dtime", ExpireItemSystem.getCalSecond(astring[3]));
            } else if (astring[4].toLowerCase().matches("m")) {
               System.out.println("Expired time " + astring[3] + " month");
               nbt.func_74778_a("Dtime", ExpireItemSystem.getCalMonth(astring[3]));
            } else if (astring[4].toLowerCase().matches("mn")) {
               System.out.println("Expired time " + astring[3] + " minutes");
               nbt.func_74778_a("Dtime", ExpireItemSystem.getCalMinute(astring[3]));
            }

            nbt.func_74757_a("chkitem", true);
            String CTime = nbt.func_74779_i("Ctime");
            String DTime = nbt.func_74779_i("Dtime");
            System.out.println("StampTime " + CTime);
            System.out.println("ExpireTime " + DTime);
            itemstack.func_77982_d(nbt);
         }

         EntityItem entityitem = entityplayermp.func_71019_a(itemstack, false);
         entityitem.field_145804_b = 0;
         entityitem.func_145797_a(entityplayermp.func_70005_c_());
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
