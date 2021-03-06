package myset3d.equipobj.armor1;

import cabalaccessorys.api.TextureSetting;
import myset3d.CustomRender;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import utilities.SagaModelLoader;

public class HelmetRender extends CustomRender {
   public static final IModelCustom model = SagaModelLoader.loadModel(new ResourceLocation("cabalaccessorys", "models/newarmor/armor1.saga"));
   public static final ResourceLocation texture = new ResourceLocation("cabalaccessorys", "models/newarmor/armor1.png");

   public void func_78088_a(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
      super.func_78087_a(par2, par3, par4, par5, par6, par7, par1Entity);
      GL11.glDisable(2896);
      GL11.glDisable(2884);
      float size = 1.0F;
      GL11.glPushMatrix();
      Minecraft.func_71410_x().field_71446_o.func_110577_a(texture);
      TextureSetting.setblur();
      GL11.glScalef(size, size, size);
      rotationpart(this.field_78116_c);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      model.renderOnly(new String[]{"head"});
      GL11.glPopMatrix();
      GL11.glEnable(2896);
      GL11.glEnable(2884);
   }
}
