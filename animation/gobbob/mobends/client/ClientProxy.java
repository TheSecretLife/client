package animation.gobbob.mobends.client;

import animation.gobbob.mobends.AnimatedEntity;
import animation.gobbob.mobends.CommonProxy;
import animation.gobbob.mobends.event.EventHandler_DataUpdate;
import animation.gobbob.mobends.pack.BendsPack;
import animation.gobbob.mobends.settings.SettingsBoolean;
import animation.gobbob.mobends.settings.SettingsNode;
import cabalaccessorys.api.ck;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

public class ClientProxy extends CommonProxy {
   public static final ResourceLocation RES_ITEM_GLINT = new ResourceLocation("textures/misc/enchanted_item_glint.png");
   public static final ResourceLocation texture_NULL = new ResourceLocation("mobends", "textures/white.png");
   public static final ResourceLocation GOBLIN_CAPE = new ResourceLocation("mobends", "textures/goblinCape.png");
   private static Minecraft mc = Minecraft.func_71410_x();

   public void preInit(Configuration config) {
      AnimatedEntity.registerRendering();
      MinecraftForge.EVENT_BUS.register(new EventHandler_DataUpdate());
      FMLCommonHandler.instance().bus().register(new EventHandler_DataUpdate());
      MinecraftForge.EVENT_BUS.register(new ck(mc));

      for(int i = 0; i < AnimatedEntity.animatedEntities.length; ++i) {
         AnimatedEntity.animatedEntities[i].animate = config.get("Animate", AnimatedEntity.animatedEntities[i].id, true).getBoolean();
      }

      ((SettingsBoolean)SettingsNode.getSetting("swordTrail")).data = config.get("General", "Sword Trail", true).getBoolean();
      BendsPack.preInit(config);
   }
}
