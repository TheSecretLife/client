package srcpet;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;

public class packgui extends packeter {
   public static int GuiID;
   public static Random rand = new Random();

   public packgui(int guiID) {
      GuiID = guiID;
   }

   public packgui() {
      this(0);
   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(GuiID);
   }

   public void fromBytes(ByteBuf buf) {
      GuiID = buf.readInt();
   }

   public static class Handler implements IMessageHandler {
      public IMessage onMessage(packgui message, MessageContext ctx) {
         EntityPlayer player = ctx.getServerHandler().field_147369_b;
         player.openGui(mainclass.ins, packgui.GuiID, player.field_70170_p, (int)player.field_70165_t, (int)player.field_70163_u, (int)player.field_70161_v);
         return null;
      }
   }
}
