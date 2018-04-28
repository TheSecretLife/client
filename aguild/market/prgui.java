package aguild.market;

import aguild.mod;
import aguild.packetclick;
import aguild.playerdata;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class prgui extends GuiScreen {
   private GuiTextField textbox;
   public int ptice = 0;
   EntityPlayer player = null;
   private static final ResourceLocation tex = new ResourceLocation("aguild:textures/gui/prgui.png");

   public prgui(EntityPlayer player) {
      this.player = player;
   }

   public void func_73866_w_() {
      this.textbox = new GuiTextField(this.field_146289_q, this.field_146294_l / 2 - 45, this.field_146295_m / 2 - 40, 90, 20);
      this.textbox.func_146203_f(10);
      this.textbox.func_146195_b(true);
   }

   protected void func_73869_a(char par1, int par2) {
      this.textbox.func_146201_a(par1, par2);
      if (par2 != 23 || !this.textbox.func_146206_l()) {
         super.func_73869_a(par1, par2);
      }

   }

   public void func_73876_c() {
      super.func_73876_c();
      this.textbox.func_146178_a();
   }

   protected void func_73864_a(int x, int y, int btn) {
      super.func_73864_a(x, y, btn);
      this.textbox.func_146192_a(x, y, btn);
   }

   public void func_73863_a(int par1, int par2, float par3) {
      this.func_146276_q_();
      super.func_73863_a(par1, par2, par3);
      this.textbox.func_146194_f();
      playerdata px = playerdata.get(this.player);
      this.field_146292_n.clear();
      this.field_146292_n.add(new GuiButton(0, this.field_146294_l / 2 - 30, this.field_146295_m / 2 - 15, 60, 20, "§fยืนยัน"));
   }

   public void func_146276_q_() {
      this.func_146270_b(0);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_146297_k.func_110434_K().func_110577_a(tex);
      this.func_73729_b(this.field_146294_l / 2 - 80, this.field_146295_m / 2 - 80, 0, 0, 230, 300);
   }

   public void func_146278_c(int p_146278_1_) {
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      Tessellator tessellator = Tessellator.field_78398_a;
      this.field_146297_k.func_110434_K().func_110577_a(field_110325_k);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float f = 32.0F;
      tessellator.func_78382_b();
      tessellator.func_78378_d(4210752);
      tessellator.func_78374_a(0.0D, (double)this.field_146295_m, 0.0D, 0.0D, (double)((float)this.field_146295_m / f + (float)p_146278_1_));
      tessellator.func_78374_a((double)this.field_146294_l, (double)this.field_146295_m, 0.0D, (double)((float)this.field_146294_l / f), (double)((float)this.field_146295_m / f + (float)p_146278_1_));
      tessellator.func_78374_a((double)this.field_146294_l, 0.0D, 0.0D, (double)((float)this.field_146294_l / f), (double)p_146278_1_);
      tessellator.func_78374_a(0.0D, 0.0D, 0.0D, 0.0D, (double)p_146278_1_);
      tessellator.func_78381_a();
   }

   public int getValue() {
      if (this.textbox.func_146179_b().length() > 0) {
         try {
            this.ptice = Integer.parseInt(this.textbox.func_146179_b());
         } catch (NumberFormatException var2) {
            this.setValue(0);
         }
      } else {
         this.ptice = 0;
      }

      return this.ptice;
   }

   public void setValue(int val) {
      this.textbox.func_146180_a(Integer.toString(val));
      this.ptice = val;
   }

   protected void func_146284_a(GuiButton button) {
      playerdata px = playerdata.get(this.player);
      this.getValue();
      if (button.field_146127_k == 0) {
         if (this.ptice > 0) {
            mod.network.sendToServer(new packetclick(5, "", 0));
            this.player.func_71053_j();
            mod.network.sendToServer(new packetclick(62, "", this.ptice));
            mod.network.sendToServer(new packetclick(61, "", 0));
         } else {
            this.player.func_145747_a(new ChatComponentText("§cกรุณาตั้งราคาไอเทมด้วยตัวเลขมากกว่า 0 ขึ้นไป"));
         }
      }

   }
}
