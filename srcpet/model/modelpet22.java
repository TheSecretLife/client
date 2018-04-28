package srcpet.model;

import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import utilities.SagaModelLoader;
import utilities.sagaobj;

public class modelpet22 extends ModelCow {
   private sagaobj model = (sagaobj)SagaModelLoader.loadModel(new ResourceLocation("cabalaccessorys:models/pet/northseaking/northseaking.saga"));

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      float size = 0.14F;
      GL11.glDisable(2884);
      GL11.glDisable(2896);
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, -5.0F, 0.0F);
      this.model.renderOnly("body");
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      GL11.glTranslatef(4.0F, -1.0F, -2.0F);
      this.rotationpart(this.field_78149_c);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      this.model.renderOnly("leftarm");
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      GL11.glTranslatef(-3.6F, -1.0F, -2.0F);
      this.rotationpart(this.field_78146_d);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      this.model.renderOnly("rightarm");
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      GL11.glTranslatef(-1.0F, 5.0F, 1.0F);
      this.rotationpart(this.field_78147_e);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      this.model.renderOnly("rightleg");
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      GL11.glTranslatef(1.0F, 5.0F, 1.0F);
      this.rotationpart(this.field_78144_f);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      this.model.renderOnly("leftleg");
      GL11.glPopMatrix();
      GL11.glEnable(2884);
      GL11.glEnable(2896);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.field_78795_f = x;
      model.field_78796_g = y;
      model.field_78808_h = z;
   }

   private void rotationpart(ModelRenderer part) {
      GL11.glTranslatef(part.field_78800_c * 0.0625F, part.field_78797_d * 0.0625F, part.field_78798_e * 0.0625F);
      if (part.field_78808_h != 0.0F) {
         GL11.glRotatef(part.field_78808_h * 57.295776F, 0.0F, 0.0F, 1.0F);
      }

      if (part.field_78796_g != 0.0F) {
         GL11.glRotatef(part.field_78796_g * 57.295776F, 0.0F, 1.0F, 0.0F);
      }

      if (part.field_78795_f != 0.0F) {
         GL11.glRotatef(part.field_78795_f * 57.295776F, 1.0F, 0.0F, 0.0F);
      }

   }
}
