package animation.gobbob.mobends.client.model;

import animation.gobbob.mobends.util.SmoothVector3f;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;

public class ModelRendererBends extends ModelRenderer {
   public SmoothVector3f rotation = new SmoothVector3f();
   public SmoothVector3f pre_rotation = new SmoothVector3f();
   public float scaleX;
   public float scaleY;
   public float scaleZ;
   public int txOffsetX;
   public int txOffsetY;
   public boolean field_78812_q;
   private int displayList;
   public boolean showChildIfHidden = false;

   public ModelRendererBends(ModelBase argModel) {
      super(argModel);
      this.scaleX = this.scaleY = this.scaleZ = 1.0F;
   }

   public ModelRendererBends(ModelBase argModel, String argName) {
      super(argModel, argName);
      this.scaleX = this.scaleY = this.scaleZ = 1.0F;
   }

   public ModelRendererBends(ModelBase argModel, int argTexOffsetX, int argTexOffsetY) {
      super(argModel, argTexOffsetX, argTexOffsetY);
      this.txOffsetX = argTexOffsetX;
      this.txOffsetY = argTexOffsetY;
      this.scaleX = this.scaleY = this.scaleZ = 1.0F;
   }

   public void updateBends(float argTicksPerFrame) {
      this.field_78795_f = (float)((double)(this.rotation.getX() / 180.0F) * 3.141592653589793D);
      this.field_78796_g = (float)((double)(this.rotation.getY() / 180.0F) * 3.141592653589793D);
      this.field_78808_h = (float)((double)(this.rotation.getZ() / 180.0F) * 3.141592653589793D);
   }

   public ModelRendererBends setShowChildIfHidden(boolean arg0) {
      this.showChildIfHidden = arg0;
      return this;
   }

   @SideOnly(Side.CLIENT)
   public void func_78788_d(float p_78788_1_) {
      this.displayList = GLAllocation.func_74526_a(1);
      GL11.glNewList(this.displayList, 4864);
      Tessellator tessellator = Tessellator.field_78398_a;

      for(int i = 0; i < this.field_78804_l.size(); ++i) {
         ((ModelBox)this.field_78804_l.get(i)).func_78245_a(tessellator, p_78788_1_);
      }

      GL11.glEndList();
      this.field_78812_q = true;
   }

