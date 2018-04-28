package cabalaccessorys.breakitem;

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
public class breakGui extends GuiContainer {
   EntityPlayer Player = null;
   private float xSize_lo;
   private float ySize_lo;
   private static final ResourceLocation iconLocation = new ResourceLocation("cabalaccessorys:textures/GuiBreak.png");
   private final breakInventory inventory;

   public breakGui(EntityPlayer player, InventoryPlayer inventoryPlayer, breakInventory inventoryCustom) {
      super(new breakData(player, inventoryPlayer, inventoryCustom));
      this.inventory = inventoryCustom;
      this.Player = player;
   }

   public void func_73863_a(int mouseX, int mouseY, float f) {
      super.func_73863_a(mouseX, mouseY, f);
      this.xSize_lo = (float)mouseX;
      this.ySize_lo = (float)mouseY;
      this.field_146292_n.clear();
      this.field_146292_n.add(new GuiButton(0, this.field_147003_i + 92, this.field_147009_r + 37, 40, 20, "§aย่อยไอเทม"));
   }

   protected void func_146979_b(int mouseX, int mouseY) {
   }

   protected void func_146976_a(float f, int mouseX, int mouseY) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_146297_k.func_110434_K().func_110577_a(iconLocation);
      this.func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f + 80, this.field_147000_g);
   }

   protected void func_146284_a(GuiButton button) {
      EntityPlayer p = this.Player;
      PlayerData px = PlayerData.get(p);
      if (button.field_146127_k == 0) {
         Start.networkChannel.sendToServer(new breakNewPacket());
      }

   }
}
