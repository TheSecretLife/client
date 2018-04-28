package api.player.model;

import java.util.Random;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.TextureOffset;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public abstract class ModelPlayerBase {
   protected final ModelPlayer modelPlayer;
   protected final IModelPlayer modelPlayerAPI;
   private final ModelPlayerAPI internalModelPlayerAPI;

   public ModelPlayerBase(ModelPlayerAPI modelPlayerAPI) {
      this.internalModelPlayerAPI = modelPlayerAPI;
      this.modelPlayerAPI = modelPlayerAPI.modelPlayer;
      this.modelPlayer = modelPlayerAPI.modelPlayer.getModelPlayer();
   }

   public void beforeBaseAttach(boolean onTheFly) {
   }

   public void afterBaseAttach(boolean onTheFly) {
   }

   public void beforeLocalConstructing(float paramFloat) {
   }

   public void afterLocalConstructing(float paramFloat) {
   }

   public void beforeBaseDetach(boolean onTheFly) {
   }

   public void afterBaseDetach(boolean onTheFly) {
   }

   public Object dynamic(String key, Object[] parameters) {
      return this.internalModelPlayerAPI.dynamicOverwritten(key, parameters, this);
   }

   public final int hashCode() {
      return super.hashCode();
   }

   public void beforeGetRandomModelBox(Random paramRandom) {
   }

   public ModelRenderer getRandomModelBox(Random paramRandom) {
      ModelPlayerBase overwritten = this.internalModelPlayerAPI.GetOverwrittenGetRandomModelBox(this);
      ModelRenderer _result;
      if (overwritten == null) {
         _result = this.modelPlayerAPI.localGetRandomModelBox(paramRandom);
      } else if (overwritten != this) {
         _result = overwritten.getRandomModelBox(paramRandom);
      } else {
         _result = null;
      }

      return _result;
   }

   public void afterGetRandomModelBox(Random paramRandom) {
   }

   public void beforeGetTextureOffset(String paramString) {
   }

   public TextureOffset getTextureOffset(String paramString) {
      ModelPlayerBase overwritten = this.internalModelPlayerAPI.GetOverwrittenGetTextureOffset(this);
      TextureOffset _result;
      if (overwritten == null) {
         _result = this.modelPlayerAPI.localGetTextureOffset(paramString);
      } else if (overwritten != this) {
         _result = overwritten.getTextureOffset(paramString);
      } else {
         _result = null;
      }

      return _result;
   }

   public void afterGetTextureOffset(String paramString) {
   }

   public void beforeRender(Entity paramEntity, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
   }

   public void render(Entity paramEntity, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
      ModelPlayerBase overwritten = this.internalModelPlayerAPI.GetOverwrittenRender(this);
      if (overwritten == null) {
         this.modelPlayerAPI.localRender(paramEntity, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
      } else if (overwritten != this) {
         overwritten.render(paramEntity, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
      }

   }

   public void afterRender(Entity paramEntity, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
   }

   public void beforeRenderCloak(float paramFloat) {
   }

   public void renderCloak(float paramFloat) {
      ModelPlayerBase overwritten = this.internalModelPlayerAPI.GetOverwrittenRenderCloak(this);
      if (overwritten == null) {
         this.modelPlayerAPI.localRenderCloak(paramFloat);
      } else if (overwritten != this) {
         overwritten.renderCloak(paramFloat);
      }

   }

   public void afterRenderCloak(float paramFloat) {
   }

   public void beforeRenderEars(float paramFloat) {
   }

   public void renderEars(float paramFloat) {
      ModelPlayerBase overwritten = this.internalModelPlayerAPI.GetOverwrittenRenderEars(this);
      if (overwritten == null) {
         this.modelPlayerAPI.localRenderEars(paramFloat);
      } else if (overwritten != this) {
         overwritten.renderEars(paramFloat);
      }

   }

   public void afterRenderEars(float paramFloat) {
   }

   public void beforeSetLivingAnimations(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3) {
   }

   public void setLivingAnimations(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3) {
      ModelPlayerBase overwritten = this.internalModelPlayerAPI.GetOverwrittenSetLivingAnimations(this);
      if (overwritten == null) {
         this.modelPlayerAPI.localSetLivingAnimations(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3);
      } else if (overwritten != this) {
         overwritten.setLivingAnimations(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3);
      }

   }

   public void afterSetLivingAnimations(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3) {
   }

   public void beforeSetRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramEntity) {
   }

   public void setRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramEntity) {
      ModelPlayerBase overwritten = this.internalModelPlayerAPI.GetOverwrittenSetRotationAngles(this);
      if (overwritten == null) {
         this.modelPlayerAPI.localSetRotationAngles(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramEntity);
      } else if (overwritten != this) {
         overwritten.setRotationAngles(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramEntity);
      }

   }

   public void afterSetRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramEntity) {
   }

   public void beforeSetTextureOffset(String paramString, int paramInt1, int paramInt2) {
   }

   public void setTextureOffset(String paramString, int paramInt1, int paramInt2) {
      ModelPlayerBase overwritten = this.internalModelPlayerAPI.GetOverwrittenSetTextureOffset(this);
      if (overwritten == null) {
         this.modelPlayerAPI.localSetTextureOffset(paramString, paramInt1, paramInt2);
      } else if (overwritten != this) {
         overwritten.setTextureOffset(paramString, paramInt1, paramInt2);
      }

   }

   public void afterSetTextureOffset(String paramString, int paramInt1, int paramInt2) {
   }
}
