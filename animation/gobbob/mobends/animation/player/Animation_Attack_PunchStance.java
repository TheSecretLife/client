package animation.gobbob.mobends.animation.player;

import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsPlayer;
import animation.gobbob.mobends.data.Data_Player;
import cabalaccessorys.data.PlayerData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class Animation_Attack_PunchStance {
   public static void animate(EntityPlayer player, ModelBendsPlayer model, Data_Player data) {
      if (data.motion.x == 0.0F & data.motion.z == 0.0F) {
         model.renderRotation.setSmoothY(20.0F);
         model.renderOffset.setSmoothY(-2.0F);
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(-90.0F, 0.3F);
         ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothX(-80.0F, 0.3F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-90.0F, 0.3F);
         ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-80.0F, 0.3F);
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothZ(20.0F, 0.3F);
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothZ(-20.0F, 0.3F);
         ((ModelRendererBends)model.field_78115_e).rotation.setSmoothX(10.0F, 0.3F);
         ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(-30.0F, 0.3F);
         ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(-30.0F, 0.3F);
         ((ModelRendererBends)model.field_78124_i).rotation.setSmoothY(-25.0F, 0.3F);
         ((ModelRendererBends)model.field_78123_h).rotation.setSmoothZ(10.0F);
         ((ModelRendererBends)model.field_78124_i).rotation.setSmoothZ(-10.0F);
         ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX(30.0F, 0.3F);
         ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX(30.0F, 0.3F);
         ((ModelRendererBends)model.field_78116_c).rotation.setSmoothY(model.headRotationY - 20.0F, 0.3F);
         ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX - 10.0F, 0.3F);
      }

      PlayerData ex = PlayerData.get(player);
      ItemStack umb = ex.ei.func_70301_a(4);
      if (umb != null) {
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-25.0F, 0.5F);
         ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-30.0F, 0.5F);
      }

   }
}
