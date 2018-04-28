package srcpet.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class modelpet13 extends ModelBase {
   ModelRenderer body;
   ModelRenderer head;
   ModelRenderer Llag1;
   ModelRenderer Rleg1;
   ModelRenderer Lleg2;
   ModelRenderer Rleg2;
   ModelRenderer tail;
   ModelRenderer Lear;
   ModelRenderer Rear;
   ModelRenderer Shape1;

   public modelpet13() {
      this.field_78090_t = 64;
      this.field_78089_u = 32;
      this.body = new ModelRenderer(this, 28, 14);
      this.body.func_78789_a(0.0F, 0.0F, 0.0F, 8, 8, 10);
      this.body.func_78793_a(-4.0F, 11.0F, -5.0F);
      this.body.func_78787_b(64, 32);
      this.body.field_78809_i = true;
      this.setRotation(this.body, -0.0872665F, 0.0F, 0.0F);
      this.head = new ModelRenderer(this, 0, 0);
      this.head.func_78789_a(-4.5F, -4.5F, -4.5F, 9, 9, 9);
      this.head.func_78793_a(0.0F, 11.5F, -6.5F);
      this.head.func_78787_b(64, 32);
      this.head.field_78809_i = true;
      this.setRotation(this.head, 0.0698132F, 0.0F, 0.0F);
      this.Llag1 = new ModelRenderer(this, 0, 24);
      this.Llag1.func_78789_a(0.0F, 0.0F, 0.0F, 3, 5, 3);
      this.Llag1.func_78793_a(1.0F, 19.0F, -5.0F);
      this.Llag1.func_78787_b(64, 32);
      this.Llag1.field_78809_i = true;
      this.setRotation(this.Llag1, 0.0F, 0.0F, 0.0F);
      this.Rleg1 = new ModelRenderer(this, 0, 24);
      this.Rleg1.func_78789_a(0.0F, 0.0F, 0.0F, 3, 5, 3);
      this.Rleg1.func_78793_a(-4.0F, 19.0F, -5.0F);
      this.Rleg1.func_78787_b(64, 32);
      this.Rleg1.field_78809_i = true;
      this.setRotation(this.Rleg1, 0.0F, 0.0F, 0.0F);
      this.Lleg2 = new ModelRenderer(this, 0, 24);
      this.Lleg2.func_78789_a(0.0F, 0.0F, 0.0F, 3, 5, 3);
      this.Lleg2.func_78793_a(0.5F, 19.0F, 1.0F);
      this.Lleg2.func_78787_b(64, 32);
      this.Lleg2.field_78809_i = true;
      this.setRotation(this.Lleg2, 0.0F, 0.0F, 0.0F);
      this.Rleg2 = new ModelRenderer(this, 0, 24);
      this.Rleg2.func_78789_a(0.0F, 0.0F, 0.0F, 3, 5, 3);
      this.Rleg2.func_78793_a(-3.5F, 19.0F, 1.0F);
      this.Rleg2.func_78787_b(64, 32);
      this.Rleg2.field_78809_i = true;
      this.setRotation(this.Rleg2, 0.0F, 0.0F, 0.0F);
      this.tail = new ModelRenderer(this, 49, 0);
      this.tail.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 5);
      this.tail.func_78793_a(-1.0F, 14.0F, 4.8F);
      this.tail.func_78787_b(64, 32);
      this.tail.field_78809_i = true;
      this.setRotation(this.tail, -0.9599311F, 0.0F, 0.0F);
      this.Lear = new ModelRenderer(this, 13, 19);
      this.Lear.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 6);
      this.Lear.func_78793_a(3.5F, -3.5F, -2.5F);
      this.Lear.func_78787_b(64, 32);
      this.Lear.field_78809_i = true;
      this.setRotation(this.Lear, 0.0F, 0.0F, -0.3490659F);
      this.Rear = new ModelRenderer(this, 13, 19);
      this.Rear.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 6);
      this.Rear.func_78793_a(-4.5F, -3.5F, -2.5F);
      this.Rear.func_78787_b(64, 32);
      this.Rear.field_78809_i = true;
      this.setRotation(this.Rear, 0.0F, 0.0F, 0.3490659F);
      this.Shape1 = new ModelRenderer(this, 38, 0);
      this.Shape1.func_78789_a(0.0F, 0.0F, 0.0F, 3, 2, 1);
      this.Shape1.func_78793_a(-1.5F, 0.5F, -5.5F);
      this.Shape1.func_78787_b(64, 32);
      this.Shape1.field_78809_i = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
      this.head.func_78792_a(this.Lear);
      this.head.func_78792_a(this.Rear);
      this.head.func_78792_a(this.Shape1);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      GL11.glPushMatrix();
      GL11.glScalef(0.7F, 0.7F, 0.8F);
      GL11.glTranslatef(0.0F, 0.7F, 0.0F);
      this.body.func_78785_a(f5);
      this.head.func_78785_a(f5);
      this.Llag1.func_78785_a(f5);
      this.Rleg1.func_78785_a(f5);
      this.Lleg2.func_78785_a(f5);
      this.Rleg2.func_78785_a(f5);
      this.tail.func_78785_a(f5);
      GL11.glPopMatrix();
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.field_78795_f = x;
      model.field_78796_g = y;
      model.field_78808_h = z;
   }

   public void func_78087_a(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_) {
      this.head.field_78795_f = p_78087_5_ / 57.295776F;
      this.head.field_78796_g = p_78087_4_ / 57.295776F;
      this.Llag1.field_78795_f = MathHelper.func_76134_b(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
      this.Rleg1.field_78795_f = MathHelper.func_76134_b(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_;
      this.Lleg2.field_78795_f = MathHelper.func_76134_b(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_;
      this.Rleg2.field_78795_f = MathHelper.func_76134_b(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
   }
}
