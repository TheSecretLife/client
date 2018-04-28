package sp;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class EntityCustomMobRender extends RenderLiving {
   private static final ResourceLocation tex = new ResourceLocation("cabalaccessorys:textures/seller.png");

   public EntityCustomMobRender(ModelBase b, float x) {
      super(b, x);
   }

   protected ResourceLocation getCowTextures(Entity c) {
      return tex;
   }

   protected ResourceLocation func_110775_a(Entity z) {
      return this.getCowTextures(z);
   }

   public void func_76986_a(EntityLiving p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
      EntityLivingBase en = (EntityLivingBase)EntityList.func_75620_a(p_76986_1_.func_70096_w().func_75681_e(24).split(",")[0], p_76986_1_.field_70170_p);
      if (en != null) {
         EntityUtil.Copy(p_76986_1_, en);
         Render render = RenderManager.field_78727_a.func_78713_a(en);
         render.func_76986_a(en, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
         String name = " §7[§aLv" + p_76986_1_.func_70096_w().func_75681_e(24).split(",")[3].replaceAll("&", "§") + "§7] " + p_76986_1_.func_70096_w().func_75681_e(24).split(",")[1].replaceAll("&", "§");
         float f = 0.5F;
         float f1 = 0.08F * f;
         FontRenderer fontrenderer = Minecraft.func_71410_x().field_71466_p;
         GL11.glDisable(2884);
         GL11.glDisable(2896);
         GL11.glPushMatrix();
         GL11.glTranslated(p_76986_2_, p_76986_4_ + (double)en.field_70131_O + 2.0D, p_76986_6_);
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-RenderManager.field_78727_a.field_78735_i, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-RenderManager.field_78727_a.field_78732_j, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(-f1, -f1, f1);
         GL11.glDisable(2896);
         GL11.glTranslatef(0.0F, 0.25F / f1, 0.0F);
         GL11.glDepthMask(false);
         GL11.glEnable(3042);
         OpenGlHelper.func_148821_a(770, 771, 1, 0);
         Tessellator tessellator = Tessellator.field_78398_a;
         GL11.glDisable(3553);
         GL11.glEnable(3553);
         GL11.glDepthMask(true);
         fontrenderer.func_78276_b(name, -fontrenderer.func_78256_a(name) / 2, -20, 0);
         GL11.glDisable(3042);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glPopMatrix();
         GL11.glEnable(2884);
         GL11.glEnable(2896);
      }

   }
}
