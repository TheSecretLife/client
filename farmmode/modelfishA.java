package farmmode;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class modelfishA extends ModelBase {
   public ModelRenderer head;
   public ModelRenderer body;
   public ModelRenderer tail_1;
   public ModelRenderer tail_2;
   public ModelRenderer fin_right;
   public ModelRenderer fin_left;
   private float direction;
   ModelRenderer dorsalfin;
   ModelRenderer mouth_top;
   ModelRenderer mouth_bot;
   ModelRenderer tail;
   ModelRenderer left_whisker;
   ModelRenderer right_whisker;
   ModelRenderer tail2;
   ModelRenderer right_gill;
   ModelRenderer left_gill;
   ModelRenderer fin_left2;
   ModelRenderer fin_right2;
   ModelRenderer tail_spike;

   public modelfishA() {
      float scale = 0.0F;
      this.head = new ModelRenderer(this, 0, 0);
      this.head.func_78790_a(-4.0F, -4.0F, -8.0F, 4, 5, 4, scale);
      this.head.func_78793_a(-0.5F, 16.5F, -3.0F);
      this.body = new ModelRenderer(this, 0, 10);
      this.body.func_78790_a(-5.0F, -10.0F, -7.0F, 5, 9, 6, scale);
      this.body.func_78793_a(0.0F, 11.0F, 2.0F);
      this.body.field_78795_f = 1.5708F;
      this.tail_1 = new ModelRenderer(this, 50, 0);
      this.tail_1.func_78790_a(-0.5F, -8.0F, 4.0F, 0, 8, 6, scale);
      this.tail_1.func_78793_a(-2.0F, 13.0F, 2.5F);
      this.tail_1.field_78796_g = -0.34907F;
      this.tail = new ModelRenderer(this, 17, 0);
      this.tail.func_78790_a(-2.0F, -2.5F, 0.0F, 4, 5, 4, scale);
      this.tail.func_78793_a(-2.5F, 15.0F, 0.5F);
      this.tail_2 = new ModelRenderer(this, 35, 0);
      this.tail_2.func_78790_a(-0.5F, 2.0F, 3.0F, 0, 8, 6, scale);
      this.tail_2.func_78793_a(-2.0F, 15.0F, 2.5F);
      this.tail_2.field_78795_f = 0.34907F;
      this.dorsalfin = new ModelRenderer(this, 44, 17);
      this.dorsalfin.func_78790_a(-0.0F, 0.0F, 0.0F, 0, 6, 9, scale);
      this.dorsalfin.func_78793_a(-2.5F, 6.5F, -5.0F);
      this.dorsalfin.field_78795_f = -0.20944F;
      this.fin_right = new ModelRenderer(this, 22, 28);
      this.fin_right.func_78790_a(-7.0F, 0.0F, 0.0F, 6, 1, 3, scale);
      this.fin_right.func_78793_a(-4.0F, 16.5F, -7.0F);
      this.fin_right.field_78795_f = 0.22689F;
      this.fin_right.field_78808_h = -0.38397F;
      this.fin_left = new ModelRenderer(this, 22, 24);
      this.fin_left.func_78790_a(0.0F, 0.0F, 0.0F, 6, 1, 3, scale);
      this.fin_left.func_78793_a(0.0F, 16.5F, -7.0F);
      this.fin_left.field_78795_f = 0.22689F;
      this.fin_left.field_78808_h = 0.38397F;
      this.mouth_top = new ModelRenderer(this, 0, 27);
      this.mouth_top.func_78790_a(-4.0F, -4.0F, -8.0F, 3, 3, 2, scale);
      this.mouth_top.func_78793_a(0.0F, 21.0F, -7.5F);
      this.mouth_top.field_78795_f = -0.69813F;
      this.mouth_bot = new ModelRenderer(this, 11, 28);
      this.mouth_bot.func_78790_a(-4.0F, -4.0F, -6.0F, 2, 2, 2, scale);
      this.mouth_bot.func_78793_a(0.5F, 21.0F, -8.5F);
      this.mouth_bot.field_78795_f = -0.48869F;
      this.tail2 = new ModelRenderer(this, 30, 15);
      this.tail2.func_78790_a(-1.5F, -2.0F, 1.5F, 3, 4, 4, scale);
      this.tail2.func_78793_a(-2.5F, 15.0F, 2.5F);
      this.right_gill = new ModelRenderer(this, 23, 16);
      this.right_gill.func_78790_a(-0.5F, -1.5F, 0.0F, 1, 3, 2, scale);
      this.right_gill.func_78793_a(-5.0F, 15.0F, -7.5F);
      this.left_gill = new ModelRenderer(this, 23, 16);
      this.left_gill.func_78790_a(-0.5F, -1.5F, 0.0F, 1, 3, 2, scale);
      this.left_gill.func_78793_a(0.0F, 15.0F, -6.5F);
      this.left_whisker = new ModelRenderer(this, 16, 10);
      this.left_whisker.func_78790_a(0.0F, 0.0F, 0.0F, 3, 1, 0, scale);
      this.left_whisker.func_78793_a(-1.0F, 15.0F, -12.0F);
      this.left_whisker.field_78796_g = -0.92502F;
      this.right_whisker = new ModelRenderer(this, 16, 10);
      this.right_whisker.func_78790_a(-3.0F, 0.0F, 0.0F, 3, 1, 0, scale);
      this.right_whisker.func_78793_a(-3.8F, 15.0F, -12.0F);
      this.right_whisker.field_78796_g = 0.92502F;
      this.fin_left2 = new ModelRenderer(this, 22, 24);
      this.fin_left2.func_78790_a(0.0F, 0.0F, -1.0F, 6, 1, 3, scale);
      this.fin_left2.func_78793_a(-2.0F, 16.0F, -1.0F);
      this.fin_left2.field_78795_f = 0.22689F;
      this.fin_left2.field_78808_h = 0.34907F;
      this.fin_right2 = new ModelRenderer(this, 22, 28);
      this.fin_right2.func_78790_a(-6.0F, 0.0F, -1.0F, 6, 1, 3, scale);
      this.fin_right2.func_78793_a(-3.0F, 16.0F, -1.0F);
      this.fin_right2.field_78795_f = 0.22689F;
      this.fin_right2.field_78808_h = -0.34907F;
      this.tail_spike = new ModelRenderer(this, 16, 13);
      this.tail_spike.func_78790_a(0.0F, 0.0F, -0.5F, 4, 1, 0, scale);
      this.tail_spike.func_78793_a(-3.0F, 9.0F, 3.0F);
      this.tail_spike.field_78795_f = -1.5708F;
      this.tail_spike.field_78796_g = -1.5708F;
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f1, f2, f3, f4, f5, f);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      if (entity instanceof entitywater) {
         entitywater fish = (entitywater)entity;
         if (fish.func_70096_w().func_75679_c(22) != 0) {
            GL11.glPushMatrix();
            GL11.glScalef(0.3F, 0.3F, 0.3F);
            GL11.glTranslatef(0.0F, 3.7F, 0.0F);
            GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
            this.head.func_78785_a(f5);
            this.body.func_78785_a(f5);
            this.tail_1.func_78785_a(f5);
            this.tail_2.func_78785_a(f5);
            this.fin_right.func_78785_a(f5);
            this.fin_left.func_78785_a(f5);
            this.mouth_top.func_78785_a(f5);
            this.mouth_bot.func_78785_a(f5);
            this.dorsalfin.func_78785_a(f5);
            this.tail.func_78785_a(f5);
            this.right_whisker.func_78785_a(f5);
            this.left_whisker.func_78785_a(f5);
            this.tail2.func_78785_a(f5);
            this.right_gill.func_78785_a(f5);
            this.left_gill.func_78785_a(f5);
            this.fin_left2.func_78785_a(f5);
            this.fin_right2.func_78785_a(f5);
            this.tail_spike.func_78785_a(f5);
            GL11.glPopMatrix();
         } else {
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 0.3F, 0.0F);
            this.head.func_78785_a(f5);
            this.body.func_78785_a(f5);
            this.tail_1.func_78785_a(f5);
            this.tail_2.func_78785_a(f5);
            this.fin_right.func_78785_a(f5);
            this.fin_left.func_78785_a(f5);
            this.mouth_top.func_78785_a(f5);
            this.mouth_bot.func_78785_a(f5);
            this.dorsalfin.func_78785_a(f5);
            this.tail.func_78785_a(f5);
            this.right_whisker.func_78785_a(f5);
            this.left_whisker.func_78785_a(f5);
            this.tail2.func_78785_a(f5);
            this.right_gill.func_78785_a(f5);
            this.left_gill.func_78785_a(f5);
            this.fin_left2.func_78785_a(f5);
            this.fin_right2.func_78785_a(f5);
            this.tail_spike.func_78785_a(f5);
            GL11.glPopMatrix();
         }
      }

   }

   public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
      this.direction = 0.5F * MathHelper.func_76134_b(f2 * 0.4F) + 0.6F;
      this.tail2.field_78796_g = -0.67F + this.direction;
      this.tail_1.field_78796_g = -0.7F + this.direction * 1.1F;
      this.fin_left.field_78808_h = -0.17453F + this.direction * 0.5F;
      this.left_whisker.field_78808_h = this.direction * 0.25F;
      this.tail_2.field_78796_g = this.tail_1.field_78796_g;
      this.fin_right.field_78808_h = this.fin_left.field_78808_h * -1.0F;
      this.right_whisker.field_78808_h = this.left_whisker.field_78808_h * -1.0F;
      this.left_gill.field_78796_g = this.direction * 0.4F;
      this.right_gill.field_78796_g = this.left_gill.field_78796_g * -1.0F;
      this.tail.field_78796_g = -0.3927F + this.direction * 0.5F;
      this.fin_left2.field_78796_g = this.fin_left.field_78808_h;
      this.fin_right2.field_78796_g = this.fin_left2.field_78796_g * -1.0F;
      this.tail_spike.field_78796_g = -1.74533F + this.direction * 0.2F;
   }
}
