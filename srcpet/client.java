package srcpet;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import srcpet.entity.entitypet;
import srcpet.model.modelpet;
import srcpet.render.renderpet;

public class client extends server {
   public void reg() {
      FMLCommonHandler.instance().bus().register(new ckey());
      RenderingRegistry.registerEntityRenderingHandler(entitypet.class, new renderpet(new modelpet(0.3F), 1.0F));
   }
}
