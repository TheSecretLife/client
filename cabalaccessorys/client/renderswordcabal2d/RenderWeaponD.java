package cabalaccessorys.client.renderswordcabal2d;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderWeaponD implements IItemRenderer {
   private Minecraft mc;

   public boolean handleRenderType(ItemStack item, ItemRenderType type) {
      return type == ItemRenderType.EQUIPPED || type == ItemRenderType.EQUIPPED_FIRST_PERSON;
   }

   public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
      return helper == ItemRendererHelper.EQUIPPED_BLOCK;
   }

   public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
      this.renderBigItem((EntityLivingBase)data[1], item);
   }

   public void renderBigItem(EntityLivingBase entity, ItemStack stack) {
      this.mc = Minecraft.func_71410_x();
      TextureManager texturemanager = this.mc.func_110434_K();
      IIcon icon = entity.func_70620_b(stack, 0);
      if (icon != null) {
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         texturemanager.func_110577_a(texturemanager.func_130087_a(stack.func_94608_d()));
         Tessellator tessellator = Tessellator.field_78398_a;
         float f = icon.func_94209_e();
         float f1 = icon.func_94212_f();
         float f2 = icon.func_94206_g();
         float f3 = icon.func_94210_h();
         float f4 = 0.0F;
         float f5 = 0.3F;
         GL11.glEnable(32826);
         GL11.glTranslatef(-f4, -f5, 0.0F);
         float f6 = 2.25F;
         GL11.glScalef(f6, f6, f6);
         GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
         ItemRenderer.func_78439_a(tessellator, f1, f2, f, f3, icon.func_94211_a(), icon.func_94216_b(), 0.0625F);
         if (stack != null) {
            GL11.glDepthFunc(514);
            GL11.glDisable(2896);
            texturemanager.func_110577_a(new ResourceLocation("cabalaccessorys:textures/effectA.png"));
            GL11.glEnable(3042);
            float f7 = 0.76F;
            GL11.glColor4f(10.0F, 10.0F, 10.0F, 0.5F);
            GL11.glMatrixMode(5890);
            GL11.glPushMatrix();
            float f8 = 0.125F;
            GL11.glScalef(f8, f8, f8);
            float f9 = (float)(Minecraft.func_71386_F() % 3000L) / 3000.0F * 8.0F;
            GL11.glTranslatef(f9, 0.0F, 0.0F);
            GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
            ItemRenderer.func_78439_a(tessellator, 0.0F, 0.0F, 3.0F, 8.0F, 256, 256, 0.0625F);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(f8, f8, f8);
            GL11.glTranslatef(f9, 0.0F, 0.0F);
            GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
            ItemRenderer.func_78439_a(tessellator, 8.0F, 3.0F, 0.0F, 0.0F, 256, 256, 0.0625F);
            GL11.glPopMatrix();
            GL11.glColor4f(10.0F, 10.0F, 10.0F, 0.2F);
            GL11.glPushMatrix();
            GL11.glScalef(f8, f8, f8);
            GL11.glTranslatef(f9, 0.0F, 0.0F);
            GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
            ItemRenderer.func_78439_a(tessellator, 3.0F, 8.0F, 0.0F, 0.0F, 256, 256, 0.0625F);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(f8, f8, f8);
            GL11.glTranslatef(f9, 0.0F, 0.0F);
            GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
            ItemRenderer.func_78439_a(tessellator, 0.0F, 0.0F, 3.0F, 8.0F, 256, 256, 0.0625F);
            GL11.glPopMatrix();
            GL11.glColor4f(50.0F, 50.0F, 50.0F, 0.3F);
            GL11.glPushMatrix();
            GL11.glScalef(f8, f8, f8);
            GL11.glTranslatef(f9, 0.0F, 0.0F);
            GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
            ItemRenderer.func_78439_a(tessellator, 0.0F, 0.0F, 3.0F, 8.5F, 256, 256, 0.0625F);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(f8, f8, f8);
            GL11.glTranslatef(f9, 0.0F, 0.0F);
            GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
            ItemRenderer.func_78439_a(tessellator, 3.0F, 8.5F, 0.0F, 0.0F, 256, 256, 0.0625F);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5888);
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glDepthFunc(515);
         }

         GL11.glDisable(32826);
      }
   }
}
