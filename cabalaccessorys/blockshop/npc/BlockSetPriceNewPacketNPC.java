package cabalaccessorys.blockshop.npc;

import cabalaccessorys.BasicPacket;
import cabalaccessorys.data.PlayerData;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class BlockSetPriceNewPacketNPC extends BasicPacket {
   public static int setprice;
   public static int setsprice;
   public static Random rand = new Random();

   public BlockSetPriceNewPacketNPC(int guiID, int id2) {
      setprice = guiID;
      setsprice = id2;
   }

   public BlockSetPriceNewPacketNPC() {
      this(0, 0);
   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(setprice);
      buf.writeInt(setsprice);
   }

   public void fromBytes(ByteBuf buf) {
      setprice = buf.readInt();
      setsprice = buf.readInt();
   }

   public static class Handler implements IMessageHandler {
      public IMessage onMessage(BlockSetPriceNewPacketNPC message, MessageContext ctx) {
         EntityPlayer p = ctx.getServerHandler().field_147369_b;
         PlayerData px = PlayerData.get(p);
         npcentity teshop = px.TeSop;
         if (BlockSetPriceNewPacketNPC.setprice != 0) {
            if (BlockSetPriceNewPacketNPC.setsprice == 1) {
               px.TeSop.price1 = BlockSetPriceNewPacketNPC.setprice;
               px.blockprice1 = BlockSetPriceNewPacketNPC.setprice;
            } else if (BlockSetPriceNewPacketNPC.setsprice == 2) {
               px.TeSop.price2 = BlockSetPriceNewPacketNPC.setprice;
               px.blockprice2 = BlockSetPriceNewPacketNPC.setprice;
            } else if (BlockSetPriceNewPacketNPC.setsprice == 3) {
               px.TeSop.price3 = BlockSetPriceNewPacketNPC.setprice;
               px.blockprice3 = BlockSetPriceNewPacketNPC.setprice;
            } else if (BlockSetPriceNewPacketNPC.setsprice == 4) {
               px.TeSop.price4 = BlockSetPriceNewPacketNPC.setprice;
               px.blockprice4 = BlockSetPriceNewPacketNPC.setprice;
            } else if (BlockSetPriceNewPacketNPC.setsprice == 5) {
               px.TeSop.price5 = BlockSetPriceNewPacketNPC.setprice;
               px.blockprice5 = BlockSetPriceNewPacketNPC.setprice;
            } else if (BlockSetPriceNewPacketNPC.setsprice == 6) {
               px.TeSop.price6 = BlockSetPriceNewPacketNPC.setprice;
               px.blockprice6 = BlockSetPriceNewPacketNPC.setprice;
            }

            if (!p.field_70170_p.field_72995_K) {
               p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §aตั้งราคาไอเทมในช่อง §d" + BlockSetPriceNewPacketNPC.setsprice + " §aในราคา §z" + BlockSetPriceNewPacketNPC.setprice));
            }

            px.guishop = true;
            px.TeSop = teshop;
         } else {
            if (!p.field_70170_p.field_72995_K) {
               p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cต้องใส่ตัวเลขเพื่อตั้งราคาไอเทม"));
            }

            px.guishop = true;
            px.TeSop = teshop;
         }

         return null;
      }
   }
}
