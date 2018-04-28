package ext.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import ext.network.PacketDispatcher;
import ext.network.server.OpenGuiMessage;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import org.lwjgl.input.Keyboard;

public class EventKeypressInventoryClose {
   @SubscribeEvent
   public void onItemTooltip(ItemTooltipEvent e) {
      if (e.itemStack.func_77978_p() != null) {
         NBTTagCompound nbt = e.itemStack.func_77978_p();
         if (nbt == null) {
            nbt = new NBTTagCompound();
         }

         if (nbt.func_74764_b("time")) {
            String date;
            if (nbt.func_74767_n("chkitem")) {
               date = (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")).format(Calendar.getInstance().getTime());
               e.toolTip.add("§c*เช็คเวลาจากเครื่องเซิร์ฟเวอร์*");
               e.toolTip.add("§bเวลาเครื่องผู้เล่น§a" + date);
               e.toolTip.add("§6สแตมเวลาเมื่อ  §b" + nbt.func_74779_i("Ctime"));
               e.toolTip.add("§6หมดอายุ       §c" + nbt.func_74779_i("Dtime"));
               String date = null;
               if (nbt.func_74779_i("timevalue").equalsIgnoreCase("s")) {
                  date = "วินาที";
               } else if (nbt.func_74779_i("timevalue").equalsIgnoreCase("mn")) {
                  date = "นาที";
               } else if (nbt.func_74779_i("timevalue").equalsIgnoreCase("h")) {
                  date = "ชั่วโมง";
               } else if (nbt.func_74779_i("timevalue").equalsIgnoreCase("d")) {
                  date = "วัน";
               } else if (nbt.func_74779_i("timevalue").equalsIgnoreCase("m")) {
                  date = "เดือน";
               }

               e.toolTip.add("§cไอเทมมีการจำกัดเวลา §b" + nbt.func_74779_i("time") + " §6" + date + " §f[หลังจากเปิดใช้งาน]");
            } else {
               date = null;
               if (nbt.func_74779_i("timevalue").equalsIgnoreCase("s")) {
                  date = "วินาที";
               } else if (nbt.func_74779_i("timevalue").equalsIgnoreCase("mn")) {
                  date = "นาที";
               } else if (nbt.func_74779_i("timevalue").equalsIgnoreCase("h")) {
                  date = "ชั่วโมง";
               } else if (nbt.func_74779_i("timevalue").equalsIgnoreCase("d")) {
                  date = "วัน";
               } else if (nbt.func_74779_i("timevalue").equalsIgnoreCase("m")) {
                  date = "เดือน";
               }

               e.toolTip.add("§cไอเทมมีการจำกัดเวลา §b" + nbt.func_74779_i("time") + " §6" + date + " §f[หลังจากเปิดใช้งาน]");
            }
         }
      }

   }

   @SubscribeEvent
   public void onKeyPressInvGUI(GuiScreenEvent e) {
      if (e.gui instanceof GuiInventory && Keyboard.isKeyDown(1)) {
         PacketDispatcher.sendToServer(new OpenGuiMessage(10));
      }

   }
}
