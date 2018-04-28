package aguild;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class packetclient extends packetmod {
   private static int entityID;
   private static int int1;
   private static int int2;
   private static String string1;
   private static String string2;

   public packetclient(EntityPlayer player, int i1, int i2, String s1, String s2) {
      int1 = i1;
      int2 = i2;
      string1 = s1;
      string2 = s2;
      entityID = player.func_145782_y();
   }

   public packetclient() {
   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(entityID);
      buf.writeInt(int1);
      buf.writeInt(int2);
      ByteBufUtils.writeUTF8String(buf, string1);
      ByteBufUtils.writeUTF8String(buf, string2);
   }

   public void fromBytes(ByteBuf buf) {
      entityID = buf.readInt();
      int1 = buf.readInt();
      int2 = buf.readInt();
      string1 = ByteBufUtils.readUTF8String(buf);
      string2 = ByteBufUtils.readUTF8String(buf);
   }

   public static class Handler implements IMessageHandler {
      @SideOnly(Side.CLIENT)
      public IMessage onMessage(packetclient message, MessageContext ctx) {
         World theWorld = Minecraft.func_71410_x().field_71441_e;
         EntityPlayer player = getEntityByID(packetclient.entityID, theWorld);
         if (packetclient.int1 == 1) {
            player.openGui(mod.instance, 5, player.field_70170_p, (int)player.field_70165_t, (int)player.field_70163_u, (int)player.field_70161_v);
         } else if (packetclient.int1 == 2) {
            player.func_71053_j();
            player.openGui(mod.instance, 1, player.field_70170_p, (int)player.field_70165_t, (int)player.field_70163_u, (int)player.field_70161_v);
         }

         return null;
      }

      @SideOnly(Side.CLIENT)
      public static EntityPlayer getEntityByID(int entityID, World world) {
         Iterator var2 = world.func_72910_y().iterator();

         Object o;
         do {
            if (!var2.hasNext()) {
               return null;
            }

            o = var2.next();
         } while(!(o instanceof EntityPlayer) || ((EntityPlayer)o).func_145782_y() != entityID);

         return (EntityPlayer)o;
      }
   }
}
