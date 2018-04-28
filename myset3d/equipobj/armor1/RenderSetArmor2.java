package myset3d.equipobj.armor1;

import animation.gobbob.mobends.client.model.entity.ModelBendsPlayer;
import cabalaccessorys.api.TextureSetting;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import utilities.SagaModelLoader;

public class RenderSetArmor2 extends ModelBendsPlayer {
   public static final IModelCustom model = SagaModelLoader.loadModel(new ResourceLocation("cabalaccessorys", "models/newarmor/armor2.saga"));
   public static final ResourceLocation texture = new ResourceLocation("cabalaccessorys", "models/newarmor/armor2.png");

   public static void rendermodel(ModelBendsPlayer part, EntityPlayer player) {
      GL11.glDisable(2896);
      GL11.glDisable(2884);
      Minecraft.func_71410_x().field_71446_o.func_110577_a(texture);
      float size = 1.0F;
      if (player.func_70096_w().func_75681_e(26).split(",")[1].equalsIgnoreCase("off")) {
         GL11.glPushMatrix();
         TextureSetting.setblur();
         GL11.glScalef(size, size, size);
         rotationpart(part.field_78115_e);
         rotationpart(part.field_78116_c);
         GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
         model.renderOnly(new String[]{"head"});
         GL11.glPopMatrix();
      }

      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      rotationpart(part.field_78115_e);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.8F, 0.0F);
      model.renderOnly(new String[]{"body"});
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      rotationpart(part.field_78115_e);
      rotationpart(part.field_78113_g);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.001F, -0.0F, 0.0F);
      model.renderOnly(new String[]{"leftarm"});
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      rotationpart(part.field_78115_e);
      rotationpart(part.field_78113_g);
      rotationpart(part.bipedLeftForeArm);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(-0.001F, -0.01F, -0.002F);
      model.renderOnly(new String[]{"leftarm2"});
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      rotationpart(part.field_78115_e);
      rotationpart(part.field_78112_f);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(-0.001F, 0.0F, 0.0F);
      model.renderOnly(new String[]{"rightarm"});
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      rotationpart(part.field_78115_e);
      rotationpart(part.field_78112_f);
      rotationpart(part.bipedRightForeArm);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(-0.002F, -0.01F, -0.002F);
      model.renderOnly(new String[]{"rightarm2"});
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      rotationpart(part.field_78124_i);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, 0.0F);
      model.renderOnly(new String[]{"leftleg"});
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      rotationpart(part.field_78124_i);
      rotationpart(part.bipedLeftForeLeg);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, 0.0F);
      model.renderOnly(new String[]{"leftleg2"});
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      rotationpart(part.field_78123_h);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, 0.0F);
      model.renderOnly(new String[]{"rightleg"});
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(size, size, size);
      rotationpart(part.field_78123_h);
      rotationpart(part.bipedRightForeLeg);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, 0.0F);
      model.renderOnly(new String[]{"rightleg2"});
      GL11.glPopMatrix();
      GL11.glEnable(2896);
      GL11.glEnable(2884);
   }
}
