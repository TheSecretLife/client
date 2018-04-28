package srcpet.model;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

@SideOnly(Side.CLIENT)
public class modelpet14 extends ModelBase {
   public ModelRenderer Body;
   public ModelRenderer Leg1;
   public ModelRenderer Leg2;
   public ModelRenderer Leg3;
   public ModelRenderer Leg4;
   public ModelRenderer Snout;
   public ModelRenderer Head;
   public ModelRenderer Tail;
   public ModelRenderer Ears;

   public modelpet14() {
      byte byte0 = 8;
      this.Body = new ModelRenderer(this, 0, 0);
      this.Body.func_78790_a(0.0F, 0.0F, 0.0F, 6, 6, 12, 0.0F);
      this.Body.func_78793_a(-4.0F, 10.0F, -6.0F);
      this.Head = new ModelRenderer(this, 0, 20);
      this.Head.func_78790_a(-3.0F, -3.0F, -4.0F, 6, 6, 4, 0.0F);
      this.Head.func_78793_a(-1.0F, 11.0F, -6.0F);
      this.Snout = new ModelRenderer(this, 20, 20);
      this.Snout.func_78790_a(-1.0F, 1.0F, -7.0F, 2, 2, 4, 0.0F);
      this.Snout.func_78793_a(-1.0F, 11.0F, -6.0F);
      this.Ears = new ModelRenderer(this, 50, 20);
      this.Ears.func_78790_a(-3.0F, -6.0F, -2.0F, 6, 4, 1, 0.0F);
      this.Ears.func_78793_a(-1.0F, 11.0F, -6.0F);
      this.Tail = new ModelRenderer(this, 32, 20);
      this.Tail.func_78790_a(-5.0F, -5.0F, -2.0F, 3, 3, 8, 0.0F);
      this.Tail.func_78793_a(2.5F, 15.0F, 5.0F);
      this.Tail.field_78795_f = -0.5235988F;
      this.Leg1 = new ModelRenderer(this, 0, 0);
      this.Leg1.func_78790_a(-2.0F, 0.0F, -2.0F, 3, byte0, 3, 0.0F);
      this.Leg1.func_78793_a(-2.0F, (float)(24 - byte0), 5.0F);
      this.Leg2 = new ModelRenderer(this, 0, 0);
      this.Leg2.func_78790_a(-2.0F, 0.0F, -2.0F, 3, byte0, 3, 0.0F);
      this.Leg2.func_78793_a(1.0F, (float)(24 - byte0), 5.0F);
      this.Leg3 = new ModelRenderer(this, 0, 0);
      this.Leg3.func_78790_a(-2.0F, 0.0F, -2.0F, 3, byte0, 3, 0.0F);
      this.Leg3.func_78793_a(-2.0F, (float)(24 - byte0), -4.0F);
      this.Leg4 = new ModelRenderer(this, 0, 0);
      this.Leg4.func_78790_a(-2.0F, 0.0F, -2.0F, 3, byte0, 3, 0.0F);
      this.Leg4.func_78793_a(1.0F, (float)(24 - byte0), -4.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      this.setRotationAngles(f, f1, f2, f3, f4, f5);
      this.Body.func_78785_a(f5);
      this.Leg1.func_78785_a(f5);
      this.Leg2.func_78785_a(f5);
      this.Leg3.func_78785_a(f5);
      this.Leg4.func_78785_a(f5);
      this.Head.func_78785_a(f5);
      this.Snout.func_78785_a(f5);
      this.Tail.func_78785_a(f5);
      this.Ears.func_78785_a(f5);
   }

   public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
      this.Head.field_78796_g = f3 / 57.29578F;
      this.Head.field_78795_f = f4 / 57.29578F;
      this.Snout.field_78796_g = this.Head.field_78796_g;
      this.Snout.field_78795_f = this.Head.field_78795_f;
      this.Ears.field_78796_g = this.Head.field_78796_g;
      this.Ears.field_78795_f = this.Head.field_78795_f;
      this.Leg1.field_78795_f = MathHelper.func_76134_b(f * 0.6662F) * 1.4F * f1;
      this.Leg2.field_78795_f = MathHelper.func_76134_b(f * 0.6662F + 3.141593F) * 1.4F * f1;
      this.Leg3.field_78795_f = MathHelper.func_76134_b(f * 0.6662F + 3.141593F) * 1.4F * f1;
      this.Leg4.field_78795_f = MathHelper.func_76134_b(f * 0.6662F) * 1.4F * f1;
   }
}
