package myset3d.equipobj.armor1;

import myset3d.CustomRender;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ChestRender extends CustomRender {
   public void func_78088_a(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
      super.func_78087_a(par2, par3, par4, par5, par6, par7, par1Entity);
      float size = 1.0F;
      GL11.glDisable(2896);
      GL11.glDisable(2884);
      Minecraft.func_71410_x().field_71446_o.func_110577_a(HelmetRender.texture);
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      rotationpart(this.field_78115_e);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, 0.0F);
      HelmetRender.model.renderOnly(new String[]{"body"});
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      rotationpart(this.field_78113_g);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      HelmetRender.model.renderOnly(new String[]{"leftarm"});
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      rotationpart(this.field_78112_f);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, 0.0F);
      HelmetRender.model.renderOnly(new String[]{"rightarm"});
      GL11.glPopMatrix();
   }
}
