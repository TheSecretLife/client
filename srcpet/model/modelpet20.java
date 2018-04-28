package srcpet.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import utilities.SagaModelLoader;
import utilities.sagaobj;

public class modelpet20 extends ModelBase {
   private sagaobj model = (sagaobj)SagaModelLoader.loadModel(new ResourceLocation("cabalaccessorys:models/pet/grimreaper_hr/grimreaper_hr.saga"));

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      this.setRotationAngles(f, f1, f2, f3, f4, f5);
      float size = 0.14F;
      GL11.glDisable(2884);
      GL11.glDisable(2896);
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, -2.7F, 0.0F);
      this.model.renderAll();
      GL11.glPopMatrix();
      GL11.glEnable(2884);
      GL11.glEnable(2896);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.field_78795_f = x;
      model.field_78796_g = y;
      model.field_78808_h = z;
   }

   public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
   }
}
