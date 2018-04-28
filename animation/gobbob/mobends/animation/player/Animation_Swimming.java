package animation.gobbob.mobends.animation.player;

import animation.gobbob.mobends.animation.Animation;
import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsPlayer;
import animation.gobbob.mobends.data.Data_Player;
import animation.gobbob.mobends.data.EntityData;
import animation.gobbob.mobends.util.GUtil;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

public class Animation_Swimming extends Animation {
   public String getName() {
      return "swimming";
   }

   public void animate(EntityLivingBase argEntity, ModelBase argModel, EntityData argData) {
      ModelBendsPlayer model = (ModelBendsPlayer)argModel;
      Data_Player data = (Data_Player)argData;
      float armSway = (MathHelper.func_76134_b(data.ticks * 0.1625F) + 1.0F) / 2.0F;
      float armSway2 = (-MathHelper.func_76126_a(data.ticks * 0.1625F) + 1.0F) / 2.0F;
      float legFlap = MathHelper.func_76134_b(data.ticks * 0.4625F);
      float foreArmSway = (float)((double)(data.ticks * 0.1625F) % 6.283185307179586D) / 6.2831855F;
      float foreArmStretch = armSway * 2.0F;
      --foreArmStretch;
      foreArmStretch = GUtil.min(foreArmStretch, 0.0F);
      if (data.motion.x == 0.0F & data.motion.z == 0.0F) {
         armSway = (MathHelper.func_76134_b(data.ticks * 0.0825F) + 1.0F) / 2.0F;
         armSway2 = (-MathHelper.func_76126_a(data.ticks * 0.0825F) + 1.0F) / 2.0F;
         legFlap = MathHelper.func_76134_b(data.ticks * 0.2625F);
         ((ModelRendererBends)model.field_78116_c).pre_rotation.setSmoothX(0.0F, 0.3F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(armSway2 * 30.0F - 15.0F, 0.3F);
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(armSway2 * 30.0F - 15.0F, 0.3F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothZ(-armSway * 30.0F);
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothZ(armSway * 30.0F);
         ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(armSway2 * -40.0F, 0.3F);
         ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothX(armSway2 * -40.0F, 0.3F);
         ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(legFlap * 40.0F, 0.3F);
         ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(-legFlap * 40.0F, 0.3F);
         ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX(5.0F, 0.4F);
         ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX(5.0F, 0.4F);
         ((ModelRendererBends)model.field_78115_e).rotation.setSmoothX(armSway * 10.0F);
         ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX);
         ((ModelRendererBends)model.field_78116_c).rotation.setSmoothY(model.headRotationY);
      } else {
         ((ModelRendererBends)model.field_78116_c).pre_rotation.setSmoothX(-70.0F - armSway * -20.0F, 0.3F);
         model.renderRotation.setSmoothX(70.0F, 0.3F);
         model.renderOffset.setSmoothZ(10.0F, 0.3F);
         ((ModelRendererBends)model.field_78113_g).pre_rotation.setSmoothY(90.0F, 0.3F);
         ((ModelRendererBends)model.field_78112_f).pre_rotation.setSmoothY(-90.0F, 0.3F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(armSway * -120.0F - 45.0F, 0.3F);
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(armSway * -120.0F - 45.0F, 0.3F);
         ((ModelRendererBends)model.field_78113_g).pre_rotation.setSmoothZ(armSway * -20.0F);
         ((ModelRendererBends)model.field_78112_f).pre_rotation.setSmoothZ(-(armSway * -20.0F));
         ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(foreArmSway < 0.55F | (double)foreArmSway > 0.9D ? foreArmStretch * -60.0F : -60.0F, 0.3F);
         ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothX(foreArmSway < 0.55F | (double)foreArmSway > 0.9D ? foreArmStretch * -60.0F : -60.0F, 0.3F);
         ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(legFlap * 40.0F, 0.3F);
         ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(-legFlap * 40.0F, 0.3F);
         ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX(5.0F, 0.4F);
         ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX(5.0F, 0.4F);
         ((ModelRendererBends)model.field_78115_e).rotation.setSmoothX(armSway * -20.0F);
         ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX);
         ((ModelRendererBends)model.field_78116_c).rotation.setSmoothY(model.headRotationY);
         model.renderItemRotation.setSmoothX(armSway * 120.0F, 0.3F);
      }

   }
}
