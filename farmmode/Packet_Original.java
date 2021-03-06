package farmmode;

import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;

public abstract class Packet_Original implements IMessage {
   public abstract void fromBytes(ByteBuf var1);

   public abstract void toBytes(ByteBuf var1);

   public void sendToAll() {
      ModStart.networkChannel.sendToAll(this);
   }

   public void sendTo(EntityPlayerMP player) {
      ModStart.networkChannel.sendTo(this, player);
   }

   public void sendToServer() {
      ModStart.networkChannel.sendToServer(this);
   }

   public void sendToArea(EntityPlayerMP player) {
      ModStart.networkChannel.sendToAllAround(this, new TargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 20.0D));
   }
}
