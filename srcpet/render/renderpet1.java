package srcpet.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class renderpet1 extends RenderLiving {
   private static final ResourceLocation cowTextures = new ResourceLocation("ajamigaslot:textures/pet/e1.png");

   public renderpet1(ModelBase b, float x) {
      super(b, x);
   }

   protected ResourceLocation getCowTextures(Entity c) {
      return cowTextures;
   }

   protected ResourceLocation func_110775_a(Entity z) {
      return this.getCowTextures(z);
   }
}
