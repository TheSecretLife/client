package farmmode;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class beetle1render extends RenderLiving {
   public beetle1render(ModelBase par1, float par2) {
      super(par1, par2);
   }

   protected ResourceLocation getCowTextures(Entity c) {
      if (c.func_70096_w().func_75679_c(31) == 1) {
         return new ResourceLocation("fantasyland", "models/bug/beetle01c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else if (c.func_70096_w().func_75679_c(31) == 2) {
         return new ResourceLocation("fantasyland", "models/bug/beetle02c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else if (c.func_70096_w().func_75679_c(31) == 3) {
         return new ResourceLocation("fantasyland", "models/bug/beetle03c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else if (c.func_70096_w().func_75679_c(31) == 4) {
         return new ResourceLocation("fantasyland", "models/bug/beetle04c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else if (c.func_70096_w().func_75679_c(31) == 5) {
         return new ResourceLocation("fantasyland", "models/bug/beetle05c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else if (c.func_70096_w().func_75679_c(31) == 6) {
         return new ResourceLocation("fantasyland", "models/bug/beetle06c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else if (c.func_70096_w().func_75679_c(31) == 7) {
         return new ResourceLocation("fantasyland", "models/bug/beetle07c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else if (c.func_70096_w().func_75679_c(31) == 8) {
         return new ResourceLocation("fantasyland", "models/bug/beetle08c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else if (c.func_70096_w().func_75679_c(31) == 9) {
         return new ResourceLocation("fantasyland", "models/bug/beetle09c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else if (c.func_70096_w().func_75679_c(31) == 10) {
         return new ResourceLocation("fantasyland", "models/bug/beetle10c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else if (c.func_70096_w().func_75679_c(31) == 11) {
         return new ResourceLocation("fantasyland", "models/bug/beetle11c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else if (c.func_70096_w().func_75679_c(31) == 12) {
         return new ResourceLocation("fantasyland", "models/bug/beetle12c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else if (c.func_70096_w().func_75679_c(31) == 13) {
         return new ResourceLocation("fantasyland", "models/bug/beetle13c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else if (c.func_70096_w().func_75679_c(31) == 14) {
         return new ResourceLocation("fantasyland", "models/bug/beetle14c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else if (c.func_70096_w().func_75679_c(31) == 15) {
         return new ResourceLocation("fantasyland", "models/bug/beetle15c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else if (c.func_70096_w().func_75679_c(31) == 16) {
         return new ResourceLocation("fantasyland", "models/bug/beetle16c" + c.func_70096_w().func_75679_c(22) + ".png");
      } else {
         return c.func_70096_w().func_75679_c(31) == 17 ? new ResourceLocation("fantasyland", "models/bug/beetle17c" + c.func_70096_w().func_75679_c(22) + ".png") : null;
      }
   }

   protected ResourceLocation func_110775_a(Entity z) {
      return this.getCowTextures(z);
   }
}
