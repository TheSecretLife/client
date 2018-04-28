package api.player.model;

import java.util.HashMap;
import java.util.Map;

public final class ModelPlayerBaseSorting {
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
   private String[] beforeGetRandomModelBoxSuperiors = null;
   private String[] beforeGetRandomModelBoxInferiors = null;
   private String[] overrideGetRandomModelBoxSuperiors = null;
   private String[] overrideGetRandomModelBoxInferiors = null;
   private String[] afterGetRandomModelBoxSuperiors = null;
   private String[] afterGetRandomModelBoxInferiors = null;
   private String[] beforeGetTextureOffsetSuperiors = null;
   private String[] beforeGetTextureOffsetInferiors = null;
   private String[] overrideGetTextureOffsetSuperiors = null;
   private String[] overrideGetTextureOffsetInferiors = null;
   private String[] afterGetTextureOffsetSuperiors = null;
   private String[] afterGetTextureOffsetInferiors = null;
   private String[] beforeRenderSuperiors = null;
   private String[] beforeRenderInferiors = null;
   private String[] overrideRenderSuperiors = null;
   private String[] overrideRenderInferiors = null;
   private String[] afterRenderSuperiors = null;
   private String[] afterRenderInferiors = null;
   private String[] beforeRenderCloakSuperiors = null;
   private String[] beforeRenderCloakInferiors = null;
   private String[] overrideRenderCloakSuperiors = null;
   private String[] overrideRenderCloakInferiors = null;
   private String[] afterRenderCloakSuperiors = null;
   private String[] afterRenderCloakInferiors = null;
   private String[] beforeRenderEarsSuperiors = null;
   private String[] beforeRenderEarsInferiors = null;
   private String[] overrideRenderEarsSuperiors = null;
   private String[] overrideRenderEarsInferiors = null;
   private String[] afterRenderEarsSuperiors = null;
   private String[] afterRenderEarsInferiors = null;
   private String[] beforeSetLivingAnimationsSuperiors = null;
   private String[] beforeSetLivingAnimationsInferiors = null;
   private String[] overrideSetLivingAnimationsSuperiors = null;
   private String[] overrideSetLivingAnimationsInferiors = null;
   private String[] afterSetLivingAnimationsSuperiors = null;
   private String[] afterSetLivingAnimationsInferiors = null;
   private String[] beforeSetRotationAnglesSuperiors = null;
   private String[] beforeSetRotationAnglesInferiors = null;
   private String[] overrideSetRotationAnglesSuperiors = null;
   private String[] overrideSetRotationAnglesInferiors = null;
   private String[] afterSetRotationAnglesSuperiors = null;
   private String[] afterSetRotationAnglesInferiors = null;
   private String[] beforeSetTextureOffsetSuperiors = null;
   private String[] beforeSetTextureOffsetInferiors = null;
   private String[] overrideSetTextureOffsetSuperiors = null;
   private String[] overrideSetTextureOffsetInferiors = null;
   private String[] afterSetTextureOffsetSuperiors = null;
   private String[] afterSetTextureOffsetInferiors = null;

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

   public String[] getBeforeGetRandomModelBoxSuperiors() {
      return this.beforeGetRandomModelBoxSuperiors;
   }

   public String[] getBeforeGetRandomModelBoxInferiors() {
      return this.beforeGetRandomModelBoxInferiors;
   }

   public String[] getOverrideGetRandomModelBoxSuperiors() {
      return this.overrideGetRandomModelBoxSuperiors;
   }

   public String[] getOverrideGetRandomModelBoxInferiors() {
      return this.overrideGetRandomModelBoxInferiors;
   }

   public String[] getAfterGetRandomModelBoxSuperiors() {
      return this.afterGetRandomModelBoxSuperiors;
   }

   public String[] getAfterGetRandomModelBoxInferiors() {
      return this.afterGetRandomModelBoxInferiors;
   }

   public void setBeforeGetRandomModelBoxSuperiors(String[] value) {
      this.beforeGetRandomModelBoxSuperiors = value;
   }

   public void setBeforeGetRandomModelBoxInferiors(String[] value) {
      this.beforeGetRandomModelBoxInferiors = value;
   }

   public void setOverrideGetRandomModelBoxSuperiors(String[] value) {
      this.overrideGetRandomModelBoxSuperiors = value;
   }

   public void setOverrideGetRandomModelBoxInferiors(String[] value) {
      this.overrideGetRandomModelBoxInferiors = value;
   }

   public void setAfterGetRandomModelBoxSuperiors(String[] value) {
      this.afterGetRandomModelBoxSuperiors = value;
   }

   public void setAfterGetRandomModelBoxInferiors(String[] value) {
      this.afterGetRandomModelBoxInferiors = value;
   }

   public String[] getBeforeGetTextureOffsetSuperiors() {
      return this.beforeGetTextureOffsetSuperiors;
   }

   public String[] getBeforeGetTextureOffsetInferiors() {
      return this.beforeGetTextureOffsetInferiors;
   }

   public String[] getOverrideGetTextureOffsetSuperiors() {
      return this.overrideGetTextureOffsetSuperiors;
   }

