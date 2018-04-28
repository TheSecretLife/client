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

public class Animation_Mining extends Animation {
   public String getName() {
      return "mining";
   }

   public void animate(EntityLivingBase argEntity, ModelBase argModel, EntityData argData) {
      ModelBendsPlayer model = (ModelBendsPlayer)argModel;
      Data_Player data = (Data_Player)argData;
      EntityPlayer player = (EntityPlayer)argEntity;
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothZ(10.0F, 0.3F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothZ(-10.0F, 0.3F);
      model.renderOffset.setSmoothY(-1.5F, 0.3F);
      if (player.field_82175_bq) {
         float speed = 1.8F;
         float progress = (float)player.field_70173_aa * speed / 20.0F % 1.0F;
         float progress2 = (float)(player.field_70173_aa - 2) * speed / 20.0F % 1.0F;
         float armSwing = (MathHelper.func_76134_b(progress * 3.1415927F * 2.0F) + 1.0F) / 2.0F * -60.0F - 30.0F + model.headRotationX * 0.5F - 30.0F;
         float armYRot = 30.0F + MathHelper.func_76134_b((armSwing - 90.0F) / 180.0F * 3.14F) * -5.0F;
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(armSwing, 0.7F);
         ((ModelRendererBends)model.field_78112_f).rotation.setSmoothY(-armYRot, 0.7F);
         model.renderItemRotation.setSmoothZ(-30.0F, 0.3F);
         ((ModelRendererBends)model.field_78115_e).rotation.setSmoothY(MathHelper.func_76126_a(progress2 * 3.1415927F * 2.0F) * -20.0F);
         ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX - model.field_78115_e.field_78795_f);
         ((ModelRendererBends)model.field_78116_c).rotation.setSmoothY(model.headRotationY - model.field_78115_e.field_78796_g);
      }

   }
}
