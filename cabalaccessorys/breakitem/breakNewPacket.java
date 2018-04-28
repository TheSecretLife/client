package cabalaccessorys.breakitem;

import cabalaccessorys.BasicPacket;
import cabalaccessorys.RegisterItem;
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

public class breakNewPacket extends BasicPacket {
   public int guiID;
   public static Random rand = new Random();

   public breakNewPacket(int guiID) {
      this.guiID = guiID;
   }

   public breakNewPacket() {
      this(0);
   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(this.guiID);
   }

   public void fromBytes(ByteBuf buf) {
      this.guiID = buf.readInt();
   }

   public static class Handler implements IMessageHandler {
      public IMessage onMessage(breakNewPacket message, MessageContext ctx) {
         EntityPlayer player = ctx.getServerHandler().field_147369_b;
         if (!player.field_70170_p.field_72995_K) {
            PlayerData px = PlayerData.get(player);
            ItemStack breakitem = px.BR.func_70301_a(0);
            ItemStack reward = px.BR.func_70301_a(1);
            ItemStack itemreward = null;
            if (reward == null) {
               if (breakitem != null) {
                  int num = 3;
                  NBTTagCompound itemdata = breakitem.func_77978_p();
                  if (itemdata == null) {
                     itemdata = new NBTTagCompound();
                  }

                  int slotnum = itemdata.func_74762_e("slotnum");
                  int upgrade = itemdata.func_74762_e("upgrade");
                  int num = num + upgrade;
                  int value = breakNewPacket.rand.nextInt(num);
                  if (value == 0) {
                     value = 1;
                  }

                  player.field_70170_p.func_72956_a(player, "random.anvil_use", 1.0F, 1.0F);
                  if (slotnum >= 1) {
                     int rd = breakNewPacket.rand.nextInt(10);
                     if (rd == 0) {
                        int oprd = breakNewPacket.rand.nextInt(13);
                        if (oprd == 0) {
                           itemreward = new ItemStack(RegisterItem.opAccuracy, 1);
                        }

                        if (oprd == 1) {
                           itemreward = new ItemStack(RegisterItem.opAttack, 1);
                        }

                        if (oprd == 2) {
                           itemreward = new ItemStack(RegisterItem.opAttackAmp, 1);
                        }

                        if (oprd == 3) {
                           itemreward = new ItemStack(RegisterItem.opBloodSteal, 1);
                        }

                        if (oprd == 4) {
                           itemreward = new ItemStack(RegisterItem.opCriticalDamage, 1);
                        }

                        if (oprd == 5) {
                           itemreward = new ItemStack(RegisterItem.opCriticalRate, 1);
                        }

                        if (oprd == 6) {
                           itemreward = new ItemStack(RegisterItem.opDefend, 1);
                        }

                        if (oprd == 7) {
                           itemreward = new ItemStack(RegisterItem.opEvasion, 1);
                        }

                        if (oprd == 8) {
                           itemreward = new ItemStack(RegisterItem.opPiercing, 1);
                        }

                        if (oprd == 9) {
                           itemreward = new ItemStack(RegisterItem.opResistAttackAmp, 1);
                        }

                        if (oprd == 10) {
                           itemreward = new ItemStack(RegisterItem.opResistBloodSteal, 1);
                        }

                        if (oprd == 11) {
                           itemreward = new ItemStack(RegisterItem.opResistCriticalRate, 1);
                        }

                        if (oprd == 12) {
                           itemreward = new ItemStack(RegisterItem.opHP, 1);
                        }

                        px.BR.func_70299_a(1, itemreward);
                        px.BR.func_70299_a(0, (ItemStack)null);
                     } else {
                        if (breakitem.func_77973_b() == RegisterItem.sw01a) {
                           itemreward = new ItemStack(RegisterItem.AramidOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.sw02a) {
                           itemreward = new ItemStack(RegisterItem.AramidOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.sw03a) {
                           itemreward = new ItemStack(RegisterItem.AramidOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.sw04a) {
                           itemreward = new ItemStack(RegisterItem.BlueStineOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.sw05a) {
                           itemreward = new ItemStack(RegisterItem.BlueStineOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.sw06a) {
                           itemreward = new ItemStack(RegisterItem.BlueStineOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.sw07a) {
                           itemreward = new ItemStack(RegisterItem.TitaniumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.sw08a) {
                           itemreward = new ItemStack(RegisterItem.TitaniumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.sw09a) {
                           itemreward = new ItemStack(RegisterItem.OsmiumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.sw10a) {
                           itemreward = new ItemStack(RegisterItem.OsmiumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.sw11a) {
                           itemreward = new ItemStack(RegisterItem.MittrillOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.sw12a) {
                           itemreward = new ItemStack(RegisterItem.MittrillOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.sw13a) {
                           itemreward = new ItemStack(RegisterItem.ArchdeniumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Helm01) {
                           itemreward = new ItemStack(RegisterItem.AramidOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Helm02) {
                           itemreward = new ItemStack(RegisterItem.BlueStineOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Helm03) {
                           itemreward = new ItemStack(RegisterItem.TitaniumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Helm04) {
                           itemreward = new ItemStack(RegisterItem.OsmiumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Helm05) {
                           itemreward = new ItemStack(RegisterItem.MittrillOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Chest01) {
                           itemreward = new ItemStack(RegisterItem.AramidOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Chest02) {
                           itemreward = new ItemStack(RegisterItem.BlueStineOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Chest03) {
                           itemreward = new ItemStack(RegisterItem.TitaniumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Chest04) {
                           itemreward = new ItemStack(RegisterItem.OsmiumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Chest05) {
                           itemreward = new ItemStack(RegisterItem.MittrillOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Leg01) {
                           itemreward = new ItemStack(RegisterItem.AramidOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Leg02) {
                           itemreward = new ItemStack(RegisterItem.BlueStineOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Leg03) {
                           itemreward = new ItemStack(RegisterItem.TitaniumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Leg04) {
                           itemreward = new ItemStack(RegisterItem.OsmiumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Leg05) {
                           itemreward = new ItemStack(RegisterItem.MittrillOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Boot01) {
                           itemreward = new ItemStack(RegisterItem.AramidOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Boot02) {
                           itemreward = new ItemStack(RegisterItem.BlueStineOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Boot03) {
                           itemreward = new ItemStack(RegisterItem.TitaniumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Boot04) {
                           itemreward = new ItemStack(RegisterItem.OsmiumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Boot05) {
                           itemreward = new ItemStack(RegisterItem.MittrillOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Helm06) {
                           itemreward = new ItemStack(RegisterItem.ArchdeniumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Chest06) {
                           itemreward = new ItemStack(RegisterItem.ArchdeniumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Leg06) {
                           itemreward = new ItemStack(RegisterItem.ArchdeniumOre, value);
                        } else if (breakitem.func_77973_b() == RegisterItem.Boot06) {
                           itemreward = new ItemStack(RegisterItem.ArchdeniumOre, value);
                        }

                        px.BR.func_70299_a(1, itemreward);
                        px.BR.func_70299_a(0, (ItemStack)null);
                     }
                  } else {
                     if (breakitem.func_77973_b() == RegisterItem.sw01a) {
                        itemreward = new ItemStack(RegisterItem.AramidOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.sw02a) {
                        itemreward = new ItemStack(RegisterItem.AramidOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.sw03a) {
                        itemreward = new ItemStack(RegisterItem.AramidOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.sw04a) {
                        itemreward = new ItemStack(RegisterItem.BlueStineOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.sw05a) {
                        itemreward = new ItemStack(RegisterItem.BlueStineOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.sw06a) {
                        itemreward = new ItemStack(RegisterItem.BlueStineOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.sw07a) {
                        itemreward = new ItemStack(RegisterItem.TitaniumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.sw08a) {
                        itemreward = new ItemStack(RegisterItem.TitaniumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.sw09a) {
                        itemreward = new ItemStack(RegisterItem.OsmiumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.sw10a) {
                        itemreward = new ItemStack(RegisterItem.OsmiumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.sw11a) {
                        itemreward = new ItemStack(RegisterItem.MittrillOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.sw12a) {
                        itemreward = new ItemStack(RegisterItem.MittrillOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.sw13a) {
                        itemreward = new ItemStack(RegisterItem.ArchdeniumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Helm01) {
                        itemreward = new ItemStack(RegisterItem.AramidOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Helm02) {
                        itemreward = new ItemStack(RegisterItem.BlueStineOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Helm03) {
                        itemreward = new ItemStack(RegisterItem.TitaniumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Helm04) {
                        itemreward = new ItemStack(RegisterItem.OsmiumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Helm05) {
                        itemreward = new ItemStack(RegisterItem.MittrillOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Chest01) {
                        itemreward = new ItemStack(RegisterItem.AramidOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Chest02) {
                        itemreward = new ItemStack(RegisterItem.BlueStineOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Chest03) {
                        itemreward = new ItemStack(RegisterItem.TitaniumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Chest04) {
                        itemreward = new ItemStack(RegisterItem.OsmiumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Chest05) {
                        itemreward = new ItemStack(RegisterItem.MittrillOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Leg01) {
                        itemreward = new ItemStack(RegisterItem.AramidOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Leg02) {
                        itemreward = new ItemStack(RegisterItem.BlueStineOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Leg03) {
                        itemreward = new ItemStack(RegisterItem.TitaniumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Leg04) {
                        itemreward = new ItemStack(RegisterItem.OsmiumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Leg05) {
                        itemreward = new ItemStack(RegisterItem.MittrillOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Boot01) {
                        itemreward = new ItemStack(RegisterItem.AramidOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Boot02) {
                        itemreward = new ItemStack(RegisterItem.BlueStineOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Boot03) {
                        itemreward = new ItemStack(RegisterItem.TitaniumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Boot04) {
                        itemreward = new ItemStack(RegisterItem.OsmiumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Boot05) {
                        itemreward = new ItemStack(RegisterItem.MittrillOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Helm06) {
                        itemreward = new ItemStack(RegisterItem.ArchdeniumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Chest06) {
                        itemreward = new ItemStack(RegisterItem.ArchdeniumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Leg06) {
                        itemreward = new ItemStack(RegisterItem.ArchdeniumOre, value);
                     } else if (breakitem.func_77973_b() == RegisterItem.Boot06) {
                        itemreward = new ItemStack(RegisterItem.ArchdeniumOre, value);
                     }

                     px.BR.func_70299_a(1, itemreward);
                     px.BR.func_70299_a(0, (ItemStack)null);
                  }
               } else {
                  player.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cกรุณาใส่อาวุธหรือชุดที่ต้องการย่อยในช่องบน"));
               }
            } else {
               player.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cกรุณานำไอเทมที่คราฟเสร็จแล้วออกจากช่องก่อน"));
            }
         }

         return null;
      }
   }
}
