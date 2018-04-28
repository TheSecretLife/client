package api.player.render;

import java.util.HashMap;
import java.util.Map;

public final class RenderPlayerBaseSorting {
   private String[] beforeLocalConstructingSuperiors = null;
   private String[] beforeLocalConstructingInferiors = null;
   private String[] afterLocalConstructingSuperiors = null;
   private String[] afterLocalConstructingInferiors = null;
   private Map dynamicBeforeSuperiors = null;
   private Map dynamicBeforeInferiors = null;
   private Map dynamicOverrideSuperiors = null;
   private Map dynamicOverrideInferiors = null;
   private Map dynamicAfterSuperiors = null;
   private Map dynamicAfterInferiors = null;
   private String[] beforeDoRenderLabelSuperiors = null;
   private String[] beforeDoRenderLabelInferiors = null;
   private String[] overrideDoRenderLabelSuperiors = null;
   private String[] overrideDoRenderLabelInferiors = null;
   private String[] afterDoRenderLabelSuperiors = null;
   private String[] afterDoRenderLabelInferiors = null;
   private String[] beforeDoRenderShadowAndFireSuperiors = null;
   private String[] beforeDoRenderShadowAndFireInferiors = null;
   private String[] overrideDoRenderShadowAndFireSuperiors = null;
   private String[] overrideDoRenderShadowAndFireInferiors = null;
   private String[] afterDoRenderShadowAndFireSuperiors = null;
   private String[] afterDoRenderShadowAndFireInferiors = null;
   private String[] beforeGetColorMultiplierSuperiors = null;
   private String[] beforeGetColorMultiplierInferiors = null;
   private String[] overrideGetColorMultiplierSuperiors = null;
   private String[] overrideGetColorMultiplierInferiors = null;
   private String[] afterGetColorMultiplierSuperiors = null;
   private String[] afterGetColorMultiplierInferiors = null;
   private String[] beforeGetDeathMaxRotationSuperiors = null;
   private String[] beforeGetDeathMaxRotationInferiors = null;
   private String[] overrideGetDeathMaxRotationSuperiors = null;
   private String[] overrideGetDeathMaxRotationInferiors = null;
   private String[] afterGetDeathMaxRotationSuperiors = null;
   private String[] afterGetDeathMaxRotationInferiors = null;
   private String[] beforeGetFontRendererFromRenderManagerSuperiors = null;
   private String[] beforeGetFontRendererFromRenderManagerInferiors = null;
   private String[] overrideGetFontRendererFromRenderManagerSuperiors = null;
   private String[] overrideGetFontRendererFromRenderManagerInferiors = null;
   private String[] afterGetFontRendererFromRenderManagerSuperiors = null;
   private String[] afterGetFontRendererFromRenderManagerInferiors = null;
   private String[] beforeGetResourceLocationFromPlayerSuperiors = null;
   private String[] beforeGetResourceLocationFromPlayerInferiors = null;
   private String[] overrideGetResourceLocationFromPlayerSuperiors = null;
   private String[] overrideGetResourceLocationFromPlayerInferiors = null;
   private String[] afterGetResourceLocationFromPlayerSuperiors = null;
   private String[] afterGetResourceLocationFromPlayerInferiors = null;
   private String[] beforeHandleRotationFloatSuperiors = null;
   private String[] beforeHandleRotationFloatInferiors = null;
   private String[] overrideHandleRotationFloatSuperiors = null;
   private String[] overrideHandleRotationFloatInferiors = null;
   private String[] afterHandleRotationFloatSuperiors = null;
   private String[] afterHandleRotationFloatInferiors = null;
   private String[] beforeInheritRenderPassSuperiors = null;
   private String[] beforeInheritRenderPassInferiors = null;
   private String[] overrideInheritRenderPassSuperiors = null;
   private String[] overrideInheritRenderPassInferiors = null;
   private String[] afterInheritRenderPassSuperiors = null;
   private String[] afterInheritRenderPassInferiors = null;
   private String[] beforeLoadTextureSuperiors = null;
   private String[] beforeLoadTextureInferiors = null;
   private String[] overrideLoadTextureSuperiors = null;
   private String[] overrideLoadTextureInferiors = null;
   private String[] afterLoadTextureSuperiors = null;
   private String[] afterLoadTextureInferiors = null;
   private String[] beforeLoadTextureOfEntitySuperiors = null;
   private String[] beforeLoadTextureOfEntityInferiors = null;
   private String[] overrideLoadTextureOfEntitySuperiors = null;
   private String[] overrideLoadTextureOfEntityInferiors = null;
   private String[] afterLoadTextureOfEntitySuperiors = null;
   private String[] afterLoadTextureOfEntityInferiors = null;
   private String[] beforePassSpecialRenderSuperiors = null;
   private String[] beforePassSpecialRenderInferiors = null;
   private String[] overridePassSpecialRenderSuperiors = null;
   private String[] overridePassSpecialRenderInferiors = null;
   private String[] afterPassSpecialRenderSuperiors = null;
   private String[] afterPassSpecialRenderInferiors = null;
   private String[] beforePerformStaticEntityRebuildSuperiors = null;
   private String[] beforePerformStaticEntityRebuildInferiors = null;
   private String[] overridePerformStaticEntityRebuildSuperiors = null;
   private String[] overridePerformStaticEntityRebuildInferiors = null;
   private String[] afterPerformStaticEntityRebuildSuperiors = null;
   private String[] afterPerformStaticEntityRebuildInferiors = null;
   private String[] beforeRenderArrowsStuckInEntitySuperiors = null;
   private String[] beforeRenderArrowsStuckInEntityInferiors = null;
   private String[] overrideRenderArrowsStuckInEntitySuperiors = null;
   private String[] overrideRenderArrowsStuckInEntityInferiors = null;
   private String[] afterRenderArrowsStuckInEntitySuperiors = null;
   private String[] afterRenderArrowsStuckInEntityInferiors = null;
   private String[] beforeRenderFirstPersonArmSuperiors = null;
   private String[] beforeRenderFirstPersonArmInferiors = null;
   private String[] overrideRenderFirstPersonArmSuperiors = null;
   private String[] overrideRenderFirstPersonArmInferiors = null;
   private String[] afterRenderFirstPersonArmSuperiors = null;
   private String[] afterRenderFirstPersonArmInferiors = null;
   private String[] beforeRenderLivingLabelSuperiors = null;
   private String[] beforeRenderLivingLabelInferiors = null;
   private String[] overrideRenderLivingLabelSuperiors = null;
   private String[] overrideRenderLivingLabelInferiors = null;
   private String[] afterRenderLivingLabelSuperiors = null;
   private String[] afterRenderLivingLabelInferiors = null;
   private String[] beforeRenderModelSuperiors = null;
   private String[] beforeRenderModelInferiors = null;
   private String[] overrideRenderModelSuperiors = null;
   private String[] overrideRenderModelInferiors = null;
   private String[] afterRenderModelSuperiors = null;
   private String[] afterRenderModelInferiors = null;
   private String[] beforeRenderPlayerSuperiors = null;
   private String[] beforeRenderPlayerInferiors = null;
   private String[] overrideRenderPlayerSuperiors = null;
   private String[] overrideRenderPlayerInferiors = null;
   private String[] afterRenderPlayerSuperiors = null;
   private String[] afterRenderPlayerInferiors = null;
   private String[] beforeRenderPlayerNameAndScoreLabelSuperiors = null;
   private String[] beforeRenderPlayerNameAndScoreLabelInferiors = null;
   private String[] overrideRenderPlayerNameAndScoreLabelSuperiors = null;
   private String[] overrideRenderPlayerNameAndScoreLabelInferiors = null;
   private String[] afterRenderPlayerNameAndScoreLabelSuperiors = null;
   private String[] afterRenderPlayerNameAndScoreLabelInferiors = null;
   private String[] beforeRenderPlayerScaleSuperiors = null;
   private String[] beforeRenderPlayerScaleInferiors = null;
   private String[] overrideRenderPlayerScaleSuperiors = null;
   private String[] overrideRenderPlayerScaleInferiors = null;
   private String[] afterRenderPlayerScaleSuperiors = null;
   private String[] afterRenderPlayerScaleInferiors = null;
   private String[] beforeRenderPlayerSleepSuperiors = null;
   private String[] beforeRenderPlayerSleepInferiors = null;
   private String[] overrideRenderPlayerSleepSuperiors = null;
   private String[] overrideRenderPlayerSleepInferiors = null;
   private String[] afterRenderPlayerSleepSuperiors = null;
   private String[] afterRenderPlayerSleepInferiors = null;
   private String[] beforeRenderSpecialsSuperiors = null;
   private String[] beforeRenderSpecialsInferiors = null;
   private String[] overrideRenderSpecialsSuperiors = null;
   private String[] overrideRenderSpecialsInferiors = null;
   private String[] afterRenderSpecialsSuperiors = null;
   private String[] afterRenderSpecialsInferiors = null;
   private String[] beforeRenderSwingProgressSuperiors = null;
   private String[] beforeRenderSwingProgressInferiors = null;
   private String[] overrideRenderSwingProgressSuperiors = null;
   private String[] overrideRenderSwingProgressInferiors = null;
   private String[] afterRenderSwingProgressSuperiors = null;
   private String[] afterRenderSwingProgressInferiors = null;
   private String[] beforeRotatePlayerSuperiors = null;
   private String[] beforeRotatePlayerInferiors = null;
   private String[] overrideRotatePlayerSuperiors = null;
   private String[] overrideRotatePlayerInferiors = null;
   private String[] afterRotatePlayerSuperiors = null;
   private String[] afterRotatePlayerInferiors = null;
   private String[] beforeSetArmorModelSuperiors = null;
   private String[] beforeSetArmorModelInferiors = null;
   private String[] overrideSetArmorModelSuperiors = null;
   private String[] overrideSetArmorModelInferiors = null;
   private String[] afterSetArmorModelSuperiors = null;
   private String[] afterSetArmorModelInferiors = null;
   private String[] beforeSetPassArmorModelSuperiors = null;
   private String[] beforeSetPassArmorModelInferiors = null;
   private String[] overrideSetPassArmorModelSuperiors = null;
   private String[] overrideSetPassArmorModelInferiors = null;
   private String[] afterSetPassArmorModelSuperiors = null;
   private String[] afterSetPassArmorModelInferiors = null;
   private String[] beforeSetRenderManagerSuperiors = null;
   private String[] beforeSetRenderManagerInferiors = null;
   private String[] overrideSetRenderManagerSuperiors = null;
   private String[] overrideSetRenderManagerInferiors = null;
   private String[] afterSetRenderManagerSuperiors = null;
   private String[] afterSetRenderManagerInferiors = null;
   private String[] beforeSetRenderPassModelSuperiors = null;
   private String[] beforeSetRenderPassModelInferiors = null;
   private String[] overrideSetRenderPassModelSuperiors = null;
   private String[] overrideSetRenderPassModelInferiors = null;
   private String[] afterSetRenderPassModelSuperiors = null;
   private String[] afterSetRenderPassModelInferiors = null;
   private String[] beforeUpdateIconsSuperiors = null;
   private String[] beforeUpdateIconsInferiors = null;
   private String[] overrideUpdateIconsSuperiors = null;
   private String[] overrideUpdateIconsInferiors = null;
   private String[] afterUpdateIconsSuperiors = null;
   private String[] afterUpdateIconsInferiors = null;