   public String[] getOverrideGetTextureOffsetInferiors() {
      return this.overrideGetTextureOffsetInferiors;
   }

   public String[] getAfterGetTextureOffsetSuperiors() {
      return this.afterGetTextureOffsetSuperiors;
   }

   public String[] getAfterGetTextureOffsetInferiors() {
      return this.afterGetTextureOffsetInferiors;
   }

   public void setBeforeGetTextureOffsetSuperiors(String[] value) {
      this.beforeGetTextureOffsetSuperiors = value;
   }

   public void setBeforeGetTextureOffsetInferiors(String[] value) {
      this.beforeGetTextureOffsetInferiors = value;
   }

   public void setOverrideGetTextureOffsetSuperiors(String[] value) {
      this.overrideGetTextureOffsetSuperiors = value;
   }

   public void setOverrideGetTextureOffsetInferiors(String[] value) {
      this.overrideGetTextureOffsetInferiors = value;
   }

   public void setAfterGetTextureOffsetSuperiors(String[] value) {
      this.afterGetTextureOffsetSuperiors = value;
   }

   public void setAfterGetTextureOffsetInferiors(String[] value) {
      this.afterGetTextureOffsetInferiors = value;
   }

   public String[] getBeforeRenderSuperiors() {
      return this.beforeRenderSuperiors;
   }

   public String[] getBeforeRenderInferiors() {
      return this.beforeRenderInferiors;
   }

   public String[] getOverrideRenderSuperiors() {
      return this.overrideRenderSuperiors;
   }

   public String[] getOverrideRenderInferiors() {
      return this.overrideRenderInferiors;
   }

   public String[] getAfterRenderSuperiors() {
      return this.afterRenderSuperiors;
   }

   public String[] getAfterRenderInferiors() {
      return this.afterRenderInferiors;
   }

   public void setBeforeRenderSuperiors(String[] value) {
      this.beforeRenderSuperiors = value;
   }

   public void setBeforeRenderInferiors(String[] value) {
      this.beforeRenderInferiors = value;
   }

   public void setOverrideRenderSuperiors(String[] value) {
      this.overrideRenderSuperiors = value;
   }

   public void setOverrideRenderInferiors(String[] value) {
      this.overrideRenderInferiors = value;
   }

   public void setAfterRenderSuperiors(String[] value) {
      this.afterRenderSuperiors = value;
   }

   public void setAfterRenderInferiors(String[] value) {
      this.afterRenderInferiors = value;
   }

   public String[] getBeforeRenderCloakSuperiors() {
      return this.beforeRenderCloakSuperiors;
   }

   public String[] getBeforeRenderCloakInferiors() {
      return this.beforeRenderCloakInferiors;
   }

   public String[] getOverrideRenderCloakSuperiors() {
      return this.overrideRenderCloakSuperiors;
   }

   public String[] getOverrideRenderCloakInferiors() {
      return this.overrideRenderCloakInferiors;
   }

   public String[] getAfterRenderCloakSuperiors() {
      return this.afterRenderCloakSuperiors;
   }

   public String[] getAfterRenderCloakInferiors() {
      return this.afterRenderCloakInferiors;
   }

   public void setBeforeRenderCloakSuperiors(String[] value) {
      this.beforeRenderCloakSuperiors = value;
   }

   public void setBeforeRenderCloakInferiors(String[] value) {
      this.beforeRenderCloakInferiors = value;
   }

   public void setOverrideRenderCloakSuperiors(String[] value) {
      this.overrideRenderCloakSuperiors = value;
   }

   public void setOverrideRenderCloakInferiors(String[] value) {
      this.overrideRenderCloakInferiors = value;
   }

   public void setAfterRenderCloakSuperiors(String[] value) {
      this.afterRenderCloakSuperiors = value;
   }

   public void setAfterRenderCloakInferiors(String[] value) {
      this.afterRenderCloakInferiors = value;
   }

   public String[] getBeforeRenderEarsSuperiors() {
      return this.beforeRenderEarsSuperiors;
   }

   public String[] getBeforeRenderEarsInferiors() {
      return this.beforeRenderEarsInferiors;
   }

   public String[] getOverrideRenderEarsSuperiors() {
      return this.overrideRenderEarsSuperiors;
   }

   public String[] getOverrideRenderEarsInferiors() {
      return this.overrideRenderEarsInferiors;
   }

   public String[] getAfterRenderEarsSuperiors() {
      return this.afterRenderEarsSuperiors;
   }

   public String[] getAfterRenderEarsInferiors() {
      return this.afterRenderEarsInferiors;
   }

   public void setBeforeRenderEarsSuperiors(String[] value) {
      this.beforeRenderEarsSuperiors = value;
   }

   public void setBeforeRenderEarsInferiors(String[] value) {
      this.beforeRenderEarsInferiors = value;
   }

   public void setOverrideRenderEarsSuperiors(String[] value) {
      this.overrideRenderEarsSuperiors = value;
   }

   public void setOverrideRenderEarsInferiors(String[] value) {
      this.overrideRenderEarsInferiors = value;
   }

