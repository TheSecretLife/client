package cabalaccessorys.coingui;

import cabalaccessorys.OpenGuiNewPacket;
import cabalaccessorys.Start;
import cabalaccessorys.data.PlayerData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class CoinGui extends GuiContainer {
   EntityPlayer Player = null;
   private float xSize_lo;
   private float ySize_lo;
   private static final ResourceLocation iconLocation = new ResourceLocation("cabalaccessorys:textures/GuiCoin.png");
   private final CoinInventory inventory;

   public CoinGui(EntityPlayer player, InventoryPlayer inventoryPlayer, CoinInventory inventoryCustom) {
      super(new CoinData(player, inventoryPlayer, inventoryCustom));
      this.inventory = inventoryCustom;
      this.Player = player;
   }

   public void func_73863_a(int mouseX, int mouseY, float f) {
      super.func_73863_a(mouseX, mouseY, f);
      this.xSize_lo = (float)mouseX;
      this.ySize_lo = (float)mouseY;
      this.field_146292_n.clear();
      this.field_146292_n.add(new GuiButton(0, this.field_147003_i + 125 - 71 - 36, this.field_147009_r + 43 - 36, 20, 15, "ซื้อ"));
      this.field_146292_n.add(new GuiButton(1, this.field_147003_i + 125 - 71 - 36, this.field_147009_r + 43 - 18, 20, 15, "ซื้อ"));
      this.field_146292_n.add(new GuiButton(2, this.field_147003_i + 125 - 71 - 36, this.field_147009_r + 43, 20, 15, "ซื้อ"));
      this.field_146292_n.add(new GuiButton(3, this.field_147003_i + 125 - 53 + 54, this.field_147009_r + 43 - 36, 20, 15, "ซื้อ"));
      this.field_146292_n.add(new GuiButton(4, this.field_147003_i + 125 - 53 + 54, this.field_147009_r + 43 - 18, 20, 15, "ซื้อ"));
      this.field_146292_n.add(new GuiButton(5, this.field_147003_i + 125 - 53 + 54, this.field_147009_r + 43, 20, 15, "ซื้อ"));
      this.field_146292_n.add(new GuiButton(6, this.field_147003_i + 102 - 36, this.field_147009_r + 43 - 36, 20, 15, "ขาย"));
      this.field_146292_n.add(new GuiButton(7, this.field_147003_i + 102 - 36, this.field_147009_r + 43 - 18, 20, 15, "ขาย"));
      this.field_146292_n.add(new GuiButton(8, this.field_147003_i + 102 - 36, this.field_147009_r + 43, 20, 15, "ขาย"));
      this.field_146292_n.add(new GuiButton(9, this.field_147003_i + 120 + 54, this.field_147009_r + 43 - 36, 20, 15, "ขาย"));
      this.field_146292_n.add(new GuiButton(10, this.field_147003_i + 120 + 54, this.field_147009_r + 43 - 18, 20, 15, "ขาย"));
      this.field_146292_n.add(new GuiButton(11, this.field_147003_i + 120 + 54, this.field_147009_r + 43, 20, 15, "ขาย"));
   }

   protected void func_146979_b(int mouseX, int mouseY) {
   }

   protected void func_146976_a(float f, int mouseX, int mouseY) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_146297_k.func_110434_K().func_110577_a(iconLocation);
      this.func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f + 80, this.field_147000_g);
      PlayerData px = PlayerData.get(this.Player);
      this.field_146289_q.func_78276_b("  §f" + px.Money, this.field_147003_i + 116 - 30, this.field_147009_r + 66, 16777215);
   }

   protected void func_146284_a(GuiButton button) {
      EntityPlayer p = this.Player;
      Start.networkChannel.sendToServer(new CoinNewPacket(button.field_146127_k));
      p.func_71053_j();
      Start.networkChannel.sendToServer(new OpenGuiNewPacket(Start.CGUI));
   }
}
