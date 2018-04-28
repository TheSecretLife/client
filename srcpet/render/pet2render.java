package srcpet.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import srcpet.model.modelpet7;

@SideOnly(Side.CLIENT)
public class pet2render extends RenderLiving {
   public pet2render(modelpet7 par1, float par2) {
      super(par1, par2);
   }

   protected ResourceLocation gett(Entity c) {
      return new ResourceLocation("srcpet:textures/pet/e7.png");
   }

   protected ResourceLocation func_110775_a(Entity e) {
      return this.gett(e);
   }
}