   public String[] getBeforeLocalConstructingSuperiors() {
      return this.beforeLocalConstructingSuperiors;
   }

   public String[] getBeforeLocalConstructingInferiors() {
      return this.beforeLocalConstructingInferiors;
   }

   public String[] getAfterLocalConstructingSuperiors() {
      return this.afterLocalConstructingSuperiors;
   }

   public String[] getAfterLocalConstructingInferiors() {
      return this.afterLocalConstructingInferiors;
   }

   public void setBeforeLocalConstructingSuperiors(String[] value) {
      this.beforeLocalConstructingSuperiors = value;
   }

   public void setBeforeLocalConstructingInferiors(String[] value) {
      this.beforeLocalConstructingInferiors = value;
   }

   public void setAfterLocalConstructingSuperiors(String[] value) {
      this.afterLocalConstructingSuperiors = value;
   }

   public void setAfterLocalConstructingInferiors(String[] value) {
      this.afterLocalConstructingInferiors = value;
   }

   public Map getDynamicBeforeSuperiors() {
      return this.dynamicBeforeSuperiors;
   }

   public Map getDynamicBeforeInferiors() {
      return this.dynamicBeforeInferiors;
   }

   public Map getDynamicOverrideSuperiors() {
      return this.dynamicOverrideSuperiors;
   }

   public Map getDynamicOverrideInferiors() {
      return this.dynamicOverrideInferiors;
   }

   public Map getDynamicAfterSuperiors() {
      return this.dynamicAfterSuperiors;
   }

   public Map getDynamicAfterInferiors() {
      return this.dynamicAfterInferiors;
   }

   public void setDynamicBeforeSuperiors(String name, String[] superiors) {
      this.dynamicBeforeSuperiors = this.setDynamic(name, superiors, this.dynamicBeforeSuperiors);
   }

   public void setDynamicBeforeInferiors(String name, String[] inferiors) {
      this.dynamicBeforeInferiors = this.setDynamic(name, inferiors, this.dynamicBeforeInferiors);
   }

   public void setDynamicOverrideSuperiors(String name, String[] superiors) {
      this.dynamicOverrideSuperiors = this.setDynamic(name, superiors, this.dynamicOverrideSuperiors);
   }

   public void setDynamicOverrideInferiors(String name, String[] inferiors) {
      this.dynamicOverrideInferiors = this.setDynamic(name, inferiors, this.dynamicOverrideInferiors);
   }

   public void setDynamicAfterSuperiors(String name, String[] superiors) {
      this.dynamicAfterSuperiors = this.setDynamic(name, superiors, this.dynamicAfterSuperiors);
   }

   public void setDynamicAfterInferiors(String name, String[] inferiors) {
      this.dynamicAfterInferiors = this.setDynamic(name, inferiors, this.dynamicAfterInferiors);
   }

   private Map setDynamic(String name, String[] names, Map map) {
      if (name == null) {
         throw new IllegalArgumentException("Parameter 'name' may not be null");
      } else if (names == null) {
         if (map != null) {
            ((Map)map).remove(name);
         }

         return (Map)map;
      } else {
         if (map == null) {
            map = new HashMap();
         }

         ((Map)map).put(name, names);
         return (Map)map;
      }
   }

   public String[] getBeforeDoRenderLabelSuperiors() {
      return this.beforeDoRenderLabelSuperiors;
   }

   public String[] getBeforeDoRenderLabelInferiors() {
      return this.beforeDoRenderLabelInferiors;
   }

   public String[] getOverrideDoRenderLabelSuperiors() {
      return this.overrideDoRenderLabelSuperiors;
   }

