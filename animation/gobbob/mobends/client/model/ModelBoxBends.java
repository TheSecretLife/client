package animation.gobbob.mobends.client.model;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.PositionTextureVertex;
import net.minecraft.client.model.TexturedQuad;
import net.minecraft.client.renderer.Tessellator;

public class ModelBoxBends extends ModelBox {
   public float offsetX;
   public float offsetY;
   public float offsetZ;
   public float resX;
   public float resY;
   public float resZ;
   public float originalResX;
   public float originalResY;
   public float originalResZ;
   public float txOffsetX;
   public float txOffsetY;
   public PositionTextureVertex[] vertices;
   public TexturedQuad[] quads;
   public static final int LEFT = 0;
   public static final int RIGHT = 1;
   public static final int TOP = 2;
   public static final int BOTTOM = 3;
   public static final int FRONT = 4;
   public static final int BACK = 5;

   public ModelBoxBends(ModelRenderer p_i1171_1_, int p_i1171_2_, int p_i1171_3_, float p_i1171_4_, float p_i1171_5_, float p_i1171_6_, int p_i1171_7_, int p_i1171_8_, int p_i1171_9_, float p_i1171_10_) {
      super(p_i1171_1_, p_i1171_9_, p_i1171_9_, p_i1171_10_, p_i1171_10_, p_i1171_10_, p_i1171_9_, p_i1171_9_, p_i1171_9_, p_i1171_10_);
      this.offsetX = p_i1171_4_;
      this.offsetY = p_i1171_5_;
      this.offsetZ = p_i1171_6_;
      this.resX = this.originalResX = (float)p_i1171_7_;
      this.resY = this.originalResY = (float)p_i1171_8_;
      this.resZ = this.originalResZ = (float)p_i1171_9_;
      this.txOffsetX = (float)p_i1171_2_;
      this.txOffsetY = (float)p_i1171_3_;
      this.vertices = new PositionTextureVertex[8];
      this.quads = new TexturedQuad[6];
      float f4 = p_i1171_4_ + (float)p_i1171_7_;
      float f5 = p_i1171_5_ + (float)p_i1171_8_;
      float f6 = p_i1171_6_ + (float)p_i1171_9_;
      p_i1171_4_ -= p_i1171_10_;
      p_i1171_5_ -= p_i1171_10_;
      p_i1171_6_ -= p_i1171_10_;
      f4 += p_i1171_10_;
      f5 += p_i1171_10_;
      f6 += p_i1171_10_;
      if (p_i1171_1_.field_78809_i) {
         float positiontexturevertex7 = f4;
         f4 = p_i1171_4_;
         p_i1171_4_ = positiontexturevertex7;
      }

      PositionTextureVertex var23 = new PositionTextureVertex(p_i1171_4_, p_i1171_5_, p_i1171_6_, 0.0F, 0.0F);
      PositionTextureVertex positiontexturevertex = new PositionTextureVertex(f4, p_i1171_5_, p_i1171_6_, 0.0F, 8.0F);
      PositionTextureVertex positiontexturevertex1 = new PositionTextureVertex(f4, f5, p_i1171_6_, 8.0F, 8.0F);
      PositionTextureVertex positiontexturevertex2 = new PositionTextureVertex(p_i1171_4_, f5, p_i1171_6_, 8.0F, 0.0F);
      PositionTextureVertex positiontexturevertex3 = new PositionTextureVertex(p_i1171_4_, p_i1171_5_, f6, 0.0F, 0.0F);
      PositionTextureVertex positiontexturevertex4 = new PositionTextureVertex(f4, p_i1171_5_, f6, 0.0F, 8.0F);
      PositionTextureVertex positiontexturevertex5 = new PositionTextureVertex(f4, f5, f6, 8.0F, 8.0F);
      PositionTextureVertex positiontexturevertex6 = new PositionTextureVertex(p_i1171_4_, f5, f6, 8.0F, 0.0F);
      this.vertices[0] = var23;
      this.vertices[1] = positiontexturevertex;
      this.vertices[2] = positiontexturevertex1;
      this.vertices[3] = positiontexturevertex2;
      this.vertices[4] = positiontexturevertex3;
      this.vertices[5] = positiontexturevertex4;
      this.vertices[6] = positiontexturevertex5;
      this.vertices[7] = positiontexturevertex6;
      this.quads[0] = new TexturedQuad(new PositionTextureVertex[]{positiontexturevertex4, positiontexturevertex, positiontexturevertex1, positiontexturevertex5}, p_i1171_2_ + p_i1171_9_ + p_i1171_7_, p_i1171_3_ + p_i1171_9_, p_i1171_2_ + p_i1171_9_ + p_i1171_7_ + p_i1171_9_, p_i1171_3_ + p_i1171_9_ + p_i1171_8_, p_i1171_1_.field_78801_a, p_i1171_1_.field_78799_b);
      this.quads[1] = new TexturedQuad(new PositionTextureVertex[]{var23, positiontexturevertex3, positiontexturevertex6, positiontexturevertex2}, p_i1171_2_, p_i1171_3_ + p_i1171_9_, p_i1171_2_ + p_i1171_9_, p_i1171_3_ + p_i1171_9_ + p_i1171_8_, p_i1171_1_.field_78801_a, p_i1171_1_.field_78799_b);
      this.quads[2] = new TexturedQuad(new PositionTextureVertex[]{positiontexturevertex4, positiontexturevertex3, var23, positiontexturevertex}, p_i1171_2_ + p_i1171_9_, p_i1171_3_, p_i1171_2_ + p_i1171_9_ + p_i1171_7_, p_i1171_3_ + p_i1171_9_, p_i1171_1_.field_78801_a, p_i1171_1_.field_78799_b);
      this.quads[3] = new TexturedQuad(new PositionTextureVertex[]{positiontexturevertex1, positiontexturevertex2, positiontexturevertex6, positiontexturevertex5}, p_i1171_2_ + p_i1171_9_ + p_i1171_7_, p_i1171_3_ + p_i1171_9_, p_i1171_2_ + p_i1171_9_ + p_i1171_7_ + p_i1171_7_, p_i1171_3_, p_i1171_1_.field_78801_a, p_i1171_1_.field_78799_b);
      this.quads[4] = new TexturedQuad(new PositionTextureVertex[]{positiontexturevertex, var23, positiontexturevertex2, positiontexturevertex1}, p_i1171_2_ + p_i1171_9_, p_i1171_3_ + p_i1171_9_, p_i1171_2_ + p_i1171_9_ + p_i1171_7_, p_i1171_3_ + p_i1171_9_ + p_i1171_8_, p_i1171_1_.field_78801_a, p_i1171_1_.field_78799_b);
      this.quads[5] = new TexturedQuad(new PositionTextureVertex[]{positiontexturevertex3, positiontexturevertex4, positiontexturevertex5, positiontexturevertex6}, p_i1171_2_ + p_i1171_9_ + p_i1171_7_ + p_i1171_9_, p_i1171_3_ + p_i1171_9_, p_i1171_2_ + p_i1171_9_ + p_i1171_7_ + p_i1171_9_ + p_i1171_7_, p_i1171_3_ + p_i1171_9_ + p_i1171_8_, p_i1171_1_.field_78801_a, p_i1171_1_.field_78799_b);
      if (p_i1171_1_.field_78809_i) {
         for(int j1 = 0; j1 < this.quads.length; ++j1) {
            this.quads[j1].func_78235_a();
         }
      }

   }

