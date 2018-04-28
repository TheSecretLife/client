package animation.gobbob.mobends.animation.player;

import animation.gobbob.mobends.animation.Animation;
import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsPlayer;
import animation.gobbob.mobends.data.Data_Player;
import animation.gobbob.mobends.data.EntityData;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;

public class Animation_Riding extends Animation {
   public String getName() {
      return "riding";
   }

   public void animate(EntityLivingBase argEntity, ModelBase argModel, EntityData argData) {
      ModelBendsPlayer model = (ModelBendsPlayer)argModel;
      Data_Player data = (Data_Player)argData;
      EntityPlayer player = (EntityPlayer)argEntity;
      model.renderOffset.setSmoothY(1.5F, 0.3F);
      ((ModelRendererBends)model.field_78115_e).rotation.setSmoothY(0.0F, 0.3F);
      ((ModelRendererBends)model.field_78115_e).rotation.setSmoothZ(0.0F, 0.3F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(-85.0F, 0.3F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothY(45.0F, 0.3F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(-85.0F, 0.3F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothY(-45.0F, 0.3F);
      ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX(60.0F);
      ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX(60.0F);
      if (argData.motion.x == 0.0F & argData.motion.z == 0.0F) {
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(-10.0F, 0.3F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-10.0F, 0.3F);
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothY(-10.0F, 0.3F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothY(10.0F, 0.3F);
         ((ModelRendererBends)model.field_78115_e).rotation.setSmoothX(0.0F, 0.3F);
         ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothX(-20.0F, 0.3F);
         ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-20.0F, 0.3F);
      } else {
         float jiggle = MathHelper.func_76134_b((float)player.field_70173_aa * 0.6F) * model.armSwingAmount;
         float jiggle_hard = MathHelper.func_76134_b((float)player.field_70173_aa * 0.3F) * model.armSwingAmount;
         if (jiggle_hard < 0.0F) {
            jiggle_hard = -jiggle_hard;
         }

         model.renderOffset.setSmoothY(1.5F + jiggle_hard * 20.0F, 0.7F);
         ((ModelRendererBends)model.field_78115_e).rotation.setSmoothX(40.0F + jiggle * 300.0F, 0.3F);
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(-45.0F, 0.3F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-45.0F, 0.3F);
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothY(-10.0F, 0.3F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothY(10.0F, 0.3F);
         ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothX(-30.0F, 0.3F);
         ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-30.0F, 0.3F);
      }

      ((ModelRendererBends)model.field_78116_c).rotation.setSmoothY(model.headRotationY, 0.3F);
      ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX - model.field_78115_e.field_78795_f / 3.1415927F * 180.0F, 0.3F);
   }
}
