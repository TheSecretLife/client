package srcpet.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class entity6 extends entitypet {
   public entity6(World x) {
      super(x);
      this.func_70105_a(1.0F, 3.0F);
      this.func_70903_f(false);
   }

   public void func_70043_V() {
      super.func_70043_V();
      float f = MathHelper.func_76126_a(this.field_70761_aq * 3.1415927F / 180.0F);
      float f1 = MathHelper.func_76134_b(this.field_70761_aq * 3.1415927F / 180.0F);
      float f2 = 0.7F;
      float f3 = 0.0F;
      this.field_70153_n.func_70107_b(this.field_70165_t + (double)(f2 * f), this.field_70163_u + this.func_70042_X() + this.field_70153_n.func_70033_W() + (double)f3, this.field_70161_v - (double)(f2 * f1));
      if (this.field_70153_n instanceof EntityLivingBase) {
         ((EntityLivingBase)this.field_70153_n).field_70761_aq = this.field_70761_aq;
      }

   }
}
