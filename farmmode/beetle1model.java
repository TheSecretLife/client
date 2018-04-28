package farmmode;

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
import utilities.sagaobj;

@SideOnly(Side.CLIENT)
public class beetle1model extends ModelBase {
   private float rotateAngleZ;
   private float rotateAngleY;
   private float rotateAngleX;
   private float Head_rotateAngleZ;
   private float Head_rotateAngleY;
   private float Head_rotateAngleX;
   public static float modelXRotOffset = 180.0F;
   public static float modelYPosOffset = -1.5F;
   public sagaobj modelbody;
   public ArrayList partbodys;
   public sagaobj modelleg1;
   public ArrayList partleg1;
   public sagaobj modelleg2;
   public ArrayList partleg2;
   public sagaobj modelRwing;
   public ArrayList partRwing;
   public sagaobj modelLwing;
   public ArrayList partLwing;

   public beetle1model() {
      this(1.0F);
   }

   public beetle1model(float shadowSize) {
      this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle01body.saga");
      this.partbodys = this.modelbody.groupObjects;
      this.modelleg1 = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle01leg1.saga");
      this.partleg1 = this.modelleg1.groupObjects;
      this.modelleg2 = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle01leg2.saga");
      this.partleg2 = this.modelleg2.groupObjects;
      this.modelRwing = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/Rwing.saga");
      this.partRwing = this.modelRwing.groupObjects;
      this.modelLwing = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/Lwing.saga");
      this.partLwing = this.modelLwing.groupObjects;
   }

   public void func_78088_a(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
      super.func_78088_a(entity, par2, par3, par4, par5, par6, par7);
      this.func_78087_a(par2, par3, par4, par5, par6, par7, entity);
      if (entity.func_70096_w().func_75679_c(31) == 1) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle01body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 2) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle02body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 3) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle03body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 4) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle04body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 5) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle05body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 6) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle06body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 7) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle07body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 8) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle08body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 9) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle09body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 10) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle10body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 11) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle11body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 12) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle12body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 13) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle13body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 14) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle14body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 15) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle15body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 16) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle16body.saga");
      } else if (entity.func_70096_w().func_75679_c(31) == 17) {
         this.modelbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/bug/beetle17body.saga");
      }

      this.partbodys = this.modelbody.groupObjects;
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      GL11.glTranslatef(0.0F, -0.75F, 0.0F);
      Iterator var8 = this.partbodys.iterator();

      GroupObject part5;
      while(var8.hasNext()) {
         part5 = (GroupObject)var8.next();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F, 1.0F, 1.0F);
         GL11.glTranslatef(0.0F, 0.0F, 0.0F);
         this.rotate(modelXRotOffset, 1.0F, 0.0F, 0.0F);
         this.translate(0.0F, modelYPosOffset, 0.0F);
         part5.render();
         GL11.glPopMatrix();
      }

      var8 = this.partleg1.iterator();

      ResourceLocation textures;
      while(var8.hasNext()) {
         part5 = (GroupObject)var8.next();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F, 1.0F, 1.0F);
         GL11.glTranslatef(0.0F, 0.0F, 0.0F);
         textures = new ResourceLocation("fantasyland", "models/bug/beetle01c1.png");
         Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
         this.rotate(modelXRotOffset, 1.0F, 0.0F, 0.0F);
         this.translate(0.0F, modelYPosOffset, 0.0F);
         if (entity.field_70159_w != 0.0D || entity.field_70181_x != 0.0D || entity.field_70179_y != 0.0D) {
            GL11.glRotatef(-MathHelper.func_76134_b(par4 * 0.2662F) * 20.0F, 0.0F, 1.0F, 0.0F);
         }

         part5.render();
         GL11.glPopMatrix();
      }

      var8 = this.partleg2.iterator();

      while(var8.hasNext()) {
         part5 = (GroupObject)var8.next();
         GL11.glPushMatrix();
         GL11.glScalef(1.0F, 1.0F, 1.0F);
         GL11.glTranslatef(0.0F, 0.0F, 0.0F);
         textures = new ResourceLocation("fantasyland", "models/bug/beetle01c1.png");
         Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
         this.rotate(modelXRotOffset, 1.0F, 0.0F, 0.0F);
         this.translate(0.0F, modelYPosOffset, 0.0F);
         if (entity.field_70159_w != 0.0D || entity.field_70181_x != 0.0D || entity.field_70179_y != 0.0D) {
            GL11.glRotatef(MathHelper.func_76134_b(par4 * 0.2662F) * 20.0F, 0.0F, 1.0F, 0.0F);
         }

         part5.render();
         GL11.glPopMatrix();
      }

      if (entity.func_70096_w().func_75679_c(23) == 1) {
         var8 = this.partRwing.iterator();

         while(var8.hasNext()) {
            part5 = (GroupObject)var8.next();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            GL11.glTranslatef(0.0F, 0.0F, 0.0F);
            textures = new ResourceLocation("fantasyland", "models/bug/wing.png");
            Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
            this.rotate(modelXRotOffset, 1.0F, 0.0F, 0.0F);
            this.translate(0.0F, modelYPosOffset, 0.0F);
            if (this.rotateAngleZ != 0.0F) {
               GL11.glRotatef(this.rotateAngleZ * 20.0F, 0.0F, 0.0F, 1.0F);
               GL11.glRotatef(this.rotateAngleZ * 20.0F, 1.0F, 0.0F, 0.0F);
            }

            part5.render();
            GL11.glPopMatrix();
         }

         var8 = this.partLwing.iterator();

         while(var8.hasNext()) {
            part5 = (GroupObject)var8.next();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            GL11.glTranslatef(0.0F, 0.0F, 0.0F);
            textures = new ResourceLocation("fantasyland", "models/bug/wing.png");
            Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
            this.rotate(modelXRotOffset, 1.0F, 0.0F, 0.0F);
            this.translate(0.0F, modelYPosOffset, 0.0F);
            if (this.rotateAngleZ != 0.0F) {
               GL11.glRotatef(-this.rotateAngleZ * 20.0F, 0.0F, 0.0F, 1.0F);
               GL11.glRotatef(this.rotateAngleZ * 20.0F, 1.0F, 0.0F, 0.0F);
            }

            part5.render();
            GL11.glPopMatrix();
         }
      }

      GL11.glPopMatrix();
   }

   public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
      beetle1entity en = (beetle1entity)entity;
      if (en.func_70096_w().func_75679_c(23) == 1) {
         this.rotateAngleY = 0.0F;
         this.rotateAngleZ = MathHelper.func_76134_b(f2 * 1.8F) * 0.8F;
      } else {
         if (en.field_70159_w != 0.0D || en.field_70181_x != 0.0D || en.field_70179_y != 0.0D) {
            this.rotateAngleY = MathHelper.func_76134_b(f2 * 0.2662F) * 0.4F;
         }

         this.rotateAngleZ = 0.0F;
      }

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
