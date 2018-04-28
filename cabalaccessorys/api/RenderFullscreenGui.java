package cabalaccessorys.api;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

public class RenderFullscreenGui {
   public static void drawgui(float p_73970_1_, float p_73970_2_, float p_73970_3_, ResourceLocation texture) {
      Tessellator tessellator = Tessellator.field_78398_a;
      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      Project.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
      GL11.glMatrixMode(5888);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glEnable(3042);
      GL11.glDisable(3008);
      GL11.glDisable(2884);
      GL11.glDepthMask(false);
      OpenGlHelper.func_148821_a(770, 771, 1, 0);
      GL11.glPushMatrix();
      GL11.glPushMatrix();
      Minecraft.func_71410_x().func_110434_K().func_110577_a(texture);
      TextureSetting.setblur();
      tessellator.func_78382_b();
      float f4 = 0.0F;
      tessellator.func_78373_b(-0.75D, -0.74D, 0.0D);
      tessellator.func_78374_a(-1.0D, -1.0D, 1.0D, (double)(0.0F + f4), (double)(0.0F + f4));
      tessellator.func_78374_a(2.52D, -1.0D, 1.0D, (double)(1.0F - f4), (double)(0.0F + f4));
      tessellator.func_78374_a(2.52D, 5.35D + (double)p_73970_2_, 1.0D, (double)(1.0F - f4), (double)(1.0F - f4));
      tessellator.func_78374_a(-1.0D, 5.35D + (double)p_73970_2_, 1.0D, (double)(0.0F + f4), (double)(1.0F - f4));
      tessellator.func_78381_a();
      GL11.glPopMatrix();
      GL11.glPopMatrix();
      GL11.glColorMask(true, true, true, true);
      GL11.glMatrixMode(5889);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      tessellator.func_78373_b(0.0D, 0.0D, 0.0D);
   }
}
