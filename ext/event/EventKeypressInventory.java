package ext.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import ext.network.PacketDispatcher;
import ext.network.server.OpenGuiMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import org.lwjgl.input.Keyboard;

public class EventKeypressInventory {
   @SubscribeEvent
   public void onKeyPressInv(KeyInputEvent e) {
      if (GameSettings.func_100015_a(Minecraft.func_71410_x().field_71474_y.field_151445_Q)) {
         PacketDispatcher.sendToServer(new OpenGuiMessage(10));
      }

      if (Keyboard.isKeyDown(1)) {
         PacketDispatcher.sendToServer(new OpenGuiMessage(10));
      }

      if (GameSettings.func_100015_a(Minecraft.func_71410_x().field_71474_y.field_74312_F)) {
         PacketDispatcher.sendToServer(new OpenGuiMessage(11));
      }

      if (GameSettings.func_100015_a(Minecraft.func_71410_x().field_71474_y.field_74313_G)) {
         PacketDispatcher.sendToServer(new OpenGuiMessage(11));
      }

   }
}