   public void setAfterRenderEarsSuperiors(String[] value) {
      this.afterRenderEarsSuperiors = value;
   }

   public void setAfterRenderEarsInferiors(String[] value) {
      this.afterRenderEarsInferiors = value;
   }

   public String[] getBeforeSetLivingAnimationsSuperiors() {
      return this.beforeSetLivingAnimationsSuperiors;
   }

   public String[] getBeforeSetLivingAnimationsInferiors() {
      return this.beforeSetLivingAnimationsInferiors;
   }

   public String[] getOverrideSetLivingAnimationsSuperiors() {
      return this.overrideSetLivingAnimationsSuperiors;
   }

   public String[] getOverrideSetLivingAnimationsInferiors() {
      return this.overrideSetLivingAnimationsInferiors;
   }

   public String[] getAfterSetLivingAnimationsSuperiors() {
      return this.afterSetLivingAnimationsSuperiors;
   }

   public String[] getAfterSetLivingAnimationsInferiors() {
      return this.afterSetLivingAnimationsInferiors;
   }

   public void setBeforeSetLivingAnimationsSuperiors(String[] value) {
      this.beforeSetLivingAnimationsSuperiors = value;
   }

   public void setBeforeSetLivingAnimationsInferiors(String[] value) {
      this.beforeSetLivingAnimationsInferiors = value;
   }

   public void setOverrideSetLivingAnimationsSuperiors(String[] value) {
      this.overrideSetLivingAnimationsSuperiors = value;
   }

   public void setOverrideSetLivingAnimationsInferiors(String[] value) {
      this.overrideSetLivingAnimationsInferiors = value;
   }

   public void setAfterSetLivingAnimationsSuperiors(String[] value) {
      this.afterSetLivingAnimationsSuperiors = value;
   }

   public void setAfterSetLivingAnimationsInferiors(String[] value) {
      this.afterSetLivingAnimationsInferiors = value;
   }

   public String[] getBeforeSetRotationAnglesSuperiors() {
      return this.beforeSetRotationAnglesSuperiors;
   }

   public String[] getBeforeSetRotationAnglesInferiors() {
      return this.beforeSetRotationAnglesInferiors;
   }

   public String[] getOverrideSetRotationAnglesSuperiors() {
      return this.overrideSetRotationAnglesSuperiors;
   }

   public String[] getOverrideSetRotationAnglesInferiors() {
      return this.overrideSetRotationAnglesInferiors;
   }

   public String[] getAfterSetRotationAnglesSuperiors() {
      return this.afterSetRotationAnglesSuperiors;
   }

   public String[] getAfterSetRotationAnglesInferiors() {
      return this.afterSetRotationAnglesInferiors;
   }

   public void setBeforeSetRotationAnglesSuperiors(String[] value) {
      this.beforeSetRotationAnglesSuperiors = value;
   }

   public void setBeforeSetRotationAnglesInferiors(String[] value) {
      this.beforeSetRotationAnglesInferiors = value;
   }

   public void setOverrideSetRotationAnglesSuperiors(String[] value) {
      this.overrideSetRotationAnglesSuperiors = value;
   }

   public void setOverrideSetRotationAnglesInferiors(String[] value) {
      this.overrideSetRotationAnglesInferiors = value;
   }

   public void setAfterSetRotationAnglesSuperiors(String[] value) {
      this.afterSetRotationAnglesSuperiors = value;
   }

   public void setAfterSetRotationAnglesInferiors(String[] value) {
      this.afterSetRotationAnglesInferiors = value;
   }

   public String[] getBeforeSetTextureOffsetSuperiors() {
      return this.beforeSetTextureOffsetSuperiors;
   }

   public String[] getBeforeSetTextureOffsetInferiors() {
      return this.beforeSetTextureOffsetInferiors;
   }

   public String[] getOverrideSetTextureOffsetSuperiors() {
      return this.overrideSetTextureOffsetSuperiors;
   }

   public String[] getOverrideSetTextureOffsetInferiors() {
      return this.overrideSetTextureOffsetInferiors;
   }

   public String[] getAfterSetTextureOffsetSuperiors() {
      return this.afterSetTextureOffsetSuperiors;
   }

   public String[] getAfterSetTextureOffsetInferiors() {
      return this.afterSetTextureOffsetInferiors;
   }

   public void setBeforeSetTextureOffsetSuperiors(String[] value) {
      this.beforeSetTextureOffsetSuperiors = value;
   }

   public void setBeforeSetTextureOffsetInferiors(String[] value) {
      this.beforeSetTextureOffsetInferiors = value;
   }

   public void setOverrideSetTextureOffsetSuperiors(String[] value) {
      this.overrideSetTextureOffsetSuperiors = value;
   }

   public void setOverrideSetTextureOffsetInferiors(String[] value) {
      this.overrideSetTextureOffsetInferiors = value;
   }

   public void setAfterSetTextureOffsetSuperiors(String[] value) {
      this.afterSetTextureOffsetSuperiors = value;
   }

   public void setAfterSetTextureOffsetInferiors(String[] value) {
      this.afterSetTextureOffsetInferiors = value;
   }
}
