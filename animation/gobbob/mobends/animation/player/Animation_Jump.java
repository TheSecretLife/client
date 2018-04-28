package animation.gobbob.mobends.animation.player;

import animation.gobbob.mobends.animation.Animation;
import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsPlayer;
import animation.gobbob.mobends.data.Data_Player;
import animation.gobbob.mobends.data.EntityData;
import cabalaccessorys.data.PlayerData;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class Animation_Jump extends Animation {
   public String getName() {
      return "jump";
   }

   public void animate(EntityLivingBase argEntity, ModelBase argModel, EntityData argData) {
      ModelBendsPlayer model = (ModelBendsPlayer)argModel;
      Data_Player data = (Data_Player)argData;
      ((ModelRendererBends)model.field_78115_e).rotation.setSmoothX(0.0F, 0.3F);
      ((ModelRendererBends)model.field_78115_e).rotation.setSmoothY(0.0F, 0.1F);
      ((ModelRendererBends)model.field_78115_e).rotation.setSmoothZ(0.0F, 0.3F);
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothZ(45.0F, 0.05F);
      ((ModelRendererBends)model.field_78113_g).rotation.setSmoothZ(-45.0F, 0.05F);
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(0.0F, 0.5F);
      ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(0.0F, 0.5F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothZ(10.0F, 0.1F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothZ(-10.0F, 0.1F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(-20.0F, 0.1F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(-20.0F, 0.1F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(-45.0F, 0.1F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(-45.0F, 0.1F);
      ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX(50.0F, 0.1F);
      ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX(50.0F, 0.1F);
      ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothX(0.0F, 0.3F);
      ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(0.0F, 0.3F);
      ((ModelRendererBends)model.field_78116_c).rotation.setSmoothY(model.headRotationY, 0.3F);
      ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX - model.field_78115_e.field_78795_f, 0.3F);
      if (data.ticksAfterLiftoff < 2.0F) {
         ((ModelRendererBends)model.field_78115_e).rotation.setSmoothX(20.0F, 2.0F);
         ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(0.0F, 2.0F);
         ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(0.0F, 2.0F);
         ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX(0.0F, 2.0F);
         ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX(0.0F, 2.0F);
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothZ(2.0F, 2.0F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothZ(-2.0F, 2.0F);
         ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothX(-20.0F, 2.0F);
         ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-20.0F, 2.0F);
      }

      if (argData.motion.x != 0.0F | argData.motion.z != 0.0F) {
         float var;
         if (argEntity.func_70051_ag()) {
            var = 0.0F;
            float bodyLean = argData.motion.y;
            if (bodyLean < -0.2F) {
               bodyLean = -0.2F;
            }

            if (bodyLean > 0.2F) {
               bodyLean = 0.2F;
            }

            bodyLean = bodyLean * -100.0F + 20.0F;
            ((ModelRendererBends)model.field_78115_e).rotation.setSmoothX(bodyLean, 0.3F);
            ((ModelRendererBends)model.field_78123_h).rotation.setSmoothZ(5.0F, 0.3F);
            ((ModelRendererBends)model.field_78124_i).rotation.setSmoothZ(-5.0F, 0.3F);
            ((ModelRendererBends)model.field_78112_f).rotation.setSmoothZ(10.0F, 0.3F);
            ((ModelRendererBends)model.field_78113_g).rotation.setSmoothZ(-10.0F, 0.3F);
            if (data.sprintJumpLeg) {
               ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(-45.0F, 0.4F);
               ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(45.0F, 0.4F);
               ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(50.0F, 0.3F);
               ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-50.0F, 0.3F);
               var = 20.0F;
            } else {
               ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(45.0F, 0.4F);
               ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(-45.0F, 0.4F);
               ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(-50.0F, 0.3F);
               ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(50.0F, 0.3F);
               var = -20.0F;
            }

            ((ModelRendererBends)model.field_78115_e).rotation.setSmoothY(var, 0.3F);
            ((ModelRendererBends)model.field_78116_c).rotation.setSmoothY(model.headRotationY - var, 0.3F);
            ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX - 20.0F, 0.3F);
            float var1 = model.field_78123_h.field_78795_f;
            ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX((float)(var1 < 0.0F ? 45 : 2), 0.3F);
            ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX((float)(var1 < 0.0F ? 2 : 45), 0.3F);
         } else {
            ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(-5.0F + 0.5F * (float)((double)(MathHelper.func_76134_b(model.armSwing * 0.6662F) * 1.4F * model.armSwingAmount) / 3.141592653589793D * 180.0D), 1.0F);
            ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(-5.0F + 0.5F * (float)((double)(MathHelper.func_76134_b(model.armSwing * 0.6662F + 3.1415927F) * 1.4F * model.armSwingAmount) / 3.141592653589793D * 180.0D), 1.0F);
            var = (float)((double)(model.armSwing * 0.6662F) / 3.141592653589793D) % 2.0F;
            ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX((float)(var > 1.0F ? 45 : 0), 0.3F);
            ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX((float)(var > 1.0F ? 0 : 45), 0.3F);
            ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX((float)(Math.cos((double)(model.armSwing * 0.6662F) + 1.5707963267948966D) + 1.0D) / 2.0F * -20.0F, 1.0F);
            ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothX((float)(Math.cos((double)(model.armSwing * 0.6662F)) + 1.0D) / 2.0F * -20.0F, 0.3F);
         }
      }

      PlayerData ex = PlayerData.get((EntityPlayer)argEntity);
      ItemStack umb = ex.ei.func_70301_a(4);
      if (umb != null) {
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-25.0F, 0.5F);
         ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-30.0F, 0.5F);
      }

   }
}
