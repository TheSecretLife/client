package npcseller.network;

import com.google.common.base.Throwables;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import npcseller.Main;

public abstract class AbstractMessage implements IMessage, IMessageHandler {
   protected abstract void read(PacketBuffer var1) throws IOException;

   protected abstract void write(PacketBuffer var1) throws IOException;

   public abstract void process(EntityPlayer var1, Side var2);

   protected boolean isValidOnSide(Side side) {
      return true;
   }

   public void fromBytes(ByteBuf buffer) {
      try {
         this.read(new PacketBuffer(buffer));
      } catch (IOException var3) {
         throw Throwables.propagate(var3);
      }
   }

   public void toBytes(ByteBuf buffer) {
      try {
         this.write(new PacketBuffer(buffer));
      } catch (IOException var3) {
         throw Throwables.propagate(var3);
      }
   }

   public final IMessage onMessage(AbstractMessage msg, MessageContext ctx) {
      if (!msg.isValidOnSide(ctx.side)) {
         throw new RuntimeException("Invalid side " + ctx.side.name() + " for " + msg.getClass().getSimpleName());
      } else {
         msg.process(Main.proxy.getPlayerEntity(ctx), ctx.side);
         return null;
      }
   }

   public abstract static class AbstractServerMessage extends AbstractMessage {
      protected final boolean isValidOnSide(Side side) {
         return side.isServer();
      }
   }

   public abstract static class AbstractClientMessage extends AbstractMessage {
      protected final boolean isValidOnSide(Side side) {
         return side.isClient();
      }
   }
}