   public String[] getOverrideDoRenderLabelInferiors() {
      return this.overrideDoRenderLabelInferiors;
   }

   public String[] getAfterDoRenderLabelSuperiors() {
      return this.afterDoRenderLabelSuperiors;
   }

   public String[] getAfterDoRenderLabelInferiors() {
      return this.afterDoRenderLabelInferiors;
   }

   public void setBeforeDoRenderLabelSuperiors(String[] value) {
      this.beforeDoRenderLabelSuperiors = value;
   }

   public void setBeforeDoRenderLabelInferiors(String[] value) {
      this.beforeDoRenderLabelInferiors = value;
   }

   public void setOverrideDoRenderLabelSuperiors(String[] value) {
      this.overrideDoRenderLabelSuperiors = value;
   }

   public void setOverrideDoRenderLabelInferiors(String[] value) {
      this.overrideDoRenderLabelInferiors = value;
   }

   public void setAfterDoRenderLabelSuperiors(String[] value) {
      this.afterDoRenderLabelSuperiors = value;
   }

   public void setAfterDoRenderLabelInferiors(String[] value) {
      this.afterDoRenderLabelInferiors = value;
   }

   public String[] getBeforeDoRenderShadowAndFireSuperiors() {
      return this.beforeDoRenderShadowAndFireSuperiors;
   }

   public String[] getBeforeDoRenderShadowAndFireInferiors() {
      return this.beforeDoRenderShadowAndFireInferiors;
   }

   public String[] getOverrideDoRenderShadowAndFireSuperiors() {
      return this.overrideDoRenderShadowAndFireSuperiors;
   }

   public String[] getOverrideDoRenderShadowAndFireInferiors() {
      return this.overrideDoRenderShadowAndFireInferiors;
   }

   public String[] getAfterDoRenderShadowAndFireSuperiors() {
      return this.afterDoRenderShadowAndFireSuperiors;
   }

   public String[] getAfterDoRenderShadowAndFireInferiors() {
      return this.afterDoRenderShadowAndFireInferiors;
   }

   public void setBeforeDoRenderShadowAndFireSuperiors(String[] value) {
      this.beforeDoRenderShadowAndFireSuperiors = value;
   }

   public void setBeforeDoRenderShadowAndFireInferiors(String[] value) {
      this.beforeDoRenderShadowAndFireInferiors = value;
   }

   public void setOverrideDoRenderShadowAndFireSuperiors(String[] value) {
      this.overrideDoRenderShadowAndFireSuperiors = value;
   }

   public void setOverrideDoRenderShadowAndFireInferiors(String[] value) {
      this.overrideDoRenderShadowAndFireInferiors = value;
   }

   public void setAfterDoRenderShadowAndFireSuperiors(String[] value) {
      this.afterDoRenderShadowAndFireSuperiors = value;
   }

   public void setAfterDoRenderShadowAndFireInferiors(String[] value) {
      this.afterDoRenderShadowAndFireInferiors = value;
   }

   public String[] getBeforeGetColorMultiplierSuperiors() {
      return this.beforeGetColorMultiplierSuperiors;
   }

   public String[] getBeforeGetColorMultiplierInferiors() {
      return this.beforeGetColorMultiplierInferiors;
   }

   public String[] getOverrideGetColorMultiplierSuperiors() {
      return this.overrideGetColorMultiplierSuperiors;
   }

   public String[] getOverrideGetColorMultiplierInferiors() {
      return this.overrideGetColorMultiplierInferiors;
   }

   public String[] getAfterGetColorMultiplierSuperiors() {
      return this.afterGetColorMultiplierSuperiors;
   }

   public String[] getAfterGetColorMultiplierInferiors() {
      return this.afterGetColorMultiplierInferiors;
   }

   public void setBeforeGetColorMultiplierSuperiors(String[] value) {
      this.beforeGetColorMultiplierSuperiors = value;
   }

   public void setBeforeGetColorMultiplierInferiors(String[] value) {
      this.beforeGetColorMultiplierInferiors = value;
   }

   public void setOverrideGetColorMultiplierSuperiors(String[] value) {
      this.overrideGetColorMultiplierSuperiors = value;
   }

   public void setOverrideGetColorMultiplierInferiors(String[] value) {
      this.overrideGetColorMultiplierInferiors = value;
   }

   public void setAfterGetColorMultiplierSuperiors(String[] value) {
      this.afterGetColorMultiplierSuperiors = value;
   }

   public void setAfterGetColorMultiplierInferiors(String[] value) {
      this.afterGetColorMultiplierInferiors = value;
   }

   public String[] getBeforeGetDeathMaxRotationSuperiors() {
      return this.beforeGetDeathMaxRotationSuperiors;
   }

   public String[] getBeforeGetDeathMaxRotationInferiors() {
      return this.beforeGetDeathMaxRotationInferiors;
   }

   public String[] getOverrideGetDeathMaxRotationSuperiors() {
      return this.overrideGetDeathMaxRotationSuperiors;
   }

   public String[] getOverrideGetDeathMaxRotationInferiors() {
      return this.overrideGetDeathMaxRotationInferiors;
   }

   public String[] getAfterGetDeathMaxRotationSuperiors() {
      return this.afterGetDeathMaxRotationSuperiors;
   }

   public String[] getAfterGetDeathMaxRotationInferiors() {
      return this.afterGetDeathMaxRotationInferiors;
   }

   public void setBeforeGetDeathMaxRotationSuperiors(String[] value) {
      this.beforeGetDeathMaxRotationSuperiors = value;
   }

   public void setBeforeGetDeathMaxRotationInferiors(String[] value) {
      this.beforeGetDeathMaxRotationInferiors = value;
   }

   public void setOverrideGetDeathMaxRotationSuperiors(String[] value) {
      this.overrideGetDeathMaxRotationSuperiors = value;
   }

   public void setOverrideGetDeathMaxRotationInferiors(String[] value) {
      this.overrideGetDeathMaxRotationInferiors = value;
   }

   public void setAfterGetDeathMaxRotationSuperiors(String[] value) {
      this.afterGetDeathMaxRotationSuperiors = value;
   }

   public void setAfterGetDeathMaxRotationInferiors(String[] value) {
      this.afterGetDeathMaxRotationInferiors = value;
   }

   public String[] getBeforeGetFontRendererFromRenderManagerSuperiors() {
      return this.beforeGetFontRendererFromRenderManagerSuperiors;
   }

   public String[] getBeforeGetFontRendererFromRenderManagerInferiors() {
      return this.beforeGetFontRendererFromRenderManagerInferiors;
   }

   public String[] getOverrideGetFontRendererFromRenderManagerSuperiors() {
      return this.overrideGetFontRendererFromRenderManagerSuperiors;
   }

   public String[] getOverrideGetFontRendererFromRenderManagerInferiors() {
      return this.overrideGetFontRendererFromRenderManagerInferiors;
   }

   public String[] getAfterGetFontRendererFromRenderManagerSuperiors() {
      return this.afterGetFontRendererFromRenderManagerSuperiors;
   }

   public String[] getAfterGetFontRendererFromRenderManagerInferiors() {
      return this.afterGetFontRendererFromRenderManagerInferiors;
   }

   public void setBeforeGetFontRendererFromRenderManagerSuperiors(String[] value) {
      this.beforeGetFontRendererFromRenderManagerSuperiors = value;
   }

   public void setBeforeGetFontRendererFromRenderManagerInferiors(String[] value) {
      this.beforeGetFontRendererFromRenderManagerInferiors = value;
   }

