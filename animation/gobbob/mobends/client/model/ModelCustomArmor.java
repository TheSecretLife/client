package animation.gobbob.mobends.client.model;

import animation.gobbob.mobends.client.model.entity.ModelBendsPlayer;
import animation.gobbob.mobends.util.SmoothVector3f;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelCustomArmor extends ModelBiped {
   public ModelRenderer bipedRightForeArm;
   public ModelRenderer bipedLeftForeArm;
   public ModelRenderer bipedRightForeLeg;
   public ModelRenderer bipedLeftForeLeg;
   public SmoothVector3f renderOffset;
   public SmoothVector3f renderRotation;
   public SmoothVector3f renderItemRotation;
   public float headRotationX;
   public float headRotationY;
   public float armSwing;
   public float armSwingAmount;

   public ModelCustomArmor() {
      this(0.0F);
   }

   public ModelCustomArmor(float p_i1148_1_) {
      this(p_i1148_1_, 0.0F, 64, 32);
   }

   public ModelCustomArmor(float p_i1149_1_, float p_i1149_2_, int p_i1149_3_, int p_i1149_4_) {
      this.renderOffset = new SmoothVector3f();
      this.renderRotation = new SmoothVector3f();
      this.renderItemRotation = new SmoothVector3f();
      this.field_78090_t = p_i1149_3_;
      this.field_78089_u = p_i1149_4_;
      this.field_78122_k = new ModelRendererBends(this, 0, 0);
      this.field_78122_k.func_78790_a(-5.0F, 0.0F, -1.0F, 10, 16, 1, p_i1149_1_);
      this.field_78121_j = new ModelRendererBends(this, 24, 0);
      this.field_78121_j.func_78790_a(-3.0F, -6.0F, -1.0F, 6, 6, 1, p_i1149_1_);
      this.field_78116_c = new ModelRendererBends(this, 0, 0);
      this.field_78116_c.func_78790_a(-4.0F, -8.0F, -4.0F, 8, 8, 8, p_i1149_1_);
      this.field_78116_c.func_78793_a(0.0F, 0.0F + p_i1149_2_ - 12.0F, 0.0F);
      this.field_78114_d = new ModelRendererBends(this, 32, 0);
      this.field_78114_d.func_78790_a(-4.0F, -8.0F, -4.0F, 8, 8, 8, p_i1149_1_ + 0.5F);
      this.field_78114_d.func_78793_a(0.0F, 0.0F, 0.0F);
      this.field_78115_e = (new ModelRendererBends(this, 16, 16)).setShowChildIfHidden(true);
      this.field_78115_e.func_78790_a(-4.0F, -12.0F, -2.0F, 8, 12, 4, p_i1149_1_);
      this.field_78115_e.func_78793_a(0.0F, 0.0F + p_i1149_2_ + 12.0F, 0.0F);
      this.field_78112_f = (new ModelRendererBends_SeperatedChild(this, 40, 16)).setMother((ModelRendererBends)this.field_78115_e);
      this.field_78112_f.func_78790_a(-3.0F, -2.0F, -2.0F, 4, 6, 4, p_i1149_1_);
      this.field_78112_f.func_78793_a(-5.0F, 2.0F + p_i1149_2_ - 12.0F, 0.0F);
      this.field_78113_g = (new ModelRendererBends_SeperatedChild(this, 40, 16)).setMother((ModelRendererBends)this.field_78115_e);
      this.field_78113_g.field_78809_i = true;
      this.field_78113_g.func_78790_a(-1.0F, -2.0F, -2.0F, 4, 6, 4, p_i1149_1_);
      this.field_78113_g.func_78793_a(5.0F, 2.0F + p_i1149_2_ - 12.0F, 0.0F);
      this.field_78123_h = new ModelRendererBends(this, 0, 16);
      this.field_78123_h.func_78790_a(-2.0F, 0.0F, -2.0F, 4, 6, 4, p_i1149_1_);
      this.field_78123_h.func_78793_a(-1.9F, 12.0F + p_i1149_2_, 0.0F);
      this.field_78124_i = new ModelRendererBends(this, 0, 16);
      this.field_78124_i.field_78809_i = true;
      this.field_78124_i.func_78790_a(-2.0F, 0.0F, -2.0F, 4, 6, 4, p_i1149_1_);
      this.field_78124_i.func_78793_a(1.9F, 12.0F + p_i1149_2_, 0.0F);
      this.bipedRightForeArm = new ModelRendererBends(this, 40, 22);
      this.bipedRightForeArm.func_78790_a(0.0F, 0.0F, -4.0F, 4, 6, 4, p_i1149_1_);
      this.bipedRightForeArm.func_78793_a(-3.0F, 4.0F, 2.0F);
      ((ModelRendererBends)this.bipedRightForeArm).getBox().offsetTextureQuad(this.bipedRightForeArm, 3, 0.0F, -6.0F);
      this.bipedLeftForeArm = new ModelRendererBends(this, 40, 22);
      this.bipedLeftForeArm.field_78809_i = true;
      this.bipedLeftForeArm.func_78790_a(0.0F, 0.0F, -4.0F, 4, 6, 4, p_i1149_1_);
      this.bipedLeftForeArm.func_78793_a(-1.0F, 4.0F, 2.0F);
      ((ModelRendererBends)this.bipedLeftForeArm).getBox().offsetTextureQuad(this.bipedRightForeArm, 3, 0.0F, -6.0F);
      this.bipedRightForeLeg = new ModelRendererBends(this, 0, 22);
      this.bipedRightForeLeg.func_78790_a(-2.0F, 0.0F, 0.0F, 4, 6, 4, p_i1149_1_);
      this.bipedRightForeLeg.func_78793_a(0.0F, 6.0F, -2.0F);
      ((ModelRendererBends)this.bipedRightForeLeg).getBox().offsetTextureQuad(this.bipedRightForeLeg, 3, 0.0F, -6.0F);
      this.bipedLeftForeLeg = new ModelRendererBends(this, 0, 22);
      this.bipedLeftForeLeg.field_78809_i = true;
      this.bipedLeftForeLeg.func_78790_a(-2.0F, 0.0F, 0.0F, 4, 6, 4, p_i1149_1_);
      this.bipedLeftForeLeg.func_78793_a(0.0F, 6.0F, -2.0F);
      ((ModelRendererBends)this.bipedLeftForeLeg).getBox().offsetTextureQuad(this.bipedLeftForeLeg, 3, 0.0F, -6.0F);
      this.field_78115_e.func_78792_a(this.field_78116_c);
      this.field_78115_e.func_78792_a(this.field_78112_f);
      this.field_78115_e.func_78792_a(this.field_78113_g);
      this.field_78116_c.func_78792_a(this.field_78114_d);
      this.field_78112_f.func_78792_a(this.bipedRightForeArm);
      this.field_78113_g.func_78792_a(this.bipedLeftForeArm);
      this.field_78123_h.func_78792_a(this.bipedRightForeLeg);
      this.field_78124_i.func_78792_a(this.bipedLeftForeLeg);
      ((ModelRendererBends_SeperatedChild)this.field_78112_f).setSeperatedPart((ModelRendererBends)this.bipedRightForeArm);
      ((ModelRendererBends_SeperatedChild)this.field_78113_g).setSeperatedPart((ModelRendererBends)this.bipedLeftForeArm);
   }

   public void func_78088_a(Entity argEntity, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
      this.func_78087_a(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, argEntity);
      if (this.field_78091_s) {
         float f6 = 2.0F;
         GL11.glPushMatrix();
         GL11.glScalef(1.5F / f6, 1.5F / f6, 1.5F / f6);
         GL11.glTranslatef(0.0F, 16.0F * p_78088_7_, 0.0F);
         this.field_78116_c.func_78785_a(p_78088_7_);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
         GL11.glTranslatef(0.0F, 24.0F * p_78088_7_, 0.0F);
         this.field_78115_e.func_78785_a(p_78088_7_);
         this.field_78112_f.func_78785_a(p_78088_7_);
         this.field_78113_g.func_78785_a(p_78088_7_);
         this.field_78123_h.func_78785_a(p_78088_7_);
         this.field_78124_i.func_78785_a(p_78088_7_);
         this.field_78114_d.func_78785_a(p_78088_7_);
         GL11.glPopMatrix();
      } else {
         this.field_78115_e.func_78785_a(p_78088_7_);
         this.field_78123_h.func_78785_a(p_78088_7_);
         this.field_78124_i.func_78785_a(p_78088_7_);
      }

   }

   public void func_78087_a(float argSwingTime, float argSwingAmount, float argArmSway, float argHeadY, float argHeadX, float argNr6, Entity argEntity) {
   }

   public void updateWithModelData(ModelBendsPlayer argModel) {
      if (argModel != null) {
         ((ModelRendererBends)this.field_78116_c).sync((ModelRendererBends)argModel.field_78116_c);
         ((ModelRendererBends)this.field_78114_d).sync((ModelRendererBends)argModel.field_78114_d);
         ((ModelRendererBends)this.field_78115_e).sync((ModelRendererBends)argModel.field_78115_e);
         ((ModelRendererBends)this.field_78122_k).sync((ModelRendererBends)argModel.field_78122_k);
         ((ModelRendererBends)this.field_78121_j).sync((ModelRendererBends)argModel.field_78121_j);
         ((ModelRendererBends)this.field_78113_g).sync((ModelRendererBends)argModel.field_78113_g);
         ((ModelRendererBends)this.bipedLeftForeArm).sync((ModelRendererBends)argModel.bipedLeftForeArm);
         ((ModelRendererBends)this.bipedLeftForeLeg).sync((ModelRendererBends)argModel.bipedLeftForeLeg);
         ((ModelRendererBends)this.field_78124_i).sync((ModelRendererBends)argModel.field_78124_i);
         ((ModelRendererBends)this.field_78112_f).sync((ModelRendererBends)argModel.field_78112_f);
         ((ModelRendererBends)this.bipedRightForeArm).sync((ModelRendererBends)argModel.bipedRightForeArm);
         ((ModelRendererBends)this.bipedRightForeLeg).sync((ModelRendererBends)argModel.bipedRightForeLeg);
         ((ModelRendererBends)this.field_78123_h).sync((ModelRendererBends)argModel.field_78123_h);
      }

   }
}
