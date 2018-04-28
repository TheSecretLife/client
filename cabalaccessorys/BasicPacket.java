package cabalaccessorys;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;

public abstract class BasicPacket implements IMessage {
   public abstract void fromBytes(ByteBuf var1);

   public abstract void toBytes(ByteBuf var1);

   public void sendToAll() {
      Start.networkChannel.sendToAll(this);
   }

   public void sendTo(EntityPlayerMP player) {
      Start.networkChannel.sendTo(this, player);
   }

   public void sendToServer() {
      Start.networkChannel.sendToServer(this);
   }
}