   public void setOverrideGetFontRendererFromRenderManagerSuperiors(String[] value) {
      this.overrideGetFontRendererFromRenderManagerSuperiors = value;
   }

   public void setOverrideGetFontRendererFromRenderManagerInferiors(String[] value) {
      this.overrideGetFontRendererFromRenderManagerInferiors = value;
   }

   public void setAfterGetFontRendererFromRenderManagerSuperiors(String[] value) {
      this.afterGetFontRendererFromRenderManagerSuperiors = value;
   }

   public void setAfterGetFontRendererFromRenderManagerInferiors(String[] value) {
      this.afterGetFontRendererFromRenderManagerInferiors = value;
   }

   public String[] getBeforeGetResourceLocationFromPlayerSuperiors() {
      return this.beforeGetResourceLocationFromPlayerSuperiors;
   }

   public String[] getBeforeGetResourceLocationFromPlayerInferiors() {
      return this.beforeGetResourceLocationFromPlayerInferiors;
   }

   public String[] getOverrideGetResourceLocationFromPlayerSuperiors() {
      return this.overrideGetResourceLocationFromPlayerSuperiors;
   }

   public String[] getOverrideGetResourceLocationFromPlayerInferiors() {
      return this.overrideGetResourceLocationFromPlayerInferiors;
   }

   public String[] getAfterGetResourceLocationFromPlayerSuperiors() {
      return this.afterGetResourceLocationFromPlayerSuperiors;
   }

   public String[] getAfterGetResourceLocationFromPlayerInferiors() {
      return this.afterGetResourceLocationFromPlayerInferiors;
   }

   public void setBeforeGetResourceLocationFromPlayerSuperiors(String[] value) {
      this.beforeGetResourceLocationFromPlayerSuperiors = value;
   }

   public void setBeforeGetResourceLocationFromPlayerInferiors(String[] value) {
      this.beforeGetResourceLocationFromPlayerInferiors = value;
   }

   public void setOverrideGetResourceLocationFromPlayerSuperiors(String[] value) {
      this.overrideGetResourceLocationFromPlayerSuperiors = value;
   }

   public void setOverrideGetResourceLocationFromPlayerInferiors(String[] value) {
      this.overrideGetResourceLocationFromPlayerInferiors = value;
   }

   public void setAfterGetResourceLocationFromPlayerSuperiors(String[] value) {
      this.afterGetResourceLocationFromPlayerSuperiors = value;
   }

   public void setAfterGetResourceLocationFromPlayerInferiors(String[] value) {
      this.afterGetResourceLocationFromPlayerInferiors = value;
   }

   public String[] getBeforeHandleRotationFloatSuperiors() {
      return this.beforeHandleRotationFloatSuperiors;
   }

   public String[] getBeforeHandleRotationFloatInferiors() {
      return this.beforeHandleRotationFloatInferiors;
   }

   public String[] getOverrideHandleRotationFloatSuperiors() {
      return this.overrideHandleRotationFloatSuperiors;
   }

   public String[] getOverrideHandleRotationFloatInferiors() {
      return this.overrideHandleRotationFloatInferiors;
   }

   public String[] getAfterHandleRotationFloatSuperiors() {
      return this.afterHandleRotationFloatSuperiors;
   }

   public String[] getAfterHandleRotationFloatInferiors() {
      return this.afterHandleRotationFloatInferiors;
   }

   public void setBeforeHandleRotationFloatSuperiors(String[] value) {
      this.beforeHandleRotationFloatSuperiors = value;
   }

   public void setBeforeHandleRotationFloatInferiors(String[] value) {
      this.beforeHandleRotationFloatInferiors = value;
   }

   public void setOverrideHandleRotationFloatSuperiors(String[] value) {
      this.overrideHandleRotationFloatSuperiors = value;
   }

   public void setOverrideHandleRotationFloatInferiors(String[] value) {
      this.overrideHandleRotationFloatInferiors = value;
   }

   public void setAfterHandleRotationFloatSuperiors(String[] value) {
      this.afterHandleRotationFloatSuperiors = value;
   }

   public void setAfterHandleRotationFloatInferiors(String[] value) {
      this.afterHandleRotationFloatInferiors = value;
   }

   public String[] getBeforeInheritRenderPassSuperiors() {
      return this.beforeInheritRenderPassSuperiors;
   }

   public String[] getBeforeInheritRenderPassInferiors() {
      return this.beforeInheritRenderPassInferiors;
   }

   public String[] getOverrideInheritRenderPassSuperiors() {
      return this.overrideInheritRenderPassSuperiors;
   }

   public String[] getOverrideInheritRenderPassInferiors() {
      return this.overrideInheritRenderPassInferiors;
   }

   public String[] getAfterInheritRenderPassSuperiors() {
      return this.afterInheritRenderPassSuperiors;
   }

   public String[] getAfterInheritRenderPassInferiors() {
      return this.afterInheritRenderPassInferiors;
   }

   public void setBeforeInheritRenderPassSuperiors(String[] value) {
      this.beforeInheritRenderPassSuperiors = value;
   }

   public void setBeforeInheritRenderPassInferiors(String[] value) {
      this.beforeInheritRenderPassInferiors = value;
   }

   public void setOverrideInheritRenderPassSuperiors(String[] value) {
      this.overrideInheritRenderPassSuperiors = value;
   }

   public void setOverrideInheritRenderPassInferiors(String[] value) {
      this.overrideInheritRenderPassInferiors = value;
   }

   public void setAfterInheritRenderPassSuperiors(String[] value) {
      this.afterInheritRenderPassSuperiors = value;
   }

   public void setAfterInheritRenderPassInferiors(String[] value) {
      this.afterInheritRenderPassInferiors = value;
   }

   public String[] getBeforeLoadTextureSuperiors() {
      return this.beforeLoadTextureSuperiors;
   }

   public String[] getBeforeLoadTextureInferiors() {
      return this.beforeLoadTextureInferiors;
   }

   public String[] getOverrideLoadTextureSuperiors() {
      return this.overrideLoadTextureSuperiors;
   }

   public String[] getOverrideLoadTextureInferiors() {
      return this.overrideLoadTextureInferiors;
   }

   public String[] getAfterLoadTextureSuperiors() {
      return this.afterLoadTextureSuperiors;
   }

   public String[] getAfterLoadTextureInferiors() {
      return this.afterLoadTextureInferiors;
   }

   public void setBeforeLoadTextureSuperiors(String[] value) {
      this.beforeLoadTextureSuperiors = value;
   }

   public void setBeforeLoadTextureInferiors(String[] value) {
      this.beforeLoadTextureInferiors = value;
   }

   public void setOverrideLoadTextureSuperiors(String[] value) {
      this.overrideLoadTextureSuperiors = value;
   }

   public void setOverrideLoadTextureInferiors(String[] value) {
      this.overrideLoadTextureInferiors = value;
   }

   public void setAfterLoadTextureSuperiors(String[] value) {
      this.afterLoadTextureSuperiors = value;
   }

   public void setAfterLoadTextureInferiors(String[] value) {
      this.afterLoadTextureInferiors = value;
   }

   public String[] getBeforeLoadTextureOfEntitySuperiors() {
      return this.beforeLoadTextureOfEntitySuperiors;
   }

   public String[] getBeforeLoadTextureOfEntityInferiors() {
      return this.beforeLoadTextureOfEntityInferiors;
   }

   public String[] getOverrideLoadTextureOfEntitySuperiors() {
      return this.overrideLoadTextureOfEntitySuperiors;
   }

   public String[] getOverrideLoadTextureOfEntityInferiors() {
      return this.overrideLoadTextureOfEntityInferiors;
   }