   public void func_78785_a(float p_78785_1_) {
      this.updateBends(p_78785_1_);
      if (!this.field_78812_q) {
         this.func_78788_d(p_78785_1_);
      }

      GL11.glTranslatef(this.field_82906_o, this.field_82908_p, this.field_82907_q);
      int i;
      if (this.field_78795_f == 0.0F && this.field_78796_g == 0.0F && this.field_78808_h == 0.0F) {
         if (this.field_78800_c == 0.0F && this.field_78797_d == 0.0F && this.field_78798_e == 0.0F) {
            GL11.glRotatef(-this.pre_rotation.getY(), 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(this.pre_rotation.getX(), 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(this.pre_rotation.getZ(), 0.0F, 0.0F, 1.0F);
            GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
            if (!this.field_78807_k & this.field_78806_j) {
               GL11.glCallList(this.displayList);
            }

            if ((this.showChildIfHidden || !this.field_78807_k & this.field_78806_j) && this.field_78805_m != null) {
               for(i = 0; i < this.field_78805_m.size(); ++i) {
                  ((ModelRenderer)this.field_78805_m.get(i)).func_78785_a(p_78785_1_);
               }
            }
         } else {
            GL11.glTranslatef(this.field_78800_c * p_78785_1_, this.field_78797_d * p_78785_1_, this.field_78798_e * p_78785_1_);
            GL11.glRotatef(-this.pre_rotation.getY(), 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(this.pre_rotation.getX(), 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(this.pre_rotation.getZ(), 0.0F, 0.0F, 1.0F);
            GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
            if (!this.field_78807_k & this.field_78806_j) {
               GL11.glCallList(this.displayList);
            }

            if ((this.showChildIfHidden || !this.field_78807_k & this.field_78806_j) && this.field_78805_m != null) {
               for(i = 0; i < this.field_78805_m.size(); ++i) {
                  ((ModelRenderer)this.field_78805_m.get(i)).func_78785_a(p_78785_1_);
               }
            }

            GL11.glTranslatef(-this.field_78800_c * p_78785_1_, -this.field_78797_d * p_78785_1_, -this.field_78798_e * p_78785_1_);
         }
      } else {
         GL11.glPushMatrix();
         GL11.glTranslatef(this.field_78800_c * p_78785_1_, this.field_78797_d * p_78785_1_, this.field_78798_e * p_78785_1_);
         GL11.glRotatef(-this.pre_rotation.getY(), 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.pre_rotation.getX(), 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(this.pre_rotation.getZ(), 0.0F, 0.0F, 1.0F);
         if (this.field_78808_h != 0.0F) {
            GL11.glRotatef(this.field_78808_h * 57.295776F, 0.0F, 0.0F, 1.0F);
         }

         if (this.field_78796_g != 0.0F) {
            GL11.glRotatef(this.field_78796_g * 57.295776F, 0.0F, 1.0F, 0.0F);
         }

         if (this.field_78795_f != 0.0F) {
            GL11.glRotatef(this.field_78795_f * 57.295776F, 1.0F, 0.0F, 0.0F);
         }

         GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
         if (!this.field_78807_k & this.field_78806_j) {
            GL11.glCallList(this.displayList);
         }

         if ((this.showChildIfHidden || !this.field_78807_k & this.field_78806_j) && this.field_78805_m != null) {
            for(i = 0; i < this.field_78805_m.size(); ++i) {
               ((ModelRenderer)this.field_78805_m.get(i)).func_78785_a(p_78785_1_);
            }
         }

         GL11.glPopMatrix();
      }

      GL11.glTranslatef(-this.field_82906_o, -this.field_82908_p, -this.field_82907_q);
   }

   public void update(float p_78785_1_) {
      this.rotation.update(p_78785_1_);
      this.pre_rotation.update(p_78785_1_);
      this.updateBends(p_78785_1_);
   }

   public void func_78791_b(float p_78791_1_) {
      this.updateBends(p_78791_1_);
      super.func_78791_b(p_78791_1_);
   }

   public void func_78794_c(float p_78794_1_) {
      this.updateBends(p_78794_1_);
      if (!this.field_78807_k && this.field_78806_j) {
         if (this.field_78795_f == 0.0F && this.field_78796_g == 0.0F && this.field_78808_h == 0.0F) {
            if (this.field_78800_c != 0.0F || this.field_78797_d != 0.0F || this.field_78798_e != 0.0F) {
               GL11.glTranslatef(this.field_78800_c * p_78794_1_, this.field_78797_d * p_78794_1_, this.field_78798_e * p_78794_1_);
               GL11.glRotatef(-this.pre_rotation.getY(), 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(this.pre_rotation.getX(), 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(this.pre_rotation.getZ(), 0.0F, 0.0F, 1.0F);
               GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
            }
         } else {
            GL11.glTranslatef(this.field_78800_c * p_78794_1_, this.field_78797_d * p_78794_1_, this.field_78798_e * p_78794_1_);
            GL11.glRotatef(-this.pre_rotation.getY(), 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(this.pre_rotation.getX(), 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(this.pre_rotation.getZ(), 0.0F, 0.0F, 1.0F);
            if (this.field_78808_h != 0.0F) {
               GL11.glRotatef(this.field_78808_h * 57.295776F, 0.0F, 0.0F, 1.0F);
            }

            if (this.field_78796_g != 0.0F) {
               GL11.glRotatef(this.field_78796_g * 57.295776F, 0.0F, 1.0F, 0.0F);
            }

            if (this.field_78795_f != 0.0F) {
               GL11.glRotatef(this.field_78795_f * 57.295776F, 1.0F, 0.0F, 0.0F);
            }

            GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
         }
      }

   }

   public ModelRendererBends setPosition(float argX, float argY, float argZ) {
      this.field_78800_c = argX;
      this.field_78797_d = argY;
      this.field_78798_e = argZ;
      return this;
   }

   public ModelRendererBends setOffset(float argX, float argY, float argZ) {
      this.field_82906_o = argX;
      this.field_82908_p = argY;
      this.field_82907_q = argZ;
      return this;
   }

   public ModelRendererBends setScale(float argX, float argY, float argZ) {
      this.scaleX = argX;
      this.scaleY = argY;
      this.scaleZ = argZ;
      return this;
   }

   public ModelRendererBends resetScale() {
      this.scaleX = this.scaleY = this.scaleZ = 1.0F;
      return this;
   }

   public void sync(ModelRendererBends argBox) {
      if (argBox != null) {
         this.field_78795_f = argBox.field_78795_f;
         this.field_78796_g = argBox.field_78796_g;
         this.field_78808_h = argBox.field_78808_h;
         this.rotation.vOld.set(argBox.rotation.vOld);
         this.rotation.completion.set(argBox.rotation.completion);
         this.rotation.vFinal.set(argBox.rotation.vFinal);
         this.rotation.vSmooth.set(argBox.rotation.vSmooth);
         this.rotation.smoothness.set(argBox.rotation.smoothness);
         this.pre_rotation.vOld.set(argBox.pre_rotation.vOld);
         this.pre_rotation.completion.set(argBox.pre_rotation.completion);
         this.pre_rotation.vFinal.set(argBox.pre_rotation.vFinal);
         this.pre_rotation.vSmooth.set(argBox.pre_rotation.vSmooth);
         this.pre_rotation.smoothness.set(argBox.pre_rotation.smoothness);
         this.scaleX = argBox.scaleX;
         this.scaleY = argBox.scaleY;
         this.scaleZ = argBox.scaleZ;
      }

   }

   public void func_78790_a(float p_78790_1_, float p_78790_2_, float p_78790_3_, int p_78790_4_, int p_78790_5_, int p_78790_6_, float p_78790_7_) {
      this.field_78804_l.add(new ModelBoxBends(this, this.txOffsetX, this.txOffsetY, p_78790_1_, p_78790_2_, p_78790_3_, p_78790_4_, p_78790_5_, p_78790_6_, p_78790_7_));
   }

   public ModelBoxBends getBox() {
      return (ModelBoxBends)this.field_78804_l.get(0);
   }

   public ModelRendererBends offsetBox(float argX, float argY, float argZ) {
      this.getBox().offset(argX, argY, argZ);
      return this;
   }

   public ModelRendererBends offsetBox_Add(float argX, float argY, float argZ) {
      this.getBox().offset_add(argX, argY, argZ);
      return this;
   }

   public ModelRendererBends resizeBox(float argX, float argY, float argZ) {
      this.getBox().resize(argX, argY, argZ);
      return this;
   }

   public ModelRendererBends updateVertices() {
      this.getBox().updateVertexPositions(this);
      this.field_78812_q = false;
      return this;
   }
}
