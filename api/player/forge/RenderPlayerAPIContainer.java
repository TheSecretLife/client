package api.player.forge;

import com.google.common.eventbus.EventBus;
import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import java.util.Arrays;

public class RenderPlayerAPIContainer extends DummyModContainer {
   public RenderPlayerAPIContainer() {
      super(createMetadata());
   }

   public boolean registerBus(EventBus bus, LoadController controller) {
      return true;
   }

   private static ModMetadata createMetadata() {
      ModMetadata meta = new ModMetadata();
      meta.modId = "RenderPlayerAPI";
      meta.name = "Render Player API";
      meta.version = "1.0";
      meta.description = "Render Player API for Minecraft Forge";
      meta.url = "http://www.minecraftforum.net/topic/1261354-";
      meta.authorList = Arrays.asList("Divisor");
      return meta;
   }
}
