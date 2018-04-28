package aguild;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;

public class fskey {
   public static final int CUSTOM_INV = 0;
   private static final String[] desc = new String[]{"guildkey"};
   private static final int[] keyValues = new int[]{34};
   private final KeyBinding[] keys;

   public fskey() {
      this.keys = new KeyBinding[desc.length];

      for(int i = 0; i < desc.length; ++i) {
         this.keys[i] = new KeyBinding(desc[i], keyValues[i], "SiamSagaKey");
         ClientRegistry.registerKeyBinding(this.keys[i]);
      }

   }

   @SubscribeEvent
   public void onKeyInput(KeyInputEvent event) {
      EntityPlayer player = FMLClientHandler.instance().getClient().field_71439_g;
      if (!FMLClientHandler.instance().isGUIOpen(GuiChat.class) && this.keys[0].func_151468_f()) {
         player.openGui(mod.instance, 1, player.field_70170_p, (int)player.field_70165_t, (int)player.field_70163_u, (int)player.field_70161_v);
      }

   }
}
