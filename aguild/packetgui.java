package aguild;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;

public class packetgui extends packetmod {
   public static int Slot;
   public static Random rand = new Random();

   public packetgui(int guiID) {
      Slot = guiID;
   }

   public packetgui() {
      this(0);
   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(Slot);
   }

   public void fromBytes(ByteBuf buf) {
      Slot = buf.readInt();
   }

   public static class Handler implements IMessageHandler {
      public IMessage onMessage(packetgui message, MessageContext ctx) {
         EntityPlayer player = ctx.getServerHandler().field_147369_b;
         player.openGui(mod.instance, packetgui.Slot, player.field_70170_p, (int)player.field_70165_t, (int)player.field_70163_u, (int)player.field_70161_v);
         return null;
      }
   }
}
