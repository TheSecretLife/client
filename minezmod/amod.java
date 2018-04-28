package minezmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import minezmod.lanch.localplayer;
import net.minecraftforge.common.MinecraftForge;

@Mod(
   modid = "minezmod",
   name = "SaoHPMod",
   version = "1.0"
)
public class amod {
   @SidedProxy(
      serverSide = "minezmod.sidesv",
      clientSide = "minezmod.sidecl"
   )
   public static sidesv side;
   @Instance("minezmod")
   public static amod sta;
   public static SimpleNetworkWrapper lanch;

   @EventHandler
   public void intro(FMLPreInitializationEvent e) {
      lanch = NetworkRegistry.INSTANCE.newSimpleChannel("minezmod");
      this.runlander();
   }

   public void runlander() {
      lanch.registerMessage(localplayer.Handler.class, localplayer.class, 0, Side.CLIENT);
   }

   @EventHandler
   public void hook(FMLInitializationEvent e) {
      NetworkRegistry.INSTANCE.registerGuiHandler(this, new sidesv());
      MinecraftForge.EVENT_BUS.register(new serverrun());
      side.install();
   }
}
