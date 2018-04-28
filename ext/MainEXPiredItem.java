package ext;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import ext.command.CMDSetExpiredItem;
import ext.command.CMDSetExpiredItemServer;
import ext.event.EventCheckItem;
import ext.network.PacketDispatcher;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;

@Mod(
   modid = "expireditem",
   name = "ExpiredItem",
   version = "1.0"
)
public class MainEXPiredItem {
   public static final String MOD_ID = "expireditem";
   @Instance("expireditem")
   public static MainEXPiredItem instance;
   @SidedProxy(
      clientSide = "ext.ClientproxyEXPItem",
      serverSide = "ext.ServerproxyEXPItem"
   )
   public static ServerproxyEXPItem proxy;

   @EventHandler
   public void preStart(FMLPreInitializationEvent e) {
      PacketDispatcher.registerPackets();
   }

   @EventHandler
   public void initialise(FMLInitializationEvent e) {
      proxy.registerRenderers();
      MinecraftForge.EVENT_BUS.register(new EventCheckItem());
      NetworkRegistry.INSTANCE.registerGuiHandler(this, new ServerproxyEXPItem());
   }

   @EventHandler
   public void serverStart(FMLServerStartingEvent event) {
      MinecraftServer server = MinecraftServer.func_71276_C();
      ICommandManager command = server.func_71187_D();
      ServerCommandManager manager = (ServerCommandManager)command;
      manager.func_71560_a(new CMDSetExpiredItem());
      manager.func_71560_a(new CMDSetExpiredItemServer());
   }
}
