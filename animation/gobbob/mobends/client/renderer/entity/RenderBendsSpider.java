package animation.gobbob.mobends.client.renderer.entity;

import animation.gobbob.mobends.MoBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsSpider;
import net.minecraft.client.renderer.entity.RenderSpider;
import net.minecraft.entity.EntityLiving;

public class RenderBendsSpider extends RenderSpider {
   public int refreshModel = 0;

   public RenderBendsSpider() {
      this.field_77045_g = new ModelBendsSpider();
      this.func_77042_a(new ModelBendsSpider());
   }

   public void func_76986_a(EntityLiving p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
      if (this.refreshModel != MoBends.refreshModel) {
         this.field_77045_g = new ModelBendsSpider();
         this.func_77042_a(new ModelBendsSpider());
         this.refreshModel = MoBends.refreshModel;
      }

      super.func_76986_a(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
   }
}
