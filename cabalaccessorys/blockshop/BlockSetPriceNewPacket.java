package cabalaccessorys.blockshop;

import cabalaccessorys.BasicPacket;
import cabalaccessorys.data.PlayerData;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class BlockSetPriceNewPacket extends BasicPacket {
   public static int setprice;
   public static int setsprice;
   public static Random rand = new Random();

   public BlockSetPriceNewPacket(int guiID, int id2) {
      setprice = guiID;
      setsprice = id2;
   }

   public BlockSetPriceNewPacket() {
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
      public IMessage onMessage(BlockSetPriceNewPacket message, MessageContext ctx) {
         EntityPlayer p = ctx.getServerHandler().field_147369_b;
         PlayerData px = PlayerData.get(p);
         sellerentity teshop = px.TeS;
         if (BlockSetPriceNewPacket.setprice != 0) {
            if (BlockSetPriceNewPacket.setsprice == 1) {
               px.TeS.price1 = BlockSetPriceNewPacket.setprice;
               px.blockprice1 = BlockSetPriceNewPacket.setprice;
            } else if (BlockSetPriceNewPacket.setsprice == 2) {
               px.TeS.price2 = BlockSetPriceNewPacket.setprice;
               px.blockprice2 = BlockSetPriceNewPacket.setprice;
            } else if (BlockSetPriceNewPacket.setsprice == 3) {
               px.TeS.price3 = BlockSetPriceNewPacket.setprice;
               px.blockprice3 = BlockSetPriceNewPacket.setprice;
            } else if (BlockSetPriceNewPacket.setsprice == 4) {
               px.TeS.price4 = BlockSetPriceNewPacket.setprice;
               px.blockprice4 = BlockSetPriceNewPacket.setprice;
            } else if (BlockSetPriceNewPacket.setsprice == 5) {
               px.TeS.price5 = BlockSetPriceNewPacket.setprice;
               px.blockprice5 = BlockSetPriceNewPacket.setprice;
            } else if (BlockSetPriceNewPacket.setsprice == 6) {
               px.TeS.price6 = BlockSetPriceNewPacket.setprice;
               px.blockprice6 = BlockSetPriceNewPacket.setprice;
            }

            if (!p.field_70170_p.field_72995_K) {
               p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §aตั้งราคาไอเทมในช่อง §d" + BlockSetPriceNewPacket.setsprice + " §aในราคา §z" + BlockSetPriceNewPacket.setprice));
            }

            px.guishop = true;
            px.TeS = teshop;
         } else {
            if (!p.field_70170_p.field_72995_K) {
               p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cต้องใส่ตัวเลขเพื่อตั้งราคาไอเทม"));
            }

            px.guishop = true;
            px.TeS = teshop;
         }

         return null;
      }
   }
}
