package aguild;

import aguild.guildwar.blockguildentity;
import aguild.guildwar.creblock;
import aguild.guildwar.enwar;
import aguild.guildwar.spawnSlimeBlock;
import aguild.guildwar.spawnSlimeTE;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;

@Mod(
   modid = "aguild",
   name = "aguild",
   version = "1.0"
)
public class mod {
   @SidedProxy(
      serverSide = "aguild.proxyserver",
      clientSide = "aguild.proxyclient"
   )
   public static proxyserver proxy;
   @Instance("aguild")
   public static mod instance;
   public static SimpleNetworkWrapper network;
   public static Item iguild;
   public static Item reward;
   public static Block spawnblockz;
   public static Block blockguild;

   @EventHandler
   public void prerunmod(FMLPreInitializationEvent event) {
      network = NetworkRegistry.INSTANCE.newSimpleChannel("agudn");
      this.registerpacket();
   }

   @EventHandler
   public void runmod(FMLInitializationEvent event) {
      MinecraftForge.EVENT_BUS.register(new serverhandler());
      NetworkRegistry.INSTANCE.registerGuiHandler(this, new proxyserver());
      EntityRegistry.registerGlobalEntityID(enwar.class, "enwar", EntityRegistry.findGlobalUniqueEntityId());
      iguild = new itemguild("iguild");
      GameRegistry.registerItem(iguild, "iguild");
      LanguageRegistry.addName(iguild, "§6หินกิล");
      reward = new itemguild("reward");
      GameRegistry.registerItem(reward, "reward");
      LanguageRegistry.addName(reward, "§6ตราชนะสงคราม");
      spawnblockz = (new spawnSlimeBlock()).func_149663_c("spawnblockz");
      GameRegistry.registerBlock(spawnblockz, "spawnblockz");
      LanguageRegistry.addName(spawnblockz, "§6จุดเกิดหินกิล");
      GameRegistry.registerTileEntity(spawnSlimeTE.class, "spawnSlimeTE");
      blockguild = (new creblock()).func_149663_c("blockguild");
      GameRegistry.registerBlock(blockguild, "blockguild");
      LanguageRegistry.addName(blockguild, "§6หินกิล");
      GameRegistry.registerTileEntity(blockguildentity.class, "blockguildentity");
      proxy.run();
   }

   @EventHandler
   public void runserver(FMLServerStartingEvent event) {
      MinecraftServer server = MinecraftServer.func_71276_C();
      ICommandManager command = server.func_71187_D();
      ServerCommandManager manager = (ServerCommandManager)command;
      manager.func_71560_a(new commandguild());
      manager.func_71560_a(new guildchat());
   }

   private void registerpacket() {
      network.registerMessage(packetplayerdata.Handler.class, packetplayerdata.class, 0, Side.CLIENT);
      network.registerMessage(packetgui.Handler.class, packetgui.class, 1, Side.SERVER);
      network.registerMessage(packetclick.Handler.class, packetclick.class, 2, Side.SERVER);
      network.registerMessage(packetclient.Handler.class, packetclient.class, 3, Side.CLIENT);
   }
}
