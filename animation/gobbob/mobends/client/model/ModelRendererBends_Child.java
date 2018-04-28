package animation.gobbob.mobends.client.model;

import net.minecraft.client.model.ModelBase;
import org.lwjgl.opengl.GL11;

public class ModelRendererBends_Child extends ModelRendererBends {
   ModelRendererBends momModel;

   public ModelRendererBends_Child(ModelBase argModel) {
      super(argModel);
   }

   public ModelRendererBends_Child(ModelBase argModel, String argName) {
      super(argModel, argName);
   }

   public ModelRendererBends_Child(ModelBase argModel, int argTexOffsetX, int argTexOffsetY) {
      super(argModel, argTexOffsetX, argTexOffsetY);
   }

   public ModelRendererBends_Child setMother(ModelRendererBends argMom) {
      this.momModel = argMom;
      return this;
   }

   public void func_78794_c(float p_78794_1_) {
      this.updateBends(p_78794_1_);
      this.momModel.func_78794_c(p_78794_1_);
      GL11.glTranslatef(this.field_82906_o, this.field_82908_p, this.field_82907_q);
      if (this.field_78795_f == 0.0F && this.field_78796_g == 0.0F && this.field_78808_h == 0.0F) {
         if (this.field_78800_c == 0.0F && this.field_78797_d == 0.0F && this.field_78798_e == 0.0F) {
            GL11.glRotatef(-this.pre_rotation.getY(), 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(this.pre_rotation.getX(), 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(this.pre_rotation.getZ(), 0.0F, 0.0F, 1.0F);
            GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
         } else {
            GL11.glTranslatef(this.field_78800_c * p_78794_1_, this.field_78797_d * p_78794_1_, this.field_78798_e * p_78794_1_);
            GL11.glRotatef(-this.pre_rotation.getY(), 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(this.pre_rotation.getX(), 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(this.pre_rotation.getZ(), 0.0F, 0.0F, 1.0F);
            GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
            GL11.glTranslatef(-this.field_78800_c * p_78794_1_, -this.field_78797_d * p_78794_1_, -this.field_78798_e * p_78794_1_);
         }
      } else {
         GL11.glPushMatrix();
         GL11.glTranslatef(this.field_78800_c * p_78794_1_, this.field_78797_d * p_78794_1_, this.field_78798_e * p_78794_1_);
         GL11.glRotatef(-this.pre_rotation.getY(), 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.pre_rotation.getX(), 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(this.pre_rotation.getZ(), 0.0F, 0.0F, 1.0F);
         if (this.field_78808_h != 0.0F) {
            GL11.glRotatef(this.field_78808_h * 57.295776F, 0.0F, 0.0F, 1.0F);
         }

         if (this.field_78796_g != 0.0F) {
            GL11.glRotatef(this.field_78796_g * 57.295776F, 0.0F, 1.0F, 0.0F);
         }

         if (this.field_78795_f != 0.0F) {
            GL11.glRotatef(this.field_78795_f * 57.295776F, 1.0F, 0.0F, 0.0F);
         }

         GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
         GL11.glPopMatrix();
      }

   }
}
