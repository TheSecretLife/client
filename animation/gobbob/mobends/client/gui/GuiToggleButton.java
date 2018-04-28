package animation.gobbob.mobends.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class GuiToggleButton extends GuiButton {
   public boolean toggleState;
   public String title;
   public int titleWidth;

   public GuiToggleButton(int p_i1020_1_, int p_i1020_2_, int p_i1020_3_, boolean state) {
      super(p_i1020_1_, p_i1020_2_, p_i1020_3_, "");
      this.toggleState = state;
      this.field_146120_f = 40;
      this.field_146121_g = 20;
      this.field_146126_j = state ? "ON" : "OFF";
   }

   public GuiToggleButton setTitle(String argTitle, int argWidth) {
      this.title = argTitle;
      this.titleWidth = argWidth;
      this.field_146128_h += argWidth;
      return this;
   }

   public void func_146112_a(Minecraft p_146112_1_, int p_146112_2_, int p_146112_3_) {
      if (this.field_146125_m) {
         FontRenderer fontrenderer = p_146112_1_.field_71466_p;
         p_146112_1_.func_110434_K().func_110577_a(field_146122_a);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.field_146123_n = p_146112_2_ >= this.field_146128_h && p_146112_3_ >= this.field_146129_i && p_146112_2_ < this.field_146128_h + this.field_146120_f && p_146112_3_ < this.field_146129_i + this.field_146121_g;
         int k = this.func_146114_a(this.field_146123_n);
         GL11.glEnable(3042);
         OpenGlHelper.func_148821_a(770, 771, 1, 0);
         GL11.glBlendFunc(770, 771);
         GL11.glPushMatrix();
         GL11.glColor3f(0.5F, 0.5F, 0.5F);
         this.func_73729_b(this.field_146128_h - this.titleWidth, this.field_146129_i, 0, 46 + k * 20, (this.titleWidth + this.field_146120_f) / 2, this.field_146121_g);
         this.func_73729_b(this.field_146128_h + this.titleWidth / 2 - this.titleWidth, this.field_146129_i, 200 - (this.titleWidth + this.field_146120_f) / 2, 46 + k * 20, (this.titleWidth + this.field_146120_f) / 2, this.field_146121_g);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         if (this.toggleState) {
            GL11.glColor3f(0.0F, 1.0F, 0.0F);
         } else {
            GL11.glColor3f(1.0F, 0.0F, 0.0F);
         }

         this.func_73729_b(this.titleWidth + this.field_146128_h - this.titleWidth, this.field_146129_i, 0, 46 + k * 20, this.field_146120_f / 2, this.field_146121_g);
         this.func_73729_b(this.titleWidth + this.field_146128_h + this.field_146120_f / 2 - this.titleWidth, this.field_146129_i, 200 - this.field_146120_f / 2, 46 + k * 20, this.field_146120_f / 2, this.field_146121_g);
         GL11.glPopMatrix();
         this.func_146119_b(p_146112_1_, p_146112_2_, p_146112_3_);
         int l = 14737632;
         if (this.packedFGColour != 0) {
            l = this.packedFGColour;
         } else if (!this.field_146124_l) {
            l = 10526880;
         } else if (this.field_146123_n) {
            l = 16777120;
         }

         this.func_73731_b(fontrenderer, this.title, this.field_146128_h + 15 - this.titleWidth, this.field_146129_i + (this.field_146121_g - 8) / 2, l);
         this.func_73732_a(fontrenderer, this.field_146126_j, this.field_146128_h + this.field_146120_f / 2, this.field_146129_i + (this.field_146121_g - 8) / 2, l);
         GL11.glBlendFunc(770, 771);
      }

   }
}
