package srcpet.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class modelpet extends ModelBase {
   ModelBase model1 = new modelpet1(0.0F);
   ModelBase model2 = new modelpet2(0.0F);
   ModelBase model3 = new modelpet3(0.0F);
   ModelBase model4 = new modelpet4(0.0F);
   ModelBase model5 = new modelpet5();
   ModelBase model6 = new modelpet6(0.0F);
   ModelBase model7 = new modelpet7();
   ModelBase model8 = new modelpet8();
   ModelBase model9 = new modelpet9(0.0F);
   ModelBase model10 = new modelpet10(0.0F);
   ModelBase model11 = new modelpet11();
   ModelBase model12 = new modelpet12(0.0F);
   ModelBase model13 = new modelpet13();
   ModelBase model14 = new modelpet14();
   ModelBase model15 = new modelpet15();
   ModelBase model16 = new modelpet16();
   ModelBase model17 = new modelpet17();
   ModelBase model18 = new modelpet18();
   ModelBase model19 = new modelpet19();
   ModelBase model20 = new modelpet20();
   ModelBase model21 = new modelpet21();
   ModelBase model22 = new modelpet22();
   ModelBase model23 = new modelpet23();
   ModelBase model24 = new modelpet24();

   public modelpet(float f1) {
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.field_78795_f = x;
      model.field_78796_g = y;
      model.field_78808_h = z;
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      if (entity.func_70096_w().func_75679_c(31) == 1) {
         this.model1.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 2) {
         this.model2.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 3) {
         this.model3.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 4) {
         this.model4.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 5) {
         this.model5.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 6) {
         this.model6.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 7) {
         this.model7.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 8) {
         this.model8.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 9) {
         this.model9.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 10) {
         this.model10.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 11) {
         this.model11.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 12) {
         this.model12.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 13) {
         this.model13.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 14) {
         this.model14.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 15) {
         this.model15.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 16) {
         this.model16.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 17) {
         this.model17.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 18) {
         this.model18.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 19) {
         this.model19.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 20) {
         this.model20.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 21) {
         this.model21.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 22) {
         this.model22.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 23) {
         this.model23.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      } else if (entity.func_70096_w().func_75679_c(31) == 24) {
         this.model24.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      }

   }

   public void func_78087_a(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
      super.func_78087_a(par1, par2, par3, par4, par5, par6, par7Entity);
   }
}
