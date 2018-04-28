package animation.gobbob.mobends.event;

import animation.gobbob.mobends.MoBends;
import animation.gobbob.mobends.client.gui.GuiMBMenu;
import animation.gobbob.mobends.pack.BendsPack;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

public class EventHandler_Keyboard {
   public static final KeyBinding key_Menu = new KeyBinding("Mo'Bends Menu", 34, "GobBob's Mods");

   @SubscribeEvent
   public void onKeyPressed(KeyInputEvent event) throws IOException {
      if (key_Menu.func_151470_d()) {
         Minecraft.func_71410_x().func_147108_a(new GuiMBMenu());
         ++MoBends.refreshModel;
         BendsPack.initPacks();
      }

   }
}
