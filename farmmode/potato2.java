package farmmode;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class potato2 extends ModelBase {
   ModelRenderer Shape1;
   ModelRenderer Shape2;
   ModelRenderer Shape4;
   ModelRenderer Shape6;
   ModelRenderer Shape7;
   ModelRenderer Shape8;
   ModelRenderer Shape9;

   public potato2() {
      this.field_78090_t = 32;
      this.field_78089_u = 32;
      this.Shape1 = new ModelRenderer(this, 0, 0);
      this.Shape1.func_78789_a(0.0F, 0.0F, 0.0F, 4, 1, 4);
      this.Shape1.func_78793_a(-3.0F, 23.0F, 0.0F);
      this.Shape1.func_78787_b(32, 32);
      this.Shape1.field_78809_i = true;
      this.setRotation(this.Shape1, 0.0F, 0.7853982F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 2, 6);
      this.Shape2.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape2.func_78793_a(-2.5F, 23.0F, 2.0F);
      this.Shape2.func_78787_b(32, 32);
      this.Shape2.field_78809_i = true;
      this.setRotation(this.Shape2, 0.0F, 0.7853982F, 0.0F);
      this.Shape4 = new ModelRenderer(this, 4, 3);
      this.Shape4.func_78789_a(0.0F, 0.0F, 0.0F, 2, 1, 1);
      this.Shape4.func_78793_a(0.0F, 23.5F, 2.0F);
      this.Shape4.func_78787_b(32, 32);
      this.Shape4.field_78809_i = true;
      this.setRotation(this.Shape4, 0.0F, 0.7853982F, 0.0F);
      this.Shape6 = new ModelRenderer(this, 2, 1);
      this.Shape6.func_78789_a(0.0F, 0.0F, 0.0F, 3, 1, 3);
      this.Shape6.func_78793_a(-2.5F, 23.5F, -1.5F);
      this.Shape6.func_78787_b(32, 32);
      this.Shape6.field_78809_i = true;
      this.setRotation(this.Shape6, 0.0F, 0.7853982F, 0.0F);
      this.Shape7 = new ModelRenderer(this, 18, 0);
      this.Shape7.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape7.func_78793_a(-0.5F, 22.0F, -0.5F);
      this.Shape7.func_78787_b(32, 32);
      this.Shape7.field_78809_i = true;
      this.setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
      this.Shape8 = new ModelRenderer(this, 0, 11);
      this.Shape8.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape8.func_78793_a(0.2F, 21.52F, -0.1F);
      this.Shape8.func_78787_b(32, 32);
      this.Shape8.field_78809_i = true;
      this.setRotation(this.Shape8, 0.0F, 0.4089647F, 0.0F);
      this.Shape9 = new ModelRenderer(this, 0, 11);
      this.Shape9.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape9.func_78793_a(-1.2F, 21.3F, -0.5F);
      this.Shape9.func_78787_b(32, 32);
      this.Shape9.field_78809_i = true;
      this.setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.Shape1.func_78785_a(f5);
      this.Shape2.func_78785_a(f5);
      this.Shape4.func_78785_a(f5);
      this.Shape6.func_78785_a(f5);
      this.Shape7.func_78785_a(f5);
      this.Shape8.func_78785_a(f5);
      this.Shape9.func_78785_a(f5);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.field_78795_f = x;
      model.field_78796_g = y;
      model.field_78808_h = z;
   }
}
