package farmmode;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class fish1model extends ModelBase {
   ModelRenderer Head;
   ModelRenderer LowerHead;
   ModelRenderer Nose;
   ModelRenderer MouthBottom;
   ModelRenderer MouthBottomB;
   ModelRenderer Body;
   ModelRenderer BackUp;
   ModelRenderer BackDown;
   ModelRenderer Tail;
   ModelRenderer TailFin;
   ModelRenderer RightPectoralFin;
   ModelRenderer LeftPectoralFin;
   ModelRenderer UpperFin;
   ModelRenderer LowerFin;
   ModelRenderer RightLowerFin;
   ModelRenderer LeftLowerFin;

   public fish1model(float f1) {
      this.field_78090_t = 64;
      this.field_78089_u = 32;
      this.Head = new ModelRenderer(this, 0, 10);
      this.Head.func_78789_a(-5.0F, 0.0F, -1.5F, 5, 3, 3);
      this.Head.func_78793_a(-8.0F, 6.0F, 0.0F);
      this.setRotation(this.Head, 0.0F, 0.0F, -0.446143F);
      this.LowerHead = new ModelRenderer(this, 0, 16);
      this.LowerHead.func_78789_a(-4.0F, -3.0F, -1.5F, 4, 3, 3);
      this.LowerHead.func_78793_a(-8.0F, 12.0F, 0.0F);
      this.setRotation(this.LowerHead, 0.0F, 0.0F, 0.3346075F);
      this.Nose = new ModelRenderer(this, 14, 17);
      this.Nose.func_78789_a(-1.0F, -1.0F, -1.0F, 1, 3, 2);
      this.Nose.func_78793_a(-11.0F, 8.2F, 0.0F);
      this.setRotation(this.Nose, 0.0F, 0.0F, 1.412787F);
      this.MouthBottom = new ModelRenderer(this, 16, 10);
      this.MouthBottom.func_78789_a(-2.0F, -0.4F, -1.0F, 2, 1, 2);
      this.MouthBottom.func_78793_a(-11.5F, 10.0F, 0.0F);
      this.setRotation(this.MouthBottom, 0.0F, 0.0F, 0.3346075F);
      this.MouthBottomB = new ModelRenderer(this, 16, 13);
      this.MouthBottomB.func_78789_a(-1.5F, -2.4F, -0.5F, 1, 1, 1);
      this.MouthBottomB.func_78793_a(-11.5F, 10.0F, 0.0F);
      this.setRotation(this.MouthBottomB, 0.0F, 0.0F, -0.7132579F);
      this.Body = new ModelRenderer(this, 0, 0);
      this.Body.func_78789_a(0.0F, -3.0F, -2.0F, 9, 6, 4);
      this.Body.func_78793_a(-8.0F, 9.0F, 0.0F);
      this.BackUp = new ModelRenderer(this, 26, 0);
      this.BackUp.func_78789_a(0.0F, 0.0F, -1.5F, 8, 3, 3);
      this.BackUp.func_78793_a(1.0F, 6.0F, 0.0F);
      this.setRotation(this.BackUp, 0.0F, 0.0F, 0.185893F);
      this.BackDown = new ModelRenderer(this, 26, 6);
      this.BackDown.func_78789_a(0.0F, -3.0F, -1.5F, 8, 3, 3);
      this.BackDown.func_78793_a(1.0F, 12.0F, 0.0F);
      this.setRotation(this.BackDown, 0.0F, 0.0F, -0.191986F);
      this.Tail = new ModelRenderer(this, 48, 0);
      this.Tail.func_78789_a(0.0F, -1.5F, -1.0F, 4, 3, 2);
      this.Tail.func_78793_a(8.0F, 9.0F, 0.0F);
      this.TailFin = new ModelRenderer(this, 48, 5);
      this.TailFin.func_78789_a(3.0F, -5.3F, 0.0F, 5, 11, 0);
      this.TailFin.func_78793_a(8.0F, 9.0F, 0.0F);
      this.RightPectoralFin = new ModelRenderer(this, 28, 12);
      this.RightPectoralFin.func_78789_a(0.0F, -2.0F, 0.0F, 5, 4, 0);
      this.RightPectoralFin.func_78793_a(-6.5F, 10.0F, 2.0F);
      this.setRotation(this.RightPectoralFin, 0.0F, -0.8726646F, 0.185895F);
      this.LeftPectoralFin = new ModelRenderer(this, 38, 12);
      this.LeftPectoralFin.func_78789_a(0.0F, -2.0F, 0.0F, 5, 4, 0);
      this.LeftPectoralFin.func_78793_a(-6.5F, 10.0F, -2.0F);
      this.setRotation(this.LeftPectoralFin, 0.0F, 0.8726646F, 0.185893F);
      this.UpperFin = new ModelRenderer(this, 0, 22);
      this.UpperFin.func_78789_a(0.0F, -4.0F, 0.0F, 15, 4, 0);
      this.UpperFin.func_78793_a(-7.0F, 6.0F, 0.0F);
      this.setRotation(this.UpperFin, 0.0F, 0.0F, 0.10472F);
      this.LowerFin = new ModelRenderer(this, 46, 20);
      this.LowerFin.func_78789_a(0.0F, 0.0F, 0.0F, 9, 4, 0);
      this.LowerFin.func_78793_a(0.0F, 12.0F, 0.0F);
      this.setRotation(this.LowerFin, 0.0F, 0.0F, -0.185893F);
      this.RightLowerFin = new ModelRenderer(this, 28, 16);
      this.RightLowerFin.func_78789_a(0.0F, 0.0F, 0.0F, 9, 4, 0);
      this.RightLowerFin.func_78793_a(-7.0F, 12.0F, 1.0F);
      this.setRotation(this.RightLowerFin, 0.5235988F, 0.0F, 0.0F);
      this.LeftLowerFin = new ModelRenderer(this, 46, 16);
      this.LeftLowerFin.func_78789_a(0.0F, 0.0F, 0.0F, 9, 4, 0);
      this.LeftLowerFin.func_78793_a(-7.0F, 12.0F, -1.0F);
      this.setRotation(this.LeftLowerFin, -0.5235988F, 0.0F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      if (entity instanceof entitywater) {
         entitywater fish = (entitywater)entity;
         if (fish.func_70096_w().func_75679_c(31) == 0) {
            if (fish.func_70096_w().func_75679_c(22) != 0) {
               GL11.glPushMatrix();
               GL11.glScalef(0.3F, 0.3F, 0.3F);
               GL11.glTranslatef(0.0F, 3.4F, 0.0F);
               GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
               this.Head.func_78785_a(f5);
               this.LowerHead.func_78785_a(f5);
               this.Nose.func_78785_a(f5);
               this.MouthBottom.func_78785_a(f5);
               this.MouthBottomB.func_78785_a(f5);
               this.Body.func_78785_a(f5);
               this.BackUp.func_78785_a(f5);
               this.BackDown.func_78785_a(f5);
               this.Tail.func_78785_a(f5);
               this.TailFin.func_78785_a(f5);
               this.RightPectoralFin.func_78785_a(f5);
               this.LeftPectoralFin.func_78785_a(f5);
               this.UpperFin.func_78785_a(f5);
               this.LowerFin.func_78785_a(f5);
               this.RightLowerFin.func_78785_a(f5);
               this.LeftLowerFin.func_78785_a(f5);
               GL11.glPopMatrix();
            } else {
               GL11.glPushMatrix();
               GL11.glTranslatef(0.0F, 0.8F, 0.0F);
               GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
               this.Head.func_78785_a(f5);
               this.LowerHead.func_78785_a(f5);
               this.Nose.func_78785_a(f5);
               this.MouthBottom.func_78785_a(f5);
               this.MouthBottomB.func_78785_a(f5);
               this.Body.func_78785_a(f5);
               this.BackUp.func_78785_a(f5);
               this.BackDown.func_78785_a(f5);
               this.Tail.func_78785_a(f5);
               this.TailFin.func_78785_a(f5);
               this.RightPectoralFin.func_78785_a(f5);
               this.LeftPectoralFin.func_78785_a(f5);
               this.UpperFin.func_78785_a(f5);
               this.LowerFin.func_78785_a(f5);
               this.RightLowerFin.func_78785_a(f5);
               this.LeftLowerFin.func_78785_a(f5);
               GL11.glPopMatrix();
            }
         } else if (fish.func_70096_w().func_75679_c(31) == 1) {
            ClientProxy.fish2.func_78088_a(entity, f, f1, f2, f3, f4, f5);
         } else if (fish.func_70096_w().func_75679_c(31) == 2) {
            ClientProxy.fish3.func_78088_a(entity, f, f1, f2, f3, f4, f5);
         } else if (fish.func_70096_w().func_75679_c(31) == 3) {
            ClientProxy.fish4.func_78088_a(entity, f, f1, f2, f3, f4, f5);
         } else if (fish.func_70096_w().func_75679_c(31) == 4) {
            ClientProxy.fish5.func_78088_a(entity, f, f1, f2, f3, f4, f5);
         } else if (fish.func_70096_w().func_75679_c(31) == 5) {
            ClientProxy.fish6.func_78088_a(entity, f, f1, f2, f3, f4, f5);
         } else if (fish.func_70096_w().func_75679_c(31) == 6) {
            ClientProxy.fish7.func_78088_a(entity, f, f1, f2, f3, f4, f5);
         }
      }

   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.field_78795_f = x;
      model.field_78796_g = y;
      model.field_78808_h = z;
   }

   public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
      float tailMov = MathHelper.func_76134_b(f2 * 0.4F) * 0.4F;
      float finMov = MathHelper.func_76134_b(f2 * 0.2F) * 0.4F;
      float mouthMov = MathHelper.func_76134_b(f2 * 0.3F) * 0.2F;
      this.Tail.field_78796_g = tailMov;
      this.TailFin.field_78796_g = tailMov;
      this.LeftPectoralFin.field_78796_g = 0.8726646F + finMov;
      this.RightPectoralFin.field_78796_g = -0.8726646F - finMov;
      this.MouthBottom.field_78808_h = 0.3346075F + mouthMov;
      this.MouthBottomB.field_78808_h = -0.7132579F + mouthMov;
   }
}
