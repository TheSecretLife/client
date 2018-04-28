package myset3d;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(
   modid = "equip3d",
   name = "Equip3D",
   version = "1.0"
)
public class MainMod {
   public static final String MOD_ID = "equip3d";
   @Instance("equip3d")
   public static MainMod instance;
   @SidedProxy(
      clientSide = "myset3d.Clientproxy",
      serverSide = "myset3d.Serverproxy"
   )
   public static Serverproxy proxy;

   @EventHandler
   public void initialise(FMLInitializationEvent e) {
      RegisterItem.reg();
      proxy.registerRenderers();
   }
}