   public String[] getAfterLoadTextureOfEntitySuperiors() {
      return this.afterLoadTextureOfEntitySuperiors;
   }

   public String[] getAfterLoadTextureOfEntityInferiors() {
      return this.afterLoadTextureOfEntityInferiors;
   }

   public void setBeforeLoadTextureOfEntitySuperiors(String[] value) {
      this.beforeLoadTextureOfEntitySuperiors = value;
   }

   public void setBeforeLoadTextureOfEntityInferiors(String[] value) {
      this.beforeLoadTextureOfEntityInferiors = value;
   }

   public void setOverrideLoadTextureOfEntitySuperiors(String[] value) {
      this.overrideLoadTextureOfEntitySuperiors = value;
   }

   public void setOverrideLoadTextureOfEntityInferiors(String[] value) {
      this.overrideLoadTextureOfEntityInferiors = value;
   }

   public void setAfterLoadTextureOfEntitySuperiors(String[] value) {
      this.afterLoadTextureOfEntitySuperiors = value;
   }

   public void setAfterLoadTextureOfEntityInferiors(String[] value) {
      this.afterLoadTextureOfEntityInferiors = value;
   }

   public String[] getBeforePassSpecialRenderSuperiors() {
      return this.beforePassSpecialRenderSuperiors;
   }

   public String[] getBeforePassSpecialRenderInferiors() {
      return this.beforePassSpecialRenderInferiors;
   }

   public String[] getOverridePassSpecialRenderSuperiors() {
      return this.overridePassSpecialRenderSuperiors;
   }

   public String[] getOverridePassSpecialRenderInferiors() {
      return this.overridePassSpecialRenderInferiors;
   }

   public String[] getAfterPassSpecialRenderSuperiors() {
      return this.afterPassSpecialRenderSuperiors;
   }

   public String[] getAfterPassSpecialRenderInferiors() {
      return this.afterPassSpecialRenderInferiors;
   }

   public void setBeforePassSpecialRenderSuperiors(String[] value) {
      this.beforePassSpecialRenderSuperiors = value;
   }

   public void setBeforePassSpecialRenderInferiors(String[] value) {
      this.beforePassSpecialRenderInferiors = value;
   }

   public void setOverridePassSpecialRenderSuperiors(String[] value) {
      this.overridePassSpecialRenderSuperiors = value;
   }

   public void setOverridePassSpecialRenderInferiors(String[] value) {
      this.overridePassSpecialRenderInferiors = value;
   }

   public void setAfterPassSpecialRenderSuperiors(String[] value) {
      this.afterPassSpecialRenderSuperiors = value;
   }

   public void setAfterPassSpecialRenderInferiors(String[] value) {
      this.afterPassSpecialRenderInferiors = value;
   }

   public String[] getBeforePerformStaticEntityRebuildSuperiors() {
      return this.beforePerformStaticEntityRebuildSuperiors;
   }

   public String[] getBeforePerformStaticEntityRebuildInferiors() {
      return this.beforePerformStaticEntityRebuildInferiors;
   }

   public String[] getOverridePerformStaticEntityRebuildSuperiors() {
      return this.overridePerformStaticEntityRebuildSuperiors;
   }

   public String[] getOverridePerformStaticEntityRebuildInferiors() {
      return this.overridePerformStaticEntityRebuildInferiors;
   }

   public String[] getAfterPerformStaticEntityRebuildSuperiors() {
      return this.afterPerformStaticEntityRebuildSuperiors;
   }

   public String[] getAfterPerformStaticEntityRebuildInferiors() {
      return this.afterPerformStaticEntityRebuildInferiors;
   }

   public void setBeforePerformStaticEntityRebuildSuperiors(String[] value) {
      this.beforePerformStaticEntityRebuildSuperiors = value;
   }

   public void setBeforePerformStaticEntityRebuildInferiors(String[] value) {
      this.beforePerformStaticEntityRebuildInferiors = value;
   }

   public void setOverridePerformStaticEntityRebuildSuperiors(String[] value) {
      this.overridePerformStaticEntityRebuildSuperiors = value;
   }

   public void setOverridePerformStaticEntityRebuildInferiors(String[] value) {
      this.overridePerformStaticEntityRebuildInferiors = value;
   }

   public void setAfterPerformStaticEntityRebuildSuperiors(String[] value) {
      this.afterPerformStaticEntityRebuildSuperiors = value;
   }

   public void setAfterPerformStaticEntityRebuildInferiors(String[] value) {
      this.afterPerformStaticEntityRebuildInferiors = value;
   }

   public String[] getBeforeRenderArrowsStuckInEntitySuperiors() {
      return this.beforeRenderArrowsStuckInEntitySuperiors;
   }

   public String[] getBeforeRenderArrowsStuckInEntityInferiors() {
      return this.beforeRenderArrowsStuckInEntityInferiors;
   }

   public String[] getOverrideRenderArrowsStuckInEntitySuperiors() {
      return this.overrideRenderArrowsStuckInEntitySuperiors;
   }

   public String[] getOverrideRenderArrowsStuckInEntityInferiors() {
      return this.overrideRenderArrowsStuckInEntityInferiors;
   }

   public String[] getAfterRenderArrowsStuckInEntitySuperiors() {
      return this.afterRenderArrowsStuckInEntitySuperiors;
   }

   public String[] getAfterRenderArrowsStuckInEntityInferiors() {
      return this.afterRenderArrowsStuckInEntityInferiors;
   }

   public void setBeforeRenderArrowsStuckInEntitySuperiors(String[] value) {
      this.beforeRenderArrowsStuckInEntitySuperiors = value;
   }

   public void setBeforeRenderArrowsStuckInEntityInferiors(String[] value) {
      this.beforeRenderArrowsStuckInEntityInferiors = value;
   }

   public void setOverrideRenderArrowsStuckInEntitySuperiors(String[] value) {
      this.overrideRenderArrowsStuckInEntitySuperiors = value;
   }

   public void setOverrideRenderArrowsStuckInEntityInferiors(String[] value) {
      this.overrideRenderArrowsStuckInEntityInferiors = value;
   }

   public void setAfterRenderArrowsStuckInEntitySuperiors(String[] value) {
      this.afterRenderArrowsStuckInEntitySuperiors = value;
   }

   public void setAfterRenderArrowsStuckInEntityInferiors(String[] value) {
      this.afterRenderArrowsStuckInEntityInferiors = value;
   }

   public String[] getBeforeRenderFirstPersonArmSuperiors() {
      return this.beforeRenderFirstPersonArmSuperiors;
   }

   public String[] getBeforeRenderFirstPersonArmInferiors() {
      return this.beforeRenderFirstPersonArmInferiors;
   }

   public String[] getOverrideRenderFirstPersonArmSuperiors() {
      return this.overrideRenderFirstPersonArmSuperiors;
   }

   public String[] getOverrideRenderFirstPersonArmInferiors() {
      return this.overrideRenderFirstPersonArmInferiors;
   }

   public String[] getAfterRenderFirstPersonArmSuperiors() {
      return this.afterRenderFirstPersonArmSuperiors;
   }

   public String[] getAfterRenderFirstPersonArmInferiors() {
      return this.afterRenderFirstPersonArmInferiors;
   }

   public void setBeforeRenderFirstPersonArmSuperiors(String[] value) {
      this.beforeRenderFirstPersonArmSuperiors = value;
   }

   public void setBeforeRenderFirstPersonArmInferiors(String[] value) {
      this.beforeRenderFirstPersonArmInferiors = value;
   }

