package farmmode;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.model.obj.GroupObject;
import org.lwjgl.opengl.GL11;
import utilities.sagaobj;

@SideOnly(Side.CLIENT)
public class modelchili extends ModelBase {
   public static float modelXRotOffset = 180.0F;
   public static float modelYPosOffset = -1.5F;
   public sagaobj model;
   public ArrayList partmodel;

   public modelchili() {
      this(1.0F);
   }

   public modelchili(float shadowSize) {
      this.model = (sagaobj)AssetManager.getObjModel("fantasyland:models/farm/chili.saga");
      this.partmodel = this.model.groupObjects;
   }

   public void func_78088_a(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
      super.func_78088_a(entity, par2, par3, par4, par5, par6, par7);
      this.func_78087_a(par2, par3, par4, par5, par6, par7, entity);
      Iterator var8 = this.partmodel.iterator();

      while(var8.hasNext()) {
         GroupObject part = (GroupObject)var8.next();
         GL11.glPushMatrix();
         GL11.glScalef(8.0F, 8.0F, 8.0F);
         GL11.glTranslatef(0.0F, -1.38F, 0.0F);
         this.rotate(modelXRotOffset, 1.0F, 0.0F, 0.0F);
         this.translate(0.0F, modelYPosOffset, 0.0F);
         part.render();
         GL11.glPopMatrix();
      }

   }

   public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
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
