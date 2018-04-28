package sp;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEntityCustomMob extends ModelBase {
   public void func_78088_a(Entity entity, float f1, float f2, float f3, float f4, float f5, float f6) {
      super.func_78088_a(entity, f1, f2, f3, f4, f5, f6);
      super.func_78087_a(f1, f2, f3, f4, f5, f6, entity);
   }

   public void func_78086_a(EntityLivingBase p_78086_1_, float p_78086_2_, float p_78086_3_, float p_78086_4_) {
      super.func_78086_a(p_78086_1_, p_78086_2_, p_78086_3_, p_78086_4_);
   }
}