   public void updateVertexPositions(ModelRenderer p_i1171_1_) {
      float f4 = this.offsetX + this.resX;
      float f5 = this.offsetY + this.resY;
      float f6 = this.offsetZ + this.resZ;
      int p_i1171_2_ = (int)this.txOffsetX;
      int p_i1171_3_ = (int)this.txOffsetY;
      int p_i1171_7_ = (int)this.originalResX;
      int p_i1171_8_ = (int)this.originalResY;
      int p_i1171_9_ = (int)this.originalResZ;
      if (p_i1171_1_.field_78809_i) {
         float positiontexturevertex7 = f4;
         f4 = this.offsetX;
         this.offsetX = positiontexturevertex7;
      }

      PositionTextureVertex var19 = new PositionTextureVertex(this.offsetX, this.offsetY, this.offsetZ, 0.0F, 0.0F);
      PositionTextureVertex positiontexturevertex = new PositionTextureVertex(f4, this.offsetY, this.offsetZ, 0.0F, 8.0F);
      PositionTextureVertex positiontexturevertex1 = new PositionTextureVertex(f4, f5, this.offsetZ, 8.0F, 8.0F);
      PositionTextureVertex positiontexturevertex2 = new PositionTextureVertex(this.offsetX, f5, this.offsetZ, 8.0F, 0.0F);
      PositionTextureVertex positiontexturevertex3 = new PositionTextureVertex(this.offsetX, this.offsetY, f6, 0.0F, 0.0F);
      PositionTextureVertex positiontexturevertex4 = new PositionTextureVertex(f4, this.offsetY, f6, 0.0F, 8.0F);
      PositionTextureVertex positiontexturevertex5 = new PositionTextureVertex(f4, f5, f6, 8.0F, 8.0F);
      PositionTextureVertex positiontexturevertex6 = new PositionTextureVertex(this.offsetX, f5, f6, 8.0F, 0.0F);
      this.vertices[0] = var19;
      this.vertices[1] = positiontexturevertex;
      this.vertices[2] = positiontexturevertex1;
      this.vertices[3] = positiontexturevertex2;
      this.vertices[4] = positiontexturevertex3;
      this.vertices[5] = positiontexturevertex4;
      this.vertices[6] = positiontexturevertex5;
      this.vertices[7] = positiontexturevertex6;
      this.quads[0] = new TexturedQuad(new PositionTextureVertex[]{positiontexturevertex4, positiontexturevertex, positiontexturevertex1, positiontexturevertex5}, p_i1171_2_ + p_i1171_9_ + p_i1171_7_, p_i1171_3_ + p_i1171_9_, p_i1171_2_ + p_i1171_9_ + p_i1171_7_ + p_i1171_9_, p_i1171_3_ + p_i1171_9_ + p_i1171_8_, p_i1171_1_.field_78801_a, p_i1171_1_.field_78799_b);
      this.quads[1] = new TexturedQuad(new PositionTextureVertex[]{var19, positiontexturevertex3, positiontexturevertex6, positiontexturevertex2}, p_i1171_2_, p_i1171_3_ + p_i1171_9_, p_i1171_2_ + p_i1171_9_, p_i1171_3_ + p_i1171_9_ + p_i1171_8_, p_i1171_1_.field_78801_a, p_i1171_1_.field_78799_b);
      this.quads[2] = new TexturedQuad(new PositionTextureVertex[]{positiontexturevertex4, positiontexturevertex3, var19, positiontexturevertex}, p_i1171_2_ + p_i1171_9_, p_i1171_3_, p_i1171_2_ + p_i1171_9_ + p_i1171_7_, p_i1171_3_ + p_i1171_9_, p_i1171_1_.field_78801_a, p_i1171_1_.field_78799_b);
      this.quads[3] = new TexturedQuad(new PositionTextureVertex[]{positiontexturevertex1, positiontexturevertex2, positiontexturevertex6, positiontexturevertex5}, p_i1171_2_ + p_i1171_9_ + p_i1171_7_, p_i1171_3_ + p_i1171_9_, p_i1171_2_ + p_i1171_9_ + p_i1171_7_ + p_i1171_7_, p_i1171_3_, p_i1171_1_.field_78801_a, p_i1171_1_.field_78799_b);
      this.quads[4] = new TexturedQuad(new PositionTextureVertex[]{positiontexturevertex, var19, positiontexturevertex2, positiontexturevertex1}, p_i1171_2_ + p_i1171_9_, p_i1171_3_ + p_i1171_9_, p_i1171_2_ + p_i1171_9_ + p_i1171_7_, p_i1171_3_ + p_i1171_9_ + p_i1171_8_, p_i1171_1_.field_78801_a, p_i1171_1_.field_78799_b);
      this.quads[5] = new TexturedQuad(new PositionTextureVertex[]{positiontexturevertex3, positiontexturevertex4, positiontexturevertex5, positiontexturevertex6}, p_i1171_2_ + p_i1171_9_ + p_i1171_7_ + p_i1171_9_, p_i1171_3_ + p_i1171_9_, p_i1171_2_ + p_i1171_9_ + p_i1171_7_ + p_i1171_9_ + p_i1171_7_, p_i1171_3_ + p_i1171_9_ + p_i1171_8_, p_i1171_1_.field_78801_a, p_i1171_1_.field_78799_b);
      if (p_i1171_1_.field_78809_i) {
         for(int j1 = 0; j1 < this.quads.length; ++j1) {
            this.quads[j1].func_78235_a();
         }

         this.offsetX = f4;
      }

   }