   public void setOverrideRenderFirstPersonArmSuperiors(String[] value) {
      this.overrideRenderFirstPersonArmSuperiors = value;
   }

   public void setOverrideRenderFirstPersonArmInferiors(String[] value) {
      this.overrideRenderFirstPersonArmInferiors = value;
   }

   public void setAfterRenderFirstPersonArmSuperiors(String[] value) {
      this.afterRenderFirstPersonArmSuperiors = value;
   }

   public void setAfterRenderFirstPersonArmInferiors(String[] value) {
      this.afterRenderFirstPersonArmInferiors = value;
   }

   public String[] getBeforeRenderLivingLabelSuperiors() {
      return this.beforeRenderLivingLabelSuperiors;
   }

   public String[] getBeforeRenderLivingLabelInferiors() {
      return this.beforeRenderLivingLabelInferiors;
   }

   public String[] getOverrideRenderLivingLabelSuperiors() {
      return this.overrideRenderLivingLabelSuperiors;
   }

   public String[] getOverrideRenderLivingLabelInferiors() {
      return this.overrideRenderLivingLabelInferiors;
   }

   public String[] getAfterRenderLivingLabelSuperiors() {
      return this.afterRenderLivingLabelSuperiors;
   }

   public String[] getAfterRenderLivingLabelInferiors() {
      return this.afterRenderLivingLabelInferiors;
   }

   public void setBeforeRenderLivingLabelSuperiors(String[] value) {
      this.beforeRenderLivingLabelSuperiors = value;
   }

   public void setBeforeRenderLivingLabelInferiors(String[] value) {
      this.beforeRenderLivingLabelInferiors = value;
   }

   public void setOverrideRenderLivingLabelSuperiors(String[] value) {
      this.overrideRenderLivingLabelSuperiors = value;
   }

   public void setOverrideRenderLivingLabelInferiors(String[] value) {
      this.overrideRenderLivingLabelInferiors = value;
   }

   public void setAfterRenderLivingLabelSuperiors(String[] value) {
      this.afterRenderLivingLabelSuperiors = value;
   }

   public void setAfterRenderLivingLabelInferiors(String[] value) {
      this.afterRenderLivingLabelInferiors = value;
   }

   public String[] getBeforeRenderModelSuperiors() {
      return this.beforeRenderModelSuperiors;
   }

   public String[] getBeforeRenderModelInferiors() {
      return this.beforeRenderModelInferiors;
   }

   public String[] getOverrideRenderModelSuperiors() {
      return this.overrideRenderModelSuperiors;
   }

   public String[] getOverrideRenderModelInferiors() {
      return this.overrideRenderModelInferiors;
   }

   public String[] getAfterRenderModelSuperiors() {
      return this.afterRenderModelSuperiors;
   }

   public String[] getAfterRenderModelInferiors() {
      return this.afterRenderModelInferiors;
   }

   public void setBeforeRenderModelSuperiors(String[] value) {
      this.beforeRenderModelSuperiors = value;
   }

   public void setBeforeRenderModelInferiors(String[] value) {
      this.beforeRenderModelInferiors = value;
   }

   public void setOverrideRenderModelSuperiors(String[] value) {
      this.overrideRenderModelSuperiors = value;
   }

   public void setOverrideRenderModelInferiors(String[] value) {
      this.overrideRenderModelInferiors = value;
   }

   public void setAfterRenderModelSuperiors(String[] value) {
      this.afterRenderModelSuperiors = value;
   }

   public void setAfterRenderModelInferiors(String[] value) {
      this.afterRenderModelInferiors = value;
   }

   public String[] getBeforeRenderPlayerSuperiors() {
      return this.beforeRenderPlayerSuperiors;
   }

   public String[] getBeforeRenderPlayerInferiors() {
      return this.beforeRenderPlayerInferiors;
   }

   public String[] getOverrideRenderPlayerSuperiors() {
      return this.overrideRenderPlayerSuperiors;
   }

   public String[] getOverrideRenderPlayerInferiors() {
      return this.overrideRenderPlayerInferiors;
   }

   public String[] getAfterRenderPlayerSuperiors() {
      return this.afterRenderPlayerSuperiors;
   }

   public String[] getAfterRenderPlayerInferiors() {
      return this.afterRenderPlayerInferiors;
   }

   public void setBeforeRenderPlayerSuperiors(String[] value) {
      this.beforeRenderPlayerSuperiors = value;
   }

   public void setBeforeRenderPlayerInferiors(String[] value) {
      this.beforeRenderPlayerInferiors = value;
   }

   public void setOverrideRenderPlayerSuperiors(String[] value) {
      this.overrideRenderPlayerSuperiors = value;
   }

   public void setOverrideRenderPlayerInferiors(String[] value) {
      this.overrideRenderPlayerInferiors = value;
   }

   public void setAfterRenderPlayerSuperiors(String[] value) {
      this.afterRenderPlayerSuperiors = value;
   }

   public void setAfterRenderPlayerInferiors(String[] value) {
      this.afterRenderPlayerInferiors = value;
   }

   public String[] getBeforeRenderPlayerNameAndScoreLabelSuperiors() {
      return this.beforeRenderPlayerNameAndScoreLabelSuperiors;
   }

   public String[] getBeforeRenderPlayerNameAndScoreLabelInferiors() {
      return this.beforeRenderPlayerNameAndScoreLabelInferiors;
   }

   public String[] getOverrideRenderPlayerNameAndScoreLabelSuperiors() {
      return this.overrideRenderPlayerNameAndScoreLabelSuperiors;
   }

   public String[] getOverrideRenderPlayerNameAndScoreLabelInferiors() {
      return this.overrideRenderPlayerNameAndScoreLabelInferiors;
   }

   public String[] getAfterRenderPlayerNameAndScoreLabelSuperiors() {
      return this.afterRenderPlayerNameAndScoreLabelSuperiors;
   }

   public String[] getAfterRenderPlayerNameAndScoreLabelInferiors() {
      return this.afterRenderPlayerNameAndScoreLabelInferiors;
   }

   public void setBeforeRenderPlayerNameAndScoreLabelSuperiors(String[] value) {
      this.beforeRenderPlayerNameAndScoreLabelSuperiors = value;
   }

   public void setBeforeRenderPlayerNameAndScoreLabelInferiors(String[] value) {
      this.beforeRenderPlayerNameAndScoreLabelInferiors = value;
   }

   public void setOverrideRenderPlayerNameAndScoreLabelSuperiors(String[] value) {
      this.overrideRenderPlayerNameAndScoreLabelSuperiors = value;
   }

   public void setOverrideRenderPlayerNameAndScoreLabelInferiors(String[] value) {
      this.overrideRenderPlayerNameAndScoreLabelInferiors = value;
   }

   public void setAfterRenderPlayerNameAndScoreLabelSuperiors(String[] value) {
      this.afterRenderPlayerNameAndScoreLabelSuperiors = value;
   }

   public void setAfterRenderPlayerNameAndScoreLabelInferiors(String[] value) {
      this.afterRenderPlayerNameAndScoreLabelInferiors = value;
   }

   public String[] getBeforeRenderPlayerScaleSuperiors() {
      return this.beforeRenderPlayerScaleSuperiors;
   }

   public String[] getBeforeRenderPlayerScaleInferiors() {
      return this.beforeRenderPlayerScaleInferiors;
   }

   public String[] getOverrideRenderPlayerScaleSuperiors() {
      return this.overrideRenderPlayerScaleSuperiors;
   }

   public String[] getOverrideRenderPlayerScaleInferiors() {
      return this.overrideRenderPlayerScaleInferiors;
   }

