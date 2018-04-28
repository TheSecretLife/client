package farmmode;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BugCatch extends ModelBase {
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

   public BugCatch() {
      this.field_78090_t = 32;
      this.field_78089_u = 32;
      this.Shape1 = new ModelRenderer(this, 0, 0);
      this.Shape1.func_78789_a(0.0F, 0.0F, 0.0F, 1, 17, 1);
      this.Shape1.func_78793_a(-0.5F, 1.0F, 0.0F);
      this.Shape1.func_78787_b(32, 32);
      this.Shape1.field_78809_i = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 5, 0);
      this.Shape2.func_78789_a(0.0F, 0.0F, 0.0F, 1, 5, 1);
      this.Shape2.func_78793_a(-3.5F, -5.0F, 0.0F);
      this.Shape2.func_78787_b(32, 32);
      this.Shape2.field_78809_i = true;
      this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
      this.Shape3 = new ModelRenderer(this, 5, 0);
      this.Shape3.func_78789_a(0.0F, 0.0F, 0.0F, 1, 5, 1);
      this.Shape3.func_78793_a(2.5F, -5.0F, 0.0F);
      this.Shape3.func_78787_b(32, 32);
      this.Shape3.field_78809_i = true;
      this.setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
      this.Shape4 = new ModelRenderer(this, 10, 0);
      this.Shape4.func_78789_a(0.0F, 0.0F, 0.0F, 5, 1, 1);
      this.Shape4.func_78793_a(-2.5F, -6.0F, 0.0F);
      this.Shape4.func_78787_b(32, 32);
      this.Shape4.field_78809_i = true;
      this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
      this.Shape5 = new ModelRenderer(this, 10, 0);
      this.Shape5.func_78789_a(0.0F, 0.0F, 0.0F, 5, 1, 1);
      this.Shape5.func_78793_a(-2.5F, 0.0F, 0.0F);
      this.Shape5.func_78787_b(32, 32);
      this.Shape5.field_78809_i = true;
      this.setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
      this.Shape6 = new ModelRenderer(this, 5, 12);
      this.Shape6.func_78789_a(0.0F, 0.0F, 0.0F, 5, 0, 5);
      this.Shape6.func_78793_a(-2.5F, -5.0F, 1.0F);
      this.Shape6.func_78787_b(32, 32);
      this.Shape6.field_78809_i = true;
      this.setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
      this.Shape7 = new ModelRenderer(this, 5, 12);
      this.Shape7.func_78789_a(0.0F, 0.0F, 0.0F, 5, 0, 5);
      this.Shape7.func_78793_a(-2.5F, 0.0F, 1.0F);
      this.Shape7.func_78787_b(32, 32);
      this.Shape7.field_78809_i = true;
      this.setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
      this.Shape8 = new ModelRenderer(this, 5, 7);
      this.Shape8.func_78789_a(0.0F, 0.0F, 0.0F, 0, 5, 5);
      this.Shape8.func_78793_a(-2.5F, -5.0F, 1.0F);
      this.Shape8.func_78787_b(32, 32);
      this.Shape8.field_78809_i = true;
      this.setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
      this.Shape9 = new ModelRenderer(this, 5, 7);
      this.Shape9.func_78789_a(0.0F, 0.0F, 0.0F, 0, 5, 5);
      this.Shape9.func_78793_a(2.5F, -5.0F, 1.0F);
      this.Shape9.func_78787_b(32, 32);
      this.Shape9.field_78809_i = true;
      this.setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
      this.Shape10 = new ModelRenderer(this, 5, 12);
      this.Shape10.func_78789_a(0.0F, 0.0F, 0.0F, 5, 5, 0);
      this.Shape10.func_78793_a(-2.5F, -5.0F, 6.0F);
      this.Shape10.func_78787_b(32, 32);
      this.Shape10.field_78809_i = true;
      this.setRotation(this.Shape10, 0.0F, 0.0F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      this.Shape1.func_78785_a(f5);
      this.Shape2.func_78785_a(f5);
      this.Shape3.func_78785_a(f5);
      this.Shape4.func_78785_a(f5);
      this.Shape5.func_78785_a(f5);
      this.Shape6.func_78785_a(f5);
      this.Shape7.func_78785_a(f5);
      this.Shape8.func_78785_a(f5);
      this.Shape9.func_78785_a(f5);
      this.Shape10.func_78785_a(f5);
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
