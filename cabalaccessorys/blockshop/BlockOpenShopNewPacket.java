package cabalaccessorys.blockshop;

import cabalaccessorys.BasicPacket;
import cabalaccessorys.data.PlayerData;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;

public class BlockOpenShopNewPacket extends BasicPacket {
   public static int Slot;
   public static Random rand = new Random();

   public BlockOpenShopNewPacket(int guiID) {
      Slot = guiID;
   }

   public BlockOpenShopNewPacket() {
      this(0);
   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(Slot);
   }

   public void fromBytes(ByteBuf buf) {
      Slot = buf.readInt();
   }

   public static class Handler implements IMessageHandler {
      public IMessage onMessage(BlockOpenShopNewPacket message, MessageContext ctx) {
         EntityPlayer p = ctx.getServerHandler().field_147369_b;
         PlayerData px = PlayerData.get(p);
         if (!p.field_70170_p.field_72995_K) {
            ItemStack sell1;
            ItemStack sell2;
            ItemStack sell3;
            ItemStack sell4;
            ItemStack sell5;
            ItemStack sell6;
            if (BlockOpenShopNewPacket.Slot == 0) {
               if (!px.playerblockshop) {
                  sell1 = px.TeS.SW.func_70301_a(0);
                  sell2 = px.TeS.SW.func_70301_a(1);
                  sell3 = px.TeS.SW.func_70301_a(2);
                  sell4 = px.TeS.SW.func_70301_a(3);
                  sell5 = px.TeS.SW.func_70301_a(4);
                  sell6 = px.TeS.SW.func_70301_a(5);
                  if (sell1 == null && sell2 == null && sell3 == null && sell4 == null && sell5 == null && sell6 == null) {
                     p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cเปิดร้านไม่ได้ ไม่มีของที่จะขาย"));
                  } else if ((sell1 == null || px.TeS.price1 != 0) && (sell2 == null || px.TeS.price2 != 0) && (sell3 == null || px.TeS.price3 != 0) && (sell4 == null || px.TeS.price4 != 0) && (sell5 == null || px.TeS.price5 != 0) && (sell6 == null || px.TeS.price6 != 0)) {
                     px.TeS.opensell = true;
                     px.playerblockshop = true;
                     p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §aเปิดร้านแล้ว"));
                     px.TeS.func_94058_c("§f[§aเปิดร้านอยู่§f] §z" + p.getDisplayName());
                  } else {
                     p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cต้องใส่ราคาไอเทมก่อนขาย"));
                  }
               } else {
                  px.TeS.opensell = false;
                  px.playerblockshop = false;
                  p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §eปิดร้านแล้ว"));
                  px.TeS.func_94058_c("§f[§cปิดร้าน§f] §z" + p.getDisplayName());
               }
            } else if (BlockOpenShopNewPacket.Slot == 1) {
               px.Money += px.npcmoney - px.npcmoney / 10;
               int balance = px.npcmoney - px.npcmoney / 10;
               px.TeS.money = 0;
               p.func_145747_a(new ChatComponentText("§aรับเงินจาก NPC แล้ว จำนวน §e" + balance + " §aGold"));
               p.func_145747_a(new ChatComponentText("§aเสียภาษี §c" + px.npcmoney / 10 + " §aGold"));
            } else if (BlockOpenShopNewPacket.Slot == 2) {
               if (px.playerblockshop) {
                  p.func_145747_a(new ChatComponentText("§cต้องปิดร้านก่อนถึงจะเก็บ NPC ได้"));
               } else {
                  sell1 = px.TeS.SW.func_70301_a(0);
                  sell2 = px.TeS.SW.func_70301_a(1);
                  sell3 = px.TeS.SW.func_70301_a(2);
                  sell4 = px.TeS.SW.func_70301_a(3);
                  sell5 = px.TeS.SW.func_70301_a(4);
                  sell6 = px.TeS.SW.func_70301_a(5);
                  if (sell1 == null && sell2 == null && sell3 == null && sell4 == null && sell5 == null && sell6 == null && px.npcmoney == 0) {
                     px.TeS.func_70106_y();
                     px.npcshop = false;
                  } else {
                     p.func_145747_a(new ChatComponentText("§cต้องเก็บชองออกจาก NPC ให้หมดก่อน รวมถึงเงินใน NPC ด้วย"));
                  }
               }
            } else if (BlockOpenShopNewPacket.Slot == 3) {
               if (!px.normalmode) {
                  if (!px.dungeon) {
                     if (px.canshop) {
                        if (!px.npcshop) {
                           sellerentity e = new sellerentity(p.func_130014_f_());
                           e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
                           p.func_130014_f_().func_72838_d(e);
                           e.func_94058_c("§f[§cปิดร้าน§f] §z" + p.getDisplayName());
                           e.func_70903_f(true);
                           e.ownername = p.getDisplayName();
                           e.setOwner(p.func_110124_au().toString());
                           p.func_145747_a(new ChatComponentText("§aเรียก NPC ออกมาช่วยขายของแล้ว"));
                           p.func_145747_a(new ChatComponentText("§aคลิกขวาที่ NPC เพื่อตั้งขายไอเทม"));
                           px.npcshop = true;
                        } else {
                           p.func_145747_a(new ChatComponentText("§cคุณเรียก NPC ออกมาแล้วไม่สามารถเรียกได้อีก"));
                        }
                     } else {
                        p.func_145747_a(new ChatComponentText("§cไม่สามารถต้งร้านนอกเขตตลาดได้"));
                        p.func_145747_a(new ChatComponentText("§cพิมพ์ /spawn แล้วกดป้ายวาร์ปไปตลาด"));
                        p.func_145747_a(new ChatComponentText("§cเพื่อไปตั้งร้านค้าที่นั่น"));
                     }
                  } else {
                     p.func_145747_a(new ChatComponentText("§cเรียก NPC ในดันเจี้ยนไม่ได้"));
                  }
               } else {
                  p.func_145747_a(new ChatComponentText("§cเรียก NPC ในกิจกรรมไม่ได้"));
               }
            }
         }

         return null;
      }
   }
}
