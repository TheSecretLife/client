package animation.gobbob.mobends.animation.player;

import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsPlayer;
import animation.gobbob.mobends.data.Data_Player;
import animation.gobbob.mobends.util.GUtil;
import cabalaccessorys.data.PlayerData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.MathHelper;
import org.lwjgl.util.vector.Vector3f;

public class Animation_Attack_Combo2 {
   public static void animate(EntityPlayer player, ModelBendsPlayer model, Data_Player data) {
      if (data.ticksAfterPunch < 0.5F) {
         model.swordTrail.reset();
      }

      if (player.func_71045_bC() != null && player.func_71045_bC().func_77973_b() instanceof ItemSword) {
         model.swordTrail.add(model);
      }

      float attackState = data.ticksAfterPunch / 10.0F;
      float armSwing = attackState * 2.0F;
      armSwing = GUtil.max(armSwing, 1.0F);
      float var5 = attackState * 1.6F;
      var5 = GUtil.max(var5, 1.0F);
      float var = 50.0F + 360.0F * var5;

      float var2;
      for(var2 = 50.0F + 360.0F * var5; var2 > 360.0F; var2 -= 360.0F) {
         ;
      }

      if (var > 360.0F) {
         float bodyRot = (attackState - data.ticksPerFrame / 10.0F) * 2.0F;
         bodyRot = GUtil.max(bodyRot, 1.0F);
         model.renderRotation.vOld.y = var2;
         model.renderRotation.vFinal.y = var2;
         model.renderRotation.completion.y = 0.0F;
      } else {
         model.renderRotation.setSmoothY(var, 0.7F);
      }

      Vector3f bodyRot1 = new Vector3f(0.0F, 0.0F, 0.0F);
      bodyRot1.x = 20.0F - attackState * 20.0F;
      bodyRot1.y = -40.0F * attackState;
      ((ModelRendererBends)model.field_78115_e).rotation.setSmooth(bodyRot1, 0.9F);
      ((ModelRendererBends)model.field_78116_c).rotation.setSmoothY(model.headRotationY);
      ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX);
      ((ModelRendererBends)model.field_78116_c).pre_rotation.setSmoothX(-bodyRot1.x, 0.9F);
      ((ModelRendererBends)model.field_78116_c).pre_rotation.setSmoothY(-bodyRot1.y, 0.9F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(-30.0F, 0.3F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(-30.0F, 0.3F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothZ(10.0F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothZ(-10.0F);
      ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX(30.0F, 0.3F);
      ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX(30.0F, 0.3F);
      ((ModelRendererBends)model.field_78112_f).pre_rotation.setSmoothZ(-(-60.0F - var5 * 80.0F), 0.3F);
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(-20.0F + armSwing * 70.0F, 3.0F);
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothY(0.0F, 0.3F);
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothZ(0.0F, 0.9F);
      ((ModelRendererBends)model.field_78113_g).rotation.setSmoothZ(20.0F, 0.3F);
      ((ModelRendererBends)model.field_78113_g).pre_rotation.setSmoothZ(-80.0F, 0.3F);
      ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothX(-20.0F, 0.3F);
      ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-60.0F, 0.3F);
      model.renderItemRotation.setSmoothX(90.0F * attackState, 0.9F);
      float var61 = data.ticksAfterPunch * 5.0F;
      float var62 = data.ticksAfterPunch * 5.0F;
      var61 = (MathHelper.func_76134_b(var61 * 0.0625F) + 1.0F) / 2.0F * 20.0F;
      var62 = (MathHelper.func_76134_b(var62 * 0.0625F) + 1.0F) / 2.0F * 20.0F;
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothY(0.0F, 0.9F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothY(-25.0F, 0.9F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothZ(var61);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothZ(-var61);
      model.renderOffset.setSmoothY(-2.0F);
      PlayerData ex = PlayerData.get(player);
      ItemStack umb = ex.ei.func_70301_a(4);
      if (umb != null) {
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-25.0F, 0.5F);
         ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-30.0F, 0.5F);
      }

   }
}
