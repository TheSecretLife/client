package aguild;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class packetplayerdata extends packetmod {
   private static NBTTagCompound data;
   private static Random rand = new Random();
   private static int entityID;

   public packetplayerdata(EntityPlayer player) {
      data = new NBTTagCompound();
      entityID = player.func_145782_y();
      playerdata.get(player).saveNBTData(data);
   }

   public packetplayerdata() {
   }

   public void toBytes(ByteBuf buf) {
      ByteBufUtils.writeTag(buf, data);
      buf.writeInt(entityID);
   }

   public void fromBytes(ByteBuf buf) {
      data = ByteBufUtils.readTag(buf);
      entityID = buf.readInt();
   }

   public static class Handler implements IMessageHandler {
      @SideOnly(Side.CLIENT)
      public IMessage onMessage(packetplayerdata message, MessageContext ctx) {
         World theWorld = Minecraft.func_71410_x().field_71441_e;
         EntityPlayer player = getEntityByID(packetplayerdata.entityID, theWorld);
         playerdata.get(player).loadNBTData(packetplayerdata.data);
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
