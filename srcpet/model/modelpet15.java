package srcpet.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class modelpet15 extends ModelBase {
   ModelRenderer Head;
   ModelRenderer HeadRed;
   ModelRenderer Body;
   ModelRenderer BodyRed;
   ModelRenderer LeftShoulder;
   ModelRenderer LeftArm;
   ModelRenderer LeftArmRingA;
   ModelRenderer LeftArmRingB;
   ModelRenderer RightShoulder;
   ModelRenderer RightArm;
   ModelRenderer RightArmRingA;
   ModelRenderer RightArmRingB;
   ModelRenderer RightLeg;
   ModelRenderer RightFoot;
   ModelRenderer LeftLeg;
   ModelRenderer LeftFoot;
   private float radianF = 57.29578F;

   public modelpet15() {
      this.field_78090_t = 64;
      this.field_78089_u = 64;
      this.Head = new ModelRenderer(this, 30, 0);
      this.Head.func_78789_a(-3.0F, -3.0F, -3.0F, 6, 3, 6);
      this.Head.func_78793_a(0.0F, 8.0F, 0.0F);
      this.setRotation(this.Head, 0.0F, -0.7853982F, 0.0F);
      this.HeadRed = new ModelRenderer(this, 30, 29);
      this.HeadRed.func_78789_a(-3.0F, -3.0F, -3.0F, 6, 3, 6);
      this.HeadRed.func_78793_a(0.0F, 8.0F, 0.0F);
      this.setRotation(this.HeadRed, 0.0F, -0.7853982F, 0.0F);
      this.Body = new ModelRenderer(this, 0, 0);
      this.Body.func_78789_a(-5.0F, -10.0F, -5.0F, 10, 10, 10);
      this.Body.func_78793_a(0.0F, 18.0F, 0.0F);
      this.BodyRed = new ModelRenderer(this, 0, 28);
      this.BodyRed.func_78789_a(-5.0F, -10.0F, -5.0F, 10, 10, 10);
      this.BodyRed.func_78793_a(0.0F, 18.0F, 0.0F);
      this.LeftShoulder = new ModelRenderer(this, 0, 4);
      this.LeftShoulder.func_78789_a(0.0F, -1.0F, -1.0F, 1, 2, 2);
      this.LeftShoulder.func_78793_a(5.0F, 11.0F, 0.0F);
      this.LeftArm = new ModelRenderer(this, 0, 48);
      this.LeftArm.func_78789_a(1.0F, -2.0F, -2.0F, 4, 12, 4);
      this.LeftArm.func_78793_a(5.0F, 11.0F, 0.0F);
      this.LeftArmRingA = new ModelRenderer(this, 20, 20);
      this.LeftArmRingA.func_78789_a(0.5F, 1.0F, -2.5F, 5, 3, 5);
      this.LeftArmRingA.func_78793_a(5.0F, 11.0F, 0.0F);
      this.LeftArmRingB = new ModelRenderer(this, 20, 20);
      this.LeftArmRingB.func_78789_a(0.5F, 5.0F, -2.5F, 5, 3, 5);
      this.LeftArmRingB.func_78793_a(5.0F, 11.0F, 0.0F);
      this.RightShoulder = new ModelRenderer(this, 0, 0);
      this.RightShoulder.func_78789_a(-1.0F, -1.0F, -1.0F, 1, 2, 2);
      this.RightShoulder.func_78793_a(-5.0F, 11.0F, 0.0F);
      this.RightArm = new ModelRenderer(this, 16, 48);
      this.RightArm.func_78789_a(-5.0F, -2.0F, -2.0F, 4, 12, 4);
      this.RightArm.func_78793_a(-5.0F, 11.0F, 0.0F);
      this.RightArmRingA = new ModelRenderer(this, 0, 20);
      this.RightArmRingA.func_78789_a(-5.5F, 1.0F, -2.5F, 5, 3, 5);
      this.RightArmRingA.func_78793_a(-5.0F, 11.0F, 0.0F);
      this.RightArmRingB = new ModelRenderer(this, 0, 20);
      this.RightArmRingB.func_78789_a(-5.5F, 5.0F, -2.5F, 5, 3, 5);
      this.RightArmRingB.func_78793_a(-5.0F, 11.0F, 0.0F);
      this.RightLeg = new ModelRenderer(this, 40, 9);
      this.RightLeg.func_78789_a(-2.5F, 0.0F, -2.0F, 4, 6, 4);
      this.RightLeg.func_78793_a(-2.0F, 18.0F, 0.0F);
      this.RightFoot = new ModelRenderer(this, 15, 22);
      this.RightFoot.func_78789_a(-2.5F, 5.0F, -3.0F, 4, 1, 1);
      this.RightFoot.func_78793_a(-2.0F, 18.0F, 0.0F);
      this.LeftLeg = new ModelRenderer(this, 40, 19);
      this.LeftLeg.func_78789_a(-1.5F, 0.0F, -2.0F, 4, 6, 4);
      this.LeftLeg.func_78793_a(2.0F, 18.0F, 0.0F);
      this.LeftFoot = new ModelRenderer(this, 15, 20);
      this.LeftFoot.func_78789_a(-1.5F, 5.0F, -3.0F, 4, 1, 1);
      this.LeftFoot.func_78793_a(2.0F, 18.0F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.setRotationAngles(f, f1, f2, f3, f4, f5);
      this.Head.func_78785_a(f5);
      this.Body.func_78785_a(f5);
      this.LeftShoulder.func_78785_a(f5);
      this.LeftArm.func_78785_a(f5);
      this.LeftArmRingA.func_78785_a(f5);
      this.LeftArmRingB.func_78785_a(f5);
      this.RightShoulder.func_78785_a(f5);
      this.RightArm.func_78785_a(f5);
      this.RightArmRingA.func_78785_a(f5);
      this.RightArmRingB.func_78785_a(f5);
      this.RightLeg.func_78785_a(f5);
      this.RightFoot.func_78785_a(f5);
      this.LeftLeg.func_78785_a(f5);
      this.LeftFoot.func_78785_a(f5);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.field_78795_f = x;
      model.field_78796_g = y;
      model.field_78808_h = z;
   }

   public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
      float hRotY = f3 / 57.29578F;
      float RLegXRot = MathHelper.func_76134_b(f * 0.6662F + 3.141593F) * 0.8F * f1;
      float LLegXRot = MathHelper.func_76134_b(f * 0.6662F) * 0.8F * f1;
      this.RightLeg.field_78795_f = RLegXRot;
      this.RightFoot.field_78795_f = RLegXRot;
      this.LeftLeg.field_78795_f = LLegXRot;
      this.LeftFoot.field_78795_f = LLegXRot;
      this.Head.field_78796_g = -0.7853982F + hRotY;
      this.HeadRed.field_78796_g = -0.7853982F + hRotY;
      this.LeftShoulder.field_78808_h = MathHelper.func_76134_b(f2 * 0.09F) * 0.05F - 0.05F;
      this.LeftShoulder.field_78795_f = RLegXRot;
      this.RightShoulder.field_78808_h = -(MathHelper.func_76134_b(f2 * 0.09F) * 0.05F) + 0.05F;
      this.RightShoulder.field_78795_f = LLegXRot;
      this.RightArm.field_78795_f = this.RightArmRingA.field_78795_f = this.RightArmRingB.field_78795_f = this.RightShoulder.field_78795_f;
      this.RightArm.field_78808_h = this.RightArmRingA.field_78808_h = this.RightArmRingB.field_78808_h = this.RightShoulder.field_78808_h;
      this.LeftArm.field_78795_f = this.LeftArmRingA.field_78795_f = this.LeftArmRingB.field_78795_f = this.LeftShoulder.field_78795_f;
      this.LeftArm.field_78808_h = this.LeftArmRingA.field_78808_h = this.LeftArmRingB.field_78808_h = this.LeftShoulder.field_78808_h;
   }
}
