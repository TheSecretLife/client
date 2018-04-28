package animation.gobbob.mobends.animation.player;

import animation.gobbob.mobends.animation.Animation;
import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsPlayer;
import animation.gobbob.mobends.data.EntityData;
import animation.gobbob.mobends.util.GUtil;
import cabalaccessorys.data.PlayerData;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class Animation_Walk extends Animation {
   public String getName() {
      return "walk";
   }

   public void animate(EntityLivingBase argEntity, ModelBase argModel, EntityData argData) {
      ModelBendsPlayer model = (ModelBendsPlayer)argModel;
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(0.5F * (float)((double)(MathHelper.func_76134_b(model.armSwing * 0.6662F + 3.1415927F) * 2.0F * model.armSwingAmount * 0.5F) / 3.141592653589793D * 180.0D));
      ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(0.5F * (float)((double)(MathHelper.func_76134_b(model.armSwing * 0.6662F) * 2.0F * model.armSwingAmount * 0.5F) / 3.141592653589793D * 180.0D));
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothZ(5.0F, 0.3F);
      ((ModelRendererBends)model.field_78113_g).rotation.setSmoothZ(-5.0F, 0.3F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(-5.0F + 0.5F * (float)((double)(MathHelper.func_76134_b(model.armSwing * 0.6662F) * 1.4F * model.armSwingAmount) / 3.141592653589793D * 180.0D), 1.0F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(-5.0F + 0.5F * (float)((double)(MathHelper.func_76134_b(model.armSwing * 0.6662F + 3.1415927F) * 1.4F * model.armSwingAmount) / 3.141592653589793D * 180.0D), 1.0F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothY(0.0F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothY(0.0F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothZ(2.0F, 0.2F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothZ(-2.0F, 0.2F);
      float var = (float)((double)(model.armSwing * 0.6662F) / 3.141592653589793D) % 2.0F;
      ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX((float)(var > 1.0F ? 45 : 0), 0.3F);
      ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX((float)(var > 1.0F ? 0 : 45), 0.3F);
      ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX((float)(Math.cos((double)(model.armSwing * 0.6662F) + 1.5707963267948966D) + 1.0D) / 2.0F * -20.0F, 1.0F);
      ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothX((float)(Math.cos((double)(model.armSwing * 0.6662F)) + 1.0D) / 2.0F * -20.0F, 0.3F);
      float var2 = (float)Math.cos((double)(model.armSwing * 0.6662F)) * -20.0F;
      float var3 = (float)(Math.cos((double)(model.armSwing * 0.6662F * 2.0F)) * 0.5D + 0.5D) * 10.0F - 2.0F;
      ((ModelRendererBends)model.field_78115_e).rotation.setSmoothY(var2, 0.5F);
      ((ModelRendererBends)model.field_78115_e).rotation.setSmoothX(var3);
      ((ModelRendererBends)model.field_78116_c).rotation.setSmoothY(model.headRotationY - var2, 0.5F);
      ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX - var3);
      float var10 = model.headRotationY * 0.1F;
      var10 = GUtil.max(var10, 10.0F);
      var10 = GUtil.min(var10, -10.0F);
      ((ModelRendererBends)model.field_78115_e).rotation.setSmoothZ(-var10, 0.3F);
      PlayerData ex = PlayerData.get((EntityPlayer)argEntity);
      ItemStack umb = ex.ei.func_70301_a(4);
      if (umb != null) {
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-25.0F, 0.5F);
         ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-30.0F, 0.5F);
      }

   }
}