   public void func_78245_a(Tessellator p_78245_1_, float p_78245_2_) {
      for(int i = 0; i < this.quads.length; ++i) {
         this.quads[i].func_78236_a(p_78245_1_, p_78245_2_);
      }

   }

   public void offsetTextureQuad(ModelRenderer argModel, int argID, float argX, float argY) {
      System.out.println("Offseting the Texture");
      if (argID >= 0 & argID < this.quads.length) {
         this.quads[argID].field_78239_a[0].field_78241_b += argX / argModel.field_78801_a;
         this.quads[argID].field_78239_a[1].field_78241_b += argX / argModel.field_78801_a;
         this.quads[argID].field_78239_a[2].field_78241_b += argX / argModel.field_78801_a;
         this.quads[argID].field_78239_a[3].field_78241_b += argX / argModel.field_78801_a;
         this.quads[argID].field_78239_a[0].field_78242_c += argY / argModel.field_78799_b;
         this.quads[argID].field_78239_a[1].field_78242_c += argY / argModel.field_78799_b;
         this.quads[argID].field_78239_a[2].field_78242_c += argY / argModel.field_78799_b;
         this.quads[argID].field_78239_a[3].field_78242_c += argY / argModel.field_78799_b;
      }

   }

   public void resize(float argX, float argY, float argZ) {
      this.resX = argX;
      this.resY = argY;
      this.resZ = argZ;
   }

   public void offset(float argX, float argY, float argZ) {
      this.offsetX = argX;
      this.offsetY = argY;
      this.offsetZ = argZ;
   }

   public void offset_add(float argX, float argY, float argZ) {
      this.offsetX += argX;
      this.offsetY += argY;
      this.offsetZ += argZ;
   }
}
