package farmmode;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Rod3 extends ModelBase {
   ModelRenderer Shape1;
   ModelRenderer Shape2;
   ModelRenderer Shape3;
   ModelRenderer Shape4;
   ModelRenderer Shape5;
   ModelRenderer Shape6;
   ModelRenderer Shape7;
   ModelRenderer Shape8;
   ModelRenderer Shape9;
   ModelRenderer Shape10;
   ModelRenderer Shape11;
   ModelRenderer sling1;
   ModelRenderer sling2;
   ModelRenderer sling3;
   ModelRenderer sling4;

   public Rod3() {
      this.field_78090_t = 32;
      this.field_78089_u = 32;
      this.Shape1 = new ModelRenderer(this, 24, 16);
      this.Shape1.func_78789_a(0.0F, 0.0F, 0.0F, 2, 8, 2);
      this.Shape1.func_78793_a(-1.0F, 16.0F, -1.0F);
      this.Shape1.func_78787_b(32, 32);
      this.Shape1.field_78809_i = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 5, 0);
      this.Shape2.func_78789_a(0.0F, 0.0F, 0.0F, 3, 8, 3);
      this.Shape2.func_78793_a(-1.5F, 9.0F, -1.5F);
      this.Shape2.func_78787_b(32, 32);
      this.Shape2.field_78809_i = true;
      this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
      this.Shape3 = new ModelRenderer(this, 24, 11);
      this.Shape3.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 2);
      this.Shape3.func_78793_a(-2.0F, 12.0F, -1.0F);
      this.Shape3.func_78787_b(32, 32);
      this.Shape3.field_78809_i = true;
      this.setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
      this.Shape4 = new ModelRenderer(this, 18, 0);
      this.Shape4.func_78789_a(0.0F, 0.0F, 0.0F, 2, 3, 3);
      this.Shape4.func_78793_a(-4.0F, 13.0F, -2.0F);
      this.Shape4.func_78787_b(32, 32);
      this.Shape4.field_78809_i = true;
      this.setRotation(this.Shape4, 0.7853982F, 0.0F, 0.0F);
      this.Shape5 = new ModelRenderer(this, 18, 7);
      this.Shape5.func_78789_a(0.0F, 0.0F, 0.0F, 2, 1, 1);
      this.Shape5.func_78793_a(-5.5F, 12.5F, -0.5F);
      this.Shape5.func_78787_b(32, 32);
      this.Shape5.field_78809_i = true;
      this.setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
      this.Shape6 = new ModelRenderer(this, 25, 7);
      this.Shape6.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 1);
      this.Shape6.func_78793_a(-5.5F, 13.5F, -0.5F);
      this.Shape6.func_78787_b(32, 32);
      this.Shape6.field_78809_i = true;
      this.setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
      this.Shape7 = new ModelRenderer(this, 18, 10);
      this.Shape7.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape7.func_78793_a(-6.5F, 14.5F, -0.5F);
      this.Shape7.func_78787_b(32, 32);
      this.Shape7.field_78809_i = true;
      this.setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
      this.Shape8 = new ModelRenderer(this, 0, 12);
      this.Shape8.func_78789_a(0.0F, 0.0F, 0.0F, 2, 9, 2);
      this.Shape8.func_78793_a(-1.0F, 0.0F, 0.0F);
      this.Shape8.func_78787_b(32, 32);
      this.Shape8.field_78809_i = true;
      this.setRotation(this.Shape8, -0.0872665F, 0.0F, 0.0F);
      this.Shape9 = new ModelRenderer(this, 9, 13);
      this.Shape9.func_78789_a(-0.5F, -10.0F, 0.5F, 1, 10, 1);
      this.Shape9.func_78793_a(0.0F, 0.0F, 0.0F);
      this.Shape9.func_78787_b(32, 32);
      this.Shape9.field_78809_i = true;
      this.setRotation(this.Shape9, -0.1745329F, 0.0F, 0.0F);
      this.Shape10 = new ModelRenderer(this, 14, 13);
      this.Shape10.func_78789_a(-0.5F, -9.6F, -0.7F, 1, 10, 1);
      this.Shape10.func_78793_a(0.0F, -9.0F, 1.2F);
      this.Shape10.func_78787_b(32, 32);
      this.Shape10.field_78809_i = true;
      this.setRotation(this.Shape10, -0.1396264F, 0.0F, 0.0F);
      this.Shape11 = new ModelRenderer(this, 19, 13);
      this.Shape11.func_78789_a(0.0F, -8.0F, -0.5F, 1, 7, 1);
      this.Shape11.func_78793_a(-0.5F, -8.2F, -0.25F);
      this.Shape11.func_78787_b(32, 32);
      this.Shape11.field_78809_i = true;
      this.setRotation(this.Shape11, -0.2617994F, 0.0F, 0.0F);
      this.sling1 = new ModelRenderer(this, 0, 13);
      this.sling1.func_78789_a(0.0F, 0.0F, 0.0F, 0, 3, 16);
      this.sling1.func_78793_a(0.0F, -24.0F, 10.0F);
      this.sling1.func_78787_b(32, 32);
      this.sling1.field_78809_i = true;
      this.setRotation(this.sling1, -1.012291F, 0.0F, 0.0F);
      this.sling2 = new ModelRenderer(this, 0, 13);
      this.sling2.func_78789_a(0.0F, 0.0F, 0.0F, 0, 3, 16);
      this.sling2.func_78793_a(0.0F, -12.0F, 19.3F);
      this.sling2.func_78787_b(32, 32);
      this.sling2.field_78809_i = true;
      this.setRotation(this.sling2, -0.9599311F, 0.0F, 0.0F);
      this.sling3 = new ModelRenderer(this, 0, 13);
      this.sling3.func_78789_a(0.0F, 0.0F, 0.0F, 0, 3, 16);
      this.sling3.func_78793_a(0.0F, 0.0F, 30.0F);
      this.sling3.func_78787_b(32, 32);
      this.sling3.field_78809_i = true;
      this.setRotation(this.sling3, -0.9250245F, 0.0F, 0.0F);
      this.sling4 = new ModelRenderer(this, 0, 13);
      this.sling4.func_78789_a(0.0F, 0.0F, 0.0F, 0, 3, 16);
      this.sling4.func_78793_a(0.0F, 12.0F, 41.0F);
      this.sling4.func_78787_b(32, 32);
      this.sling4.field_78809_i = true;
      this.setRotation(this.sling4, -0.8726646F, 0.0F, 0.0F);
      this.Shape9.func_78792_a(this.Shape10);
      this.Shape10.func_78792_a(this.Shape11);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      this.sling1.func_78785_a(f5);
      this.sling2.func_78785_a(f5);
      this.sling3.func_78785_a(f5);
      this.sling4.func_78785_a(f5);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.field_78795_f = x;
      model.field_78796_g = y;
      model.field_78808_h = z;
   }

   public void setRotationAngles(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78087_a(f, f1, f2, f3, f4, f5, entity);
   }
}
