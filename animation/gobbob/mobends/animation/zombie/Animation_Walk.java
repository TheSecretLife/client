package animation.gobbob.mobends.animation.zombie;

import animation.gobbob.mobends.animation.Animation;
import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsZombie;
import animation.gobbob.mobends.data.Data_Zombie;
import animation.gobbob.mobends.data.EntityData;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.MathHelper;

public class Animation_Walk extends Animation {
   public String getName() {
      return "walk";
   }

   public void animate(EntityLivingBase argEntity, ModelBase argModel, EntityData argData) {
      EntityZombie zombie = (EntityZombie)argEntity;
      ModelBendsZombie model = (ModelBendsZombie)argModel;
      Data_Zombie data = (Data_Zombie)argData;
      model.renderOffset.setSmoothY(-3.0F);
      float var2 = 30.0F + MathHelper.func_76134_b(model.armSwing * 0.6662F * 2.0F) * 10.0F;
      ((ModelRendererBends)model.field_78115_e).rotation.setSmoothX(var2, 0.3F);
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(0.9F * (float)((double)(MathHelper.func_76134_b(model.armSwing * 0.6662F + 3.1415927F) * 2.0F * model.armSwingAmount * 0.5F) / 3.141592653589793D * 180.0D));
      ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(0.9F * (float)((double)(MathHelper.func_76134_b(model.armSwing * 0.6662F) * 2.0F * model.armSwingAmount * 0.5F) / 3.141592653589793D * 180.0D));
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothZ(5.0F, 0.3F);
      ((ModelRendererBends)model.field_78113_g).rotation.setSmoothZ(-5.0F, 0.3F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(-5.0F + 0.9F * (float)((double)(MathHelper.func_76134_b(model.armSwing * 0.6662F) * 1.4F * model.armSwingAmount) / 3.141592653589793D * 180.0D), 1.0F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(-5.0F + 0.9F * (float)((double)(MathHelper.func_76134_b(model.armSwing * 0.6662F + 3.1415927F) * 1.4F * model.armSwingAmount) / 3.141592653589793D * 180.0D), 1.0F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothY(0.0F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothY(0.0F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothZ(10.0F, 0.2F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothZ(-10.0F, 0.2F);
      float var = (float)((double)(model.armSwing * 0.6662F) / 3.141592653589793D) % 2.0F;
      ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX((float)(var > 1.0F ? 45 : 0), 0.3F);
      ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX((float)(var > 1.0F ? 0 : 45), 0.3F);
      ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX((float)(Math.cos((double)(model.armSwing * 0.6662F) + 1.5707963267948966D) + 1.0D) / 2.0F * -20.0F, 1.0F);
      ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothX((float)(Math.cos((double)(model.armSwing * 0.6662F)) + 1.0D) / 2.0F * -20.0F, 0.3F);
      float var1 = MathHelper.func_76134_b(model.armSwing * 0.6662F + 3.1415927F) / 3.1415927F * 180.0F * 0.5F;
      ((ModelRendererBends)model.field_78115_e).rotation.setSmoothY(MathHelper.func_76134_b(model.armSwing * 0.6662F + 3.1415927F) / 3.1415927F * 180.0F * 0.5F, 0.3F);
      if (data.currentWalkingState == 1) {
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(-120.0F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-120.0F);
      }

      ((ModelRendererBends)model.field_78116_c).rotation.setX(model.headRotationX - 30.0F);
      ((ModelRendererBends)model.field_78116_c).rotation.setY(model.headRotationY - var1);
   }
}
