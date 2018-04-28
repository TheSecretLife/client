package farmmode;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class fish02model extends ModelBase {
   public ModelRenderer Shape1;
   public ModelRenderer Shape2;
   public ModelRenderer Shape3;
   public ModelRenderer tail1;
   public ModelRenderer Shape3a;
   public ModelRenderer Shape4;
   public ModelRenderer Shape5;
   public ModelRenderer Shape6;
   public ModelRenderer Shape6a;
   public ModelRenderer Shape7;
   public ModelRenderer Shape7a;
   public ModelRenderer Shape8;
   public ModelRenderer Shape9;
   public ModelRenderer Shape8a;
   public ModelRenderer Shape9a;
   public ModelRenderer tail2;
   public ModelRenderer tail5;
   public ModelRenderer tail3;
   public ModelRenderer tail6;
   public ModelRenderer tail4;
   public ModelRenderer Shape13;
   public ModelRenderer Shape14;
   public ModelRenderer Shape15;
   public ModelRenderer Shape16;
   public ModelRenderer Shape17;
   public ModelRenderer Shape19;
   public ModelRenderer Shape19a;
   public ModelRenderer Shape25;
   public ModelRenderer mountUnder;
   public ModelRenderer mountUp;
   public ModelRenderer Shape22a;
   public ModelRenderer Shape22a1;
   public ModelRenderer Shape22a2;
   public ModelRenderer Shape22a3;
   public ModelRenderer Shape23a4;
   public ModelRenderer Shape22a5;
   public ModelRenderer Shape22a6;
   public ModelRenderer Shape23a7;
   public ModelRenderer Shape22a8;
   public ModelRenderer Shape22a9;
   public ModelRenderer Shape24a10;
   public ModelRenderer Shape25a11;
   public ModelRenderer Shape24a12;
   public ModelRenderer CreepR;
   public ModelRenderer CreepL;
   public ModelRenderer finR;
   public ModelRenderer finL;
   private float rotateX;
   private float rotateY;

   public fish02model() {
      this.field_78090_t = 128;
      this.field_78089_u = 128;
      this.Shape13 = new ModelRenderer(this, 0, 46);
      this.Shape13.func_78793_a(0.0F, 11.0F, -8.0F);
      this.Shape13.func_78790_a(0.0F, 0.0F, 0.0F, 0, 1, 5, 0.0F);
      this.setRotateAngle(this.Shape13, 0.27925268F, -0.0F, 0.0F);
      this.tail6 = new ModelRenderer(this, 54, 3);
      this.tail6.func_78793_a(0.0F, 17.8F, 10.7F);
      this.tail6.func_78790_a(0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F);
      this.setRotateAngle(this.tail6, -0.08726646F, -0.0F, 0.0F);
      this.Shape8a = new ModelRenderer(this, 44, 31);
      this.Shape8a.func_78793_a(0.0F, 11.0F, 2.0F);
      this.Shape8a.func_78790_a(-1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
      this.setRotateAngle(this.Shape8a, -0.6981317F, -0.0F, 0.0F);
      this.Shape23a4 = new ModelRenderer(this, 16, 19);
      this.Shape23a4.func_78793_a(-0.7F, 14.2F, -9.3F);
      this.Shape23a4.func_78790_a(-1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
      this.Shape22a2 = new ModelRenderer(this, 12, 19);
      this.Shape22a2.func_78793_a(-0.6F, 14.0F, -9.1F);
      this.Shape22a2.func_78790_a(-1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
      this.Shape8 = new ModelRenderer(this, 44, 37);
      this.Shape8.func_78793_a(0.0F, 19.0F, 2.0F);
      this.Shape8.func_78790_a(-1.0F, -2.0F, 0.0F, 2, 2, 3, 0.0F);
      this.setRotateAngle(this.Shape8, 0.6981317F, -0.0F, 0.0F);
      this.Shape3a = new ModelRenderer(this, 0, 18);
      this.Shape3a.func_78793_a(0.0F, 13.0F, -8.0F);
      this.Shape3a.func_78790_a(-1.5F, 0.0F, -2.5F, 3, 5, 3, 0.0F);
      this.setRotateAngle(this.Shape3a, -0.08726646F, -0.0F, 0.0F);
      this.tail2 = new ModelRenderer(this, 46, -1);
      this.tail2.func_78793_a(0.0F, 13.5F, 7.0F);
      this.tail2.func_78790_a(0.0F, 0.0F, 0.0F, 0, 3, 3, 0.0F);
      this.Shape15 = new ModelRenderer(this, 22, 45);
      this.Shape15.func_78793_a(0.0F, 9.6F, 2.8F);
      this.Shape15.func_78790_a(0.0F, 0.0F, 0.0F, 0, 3, 4, 0.0F);
      this.setRotateAngle(this.Shape15, -0.40359446F, -0.0F, 0.0F);
      this.Shape16 = new ModelRenderer(this, 0, 47);
      this.Shape16.func_78793_a(0.0F, 19.4F, -3.0F);
      this.Shape16.func_78790_a(0.0F, -2.0F, 0.0F, 0, 2, 6, 0.0F);
      this.setRotateAngle(this.Shape16, -0.12217305F, -0.0F, 0.0F);
      this.tail1 = new ModelRenderer(this, 42, 1);
      this.tail1.func_78793_a(0.0F, 13.5F, 6.0F);
      this.tail1.func_78790_a(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
      this.Shape1 = new ModelRenderer(this, 0, 0);
      this.Shape1.func_78793_a(0.0F, 11.0F, -8.0F);
      this.Shape1.func_78790_a(-1.5F, 0.0F, 0.0F, 3, 8, 10, 0.0F);
      this.CreepR = new ModelRenderer(this, 4, 56);
      this.CreepR.func_78793_a(-1.5F, 19.0F, -7.0F);
      this.CreepR.func_78790_a(0.0F, 0.0F, 0.0F, 0, 3, 1, 0.0F);
      this.setRotateAngle(this.CreepR, 0.6981317F, -0.0F, 0.34906584F);
      this.Shape9 = new ModelRenderer(this, 54, 37);
      this.Shape9.func_78793_a(0.0F, 17.1F, 4.3F);
      this.Shape9.func_78790_a(-1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
      this.setRotateAngle(this.Shape9, 0.6981317F, -0.0F, 0.0F);
      this.Shape23a7 = new ModelRenderer(this, 16, 19);
      this.Shape23a7.func_78793_a(0.7F, 14.2F, -9.3F);
      this.Shape23a7.func_78790_a(0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
      this.Shape25 = new ModelRenderer(this, 8, 69);
      this.Shape25.func_78793_a(0.1F, 15.0F, 5.0F);
      this.Shape25.func_78790_a(0.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
      this.Shape22a9 = new ModelRenderer(this, 12, 19);
      this.Shape22a9.func_78793_a(0.6F, 14.4F, -9.1F);
      this.Shape22a9.func_78790_a(0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
      this.Shape7a = new ModelRenderer(this, 12, 37);
      this.Shape7a.func_78793_a(0.0F, 19.0F, -8.0F);
      this.Shape7a.func_78790_a(-1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F);
      this.setRotateAngle(this.Shape7a, -0.19198622F, -0.0F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 26, 0);
      this.Shape2.func_78793_a(0.0F, 13.5F, 2.0F);
      this.Shape2.func_78790_a(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
      this.tail4 = new ModelRenderer(this, 54, -1);
      this.tail4.func_78793_a(0.0F, 12.1F, 10.7F);
      this.tail4.func_78790_a(0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F);
      this.setRotateAngle(this.tail4, 0.08726646F, -0.0F, 0.0F);
      this.Shape6 = new ModelRenderer(this, 28, 30);
      this.Shape6.func_78793_a(0.0F, 10.6F, -3.0F);
      this.Shape6.func_78790_a(-1.5F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
      this.setRotateAngle(this.Shape6, -0.08726646F, -0.0F, 0.0F);
      this.CreepL = new ModelRenderer(this, 4, 56);
      this.CreepL.func_78793_a(1.5F, 19.0F, -7.0F);
      this.CreepL.func_78790_a(0.0F, 0.0F, 0.0F, 0, 3, 1, 0.0F);
      this.setRotateAngle(this.CreepL, 0.6981317F, -0.0F, -0.34906584F);
      this.finR = new ModelRenderer(this, 0, 55);
      this.finR.func_78793_a(-1.5F, 17.0F, -6.5F);
      this.finR.func_78790_a(0.0F, -4.0F, 0.0F, 0, 4, 2, 0.0F);
      this.setRotateAngle(this.finR, -0.5235988F, -0.17453292F, 0.0F);
      this.Shape22a = new ModelRenderer(this, 12, 19);
      this.Shape22a.func_78793_a(-0.6F, 14.4F, -9.5F);
      this.Shape22a.func_78790_a(-1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
      this.Shape17 = new ModelRenderer(this, 12, 49);
      this.Shape17.func_78793_a(0.0F, 20.0F, 3.0F);
      this.Shape17.func_78790_a(0.0F, -3.0F, 0.0F, 0, 3, 4, 0.0F);
      this.setRotateAngle(this.Shape17, 0.29670596F, -0.0F, 0.0F);
      this.Shape22a6 = new ModelRenderer(this, 12, 19);
      this.Shape22a6.func_78793_a(0.6F, 14.0F, -9.1F);
      this.Shape22a6.func_78790_a(0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
      this.mountUp = new ModelRenderer(this, 12, 21);
      this.mountUp.func_78793_a(0.0F, 17.0F, -10.4F);
      this.mountUp.func_78790_a(-1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F);
      this.setRotateAngle(this.mountUp, 0.2443461F, -0.0F, 0.0F);
      this.Shape5 = new ModelRenderer(this, 0, 37);
      this.Shape5.func_78793_a(0.0F, 17.8F, -10.8F);
      this.Shape5.func_78790_a(-1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F);
      this.setRotateAngle(this.Shape5, -0.38397244F, -0.0F, 0.0F);
      this.Shape19a = new ModelRenderer(this, 20, 19);
      this.Shape19a.func_78793_a(1.5F, 15.0F, -8.7F);
      this.Shape19a.func_78790_a(0.0F, -2.0F, 0.0F, 0, 4, 2, 0.0F);
      this.setRotateAngle(this.Shape19a, 0.4717625F, 0.034906585F, 0.017453292F);
      this.Shape14 = new ModelRenderer(this, 10, 44);
      this.Shape14.func_78793_a(0.0F, 9.6F, -3.2F);
      this.Shape14.func_78790_a(0.0F, 0.0F, 0.0F, 0, 2, 6, 0.0F);
      this.Shape24a10 = new ModelRenderer(this, 0, 67);
      this.Shape24a10.func_78793_a(-0.1F, 14.0F, 2.0F);
      this.Shape24a10.func_78790_a(-1.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
      this.Shape22a3 = new ModelRenderer(this, 12, 19);
      this.Shape22a3.func_78793_a(-0.6F, 14.0F, -9.5F);
      this.Shape22a3.func_78790_a(-1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
      this.Shape19 = new ModelRenderer(this, 20, 19);
      this.Shape19.func_78793_a(-1.5F, 15.0F, -8.7F);
      this.Shape19.func_78790_a(0.0F, -2.0F, 0.0F, 0, 4, 2, 0.0F);
      this.setRotateAngle(this.Shape19, 0.47184837F, -0.034901265F, -0.017463928F);
      this.Shape25a11 = new ModelRenderer(this, 8, 69);
      this.Shape25a11.func_78793_a(-0.1F, 15.0F, 5.0F);
      this.Shape25a11.func_78790_a(-1.0F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
      this.Shape22a8 = new ModelRenderer(this, 12, 19);
      this.Shape22a8.func_78793_a(0.6F, 14.4F, -9.5F);
      this.Shape22a8.func_78790_a(0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
      this.Shape22a5 = new ModelRenderer(this, 12, 19);
      this.Shape22a5.func_78793_a(0.6F, 14.0F, -9.5F);
      this.Shape22a5.func_78790_a(0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
      this.mountUnder = new ModelRenderer(this, 12, 23);
      this.mountUnder.func_78793_a(0.0F, 17.7F, -10.0F);
      this.mountUnder.func_78790_a(-1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F);
      this.setRotateAngle(this.mountUnder, 0.715585F, -0.0F, 0.0F);
      this.Shape4 = new ModelRenderer(this, 0, 31);
      this.Shape4.func_78793_a(0.0F, 12.8F, -10.5F);
      this.Shape4.func_78790_a(-1.5F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
      this.setRotateAngle(this.Shape4, 0.62831855F, -0.0F, 0.0F);
      this.Shape9a = new ModelRenderer(this, 54, 34);
      this.Shape9a.func_78793_a(0.0F, 12.9F, 4.3F);
      this.Shape9a.func_78790_a(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
      this.setRotateAngle(this.Shape9a, -0.6981317F, -0.0F, 0.0F);
      this.tail5 = new ModelRenderer(this, 46, 1);
      this.tail5.func_78793_a(0.0F, 16.5F, 7.0F);
      this.tail5.func_78790_a(0.0F, -1.0F, 0.0F, 0, 1, 4, 0.0F);
      this.setRotateAngle(this.tail5, -0.34906584F, -0.0F, 0.0F);
      this.Shape22a1 = new ModelRenderer(this, 12, 19);
      this.Shape22a1.func_78793_a(-0.6F, 14.4F, -9.1F);
      this.Shape22a1.func_78790_a(-1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
      this.Shape3 = new ModelRenderer(this, 34, 0);
      this.Shape3.func_78793_a(0.0F, 13.5F, 4.0F);
      this.Shape3.func_78790_a(-1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
      this.tail3 = new ModelRenderer(this, 46, -3);
      this.tail3.func_78793_a(0.0F, 13.5F, 7.0F);
      this.tail3.func_78790_a(0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F);
      this.setRotateAngle(this.tail3, 0.34906584F, -0.0F, 0.0F);
      this.Shape24a12 = new ModelRenderer(this, 0, 67);
      this.Shape24a12.func_78793_a(0.1F, 14.0F, 2.0F);
      this.Shape24a12.func_78790_a(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
      this.Shape7 = new ModelRenderer(this, 24, 37);
      this.Shape7.func_78793_a(0.0F, 19.6F, -5.0F);
      this.Shape7.func_78790_a(-1.5F, -1.0F, 0.0F, 3, 1, 7, 0.0F);
      this.setRotateAngle(this.Shape7, 0.08726646F, -0.0F, 0.0F);
      this.finL = new ModelRenderer(this, 0, 55);
      this.finL.func_78793_a(1.5F, 17.0F, -6.5F);
      this.finL.func_78790_a(0.0F, -4.0F, 0.0F, 0, 4, 2, 0.0F);
      this.setRotateAngle(this.finL, -0.5235988F, 0.17453292F, 0.0F);
      this.Shape6a = new ModelRenderer(this, 12, 30);
      this.Shape6a.func_78793_a(0.0F, 11.0F, -8.0F);
      this.Shape6a.func_78790_a(-1.5F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
      this.setRotateAngle(this.Shape6a, 0.08726646F, -0.0F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 0.3F, 0.0F);
      this.Shape13.func_78785_a(f5);
      this.Shape8a.func_78785_a(f5);
      this.Shape23a4.func_78785_a(f5);
      this.Shape22a2.func_78785_a(f5);
      this.Shape8.func_78785_a(f5);
      this.Shape3a.func_78785_a(f5);
      this.Shape15.func_78785_a(f5);
      this.Shape16.func_78785_a(f5);
      this.Shape1.func_78785_a(f5);
      this.Shape9.func_78785_a(f5);
      this.Shape23a7.func_78785_a(f5);
      this.Shape25.func_78785_a(f5);
      this.Shape22a9.func_78785_a(f5);
      this.Shape7a.func_78785_a(f5);
      this.Shape2.func_78785_a(f5);
      this.Shape6.func_78785_a(f5);
      this.Shape22a.func_78785_a(f5);
      this.Shape17.func_78785_a(f5);
      this.Shape22a6.func_78785_a(f5);
      this.mountUp.func_78785_a(f5);
      this.Shape5.func_78785_a(f5);
      this.Shape19a.func_78785_a(f5);
      this.Shape14.func_78785_a(f5);
      this.Shape24a10.func_78785_a(f5);
      this.Shape22a3.func_78785_a(f5);
      this.Shape19.func_78785_a(f5);
      this.Shape25a11.func_78785_a(f5);
      this.Shape22a8.func_78785_a(f5);
      this.Shape22a5.func_78785_a(f5);
      this.mountUnder.func_78785_a(f5);
      this.Shape4.func_78785_a(f5);
      this.Shape9a.func_78785_a(f5);
      this.Shape22a1.func_78785_a(f5);
      this.Shape3.func_78785_a(f5);
      this.Shape24a12.func_78785_a(f5);
      this.Shape7.func_78785_a(f5);
      this.Shape6a.func_78785_a(f5);
      this.rotateX = MathHelper.func_76134_b(f2 * 1.8F * 0.15F) * 0.241593F * 0.25F;
      this.rotateY += MathHelper.func_76126_a(f2 * 0.067F) * 0.01F;
      GL11.glPushMatrix();
      GL11.glRotatef(this.rotateX * 50.0F, 0.0F, 1.0F, 0.0F);
      this.tail1.func_78785_a(f5);
      this.tail2.func_78785_a(f5);
      this.tail3.func_78785_a(f5);
      this.tail4.func_78785_a(f5);
      this.tail5.func_78785_a(f5);
      this.tail6.func_78785_a(f5);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glRotatef(this.rotateX * 10.0F, 0.0F, 1.0F, 0.0F);
      this.finL.func_78785_a(f5);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glRotatef(-this.rotateX * 10.0F, 0.0F, 1.0F, 0.0F);
      this.finR.func_78785_a(f5);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glRotatef(this.rotateX * 10.0F, 0.0F, 1.0F, 0.0F);
      this.CreepL.func_78785_a(f5);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glRotatef(-this.rotateX * 10.0F, 0.0F, 1.0F, 0.0F);
      this.CreepR.func_78785_a(f5);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
   }

   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
      modelRenderer.field_78795_f = x;
      modelRenderer.field_78796_g = y;
      modelRenderer.field_78808_h = z;
   }
}