package farmmode;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class fish03model extends ModelBase {
   public ModelRenderer Shape1;
   public ModelRenderer Shape1a;
   public ModelRenderer Shape2;
   public ModelRenderer tail5;
   public ModelRenderer Shape3;
   public ModelRenderer tail2;
   public ModelRenderer Shape4;
   public ModelRenderer Shape5;
   public ModelRenderer tail8;
   public ModelRenderer tail6;
   public ModelRenderer tail7;
   public ModelRenderer tail1;
   public ModelRenderer Shape8;
   public ModelRenderer Shape8a;
   public ModelRenderer Shape9;
   public ModelRenderer Shape10;
   public ModelRenderer Shape11;
   public ModelRenderer Shape12;
   public ModelRenderer Shape12a;
   public ModelRenderer Shape13;
   public ModelRenderer Shape15;
   public ModelRenderer tail3;
   public ModelRenderer tail9;
   public ModelRenderer tail10;
   public ModelRenderer tail11;
   public ModelRenderer finR;
   public ModelRenderer finL;
   public ModelRenderer tail4;
   public ModelRenderer Shape22a;
   public ModelRenderer Shape22;
   public ModelRenderer Shape23;
   public ModelRenderer Shape23a;
   public ModelRenderer Shape23a1;
   public ModelRenderer Shape23a2;
   public ModelRenderer Shape23a3;
   public ModelRenderer Shape23a4;
   public ModelRenderer Shape23a5;
   public ModelRenderer Shape23a6;
   public ModelRenderer Shape13a7;

   public fish03model() {
      this.field_78090_t = 128;
      this.field_78089_u = 128;
      this.Shape15 = new ModelRenderer(this, 4, 43);
      this.Shape15.func_78793_a(0.0F, 12.1F, -3.1F);
      this.Shape15.func_78790_a(0.0F, 0.0F, 0.0F, 0, 3, 4, 0.0F);
      this.setRotateAngle(this.Shape15, 0.87266463F, -0.0F, 0.0F);
      this.finL = new ModelRenderer(this, 0, 52);
      this.finL.func_78793_a(2.0F, 15.67F, -4.0F);
      this.finL.func_78790_a(0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F);
      this.setRotateAngle(this.finL, 0.34278268F, 0.39304814F, -0.7696902F);
      this.Shape23a2 = new ModelRenderer(this, 2, 32);
      this.Shape23a2.func_78793_a(-1.4F, 13.7F, -8.0F);
      this.Shape23a2.func_78790_a(0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F);
      this.setRotateAngle(this.Shape23a2, -0.7853982F, -0.0F, 0.0F);
      this.Shape23a1 = new ModelRenderer(this, 2, 32);
      this.Shape23a1.func_78793_a(-1.4F, 13.7F, -7.0F);
      this.Shape23a1.func_78790_a(0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F);
      this.setRotateAngle(this.Shape23a1, -0.7853982F, -0.0F, 0.0F);
      this.Shape23a6 = new ModelRenderer(this, 2, 32);
      this.Shape23a6.func_78793_a(1.4F, 13.8F, -7.6F);
      this.Shape23a6.func_78790_a(0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F);
      this.setRotateAngle(this.Shape23a6, -0.7853982F, -0.0F, 0.0F);
      this.tail9 = new ModelRenderer(this, 98, -3);
      this.tail9.func_78793_a(0.0F, 14.0F, 14.7F);
      this.tail9.func_78790_a(0.0F, -4.0F, 0.0F, 0, 4, 3, 0.0F);
      this.setRotateAngle(this.tail9, -0.5235988F, -0.0F, 0.0F);
      this.finR = new ModelRenderer(this, 0, 52);
      this.finR.func_78793_a(-2.0F, 15.67F, -4.0F);
      this.finR.func_78790_a(0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F);
      this.setRotateAngle(this.finR, 0.34278268F, -0.39304814F, 0.7696902F);
      this.Shape9 = new ModelRenderer(this, 42, 10);
      this.Shape9.func_78793_a(0.0F, 15.7F, 7.0F);
      this.Shape9.func_78790_a(-1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F);
      this.setRotateAngle(this.Shape9, 0.2268928F, -0.0F, 0.0F);
      this.tail3 = new ModelRenderer(this, 10, 52);
      this.tail3.func_78793_a(-1.0F, 14.5F, 10.0F);
      this.tail3.func_78790_a(0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F);
      this.setRotateAngle(this.tail3, -0.08726646F, -0.0F, 0.43633232F);
      this.Shape12 = new ModelRenderer(this, 5, 52);
      this.Shape12.func_78793_a(-2.0F, 15.5F, 5.5F);
      this.Shape12.func_78790_a(0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F);
      this.setRotateAngle(this.Shape12, 0.44830346F, -0.3007097F, 0.55094296F);
      this.Shape23a3 = new ModelRenderer(this, 0, 32);
      this.Shape23a3.func_78793_a(1.4F, 13.7F, -8.0F);
      this.Shape23a3.func_78790_a(0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F);
      this.setRotateAngle(this.Shape23a3, -0.7853982F, -0.0F, 0.0F);
      this.Shape4 = new ModelRenderer(this, 12, 25);
      this.Shape4.func_78793_a(0.0F, 12.0F, -6.0F);
      this.Shape4.func_78790_a(-1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
      this.setRotateAngle(this.Shape4, 0.34906584F, -0.0F, 0.0F);
      this.tail4 = new ModelRenderer(this, 10, 52);
      this.tail4.func_78793_a(1.0F, 14.5F, 10.0F);
      this.tail4.func_78790_a(0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F);
      this.setRotateAngle(this.tail4, -0.08726646F, -0.0F, -0.43633232F);
      this.Shape3 = new ModelRenderer(this, 42, 0);
      this.Shape3.func_78793_a(0.0F, 13.0F, 7.0F);
      this.Shape3.func_78790_a(-1.5F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
      this.Shape2 = new ModelRenderer(this, 0, 25);
      this.Shape2.func_78793_a(0.0F, 13.0F, -6.0F);
      this.Shape2.func_78790_a(-1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
      this.Shape23a5 = new ModelRenderer(this, 0, 32);
      this.Shape23a5.func_78793_a(1.4F, 13.7F, -7.0F);
      this.Shape23a5.func_78790_a(0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F);
      this.setRotateAngle(this.Shape23a5, -0.7853982F, -0.0F, 0.0F);
      this.Shape23a4 = new ModelRenderer(this, 2, 32);
      this.Shape23a4.func_78793_a(1.4F, 13.8F, -6.6F);
      this.Shape23a4.func_78790_a(0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F);
      this.setRotateAngle(this.Shape23a4, -0.7853982F, -0.0F, 0.0F);
      this.tail11 = new ModelRenderer(this, 98, 3);
      this.tail11.func_78793_a(0.0F, 11.7F, 20.2F);
      this.tail11.func_78790_a(0.0F, -2.0F, 0.0F, 0, 2, 3, 0.0F);
      this.setRotateAngle(this.tail11, 0.6981317F, -0.0F, 0.0F);
      this.Shape23 = new ModelRenderer(this, 0, 32);
      this.Shape23.func_78793_a(-1.4F, 13.8F, -6.6F);
      this.Shape23.func_78790_a(0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F);
      this.setRotateAngle(this.Shape23, -0.7853982F, -0.0F, 0.0F);
      this.tail8 = new ModelRenderer(this, 90, 0);
      this.tail8.func_78793_a(0.0F, 8.9F, 19.4F);
      this.tail8.func_78790_a(-0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
      this.setRotateAngle(this.tail8, 0.34906584F, -0.0F, 0.0F);
      this.Shape10 = new ModelRenderer(this, 0, 13);
      this.Shape10.func_78793_a(0.0F, 16.0F, -6.0F);
      this.Shape10.func_78790_a(-2.0F, -1.0F, 0.0F, 4, 1, 8, 0.0F);
      this.setRotateAngle(this.Shape10, -0.034906585F, -0.0F, 0.0F);
      this.Shape13a7 = new ModelRenderer(this, 0, 45);
      this.Shape13a7.func_78793_a(0.0F, 12.0F, -3.5F);
      this.Shape13a7.func_78790_a(-0.5F, -4.0F, 0.0F, 1, 4, 1, 0.0F);
      this.setRotateAngle(this.Shape13a7, -0.57595867F, -0.0F, 0.0F);
      this.tail5 = new ModelRenderer(this, 64, 0);
      this.tail5.func_78793_a(0.0F, 13.1F, 12.3F);
      this.tail5.func_78790_a(-1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
      this.setRotateAngle(this.tail5, 0.34906584F, -0.0F, 0.0F);
      this.Shape8 = new ModelRenderer(this, 24, 15);
      this.Shape8.func_78793_a(0.0F, 16.3F, 2.0F);
      this.Shape8.func_78790_a(-2.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F);
      this.setRotateAngle(this.Shape8, 0.12217305F, -0.0F, 0.0F);
      this.tail6 = new ModelRenderer(this, 74, 0);
      this.tail6.func_78793_a(0.0F, 12.1F, 15.0F);
      this.tail6.func_78790_a(-0.5F, 0.0F, -0.5F, 1, 1, 3, 0.0F);
      this.setRotateAngle(this.tail6, 0.75049156F, -0.0F, 0.0F);
      this.tail10 = new ModelRenderer(this, 98, 2);
      this.tail10.func_78793_a(0.0F, 11.0F, 17.5F);
      this.tail10.func_78790_a(0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F);
      this.setRotateAngle(this.tail10, 0.5235988F, -0.0F, 0.0F);
      this.Shape1a = new ModelRenderer(this, 0, 0);
      this.Shape1a.func_78793_a(0.0F, 12.0F, -6.0F);
      this.Shape1a.func_78790_a(-2.0F, 0.0F, 0.0F, 4, 4, 8, 0.0F);
      this.Shape22a = new ModelRenderer(this, 0, 30);
      this.Shape22a.func_78793_a(-0.6F, 14.0F, -7.5F);
      this.Shape22a.func_78790_a(-1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
      this.tail2 = new ModelRenderer(this, 54, 0);
      this.tail2.func_78793_a(0.0F, 13.0F, 10.0F);
      this.tail2.func_78790_a(-1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
      this.Shape11 = new ModelRenderer(this, 17, 47);
      this.Shape11.func_78793_a(0.0F, 12.5F, 7.0F);
      this.Shape11.func_78790_a(0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F);
      this.setRotateAngle(this.Shape11, 0.61086524F, -0.0F, 0.0F);
      this.Shape5 = new ModelRenderer(this, 12, 30);
      this.Shape5.func_78793_a(0.0F, 15.0F, -6.0F);
      this.Shape5.func_78790_a(-1.0F, 0.0F, -2.7F, 2, 1, 3, 0.0F);
      this.setRotateAngle(this.Shape5, -0.29742888F, -0.0F, 0.0F);
      this.Shape13 = new ModelRenderer(this, 13, 46);
      this.Shape13.func_78793_a(0.0F, 12.0F, 6.5F);
      this.Shape13.func_78790_a(-0.5F, -2.0F, 0.0F, 1, 3, 1, 0.0F);
      this.setRotateAngle(this.Shape13, -0.7679449F, -0.0F, 0.0F);
      this.Shape22 = new ModelRenderer(this, 0, 30);
      this.Shape22.func_78793_a(0.6F, 14.0F, -7.5F);
      this.Shape22.func_78790_a(0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
      this.Shape23a = new ModelRenderer(this, 0, 32);
      this.Shape23a.func_78793_a(-1.4F, 13.8F, -7.6F);
      this.Shape23a.func_78790_a(0.0F, 0.0F, 0.0F, 0, 1, 1, 0.0F);
      this.setRotateAngle(this.Shape23a, -0.7853982F, -0.0F, 0.0F);
      this.Shape8a = new ModelRenderer(this, 24, 9);
      this.Shape8a.func_78793_a(0.0F, 12.0F, 2.0F);
      this.Shape8a.func_78790_a(-2.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
      this.setRotateAngle(this.Shape8a, -0.08726646F, -0.0F, 0.0F);
      this.Shape1 = new ModelRenderer(this, 24, 0);
      this.Shape1.func_78793_a(0.0F, 12.5F, 2.0F);
      this.Shape1.func_78790_a(-2.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F);
      this.Shape12a = new ModelRenderer(this, 5, 52);
      this.Shape12a.func_78793_a(2.0F, 15.5F, 5.5F);
      this.Shape12a.func_78790_a(0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F);
      this.setRotateAngle(this.Shape12a, 0.44837508F, 0.30072024F, -0.5510004F);
      this.tail1 = new ModelRenderer(this, 42, 6);
      this.tail1.func_78793_a(0.0F, 12.5F, 7.0F);
      this.tail1.func_78790_a(-1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
      this.setRotateAngle(this.tail1, -0.15707964F, -0.0F, 0.0F);
      this.tail7 = new ModelRenderer(this, 82, 0);
      this.tail7.func_78793_a(0.0F, 10.4F, 16.8F);
      this.tail7.func_78790_a(-0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
      this.setRotateAngle(this.tail7, 0.5235988F, 0.0F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 0.3F, 0.0F);
      this.Shape15.func_78785_a(f5);
      this.Shape23a2.func_78785_a(f5);
      this.Shape23a1.func_78785_a(f5);
      this.Shape23a6.func_78785_a(f5);
      this.Shape12.func_78785_a(f5);
      this.Shape23a3.func_78785_a(f5);
      this.Shape4.func_78785_a(f5);
      this.Shape2.func_78785_a(f5);
      this.Shape23a5.func_78785_a(f5);
      this.Shape23a4.func_78785_a(f5);
      this.Shape23.func_78785_a(f5);
      this.Shape10.func_78785_a(f5);
      this.Shape13a7.func_78785_a(f5);
      this.Shape8.func_78785_a(f5);
      this.Shape1a.func_78785_a(f5);
      this.Shape22a.func_78785_a(f5);
      this.Shape11.func_78785_a(f5);
      this.Shape5.func_78785_a(f5);
      this.Shape13.func_78785_a(f5);
      this.Shape22.func_78785_a(f5);
      this.Shape23a.func_78785_a(f5);
      this.Shape8a.func_78785_a(f5);
      this.Shape1.func_78785_a(f5);
      this.Shape12a.func_78785_a(f5);
      float rotateX = 0.0F;
      float rotateY = 0.0F;
      rotateX = MathHelper.func_76134_b(f2 * 1.8F * 0.25F) * 0.541593F * 0.25F;
      float var10000 = rotateY + MathHelper.func_76126_a(f2 * 0.067F) * 0.01F;
      GL11.glPushMatrix();
      GL11.glRotatef(rotateX * 15.0F, 0.0F, 1.0F, 0.0F);
      this.Shape3.func_78785_a(f5);
      this.Shape9.func_78785_a(f5);
      this.tail1.func_78785_a(f5);
      GL11.glPushMatrix();
      GL11.glRotatef(rotateX * 15.0F, 0.0F, 1.0F, 0.0F);
      this.tail2.func_78785_a(f5);
      this.tail3.func_78785_a(f5);
      this.tail4.func_78785_a(f5);
      GL11.glPushMatrix();
      GL11.glRotatef(rotateX * 15.0F, 0.0F, 1.0F, 0.0F);
      this.tail5.func_78785_a(f5);
      this.tail6.func_78785_a(f5);
      this.tail7.func_78785_a(f5);
      this.tail8.func_78785_a(f5);
      this.tail9.func_78785_a(f5);
      this.tail10.func_78785_a(f5);
      this.tail11.func_78785_a(f5);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glRotatef(rotateX * 5.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(rotateX * 5.0F, 1.0F, 0.0F, 0.0F);
      this.finL.func_78785_a(f5);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glRotatef(-rotateX * 5.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(rotateX * 5.0F, 1.0F, 0.0F, 0.0F);
      this.finR.func_78785_a(f5);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
   }

   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
      modelRenderer.field_78795_f = x;
      modelRenderer.field_78796_g = y;
      modelRenderer.field_78808_h = z;
   }
}