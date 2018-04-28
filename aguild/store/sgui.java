package aguild.store;

import aguild.playerdata;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class sgui extends GuiContainer {
   EntityPlayer Player = null;
   private float xSize_lo;
   private float ySize_lo;
   private static final ResourceLocation iconLocation = new ResourceLocation("aguild:textures/gui/storegui.png");
   private final sinv inventory;

   public sgui(EntityPlayer player, InventoryPlayer inventoryPlayer, sinv inventoryCustom) {
      super(new sda(player, inventoryPlayer, inventoryCustom));
      inventoryCustom.player = player;
      playerdata px = playerdata.get(player);
      this.inventory = inventoryCustom;
      this.inventory.player = player;
      this.Player = player;
   }

   public void func_73863_a(int mouseX, int mouseY, float f) {
      super.func_73863_a(mouseX, mouseY, f);
      this.xSize_lo = (float)mouseX;
      this.ySize_lo = (float)mouseY;
   }

   protected void func_146284_a(GuiButton button) {
      EntityPlayer p = this.Player;
   }

   protected void func_146979_b(int mouseX, int mouseY) {
   }

   protected void func_146976_a(float f, int mouseX, int mouseY) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_146297_k.func_110434_K().func_110577_a(iconLocation);
      this.func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f, this.field_147000_g);
   }
}
