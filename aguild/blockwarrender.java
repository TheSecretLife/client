package aguild;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class blockwarrender extends RenderLiving {
   public blockwarrender(ModelBase par1, float par2) {
      super(par1, par2);
   }

   protected ResourceLocation gett(Entity entity) {
      return new ResourceLocation("aguild", "models/crystal.png");
   }

   protected ResourceLocation func_110775_a(Entity entity) {
      return this.gett(entity);
   }
}
