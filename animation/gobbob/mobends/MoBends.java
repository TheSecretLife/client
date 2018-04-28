package animation.gobbob.mobends;

import animation.gobbob.mobends.pack.BendsPack;
import animation.gobbob.mobends.settings.SettingsBoolean;
import animation.gobbob.mobends.settings.SettingsNode;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import java.io.File;
import net.minecraftforge.common.config.Configuration;

@Mod(
   modid = "mobends",
   version = "0.20.1"
)
public class MoBends {
   public static final String MODID = "mobends";
   public static final String MODNAME = "Mo' Bends";
   public static final String VERSION = "0.20.1";
   @SidedProxy(
      serverSide = "animation.gobbob.mobends.CommonProxy",
      clientSide = "animation.gobbob.mobends.client.ClientProxy"
   )
   public static CommonProxy proxy;
   @Instance("mobends")
   public static MoBends instance;
   public static File configFile;
   public static int refreshModel = 0;

   @EventHandler
   public void preInit(FMLPreInitializationEvent event) {
      configFile = event.getSuggestedConfigurationFile();
      Configuration config = new Configuration(event.getSuggestedConfigurationFile());
      config.load();
      proxy.preInit(config);
      config.save();
   }

   public static void saveConfig() {
      Configuration config = new Configuration(configFile);
      config.load();

      for(int i = 0; i < AnimatedEntity.animatedEntities.length; ++i) {
         config.get("Animate", AnimatedEntity.animatedEntities[i].id, false).setValue(AnimatedEntity.animatedEntities[i].animate);
      }

      config.get("General", "Sword Trail", true).setValue(((SettingsBoolean)SettingsNode.getSetting("swordTrail")).data);
      config.get("General", "Current Pack", true).setValue(BendsPack.currentPack);
      config.save();
   }

   @EventHandler
   public void init(FMLInitializationEvent event) {
   }
}