   public String[] getAfterRenderPlayerScaleSuperiors() {
      return this.afterRenderPlayerScaleSuperiors;
   }

   public String[] getAfterRenderPlayerScaleInferiors() {
      return this.afterRenderPlayerScaleInferiors;
   }

   public void setBeforeRenderPlayerScaleSuperiors(String[] value) {
      this.beforeRenderPlayerScaleSuperiors = value;
   }

   public void setBeforeRenderPlayerScaleInferiors(String[] value) {
      this.beforeRenderPlayerScaleInferiors = value;
   }

   public void setOverrideRenderPlayerScaleSuperiors(String[] value) {
      this.overrideRenderPlayerScaleSuperiors = value;
   }

   public void setOverrideRenderPlayerScaleInferiors(String[] value) {
      this.overrideRenderPlayerScaleInferiors = value;
   }

   public void setAfterRenderPlayerScaleSuperiors(String[] value) {
      this.afterRenderPlayerScaleSuperiors = value;
   }

   public void setAfterRenderPlayerScaleInferiors(String[] value) {
      this.afterRenderPlayerScaleInferiors = value;
   }

   public String[] getBeforeRenderPlayerSleepSuperiors() {
      return this.beforeRenderPlayerSleepSuperiors;
   }

   public String[] getBeforeRenderPlayerSleepInferiors() {
      return this.beforeRenderPlayerSleepInferiors;
   }

   public String[] getOverrideRenderPlayerSleepSuperiors() {
      return this.overrideRenderPlayerSleepSuperiors;
   }

   public String[] getOverrideRenderPlayerSleepInferiors() {
      return this.overrideRenderPlayerSleepInferiors;
   }

   public String[] getAfterRenderPlayerSleepSuperiors() {
      return this.afterRenderPlayerSleepSuperiors;
   }

   public String[] getAfterRenderPlayerSleepInferiors() {
      return this.afterRenderPlayerSleepInferiors;
   }

   public void setBeforeRenderPlayerSleepSuperiors(String[] value) {
      this.beforeRenderPlayerSleepSuperiors = value;
   }

   public void setBeforeRenderPlayerSleepInferiors(String[] value) {
      this.beforeRenderPlayerSleepInferiors = value;
   }

   public void setOverrideRenderPlayerSleepSuperiors(String[] value) {
      this.overrideRenderPlayerSleepSuperiors = value;
   }

   public void setOverrideRenderPlayerSleepInferiors(String[] value) {
      this.overrideRenderPlayerSleepInferiors = value;
   }

   public void setAfterRenderPlayerSleepSuperiors(String[] value) {
      this.afterRenderPlayerSleepSuperiors = value;
   }

   public void setAfterRenderPlayerSleepInferiors(String[] value) {
      this.afterRenderPlayerSleepInferiors = value;
   }

   public String[] getBeforeRenderSpecialsSuperiors() {
      return this.beforeRenderSpecialsSuperiors;
   }

   public String[] getBeforeRenderSpecialsInferiors() {
      return this.beforeRenderSpecialsInferiors;
   }

   public String[] getOverrideRenderSpecialsSuperiors() {
      return this.overrideRenderSpecialsSuperiors;
   }

   public String[] getOverrideRenderSpecialsInferiors() {
      return this.overrideRenderSpecialsInferiors;
   }

   public String[] getAfterRenderSpecialsSuperiors() {
      return this.afterRenderSpecialsSuperiors;
   }

   public String[] getAfterRenderSpecialsInferiors() {
      return this.afterRenderSpecialsInferiors;
   }

   public void setBeforeRenderSpecialsSuperiors(String[] value) {
      this.beforeRenderSpecialsSuperiors = value;
   }

   public void setBeforeRenderSpecialsInferiors(String[] value) {
      this.beforeRenderSpecialsInferiors = value;
   }

   public void setOverrideRenderSpecialsSuperiors(String[] value) {
      this.overrideRenderSpecialsSuperiors = value;
   }

   public void setOverrideRenderSpecialsInferiors(String[] value) {
      this.overrideRenderSpecialsInferiors = value;
   }

   public void setAfterRenderSpecialsSuperiors(String[] value) {
      this.afterRenderSpecialsSuperiors = value;
   }

   public void setAfterRenderSpecialsInferiors(String[] value) {
      this.afterRenderSpecialsInferiors = value;
   }

   public String[] getBeforeRenderSwingProgressSuperiors() {
      return this.beforeRenderSwingProgressSuperiors;
   }

   public String[] getBeforeRenderSwingProgressInferiors() {
      return this.beforeRenderSwingProgressInferiors;
   }

   public String[] getOverrideRenderSwingProgressSuperiors() {
      return this.overrideRenderSwingProgressSuperiors;
   }

   public String[] getOverrideRenderSwingProgressInferiors() {
      return this.overrideRenderSwingProgressInferiors;
   }

   public String[] getAfterRenderSwingProgressSuperiors() {
      return this.afterRenderSwingProgressSuperiors;
   }

   public String[] getAfterRenderSwingProgressInferiors() {
      return this.afterRenderSwingProgressInferiors;
   }

   public void setBeforeRenderSwingProgressSuperiors(String[] value) {
      this.beforeRenderSwingProgressSuperiors = value;
   }

   public void setBeforeRenderSwingProgressInferiors(String[] value) {
      this.beforeRenderSwingProgressInferiors = value;
   }

   public void setOverrideRenderSwingProgressSuperiors(String[] value) {
      this.overrideRenderSwingProgressSuperiors = value;
   }

   public void setOverrideRenderSwingProgressInferiors(String[] value) {
      this.overrideRenderSwingProgressInferiors = value;
   }

   public void setAfterRenderSwingProgressSuperiors(String[] value) {
      this.afterRenderSwingProgressSuperiors = value;
   }

   public void setAfterRenderSwingProgressInferiors(String[] value) {
      this.afterRenderSwingProgressInferiors = value;
   }

   public String[] getBeforeRotatePlayerSuperiors() {
      return this.beforeRotatePlayerSuperiors;
   }

   public String[] getBeforeRotatePlayerInferiors() {
      return this.beforeRotatePlayerInferiors;
   }

   public String[] getOverrideRotatePlayerSuperiors() {
      return this.overrideRotatePlayerSuperiors;
   }

   public String[] getOverrideRotatePlayerInferiors() {
      return this.overrideRotatePlayerInferiors;
   }

   public String[] getAfterRotatePlayerSuperiors() {
      return this.afterRotatePlayerSuperiors;
   }

   public String[] getAfterRotatePlayerInferiors() {
      return this.afterRotatePlayerInferiors;
   }

   public void setBeforeRotatePlayerSuperiors(String[] value) {
      this.beforeRotatePlayerSuperiors = value;
   }

   public void setBeforeRotatePlayerInferiors(String[] value) {
      this.beforeRotatePlayerInferiors = value;
   }

   public void setOverrideRotatePlayerSuperiors(String[] value) {
      this.overrideRotatePlayerSuperiors = value;
   }

   public void setOverrideRotatePlayerInferiors(String[] value) {
      this.overrideRotatePlayerInferiors = value;
   }

   public void setAfterRotatePlayerSuperiors(String[] value) {
      this.afterRotatePlayerSuperiors = value;
   }

   public void setAfterRotatePlayerInferiors(String[] value) {
      this.afterRotatePlayerInferiors = value;
   }

   public String[] getBeforeSetArmorModelSuperiors() {
      return this.beforeSetArmorModelSuperiors;
   }

