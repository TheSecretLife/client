package aguild;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import utilities.sagaobj;

@SideOnly(Side.CLIENT)
public class blockwarmodel extends ModelBase {
   private float rotateAngleZ;
   private float rotateAngleY;
   private float rotateAngleX;
   private final ResourceLocation tex1;
   private final sagaobj model;

   public blockwarmodel() {
      this(1.0F);
   }

   public blockwarmodel(float shadowSize) {
      this.tex1 = new ResourceLocation("aguild", "models/crystal.png");
      this.model = (sagaobj)importobj.getObjModel("aguild:models/crystal.saga");
   }

   public void func_78088_a(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
      super.func_78088_a(entity, par2, par3, par4, par5, par6, par7);
      this.func_78087_a(par2, par3, par4, par5, par6, par7, entity);
      Minecraft.func_71410_x().field_71446_o.func_110577_a(this.tex1);
      GL11.glPushMatrix();
      GL11.glScalef(4.0F, 3.0F, 4.0F);
      GL11.glTranslatef(0.0F, -1.0F, 0.0F);
      this.rotate(180.0F, 1.0F, 0.0F, 0.0F);
      this.translate(0.0F, -1.5F, 0.0F);
      this.model.renderAll();
      GL11.glPopMatrix();
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
