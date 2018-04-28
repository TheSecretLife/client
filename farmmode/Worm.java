package farmmode;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Worm extends ModelBase {
   ModelRenderer Shape1;
   ModelRenderer Shape2;
   ModelRenderer Shape3;
   ModelRenderer Shape4;

   public Worm() {
      this.field_78090_t = 32;
      this.field_78089_u = 32;
      this.Shape1 = new ModelRenderer(this, 0, 0);
      this.Shape1.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 2);
      this.Shape1.func_78793_a(-1.0F, 22.0F, -5.0F);
      this.Shape1.func_78787_b(32, 32);
      this.Shape1.field_78809_i = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 0, 5);
      this.Shape2.func_78789_a(0.0F, 0.0F, 0.0F, 3, 3, 3);
      this.Shape2.func_78793_a(-1.5F, 21.0F, -3.0F);
      this.Shape2.func_78787_b(32, 32);
      this.Shape2.field_78809_i = true;
      this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
      this.Shape3 = new ModelRenderer(this, 0, 12);
      this.Shape3.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 2);
      this.Shape3.func_78793_a(-1.0F, 22.0F, 0.0F);
      this.Shape3.func_78787_b(32, 32);
      this.Shape3.field_78809_i = true;
      this.setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
      this.Shape4 = new ModelRenderer(this, 0, 17);
      this.Shape4.func_78789_a(0.0F, 0.0F, 0.0F, 2, 1, 2);
      this.Shape4.func_78793_a(-1.0F, 23.0F, 2.0F);
      this.Shape4.func_78787_b(32, 32);
      this.Shape4.field_78809_i = true;
      this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      this.Shape1.func_78785_a(f5);
      this.Shape2.func_78785_a(f5);
      this.Shape3.func_78785_a(f5);
      this.Shape4.func_78785_a(f5);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.field_78795_f = x;
      model.field_78796_g = y;
      model.field_78808_h = z;
   }

   public void setRotationAngles(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      this.Shape4.field_78808_h = MathHelper.func_76134_b(f2 * 1.8F) * 0.8F;
   }
}
