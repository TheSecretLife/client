package srcpet;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;

public class ckey {
   public static final int CUSTOM_INV = 0;
   private static final String[] desc = new String[]{"KeyINVnew"};
   private static final int[] keyValues = new int[]{25};
   private final KeyBinding[] keys;

   public ckey() {
      this.keys = new KeyBinding[desc.length];

      for(int i = 0; i < desc.length; ++i) {
         this.keys[i] = new KeyBinding(desc[i], keyValues[i], "SiamSagaKey");
         ClientRegistry.registerKeyBinding(this.keys[i]);
      }

   }

   @SubscribeEvent
   public void onKeyInput(KeyInputEvent event) {
      EntityPlayer player = FMLClientHandler.instance().getClient().field_71439_g;
      if (!FMLClientHandler.instance().isGUIOpen(GuiChat.class)) {
         Minecraft mc = FMLClientHandler.instance().getClient();
         if (this.keys[0].func_151468_f()) {
            mainclass.networkChannel.sendToServer(new packgui(1));
         }
      }

   }
}
