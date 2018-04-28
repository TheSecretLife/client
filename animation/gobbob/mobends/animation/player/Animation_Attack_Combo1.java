package animation.gobbob.mobends.animation.player;

import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsPlayer;
import animation.gobbob.mobends.data.Data_Player;
import animation.gobbob.mobends.util.GUtil;
import cabalaccessorys.data.PlayerData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import org.lwjgl.util.vector.Vector3f;

public class Animation_Attack_Combo1 {
   public static void animate(EntityPlayer player, ModelBendsPlayer model, Data_Player data) {
      if (data.ticksAfterPunch < 0.5F) {
         model.swordTrail.reset();
      }

      if (player.func_71045_bC() != null && player.func_71045_bC().func_77973_b() instanceof ItemSword) {
         model.swordTrail.add(model);
      }

      float attackState = data.ticksAfterPunch / 10.0F;
      float armSwing = attackState * 3.0F;
      armSwing = GUtil.max(armSwing, 1.0F);
      if (!player.func_70115_ae()) {
         model.renderRotation.setSmoothY(30.0F, 0.7F);
      }

      Vector3f bodyRot = new Vector3f(0.0F, 0.0F, 0.0F);
      bodyRot.x = 20.0F - attackState * 20.0F;
      bodyRot.y = -40.0F * attackState + 50.0F * attackState;
      ((ModelRendererBends)model.field_78115_e).rotation.setSmooth(bodyRot, 0.9F);
      ((ModelRendererBends)model.field_78116_c).rotation.setSmoothY(model.headRotationY - 30.0F);
      ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX);
      ((ModelRendererBends)model.field_78116_c).pre_rotation.setSmoothX(-bodyRot.x, 0.9F);
      ((ModelRendererBends)model.field_78116_c).pre_rotation.setSmoothY(-bodyRot.y, 0.9F);
      ((ModelRendererBends)model.field_78112_f).pre_rotation.setSmoothZ(60.0F, 0.3F);
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(-20.0F + armSwing * 100.0F, 3.0F);
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothY(0.0F, 0.3F);
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothZ(0.0F, 0.9F);
      ((ModelRendererBends)model.field_78113_g).rotation.setSmoothZ(20.0F, 0.3F);
      ((ModelRendererBends)model.field_78113_g).pre_rotation.setSmoothZ(-80.0F, 0.3F);
      ((ModelRendererBends)model.field_78113_g).rotation.setSmoothY(0.0F, 0.3F);
      ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothX(-20.0F, 0.3F);
      ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-60.0F, 0.3F);
      if (data.motion.x == 0.0F & data.motion.z == 0.0F) {
         ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(-30.0F, 0.3F);
         ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(-30.0F, 0.3F);
         ((ModelRendererBends)model.field_78124_i).rotation.setSmoothY(-25.0F, 0.3F);
         ((ModelRendererBends)model.field_78123_h).rotation.setSmoothZ(10.0F);
         ((ModelRendererBends)model.field_78124_i).rotation.setSmoothZ(-10.0F);
         ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX(30.0F, 0.3F);
         ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX(30.0F, 0.3F);
         if (!player.func_70115_ae()) {
            model.renderOffset.setSmoothY(-2.0F);
         }
      }

      model.renderItemRotation.setSmoothX(90.0F, 0.9F);
      PlayerData ex = PlayerData.get(player);
      ItemStack umb = ex.ei.func_70301_a(4);
      if (umb != null) {
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-25.0F, 0.5F);
         ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-30.0F, 0.5F);
      }

   }
}
