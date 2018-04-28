package animation.gobbob.mobends.client.model.entity;

import animation.gobbob.mobends.AnimatedEntity;
import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.ModelRendererBends_SeperatedChild;
import animation.gobbob.mobends.data.Data_Zombie;
import animation.gobbob.mobends.pack.BendsPack;
import animation.gobbob.mobends.pack.BendsVar;
import animation.gobbob.mobends.util.SmoothVector3f;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

@SideOnly(Side.CLIENT)
public class ModelBendsZombie extends ModelBiped {
   public ModelRenderer bipedRightForeArm;
   public ModelRenderer bipedLeftForeArm;
   public ModelRenderer bipedRightForeLeg;
   public ModelRenderer bipedLeftForeLeg;
   public SmoothVector3f renderOffset;
   public SmoothVector3f renderRotation;
   public float headRotationX;
   public float headRotationY;
   public float armSwing;
   public float armSwingAmount;

   public ModelBendsZombie() {
      this(0.0F, false);
   }

   public ModelBendsZombie(float p_i1168_1_, boolean p_i1168_2_) {
      this(p_i1168_1_, 0.0F, 64, p_i1168_2_ ? 32 : 64);
   }

   protected ModelBendsZombie(float p_i1167_1_, float p_i1167_2_, int p_i1167_3_, int p_i1167_4_) {
      this.renderOffset = new SmoothVector3f();
      this.renderRotation = new SmoothVector3f();
      this.field_78090_t = p_i1167_3_;
      this.field_78089_u = p_i1167_4_;
      this.field_78122_k = new ModelRendererBends(this, 0, 0);
      this.field_78122_k.func_78790_a(-5.0F, 0.0F, -1.0F, 10, 16, 1, p_i1167_1_);
      this.field_78121_j = new ModelRendererBends(this, 24, 0);
      this.field_78121_j.func_78790_a(-3.0F, -6.0F, -1.0F, 6, 6, 1, p_i1167_1_);
      this.field_78116_c = new ModelRendererBends(this, 0, 0);
      this.field_78116_c.func_78790_a(-4.0F, -8.0F, -4.0F, 8, 8, 8, p_i1167_1_);
      this.field_78116_c.func_78793_a(0.0F, 0.0F + p_i1167_2_ - 12.0F, 0.0F);
      this.field_78114_d = new ModelRendererBends(this, 32, 0);
      this.field_78114_d.func_78790_a(-4.0F, -8.0F, -4.0F, 8, 8, 8, p_i1167_1_ + 0.5F);
      this.field_78114_d.func_78793_a(0.0F, 0.0F, 0.0F);
      this.field_78115_e = (new ModelRendererBends(this, 16, 16)).setShowChildIfHidden(true);
      this.field_78115_e.func_78790_a(-4.0F, -12.0F, -2.0F, 8, 12, 4, p_i1167_1_);
      this.field_78115_e.func_78793_a(0.0F, 0.0F + p_i1167_2_ + 12.0F, 0.0F);
      this.field_78112_f = (new ModelRendererBends_SeperatedChild(this, 40, 16)).setMother((ModelRendererBends)this.field_78115_e);
      this.field_78112_f.func_78790_a(-3.0F, -2.0F, -2.0F, 4, 6, 4, p_i1167_1_);
      this.field_78112_f.func_78793_a(-5.0F, 2.0F + p_i1167_2_ - 12.0F, 0.0F);
      this.field_78113_g = (new ModelRendererBends_SeperatedChild(this, 40, 16)).setMother((ModelRendererBends)this.field_78115_e);
      this.field_78113_g.field_78809_i = true;
      this.field_78113_g.func_78790_a(-1.0F, -2.0F, -2.0F, 4, 6, 4, p_i1167_1_);
      this.field_78113_g.func_78793_a(5.0F, 2.0F + p_i1167_2_ - 12.0F, 0.0F);
      this.field_78123_h = new ModelRendererBends(this, 0, 16);
      this.field_78123_h.func_78790_a(-2.0F, 0.0F, -2.0F, 4, 6, 4, p_i1167_1_);
      this.field_78123_h.func_78793_a(-1.9F, 12.0F + p_i1167_2_, 0.0F);
      this.field_78124_i = new ModelRendererBends(this, 0, 16);
      this.field_78124_i.field_78809_i = true;
      this.field_78124_i.func_78790_a(-2.0F, 0.0F, -2.0F, 4, 6, 4, p_i1167_1_);
      this.field_78124_i.func_78793_a(1.9F, 12.0F + p_i1167_2_, 0.0F);
      this.bipedRightForeArm = new ModelRendererBends(this, 40, 22);
      this.bipedRightForeArm.func_78790_a(0.0F, 0.0F, -4.0F, 4, 6, 4, p_i1167_1_);
      this.bipedRightForeArm.func_78793_a(-3.0F, 4.0F, 2.0F);
      ((ModelRendererBends)this.bipedRightForeArm).getBox().offsetTextureQuad(this.bipedRightForeArm, 3, 0.0F, -6.0F);
      this.bipedLeftForeArm = new ModelRendererBends(this, 40, 22);
      this.bipedLeftForeArm.field_78809_i = true;
      this.bipedLeftForeArm.func_78790_a(0.0F, 0.0F, -4.0F, 4, 6, 4, p_i1167_1_);
      this.bipedLeftForeArm.func_78793_a(-1.0F, 4.0F, 2.0F);
      ((ModelRendererBends)this.bipedLeftForeArm).getBox().offsetTextureQuad(this.bipedRightForeArm, 3, 0.0F, -6.0F);
      this.bipedRightForeLeg = new ModelRendererBends(this, 0, 22);
      this.bipedRightForeLeg.func_78790_a(-2.0F, 0.0F, 0.0F, 4, 6, 4, p_i1167_1_);
      this.bipedRightForeLeg.func_78793_a(0.0F, 6.0F, -2.0F);
      ((ModelRendererBends)this.bipedRightForeLeg).getBox().offsetTextureQuad(this.bipedRightForeLeg, 3, 0.0F, -6.0F);
      this.bipedLeftForeLeg = new ModelRendererBends(this, 0, 22);
      this.bipedLeftForeLeg.field_78809_i = true;
      this.bipedLeftForeLeg.func_78790_a(-2.0F, 0.0F, 0.0F, 4, 6, 4, p_i1167_1_);
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
      ((ModelRendererBends)this.field_78112_f).offsetBox_Add(-0.01F, 0.0F, -0.01F).resizeBox(4.02F, 6.0F, 4.02F).updateVertices();
      ((ModelRendererBends)this.field_78113_g).offsetBox_Add(-0.01F, 0.0F, -0.01F).resizeBox(4.02F, 6.0F, 4.02F).updateVertices();
      ((ModelRendererBends)this.field_78123_h).offsetBox_Add(-0.01F, 0.0F, -0.01F).resizeBox(4.02F, 6.0F, 4.02F).updateVertices();
      ((ModelRendererBends)this.field_78124_i).offsetBox_Add(-0.01F, 0.0F, -0.01F).resizeBox(4.02F, 6.0F, 4.02F).updateVertices();
   }

