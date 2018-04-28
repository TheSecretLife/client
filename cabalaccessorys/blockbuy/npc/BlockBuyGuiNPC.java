package cabalaccessorys.blockbuy.npc;

import cabalaccessorys.Start;
import cabalaccessorys.blockshop.npc.npcentity;
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
public class BlockBuyGuiNPC extends GuiContainer {
   EntityPlayer Player = null;
   npcentity Te = null;
   private float xSize_lo;
   private float ySize_lo;
   private static final ResourceLocation iconLocation = new ResourceLocation("cabalaccessorys:textures/GuiNPCSHOPOP.png");
   private final BlockBuyInventoryNPC inventory;

   public BlockBuyGuiNPC(EntityPlayer player, npcentity teSop, InventoryPlayer inventoryPlayer, BlockBuyInventoryNPC bS) {
      super(new BlockBuyDataNPC(player, inventoryPlayer, bS));
      this.inventory = bS;
      this.Player = player;
      this.Te = teSop;
   }

   public void func_73863_a(int mouseX, int mouseY, float f) {
      super.func_73863_a(mouseX, mouseY, f);
      this.xSize_lo = (float)mouseX;
      this.ySize_lo = (float)mouseY;
      this.field_146292_n.clear();
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

      this.field_146289_q.func_78276_b("  §f" + px.Money, this.field_147003_i + 116 - 90, this.field_147009_r + 71, 16777215);
   }

   protected void func_146284_a(GuiButton button) {
      EntityPlayer p = this.Player;
      PlayerData px = PlayerData.get(p);
      ItemStack sell1 = px.TeSop.BS.func_70301_a(9);
      ItemStack sell2 = px.TeSop.BS.func_70301_a(10);
      ItemStack sell3 = px.TeSop.BS.func_70301_a(11);
      ItemStack sell4 = px.TeSop.BS.func_70301_a(12);
      ItemStack sell5 = px.TeSop.BS.func_70301_a(13);
      ItemStack sell6 = px.TeSop.BS.func_70301_a(14);
      if (button.field_146127_k == 0) {
         if (sell1 != null) {
            Start.networkChannel.sendToServer(new BlockBuyNewPacketNPC(1));
            p.func_71053_j();
         } else {
            p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องที่ 1 ไม่มีของขาย"));
         }
      } else if (button.field_146127_k == 1) {
         if (sell2 != null) {
            Start.networkChannel.sendToServer(new BlockBuyNewPacketNPC(2));
            p.func_71053_j();
         } else {
            p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องที่ 2 ไม่มีของขาย"));
         }
      } else if (button.field_146127_k == 2) {
         if (sell3 != null) {
            Start.networkChannel.sendToServer(new BlockBuyNewPacketNPC(3));
            p.func_71053_j();
         } else {
            p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องที่ 3 ไม่มีของขาย"));
         }
      } else if (button.field_146127_k == 3) {
         if (sell4 != null) {
            Start.networkChannel.sendToServer(new BlockBuyNewPacketNPC(4));
            p.func_71053_j();
         } else {
            p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องที่ 4 ไม่มีของขาย"));
         }
      } else if (button.field_146127_k == 4) {
         if (sell5 != null) {
            Start.networkChannel.sendToServer(new BlockBuyNewPacketNPC(5));
            p.func_71053_j();
         } else {
            p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องที่ 5 ไม่มีของขาย"));
         }
      } else if (button.field_146127_k == 5) {
         if (sell6 != null) {
            Start.networkChannel.sendToServer(new BlockBuyNewPacketNPC(6));
            p.func_71053_j();
         } else {
            p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cช่องที่ 6 ไม่มีของขาย"));
         }
      }

   }
}
