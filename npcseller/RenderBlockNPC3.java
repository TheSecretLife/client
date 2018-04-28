package npcseller;

import cabalaccessorys.api.TextureSetting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import utilities.SagaModelLoader;
import utilities.sagaobj;

public class RenderBlockNPC3 extends TileEntitySpecialRenderer {
   public static final sagaobj model = (sagaobj)SagaModelLoader.loadModel(new ResourceLocation("cabalaccessorys:models/npc/priest_hr/priest_hr.saga"));
   public static final ResourceLocation texture = new ResourceLocation("cabalaccessorys:models/npc/priest_hr/priest_hr-water.png");

   public void func_147500_a(TileEntity te, double x, double y, double z, float scale) {
      this.doRender((TileC3)te, x, y, z, scale);
   }

   public void doRender(TileC3 te, double x, double y, double z, float scale) {
      float size = 0.14F;
      GL11.glPushMatrix();
      GL11.glDisable(2896);
      GL11.glDisable(2884);
      GL11.glTranslated(x + 0.5299999713897705D, y + 0.0D, z + 0.5D);
      GL11.glScalef(size, size, size);
      GL11.glRotatef(2.0F, 0.0F, 1.0F, 0.0F);
      if (te.field_145847_g == 4) {
         GL11.glRotatef((float)te.func_145832_p() * -23.0F, 0.0F, 1.0F, 0.0F);
      } else if (te.field_145847_g == 3) {
         GL11.glRotatef((float)te.func_145832_p(), 10.0F, 1.0F, 0.0F);
      } else if (te.field_145847_g == 2) {
         GL11.glRotatef((float)te.func_145832_p() * 46.0F, 0.0F, 1.0F, 0.0F);
      } else {
         GL11.glRotatef((float)te.func_145832_p() * -36.4F, 0.0F, 1.0F, 0.0F);
      }

      Minecraft.func_71410_x().field_71446_o.func_110577_a(texture);
      TextureSetting.setblur();
      model.renderAll();
      GL11.glPopMatrix();
      String name = " &c[&aNPC&c]&6" + te.getNamenpc();
      float f = 0.7F;
      float f1 = 0.08F * f;
      FontRenderer fontrenderer = Minecraft.func_71410_x().field_71466_p;
      GL11.glPushMatrix();
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      GL11.glTranslated(x + 0.5299999713897705D, y + 3.5D, z + 0.5D);
      if (te.field_145847_g == 4) {
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef((float)te.func_145832_p() * -22.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
      } else if (te.field_145847_g == 3) {
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef((float)te.func_145832_p(), 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-180.0F, 0.0F, 1.0F, 0.0F);
      } else if (te.field_145847_g == 2) {
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef((float)te.func_145832_p() * 46.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
      } else {
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef((float)te.func_145832_p() * -35.0F, 0.0F, 1.0F, 0.0F);
      }

      GL11.glRotatef(-RenderManager.field_78727_a.field_78735_i, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(RenderManager.field_78727_a.field_78732_j, 1.0F, 0.0F, 0.0F);
      GL11.glScalef(-f1, -f1, f1);
      GL11.glDisable(2896);
      GL11.glTranslatef(0.0F, 0.25F / f1, 0.0F);
      GL11.glDepthMask(false);
      GL11.glEnable(3042);
      OpenGlHelper.func_148821_a(770, 771, 1, 0);
      Tessellator tessellator = Tessellator.field_78398_a;
      GL11.glDisable(3553);
      tessellator.func_78382_b();
      int i = fontrenderer.func_78256_a(name) / 2;
      tessellator.func_78369_a(0.0F, 0.0F, 0.0F, 0.0F);
      tessellator.func_78377_a(1.0D * (double)(-i - 1), -1.0D, 0.0D);
      tessellator.func_78377_a(1.0D * (double)(-i - 1), 8.0D, 0.0D);
      tessellator.func_78377_a(1.0D * (double)(i + 1), 8.0D, 0.0D);
      tessellator.func_78377_a(1.0D * (double)(i + 1), -1.0D, 0.0D);
      tessellator.func_78381_a();
      GL11.glEnable(3553);
      GL11.glDepthMask(true);
      fontrenderer.func_78276_b(name.replaceAll("&", "§"), -fontrenderer.func_78256_a(name) / 3, 0, 0);
      GL11.glDisable(3042);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
      GL11.glEnable(2896);
      GL11.glEnable(2884);
   }
}
