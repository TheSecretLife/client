package cabalaccessorys.blockshop;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class sellerrender extends RenderLiving {
   private static final ResourceLocation tex = new ResourceLocation("cabalaccessorys:textures/seller.png");

   public sellerrender(ModelBase b, float x) {
      super(b, x);
   }

   protected ResourceLocation getCowTextures(Entity c) {
      return tex;
   }

   protected ResourceLocation func_110775_a(Entity z) {
      return this.getCowTextures(z);
   }
}