   public String[] getBeforeSetArmorModelInferiors() {
      return this.beforeSetArmorModelInferiors;
   }

   public String[] getOverrideSetArmorModelSuperiors() {
      return this.overrideSetArmorModelSuperiors;
   }

   public String[] getOverrideSetArmorModelInferiors() {
      return this.overrideSetArmorModelInferiors;
   }

   public String[] getAfterSetArmorModelSuperiors() {
      return this.afterSetArmorModelSuperiors;
   }

   public String[] getAfterSetArmorModelInferiors() {
      return this.afterSetArmorModelInferiors;
   }

   public void setBeforeSetArmorModelSuperiors(String[] value) {
      this.beforeSetArmorModelSuperiors = value;
   }

   public void setBeforeSetArmorModelInferiors(String[] value) {
      this.beforeSetArmorModelInferiors = value;
   }

   public void setOverrideSetArmorModelSuperiors(String[] value) {
      this.overrideSetArmorModelSuperiors = value;
   }

   public void setOverrideSetArmorModelInferiors(String[] value) {
      this.overrideSetArmorModelInferiors = value;
   }

   public void setAfterSetArmorModelSuperiors(String[] value) {
      this.afterSetArmorModelSuperiors = value;
   }

   public void setAfterSetArmorModelInferiors(String[] value) {
      this.afterSetArmorModelInferiors = value;
   }

   public String[] getBeforeSetPassArmorModelSuperiors() {
      return this.beforeSetPassArmorModelSuperiors;
   }

   public String[] getBeforeSetPassArmorModelInferiors() {
      return this.beforeSetPassArmorModelInferiors;
   }

   public String[] getOverrideSetPassArmorModelSuperiors() {
      return this.overrideSetPassArmorModelSuperiors;
   }

   public String[] getOverrideSetPassArmorModelInferiors() {
      return this.overrideSetPassArmorModelInferiors;
   }

   public String[] getAfterSetPassArmorModelSuperiors() {
      return this.afterSetPassArmorModelSuperiors;
   }

   public String[] getAfterSetPassArmorModelInferiors() {
      return this.afterSetPassArmorModelInferiors;
   }

   public void setBeforeSetPassArmorModelSuperiors(String[] value) {
      this.beforeSetPassArmorModelSuperiors = value;
   }

   public void setBeforeSetPassArmorModelInferiors(String[] value) {
      this.beforeSetPassArmorModelInferiors = value;
   }

   public void setOverrideSetPassArmorModelSuperiors(String[] value) {
      this.overrideSetPassArmorModelSuperiors = value;
   }

   public void setOverrideSetPassArmorModelInferiors(String[] value) {
      this.overrideSetPassArmorModelInferiors = value;
   }

   public void setAfterSetPassArmorModelSuperiors(String[] value) {
      this.afterSetPassArmorModelSuperiors = value;
   }

   public void setAfterSetPassArmorModelInferiors(String[] value) {
      this.afterSetPassArmorModelInferiors = value;
   }

   public String[] getBeforeSetRenderManagerSuperiors() {
      return this.beforeSetRenderManagerSuperiors;
   }

   public String[] getBeforeSetRenderManagerInferiors() {
      return this.beforeSetRenderManagerInferiors;
   }

   public String[] getOverrideSetRenderManagerSuperiors() {
      return this.overrideSetRenderManagerSuperiors;
   }

   public String[] getOverrideSetRenderManagerInferiors() {
      return this.overrideSetRenderManagerInferiors;
   }

   public String[] getAfterSetRenderManagerSuperiors() {
      return this.afterSetRenderManagerSuperiors;
   }

   public String[] getAfterSetRenderManagerInferiors() {
      return this.afterSetRenderManagerInferiors;
   }

   public void setBeforeSetRenderManagerSuperiors(String[] value) {
      this.beforeSetRenderManagerSuperiors = value;
   }

   public void setBeforeSetRenderManagerInferiors(String[] value) {
      this.beforeSetRenderManagerInferiors = value;
   }

   public void setOverrideSetRenderManagerSuperiors(String[] value) {
      this.overrideSetRenderManagerSuperiors = value;
   }

   public void setOverrideSetRenderManagerInferiors(String[] value) {
      this.overrideSetRenderManagerInferiors = value;
   }

   public void setAfterSetRenderManagerSuperiors(String[] value) {
      this.afterSetRenderManagerSuperiors = value;
   }

   public void setAfterSetRenderManagerInferiors(String[] value) {
      this.afterSetRenderManagerInferiors = value;
   }

   public String[] getBeforeSetRenderPassModelSuperiors() {
      return this.beforeSetRenderPassModelSuperiors;
   }

   public String[] getBeforeSetRenderPassModelInferiors() {
      return this.beforeSetRenderPassModelInferiors;
   }

   public String[] getOverrideSetRenderPassModelSuperiors() {
      return this.overrideSetRenderPassModelSuperiors;
   }

   public String[] getOverrideSetRenderPassModelInferiors() {
      return this.overrideSetRenderPassModelInferiors;
   }

   public String[] getAfterSetRenderPassModelSuperiors() {
      return this.afterSetRenderPassModelSuperiors;
   }

   public String[] getAfterSetRenderPassModelInferiors() {
      return this.afterSetRenderPassModelInferiors;
   }

   public void setBeforeSetRenderPassModelSuperiors(String[] value) {
      this.beforeSetRenderPassModelSuperiors = value;
   }

   public void setBeforeSetRenderPassModelInferiors(String[] value) {
      this.beforeSetRenderPassModelInferiors = value;
   }

   public void setOverrideSetRenderPassModelSuperiors(String[] value) {
      this.overrideSetRenderPassModelSuperiors = value;
   }

   public void setOverrideSetRenderPassModelInferiors(String[] value) {
      this.overrideSetRenderPassModelInferiors = value;
   }

   public void setAfterSetRenderPassModelSuperiors(String[] value) {
      this.afterSetRenderPassModelSuperiors = value;
   }

   public void setAfterSetRenderPassModelInferiors(String[] value) {
      this.afterSetRenderPassModelInferiors = value;
   }

   public String[] getBeforeUpdateIconsSuperiors() {
      return this.beforeUpdateIconsSuperiors;
   }

   public String[] getBeforeUpdateIconsInferiors() {
      return this.beforeUpdateIconsInferiors;
   }

   public String[] getOverrideUpdateIconsSuperiors() {
      return this.overrideUpdateIconsSuperiors;
   }

   public String[] getOverrideUpdateIconsInferiors() {
      return this.overrideUpdateIconsInferiors;
   }

   public String[] getAfterUpdateIconsSuperiors() {
      return this.afterUpdateIconsSuperiors;
   }

   public String[] getAfterUpdateIconsInferiors() {
      return this.afterUpdateIconsInferiors;
   }

   public void setBeforeUpdateIconsSuperiors(String[] value) {
      this.beforeUpdateIconsSuperiors = value;
   }

   public void setBeforeUpdateIconsInferiors(String[] value) {
      this.beforeUpdateIconsInferiors = value;
   }

   public void setOverrideUpdateIconsSuperiors(String[] value) {
      this.overrideUpdateIconsSuperiors = value;
   }

   public void setOverrideUpdateIconsInferiors(String[] value) {
      this.overrideUpdateIconsInferiors = value;
   }

   public void setAfterUpdateIconsSuperiors(String[] value) {
      this.afterUpdateIconsSuperiors = value;
   }

   public void setAfterUpdateIconsInferiors(String[] value) {
      this.afterUpdateIconsInferiors = value;
   }
}
