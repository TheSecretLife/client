package animation.gobbob.mobends.animation.player;

import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsPlayer;
import animation.gobbob.mobends.data.Data_Player;
import cabalaccessorys.data.PlayerData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.util.vector.Vector3f;

public class Animation_Attack_Stance {
   public static void animate(EntityPlayer player, ModelBendsPlayer model, Data_Player data) {
      if (data.isOnGround()) {
         if (data.motion.x == 0.0F & data.motion.z == 0.0F) {
            model.renderRotation.setSmoothY(30.0F, 0.3F);
            Vector3f bodyRot = new Vector3f(0.0F, 0.0F, 0.0F);
            bodyRot.x = 20.0F;
            ((ModelRendererBends)model.field_78115_e).rotation.setSmooth(bodyRot, 0.3F);
            ((ModelRendererBends)model.field_78116_c).rotation.setSmoothY(model.headRotationY - 30.0F);
            ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX);
            ((ModelRendererBends)model.field_78116_c).pre_rotation.setSmoothX(-bodyRot.x, 0.3F);
            ((ModelRendererBends)model.field_78116_c).pre_rotation.setSmoothY(-bodyRot.y, 0.3F);
            ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(-30.0F, 0.3F);
            ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(-30.0F, 0.3F);
            ((ModelRendererBends)model.field_78124_i).rotation.setSmoothY(-25.0F, 0.3F);
            ((ModelRendererBends)model.field_78123_h).rotation.setSmoothZ(10.0F);
            ((ModelRendererBends)model.field_78124_i).rotation.setSmoothZ(-10.0F);
            ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX(30.0F, 0.3F);
            ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX(30.0F, 0.3F);
            ((ModelRendererBends)model.field_78112_f).pre_rotation.setSmoothZ(60.0F, 0.3F);
            ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(60.0F, 0.3F);
            ((ModelRendererBends)model.field_78113_g).rotation.setSmoothZ(20.0F, 0.3F);
            ((ModelRendererBends)model.field_78113_g).pre_rotation.setSmoothZ(-80.0F, 0.3F);
            ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothX(-20.0F, 0.3F);
            ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-60.0F, 0.3F);
            model.renderItemRotation.setSmoothX(65.0F, 0.3F);
            model.renderOffset.setSmoothY(-2.0F);
         } else if (player.func_70051_ag()) {
            ((ModelRendererBends)model.field_78115_e).rotation.setSmoothY(20.0F, 0.3F);
            ((ModelRendererBends)model.field_78116_c).rotation.setSmoothY(model.headRotationY - 20.0F);
            ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX - 15.0F);
            ((ModelRendererBends)model.field_78123_h).rotation.setSmoothY(0.0F);
            ((ModelRendererBends)model.field_78124_i).rotation.setSmoothY(0.0F);
            ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(60.0F, 0.3F);
            model.renderItemRotation.setSmoothX(90.0F, 0.3F);
         }

         PlayerData ex = PlayerData.get(player);
         ItemStack umb = ex.ei.func_70301_a(4);
         if (umb != null) {
            ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-25.0F, 0.5F);
            ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-30.0F, 0.5F);
         }
      }

   }
}
