package aguild;

import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;

public abstract class packetmod implements IMessage {
   public abstract void fromBytes(ByteBuf var1);

   public abstract void toBytes(ByteBuf var1);

   public void sendToAll() {
      mod.network.sendToAll(this);
   }

   public void sendTo(EntityPlayerMP player) {
      mod.network.sendTo(this, player);
   }

   public void sendToServer() {
      mod.network.sendToServer(this);
   }

   public void sendToArea(EntityPlayerMP player, int radius) {
      mod.network.sendToAllAround(this, new TargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, (double)radius));
   }
}
