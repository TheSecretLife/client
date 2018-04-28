package api.player.render;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public abstract class RenderPlayerBase {
   protected final RenderPlayer renderPlayer;
   protected final IRenderPlayer renderPlayerAPI;
   private final RenderPlayerAPI internalRenderPlayerAPI;

   public RenderPlayerBase(RenderPlayerAPI renderPlayerAPI) {
      this.internalRenderPlayerAPI = renderPlayerAPI;
      this.renderPlayerAPI = renderPlayerAPI.renderPlayer;
      this.renderPlayer = renderPlayerAPI.renderPlayer.getRenderPlayer();
   }

   public void beforeBaseAttach(boolean onTheFly) {
   }

   public void afterBaseAttach(boolean onTheFly) {
   }

   public void beforeLocalConstructing() {
   }

   public void afterLocalConstructing() {
   }

   public void beforeBaseDetach(boolean onTheFly) {
   }

   public void afterBaseDetach(boolean onTheFly) {
   }

   public Object dynamic(String key, Object[] parameters) {
      return this.internalRenderPlayerAPI.dynamicOverwritten(key, parameters, this);
   }

   public final int hashCode() {
      return super.hashCode();
   }

   public void beforeDoRenderLabel(EntityLivingBase paramEntityLivingBase) {
   }

   public boolean doRenderLabel(EntityLivingBase paramEntityLivingBase) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenDoRenderLabel(this);
      boolean _result;
      if (overwritten == null) {
         _result = this.renderPlayerAPI.localDoRenderLabel(paramEntityLivingBase);
      } else if (overwritten != this) {
         _result = overwritten.doRenderLabel(paramEntityLivingBase);
      } else {
         _result = false;
      }

      return _result;
   }

   public void afterDoRenderLabel(EntityLivingBase paramEntityLivingBase) {
   }

   public void beforeDoRenderShadowAndFire(Entity paramEntity, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
   }

   public void doRenderShadowAndFire(Entity paramEntity, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenDoRenderShadowAndFire(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localDoRenderShadowAndFire(paramEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
      } else if (overwritten != this) {
         overwritten.doRenderShadowAndFire(paramEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
      }

   }

   public void afterDoRenderShadowAndFire(Entity paramEntity, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
   }

   public void beforeGetColorMultiplier(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2) {
   }

   public int getColorMultiplier(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenGetColorMultiplier(this);
      int _result;
      if (overwritten == null) {
         _result = this.renderPlayerAPI.localGetColorMultiplier(paramEntityLivingBase, paramFloat1, paramFloat2);
      } else if (overwritten != this) {
         _result = overwritten.getColorMultiplier(paramEntityLivingBase, paramFloat1, paramFloat2);
      } else {
         _result = 0;
      }

      return _result;
   }

   public void afterGetColorMultiplier(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2) {
   }

   public void beforeGetDeathMaxRotation(EntityLivingBase paramEntityLivingBase) {
   }

   public float getDeathMaxRotation(EntityLivingBase paramEntityLivingBase) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenGetDeathMaxRotation(this);
      float _result;
      if (overwritten == null) {
         _result = this.renderPlayerAPI.localGetDeathMaxRotation(paramEntityLivingBase);
      } else if (overwritten != this) {
         _result = overwritten.getDeathMaxRotation(paramEntityLivingBase);
      } else {
         _result = 0.0F;
      }

      return _result;
   }

   public void afterGetDeathMaxRotation(EntityLivingBase paramEntityLivingBase) {
   }

   public void beforeGetFontRendererFromRenderManager() {
   }

   public FontRenderer getFontRendererFromRenderManager() {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenGetFontRendererFromRenderManager(this);
      FontRenderer _result;
      if (overwritten == null) {
         _result = this.renderPlayerAPI.localGetFontRendererFromRenderManager();
      } else if (overwritten != this) {
         _result = overwritten.getFontRendererFromRenderManager();
      } else {
         _result = null;
      }

      return _result;
   }

   public void afterGetFontRendererFromRenderManager() {
   }

   public void beforeGetResourceLocationFromPlayer(AbstractClientPlayer paramAbstractClientPlayer) {
   }

   public ResourceLocation getResourceLocationFromPlayer(AbstractClientPlayer paramAbstractClientPlayer) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenGetResourceLocationFromPlayer(this);
      ResourceLocation _result;
      if (overwritten == null) {
         _result = this.renderPlayerAPI.localGetResourceLocationFromPlayer(paramAbstractClientPlayer);
      } else if (overwritten != this) {
         _result = overwritten.getResourceLocationFromPlayer(paramAbstractClientPlayer);
      } else {
         _result = null;
      }

      return _result;
   }

   public void afterGetResourceLocationFromPlayer(AbstractClientPlayer paramAbstractClientPlayer) {
   }

   public void beforeHandleRotationFloat(EntityLivingBase paramEntityLivingBase, float paramFloat) {
   }

   public float handleRotationFloat(EntityLivingBase paramEntityLivingBase, float paramFloat) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenHandleRotationFloat(this);
      float _result;
      if (overwritten == null) {
         _result = this.renderPlayerAPI.localHandleRotationFloat(paramEntityLivingBase, paramFloat);
      } else if (overwritten != this) {
         _result = overwritten.handleRotationFloat(paramEntityLivingBase, paramFloat);
      } else {
         _result = 0.0F;
      }

      return _result;
   }

   public void afterHandleRotationFloat(EntityLivingBase paramEntityLivingBase, float paramFloat) {
   }

   public void beforeInheritRenderPass(EntityLivingBase paramEntityLivingBase, int paramInt, float paramFloat) {
   }

   public int inheritRenderPass(EntityLivingBase paramEntityLivingBase, int paramInt, float paramFloat) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenInheritRenderPass(this);
      int _result;
      if (overwritten == null) {
         _result = this.renderPlayerAPI.localInheritRenderPass(paramEntityLivingBase, paramInt, paramFloat);
      } else if (overwritten != this) {
         _result = overwritten.inheritRenderPass(paramEntityLivingBase, paramInt, paramFloat);
      } else {
         _result = 0;
      }

      return _result;
   }

   public void afterInheritRenderPass(EntityLivingBase paramEntityLivingBase, int paramInt, float paramFloat) {
   }

   public void beforeLoadTexture(ResourceLocation paramResourceLocation) {
   }

   public void loadTexture(ResourceLocation paramResourceLocation) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenLoadTexture(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localLoadTexture(paramResourceLocation);
      } else if (overwritten != this) {
         overwritten.loadTexture(paramResourceLocation);
      }

   }

   public void afterLoadTexture(ResourceLocation paramResourceLocation) {
   }

   public void beforeLoadTextureOfEntity(Entity paramEntity) {
   }

   public void loadTextureOfEntity(Entity paramEntity) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenLoadTextureOfEntity(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localLoadTextureOfEntity(paramEntity);
      } else if (overwritten != this) {
         overwritten.loadTextureOfEntity(paramEntity);
      }

   }

   public void afterLoadTextureOfEntity(Entity paramEntity) {
   }

   public void beforePassSpecialRender(EntityLivingBase paramEntityLivingBase, double paramDouble1, double paramDouble2, double paramDouble3) {
   }

   public void passSpecialRender(EntityLivingBase paramEntityLivingBase, double paramDouble1, double paramDouble2, double paramDouble3) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenPassSpecialRender(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localPassSpecialRender(paramEntityLivingBase, paramDouble1, paramDouble2, paramDouble3);
      } else if (overwritten != this) {
         overwritten.passSpecialRender(paramEntityLivingBase, paramDouble1, paramDouble2, paramDouble3);
      }

   }

   public void afterPassSpecialRender(EntityLivingBase paramEntityLivingBase, double paramDouble1, double paramDouble2, double paramDouble3) {
   }

   public void beforePerformStaticEntityRebuild() {
   }

   public boolean performStaticEntityRebuild() {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenPerformStaticEntityRebuild(this);
      boolean _result;
      if (overwritten == null) {
         _result = this.renderPlayerAPI.localPerformStaticEntityRebuild();
      } else if (overwritten != this) {
         _result = overwritten.performStaticEntityRebuild();
      } else {
         _result = false;
      }

      return _result;
   }

   public void afterPerformStaticEntityRebuild() {
   }

   public void beforeRenderArrowsStuckInEntity(EntityLivingBase paramEntityLivingBase, float paramFloat) {
   }

   public void renderArrowsStuckInEntity(EntityLivingBase paramEntityLivingBase, float paramFloat) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenRenderArrowsStuckInEntity(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localRenderArrowsStuckInEntity(paramEntityLivingBase, paramFloat);
      } else if (overwritten != this) {
         overwritten.renderArrowsStuckInEntity(paramEntityLivingBase, paramFloat);
      }

   }

   public void afterRenderArrowsStuckInEntity(EntityLivingBase paramEntityLivingBase, float paramFloat) {
   }

   public void beforeRenderFirstPersonArm(EntityPlayer paramEntityPlayer) {
   }

   public void renderFirstPersonArm(EntityPlayer paramEntityPlayer) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenRenderFirstPersonArm(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localRenderFirstPersonArm(paramEntityPlayer);
      } else if (overwritten != this) {
         overwritten.renderFirstPersonArm(paramEntityPlayer);
      }

   }

   public void afterRenderFirstPersonArm(EntityPlayer paramEntityPlayer) {
   }

   public void beforeRenderLivingLabel(Entity paramEntity, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
   }

   public void renderLivingLabel(Entity paramEntity, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenRenderLivingLabel(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localRenderLivingLabel(paramEntity, paramString, paramDouble1, paramDouble2, paramDouble3, paramInt);
      } else if (overwritten != this) {
         overwritten.renderLivingLabel(paramEntity, paramString, paramDouble1, paramDouble2, paramDouble3, paramInt);
      }

   }

   public void afterRenderLivingLabel(Entity paramEntity, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
   }

   public void beforeRenderModel(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
   }

   public void renderModel(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenRenderModel(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localRenderModel(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
      } else if (overwritten != this) {
         overwritten.renderModel(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
      }

   }

   public void afterRenderModel(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
   }

   public void beforeRenderPlayer(AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
   }

   public void renderPlayer(AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenRenderPlayer(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localRenderPlayer(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
      } else if (overwritten != this) {
         overwritten.renderPlayer(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
      }

   }

   public void afterRenderPlayer(AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
   }

   public void beforeRenderPlayerNameAndScoreLabel(AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat, double paramDouble4) {
   }

   public void renderPlayerNameAndScoreLabel(AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat, double paramDouble4) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenRenderPlayerNameAndScoreLabel(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localRenderPlayerNameAndScoreLabel(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramString, paramFloat, paramDouble4);
      } else if (overwritten != this) {
         overwritten.renderPlayerNameAndScoreLabel(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramString, paramFloat, paramDouble4);
      }

   }

   public void afterRenderPlayerNameAndScoreLabel(AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat, double paramDouble4) {
   }

   public void beforeRenderPlayerScale(AbstractClientPlayer paramAbstractClientPlayer, float paramFloat) {
   }

   public void renderPlayerScale(AbstractClientPlayer paramAbstractClientPlayer, float paramFloat) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenRenderPlayerScale(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localRenderPlayerScale(paramAbstractClientPlayer, paramFloat);
      } else if (overwritten != this) {
         overwritten.renderPlayerScale(paramAbstractClientPlayer, paramFloat);
      }

   }

   public void afterRenderPlayerScale(AbstractClientPlayer paramAbstractClientPlayer, float paramFloat) {
   }

   public void beforeRenderPlayerSleep(AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3) {
   }

   public void renderPlayerSleep(AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenRenderPlayerSleep(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localRenderPlayerSleep(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3);
      } else if (overwritten != this) {
         overwritten.renderPlayerSleep(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3);
      }

   }

   public void afterRenderPlayerSleep(AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3) {
   }

   public void beforeRenderSpecials(AbstractClientPlayer paramAbstractClientPlayer, float paramFloat) {
   }

   public void renderSpecials(AbstractClientPlayer paramAbstractClientPlayer, float paramFloat) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenRenderSpecials(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localRenderSpecials(paramAbstractClientPlayer, paramFloat);
      } else if (overwritten != this) {
         overwritten.renderSpecials(paramAbstractClientPlayer, paramFloat);
      }

   }

   public void afterRenderSpecials(AbstractClientPlayer paramAbstractClientPlayer, float paramFloat) {
   }

   public void beforeRenderSwingProgress(EntityLivingBase paramEntityLivingBase, float paramFloat) {
   }

   public float renderSwingProgress(EntityLivingBase paramEntityLivingBase, float paramFloat) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenRenderSwingProgress(this);
      float _result;
      if (overwritten == null) {
         _result = this.renderPlayerAPI.localRenderSwingProgress(paramEntityLivingBase, paramFloat);
      } else if (overwritten != this) {
         _result = overwritten.renderSwingProgress(paramEntityLivingBase, paramFloat);
      } else {
         _result = 0.0F;
      }

      return _result;
   }

   public void afterRenderSwingProgress(EntityLivingBase paramEntityLivingBase, float paramFloat) {
   }

   public void beforeRotatePlayer(AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2, float paramFloat3) {
   }

   public void rotatePlayer(AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2, float paramFloat3) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenRotatePlayer(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localRotatePlayer(paramAbstractClientPlayer, paramFloat1, paramFloat2, paramFloat3);
      } else if (overwritten != this) {
         overwritten.rotatePlayer(paramAbstractClientPlayer, paramFloat1, paramFloat2, paramFloat3);
      }

   }

   public void afterRotatePlayer(AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2, float paramFloat3) {
   }

   public void beforeSetArmorModel(AbstractClientPlayer paramAbstractClientPlayer, int paramInt, float paramFloat) {
   }

   public int setArmorModel(AbstractClientPlayer paramAbstractClientPlayer, int paramInt, float paramFloat) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenSetArmorModel(this);
      int _result;
      if (overwritten == null) {
         _result = this.renderPlayerAPI.localSetArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
      } else if (overwritten != this) {
         _result = overwritten.setArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
      } else {
         _result = 0;
      }

      return _result;
   }

   public void afterSetArmorModel(AbstractClientPlayer paramAbstractClientPlayer, int paramInt, float paramFloat) {
   }

   public void beforeSetPassArmorModel(AbstractClientPlayer paramAbstractClientPlayer, int paramInt, float paramFloat) {
   }

   public void setPassArmorModel(AbstractClientPlayer paramAbstractClientPlayer, int paramInt, float paramFloat) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenSetPassArmorModel(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localSetPassArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
      } else if (overwritten != this) {
         overwritten.setPassArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
      }

   }

   public void afterSetPassArmorModel(AbstractClientPlayer paramAbstractClientPlayer, int paramInt, float paramFloat) {
   }

   public void beforeSetRenderManager(RenderManager paramRenderManager) {
   }

   public void setRenderManager(RenderManager paramRenderManager) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenSetRenderManager(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localSetRenderManager(paramRenderManager);
      } else if (overwritten != this) {
         overwritten.setRenderManager(paramRenderManager);
      }

   }

   public void afterSetRenderManager(RenderManager paramRenderManager) {
   }

   public void beforeSetRenderPassModel(ModelBase paramModelBase) {
   }

   public void setRenderPassModel(ModelBase paramModelBase) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenSetRenderPassModel(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localSetRenderPassModel(paramModelBase);
      } else if (overwritten != this) {
         overwritten.setRenderPassModel(paramModelBase);
      }

   }

   public void afterSetRenderPassModel(ModelBase paramModelBase) {
   }

   public void beforeUpdateIcons(IIconRegister paramIIconRegister) {
   }

   public void updateIcons(IIconRegister paramIIconRegister) {
      RenderPlayerBase overwritten = this.internalRenderPlayerAPI.GetOverwrittenUpdateIcons(this);
      if (overwritten == null) {
         this.renderPlayerAPI.localUpdateIcons(paramIIconRegister);
      } else if (overwritten != this) {
         overwritten.updateIcons(paramIIconRegister);
      }

   }

   public void afterUpdateIcons(IIconRegister paramIIconRegister) {
   }
}