   public void func_78088_a(Entity argEntity, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
      this.func_78087_a(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, argEntity);
      if (this.field_78091_s) {
         float f6 = 2.0F;
         ((ModelRendererBends)this.field_78116_c).scaleX *= 1.5F;
         ((ModelRendererBends)this.field_78116_c).scaleY *= 1.5F;
         ((ModelRendererBends)this.field_78116_c).scaleZ *= 1.5F;
         GL11.glPushMatrix();
         GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
         GL11.glTranslatef(0.0F, 24.0F * p_78088_7_, 0.0F);
         this.field_78115_e.func_78785_a(p_78088_7_);
         this.field_78123_h.func_78785_a(p_78088_7_);
         this.field_78124_i.func_78785_a(p_78088_7_);
         GL11.glPopMatrix();
      } else {
         this.field_78115_e.func_78785_a(p_78088_7_);
         this.field_78123_h.func_78785_a(p_78088_7_);
         this.field_78124_i.func_78785_a(p_78088_7_);
      }

   }

   public void func_78087_a(float argSwingTime, float argSwingAmount, float argArmSway, float argHeadY, float argHeadX, float argNr6, Entity argEntity) {
      if (Minecraft.func_71410_x().field_71441_e != null) {
         if (Minecraft.func_71410_x().field_71441_e.field_72995_K) {
            ;
         }

         Data_Zombie data = Data_Zombie.get(argEntity.func_145782_y());
         this.armSwing = argSwingTime;
         this.armSwingAmount = argSwingAmount;
         this.headRotationX = argHeadX;
         this.headRotationY = argHeadY;
         ((ModelRendererBends)this.field_78116_c).sync(data.head);
         ((ModelRendererBends)this.field_78114_d).sync(data.headwear);
         ((ModelRendererBends)this.field_78115_e).sync(data.body);
         ((ModelRendererBends)this.field_78112_f).sync(data.rightArm);
         ((ModelRendererBends)this.field_78113_g).sync(data.leftArm);
         ((ModelRendererBends)this.field_78123_h).sync(data.rightLeg);
         ((ModelRendererBends)this.field_78124_i).sync(data.leftLeg);
         ((ModelRendererBends)this.bipedRightForeArm).sync(data.rightForeArm);
         ((ModelRendererBends)this.bipedLeftForeArm).sync(data.leftForeArm);
         ((ModelRendererBends)this.bipedRightForeLeg).sync(data.rightForeLeg);
         ((ModelRendererBends)this.bipedLeftForeLeg).sync(data.leftForeLeg);
         this.renderOffset.set(data.renderOffset);
         this.renderRotation.set(data.renderRotation);
         if (Data_Zombie.get(argEntity.func_145782_y()).canBeUpdated()) {
            this.renderOffset.setSmooth(new Vector3f(0.0F, -1.0F, 0.0F), 0.5F);
            this.renderRotation.setSmooth(new Vector3f(0.0F, 0.0F, 0.0F), 0.5F);
            ((ModelRendererBends)this.field_78116_c).resetScale();
            ((ModelRendererBends)this.field_78114_d).resetScale();
            ((ModelRendererBends)this.field_78115_e).resetScale();
            ((ModelRendererBends)this.field_78112_f).resetScale();
            ((ModelRendererBends)this.field_78113_g).resetScale();
            ((ModelRendererBends)this.field_78123_h).resetScale();
            ((ModelRendererBends)this.field_78124_i).resetScale();
            ((ModelRendererBends)this.bipedRightForeArm).resetScale();
            ((ModelRendererBends)this.bipedLeftForeArm).resetScale();
            ((ModelRendererBends)this.bipedRightForeLeg).resetScale();
            ((ModelRendererBends)this.bipedLeftForeLeg).resetScale();
            BendsVar.tempData = Data_Zombie.get(argEntity.func_145782_y());
            if (Data_Zombie.get(argEntity.func_145782_y()).motion.x == 0.0F & Data_Zombie.get(argEntity.func_145782_y()).motion.z == 0.0F) {
               AnimatedEntity.getByEntity(argEntity).get("stand").animate((EntityLivingBase)argEntity, this, Data_Zombie.get(argEntity.func_145782_y()));
               BendsPack.animate(this, "zombie", "stand");
            } else {
               AnimatedEntity.getByEntity(argEntity).get("walk").animate((EntityLivingBase)argEntity, this, Data_Zombie.get(argEntity.func_145782_y()));
               BendsPack.animate(this, "zombie", "walk");
            }

            ((ModelRendererBends)this.field_78116_c).update(data.ticksPerFrame);
            ((ModelRendererBends)this.field_78114_d).update(data.ticksPerFrame);
            ((ModelRendererBends)this.field_78115_e).update(data.ticksPerFrame);
            ((ModelRendererBends)this.field_78113_g).update(data.ticksPerFrame);
            ((ModelRendererBends)this.field_78112_f).update(data.ticksPerFrame);
            ((ModelRendererBends)this.field_78124_i).update(data.ticksPerFrame);
            ((ModelRendererBends)this.field_78123_h).update(data.ticksPerFrame);
            ((ModelRendererBends)this.bipedLeftForeArm).update(data.ticksPerFrame);
            ((ModelRendererBends)this.bipedRightForeArm).update(data.ticksPerFrame);
            ((ModelRendererBends)this.bipedLeftForeLeg).update(data.ticksPerFrame);
            ((ModelRendererBends)this.bipedRightForeLeg).update(data.ticksPerFrame);
            this.renderOffset.update(data.ticksPerFrame);
            this.renderRotation.update(data.ticksPerFrame);
            data.updatedThisFrame = true;
         }

         Data_Zombie.get(argEntity.func_145782_y()).syncModelInfo(this);
      }

   }

   public void postRender(float argScale) {
      GL11.glTranslatef(this.renderOffset.vSmooth.x * argScale, this.renderOffset.vSmooth.y * argScale, this.renderOffset.vSmooth.z * argScale);
      GL11.glRotatef(-this.renderRotation.getX(), 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(-this.renderRotation.getY(), 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(this.renderRotation.getZ(), 0.0F, 0.0F, 1.0F);
   }

   public void postRenderArm(float argScale) {
      this.field_78112_f.func_78794_c(argScale);
      this.bipedRightForeArm.func_78794_c(argScale);
      GL11.glTranslatef(2.0F * argScale, 4.0F * argScale, 2.0F * argScale);
   }

   public void updateWithEntityData(AbstractClientPlayer argPlayer) {
      Data_Zombie data = Data_Zombie.get(argPlayer.func_145782_y());
      if (data != null) {
         this.renderOffset.set(data.renderOffset);
         this.renderRotation.set(data.renderRotation);
      }

   }
}
