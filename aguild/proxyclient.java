package aguild;

import aguild.gui.newscreengui;
import aguild.guildwar.blockguildentity;
import aguild.guildwar.crerender;
import aguild.guildwar.enwar;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class proxyclient extends proxyserver {
   private final Minecraft mc = Minecraft.func_71410_x();

   public void run() {
      FMLCommonHandler.instance().bus().register(new fskey());
      MinecraftForge.EVENT_BUS.register(new clientHandler());
      MinecraftForge.EVENT_BUS.register(new newscreengui(this.mc));
      RenderingRegistry.registerEntityRenderingHandler(enwar.class, new blockwarrender(new blockwarmodel(1.0F), 1.0F));
      ClientRegistry.bindTileEntitySpecialRenderer(blockguildentity.class, new crerender());
   }
}
