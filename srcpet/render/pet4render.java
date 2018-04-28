package srcpet.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import srcpet.model.modelpet11;

@SideOnly(Side.CLIENT)
public class pet4render extends RenderLiving {
   public pet4render(modelpet11 par1, float par2) {
      super(par1, par2);
   }

   protected ResourceLocation gett(Entity c) {
      return new ResourceLocation("srcpet:textures/pet/e11.png");
   }

   protected ResourceLocation func_110775_a(Entity e) {
      return this.gett(e);
   }
}
