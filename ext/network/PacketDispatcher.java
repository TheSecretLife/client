package ext.network;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import ext.network.server.OpenGuiMessage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketDispatcher {
   private static byte packetId = 0;
   private static final SimpleNetworkWrapper dispatcher;

   public static final void registerPackets() {
      registerMessage(OpenGuiMessage.class);
   }

   private static final void registerMessage(Class clazz) {
      if (AbstractMessage.AbstractClientMessage.class.isAssignableFrom(clazz)) {
         dispatcher.registerMessage(clazz, clazz, packetId++, Side.CLIENT);
      } else if (AbstractMessage.AbstractServerMessage.class.isAssignableFrom(clazz)) {
         dispatcher.registerMessage(clazz, clazz, packetId++, Side.SERVER);
      } else {
         dispatcher.registerMessage(clazz, clazz, packetId, Side.CLIENT);
         dispatcher.registerMessage(clazz, clazz, packetId++, Side.SERVER);
      }

   }

   public static final void sendTo(IMessage message, EntityPlayerMP player) {
      dispatcher.sendTo(message, player);
   }

   public static void sendToAll(IMessage message) {
      dispatcher.sendToAll(message);
   }

   public static final void sendToAllAround(IMessage message, TargetPoint point) {
      dispatcher.sendToAllAround(message, point);
   }

   public static final void sendToAllAround(IMessage message, int dimension, double x, double y, double z, double range) {
      sendToAllAround(message, new TargetPoint(dimension, x, y, z, range));
   }

   public static final void sendToAllAround(IMessage message, EntityPlayer player, double range) {
      sendToAllAround(message, player.field_70170_p.field_73011_w.field_76574_g, player.field_70165_t, player.field_70163_u, player.field_70161_v, range);
   }

   public static final void sendToDimension(IMessage message, int dimensionId) {
      dispatcher.sendToDimension(message, dimensionId);
   }

   public static final void sendToServer(IMessage message) {
      dispatcher.sendToServer(message);
   }

   static {
      dispatcher = NetworkRegistry.INSTANCE.newSimpleChannel("expireditem");
   }
}
