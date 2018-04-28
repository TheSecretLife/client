package animation.gobbob.mobends.animation.player;

import animation.gobbob.mobends.animation.Animation;
import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsPlayer;
import animation.gobbob.mobends.data.Data_Player;
import animation.gobbob.mobends.data.EntityData;
import animation.gobbob.mobends.util.GUtil;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

public class Animation_Bow extends Animation {
   public String getName() {
      return "bow";
   }

   public void animate(EntityLivingBase argEntity, ModelBase argModel, EntityData argData) {
      ModelBendsPlayer model = (ModelBendsPlayer)argModel;
      Data_Player data = (Data_Player)argData;
      EntityPlayer player = (EntityPlayer)argEntity;
      float aimedBowDuration = 0.0F;
      if (player != null) {
         aimedBowDuration = (float)player.func_71057_bx();
      }

      if (aimedBowDuration > 15.0F) {
         aimedBowDuration = 15.0F;
      }

      float var1;
      if (aimedBowDuration < 10.0F) {
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(0.0F, 0.3F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(0.0F, 0.3F);
         ((ModelRendererBends)model.field_78115_e).rotation.setSmoothX(30.0F, 0.3F);
         ((ModelRendererBends)model.field_78115_e).rotation.setSmoothY(0.0F, 0.3F);
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothZ(0.0F);
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(-30.0F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-30.0F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothY(80.0F);
         var1 = aimedBowDuration / 10.0F;
         ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(var1 * -50.0F);
         ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX - 30.0F, 0.3F);
      } else {
         var1 = 20.0F - (aimedBowDuration - 10.0F) / 5.0F * 20.0F;
         ((ModelRendererBends)model.field_78115_e).rotation.setSmoothX(var1, 0.3F);
         float var = (aimedBowDuration - 10.0F) / 5.0F * -25.0F;
         ((ModelRendererBends)model.field_78115_e).rotation.setSmoothY(var + model.headRotationY, 0.3F);
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(-90.0F - var1, 0.3F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-30.0F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothY(80.0F);
         float var2 = aimedBowDuration / 10.0F;
         ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(var2 * -30.0F);
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothY(-var);
         float var5 = -90.0F + model.headRotationX;
         var5 = GUtil.min(var5, -120.0F);
         ((ModelRendererBends)model.field_78113_g).pre_rotation.setSmoothX(var5, 0.3F);
         ((ModelRendererBends)model.field_78112_f).pre_rotation.setSmoothX(model.headRotationX);
         ((ModelRendererBends)model.field_78116_c).rotation.setSmoothY(-var);
         ((ModelRendererBends)model.field_78116_c).pre_rotation.setSmoothX(-var1, 0.3F);
         ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX);
      }

   }
}
