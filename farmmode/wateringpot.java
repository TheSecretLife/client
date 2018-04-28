package farmmode;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class wateringpot extends ModelBase {
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
   ModelRenderer Shape12;
   ModelRenderer Shape13;

   public wateringpot() {
      this.field_78090_t = 64;
      this.field_78089_u = 64;
      this.Shape1 = new ModelRenderer(this, 0, 0);
      this.Shape1.func_78789_a(0.0F, 0.0F, 0.0F, 10, 12, 10);
      this.Shape1.func_78793_a(-5.0F, 12.0F, -5.0F);
      this.Shape1.func_78787_b(64, 64);
      this.Shape1.field_78809_i = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 42, 0);
      this.Shape2.func_78789_a(0.0F, 0.0F, 0.0F, 4, 10, 4);
      this.Shape2.func_78793_a(-2.0F, 15.0F, -12.0F);
      this.Shape2.func_78787_b(64, 64);
      this.Shape2.field_78809_i = true;
      this.setRotation(this.Shape2, 0.7853982F, 0.0F, 0.0F);
      this.Shape3 = new ModelRenderer(this, 0, 24);
      this.Shape3.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 4);
      this.Shape3.func_78793_a(-1.0F, 14.0F, 5.0F);
      this.Shape3.func_78787_b(64, 64);
      this.Shape3.field_78809_i = true;
      this.setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
      this.Shape4 = new ModelRenderer(this, 0, 24);
      this.Shape4.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 4);
      this.Shape4.func_78793_a(-1.0F, 19.0F, 5.0F);
      this.Shape4.func_78787_b(64, 64);
      this.Shape4.field_78809_i = true;
      this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
      this.Shape5 = new ModelRenderer(this, 2, 25);
      this.Shape5.func_78789_a(0.0F, 0.0F, 0.0F, 2, 3, 2);
      this.Shape5.func_78793_a(-1.0F, 16.0F, 7.0F);
      this.Shape5.func_78787_b(64, 64);
      this.Shape5.field_78809_i = true;
      this.setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
      this.Shape6 = new ModelRenderer(this, 13, 25);
      this.Shape6.func_78789_a(0.0F, 0.0F, 0.0F, 9, 1, 1);
      this.Shape6.func_78793_a(-4.5F, 11.0F, -4.5F);
      this.Shape6.func_78787_b(64, 64);
      this.Shape6.field_78809_i = true;
      this.setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
      this.Shape7 = new ModelRenderer(this, 13, 25);
      this.Shape7.func_78789_a(0.0F, 0.0F, 0.0F, 9, 1, 1);
      this.Shape7.func_78793_a(-4.5F, 11.0F, 3.5F);
      this.Shape7.func_78787_b(64, 64);
      this.Shape7.field_78809_i = true;
      this.setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
      this.Shape8 = new ModelRenderer(this, 13, 25);
      this.Shape8.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 7);
      this.Shape8.func_78793_a(3.5F, 11.0F, -3.5F);
      this.Shape8.func_78787_b(64, 64);
      this.Shape8.field_78809_i = true;
      this.setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
      this.Shape9 = new ModelRenderer(this, 13, 25);
      this.Shape9.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 7);
      this.Shape9.func_78793_a(-4.5F, 11.0F, -3.5F);
      this.Shape9.func_78787_b(64, 64);
      this.Shape9.field_78809_i = true;
      this.setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
      this.Shape10 = new ModelRenderer(this, 13, 25);
      this.Shape10.func_78789_a(0.0F, 0.0F, 0.0F, 6, 3, 2);
      this.Shape10.func_78793_a(-3.0F, 14.0F, -14.0F);
      this.Shape10.func_78787_b(64, 64);
      this.Shape10.field_78809_i = true;
      this.setRotation(this.Shape10, 0.7853982F, 0.0F, 0.0F);
      this.Shape11 = new ModelRenderer(this, 13, 25);
      this.Shape11.func_78789_a(0.0F, 0.0F, 0.0F, 6, 3, 2);
      this.Shape11.func_78793_a(-3.0F, 11.5F, -11.5F);
      this.Shape11.func_78787_b(64, 64);
      this.Shape11.field_78809_i = true;
      this.setRotation(this.Shape11, 0.7853982F, 0.0F, 0.0F);
      this.Shape12 = new ModelRenderer(this, 13, 25);
      this.Shape12.func_78789_a(0.0F, 0.0F, 0.0F, 2, 3, 3);
      this.Shape12.func_78793_a(-3.0F, 13.5F, -13.5F);
      this.Shape12.func_78787_b(64, 64);
      this.Shape12.field_78809_i = true;
      this.setRotation(this.Shape12, 0.7853982F, 0.0F, 0.0F);
      this.Shape13 = new ModelRenderer(this, 13, 25);
      this.Shape13.func_78789_a(0.0F, 0.0F, 0.0F, 2, 3, 3);
      this.Shape13.func_78793_a(1.0F, 13.5F, -13.5F);
      this.Shape13.func_78787_b(64, 64);
      this.Shape13.field_78809_i = true;
      this.setRotation(this.Shape13, 0.7853982F, 0.0F, 0.0F);
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
      this.Shape11.func_78785_a(f5);
      this.Shape12.func_78785_a(f5);
      this.Shape13.func_78785_a(f5);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.field_78795_f = x;
      model.field_78796_g = y;
      model.field_78808_h = z;
   }

   public void setRotationAngles(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78087_a(f, f1, f2, f3, f4, f5, entity);
   }

   public void render(float f) {
      this.Shape1.func_78785_a(f);
      this.Shape2.func_78785_a(f);
      this.Shape3.func_78785_a(f);
      this.Shape4.func_78785_a(f);
      this.Shape5.func_78785_a(f);
      this.Shape6.func_78785_a(f);
      this.Shape7.func_78785_a(f);
      this.Shape8.func_78785_a(f);
      this.Shape9.func_78785_a(f);
      this.Shape10.func_78785_a(f);
      this.Shape11.func_78785_a(f);
      this.Shape12.func_78785_a(f);
      this.Shape13.func_78785_a(f);
   }
}
