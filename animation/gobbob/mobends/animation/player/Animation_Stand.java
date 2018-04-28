package animation.gobbob.mobends.animation.player;

import animation.gobbob.mobends.animation.Animation;
import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsPlayer;
import animation.gobbob.mobends.data.Data_Player;
import animation.gobbob.mobends.data.EntityData;
import cabalaccessorys.data.PlayerData;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.util.vector.Vector3f;

public class Animation_Stand extends Animation {
   public String getName() {
      return "stand";
   }

   public void animate(EntityLivingBase argEntity, ModelBase argModel, EntityData argData) {
      ModelBendsPlayer model = (ModelBendsPlayer)argModel;
      Data_Player data = (Data_Player)argData;
      ((ModelRendererBends)model.field_78115_e).rotation.setSmooth(new Vector3f(0.0F, 0.0F, 0.0F), 0.5F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothZ(2.0F, 0.2F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothZ(-2.0F, 0.2F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(0.0F, 0.1F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(0.0F, 0.1F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothY(5.0F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothY(-5.0F);
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(0.0F, 0.1F);
      ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(0.0F, 0.1F);
      ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX(4.0F, 0.1F);
      ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX(4.0F, 0.1F);
      ((ModelRendererBends)model.bipedRightForeArm).rotation.setSmoothX(-4.0F, 0.1F);
      ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-4.0F, 0.1F);
      ((ModelRendererBends)model.field_78116_c).rotation.setSmoothX(model.headRotationX, 0.3F);
      ((ModelRendererBends)model.field_78116_c).rotation.setSmoothY(model.headRotationY, 0.3F);
      ((ModelRendererBends)model.field_78115_e).rotation.setSmoothX((float)((Math.cos((double)(data.ticks / 10.0F)) - 1.0D) / 2.0D) * -3.0F);
      ((ModelRendererBends)model.field_78113_g).rotation.setSmoothZ(-((float)((Math.cos((double)(data.ticks / 10.0F) + 1.5707963267948966D) - 1.0D) / 2.0D)) * -5.0F);
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothZ(-((float)((Math.cos((double)(data.ticks / 10.0F) + 1.5707963267948966D) - 1.0D) / 2.0D)) * 5.0F);
      PlayerData ex = PlayerData.get((EntityPlayer)argEntity);
      ItemStack umb = ex.ei.func_70301_a(4);
      if (umb != null) {
         ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-25.0F, 0.5F);
         ((ModelRendererBends)model.bipedLeftForeArm).rotation.setSmoothX(-30.0F, 0.5F);
      }

   }
}
