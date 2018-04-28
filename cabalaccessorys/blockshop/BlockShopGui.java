package cabalaccessorys.blockshop;

import cabalaccessorys.Start;
import cabalaccessorys.data.PlayerData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class BlockShopGui extends GuiContainer {
   EntityPlayer Player = null;
   sellerentity Te = null;
   private float xSize_lo;
   private float ySize_lo;
   private static final ResourceLocation iconLocation = new ResourceLocation("cabalaccessorys:textures/GuiSHOP.png");
   private final BlockShopInventory inventory;

   public BlockShopGui(EntityPlayer player, sellerentity te, InventoryPlayer inventoryPlayer, BlockShopInventory inventoryCustom) {
      super(new BlockShopContainer(player, inventoryPlayer, inventoryCustom));
      this.inventory = inventoryCustom;
      this.Player = player;
      this.Te = te;
   }

   public void func_73863_a(int mouseX, int mouseY, float f) {
      super.func_73863_a(mouseX, mouseY, f);
      this.xSize_lo = (float)mouseX;
      this.ySize_lo = (float)mouseY;
      PlayerData px = PlayerData.get(this.Player);
      String status = "§aเปิดร้าน";
      if (px.playerblockshop) {
         status = "§cปิดร้าน";
      }

      this.field_146292_n.clear();
      this.field_146292_n.add(new GuiButton(0, this.field_147003_i + 121 - 71 - 54, this.field_147009_r + 43 - 36, 27, 15, "ตั้งราคา"));
      this.field_146292_n.add(new GuiButton(1, this.field_147003_i + 121 - 71 - 54, this.field_147009_r + 43 - 18, 27, 15, "ตั้งราคา"));
      this.field_146292_n.add(new GuiButton(2, this.field_147003_i + 121 - 71 - 54, this.field_147009_r + 43, 27, 15, "ตั้งราคา"));
      this.field_146292_n.add(new GuiButton(4, this.field_147003_i + 121 - 53 + 54, this.field_147009_r + 43 - 36, 27, 15, "ตั้งราคา"));
      this.field_146292_n.add(new GuiButton(5, this.field_147003_i + 121 - 53 + 54, this.field_147009_r + 43 - 18, 27, 15, "ตั้งราคา"));
      this.field_146292_n.add(new GuiButton(6, this.field_147003_i + 121 - 53 + 54, this.field_147009_r + 43, 27, 15, "ตั้งราคา"));
      this.field_146292_n.add(new GuiButton(3, this.field_147003_i + 210, this.field_147009_r + 85, 50, 15, status));
      this.field_146292_n.add(new GuiButton(8, this.field_147003_i + 210, this.field_147009_r + 105, 50, 15, "§aถอนเงิน"));
      this.field_146292_n.add(new GuiButton(7, this.field_147003_i + 210, this.field_147009_r + 125, 50, 15, "§aเก็บ NPC"));
   }

   protected void func_146979_b(int mouseX, int mouseY) {
   }

   protected void func_146976_a(float f, int mouseX, int mouseY) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_146297_k.func_110434_K().func_110577_a(iconLocation);
      this.func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f + 80, this.field_147000_g);
      PlayerData px = PlayerData.get(this.Player);
      int price1 = px.blockprice1;
      int price2 = px.blockprice2;
      int price3 = px.blockprice3;
      int price4 = px.blockprice4;
      int price5 = px.blockprice5;
      int price6 = px.blockprice6;
      String colorprice1 = "§f";
      String colorprice2 = "§f";
      String colorprice3 = "§f";
      String colorprice4 = "§f";
      String colorprice5 = "§f";
      String colorprice6 = "§f";
      if (price1 > 99999999) {
         colorprice1 = "§6";
      } else if (price1 > 9999999) {
         colorprice1 = "§z";
      } else if (price1 > 999999) {
         colorprice1 = "§e";
      }

      if (price2 > 99999999) {
         colorprice2 = "§6";
      } else if (price2 > 9999999) {
         colorprice2 = "§z";
      } else if (price2 > 999999) {
         colorprice2 = "§e";
      }

      if (price3 > 99999999) {
         colorprice3 = "§6";
      } else if (price3 > 9999999) {
         colorprice3 = "§z";
      } else if (price3 > 999999) {
         colorprice3 = "§e";
      }

      if (price4 > 99999999) {
         colorprice4 = "§6";
      } else if (price4 > 9999999) {
         colorprice4 = "§z";
      } else if (price4 > 999999) {
         colorprice4 = "§e";
      }

      if (price5 > 99999999) {
         colorprice5 = "§6";
      } else if (price5 > 9999999) {
         colorprice5 = "§z";
      } else if (price5 > 999999) {
         colorprice5 = "§e";
      }

      if (price6 > 99999999) {
         colorprice6 = "§6";
      } else if (price6 > 9999999) {
         colorprice6 = "§z";
      } else if (price6 > 999999) {
         colorprice6 = "§e";
      }

      this.field_146289_q.func_78276_b("§aราคา " + colorprice1 + price1, this.field_147003_i + 102 - 54, this.field_147009_r + 44 - 34, 16777215);
      this.field_146289_q.func_78276_b("§aราคา " + colorprice2 + price2, this.field_147003_i + 102 - 54, this.field_147009_r + 44 - 16, 16777215);
      this.field_146289_q.func_78276_b("§aราคา " + colorprice3 + price3, this.field_147003_i + 102 - 54, this.field_147009_r + 44 + 2, 16777215);
      this.field_146289_q.func_78276_b("§aราคา " + colorprice4 + price4, this.field_147003_i + 120 + 54, this.field_147009_r + 44 - 34, 16777215);
      this.field_146289_q.func_78276_b("§aราคา " + colorprice5 + price5, this.field_147003_i + 120 + 54, this.field_147009_r + 44 - 16, 16777215);
      this.field_146289_q.func_78276_b("§aราคา " + colorprice6 + price6, this.field_147003_i + 120 + 54, this.field_147009_r + 44 + 2, 16777215);
      this.field_146289_q.func_78276_b("  §f" + px.npcmoney, this.field_147003_i + 116 - 30, this.field_147009_r + 66, 16777215);
   }

   protected void func_146284_a(GuiButton button) {
      EntityPlayer p = this.Player;
      PlayerData px = PlayerData.get(p);
      ItemStack sell1 = px.TeS.SW.func_70301_a(0);
      ItemStack sell2 = px.TeS.SW.func_70301_a(1);
      ItemStack sell3 = px.TeS.SW.func_70301_a(2);
      ItemStack sell4 = px.TeS.SW.func_70301_a(3);
      ItemStack sell5 = px.TeS.SW.func_70301_a(4);
      ItemStack sell6 = px.TeS.SW.func_70301_a(5);
      if (button.field_146127_k == 0) {
         if (sell1 != null) {
            px.setprice = 1;
            p.openGui(Start.instance, Start.SGB, p.field_70170_p, (int)p.field_70165_t, (int)p.field_70163_u, (int)p.field_70161_v);
         } else {
            p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องที่ 1 ไม่มีของที่จะขาย"));
         }
      } else if (button.field_146127_k == 1) {
         if (sell2 != null) {
            px.setprice = 2;
            p.openGui(Start.instance, Start.SGB, p.field_70170_p, (int)p.field_70165_t, (int)p.field_70163_u, (int)p.field_70161_v);
         } else {
            p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องที่ 2 ไม่มีของที่จะขาย"));
         }
      } else if (button.field_146127_k == 2) {
         if (sell3 != null) {
            px.setprice = 3;
            p.openGui(Start.instance, Start.SGB, p.field_70170_p, (int)p.field_70165_t, (int)p.field_70163_u, (int)p.field_70161_v);
         } else {
            p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องที่ 3 ไม่มีของที่จะขาย"));
         }
      } else if (button.field_146127_k == 4) {
         if (sell4 != null) {
            px.setprice = 4;
            p.openGui(Start.instance, Start.SGB, p.field_70170_p, (int)p.field_70165_t, (int)p.field_70163_u, (int)p.field_70161_v);
         } else {
            p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องที่ 4 ไม่มีของที่จะขาย"));
         }
      } else if (button.field_146127_k == 5) {
         if (sell5 != null) {
            px.setprice = 5;
            p.openGui(Start.instance, Start.SGB, p.field_70170_p, (int)p.field_70165_t, (int)p.field_70163_u, (int)p.field_70161_v);
         } else {
            p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องที่ 5 ไม่มีของที่จะขาย"));
         }
      } else if (button.field_146127_k == 6) {
         if (sell6 != null) {
            px.setprice = 6;
            p.openGui(Start.instance, Start.SGB, p.field_70170_p, (int)p.field_70165_t, (int)p.field_70163_u, (int)p.field_70161_v);
         } else {
            p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องที่ 6 ไม่มีของที่จะขาย"));
         }
      } else if (button.field_146127_k == 3) {
         Start.networkChannel.sendToServer(new BlockOpenShopNewPacket(0));
         p.func_71053_j();
      } else if (button.field_146127_k == 7) {
         Start.networkChannel.sendToServer(new BlockOpenShopNewPacket(2));
         p.func_71053_j();
      } else if (button.field_146127_k == 8) {
         Start.networkChannel.sendToServer(new BlockOpenShopNewPacket(1));
         p.func_71053_j();
      }

   }
}
