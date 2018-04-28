package cabalaccessorys.blockshop.npc;

import cabalaccessorys.BasicPacket;
import cabalaccessorys.data.PlayerData;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;

public class BlockOpenShopNewPacketNPC extends BasicPacket {
   public static int Slot;
   public static Random rand = new Random();

   public BlockOpenShopNewPacketNPC(int guiID) {
      Slot = guiID;
   }

   public BlockOpenShopNewPacketNPC() {
      this(0);
   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(Slot);
   }

   public void fromBytes(ByteBuf buf) {
      Slot = buf.readInt();
   }

   public static class Handler implements IMessageHandler {
      public IMessage onMessage(BlockOpenShopNewPacketNPC message, MessageContext ctx) {
         EntityPlayer p = ctx.getServerHandler().field_147369_b;
         PlayerData px = PlayerData.get(p);
         if (!p.field_70170_p.field_72995_K) {
            boolean status = false;
            if (BlockOpenShopNewPacketNPC.Slot == 0) {
               if (!px.playerblockshop) {
                  for(int i = 0; i < 36; ++i) {
                     ItemStack sellitem = px.TeSop.SW.func_70301_a(i);
                     if (sellitem != null) {
                        NBTTagCompound nbt = sellitem.field_77990_d;
                        if (nbt == null) {
                           nbt = new NBTTagCompound();
                        }

                        if (!nbt.func_74764_b("price")) {
                           status = false;
                           p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cต้องใส่ราคาไอเทมก่อนขายไอเทม ช่อง " + i));
                           break;
                        }

                        status = true;
                     }
                  }

                  if (status) {
                     px.TeSop.opensell = true;
                     px.playerblockshop = true;
                     p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §aเปิดร้านแล้ว"));
                     px.TeSop.func_94058_c("§f[§aเปิดร้านอยู่§f] §z" + p.getDisplayName());
                  }
               } else {
                  px.TeSop.opensell = false;
                  px.playerblockshop = false;
                  p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §eปิดร้านแล้ว"));
                  px.TeSop.func_94058_c("§f[§cปิดร้าน§f] §z" + p.getDisplayName());
               }
            } else if (BlockOpenShopNewPacketNPC.Slot != 1) {
               if (BlockOpenShopNewPacketNPC.Slot == 2) {
                  if (px.playerblockshop) {
                     p.func_145747_a(new ChatComponentText("§cต้องปิดร้านก่อนถึงจะเก็บ NPC ได้"));
                  } else {
                     px.TeSop.func_70106_y();
                     px.npcshop = false;
                  }
               } else if (BlockOpenShopNewPacketNPC.Slot == 3) {
                  if (!px.normalmode) {
                     if (!px.dungeon) {
                        if (px.canshop) {
                           if (!px.npcshop) {
                              npcentity e = new npcentity(p.func_130014_f_());
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
         }

         return null;
      }
   }
}
