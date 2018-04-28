package animation.gobbob.mobends.animation.player;

import animation.gobbob.mobends.animation.Animation;
import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsPlayer;
import animation.gobbob.mobends.data.EntityData;
import cabalaccessorys.data.PlayerData;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class Animation_Sneak extends Animation {
   public String getName() {
      return "sneak";
   }

   public void animate(EntityLivingBase argEntity, ModelBase argModel, EntityData argData) {
      ModelBendsPlayer model = (ModelBendsPlayer)argModel;
      float var = (float)((double)(model.armSwing * 0.6662F) / 3.141592653589793D) % 2.0F;
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(-5.0F + 1.1F * (float)((double)(MathHelper.func_76134_b(model.armSwing * 0.6662F) * 1.4F * model.armSwingAmount) / 3.141592653589793D * 180.0D), 1.0F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(-5.0F + 1.1F * (float)((double)(MathHelper.func_76134_b(model.armSwing * 0.6662F + 3.1415927F) * 1.4F * model.armSwingAmount) / 3.141592653589793D * 180.0D), 1.0F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothZ(10.0F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothZ(-10.0F);
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(-20.0F + 20.0F * MathHelper.func_76134_b(model.armSwing * 0.6662F + 3.1415927F));
      ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-20.0F + 20.0F * MathHelper.func_76134_b(model.armSwing * 0.6662F));
      ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX((float)(var > 1.0F ? 45 : 10), 0.3F);
      ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX((float)(var > 1.0F ? 10 : 45), 0.3F);
      ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX((float)(var > 1.0F ? -10 : -45), 0.01F);
      ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothX((float)(var > 1.0F ? -45 : -10), 0.01F);
      float var2 = 25.0F + (float)Math.cos((double)(model.armSwing * 0.6662F * 2.0F)) * 5.0F;
      ((ModelRendererBends)model.field_78115_e).rotation.setSmoothX(var2);
      ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX - var2, 0.3F);
      PlayerData ex = PlayerData.get((EntityPlayer)argEntity);
      ItemStack umb = ex.ei.func_70301_a(4);
      if (umb != null) {
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-25.0F, 0.5F);
         ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-30.0F, 0.5F);
      }

   }
}
