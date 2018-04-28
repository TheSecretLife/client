package animation.gobbob.mobends.animation.zombie;

import animation.gobbob.mobends.animation.Animation;
import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsZombie;
import animation.gobbob.mobends.data.Data_Zombie;
import animation.gobbob.mobends.data.EntityData;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityZombie;

public class Animation_Stand extends Animation {
   public String getName() {
      return "stand";
   }

   public void animate(EntityLivingBase argEntity, ModelBase argModel, EntityData argData) {
      EntityZombie zombie = (EntityZombie)argEntity;
      ModelBendsZombie model = (ModelBendsZombie)argModel;
      Data_Zombie data = (Data_Zombie)argData;
      model.renderOffset.setSmoothY(-3.0F);
      ((ModelRendererBends)model.field_78115_e).rotation.setSmoothX(30.0F, 0.3F);
      ((ModelRendererBends)model.field_78112_f).rotation.setSmoothX(-30.0F, 0.3F);
      ((ModelRendererBends)model.field_78113_g).rotation.setSmoothX(-30.0F, 0.3F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothZ(10.0F, 0.3F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothZ(-10.0F, 0.3F);
      ((ModelRendererBends)model.field_78123_h).rotation.setSmoothX(-20.0F, 0.3F);
      ((ModelRendererBends)model.field_78124_i).rotation.setSmoothX(-20.0F, 0.3F);
      ((ModelRendererBends)model.bipedRightForeLeg).rotation.setSmoothX(25.0F, 0.3F);
      ((ModelRendererBends)model.bipedLeftForeLeg).rotation.setSmoothX(25.0F, 0.3F);
      ((ModelRendererBends)model.field_78116_c).rotation.setX(model.headRotationX - 30.0F);
      ((ModelRendererBends)model.field_78116_c).rotation.setY(model.headRotationY);
   }
}
