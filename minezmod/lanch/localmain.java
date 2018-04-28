package minezmod.lanch;

import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;
import minezmod.amod;
import net.minecraft.entity.player.EntityPlayerMP;

public abstract class localmain implements IMessage {
   public abstract void fromBytes(ByteBuf var1);

   public abstract void toBytes(ByteBuf var1);

   public void sendToAll() {
      amod.lanch.sendToAll(this);
   }

   public void sendTo(EntityPlayerMP player) {
      amod.lanch.sendTo(this, player);
   }

   public void sendToServer() {
      amod.lanch.sendToServer(this);
   }

   public void sendToArea(EntityPlayerMP player) {
      amod.lanch.sendToAllAround(this, new TargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 20.0D));
   }
}
