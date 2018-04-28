package sp.network;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import sp.network.client.SyncPlayerPropsMessage;
import sp.network.client.UpdateCountBlockSpawnClient;
import sp.network.server.OpenGuiMessage;
import sp.network.server.PlaySoundOnserver;
import sp.network.server.UpdateCountBlockSpawn;
import sp.network.server.onServersetdataspawn;

public class PacketDispatcher {
   private static final SimpleNetworkWrapper dispatcher;
   private static byte packetId;

   public static void registerPackets() {
      registerMessage(SyncPlayerPropsMessage.class);
      registerMessage(OpenGuiMessage.class);
      registerMessage(onServersetdataspawn.class);
      registerMessage(UpdateCountBlockSpawn.class);
      registerMessage(UpdateCountBlockSpawnClient.class);
      registerMessage(PlaySoundOnserver.class);
   }

   private static void registerMessage(Class clazz) {
      if (AbstractMessage.AbstractClientMessage.class.isAssignableFrom(clazz)) {
         dispatcher.registerMessage(clazz, clazz, packetId++, Side.CLIENT);
      } else if (AbstractMessage.AbstractServerMessage.class.isAssignableFrom(clazz)) {
         dispatcher.registerMessage(clazz, clazz, packetId++, Side.SERVER);
      } else {
         dispatcher.registerMessage(clazz, clazz, packetId, Side.CLIENT);
         dispatcher.registerMessage(clazz, clazz, packetId++, Side.SERVER);
      }

   }

   public static void sendTo(IMessage message, EntityPlayerMP player) {
      dispatcher.sendTo(message, player);
   }

   public static void sendToAll(IMessage message) {
      dispatcher.sendToAll(message);
   }

   public static void sendToAllAround(IMessage message, TargetPoint point) {
      dispatcher.sendToAllAround(message, point);
   }

   public static void sendToAllAround(IMessage message, int dimension, double x, double y, double z, double range) {
      sendToAllAround(message, new TargetPoint(dimension, x, y, z, range));
   }

   public static void sendToAllAround(IMessage message, EntityPlayer player, double range) {
      sendToAllAround(message, player.field_70170_p.field_73011_w.field_76574_g, player.field_70165_t, player.field_70163_u, player.field_70161_v, range);
   }

   public static void sendToDimension(IMessage message, int dimensionId) {
      dispatcher.sendToDimension(message, dimensionId);
   }

   public static void sendToServer(IMessage message) {
      dispatcher.sendToServer(message);
   }

   static {
      dispatcher = NetworkRegistry.INSTANCE.newSimpleChannel("spawnmonster");
      packetId = 0;
   }
}
