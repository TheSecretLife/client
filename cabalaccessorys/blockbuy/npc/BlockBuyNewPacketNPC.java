package cabalaccessorys.blockbuy.npc;

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

public class BlockBuyNewPacketNPC extends BasicPacket {
   public static int Slot;
   public static Random rand = new Random();

   public BlockBuyNewPacketNPC(int guiID) {
      Slot = guiID;
   }

   public BlockBuyNewPacketNPC() {
      this(0);
   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(Slot);
   }

   public void fromBytes(ByteBuf buf) {
      Slot = buf.readInt();
   }

   public static class Handler implements IMessageHandler {
      public IMessage onMessage(BlockBuyNewPacketNPC message, MessageContext ctx) {
         EntityPlayer p = ctx.getServerHandler().field_147369_b;
         if (!p.field_70170_p.field_72995_K) {
            PlayerData px = PlayerData.get(p);
            EntityPlayer owner = null;
            if (px.TeSop.func_70902_q() != null) {
               owner = (EntityPlayer)px.TeSop.func_70902_q();
            }

            ItemStack sell1 = px.TeSop.BS.func_70301_a(9);
            ItemStack sell2 = px.TeSop.BS.func_70301_a(10);
            ItemStack sell3 = px.TeSop.BS.func_70301_a(11);
            ItemStack sell4 = px.TeSop.BS.func_70301_a(12);
            ItemStack sell5 = px.TeSop.BS.func_70301_a(13);
            ItemStack sell6 = px.TeSop.BS.func_70301_a(14);
            int price1 = px.TeSop.price1;
            int price2 = px.TeSop.price2;
            int price3 = px.TeSop.price3;
            int price4 = px.TeSop.price4;
            int price5 = px.TeSop.price5;
            int price6 = px.TeSop.price6;
            ItemStack i1;
            ItemStack i2;
            ItemStack i3;
            ItemStack i4;
            ItemStack i5;
            ItemStack i6;
            if (BlockBuyNewPacketNPC.Slot == 1) {
               if (px.Money >= price1) {
                  if (px.TeSop != null && px.TeSop.func_70089_S()) {
                     if (price1 != px.TeSop.price1) {
                        price1 = px.TeSop.price1;
                        p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cเจ้าของร้านเปลี่ยนราคาขาย กรุณาออกจากร้านแล้วเข้ามาใหม่"));
                        return null;
                     }

                     i1 = px.TeSop.SW.func_70301_a(9);
                     i2 = px.TeSop.SW.func_70301_a(10);
                     i3 = px.TeSop.SW.func_70301_a(11);
                     i4 = px.TeSop.SW.func_70301_a(12);
                     i5 = px.TeSop.SW.func_70301_a(13);
                     i6 = px.TeSop.SW.func_70301_a(14);
                     if (px.playerblockshop) {
                        if (i1 != null && i1 == sell1) {
                           if (p.field_71071_by.func_70447_i() >= 0) {
                              p.field_71071_by.func_70299_a(p.field_71071_by.func_70447_i(), sell1);
                              px.BS.func_70299_a(0, (ItemStack)null);
                              px.TeSop.SW.func_70299_a(0, (ItemStack)null);
                              px.Money -= price1;
                              px.TeSop.money += price1;
                              px.sellprice1 = 0;
                              px.TeSop.price1 = 0;
                              px.guishop = true;
                              if (owner != null) {
                                 owner.func_145747_a(new ChatComponentText("§f[§bร้านค้า§f] §6ไอเทม " + sell1.func_82833_r() + " §6ถูกขายไปแล้ว"));
                              }
                           } else {
                              p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องว่างในตัวไม่พอสำหรับซื้อไอเทม"));
                           }
                        } else {
                           p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cไอเทมถูกขายไปแล้ว"));
                        }
                     } else {
                        p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cคนขายปิดร้านแล้ว"));
                     }
                  } else {
                     p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cคนขายปิดร้านแล้ว"));
                  }
               } else {
                  p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cมีเงินไม่พอที่จะซื้อไอเทม"));
               }
            } else if (BlockBuyNewPacketNPC.Slot == 2) {
               if (px.Money >= price2) {
                  if (px.TeSop != null && px.TeSop.func_70089_S()) {
                     if (price2 != px.TeSop.price2) {
                        price2 = px.TeSop.price2;
                        p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cเจ้าของร้านเปลี่ยนราคาขาย กรุณาออกจากร้านแล้วเข้ามาใหม่"));
                        return null;
                     }

                     i1 = px.TeSop.SW.func_70301_a(9);
                     i2 = px.TeSop.SW.func_70301_a(10);
                     i3 = px.TeSop.SW.func_70301_a(11);
                     i4 = px.TeSop.SW.func_70301_a(12);
                     i5 = px.TeSop.SW.func_70301_a(13);
                     i6 = px.TeSop.SW.func_70301_a(14);
                     if (px.playerblockshop) {
                        if (i2 != null && i2 == sell2) {
                           if (p.field_71071_by.func_70447_i() >= 0) {
                              p.field_71071_by.func_70299_a(p.field_71071_by.func_70447_i(), sell2);
                              px.BS.func_70299_a(1, (ItemStack)null);
                              px.TeSop.SW.func_70299_a(1, (ItemStack)null);
                              px.Money -= price2;
                              px.TeSop.money += price2;
                              px.sellprice2 = 0;
                              px.TeSop.price2 = 0;
                              px.guishop = true;
                              if (owner != null) {
                                 owner.func_145747_a(new ChatComponentText("§f[§bร้านค้า§f] §6ไอเทม " + sell2.func_82833_r() + " §6ถูกขายไปแล้ว"));
                              }
                           } else {
                              p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องว่างในตัวไม่พอสำหรับซื้อไอเทม"));
                           }
                        } else {
                           p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cไอเทมถูกขายไปแล้ว"));
                        }
                     } else {
                        p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cคนขายปิดร้านแล้ว"));
                     }
                  } else {
                     p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cคนขายปิดร้านแล้ว"));
                  }
               } else {
                  p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cมีเงินไม่พอที่จะซื้อไอเทม"));
               }
            } else if (BlockBuyNewPacketNPC.Slot == 3) {
               if (px.Money >= price3) {
                  if (px.TeSop != null && px.TeSop.func_70089_S()) {
                     if (price3 != px.TeSop.price3) {
                        price3 = px.TeSop.price3;
                        p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cเจ้าของร้านเปลี่ยนราคาขาย กรุณาออกจากร้านแล้วเข้ามาใหม่"));
                        return null;
                     }

                     i1 = px.TeSop.SW.func_70301_a(9);
                     i2 = px.TeSop.SW.func_70301_a(10);
                     i3 = px.TeSop.SW.func_70301_a(11);
                     i4 = px.TeSop.SW.func_70301_a(12);
                     i5 = px.TeSop.SW.func_70301_a(13);
                     i6 = px.TeSop.SW.func_70301_a(14);
                     if (px.playerblockshop) {
                        if (i3 != null && i3 == sell3) {
                           if (p.field_71071_by.func_70447_i() >= 0) {
                              p.field_71071_by.func_70299_a(p.field_71071_by.func_70447_i(), sell3);
                              px.BS.func_70299_a(2, (ItemStack)null);
                              px.TeSop.SW.func_70299_a(2, (ItemStack)null);
                              px.Money -= price3;
                              px.TeSop.money += price3;
                              px.sellprice3 = 0;
                              px.TeSop.price3 = 0;
                              px.guishop = true;
                              if (owner != null) {
                                 owner.func_145747_a(new ChatComponentText("§f[§bร้านค้า§f] §6ไอเทม " + sell3.func_82833_r() + " §6ถูกขายไปแล้ว"));
                              }
                           } else {
                              p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องว่างในตัวไม่พอสำหรับซื้อไอเทม"));
                           }
                        } else {
                           p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cไอเทมถูกขายไปแล้ว"));
                        }
                     } else {
                        p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cคนขายปิดร้านแล้ว"));
                     }
                  } else {
                     p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cคนขายปิดร้านแล้ว"));
                  }
               } else {
                  p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cมีเงินไม่พอที่จะซื้อไอเทม"));
               }
            } else if (BlockBuyNewPacketNPC.Slot == 4) {
               if (px.Money >= price4) {
                  if (px.TeSop != null && px.TeSop.func_70089_S()) {
                     if (price4 != px.TeSop.price4) {
                        price4 = px.TeSop.price4;
                        p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cเจ้าของร้านเปลี่ยนราคาขาย กรุณาออกจากร้านแล้วเข้ามาใหม่"));
                        return null;
                     }

                     i1 = px.TeSop.SW.func_70301_a(9);
                     i2 = px.TeSop.SW.func_70301_a(10);
                     i3 = px.TeSop.SW.func_70301_a(11);
                     i4 = px.TeSop.SW.func_70301_a(12);
                     i5 = px.TeSop.SW.func_70301_a(13);
                     i6 = px.TeSop.SW.func_70301_a(14);
                     if (px.playerblockshop) {
                        if (i4 != null && i4 == sell4) {
                           if (p.field_71071_by.func_70447_i() >= 0) {
                              p.field_71071_by.func_70299_a(p.field_71071_by.func_70447_i(), sell4);
                              px.BS.func_70299_a(3, (ItemStack)null);
                              px.TeSop.SW.func_70299_a(3, (ItemStack)null);
                              px.Money -= price4;
                              px.TeSop.money += price4;
                              px.sellprice4 = 0;
                              px.TeSop.price4 = 0;
                              px.guishop = true;
                              if (owner != null) {
                                 owner.func_145747_a(new ChatComponentText("§f[§bร้านค้า§f] §6ไอเทม " + sell4.func_82833_r() + " §6ถูกขายไปแล้ว"));
                              }
                           } else {
                              p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องว่างในตัวไม่พอสำหรับซื้อไอเทม"));
                           }
                        } else {
                           p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cไอเทมถูกขายไปแล้ว"));
                        }
                     } else {
                        p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cคนขายปิดร้านแล้ว"));
                     }
                  } else {
                     p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cคนขายปิดร้านแล้ว"));
                  }
               } else {
                  p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cมีเงินไม่พอที่จะซื้อไอเทม"));
               }
            } else if (BlockBuyNewPacketNPC.Slot == 5) {
               if (px.Money >= price5) {
                  if (px.TeSop != null && px.TeSop.func_70089_S()) {
                     if (price5 != px.TeSop.price5) {
                        price5 = px.TeSop.price5;
                        p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cเจ้าของร้านเปลี่ยนราคาขาย กรุณาออกจากร้านแล้วเข้ามาใหม่"));
                        return null;
                     }

                     i1 = px.TeSop.SW.func_70301_a(9);
                     i2 = px.TeSop.SW.func_70301_a(10);
                     i3 = px.TeSop.SW.func_70301_a(11);
                     i4 = px.TeSop.SW.func_70301_a(12);
                     i5 = px.TeSop.SW.func_70301_a(13);
                     i6 = px.TeSop.SW.func_70301_a(14);
                     if (px.playerblockshop) {
                        if (i5 != null && i5 == sell5) {
                           if (p.field_71071_by.func_70447_i() >= 0) {
                              p.field_71071_by.func_70299_a(p.field_71071_by.func_70447_i(), sell5);
                              px.BS.func_70299_a(4, (ItemStack)null);
                              px.TeSop.SW.func_70299_a(4, (ItemStack)null);
                              px.Money -= price5;
                              px.TeSop.money += price5;
                              px.sellprice5 = 0;
                              px.TeSop.price5 = 0;
                              px.guishop = true;
                              if (owner != null) {
                                 owner.func_145747_a(new ChatComponentText("§f[§bร้านค้า§f] §6ไอเทม " + sell5.func_82833_r() + " §6ถูกขายไปแล้ว"));
                              }
                           } else {
                              p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องว่างในตัวไม่พอสำหรับซื้อไอเทม"));
                           }
                        } else {
                           p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cไอเทมถูกขายไปแล้ว"));
                        }
                     } else {
                        p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cคนขายปิดร้านแล้ว"));
                     }
                  } else {
                     p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cคนขายปิดร้านแล้ว"));
                  }
               } else {
                  p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cมีเงินไม่พอที่จะซื้อไอเทม"));
               }
            } else if (BlockBuyNewPacketNPC.Slot == 6) {
               if (px.Money >= price6) {
                  if (px.TeSop != null && px.TeSop.func_70089_S()) {
                     if (price6 != px.TeSop.price6) {
                        price6 = px.TeSop.price6;
                        p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cเจ้าของร้านเปลี่ยนราคาขาย กรุณาออกจากร้านแล้วเข้ามาใหม่"));
                        return null;
                     }

                     i1 = px.TeSop.SW.func_70301_a(9);
                     i2 = px.TeSop.SW.func_70301_a(10);
                     i3 = px.TeSop.SW.func_70301_a(11);
                     i4 = px.TeSop.SW.func_70301_a(12);
                     i5 = px.TeSop.SW.func_70301_a(13);
                     i6 = px.TeSop.SW.func_70301_a(14);
                     if (px.playerblockshop) {
                        if (i6 != null && i6 == sell6) {
                           if (p.field_71071_by.func_70447_i() >= 0) {
                              p.field_71071_by.func_70299_a(p.field_71071_by.func_70447_i(), sell6);
                              px.BS.func_70299_a(5, (ItemStack)null);
                              px.TeSop.SW.func_70299_a(5, (ItemStack)null);
                              px.Money -= price6;
                              px.TeSop.money += price6;
                              px.sellprice6 = 0;
                              px.TeSop.price6 = 0;
                              px.guishop = true;
                              if (owner != null) {
                                 owner.func_145747_a(new ChatComponentText("§f[§bร้านค้า§f] §6ไอเทม " + sell6.func_82833_r() + " §6ถูกขายไปแล้ว"));
                              }
                           } else {
                              p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องว่างในตัวไม่พอสำหรับซื้อไอเทม"));
                           }
                        } else {
                           p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cไอเทมถูกขายไปแล้ว"));
                        }
                     } else {
                        p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cคนขายปิดร้านแล้ว"));
                     }
                  } else {
                     p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cคนขายปิดร้านแล้ว"));
                  }
               } else {
                  p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cมีเงินไม่พอที่จะซื้อไอเทม"));
               }
            }
         }

         return null;
      }
   }
}
