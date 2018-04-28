package srcpet.model;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.obj.GroupObject;
import org.lwjgl.opengl.GL11;
import srcpet.assmodel;
import utilities.sagaobj;

@SideOnly(Side.CLIENT)
public class pet1model extends ModelBase {
   public static float modelXRotOffset = 180.0F;
   public static float modelYPosOffset = -1.5F;
   public sagaobj model;
   public ArrayList partmain;

   public pet1model() {
      this(1.0F);
   }

   public pet1model(float shadowSize) {
      this.model = (sagaobj)assmodel.getObjModel("srcpet:models/pet/pet1.saga");
      this.partmain = this.model.groupObjects;
   }

   public void func_78088_a(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
      super.func_78088_a(entity, par2, par3, par4, par5, par6, par7);
      this.func_78087_a(par2, par3, par4, par5, par6, par7, entity);
      GL11.glPushMatrix();
      if (MathHelper.func_76134_b(par4 * 0.1662F + 3.141593F) * 6.0F * 0.4F * 0.3F - 0.5235988F + 0.2F != 0.0F) {
         GL11.glTranslatef(0.0F, (MathHelper.func_76134_b(par4 * 0.1662F + 3.141593F) * 6.0F * 0.4F * 0.3F - 0.5235988F + 0.2F) * 0.095776F, 0.0F);
      }

      Iterator var8 = this.partmain.iterator();

      while(var8.hasNext()) {
         GroupObject part = (GroupObject)var8.next();
         GL11.glPushMatrix();
         GL11.glScalef(0.6F, 0.6F, 0.6F);
         GL11.glTranslatef(0.0F, -0.7F, 0.0F);
         this.rotate(modelXRotOffset, 1.0F, 0.0F, 0.0F);
         this.translate(0.0F, modelYPosOffset, 0.0F);
         Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("pixelstation", "models/pet/pet1.png"));
         part.render();
         GL11.glPopMatrix();
      }

      GL11.glPopMatrix();
   }

   public void rotate(float rotX, float rotY, float rotZ) {
      GL11.glRotatef(rotX, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(rotY, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(rotZ, 0.0F, 0.0F, 1.0F);
   }

   public void rotate(float rotation, float angleX, float angleY, float angleZ) {
      GL11.glRotatef(rotation, angleX, angleY, angleZ);
   }

   public void translate(float posX, float posY, float posZ) {
      GL11.glTranslatef(posX, posY, posZ);
   }

   public void scale(float scaleX, float scaleY, float scaleZ) {
      GL11.glScalef(scaleX, scaleY, scaleZ);
   }
}
