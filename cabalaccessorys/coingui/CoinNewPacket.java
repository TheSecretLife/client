package cabalaccessorys.coingui;

import cabalaccessorys.BasicPacket;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import java.util.Random;

public class CoinNewPacket extends BasicPacket {
   public static int Slot;
   public static Random rand = new Random();

   public CoinNewPacket(int guiID) {
      Slot = guiID;
   }

   public CoinNewPacket() {
      this(0);
   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(Slot);
   }

   public void fromBytes(ByteBuf buf) {
      Slot = buf.readInt();
   }

   public static class Handler implements IMessageHandler {
      public IMessage onMessage(CoinNewPacket message, MessageContext ctx) {
         return null;
      }
   }
}
