package farmmode;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class fish1render extends RenderLiving {
   private static ResourceLocation tex = null;

   public fish1render(ModelBase b, float x) {
      super(b, x);
   }

   protected ResourceLocation getCowTextures(Entity c) {
      tex = new ResourceLocation("fantasyland:textures/fish/fish" + c.func_70096_w().func_75679_c(31) + "_" + c.func_70096_w().func_75679_c(30) + ".png");
      return tex;
   }

   protected ResourceLocation func_110775_a(Entity z) {
      return this.getCowTextures(z);
   }
}
