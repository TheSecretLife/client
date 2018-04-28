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

public class Animation_Axe extends Animation {
   public String getName() {
      return "axe";
   }

   public void animate(EntityLivingBase argEntity, ModelBase argModel, EntityData argData) {
      ModelBendsPlayer model = (ModelBendsPlayer)argModel;
      Data_Player data = (Data_Player)argData;
      EntityPlayer player = (EntityPlayer)argEntity;
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothZero(0.3F);
      ((ModelRendererBends)model.field_78113_g).rotation.setSmoothZero(0.3F);
      ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothZero(0.3F);
      ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothZero(0.3F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothZ(10.0F, 0.3F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothZ(-10.0F, 0.3F);
      model.renderOffset.setSmoothY(-1.5F, 0.3F);
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothY(90.0F, 0.3F);
      ((ModelRendererBends)model.field_78112_f).pre_rotation.setSmoothY(0.0F, 0.3F);
      ((ModelRendererBends)model.field_78112_f).pre_rotation.setSmoothX(-80.0F, 0.3F);
      ((ModelRendererBends)model.field_78113_g).rotation.setSmoothY(90.0F, 0.3F);
      ((ModelRendererBends)model.field_78113_g).pre_rotation.setSmoothY(-40.0F, 0.3F);
      ((ModelRendererBends)model.field_78113_g).pre_rotation.setSmoothX(-70.0F, 0.3F);
      if (player.field_82175_bq) {
         float speed = 1.8F;
         float progress = (float)player.field_70173_aa * speed / 20.0F % 1.0F;
         float progress2 = (float)(player.field_70173_aa - 2) * speed / 20.0F % 1.0F;
         float armSwing = (MathHelper.func_76134_b(progress * 3.1415927F * 2.0F) + 1.0F) / 2.0F * 2.0F;
         if (armSwing > 1.0F) {
            armSwing = 1.0F;
         }

         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothY(90.0F, 0.3F);
         ((ModelRendererBends)model.field_78112_f).pre_rotation.setSmoothY(40.0F - 90.0F * armSwing, 0.7F);
         ((ModelRendererBends)model.field_78112_f).pre_rotation.setSmoothX(-80.0F, 0.7F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothY(90.0F, 0.3F);
         ((ModelRendererBends)model.field_78113_g).pre_rotation.setSmoothY(0.0F - 70.0F * armSwing, 0.7F);
         ((ModelRendererBends)model.field_78113_g).pre_rotation.setSmoothX(-70.0F, 0.7F);
         ((ModelRendererBends)model.field_78115_e).rotation.setSmoothY(armSwing * 20.0F);
         ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX - armSwing * 20.0F, 0.3F);
         ((ModelRendererBends)model.field_78116_c).rotation.setSmoothY(model.headRotationY - armSwing * 20.0F, 0.3F);
      }

   }
}
