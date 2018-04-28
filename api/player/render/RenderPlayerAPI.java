package api.player.render;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
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

public final class RenderPlayerAPI {
   private static final Class[] Class = new Class[]{RenderPlayerAPI.class};
   private static final Class[] Classes = new Class[]{RenderPlayerAPI.class, String.class};
   private static boolean isCreated;
   private static final Logger logger = Logger.getLogger("RenderPlayerAPI");
   private static List allInstances = new ArrayList();
   private static final Map EmptySortMap = Collections.unmodifiableMap(new HashMap());
   private static final List beforeDoRenderLabelHookTypes = new LinkedList();
   private static final List overrideDoRenderLabelHookTypes = new LinkedList();
   private static final List afterDoRenderLabelHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeDoRenderLabelHooks;
   private RenderPlayerBase[] overrideDoRenderLabelHooks;
   private RenderPlayerBase[] afterDoRenderLabelHooks;
   public boolean isDoRenderLabelModded;
   private static final Map allBaseBeforeDoRenderLabelSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeDoRenderLabelInferiors = new Hashtable(0);
   private static final Map allBaseOverrideDoRenderLabelSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideDoRenderLabelInferiors = new Hashtable(0);
   private static final Map allBaseAfterDoRenderLabelSuperiors = new Hashtable(0);
   private static final Map allBaseAfterDoRenderLabelInferiors = new Hashtable(0);
   private static final List beforeDoRenderShadowAndFireHookTypes = new LinkedList();
   private static final List overrideDoRenderShadowAndFireHookTypes = new LinkedList();
   private static final List afterDoRenderShadowAndFireHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeDoRenderShadowAndFireHooks;
   private RenderPlayerBase[] overrideDoRenderShadowAndFireHooks;
   private RenderPlayerBase[] afterDoRenderShadowAndFireHooks;
   public boolean isDoRenderShadowAndFireModded;
   private static final Map allBaseBeforeDoRenderShadowAndFireSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeDoRenderShadowAndFireInferiors = new Hashtable(0);
   private static final Map allBaseOverrideDoRenderShadowAndFireSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideDoRenderShadowAndFireInferiors = new Hashtable(0);
   private static final Map allBaseAfterDoRenderShadowAndFireSuperiors = new Hashtable(0);
   private static final Map allBaseAfterDoRenderShadowAndFireInferiors = new Hashtable(0);
   private static final List beforeGetColorMultiplierHookTypes = new LinkedList();
   private static final List overrideGetColorMultiplierHookTypes = new LinkedList();
   private static final List afterGetColorMultiplierHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeGetColorMultiplierHooks;
   private RenderPlayerBase[] overrideGetColorMultiplierHooks;
   private RenderPlayerBase[] afterGetColorMultiplierHooks;
   public boolean isGetColorMultiplierModded;
   private static final Map allBaseBeforeGetColorMultiplierSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeGetColorMultiplierInferiors = new Hashtable(0);
   private static final Map allBaseOverrideGetColorMultiplierSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideGetColorMultiplierInferiors = new Hashtable(0);
   private static final Map allBaseAfterGetColorMultiplierSuperiors = new Hashtable(0);
   private static final Map allBaseAfterGetColorMultiplierInferiors = new Hashtable(0);
   private static final List beforeGetDeathMaxRotationHookTypes = new LinkedList();
   private static final List overrideGetDeathMaxRotationHookTypes = new LinkedList();
   private static final List afterGetDeathMaxRotationHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeGetDeathMaxRotationHooks;
   private RenderPlayerBase[] overrideGetDeathMaxRotationHooks;
   private RenderPlayerBase[] afterGetDeathMaxRotationHooks;
   public boolean isGetDeathMaxRotationModded;
   private static final Map allBaseBeforeGetDeathMaxRotationSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeGetDeathMaxRotationInferiors = new Hashtable(0);
   private static final Map allBaseOverrideGetDeathMaxRotationSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideGetDeathMaxRotationInferiors = new Hashtable(0);
   private static final Map allBaseAfterGetDeathMaxRotationSuperiors = new Hashtable(0);
   private static final Map allBaseAfterGetDeathMaxRotationInferiors = new Hashtable(0);
   private static final List beforeGetFontRendererFromRenderManagerHookTypes = new LinkedList();
   private static final List overrideGetFontRendererFromRenderManagerHookTypes = new LinkedList();
   private static final List afterGetFontRendererFromRenderManagerHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeGetFontRendererFromRenderManagerHooks;
   private RenderPlayerBase[] overrideGetFontRendererFromRenderManagerHooks;
   private RenderPlayerBase[] afterGetFontRendererFromRenderManagerHooks;
   public boolean isGetFontRendererFromRenderManagerModded;
   private static final Map allBaseBeforeGetFontRendererFromRenderManagerSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeGetFontRendererFromRenderManagerInferiors = new Hashtable(0);
   private static final Map allBaseOverrideGetFontRendererFromRenderManagerSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideGetFontRendererFromRenderManagerInferiors = new Hashtable(0);
   private static final Map allBaseAfterGetFontRendererFromRenderManagerSuperiors = new Hashtable(0);
   private static final Map allBaseAfterGetFontRendererFromRenderManagerInferiors = new Hashtable(0);
   private static final List beforeGetResourceLocationFromPlayerHookTypes = new LinkedList();
   private static final List overrideGetResourceLocationFromPlayerHookTypes = new LinkedList();
   private static final List afterGetResourceLocationFromPlayerHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeGetResourceLocationFromPlayerHooks;
   private RenderPlayerBase[] overrideGetResourceLocationFromPlayerHooks;
   private RenderPlayerBase[] afterGetResourceLocationFromPlayerHooks;
   public boolean isGetResourceLocationFromPlayerModded;
   private static final Map allBaseBeforeGetResourceLocationFromPlayerSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeGetResourceLocationFromPlayerInferiors = new Hashtable(0);
   private static final Map allBaseOverrideGetResourceLocationFromPlayerSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideGetResourceLocationFromPlayerInferiors = new Hashtable(0);
   private static final Map allBaseAfterGetResourceLocationFromPlayerSuperiors = new Hashtable(0);
   private static final Map allBaseAfterGetResourceLocationFromPlayerInferiors = new Hashtable(0);
   private static final List beforeHandleRotationFloatHookTypes = new LinkedList();
   private static final List overrideHandleRotationFloatHookTypes = new LinkedList();
   private static final List afterHandleRotationFloatHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeHandleRotationFloatHooks;
   private RenderPlayerBase[] overrideHandleRotationFloatHooks;
   private RenderPlayerBase[] afterHandleRotationFloatHooks;
   public boolean isHandleRotationFloatModded;
   private static final Map allBaseBeforeHandleRotationFloatSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeHandleRotationFloatInferiors = new Hashtable(0);
   private static final Map allBaseOverrideHandleRotationFloatSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideHandleRotationFloatInferiors = new Hashtable(0);
   private static final Map allBaseAfterHandleRotationFloatSuperiors = new Hashtable(0);
   private static final Map allBaseAfterHandleRotationFloatInferiors = new Hashtable(0);
   private static final List beforeInheritRenderPassHookTypes = new LinkedList();
   private static final List overrideInheritRenderPassHookTypes = new LinkedList();
   private static final List afterInheritRenderPassHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeInheritRenderPassHooks;
   private RenderPlayerBase[] overrideInheritRenderPassHooks;
   private RenderPlayerBase[] afterInheritRenderPassHooks;
   public boolean isInheritRenderPassModded;
   private static final Map allBaseBeforeInheritRenderPassSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeInheritRenderPassInferiors = new Hashtable(0);
   private static final Map allBaseOverrideInheritRenderPassSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideInheritRenderPassInferiors = new Hashtable(0);
   private static final Map allBaseAfterInheritRenderPassSuperiors = new Hashtable(0);
   private static final Map allBaseAfterInheritRenderPassInferiors = new Hashtable(0);
   private static final List beforeLoadTextureHookTypes = new LinkedList();
   private static final List overrideLoadTextureHookTypes = new LinkedList();
   private static final List afterLoadTextureHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeLoadTextureHooks;
   private RenderPlayerBase[] overrideLoadTextureHooks;
   private RenderPlayerBase[] afterLoadTextureHooks;
   public boolean isLoadTextureModded;
   private static final Map allBaseBeforeLoadTextureSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeLoadTextureInferiors = new Hashtable(0);
   private static final Map allBaseOverrideLoadTextureSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideLoadTextureInferiors = new Hashtable(0);
   private static final Map allBaseAfterLoadTextureSuperiors = new Hashtable(0);
   private static final Map allBaseAfterLoadTextureInferiors = new Hashtable(0);
   private static final List beforeLoadTextureOfEntityHookTypes = new LinkedList();
   private static final List overrideLoadTextureOfEntityHookTypes = new LinkedList();
   private static final List afterLoadTextureOfEntityHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeLoadTextureOfEntityHooks;
   private RenderPlayerBase[] overrideLoadTextureOfEntityHooks;
   private RenderPlayerBase[] afterLoadTextureOfEntityHooks;
   public boolean isLoadTextureOfEntityModded;
   private static final Map allBaseBeforeLoadTextureOfEntitySuperiors = new Hashtable(0);
   private static final Map allBaseBeforeLoadTextureOfEntityInferiors = new Hashtable(0);
   private static final Map allBaseOverrideLoadTextureOfEntitySuperiors = new Hashtable(0);
   private static final Map allBaseOverrideLoadTextureOfEntityInferiors = new Hashtable(0);
   private static final Map allBaseAfterLoadTextureOfEntitySuperiors = new Hashtable(0);
   private static final Map allBaseAfterLoadTextureOfEntityInferiors = new Hashtable(0);
   private static final List beforePassSpecialRenderHookTypes = new LinkedList();
   private static final List overridePassSpecialRenderHookTypes = new LinkedList();
   private static final List afterPassSpecialRenderHookTypes = new LinkedList();
   private RenderPlayerBase[] beforePassSpecialRenderHooks;
   private RenderPlayerBase[] overridePassSpecialRenderHooks;
   private RenderPlayerBase[] afterPassSpecialRenderHooks;
   public boolean isPassSpecialRenderModded;
   private static final Map allBaseBeforePassSpecialRenderSuperiors = new Hashtable(0);
   private static final Map allBaseBeforePassSpecialRenderInferiors = new Hashtable(0);
   private static final Map allBaseOverridePassSpecialRenderSuperiors = new Hashtable(0);
   private static final Map allBaseOverridePassSpecialRenderInferiors = new Hashtable(0);
   private static final Map allBaseAfterPassSpecialRenderSuperiors = new Hashtable(0);
   private static final Map allBaseAfterPassSpecialRenderInferiors = new Hashtable(0);
   private static final List beforePerformStaticEntityRebuildHookTypes = new LinkedList();
   private static final List overridePerformStaticEntityRebuildHookTypes = new LinkedList();
   private static final List afterPerformStaticEntityRebuildHookTypes = new LinkedList();
   private RenderPlayerBase[] beforePerformStaticEntityRebuildHooks;
   private RenderPlayerBase[] overridePerformStaticEntityRebuildHooks;
   private RenderPlayerBase[] afterPerformStaticEntityRebuildHooks;
   public boolean isPerformStaticEntityRebuildModded;
   private static final Map allBaseBeforePerformStaticEntityRebuildSuperiors = new Hashtable(0);
   private static final Map allBaseBeforePerformStaticEntityRebuildInferiors = new Hashtable(0);
   private static final Map allBaseOverridePerformStaticEntityRebuildSuperiors = new Hashtable(0);
   private static final Map allBaseOverridePerformStaticEntityRebuildInferiors = new Hashtable(0);
   private static final Map allBaseAfterPerformStaticEntityRebuildSuperiors = new Hashtable(0);
   private static final Map allBaseAfterPerformStaticEntityRebuildInferiors = new Hashtable(0);
   private static final List beforeRenderArrowsStuckInEntityHookTypes = new LinkedList();
   private static final List overrideRenderArrowsStuckInEntityHookTypes = new LinkedList();
   private static final List afterRenderArrowsStuckInEntityHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeRenderArrowsStuckInEntityHooks;
   private RenderPlayerBase[] overrideRenderArrowsStuckInEntityHooks;
   private RenderPlayerBase[] afterRenderArrowsStuckInEntityHooks;
   public boolean isRenderArrowsStuckInEntityModded;
   private static final Map allBaseBeforeRenderArrowsStuckInEntitySuperiors = new Hashtable(0);
   private static final Map allBaseBeforeRenderArrowsStuckInEntityInferiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderArrowsStuckInEntitySuperiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderArrowsStuckInEntityInferiors = new Hashtable(0);
   private static final Map allBaseAfterRenderArrowsStuckInEntitySuperiors = new Hashtable(0);
   private static final Map allBaseAfterRenderArrowsStuckInEntityInferiors = new Hashtable(0);
   private static final List beforeRenderFirstPersonArmHookTypes = new LinkedList();
   private static final List overrideRenderFirstPersonArmHookTypes = new LinkedList();
   private static final List afterRenderFirstPersonArmHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeRenderFirstPersonArmHooks;
   private RenderPlayerBase[] overrideRenderFirstPersonArmHooks;
   private RenderPlayerBase[] afterRenderFirstPersonArmHooks;
   public boolean isRenderFirstPersonArmModded;
   private static final Map allBaseBeforeRenderFirstPersonArmSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeRenderFirstPersonArmInferiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderFirstPersonArmSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderFirstPersonArmInferiors = new Hashtable(0);
   private static final Map allBaseAfterRenderFirstPersonArmSuperiors = new Hashtable(0);
   private static final Map allBaseAfterRenderFirstPersonArmInferiors = new Hashtable(0);
   private static final List beforeRenderLivingLabelHookTypes = new LinkedList();
   private static final List overrideRenderLivingLabelHookTypes = new LinkedList();
   private static final List afterRenderLivingLabelHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeRenderLivingLabelHooks;
   private RenderPlayerBase[] overrideRenderLivingLabelHooks;
   private RenderPlayerBase[] afterRenderLivingLabelHooks;
   public boolean isRenderLivingLabelModded;
   private static final Map allBaseBeforeRenderLivingLabelSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeRenderLivingLabelInferiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderLivingLabelSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderLivingLabelInferiors = new Hashtable(0);
   private static final Map allBaseAfterRenderLivingLabelSuperiors = new Hashtable(0);
   private static final Map allBaseAfterRenderLivingLabelInferiors = new Hashtable(0);
   private static final List beforeRenderModelHookTypes = new LinkedList();
   private static final List overrideRenderModelHookTypes = new LinkedList();
   private static final List afterRenderModelHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeRenderModelHooks;
   private RenderPlayerBase[] overrideRenderModelHooks;
   private RenderPlayerBase[] afterRenderModelHooks;
   public boolean isRenderModelModded;
   private static final Map allBaseBeforeRenderModelSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeRenderModelInferiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderModelSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderModelInferiors = new Hashtable(0);
   private static final Map allBaseAfterRenderModelSuperiors = new Hashtable(0);
   private static final Map allBaseAfterRenderModelInferiors = new Hashtable(0);
   private static final List beforeRenderPlayerHookTypes = new LinkedList();
   private static final List overrideRenderPlayerHookTypes = new LinkedList();
   private static final List afterRenderPlayerHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeRenderPlayerHooks;
   private RenderPlayerBase[] overrideRenderPlayerHooks;
   private RenderPlayerBase[] afterRenderPlayerHooks;
   public boolean isRenderPlayerModded;
   private static final Map allBaseBeforeRenderPlayerSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeRenderPlayerInferiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderPlayerSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderPlayerInferiors = new Hashtable(0);
   private static final Map allBaseAfterRenderPlayerSuperiors = new Hashtable(0);
   private static final Map allBaseAfterRenderPlayerInferiors = new Hashtable(0);
   private static final List beforeRenderPlayerNameAndScoreLabelHookTypes = new LinkedList();
   private static final List overrideRenderPlayerNameAndScoreLabelHookTypes = new LinkedList();
   private static final List afterRenderPlayerNameAndScoreLabelHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeRenderPlayerNameAndScoreLabelHooks;
   private RenderPlayerBase[] overrideRenderPlayerNameAndScoreLabelHooks;
   private RenderPlayerBase[] afterRenderPlayerNameAndScoreLabelHooks;
   public boolean isRenderPlayerNameAndScoreLabelModded;
   private static final Map allBaseBeforeRenderPlayerNameAndScoreLabelSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeRenderPlayerNameAndScoreLabelInferiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderPlayerNameAndScoreLabelSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderPlayerNameAndScoreLabelInferiors = new Hashtable(0);
   private static final Map allBaseAfterRenderPlayerNameAndScoreLabelSuperiors = new Hashtable(0);
   private static final Map allBaseAfterRenderPlayerNameAndScoreLabelInferiors = new Hashtable(0);
   private static final List beforeRenderPlayerScaleHookTypes = new LinkedList();
   private static final List overrideRenderPlayerScaleHookTypes = new LinkedList();
   private static final List afterRenderPlayerScaleHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeRenderPlayerScaleHooks;
   private RenderPlayerBase[] overrideRenderPlayerScaleHooks;
   private RenderPlayerBase[] afterRenderPlayerScaleHooks;
   public boolean isRenderPlayerScaleModded;
   private static final Map allBaseBeforeRenderPlayerScaleSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeRenderPlayerScaleInferiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderPlayerScaleSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderPlayerScaleInferiors = new Hashtable(0);
   private static final Map allBaseAfterRenderPlayerScaleSuperiors = new Hashtable(0);
   private static final Map allBaseAfterRenderPlayerScaleInferiors = new Hashtable(0);
   private static final List beforeRenderPlayerSleepHookTypes = new LinkedList();
   private static final List overrideRenderPlayerSleepHookTypes = new LinkedList();
   private static final List afterRenderPlayerSleepHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeRenderPlayerSleepHooks;
   private RenderPlayerBase[] overrideRenderPlayerSleepHooks;
   private RenderPlayerBase[] afterRenderPlayerSleepHooks;
   public boolean isRenderPlayerSleepModded;
   private static final Map allBaseBeforeRenderPlayerSleepSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeRenderPlayerSleepInferiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderPlayerSleepSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderPlayerSleepInferiors = new Hashtable(0);
   private static final Map allBaseAfterRenderPlayerSleepSuperiors = new Hashtable(0);
   private static final Map allBaseAfterRenderPlayerSleepInferiors = new Hashtable(0);
   private static final List beforeRenderSpecialsHookTypes = new LinkedList();
   private static final List overrideRenderSpecialsHookTypes = new LinkedList();
   private static final List afterRenderSpecialsHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeRenderSpecialsHooks;
   private RenderPlayerBase[] overrideRenderSpecialsHooks;
   private RenderPlayerBase[] afterRenderSpecialsHooks;
   public boolean isRenderSpecialsModded;
   private static final Map allBaseBeforeRenderSpecialsSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeRenderSpecialsInferiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderSpecialsSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderSpecialsInferiors = new Hashtable(0);
   private static final Map allBaseAfterRenderSpecialsSuperiors = new Hashtable(0);
   private static final Map allBaseAfterRenderSpecialsInferiors = new Hashtable(0);
   private static final List beforeRenderSwingProgressHookTypes = new LinkedList();
   private static final List overrideRenderSwingProgressHookTypes = new LinkedList();
   private static final List afterRenderSwingProgressHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeRenderSwingProgressHooks;
   private RenderPlayerBase[] overrideRenderSwingProgressHooks;
   private RenderPlayerBase[] afterRenderSwingProgressHooks;
   public boolean isRenderSwingProgressModded;
   private static final Map allBaseBeforeRenderSwingProgressSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeRenderSwingProgressInferiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderSwingProgressSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderSwingProgressInferiors = new Hashtable(0);
   private static final Map allBaseAfterRenderSwingProgressSuperiors = new Hashtable(0);
   private static final Map allBaseAfterRenderSwingProgressInferiors = new Hashtable(0);
   private static final List beforeRotatePlayerHookTypes = new LinkedList();
   private static final List overrideRotatePlayerHookTypes = new LinkedList();
   private static final List afterRotatePlayerHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeRotatePlayerHooks;
   private RenderPlayerBase[] overrideRotatePlayerHooks;
   private RenderPlayerBase[] afterRotatePlayerHooks;
   public boolean isRotatePlayerModded;
   private static final Map allBaseBeforeRotatePlayerSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeRotatePlayerInferiors = new Hashtable(0);
   private static final Map allBaseOverrideRotatePlayerSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideRotatePlayerInferiors = new Hashtable(0);
   private static final Map allBaseAfterRotatePlayerSuperiors = new Hashtable(0);
   private static final Map allBaseAfterRotatePlayerInferiors = new Hashtable(0);
   private static final List beforeSetArmorModelHookTypes = new LinkedList();
   private static final List overrideSetArmorModelHookTypes = new LinkedList();
   private static final List afterSetArmorModelHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeSetArmorModelHooks;
   private RenderPlayerBase[] overrideSetArmorModelHooks;
   private RenderPlayerBase[] afterSetArmorModelHooks;
   public boolean isSetArmorModelModded;
   private static final Map allBaseBeforeSetArmorModelSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeSetArmorModelInferiors = new Hashtable(0);
   private static final Map allBaseOverrideSetArmorModelSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideSetArmorModelInferiors = new Hashtable(0);
   private static final Map allBaseAfterSetArmorModelSuperiors = new Hashtable(0);
   private static final Map allBaseAfterSetArmorModelInferiors = new Hashtable(0);
   private static final List beforeSetPassArmorModelHookTypes = new LinkedList();
   private static final List overrideSetPassArmorModelHookTypes = new LinkedList();
   private static final List afterSetPassArmorModelHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeSetPassArmorModelHooks;
   private RenderPlayerBase[] overrideSetPassArmorModelHooks;
   private RenderPlayerBase[] afterSetPassArmorModelHooks;
   public boolean isSetPassArmorModelModded;
   private static final Map allBaseBeforeSetPassArmorModelSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeSetPassArmorModelInferiors = new Hashtable(0);
   private static final Map allBaseOverrideSetPassArmorModelSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideSetPassArmorModelInferiors = new Hashtable(0);
   private static final Map allBaseAfterSetPassArmorModelSuperiors = new Hashtable(0);
   private static final Map allBaseAfterSetPassArmorModelInferiors = new Hashtable(0);
   private static final List beforeSetRenderManagerHookTypes = new LinkedList();
   private static final List overrideSetRenderManagerHookTypes = new LinkedList();
   private static final List afterSetRenderManagerHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeSetRenderManagerHooks;
   private RenderPlayerBase[] overrideSetRenderManagerHooks;
   private RenderPlayerBase[] afterSetRenderManagerHooks;
   public boolean isSetRenderManagerModded;
   private static final Map allBaseBeforeSetRenderManagerSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeSetRenderManagerInferiors = new Hashtable(0);
   private static final Map allBaseOverrideSetRenderManagerSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideSetRenderManagerInferiors = new Hashtable(0);
   private static final Map allBaseAfterSetRenderManagerSuperiors = new Hashtable(0);
   private static final Map allBaseAfterSetRenderManagerInferiors = new Hashtable(0);
   private static final List beforeSetRenderPassModelHookTypes = new LinkedList();
   private static final List overrideSetRenderPassModelHookTypes = new LinkedList();
   private static final List afterSetRenderPassModelHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeSetRenderPassModelHooks;
   private RenderPlayerBase[] overrideSetRenderPassModelHooks;
   private RenderPlayerBase[] afterSetRenderPassModelHooks;
   public boolean isSetRenderPassModelModded;
   private static final Map allBaseBeforeSetRenderPassModelSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeSetRenderPassModelInferiors = new Hashtable(0);
   private static final Map allBaseOverrideSetRenderPassModelSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideSetRenderPassModelInferiors = new Hashtable(0);
   private static final Map allBaseAfterSetRenderPassModelSuperiors = new Hashtable(0);
   private static final Map allBaseAfterSetRenderPassModelInferiors = new Hashtable(0);
   private static final List beforeUpdateIconsHookTypes = new LinkedList();
   private static final List overrideUpdateIconsHookTypes = new LinkedList();
   private static final List afterUpdateIconsHookTypes = new LinkedList();
   private RenderPlayerBase[] beforeUpdateIconsHooks;
   private RenderPlayerBase[] overrideUpdateIconsHooks;
   private RenderPlayerBase[] afterUpdateIconsHooks;
   public boolean isUpdateIconsModded;
   private static final Map allBaseBeforeUpdateIconsSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeUpdateIconsInferiors = new Hashtable(0);
   private static final Map allBaseOverrideUpdateIconsSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideUpdateIconsInferiors = new Hashtable(0);
   private static final Map allBaseAfterUpdateIconsSuperiors = new Hashtable(0);
   private static final Map allBaseAfterUpdateIconsInferiors = new Hashtable(0);
   protected final IRenderPlayerAPI renderPlayer;
   private static final Set keys = new HashSet();
   private static final Map keysToVirtualIds = new HashMap();
   private static final Set dynamicTypes = new HashSet();
   private static final Map virtualDynamicHookMethods = new HashMap();
   private static final Map beforeDynamicHookMethods = new HashMap();
   private static final Map overrideDynamicHookMethods = new HashMap();
   private static final Map afterDynamicHookMethods = new HashMap();
   private static final List beforeLocalConstructingHookTypes = new LinkedList();
   private static final List afterLocalConstructingHookTypes = new LinkedList();
   private static final Map beforeDynamicHookTypes = new Hashtable(0);
   private static final Map overrideDynamicHookTypes = new Hashtable(0);
   private static final Map afterDynamicHookTypes = new Hashtable(0);
   private RenderPlayerBase[] beforeLocalConstructingHooks;
   private RenderPlayerBase[] afterLocalConstructingHooks;
   private final Map baseObjectsToId = new Hashtable();
   private final Map allBaseObjects = new Hashtable();
   private final Set unmodifiableAllBaseIds;
   private static final Map allBaseConstructors = new Hashtable();
   private static final Set unmodifiableAllIds;
   private static final Map allBaseBeforeLocalConstructingSuperiors;
   private static final Map allBaseBeforeLocalConstructingInferiors;
   private static final Map allBaseAfterLocalConstructingSuperiors;
   private static final Map allBaseAfterLocalConstructingInferiors;
   private static final Map allBaseBeforeDynamicSuperiors;
   private static final Map allBaseBeforeDynamicInferiors;
   private static final Map allBaseOverrideDynamicSuperiors;
   private static final Map allBaseOverrideDynamicInferiors;
   private static final Map allBaseAfterDynamicSuperiors;
   private static final Map allBaseAfterDynamicInferiors;
   private static boolean initialized;

   private static void log(String text) {
      System.out.println(text);
      logger.fine(text);
   }

   public static void register(String id, Class baseClass) {
      register((String)id, (Class)baseClass, (RenderPlayerBaseSorting)null);
   }

   public static void register(String id, Class baseClass, RenderPlayerBaseSorting baseSorting) {
      try {
         register(baseClass, id, baseSorting);
      } catch (RuntimeException var4) {
         if (id != null) {
            log("Render Player: failed to register id '" + id + "'");
         } else {
            log("Render Player: failed to register RenderPlayerBase");
         }

         throw var4;
      }
   }

   private static void register(Class baseClass, String id, RenderPlayerBaseSorting baseSorting) {
      if (!isCreated) {
         try {
            Method mandatory = RenderPlayer.class.getMethod("getRenderPlayerBase", String.class);
            if (mandatory.getReturnType() != RenderPlayerBase.class) {
               throw new NoSuchMethodException(RenderPlayerBase.class.getName() + " " + RenderPlayer.class.getName() + ".getRenderPlayerBase(" + String.class.getName() + ")");
            }
         } catch (NoSuchMethodException var16) {
            String[] errorMessageParts = new String[]{"========================================", "The API \"Render Player\" version 1.0 of the mod \"Render Player API core 1.0\" can not be created!", "----------------------------------------", "Mandatory member method \"{0} getRenderPlayerBase({3})\" not found in class \"{1}\".", "There are three scenarios this can happen:", "* Minecraft Forge is missing a Render Player API core which Minecraft version matches its own.", "  Download and install the latest Render Player API core for the Minecraft version you were trying to run.", "* The code of the class \"{2}\" of Render Player API core has been modified beyond recognition by another Minecraft Forge coremod.", "  Try temporary deinstallation of other core mods to find the culprit and deinstall it permanently to fix this specific problem.", "* Render Player API core has not been installed correctly.", "  Deinstall Render Player API core and install it again following the installation instructions in the readme file.", "========================================"};
            String baseRenderPlayerClassName = RenderPlayerBase.class.getName();
            String targetClassName = RenderPlayer.class.getName();
            String targetClassFileName = targetClassName.replace(".", File.separator);
            String stringClassName = String.class.getName();

            for(int i = 0; i < errorMessageParts.length; ++i) {
               errorMessageParts[i] = MessageFormat.format(errorMessageParts[i], baseRenderPlayerClassName, targetClassName, targetClassFileName, stringClassName);
            }

            String[] var21 = errorMessageParts;
            int var10 = errorMessageParts.length;

            int var11;
            String errorMessagePart;
            for(var11 = 0; var11 < var10; ++var11) {
               errorMessagePart = var21[var11];
               logger.severe(errorMessagePart);
            }

            var21 = errorMessageParts;
            var10 = errorMessageParts.length;

            for(var11 = 0; var11 < var10; ++var11) {
               errorMessagePart = var21[var11];
               System.err.println(errorMessagePart);
            }

            String errorMessage = "\n\n";
            String[] var23 = errorMessageParts;
            var11 = errorMessageParts.length;

            for(int var24 = 0; var24 < var11; ++var24) {
               String errorMessagePart = var23[var24];
               errorMessage = errorMessage + "\t" + errorMessagePart + "\n";
            }

            throw new RuntimeException(errorMessage, var16);
         }

         log("Render Player 1.0 Created");
         isCreated = true;
      }

      if (id == null) {
         throw new NullPointerException("Argument 'id' can not be null");
      } else if (baseClass == null) {
         throw new NullPointerException("Argument 'baseClass' can not be null");
      } else {
         Constructor allreadyRegistered = (Constructor)allBaseConstructors.get(id);
         if (allreadyRegistered != null) {
            throw new IllegalArgumentException("The class '" + baseClass.getName() + "' can not be registered with the id '" + id + "' because the class '" + allreadyRegistered.getDeclaringClass().getName() + "' has allready been registered with the same id");
         } else {
            Constructor baseConstructor;
            try {
               baseConstructor = baseClass.getDeclaredConstructor(Classes);
            } catch (Throwable var15) {
               try {
                  baseConstructor = baseClass.getDeclaredConstructor(Class);
               } catch (Throwable var14) {
                  throw new IllegalArgumentException("Can not find necessary constructor with one argument of type '" + RenderPlayerAPI.class.getName() + "' and eventually a second argument of type 'String' in the class '" + baseClass.getName() + "'", var15);
               }
            }

            allBaseConstructors.put(id, baseConstructor);
            if (baseSorting != null) {
               addSorting(id, allBaseBeforeLocalConstructingSuperiors, baseSorting.getBeforeLocalConstructingSuperiors());
               addSorting(id, allBaseBeforeLocalConstructingInferiors, baseSorting.getBeforeLocalConstructingInferiors());
               addSorting(id, allBaseAfterLocalConstructingSuperiors, baseSorting.getAfterLocalConstructingSuperiors());
               addSorting(id, allBaseAfterLocalConstructingInferiors, baseSorting.getAfterLocalConstructingInferiors());
               addDynamicSorting(id, allBaseBeforeDynamicSuperiors, baseSorting.getDynamicBeforeSuperiors());
               addDynamicSorting(id, allBaseBeforeDynamicInferiors, baseSorting.getDynamicBeforeInferiors());
               addDynamicSorting(id, allBaseOverrideDynamicSuperiors, baseSorting.getDynamicOverrideSuperiors());
               addDynamicSorting(id, allBaseOverrideDynamicInferiors, baseSorting.getDynamicOverrideInferiors());
               addDynamicSorting(id, allBaseAfterDynamicSuperiors, baseSorting.getDynamicAfterSuperiors());
               addDynamicSorting(id, allBaseAfterDynamicInferiors, baseSorting.getDynamicAfterInferiors());
               addSorting(id, allBaseBeforeDoRenderLabelSuperiors, baseSorting.getBeforeDoRenderLabelSuperiors());
               addSorting(id, allBaseBeforeDoRenderLabelInferiors, baseSorting.getBeforeDoRenderLabelInferiors());
               addSorting(id, allBaseOverrideDoRenderLabelSuperiors, baseSorting.getOverrideDoRenderLabelSuperiors());
               addSorting(id, allBaseOverrideDoRenderLabelInferiors, baseSorting.getOverrideDoRenderLabelInferiors());
               addSorting(id, allBaseAfterDoRenderLabelSuperiors, baseSorting.getAfterDoRenderLabelSuperiors());
               addSorting(id, allBaseAfterDoRenderLabelInferiors, baseSorting.getAfterDoRenderLabelInferiors());
               addSorting(id, allBaseBeforeDoRenderShadowAndFireSuperiors, baseSorting.getBeforeDoRenderShadowAndFireSuperiors());
               addSorting(id, allBaseBeforeDoRenderShadowAndFireInferiors, baseSorting.getBeforeDoRenderShadowAndFireInferiors());
               addSorting(id, allBaseOverrideDoRenderShadowAndFireSuperiors, baseSorting.getOverrideDoRenderShadowAndFireSuperiors());
               addSorting(id, allBaseOverrideDoRenderShadowAndFireInferiors, baseSorting.getOverrideDoRenderShadowAndFireInferiors());
               addSorting(id, allBaseAfterDoRenderShadowAndFireSuperiors, baseSorting.getAfterDoRenderShadowAndFireSuperiors());
               addSorting(id, allBaseAfterDoRenderShadowAndFireInferiors, baseSorting.getAfterDoRenderShadowAndFireInferiors());
               addSorting(id, allBaseBeforeGetColorMultiplierSuperiors, baseSorting.getBeforeGetColorMultiplierSuperiors());
               addSorting(id, allBaseBeforeGetColorMultiplierInferiors, baseSorting.getBeforeGetColorMultiplierInferiors());
               addSorting(id, allBaseOverrideGetColorMultiplierSuperiors, baseSorting.getOverrideGetColorMultiplierSuperiors());
               addSorting(id, allBaseOverrideGetColorMultiplierInferiors, baseSorting.getOverrideGetColorMultiplierInferiors());
               addSorting(id, allBaseAfterGetColorMultiplierSuperiors, baseSorting.getAfterGetColorMultiplierSuperiors());
               addSorting(id, allBaseAfterGetColorMultiplierInferiors, baseSorting.getAfterGetColorMultiplierInferiors());
               addSorting(id, allBaseBeforeGetDeathMaxRotationSuperiors, baseSorting.getBeforeGetDeathMaxRotationSuperiors());
               addSorting(id, allBaseBeforeGetDeathMaxRotationInferiors, baseSorting.getBeforeGetDeathMaxRotationInferiors());
               addSorting(id, allBaseOverrideGetDeathMaxRotationSuperiors, baseSorting.getOverrideGetDeathMaxRotationSuperiors());
               addSorting(id, allBaseOverrideGetDeathMaxRotationInferiors, baseSorting.getOverrideGetDeathMaxRotationInferiors());
               addSorting(id, allBaseAfterGetDeathMaxRotationSuperiors, baseSorting.getAfterGetDeathMaxRotationSuperiors());
               addSorting(id, allBaseAfterGetDeathMaxRotationInferiors, baseSorting.getAfterGetDeathMaxRotationInferiors());
               addSorting(id, allBaseBeforeGetFontRendererFromRenderManagerSuperiors, baseSorting.getBeforeGetFontRendererFromRenderManagerSuperiors());
               addSorting(id, allBaseBeforeGetFontRendererFromRenderManagerInferiors, baseSorting.getBeforeGetFontRendererFromRenderManagerInferiors());
               addSorting(id, allBaseOverrideGetFontRendererFromRenderManagerSuperiors, baseSorting.getOverrideGetFontRendererFromRenderManagerSuperiors());
               addSorting(id, allBaseOverrideGetFontRendererFromRenderManagerInferiors, baseSorting.getOverrideGetFontRendererFromRenderManagerInferiors());
               addSorting(id, allBaseAfterGetFontRendererFromRenderManagerSuperiors, baseSorting.getAfterGetFontRendererFromRenderManagerSuperiors());
               addSorting(id, allBaseAfterGetFontRendererFromRenderManagerInferiors, baseSorting.getAfterGetFontRendererFromRenderManagerInferiors());
               addSorting(id, allBaseBeforeGetResourceLocationFromPlayerSuperiors, baseSorting.getBeforeGetResourceLocationFromPlayerSuperiors());
               addSorting(id, allBaseBeforeGetResourceLocationFromPlayerInferiors, baseSorting.getBeforeGetResourceLocationFromPlayerInferiors());
               addSorting(id, allBaseOverrideGetResourceLocationFromPlayerSuperiors, baseSorting.getOverrideGetResourceLocationFromPlayerSuperiors());
               addSorting(id, allBaseOverrideGetResourceLocationFromPlayerInferiors, baseSorting.getOverrideGetResourceLocationFromPlayerInferiors());
               addSorting(id, allBaseAfterGetResourceLocationFromPlayerSuperiors, baseSorting.getAfterGetResourceLocationFromPlayerSuperiors());
               addSorting(id, allBaseAfterGetResourceLocationFromPlayerInferiors, baseSorting.getAfterGetResourceLocationFromPlayerInferiors());
               addSorting(id, allBaseBeforeHandleRotationFloatSuperiors, baseSorting.getBeforeHandleRotationFloatSuperiors());
               addSorting(id, allBaseBeforeHandleRotationFloatInferiors, baseSorting.getBeforeHandleRotationFloatInferiors());
               addSorting(id, allBaseOverrideHandleRotationFloatSuperiors, baseSorting.getOverrideHandleRotationFloatSuperiors());
               addSorting(id, allBaseOverrideHandleRotationFloatInferiors, baseSorting.getOverrideHandleRotationFloatInferiors());
               addSorting(id, allBaseAfterHandleRotationFloatSuperiors, baseSorting.getAfterHandleRotationFloatSuperiors());
               addSorting(id, allBaseAfterHandleRotationFloatInferiors, baseSorting.getAfterHandleRotationFloatInferiors());
               addSorting(id, allBaseBeforeInheritRenderPassSuperiors, baseSorting.getBeforeInheritRenderPassSuperiors());
               addSorting(id, allBaseBeforeInheritRenderPassInferiors, baseSorting.getBeforeInheritRenderPassInferiors());
               addSorting(id, allBaseOverrideInheritRenderPassSuperiors, baseSorting.getOverrideInheritRenderPassSuperiors());
               addSorting(id, allBaseOverrideInheritRenderPassInferiors, baseSorting.getOverrideInheritRenderPassInferiors());
               addSorting(id, allBaseAfterInheritRenderPassSuperiors, baseSorting.getAfterInheritRenderPassSuperiors());
               addSorting(id, allBaseAfterInheritRenderPassInferiors, baseSorting.getAfterInheritRenderPassInferiors());
               addSorting(id, allBaseBeforeLoadTextureSuperiors, baseSorting.getBeforeLoadTextureSuperiors());
               addSorting(id, allBaseBeforeLoadTextureInferiors, baseSorting.getBeforeLoadTextureInferiors());
               addSorting(id, allBaseOverrideLoadTextureSuperiors, baseSorting.getOverrideLoadTextureSuperiors());
               addSorting(id, allBaseOverrideLoadTextureInferiors, baseSorting.getOverrideLoadTextureInferiors());
               addSorting(id, allBaseAfterLoadTextureSuperiors, baseSorting.getAfterLoadTextureSuperiors());
               addSorting(id, allBaseAfterLoadTextureInferiors, baseSorting.getAfterLoadTextureInferiors());
               addSorting(id, allBaseBeforeLoadTextureOfEntitySuperiors, baseSorting.getBeforeLoadTextureOfEntitySuperiors());
               addSorting(id, allBaseBeforeLoadTextureOfEntityInferiors, baseSorting.getBeforeLoadTextureOfEntityInferiors());
               addSorting(id, allBaseOverrideLoadTextureOfEntitySuperiors, baseSorting.getOverrideLoadTextureOfEntitySuperiors());
               addSorting(id, allBaseOverrideLoadTextureOfEntityInferiors, baseSorting.getOverrideLoadTextureOfEntityInferiors());
               addSorting(id, allBaseAfterLoadTextureOfEntitySuperiors, baseSorting.getAfterLoadTextureOfEntitySuperiors());
               addSorting(id, allBaseAfterLoadTextureOfEntityInferiors, baseSorting.getAfterLoadTextureOfEntityInferiors());
               addSorting(id, allBaseBeforePassSpecialRenderSuperiors, baseSorting.getBeforePassSpecialRenderSuperiors());
               addSorting(id, allBaseBeforePassSpecialRenderInferiors, baseSorting.getBeforePassSpecialRenderInferiors());
               addSorting(id, allBaseOverridePassSpecialRenderSuperiors, baseSorting.getOverridePassSpecialRenderSuperiors());
               addSorting(id, allBaseOverridePassSpecialRenderInferiors, baseSorting.getOverridePassSpecialRenderInferiors());
               addSorting(id, allBaseAfterPassSpecialRenderSuperiors, baseSorting.getAfterPassSpecialRenderSuperiors());
               addSorting(id, allBaseAfterPassSpecialRenderInferiors, baseSorting.getAfterPassSpecialRenderInferiors());
               addSorting(id, allBaseBeforePerformStaticEntityRebuildSuperiors, baseSorting.getBeforePerformStaticEntityRebuildSuperiors());
               addSorting(id, allBaseBeforePerformStaticEntityRebuildInferiors, baseSorting.getBeforePerformStaticEntityRebuildInferiors());
               addSorting(id, allBaseOverridePerformStaticEntityRebuildSuperiors, baseSorting.getOverridePerformStaticEntityRebuildSuperiors());
               addSorting(id, allBaseOverridePerformStaticEntityRebuildInferiors, baseSorting.getOverridePerformStaticEntityRebuildInferiors());
               addSorting(id, allBaseAfterPerformStaticEntityRebuildSuperiors, baseSorting.getAfterPerformStaticEntityRebuildSuperiors());
               addSorting(id, allBaseAfterPerformStaticEntityRebuildInferiors, baseSorting.getAfterPerformStaticEntityRebuildInferiors());
               addSorting(id, allBaseBeforeRenderArrowsStuckInEntitySuperiors, baseSorting.getBeforeRenderArrowsStuckInEntitySuperiors());
               addSorting(id, allBaseBeforeRenderArrowsStuckInEntityInferiors, baseSorting.getBeforeRenderArrowsStuckInEntityInferiors());
               addSorting(id, allBaseOverrideRenderArrowsStuckInEntitySuperiors, baseSorting.getOverrideRenderArrowsStuckInEntitySuperiors());
               addSorting(id, allBaseOverrideRenderArrowsStuckInEntityInferiors, baseSorting.getOverrideRenderArrowsStuckInEntityInferiors());
               addSorting(id, allBaseAfterRenderArrowsStuckInEntitySuperiors, baseSorting.getAfterRenderArrowsStuckInEntitySuperiors());
               addSorting(id, allBaseAfterRenderArrowsStuckInEntityInferiors, baseSorting.getAfterRenderArrowsStuckInEntityInferiors());
               addSorting(id, allBaseBeforeRenderFirstPersonArmSuperiors, baseSorting.getBeforeRenderFirstPersonArmSuperiors());
               addSorting(id, allBaseBeforeRenderFirstPersonArmInferiors, baseSorting.getBeforeRenderFirstPersonArmInferiors());
               addSorting(id, allBaseOverrideRenderFirstPersonArmSuperiors, baseSorting.getOverrideRenderFirstPersonArmSuperiors());
               addSorting(id, allBaseOverrideRenderFirstPersonArmInferiors, baseSorting.getOverrideRenderFirstPersonArmInferiors());
               addSorting(id, allBaseAfterRenderFirstPersonArmSuperiors, baseSorting.getAfterRenderFirstPersonArmSuperiors());
               addSorting(id, allBaseAfterRenderFirstPersonArmInferiors, baseSorting.getAfterRenderFirstPersonArmInferiors());
               addSorting(id, allBaseBeforeRenderLivingLabelSuperiors, baseSorting.getBeforeRenderLivingLabelSuperiors());
               addSorting(id, allBaseBeforeRenderLivingLabelInferiors, baseSorting.getBeforeRenderLivingLabelInferiors());
               addSorting(id, allBaseOverrideRenderLivingLabelSuperiors, baseSorting.getOverrideRenderLivingLabelSuperiors());
               addSorting(id, allBaseOverrideRenderLivingLabelInferiors, baseSorting.getOverrideRenderLivingLabelInferiors());
               addSorting(id, allBaseAfterRenderLivingLabelSuperiors, baseSorting.getAfterRenderLivingLabelSuperiors());
               addSorting(id, allBaseAfterRenderLivingLabelInferiors, baseSorting.getAfterRenderLivingLabelInferiors());
               addSorting(id, allBaseBeforeRenderModelSuperiors, baseSorting.getBeforeRenderModelSuperiors());
               addSorting(id, allBaseBeforeRenderModelInferiors, baseSorting.getBeforeRenderModelInferiors());
               addSorting(id, allBaseOverrideRenderModelSuperiors, baseSorting.getOverrideRenderModelSuperiors());
               addSorting(id, allBaseOverrideRenderModelInferiors, baseSorting.getOverrideRenderModelInferiors());
               addSorting(id, allBaseAfterRenderModelSuperiors, baseSorting.getAfterRenderModelSuperiors());
               addSorting(id, allBaseAfterRenderModelInferiors, baseSorting.getAfterRenderModelInferiors());
               addSorting(id, allBaseBeforeRenderPlayerSuperiors, baseSorting.getBeforeRenderPlayerSuperiors());
               addSorting(id, allBaseBeforeRenderPlayerInferiors, baseSorting.getBeforeRenderPlayerInferiors());
               addSorting(id, allBaseOverrideRenderPlayerSuperiors, baseSorting.getOverrideRenderPlayerSuperiors());
               addSorting(id, allBaseOverrideRenderPlayerInferiors, baseSorting.getOverrideRenderPlayerInferiors());
               addSorting(id, allBaseAfterRenderPlayerSuperiors, baseSorting.getAfterRenderPlayerSuperiors());
               addSorting(id, allBaseAfterRenderPlayerInferiors, baseSorting.getAfterRenderPlayerInferiors());
               addSorting(id, allBaseBeforeRenderPlayerNameAndScoreLabelSuperiors, baseSorting.getBeforeRenderPlayerNameAndScoreLabelSuperiors());
               addSorting(id, allBaseBeforeRenderPlayerNameAndScoreLabelInferiors, baseSorting.getBeforeRenderPlayerNameAndScoreLabelInferiors());
               addSorting(id, allBaseOverrideRenderPlayerNameAndScoreLabelSuperiors, baseSorting.getOverrideRenderPlayerNameAndScoreLabelSuperiors());
               addSorting(id, allBaseOverrideRenderPlayerNameAndScoreLabelInferiors, baseSorting.getOverrideRenderPlayerNameAndScoreLabelInferiors());
               addSorting(id, allBaseAfterRenderPlayerNameAndScoreLabelSuperiors, baseSorting.getAfterRenderPlayerNameAndScoreLabelSuperiors());
               addSorting(id, allBaseAfterRenderPlayerNameAndScoreLabelInferiors, baseSorting.getAfterRenderPlayerNameAndScoreLabelInferiors());
               addSorting(id, allBaseBeforeRenderPlayerScaleSuperiors, baseSorting.getBeforeRenderPlayerScaleSuperiors());
               addSorting(id, allBaseBeforeRenderPlayerScaleInferiors, baseSorting.getBeforeRenderPlayerScaleInferiors());
               addSorting(id, allBaseOverrideRenderPlayerScaleSuperiors, baseSorting.getOverrideRenderPlayerScaleSuperiors());
               addSorting(id, allBaseOverrideRenderPlayerScaleInferiors, baseSorting.getOverrideRenderPlayerScaleInferiors());
               addSorting(id, allBaseAfterRenderPlayerScaleSuperiors, baseSorting.getAfterRenderPlayerScaleSuperiors());
               addSorting(id, allBaseAfterRenderPlayerScaleInferiors, baseSorting.getAfterRenderPlayerScaleInferiors());
               addSorting(id, allBaseBeforeRenderPlayerSleepSuperiors, baseSorting.getBeforeRenderPlayerSleepSuperiors());
               addSorting(id, allBaseBeforeRenderPlayerSleepInferiors, baseSorting.getBeforeRenderPlayerSleepInferiors());
               addSorting(id, allBaseOverrideRenderPlayerSleepSuperiors, baseSorting.getOverrideRenderPlayerSleepSuperiors());
               addSorting(id, allBaseOverrideRenderPlayerSleepInferiors, baseSorting.getOverrideRenderPlayerSleepInferiors());
               addSorting(id, allBaseAfterRenderPlayerSleepSuperiors, baseSorting.getAfterRenderPlayerSleepSuperiors());
               addSorting(id, allBaseAfterRenderPlayerSleepInferiors, baseSorting.getAfterRenderPlayerSleepInferiors());
               addSorting(id, allBaseBeforeRenderSpecialsSuperiors, baseSorting.getBeforeRenderSpecialsSuperiors());
               addSorting(id, allBaseBeforeRenderSpecialsInferiors, baseSorting.getBeforeRenderSpecialsInferiors());
               addSorting(id, allBaseOverrideRenderSpecialsSuperiors, baseSorting.getOverrideRenderSpecialsSuperiors());
               addSorting(id, allBaseOverrideRenderSpecialsInferiors, baseSorting.getOverrideRenderSpecialsInferiors());
               addSorting(id, allBaseAfterRenderSpecialsSuperiors, baseSorting.getAfterRenderSpecialsSuperiors());
               addSorting(id, allBaseAfterRenderSpecialsInferiors, baseSorting.getAfterRenderSpecialsInferiors());
               addSorting(id, allBaseBeforeRenderSwingProgressSuperiors, baseSorting.getBeforeRenderSwingProgressSuperiors());
               addSorting(id, allBaseBeforeRenderSwingProgressInferiors, baseSorting.getBeforeRenderSwingProgressInferiors());
               addSorting(id, allBaseOverrideRenderSwingProgressSuperiors, baseSorting.getOverrideRenderSwingProgressSuperiors());
               addSorting(id, allBaseOverrideRenderSwingProgressInferiors, baseSorting.getOverrideRenderSwingProgressInferiors());
               addSorting(id, allBaseAfterRenderSwingProgressSuperiors, baseSorting.getAfterRenderSwingProgressSuperiors());
               addSorting(id, allBaseAfterRenderSwingProgressInferiors, baseSorting.getAfterRenderSwingProgressInferiors());
               addSorting(id, allBaseBeforeRotatePlayerSuperiors, baseSorting.getBeforeRotatePlayerSuperiors());
               addSorting(id, allBaseBeforeRotatePlayerInferiors, baseSorting.getBeforeRotatePlayerInferiors());
               addSorting(id, allBaseOverrideRotatePlayerSuperiors, baseSorting.getOverrideRotatePlayerSuperiors());
               addSorting(id, allBaseOverrideRotatePlayerInferiors, baseSorting.getOverrideRotatePlayerInferiors());
               addSorting(id, allBaseAfterRotatePlayerSuperiors, baseSorting.getAfterRotatePlayerSuperiors());
               addSorting(id, allBaseAfterRotatePlayerInferiors, baseSorting.getAfterRotatePlayerInferiors());
               addSorting(id, allBaseBeforeSetArmorModelSuperiors, baseSorting.getBeforeSetArmorModelSuperiors());
               addSorting(id, allBaseBeforeSetArmorModelInferiors, baseSorting.getBeforeSetArmorModelInferiors());
               addSorting(id, allBaseOverrideSetArmorModelSuperiors, baseSorting.getOverrideSetArmorModelSuperiors());
               addSorting(id, allBaseOverrideSetArmorModelInferiors, baseSorting.getOverrideSetArmorModelInferiors());
               addSorting(id, allBaseAfterSetArmorModelSuperiors, baseSorting.getAfterSetArmorModelSuperiors());
               addSorting(id, allBaseAfterSetArmorModelInferiors, baseSorting.getAfterSetArmorModelInferiors());
               addSorting(id, allBaseBeforeSetPassArmorModelSuperiors, baseSorting.getBeforeSetPassArmorModelSuperiors());
               addSorting(id, allBaseBeforeSetPassArmorModelInferiors, baseSorting.getBeforeSetPassArmorModelInferiors());
               addSorting(id, allBaseOverrideSetPassArmorModelSuperiors, baseSorting.getOverrideSetPassArmorModelSuperiors());
               addSorting(id, allBaseOverrideSetPassArmorModelInferiors, baseSorting.getOverrideSetPassArmorModelInferiors());
               addSorting(id, allBaseAfterSetPassArmorModelSuperiors, baseSorting.getAfterSetPassArmorModelSuperiors());
               addSorting(id, allBaseAfterSetPassArmorModelInferiors, baseSorting.getAfterSetPassArmorModelInferiors());
               addSorting(id, allBaseBeforeSetRenderManagerSuperiors, baseSorting.getBeforeSetRenderManagerSuperiors());
               addSorting(id, allBaseBeforeSetRenderManagerInferiors, baseSorting.getBeforeSetRenderManagerInferiors());
               addSorting(id, allBaseOverrideSetRenderManagerSuperiors, baseSorting.getOverrideSetRenderManagerSuperiors());
               addSorting(id, allBaseOverrideSetRenderManagerInferiors, baseSorting.getOverrideSetRenderManagerInferiors());
               addSorting(id, allBaseAfterSetRenderManagerSuperiors, baseSorting.getAfterSetRenderManagerSuperiors());
               addSorting(id, allBaseAfterSetRenderManagerInferiors, baseSorting.getAfterSetRenderManagerInferiors());
               addSorting(id, allBaseBeforeSetRenderPassModelSuperiors, baseSorting.getBeforeSetRenderPassModelSuperiors());
               addSorting(id, allBaseBeforeSetRenderPassModelInferiors, baseSorting.getBeforeSetRenderPassModelInferiors());
               addSorting(id, allBaseOverrideSetRenderPassModelSuperiors, baseSorting.getOverrideSetRenderPassModelSuperiors());
               addSorting(id, allBaseOverrideSetRenderPassModelInferiors, baseSorting.getOverrideSetRenderPassModelInferiors());
               addSorting(id, allBaseAfterSetRenderPassModelSuperiors, baseSorting.getAfterSetRenderPassModelSuperiors());
               addSorting(id, allBaseAfterSetRenderPassModelInferiors, baseSorting.getAfterSetRenderPassModelInferiors());
               addSorting(id, allBaseBeforeUpdateIconsSuperiors, baseSorting.getBeforeUpdateIconsSuperiors());
               addSorting(id, allBaseBeforeUpdateIconsInferiors, baseSorting.getBeforeUpdateIconsInferiors());
               addSorting(id, allBaseOverrideUpdateIconsSuperiors, baseSorting.getOverrideUpdateIconsSuperiors());
               addSorting(id, allBaseOverrideUpdateIconsInferiors, baseSorting.getOverrideUpdateIconsInferiors());
               addSorting(id, allBaseAfterUpdateIconsSuperiors, baseSorting.getAfterUpdateIconsSuperiors());
               addSorting(id, allBaseAfterUpdateIconsInferiors, baseSorting.getAfterUpdateIconsInferiors());
            }

            addMethod(id, baseClass, beforeLocalConstructingHookTypes, "beforeLocalConstructing");
            addMethod(id, baseClass, afterLocalConstructingHookTypes, "afterLocalConstructing");
            addMethod(id, baseClass, beforeDoRenderLabelHookTypes, "beforeDoRenderLabel", EntityLivingBase.class);
            addMethod(id, baseClass, overrideDoRenderLabelHookTypes, "doRenderLabel", EntityLivingBase.class);
            addMethod(id, baseClass, afterDoRenderLabelHookTypes, "afterDoRenderLabel", EntityLivingBase.class);
            addMethod(id, baseClass, beforeDoRenderShadowAndFireHookTypes, "beforeDoRenderShadowAndFire", Entity.class, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, overrideDoRenderShadowAndFireHookTypes, "doRenderShadowAndFire", Entity.class, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, afterDoRenderShadowAndFireHookTypes, "afterDoRenderShadowAndFire", Entity.class, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, beforeGetColorMultiplierHookTypes, "beforeGetColorMultiplier", EntityLivingBase.class, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, overrideGetColorMultiplierHookTypes, "getColorMultiplier", EntityLivingBase.class, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, afterGetColorMultiplierHookTypes, "afterGetColorMultiplier", EntityLivingBase.class, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, beforeGetDeathMaxRotationHookTypes, "beforeGetDeathMaxRotation", EntityLivingBase.class);
            addMethod(id, baseClass, overrideGetDeathMaxRotationHookTypes, "getDeathMaxRotation", EntityLivingBase.class);
            addMethod(id, baseClass, afterGetDeathMaxRotationHookTypes, "afterGetDeathMaxRotation", EntityLivingBase.class);
            addMethod(id, baseClass, beforeGetFontRendererFromRenderManagerHookTypes, "beforeGetFontRendererFromRenderManager");
            addMethod(id, baseClass, overrideGetFontRendererFromRenderManagerHookTypes, "getFontRendererFromRenderManager");
            addMethod(id, baseClass, afterGetFontRendererFromRenderManagerHookTypes, "afterGetFontRendererFromRenderManager");
            addMethod(id, baseClass, beforeGetResourceLocationFromPlayerHookTypes, "beforeGetResourceLocationFromPlayer", AbstractClientPlayer.class);
            addMethod(id, baseClass, overrideGetResourceLocationFromPlayerHookTypes, "getResourceLocationFromPlayer", AbstractClientPlayer.class);
            addMethod(id, baseClass, afterGetResourceLocationFromPlayerHookTypes, "afterGetResourceLocationFromPlayer", AbstractClientPlayer.class);
            addMethod(id, baseClass, beforeHandleRotationFloatHookTypes, "beforeHandleRotationFloat", EntityLivingBase.class, Float.TYPE);
            addMethod(id, baseClass, overrideHandleRotationFloatHookTypes, "handleRotationFloat", EntityLivingBase.class, Float.TYPE);
            addMethod(id, baseClass, afterHandleRotationFloatHookTypes, "afterHandleRotationFloat", EntityLivingBase.class, Float.TYPE);
            addMethod(id, baseClass, beforeInheritRenderPassHookTypes, "beforeInheritRenderPass", EntityLivingBase.class, Integer.TYPE, Float.TYPE);
            addMethod(id, baseClass, overrideInheritRenderPassHookTypes, "inheritRenderPass", EntityLivingBase.class, Integer.TYPE, Float.TYPE);
            addMethod(id, baseClass, afterInheritRenderPassHookTypes, "afterInheritRenderPass", EntityLivingBase.class, Integer.TYPE, Float.TYPE);
            addMethod(id, baseClass, beforeLoadTextureHookTypes, "beforeLoadTexture", ResourceLocation.class);
            addMethod(id, baseClass, overrideLoadTextureHookTypes, "loadTexture", ResourceLocation.class);
            addMethod(id, baseClass, afterLoadTextureHookTypes, "afterLoadTexture", ResourceLocation.class);
            addMethod(id, baseClass, beforeLoadTextureOfEntityHookTypes, "beforeLoadTextureOfEntity", Entity.class);
            addMethod(id, baseClass, overrideLoadTextureOfEntityHookTypes, "loadTextureOfEntity", Entity.class);
            addMethod(id, baseClass, afterLoadTextureOfEntityHookTypes, "afterLoadTextureOfEntity", Entity.class);
            addMethod(id, baseClass, beforePassSpecialRenderHookTypes, "beforePassSpecialRender", EntityLivingBase.class, Double.TYPE, Double.TYPE, Double.TYPE);
            addMethod(id, baseClass, overridePassSpecialRenderHookTypes, "passSpecialRender", EntityLivingBase.class, Double.TYPE, Double.TYPE, Double.TYPE);
            addMethod(id, baseClass, afterPassSpecialRenderHookTypes, "afterPassSpecialRender", EntityLivingBase.class, Double.TYPE, Double.TYPE, Double.TYPE);
            addMethod(id, baseClass, beforePerformStaticEntityRebuildHookTypes, "beforePerformStaticEntityRebuild");
            addMethod(id, baseClass, overridePerformStaticEntityRebuildHookTypes, "performStaticEntityRebuild");
            addMethod(id, baseClass, afterPerformStaticEntityRebuildHookTypes, "afterPerformStaticEntityRebuild");
            addMethod(id, baseClass, beforeRenderArrowsStuckInEntityHookTypes, "beforeRenderArrowsStuckInEntity", EntityLivingBase.class, Float.TYPE);
            addMethod(id, baseClass, overrideRenderArrowsStuckInEntityHookTypes, "renderArrowsStuckInEntity", EntityLivingBase.class, Float.TYPE);
            addMethod(id, baseClass, afterRenderArrowsStuckInEntityHookTypes, "afterRenderArrowsStuckInEntity", EntityLivingBase.class, Float.TYPE);
            addMethod(id, baseClass, beforeRenderFirstPersonArmHookTypes, "beforeRenderFirstPersonArm", EntityPlayer.class);
            addMethod(id, baseClass, overrideRenderFirstPersonArmHookTypes, "renderFirstPersonArm", EntityPlayer.class);
            addMethod(id, baseClass, afterRenderFirstPersonArmHookTypes, "afterRenderFirstPersonArm", EntityPlayer.class);
            addMethod(id, baseClass, beforeRenderLivingLabelHookTypes, "beforeRenderLivingLabel", Entity.class, String.class, Double.TYPE, Double.TYPE, Double.TYPE, Integer.TYPE);
            addMethod(id, baseClass, overrideRenderLivingLabelHookTypes, "renderLivingLabel", Entity.class, String.class, Double.TYPE, Double.TYPE, Double.TYPE, Integer.TYPE);
            addMethod(id, baseClass, afterRenderLivingLabelHookTypes, "afterRenderLivingLabel", Entity.class, String.class, Double.TYPE, Double.TYPE, Double.TYPE, Integer.TYPE);
            addMethod(id, baseClass, beforeRenderModelHookTypes, "beforeRenderModel", EntityLivingBase.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, overrideRenderModelHookTypes, "renderModel", EntityLivingBase.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, afterRenderModelHookTypes, "afterRenderModel", EntityLivingBase.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, beforeRenderPlayerHookTypes, "beforeRenderPlayer", AbstractClientPlayer.class, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, overrideRenderPlayerHookTypes, "renderPlayer", AbstractClientPlayer.class, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, afterRenderPlayerHookTypes, "afterRenderPlayer", AbstractClientPlayer.class, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, beforeRenderPlayerNameAndScoreLabelHookTypes, "beforeRenderPlayerNameAndScoreLabel", AbstractClientPlayer.class, Double.TYPE, Double.TYPE, Double.TYPE, String.class, Float.TYPE, Double.TYPE);
            addMethod(id, baseClass, overrideRenderPlayerNameAndScoreLabelHookTypes, "renderPlayerNameAndScoreLabel", AbstractClientPlayer.class, Double.TYPE, Double.TYPE, Double.TYPE, String.class, Float.TYPE, Double.TYPE);
            addMethod(id, baseClass, afterRenderPlayerNameAndScoreLabelHookTypes, "afterRenderPlayerNameAndScoreLabel", AbstractClientPlayer.class, Double.TYPE, Double.TYPE, Double.TYPE, String.class, Float.TYPE, Double.TYPE);
            addMethod(id, baseClass, beforeRenderPlayerScaleHookTypes, "beforeRenderPlayerScale", AbstractClientPlayer.class, Float.TYPE);
            addMethod(id, baseClass, overrideRenderPlayerScaleHookTypes, "renderPlayerScale", AbstractClientPlayer.class, Float.TYPE);
            addMethod(id, baseClass, afterRenderPlayerScaleHookTypes, "afterRenderPlayerScale", AbstractClientPlayer.class, Float.TYPE);
            addMethod(id, baseClass, beforeRenderPlayerSleepHookTypes, "beforeRenderPlayerSleep", AbstractClientPlayer.class, Double.TYPE, Double.TYPE, Double.TYPE);
            addMethod(id, baseClass, overrideRenderPlayerSleepHookTypes, "renderPlayerSleep", AbstractClientPlayer.class, Double.TYPE, Double.TYPE, Double.TYPE);
            addMethod(id, baseClass, afterRenderPlayerSleepHookTypes, "afterRenderPlayerSleep", AbstractClientPlayer.class, Double.TYPE, Double.TYPE, Double.TYPE);
            addMethod(id, baseClass, beforeRenderSpecialsHookTypes, "beforeRenderSpecials", AbstractClientPlayer.class, Float.TYPE);
            addMethod(id, baseClass, overrideRenderSpecialsHookTypes, "renderSpecials", AbstractClientPlayer.class, Float.TYPE);
            addMethod(id, baseClass, afterRenderSpecialsHookTypes, "afterRenderSpecials", AbstractClientPlayer.class, Float.TYPE);
            addMethod(id, baseClass, beforeRenderSwingProgressHookTypes, "beforeRenderSwingProgress", EntityLivingBase.class, Float.TYPE);
            addMethod(id, baseClass, overrideRenderSwingProgressHookTypes, "renderSwingProgress", EntityLivingBase.class, Float.TYPE);
            addMethod(id, baseClass, afterRenderSwingProgressHookTypes, "afterRenderSwingProgress", EntityLivingBase.class, Float.TYPE);
            addMethod(id, baseClass, beforeRotatePlayerHookTypes, "beforeRotatePlayer", AbstractClientPlayer.class, Float.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, overrideRotatePlayerHookTypes, "rotatePlayer", AbstractClientPlayer.class, Float.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, afterRotatePlayerHookTypes, "afterRotatePlayer", AbstractClientPlayer.class, Float.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, beforeSetArmorModelHookTypes, "beforeSetArmorModel", AbstractClientPlayer.class, Integer.TYPE, Float.TYPE);
            addMethod(id, baseClass, overrideSetArmorModelHookTypes, "setArmorModel", AbstractClientPlayer.class, Integer.TYPE, Float.TYPE);
            addMethod(id, baseClass, afterSetArmorModelHookTypes, "afterSetArmorModel", AbstractClientPlayer.class, Integer.TYPE, Float.TYPE);
            addMethod(id, baseClass, beforeSetPassArmorModelHookTypes, "beforeSetPassArmorModel", AbstractClientPlayer.class, Integer.TYPE, Float.TYPE);
            addMethod(id, baseClass, overrideSetPassArmorModelHookTypes, "setPassArmorModel", AbstractClientPlayer.class, Integer.TYPE, Float.TYPE);
            addMethod(id, baseClass, afterSetPassArmorModelHookTypes, "afterSetPassArmorModel", AbstractClientPlayer.class, Integer.TYPE, Float.TYPE);
            addMethod(id, baseClass, beforeSetRenderManagerHookTypes, "beforeSetRenderManager", RenderManager.class);
            addMethod(id, baseClass, overrideSetRenderManagerHookTypes, "setRenderManager", RenderManager.class);
            addMethod(id, baseClass, afterSetRenderManagerHookTypes, "afterSetRenderManager", RenderManager.class);
            addMethod(id, baseClass, beforeSetRenderPassModelHookTypes, "beforeSetRenderPassModel", ModelBase.class);
            addMethod(id, baseClass, overrideSetRenderPassModelHookTypes, "setRenderPassModel", ModelBase.class);
            addMethod(id, baseClass, afterSetRenderPassModelHookTypes, "afterSetRenderPassModel", ModelBase.class);
            addMethod(id, baseClass, beforeUpdateIconsHookTypes, "beforeUpdateIcons", IIconRegister.class);
            addMethod(id, baseClass, overrideUpdateIconsHookTypes, "updateIcons", IIconRegister.class);
            addMethod(id, baseClass, afterUpdateIconsHookTypes, "afterUpdateIcons", IIconRegister.class);
            addDynamicMethods(id, baseClass);
            addDynamicKeys(id, baseClass, beforeDynamicHookMethods, beforeDynamicHookTypes);
            addDynamicKeys(id, baseClass, overrideDynamicHookMethods, overrideDynamicHookTypes);
            addDynamicKeys(id, baseClass, afterDynamicHookMethods, afterDynamicHookTypes);
            initialize();
            Iterator var19 = allInstances.iterator();

            while(var19.hasNext()) {
               IRenderPlayerAPI instance = (IRenderPlayerAPI)var19.next();
               instance.getRenderPlayerAPI().attachRenderPlayerBase(id);
            }

            System.out.println("Render Player: registered " + id);
            logger.fine("Render Player: registered class '" + baseClass.getName() + "' with id '" + id + "'");
            initialized = false;
         }
      }
   }

   public static boolean unregister(String id) {
      if (id == null) {
         return false;
      } else {
         Constructor constructor = (Constructor)allBaseConstructors.remove(id);
         if (constructor == null) {
            return false;
         } else {
            Iterator iterator = allInstances.iterator();

            while(iterator.hasNext()) {
               IRenderPlayerAPI instance = (IRenderPlayerAPI)iterator.next();
               instance.getRenderPlayerAPI().detachRenderPlayerBase(id);
            }

            beforeLocalConstructingHookTypes.remove(id);
            afterLocalConstructingHookTypes.remove(id);
            allBaseBeforeDoRenderLabelSuperiors.remove(id);
            allBaseBeforeDoRenderLabelInferiors.remove(id);
            allBaseOverrideDoRenderLabelSuperiors.remove(id);
            allBaseOverrideDoRenderLabelInferiors.remove(id);
            allBaseAfterDoRenderLabelSuperiors.remove(id);
            allBaseAfterDoRenderLabelInferiors.remove(id);
            beforeDoRenderLabelHookTypes.remove(id);
            overrideDoRenderLabelHookTypes.remove(id);
            afterDoRenderLabelHookTypes.remove(id);
            allBaseBeforeDoRenderShadowAndFireSuperiors.remove(id);
            allBaseBeforeDoRenderShadowAndFireInferiors.remove(id);
            allBaseOverrideDoRenderShadowAndFireSuperiors.remove(id);
            allBaseOverrideDoRenderShadowAndFireInferiors.remove(id);
            allBaseAfterDoRenderShadowAndFireSuperiors.remove(id);
            allBaseAfterDoRenderShadowAndFireInferiors.remove(id);
            beforeDoRenderShadowAndFireHookTypes.remove(id);
            overrideDoRenderShadowAndFireHookTypes.remove(id);
            afterDoRenderShadowAndFireHookTypes.remove(id);
            allBaseBeforeGetColorMultiplierSuperiors.remove(id);
            allBaseBeforeGetColorMultiplierInferiors.remove(id);
            allBaseOverrideGetColorMultiplierSuperiors.remove(id);
            allBaseOverrideGetColorMultiplierInferiors.remove(id);
            allBaseAfterGetColorMultiplierSuperiors.remove(id);
            allBaseAfterGetColorMultiplierInferiors.remove(id);
            beforeGetColorMultiplierHookTypes.remove(id);
            overrideGetColorMultiplierHookTypes.remove(id);
            afterGetColorMultiplierHookTypes.remove(id);
            allBaseBeforeGetDeathMaxRotationSuperiors.remove(id);
            allBaseBeforeGetDeathMaxRotationInferiors.remove(id);
            allBaseOverrideGetDeathMaxRotationSuperiors.remove(id);
            allBaseOverrideGetDeathMaxRotationInferiors.remove(id);
            allBaseAfterGetDeathMaxRotationSuperiors.remove(id);
            allBaseAfterGetDeathMaxRotationInferiors.remove(id);
            beforeGetDeathMaxRotationHookTypes.remove(id);
            overrideGetDeathMaxRotationHookTypes.remove(id);
            afterGetDeathMaxRotationHookTypes.remove(id);
            allBaseBeforeGetFontRendererFromRenderManagerSuperiors.remove(id);
            allBaseBeforeGetFontRendererFromRenderManagerInferiors.remove(id);
            allBaseOverrideGetFontRendererFromRenderManagerSuperiors.remove(id);
            allBaseOverrideGetFontRendererFromRenderManagerInferiors.remove(id);
            allBaseAfterGetFontRendererFromRenderManagerSuperiors.remove(id);
            allBaseAfterGetFontRendererFromRenderManagerInferiors.remove(id);
            beforeGetFontRendererFromRenderManagerHookTypes.remove(id);
            overrideGetFontRendererFromRenderManagerHookTypes.remove(id);
            afterGetFontRendererFromRenderManagerHookTypes.remove(id);
            allBaseBeforeGetResourceLocationFromPlayerSuperiors.remove(id);
            allBaseBeforeGetResourceLocationFromPlayerInferiors.remove(id);
            allBaseOverrideGetResourceLocationFromPlayerSuperiors.remove(id);
            allBaseOverrideGetResourceLocationFromPlayerInferiors.remove(id);
            allBaseAfterGetResourceLocationFromPlayerSuperiors.remove(id);
            allBaseAfterGetResourceLocationFromPlayerInferiors.remove(id);
            beforeGetResourceLocationFromPlayerHookTypes.remove(id);
            overrideGetResourceLocationFromPlayerHookTypes.remove(id);
            afterGetResourceLocationFromPlayerHookTypes.remove(id);
            allBaseBeforeHandleRotationFloatSuperiors.remove(id);
            allBaseBeforeHandleRotationFloatInferiors.remove(id);
            allBaseOverrideHandleRotationFloatSuperiors.remove(id);
            allBaseOverrideHandleRotationFloatInferiors.remove(id);
            allBaseAfterHandleRotationFloatSuperiors.remove(id);
            allBaseAfterHandleRotationFloatInferiors.remove(id);
            beforeHandleRotationFloatHookTypes.remove(id);
            overrideHandleRotationFloatHookTypes.remove(id);
            afterHandleRotationFloatHookTypes.remove(id);
            allBaseBeforeInheritRenderPassSuperiors.remove(id);
            allBaseBeforeInheritRenderPassInferiors.remove(id);
            allBaseOverrideInheritRenderPassSuperiors.remove(id);
            allBaseOverrideInheritRenderPassInferiors.remove(id);
            allBaseAfterInheritRenderPassSuperiors.remove(id);
            allBaseAfterInheritRenderPassInferiors.remove(id);
            beforeInheritRenderPassHookTypes.remove(id);
            overrideInheritRenderPassHookTypes.remove(id);
            afterInheritRenderPassHookTypes.remove(id);
            allBaseBeforeLoadTextureSuperiors.remove(id);
            allBaseBeforeLoadTextureInferiors.remove(id);
            allBaseOverrideLoadTextureSuperiors.remove(id);
            allBaseOverrideLoadTextureInferiors.remove(id);
            allBaseAfterLoadTextureSuperiors.remove(id);
            allBaseAfterLoadTextureInferiors.remove(id);
            beforeLoadTextureHookTypes.remove(id);
            overrideLoadTextureHookTypes.remove(id);
            afterLoadTextureHookTypes.remove(id);
            allBaseBeforeLoadTextureOfEntitySuperiors.remove(id);
            allBaseBeforeLoadTextureOfEntityInferiors.remove(id);
            allBaseOverrideLoadTextureOfEntitySuperiors.remove(id);
            allBaseOverrideLoadTextureOfEntityInferiors.remove(id);
            allBaseAfterLoadTextureOfEntitySuperiors.remove(id);
            allBaseAfterLoadTextureOfEntityInferiors.remove(id);
            beforeLoadTextureOfEntityHookTypes.remove(id);
            overrideLoadTextureOfEntityHookTypes.remove(id);
            afterLoadTextureOfEntityHookTypes.remove(id);
            allBaseBeforePassSpecialRenderSuperiors.remove(id);
            allBaseBeforePassSpecialRenderInferiors.remove(id);
            allBaseOverridePassSpecialRenderSuperiors.remove(id);
            allBaseOverridePassSpecialRenderInferiors.remove(id);
            allBaseAfterPassSpecialRenderSuperiors.remove(id);
            allBaseAfterPassSpecialRenderInferiors.remove(id);
            beforePassSpecialRenderHookTypes.remove(id);
            overridePassSpecialRenderHookTypes.remove(id);
            afterPassSpecialRenderHookTypes.remove(id);
            allBaseBeforePerformStaticEntityRebuildSuperiors.remove(id);
            allBaseBeforePerformStaticEntityRebuildInferiors.remove(id);
            allBaseOverridePerformStaticEntityRebuildSuperiors.remove(id);
            allBaseOverridePerformStaticEntityRebuildInferiors.remove(id);
            allBaseAfterPerformStaticEntityRebuildSuperiors.remove(id);
            allBaseAfterPerformStaticEntityRebuildInferiors.remove(id);
            beforePerformStaticEntityRebuildHookTypes.remove(id);
            overridePerformStaticEntityRebuildHookTypes.remove(id);
            afterPerformStaticEntityRebuildHookTypes.remove(id);
            allBaseBeforeRenderArrowsStuckInEntitySuperiors.remove(id);
            allBaseBeforeRenderArrowsStuckInEntityInferiors.remove(id);
            allBaseOverrideRenderArrowsStuckInEntitySuperiors.remove(id);
            allBaseOverrideRenderArrowsStuckInEntityInferiors.remove(id);
            allBaseAfterRenderArrowsStuckInEntitySuperiors.remove(id);
            allBaseAfterRenderArrowsStuckInEntityInferiors.remove(id);
            beforeRenderArrowsStuckInEntityHookTypes.remove(id);
            overrideRenderArrowsStuckInEntityHookTypes.remove(id);
            afterRenderArrowsStuckInEntityHookTypes.remove(id);
            allBaseBeforeRenderFirstPersonArmSuperiors.remove(id);
            allBaseBeforeRenderFirstPersonArmInferiors.remove(id);
            allBaseOverrideRenderFirstPersonArmSuperiors.remove(id);
            allBaseOverrideRenderFirstPersonArmInferiors.remove(id);
            allBaseAfterRenderFirstPersonArmSuperiors.remove(id);
            allBaseAfterRenderFirstPersonArmInferiors.remove(id);
            beforeRenderFirstPersonArmHookTypes.remove(id);
            overrideRenderFirstPersonArmHookTypes.remove(id);
            afterRenderFirstPersonArmHookTypes.remove(id);
            allBaseBeforeRenderLivingLabelSuperiors.remove(id);
            allBaseBeforeRenderLivingLabelInferiors.remove(id);
            allBaseOverrideRenderLivingLabelSuperiors.remove(id);
            allBaseOverrideRenderLivingLabelInferiors.remove(id);
            allBaseAfterRenderLivingLabelSuperiors.remove(id);
            allBaseAfterRenderLivingLabelInferiors.remove(id);
            beforeRenderLivingLabelHookTypes.remove(id);
            overrideRenderLivingLabelHookTypes.remove(id);
            afterRenderLivingLabelHookTypes.remove(id);
            allBaseBeforeRenderModelSuperiors.remove(id);
            allBaseBeforeRenderModelInferiors.remove(id);
            allBaseOverrideRenderModelSuperiors.remove(id);
            allBaseOverrideRenderModelInferiors.remove(id);
            allBaseAfterRenderModelSuperiors.remove(id);
            allBaseAfterRenderModelInferiors.remove(id);
            beforeRenderModelHookTypes.remove(id);
            overrideRenderModelHookTypes.remove(id);
            afterRenderModelHookTypes.remove(id);
            allBaseBeforeRenderPlayerSuperiors.remove(id);
            allBaseBeforeRenderPlayerInferiors.remove(id);
            allBaseOverrideRenderPlayerSuperiors.remove(id);
            allBaseOverrideRenderPlayerInferiors.remove(id);
            allBaseAfterRenderPlayerSuperiors.remove(id);
            allBaseAfterRenderPlayerInferiors.remove(id);
            beforeRenderPlayerHookTypes.remove(id);
            overrideRenderPlayerHookTypes.remove(id);
            afterRenderPlayerHookTypes.remove(id);
            allBaseBeforeRenderPlayerNameAndScoreLabelSuperiors.remove(id);
            allBaseBeforeRenderPlayerNameAndScoreLabelInferiors.remove(id);
            allBaseOverrideRenderPlayerNameAndScoreLabelSuperiors.remove(id);
            allBaseOverrideRenderPlayerNameAndScoreLabelInferiors.remove(id);
            allBaseAfterRenderPlayerNameAndScoreLabelSuperiors.remove(id);
            allBaseAfterRenderPlayerNameAndScoreLabelInferiors.remove(id);
            beforeRenderPlayerNameAndScoreLabelHookTypes.remove(id);
            overrideRenderPlayerNameAndScoreLabelHookTypes.remove(id);
            afterRenderPlayerNameAndScoreLabelHookTypes.remove(id);
            allBaseBeforeRenderPlayerScaleSuperiors.remove(id);
            allBaseBeforeRenderPlayerScaleInferiors.remove(id);
            allBaseOverrideRenderPlayerScaleSuperiors.remove(id);
            allBaseOverrideRenderPlayerScaleInferiors.remove(id);
            allBaseAfterRenderPlayerScaleSuperiors.remove(id);
            allBaseAfterRenderPlayerScaleInferiors.remove(id);
            beforeRenderPlayerScaleHookTypes.remove(id);
            overrideRenderPlayerScaleHookTypes.remove(id);
            afterRenderPlayerScaleHookTypes.remove(id);
            allBaseBeforeRenderPlayerSleepSuperiors.remove(id);
            allBaseBeforeRenderPlayerSleepInferiors.remove(id);
            allBaseOverrideRenderPlayerSleepSuperiors.remove(id);
            allBaseOverrideRenderPlayerSleepInferiors.remove(id);
            allBaseAfterRenderPlayerSleepSuperiors.remove(id);
            allBaseAfterRenderPlayerSleepInferiors.remove(id);
            beforeRenderPlayerSleepHookTypes.remove(id);
            overrideRenderPlayerSleepHookTypes.remove(id);
            afterRenderPlayerSleepHookTypes.remove(id);
            allBaseBeforeRenderSpecialsSuperiors.remove(id);
            allBaseBeforeRenderSpecialsInferiors.remove(id);
            allBaseOverrideRenderSpecialsSuperiors.remove(id);
            allBaseOverrideRenderSpecialsInferiors.remove(id);
            allBaseAfterRenderSpecialsSuperiors.remove(id);
            allBaseAfterRenderSpecialsInferiors.remove(id);
            beforeRenderSpecialsHookTypes.remove(id);
            overrideRenderSpecialsHookTypes.remove(id);
            afterRenderSpecialsHookTypes.remove(id);
            allBaseBeforeRenderSwingProgressSuperiors.remove(id);
            allBaseBeforeRenderSwingProgressInferiors.remove(id);
            allBaseOverrideRenderSwingProgressSuperiors.remove(id);
            allBaseOverrideRenderSwingProgressInferiors.remove(id);
            allBaseAfterRenderSwingProgressSuperiors.remove(id);
            allBaseAfterRenderSwingProgressInferiors.remove(id);
            beforeRenderSwingProgressHookTypes.remove(id);
            overrideRenderSwingProgressHookTypes.remove(id);
            afterRenderSwingProgressHookTypes.remove(id);
            allBaseBeforeRotatePlayerSuperiors.remove(id);
            allBaseBeforeRotatePlayerInferiors.remove(id);
            allBaseOverrideRotatePlayerSuperiors.remove(id);
            allBaseOverrideRotatePlayerInferiors.remove(id);
            allBaseAfterRotatePlayerSuperiors.remove(id);
            allBaseAfterRotatePlayerInferiors.remove(id);
            beforeRotatePlayerHookTypes.remove(id);
            overrideRotatePlayerHookTypes.remove(id);
            afterRotatePlayerHookTypes.remove(id);
            allBaseBeforeSetArmorModelSuperiors.remove(id);
            allBaseBeforeSetArmorModelInferiors.remove(id);
            allBaseOverrideSetArmorModelSuperiors.remove(id);
            allBaseOverrideSetArmorModelInferiors.remove(id);
            allBaseAfterSetArmorModelSuperiors.remove(id);
            allBaseAfterSetArmorModelInferiors.remove(id);
            beforeSetArmorModelHookTypes.remove(id);
            overrideSetArmorModelHookTypes.remove(id);
            afterSetArmorModelHookTypes.remove(id);
            allBaseBeforeSetPassArmorModelSuperiors.remove(id);
            allBaseBeforeSetPassArmorModelInferiors.remove(id);
            allBaseOverrideSetPassArmorModelSuperiors.remove(id);
            allBaseOverrideSetPassArmorModelInferiors.remove(id);
            allBaseAfterSetPassArmorModelSuperiors.remove(id);
            allBaseAfterSetPassArmorModelInferiors.remove(id);
            beforeSetPassArmorModelHookTypes.remove(id);
            overrideSetPassArmorModelHookTypes.remove(id);
            afterSetPassArmorModelHookTypes.remove(id);
            allBaseBeforeSetRenderManagerSuperiors.remove(id);
            allBaseBeforeSetRenderManagerInferiors.remove(id);
            allBaseOverrideSetRenderManagerSuperiors.remove(id);
            allBaseOverrideSetRenderManagerInferiors.remove(id);
            allBaseAfterSetRenderManagerSuperiors.remove(id);
            allBaseAfterSetRenderManagerInferiors.remove(id);
            beforeSetRenderManagerHookTypes.remove(id);
            overrideSetRenderManagerHookTypes.remove(id);
            afterSetRenderManagerHookTypes.remove(id);
            allBaseBeforeSetRenderPassModelSuperiors.remove(id);
            allBaseBeforeSetRenderPassModelInferiors.remove(id);
            allBaseOverrideSetRenderPassModelSuperiors.remove(id);
            allBaseOverrideSetRenderPassModelInferiors.remove(id);
            allBaseAfterSetRenderPassModelSuperiors.remove(id);
            allBaseAfterSetRenderPassModelInferiors.remove(id);
            beforeSetRenderPassModelHookTypes.remove(id);
            overrideSetRenderPassModelHookTypes.remove(id);
            afterSetRenderPassModelHookTypes.remove(id);
            allBaseBeforeUpdateIconsSuperiors.remove(id);
            allBaseBeforeUpdateIconsInferiors.remove(id);
            allBaseOverrideUpdateIconsSuperiors.remove(id);
            allBaseOverrideUpdateIconsInferiors.remove(id);
            allBaseAfterUpdateIconsSuperiors.remove(id);
            allBaseAfterUpdateIconsInferiors.remove(id);
            beforeUpdateIconsHookTypes.remove(id);
            overrideUpdateIconsHookTypes.remove(id);
            afterUpdateIconsHookTypes.remove(id);
            iterator = keysToVirtualIds.keySet().iterator();

            while(iterator.hasNext()) {
               String key = (String)iterator.next();
               if (((String)keysToVirtualIds.get(key)).equals(id)) {
                  keysToVirtualIds.remove(key);
               }
            }

            boolean otherFound = false;
            Class type = constructor.getDeclaringClass();
            iterator = allBaseConstructors.keySet().iterator();

            while(iterator.hasNext()) {
               String otherId = (String)iterator.next();
               Class otherType = ((Constructor)allBaseConstructors.get(otherId)).getDeclaringClass();
               if (!otherId.equals(id) && otherType.equals(type)) {
                  otherFound = true;
                  break;
               }
            }

            if (!otherFound) {
               dynamicTypes.remove(type);
               virtualDynamicHookMethods.remove(type);
               beforeDynamicHookMethods.remove(type);
               overrideDynamicHookMethods.remove(type);
               afterDynamicHookMethods.remove(type);
            }

            removeDynamicHookTypes(id, beforeDynamicHookTypes);
            removeDynamicHookTypes(id, overrideDynamicHookTypes);
            removeDynamicHookTypes(id, afterDynamicHookTypes);
            allBaseBeforeDynamicSuperiors.remove(id);
            allBaseBeforeDynamicInferiors.remove(id);
            allBaseOverrideDynamicSuperiors.remove(id);
            allBaseOverrideDynamicInferiors.remove(id);
            allBaseAfterDynamicSuperiors.remove(id);
            allBaseAfterDynamicInferiors.remove(id);
            log("RenderPlayerAPI: unregistered id '" + id + "'");
            return true;
         }
      }
   }

   public static void removeDynamicHookTypes(String id, Map map) {
      Iterator keys = map.keySet().iterator();

      while(keys.hasNext()) {
         ((List)map.get(keys.next())).remove(id);
      }

   }

   public static Set getRegisteredIds() {
      return unmodifiableAllIds;
   }

   private static void addSorting(String id, Map map, String[] values) {
      if (values != null && values.length > 0) {
         map.put(id, values);
      }

   }

   private static void addDynamicSorting(String id, Map map, Map values) {
      if (values != null && values.size() > 0) {
         map.put(id, values);
      }

   }

   private static boolean addMethod(String id, Class baseClass, List list, String methodName, Class... _parameterTypes) {
      try {
         Method method = baseClass.getMethod(methodName, _parameterTypes);
         boolean isOverridden = method.getDeclaringClass() != RenderPlayerBase.class;
         if (isOverridden) {
            list.add(id);
         }

         return isOverridden;
      } catch (Exception var7) {
         throw new RuntimeException("Can not reflect method '" + methodName + "' of class '" + baseClass.getName() + "'", var7);
      }
   }

   private static void addDynamicMethods(String id, Class baseClass) {
      if (dynamicTypes.add(baseClass)) {
         Map virtuals = null;
         Map befores = null;
         Map overrides = null;
         Map afters = null;
         Method[] methods = baseClass.getDeclaredMethods();

         for(int i = 0; i < methods.length; ++i) {
            Method method = methods[i];
            if (method.getDeclaringClass() == baseClass) {
               int modifiers = method.getModifiers();
               if (!Modifier.isAbstract(modifiers) && !Modifier.isStatic(modifiers)) {
                  String name = method.getName();
                  if (name.length() >= 7 && name.substring(0, 7).equalsIgnoreCase("dynamic")) {
                     for(name = name.substring(7); name.charAt(0) == '_'; name = name.substring(1)) {
                        ;
                     }

                     boolean before = false;
                     boolean virtual = false;
                     boolean override = false;
                     boolean after = false;
                     if (name.substring(0, 7).equalsIgnoreCase("virtual")) {
                        virtual = true;
                        name = name.substring(7);
                     } else if (name.length() >= 8 && name.substring(0, 8).equalsIgnoreCase("override")) {
                        name = name.substring(8);
                        override = true;
                     } else if (name.length() >= 6 && name.substring(0, 6).equalsIgnoreCase("before")) {
                        before = true;
                        name = name.substring(6);
                     } else if (name.length() >= 5 && name.substring(0, 5).equalsIgnoreCase("after")) {
                        after = true;
                        name = name.substring(5);
                     }

                     if (name.length() >= 1 && (before || virtual || override || after)) {
                        name = name.substring(0, 1).toLowerCase() + name.substring(1);
                     }

                     while(name.charAt(0) == '_') {
                        name = name.substring(1);
                     }

                     if (name.length() == 0) {
                        throw new RuntimeException("Can not process dynamic hook method with no key");
                     }

                     keys.add(name);
                     if (virtual) {
                        if (keysToVirtualIds.containsKey(name)) {
                           throw new RuntimeException("Can not process more than one dynamic virtual method");
                        }

                        keysToVirtualIds.put(name, id);
                        virtuals = addDynamicMethod(name, method, virtuals);
                     } else if (before) {
                        befores = addDynamicMethod(name, method, befores);
                     } else if (after) {
                        afters = addDynamicMethod(name, method, afters);
                     } else {
                        overrides = addDynamicMethod(name, method, overrides);
                     }
                  }
               }
            }
         }

         if (virtuals != null) {
            virtualDynamicHookMethods.put(baseClass, virtuals);
         }

         if (befores != null) {
            beforeDynamicHookMethods.put(baseClass, befores);
         }

         if (overrides != null) {
            overrideDynamicHookMethods.put(baseClass, overrides);
         }

         if (afters != null) {
            afterDynamicHookMethods.put(baseClass, afters);
         }

      }
   }

   private static void addDynamicKeys(String id, Class baseClass, Map dynamicHookMethods, Map dynamicHookTypes) {
      Map methods = (Map)dynamicHookMethods.get(baseClass);
      if (methods != null && methods.size() != 0) {
         String key;
         for(Iterator keys = methods.keySet().iterator(); keys.hasNext(); ((List)dynamicHookTypes.get(key)).add(id)) {
            key = (String)keys.next();
            if (!dynamicHookTypes.containsKey(key)) {
               dynamicHookTypes.put(key, new ArrayList(1));
            }
         }

      }
   }

   private static Map addDynamicMethod(String key, Method method, Map methods) {
      if (methods == null) {
         methods = new HashMap();
      }

      if (((Map)methods).containsKey(key)) {
         throw new RuntimeException("method with key '" + key + "' allready exists");
      } else {
         ((Map)methods).put(key, method);
         return (Map)methods;
      }
   }

   public static RenderPlayerAPI create(IRenderPlayerAPI renderPlayer) {
      if (allBaseConstructors.size() > 0 && !initialized) {
         initialize();
      }

      return new RenderPlayerAPI(renderPlayer);
   }

   private static void initialize() {
      sortBases(beforeLocalConstructingHookTypes, allBaseBeforeLocalConstructingSuperiors, allBaseBeforeLocalConstructingInferiors, "beforeLocalConstructing");
      sortBases(afterLocalConstructingHookTypes, allBaseAfterLocalConstructingSuperiors, allBaseAfterLocalConstructingInferiors, "afterLocalConstructing");
      Iterator keyIterator = keys.iterator();

      while(keyIterator.hasNext()) {
         String key = (String)keyIterator.next();
         sortDynamicBases(beforeDynamicHookTypes, allBaseBeforeDynamicSuperiors, allBaseBeforeDynamicInferiors, key);
         sortDynamicBases(overrideDynamicHookTypes, allBaseOverrideDynamicSuperiors, allBaseOverrideDynamicInferiors, key);
         sortDynamicBases(afterDynamicHookTypes, allBaseAfterDynamicSuperiors, allBaseAfterDynamicInferiors, key);
      }

      sortBases(beforeDoRenderLabelHookTypes, allBaseBeforeDoRenderLabelSuperiors, allBaseBeforeDoRenderLabelInferiors, "beforeDoRenderLabel");
      sortBases(overrideDoRenderLabelHookTypes, allBaseOverrideDoRenderLabelSuperiors, allBaseOverrideDoRenderLabelInferiors, "overrideDoRenderLabel");
      sortBases(afterDoRenderLabelHookTypes, allBaseAfterDoRenderLabelSuperiors, allBaseAfterDoRenderLabelInferiors, "afterDoRenderLabel");
      sortBases(beforeDoRenderShadowAndFireHookTypes, allBaseBeforeDoRenderShadowAndFireSuperiors, allBaseBeforeDoRenderShadowAndFireInferiors, "beforeDoRenderShadowAndFire");
      sortBases(overrideDoRenderShadowAndFireHookTypes, allBaseOverrideDoRenderShadowAndFireSuperiors, allBaseOverrideDoRenderShadowAndFireInferiors, "overrideDoRenderShadowAndFire");
      sortBases(afterDoRenderShadowAndFireHookTypes, allBaseAfterDoRenderShadowAndFireSuperiors, allBaseAfterDoRenderShadowAndFireInferiors, "afterDoRenderShadowAndFire");
      sortBases(beforeGetColorMultiplierHookTypes, allBaseBeforeGetColorMultiplierSuperiors, allBaseBeforeGetColorMultiplierInferiors, "beforeGetColorMultiplier");
      sortBases(overrideGetColorMultiplierHookTypes, allBaseOverrideGetColorMultiplierSuperiors, allBaseOverrideGetColorMultiplierInferiors, "overrideGetColorMultiplier");
      sortBases(afterGetColorMultiplierHookTypes, allBaseAfterGetColorMultiplierSuperiors, allBaseAfterGetColorMultiplierInferiors, "afterGetColorMultiplier");
      sortBases(beforeGetDeathMaxRotationHookTypes, allBaseBeforeGetDeathMaxRotationSuperiors, allBaseBeforeGetDeathMaxRotationInferiors, "beforeGetDeathMaxRotation");
      sortBases(overrideGetDeathMaxRotationHookTypes, allBaseOverrideGetDeathMaxRotationSuperiors, allBaseOverrideGetDeathMaxRotationInferiors, "overrideGetDeathMaxRotation");
      sortBases(afterGetDeathMaxRotationHookTypes, allBaseAfterGetDeathMaxRotationSuperiors, allBaseAfterGetDeathMaxRotationInferiors, "afterGetDeathMaxRotation");
      sortBases(beforeGetFontRendererFromRenderManagerHookTypes, allBaseBeforeGetFontRendererFromRenderManagerSuperiors, allBaseBeforeGetFontRendererFromRenderManagerInferiors, "beforeGetFontRendererFromRenderManager");
      sortBases(overrideGetFontRendererFromRenderManagerHookTypes, allBaseOverrideGetFontRendererFromRenderManagerSuperiors, allBaseOverrideGetFontRendererFromRenderManagerInferiors, "overrideGetFontRendererFromRenderManager");
      sortBases(afterGetFontRendererFromRenderManagerHookTypes, allBaseAfterGetFontRendererFromRenderManagerSuperiors, allBaseAfterGetFontRendererFromRenderManagerInferiors, "afterGetFontRendererFromRenderManager");
      sortBases(beforeGetResourceLocationFromPlayerHookTypes, allBaseBeforeGetResourceLocationFromPlayerSuperiors, allBaseBeforeGetResourceLocationFromPlayerInferiors, "beforeGetResourceLocationFromPlayer");
      sortBases(overrideGetResourceLocationFromPlayerHookTypes, allBaseOverrideGetResourceLocationFromPlayerSuperiors, allBaseOverrideGetResourceLocationFromPlayerInferiors, "overrideGetResourceLocationFromPlayer");
      sortBases(afterGetResourceLocationFromPlayerHookTypes, allBaseAfterGetResourceLocationFromPlayerSuperiors, allBaseAfterGetResourceLocationFromPlayerInferiors, "afterGetResourceLocationFromPlayer");
      sortBases(beforeHandleRotationFloatHookTypes, allBaseBeforeHandleRotationFloatSuperiors, allBaseBeforeHandleRotationFloatInferiors, "beforeHandleRotationFloat");
      sortBases(overrideHandleRotationFloatHookTypes, allBaseOverrideHandleRotationFloatSuperiors, allBaseOverrideHandleRotationFloatInferiors, "overrideHandleRotationFloat");
      sortBases(afterHandleRotationFloatHookTypes, allBaseAfterHandleRotationFloatSuperiors, allBaseAfterHandleRotationFloatInferiors, "afterHandleRotationFloat");
      sortBases(beforeInheritRenderPassHookTypes, allBaseBeforeInheritRenderPassSuperiors, allBaseBeforeInheritRenderPassInferiors, "beforeInheritRenderPass");
      sortBases(overrideInheritRenderPassHookTypes, allBaseOverrideInheritRenderPassSuperiors, allBaseOverrideInheritRenderPassInferiors, "overrideInheritRenderPass");
      sortBases(afterInheritRenderPassHookTypes, allBaseAfterInheritRenderPassSuperiors, allBaseAfterInheritRenderPassInferiors, "afterInheritRenderPass");
      sortBases(beforeLoadTextureHookTypes, allBaseBeforeLoadTextureSuperiors, allBaseBeforeLoadTextureInferiors, "beforeLoadTexture");
      sortBases(overrideLoadTextureHookTypes, allBaseOverrideLoadTextureSuperiors, allBaseOverrideLoadTextureInferiors, "overrideLoadTexture");
      sortBases(afterLoadTextureHookTypes, allBaseAfterLoadTextureSuperiors, allBaseAfterLoadTextureInferiors, "afterLoadTexture");
      sortBases(beforeLoadTextureOfEntityHookTypes, allBaseBeforeLoadTextureOfEntitySuperiors, allBaseBeforeLoadTextureOfEntityInferiors, "beforeLoadTextureOfEntity");
      sortBases(overrideLoadTextureOfEntityHookTypes, allBaseOverrideLoadTextureOfEntitySuperiors, allBaseOverrideLoadTextureOfEntityInferiors, "overrideLoadTextureOfEntity");
      sortBases(afterLoadTextureOfEntityHookTypes, allBaseAfterLoadTextureOfEntitySuperiors, allBaseAfterLoadTextureOfEntityInferiors, "afterLoadTextureOfEntity");
      sortBases(beforePassSpecialRenderHookTypes, allBaseBeforePassSpecialRenderSuperiors, allBaseBeforePassSpecialRenderInferiors, "beforePassSpecialRender");
      sortBases(overridePassSpecialRenderHookTypes, allBaseOverridePassSpecialRenderSuperiors, allBaseOverridePassSpecialRenderInferiors, "overridePassSpecialRender");
      sortBases(afterPassSpecialRenderHookTypes, allBaseAfterPassSpecialRenderSuperiors, allBaseAfterPassSpecialRenderInferiors, "afterPassSpecialRender");
      sortBases(beforePerformStaticEntityRebuildHookTypes, allBaseBeforePerformStaticEntityRebuildSuperiors, allBaseBeforePerformStaticEntityRebuildInferiors, "beforePerformStaticEntityRebuild");
      sortBases(overridePerformStaticEntityRebuildHookTypes, allBaseOverridePerformStaticEntityRebuildSuperiors, allBaseOverridePerformStaticEntityRebuildInferiors, "overridePerformStaticEntityRebuild");
      sortBases(afterPerformStaticEntityRebuildHookTypes, allBaseAfterPerformStaticEntityRebuildSuperiors, allBaseAfterPerformStaticEntityRebuildInferiors, "afterPerformStaticEntityRebuild");
      sortBases(beforeRenderArrowsStuckInEntityHookTypes, allBaseBeforeRenderArrowsStuckInEntitySuperiors, allBaseBeforeRenderArrowsStuckInEntityInferiors, "beforeRenderArrowsStuckInEntity");
      sortBases(overrideRenderArrowsStuckInEntityHookTypes, allBaseOverrideRenderArrowsStuckInEntitySuperiors, allBaseOverrideRenderArrowsStuckInEntityInferiors, "overrideRenderArrowsStuckInEntity");
      sortBases(afterRenderArrowsStuckInEntityHookTypes, allBaseAfterRenderArrowsStuckInEntitySuperiors, allBaseAfterRenderArrowsStuckInEntityInferiors, "afterRenderArrowsStuckInEntity");
      sortBases(beforeRenderFirstPersonArmHookTypes, allBaseBeforeRenderFirstPersonArmSuperiors, allBaseBeforeRenderFirstPersonArmInferiors, "beforeRenderFirstPersonArm");
      sortBases(overrideRenderFirstPersonArmHookTypes, allBaseOverrideRenderFirstPersonArmSuperiors, allBaseOverrideRenderFirstPersonArmInferiors, "overrideRenderFirstPersonArm");
      sortBases(afterRenderFirstPersonArmHookTypes, allBaseAfterRenderFirstPersonArmSuperiors, allBaseAfterRenderFirstPersonArmInferiors, "afterRenderFirstPersonArm");
      sortBases(beforeRenderLivingLabelHookTypes, allBaseBeforeRenderLivingLabelSuperiors, allBaseBeforeRenderLivingLabelInferiors, "beforeRenderLivingLabel");
      sortBases(overrideRenderLivingLabelHookTypes, allBaseOverrideRenderLivingLabelSuperiors, allBaseOverrideRenderLivingLabelInferiors, "overrideRenderLivingLabel");
      sortBases(afterRenderLivingLabelHookTypes, allBaseAfterRenderLivingLabelSuperiors, allBaseAfterRenderLivingLabelInferiors, "afterRenderLivingLabel");
      sortBases(beforeRenderModelHookTypes, allBaseBeforeRenderModelSuperiors, allBaseBeforeRenderModelInferiors, "beforeRenderModel");
      sortBases(overrideRenderModelHookTypes, allBaseOverrideRenderModelSuperiors, allBaseOverrideRenderModelInferiors, "overrideRenderModel");
      sortBases(afterRenderModelHookTypes, allBaseAfterRenderModelSuperiors, allBaseAfterRenderModelInferiors, "afterRenderModel");
      sortBases(beforeRenderPlayerHookTypes, allBaseBeforeRenderPlayerSuperiors, allBaseBeforeRenderPlayerInferiors, "beforeRenderPlayer");
      sortBases(overrideRenderPlayerHookTypes, allBaseOverrideRenderPlayerSuperiors, allBaseOverrideRenderPlayerInferiors, "overrideRenderPlayer");
      sortBases(afterRenderPlayerHookTypes, allBaseAfterRenderPlayerSuperiors, allBaseAfterRenderPlayerInferiors, "afterRenderPlayer");
      sortBases(beforeRenderPlayerNameAndScoreLabelHookTypes, allBaseBeforeRenderPlayerNameAndScoreLabelSuperiors, allBaseBeforeRenderPlayerNameAndScoreLabelInferiors, "beforeRenderPlayerNameAndScoreLabel");
      sortBases(overrideRenderPlayerNameAndScoreLabelHookTypes, allBaseOverrideRenderPlayerNameAndScoreLabelSuperiors, allBaseOverrideRenderPlayerNameAndScoreLabelInferiors, "overrideRenderPlayerNameAndScoreLabel");
      sortBases(afterRenderPlayerNameAndScoreLabelHookTypes, allBaseAfterRenderPlayerNameAndScoreLabelSuperiors, allBaseAfterRenderPlayerNameAndScoreLabelInferiors, "afterRenderPlayerNameAndScoreLabel");
      sortBases(beforeRenderPlayerScaleHookTypes, allBaseBeforeRenderPlayerScaleSuperiors, allBaseBeforeRenderPlayerScaleInferiors, "beforeRenderPlayerScale");
      sortBases(overrideRenderPlayerScaleHookTypes, allBaseOverrideRenderPlayerScaleSuperiors, allBaseOverrideRenderPlayerScaleInferiors, "overrideRenderPlayerScale");
      sortBases(afterRenderPlayerScaleHookTypes, allBaseAfterRenderPlayerScaleSuperiors, allBaseAfterRenderPlayerScaleInferiors, "afterRenderPlayerScale");
      sortBases(beforeRenderPlayerSleepHookTypes, allBaseBeforeRenderPlayerSleepSuperiors, allBaseBeforeRenderPlayerSleepInferiors, "beforeRenderPlayerSleep");
      sortBases(overrideRenderPlayerSleepHookTypes, allBaseOverrideRenderPlayerSleepSuperiors, allBaseOverrideRenderPlayerSleepInferiors, "overrideRenderPlayerSleep");
      sortBases(afterRenderPlayerSleepHookTypes, allBaseAfterRenderPlayerSleepSuperiors, allBaseAfterRenderPlayerSleepInferiors, "afterRenderPlayerSleep");
      sortBases(beforeRenderSpecialsHookTypes, allBaseBeforeRenderSpecialsSuperiors, allBaseBeforeRenderSpecialsInferiors, "beforeRenderSpecials");
      sortBases(overrideRenderSpecialsHookTypes, allBaseOverrideRenderSpecialsSuperiors, allBaseOverrideRenderSpecialsInferiors, "overrideRenderSpecials");
      sortBases(afterRenderSpecialsHookTypes, allBaseAfterRenderSpecialsSuperiors, allBaseAfterRenderSpecialsInferiors, "afterRenderSpecials");
      sortBases(beforeRenderSwingProgressHookTypes, allBaseBeforeRenderSwingProgressSuperiors, allBaseBeforeRenderSwingProgressInferiors, "beforeRenderSwingProgress");
      sortBases(overrideRenderSwingProgressHookTypes, allBaseOverrideRenderSwingProgressSuperiors, allBaseOverrideRenderSwingProgressInferiors, "overrideRenderSwingProgress");
      sortBases(afterRenderSwingProgressHookTypes, allBaseAfterRenderSwingProgressSuperiors, allBaseAfterRenderSwingProgressInferiors, "afterRenderSwingProgress");
      sortBases(beforeRotatePlayerHookTypes, allBaseBeforeRotatePlayerSuperiors, allBaseBeforeRotatePlayerInferiors, "beforeRotatePlayer");
      sortBases(overrideRotatePlayerHookTypes, allBaseOverrideRotatePlayerSuperiors, allBaseOverrideRotatePlayerInferiors, "overrideRotatePlayer");
      sortBases(afterRotatePlayerHookTypes, allBaseAfterRotatePlayerSuperiors, allBaseAfterRotatePlayerInferiors, "afterRotatePlayer");
      sortBases(beforeSetArmorModelHookTypes, allBaseBeforeSetArmorModelSuperiors, allBaseBeforeSetArmorModelInferiors, "beforeSetArmorModel");
      sortBases(overrideSetArmorModelHookTypes, allBaseOverrideSetArmorModelSuperiors, allBaseOverrideSetArmorModelInferiors, "overrideSetArmorModel");
      sortBases(afterSetArmorModelHookTypes, allBaseAfterSetArmorModelSuperiors, allBaseAfterSetArmorModelInferiors, "afterSetArmorModel");
      sortBases(beforeSetPassArmorModelHookTypes, allBaseBeforeSetPassArmorModelSuperiors, allBaseBeforeSetPassArmorModelInferiors, "beforeSetPassArmorModel");
      sortBases(overrideSetPassArmorModelHookTypes, allBaseOverrideSetPassArmorModelSuperiors, allBaseOverrideSetPassArmorModelInferiors, "overrideSetPassArmorModel");
      sortBases(afterSetPassArmorModelHookTypes, allBaseAfterSetPassArmorModelSuperiors, allBaseAfterSetPassArmorModelInferiors, "afterSetPassArmorModel");
      sortBases(beforeSetRenderManagerHookTypes, allBaseBeforeSetRenderManagerSuperiors, allBaseBeforeSetRenderManagerInferiors, "beforeSetRenderManager");
      sortBases(overrideSetRenderManagerHookTypes, allBaseOverrideSetRenderManagerSuperiors, allBaseOverrideSetRenderManagerInferiors, "overrideSetRenderManager");
      sortBases(afterSetRenderManagerHookTypes, allBaseAfterSetRenderManagerSuperiors, allBaseAfterSetRenderManagerInferiors, "afterSetRenderManager");
      sortBases(beforeSetRenderPassModelHookTypes, allBaseBeforeSetRenderPassModelSuperiors, allBaseBeforeSetRenderPassModelInferiors, "beforeSetRenderPassModel");
      sortBases(overrideSetRenderPassModelHookTypes, allBaseOverrideSetRenderPassModelSuperiors, allBaseOverrideSetRenderPassModelInferiors, "overrideSetRenderPassModel");
      sortBases(afterSetRenderPassModelHookTypes, allBaseAfterSetRenderPassModelSuperiors, allBaseAfterSetRenderPassModelInferiors, "afterSetRenderPassModel");
      sortBases(beforeUpdateIconsHookTypes, allBaseBeforeUpdateIconsSuperiors, allBaseBeforeUpdateIconsInferiors, "beforeUpdateIcons");
      sortBases(overrideUpdateIconsHookTypes, allBaseOverrideUpdateIconsSuperiors, allBaseOverrideUpdateIconsInferiors, "overrideUpdateIcons");
      sortBases(afterUpdateIconsHookTypes, allBaseAfterUpdateIconsSuperiors, allBaseAfterUpdateIconsInferiors, "afterUpdateIcons");
      initialized = true;
   }

   public static RenderPlayer[] getAllInstances() {
      return (RenderPlayer[])allInstances.toArray(new RenderPlayer[allInstances.size()]);
   }

   public static void beforeLocalConstructing(IRenderPlayerAPI renderPlayer) {
      RenderPlayerAPI renderPlayerAPI = renderPlayer.getRenderPlayerAPI();
      if (renderPlayerAPI != null) {
         renderPlayerAPI.load();
      }

      allInstances.add(renderPlayer);
      if (renderPlayerAPI != null) {
         renderPlayerAPI.beforeLocalConstructing();
      }

   }

   public static void afterLocalConstructing(IRenderPlayerAPI renderPlayer) {
      RenderPlayerAPI renderPlayerAPI = renderPlayer.getRenderPlayerAPI();
      if (renderPlayerAPI != null) {
         renderPlayerAPI.afterLocalConstructing();
      }

   }

   public static RenderPlayerBase getRenderPlayerBase(IRenderPlayerAPI renderPlayer, String baseId) {
      RenderPlayerAPI renderPlayerAPI = renderPlayer.getRenderPlayerAPI();
      return renderPlayerAPI != null ? renderPlayerAPI.getRenderPlayerBase(baseId) : null;
   }

   public static Set getRenderPlayerBaseIds(IRenderPlayerAPI renderPlayer) {
      RenderPlayerAPI renderPlayerAPI = renderPlayer.getRenderPlayerAPI();
      Set result = null;
      if (renderPlayerAPI != null) {
         result = renderPlayerAPI.getRenderPlayerBaseIds();
      } else {
         result = Collections.emptySet();
      }

      return result;
   }

   public static Object dynamic(IRenderPlayerAPI renderPlayer, String key, Object[] parameters) {
      RenderPlayerAPI renderPlayerAPI = renderPlayer.getRenderPlayerAPI();
      return renderPlayerAPI != null ? renderPlayerAPI.dynamic(key, parameters) : null;
   }

   private static void sortBases(List list, Map allBaseSuperiors, Map allBaseInferiors, String methodName) {
      (new RenderPlayerBaseSorter(list, allBaseSuperiors, allBaseInferiors, methodName)).Sort();
   }

   private static void sortDynamicBases(Map lists, Map allBaseSuperiors, Map allBaseInferiors, String key) {
      List types = (List)lists.get(key);
      if (types != null && types.size() > 1) {
         sortBases(types, getDynamicSorters(key, types, allBaseSuperiors), getDynamicSorters(key, types, allBaseInferiors), key);
      }

   }

   private static Map getDynamicSorters(String key, List toSort, Map allBaseValues) {
      Map superiors = null;
      Iterator ids = toSort.iterator();

      while(ids.hasNext()) {
         String id = (String)ids.next();
         Map idSuperiors = (Map)allBaseValues.get(id);
         if (idSuperiors != null) {
            String[] keySuperiorIds = (String[])idSuperiors.get(key);
            if (keySuperiorIds != null && keySuperiorIds.length > 0) {
               if (superiors == null) {
                  superiors = new HashMap(1);
               }

               superiors.put(id, keySuperiorIds);
            }
         }
      }

      return (Map)(superiors != null ? superiors : EmptySortMap);
   }

   private RenderPlayerAPI(IRenderPlayerAPI renderPlayer) {
      this.unmodifiableAllBaseIds = Collections.unmodifiableSet(this.allBaseObjects.keySet());
      this.renderPlayer = renderPlayer;
   }

   private void load() {
      Iterator iterator = allBaseConstructors.keySet().iterator();

      while(iterator.hasNext()) {
         String id = (String)iterator.next();
         RenderPlayerBase toAttach = this.createRenderPlayerBase(id);
         toAttach.beforeBaseAttach(false);
         this.allBaseObjects.put(id, toAttach);
         this.baseObjectsToId.put(toAttach, id);
      }

      this.beforeLocalConstructingHooks = this.create(beforeLocalConstructingHookTypes);
      this.afterLocalConstructingHooks = this.create(afterLocalConstructingHookTypes);
      this.updateRenderPlayerBases();
      iterator = this.allBaseObjects.keySet().iterator();

      while(iterator.hasNext()) {
         ((RenderPlayerBase)this.allBaseObjects.get(iterator.next())).afterBaseAttach(false);
      }

   }

   private RenderPlayerBase createRenderPlayerBase(String id) {
      Constructor contructor = (Constructor)allBaseConstructors.get(id);

      try {
         RenderPlayerBase base;
         if (contructor.getParameterTypes().length == 1) {
            base = (RenderPlayerBase)contructor.newInstance(this);
         } else {
            base = (RenderPlayerBase)contructor.newInstance(this, id);
         }

         return base;
      } catch (Exception var5) {
         throw new RuntimeException("Exception while creating a RenderPlayerBase of type '" + contructor.getDeclaringClass() + "'", var5);
      }
   }

   private void updateRenderPlayerBases() {
      this.beforeDoRenderLabelHooks = this.create(beforeDoRenderLabelHookTypes);
      this.overrideDoRenderLabelHooks = this.create(overrideDoRenderLabelHookTypes);
      this.afterDoRenderLabelHooks = this.create(afterDoRenderLabelHookTypes);
      this.isDoRenderLabelModded = this.beforeDoRenderLabelHooks != null || this.overrideDoRenderLabelHooks != null || this.afterDoRenderLabelHooks != null;
      this.beforeDoRenderShadowAndFireHooks = this.create(beforeDoRenderShadowAndFireHookTypes);
      this.overrideDoRenderShadowAndFireHooks = this.create(overrideDoRenderShadowAndFireHookTypes);
      this.afterDoRenderShadowAndFireHooks = this.create(afterDoRenderShadowAndFireHookTypes);
      this.isDoRenderShadowAndFireModded = this.beforeDoRenderShadowAndFireHooks != null || this.overrideDoRenderShadowAndFireHooks != null || this.afterDoRenderShadowAndFireHooks != null;
      this.beforeGetColorMultiplierHooks = this.create(beforeGetColorMultiplierHookTypes);
      this.overrideGetColorMultiplierHooks = this.create(overrideGetColorMultiplierHookTypes);
      this.afterGetColorMultiplierHooks = this.create(afterGetColorMultiplierHookTypes);
      this.isGetColorMultiplierModded = this.beforeGetColorMultiplierHooks != null || this.overrideGetColorMultiplierHooks != null || this.afterGetColorMultiplierHooks != null;
      this.beforeGetDeathMaxRotationHooks = this.create(beforeGetDeathMaxRotationHookTypes);
      this.overrideGetDeathMaxRotationHooks = this.create(overrideGetDeathMaxRotationHookTypes);
      this.afterGetDeathMaxRotationHooks = this.create(afterGetDeathMaxRotationHookTypes);
      this.isGetDeathMaxRotationModded = this.beforeGetDeathMaxRotationHooks != null || this.overrideGetDeathMaxRotationHooks != null || this.afterGetDeathMaxRotationHooks != null;
      this.beforeGetFontRendererFromRenderManagerHooks = this.create(beforeGetFontRendererFromRenderManagerHookTypes);
      this.overrideGetFontRendererFromRenderManagerHooks = this.create(overrideGetFontRendererFromRenderManagerHookTypes);
      this.afterGetFontRendererFromRenderManagerHooks = this.create(afterGetFontRendererFromRenderManagerHookTypes);
      this.isGetFontRendererFromRenderManagerModded = this.beforeGetFontRendererFromRenderManagerHooks != null || this.overrideGetFontRendererFromRenderManagerHooks != null || this.afterGetFontRendererFromRenderManagerHooks != null;
      this.beforeGetResourceLocationFromPlayerHooks = this.create(beforeGetResourceLocationFromPlayerHookTypes);
      this.overrideGetResourceLocationFromPlayerHooks = this.create(overrideGetResourceLocationFromPlayerHookTypes);
      this.afterGetResourceLocationFromPlayerHooks = this.create(afterGetResourceLocationFromPlayerHookTypes);
      this.isGetResourceLocationFromPlayerModded = this.beforeGetResourceLocationFromPlayerHooks != null || this.overrideGetResourceLocationFromPlayerHooks != null || this.afterGetResourceLocationFromPlayerHooks != null;
      this.beforeHandleRotationFloatHooks = this.create(beforeHandleRotationFloatHookTypes);
      this.overrideHandleRotationFloatHooks = this.create(overrideHandleRotationFloatHookTypes);
      this.afterHandleRotationFloatHooks = this.create(afterHandleRotationFloatHookTypes);
      this.isHandleRotationFloatModded = this.beforeHandleRotationFloatHooks != null || this.overrideHandleRotationFloatHooks != null || this.afterHandleRotationFloatHooks != null;
      this.beforeInheritRenderPassHooks = this.create(beforeInheritRenderPassHookTypes);
      this.overrideInheritRenderPassHooks = this.create(overrideInheritRenderPassHookTypes);
      this.afterInheritRenderPassHooks = this.create(afterInheritRenderPassHookTypes);
      this.isInheritRenderPassModded = this.beforeInheritRenderPassHooks != null || this.overrideInheritRenderPassHooks != null || this.afterInheritRenderPassHooks != null;
      this.beforeLoadTextureHooks = this.create(beforeLoadTextureHookTypes);
      this.overrideLoadTextureHooks = this.create(overrideLoadTextureHookTypes);
      this.afterLoadTextureHooks = this.create(afterLoadTextureHookTypes);
      this.isLoadTextureModded = this.beforeLoadTextureHooks != null || this.overrideLoadTextureHooks != null || this.afterLoadTextureHooks != null;
      this.beforeLoadTextureOfEntityHooks = this.create(beforeLoadTextureOfEntityHookTypes);
      this.overrideLoadTextureOfEntityHooks = this.create(overrideLoadTextureOfEntityHookTypes);
      this.afterLoadTextureOfEntityHooks = this.create(afterLoadTextureOfEntityHookTypes);
      this.isLoadTextureOfEntityModded = this.beforeLoadTextureOfEntityHooks != null || this.overrideLoadTextureOfEntityHooks != null || this.afterLoadTextureOfEntityHooks != null;
      this.beforePassSpecialRenderHooks = this.create(beforePassSpecialRenderHookTypes);
      this.overridePassSpecialRenderHooks = this.create(overridePassSpecialRenderHookTypes);
      this.afterPassSpecialRenderHooks = this.create(afterPassSpecialRenderHookTypes);
      this.isPassSpecialRenderModded = this.beforePassSpecialRenderHooks != null || this.overridePassSpecialRenderHooks != null || this.afterPassSpecialRenderHooks != null;
      this.beforePerformStaticEntityRebuildHooks = this.create(beforePerformStaticEntityRebuildHookTypes);
      this.overridePerformStaticEntityRebuildHooks = this.create(overridePerformStaticEntityRebuildHookTypes);
      this.afterPerformStaticEntityRebuildHooks = this.create(afterPerformStaticEntityRebuildHookTypes);
      this.isPerformStaticEntityRebuildModded = this.beforePerformStaticEntityRebuildHooks != null || this.overridePerformStaticEntityRebuildHooks != null || this.afterPerformStaticEntityRebuildHooks != null;
      this.beforeRenderArrowsStuckInEntityHooks = this.create(beforeRenderArrowsStuckInEntityHookTypes);
      this.overrideRenderArrowsStuckInEntityHooks = this.create(overrideRenderArrowsStuckInEntityHookTypes);
      this.afterRenderArrowsStuckInEntityHooks = this.create(afterRenderArrowsStuckInEntityHookTypes);
      this.isRenderArrowsStuckInEntityModded = this.beforeRenderArrowsStuckInEntityHooks != null || this.overrideRenderArrowsStuckInEntityHooks != null || this.afterRenderArrowsStuckInEntityHooks != null;
      this.beforeRenderFirstPersonArmHooks = this.create(beforeRenderFirstPersonArmHookTypes);
      this.overrideRenderFirstPersonArmHooks = this.create(overrideRenderFirstPersonArmHookTypes);
      this.afterRenderFirstPersonArmHooks = this.create(afterRenderFirstPersonArmHookTypes);
      this.isRenderFirstPersonArmModded = this.beforeRenderFirstPersonArmHooks != null || this.overrideRenderFirstPersonArmHooks != null || this.afterRenderFirstPersonArmHooks != null;
      this.beforeRenderLivingLabelHooks = this.create(beforeRenderLivingLabelHookTypes);
      this.overrideRenderLivingLabelHooks = this.create(overrideRenderLivingLabelHookTypes);
      this.afterRenderLivingLabelHooks = this.create(afterRenderLivingLabelHookTypes);
      this.isRenderLivingLabelModded = this.beforeRenderLivingLabelHooks != null || this.overrideRenderLivingLabelHooks != null || this.afterRenderLivingLabelHooks != null;
      this.beforeRenderModelHooks = this.create(beforeRenderModelHookTypes);
      this.overrideRenderModelHooks = this.create(overrideRenderModelHookTypes);
      this.afterRenderModelHooks = this.create(afterRenderModelHookTypes);
      this.isRenderModelModded = this.beforeRenderModelHooks != null || this.overrideRenderModelHooks != null || this.afterRenderModelHooks != null;
      this.beforeRenderPlayerHooks = this.create(beforeRenderPlayerHookTypes);
      this.overrideRenderPlayerHooks = this.create(overrideRenderPlayerHookTypes);
      this.afterRenderPlayerHooks = this.create(afterRenderPlayerHookTypes);
      this.isRenderPlayerModded = this.beforeRenderPlayerHooks != null || this.overrideRenderPlayerHooks != null || this.afterRenderPlayerHooks != null;
      this.beforeRenderPlayerNameAndScoreLabelHooks = this.create(beforeRenderPlayerNameAndScoreLabelHookTypes);
      this.overrideRenderPlayerNameAndScoreLabelHooks = this.create(overrideRenderPlayerNameAndScoreLabelHookTypes);
      this.afterRenderPlayerNameAndScoreLabelHooks = this.create(afterRenderPlayerNameAndScoreLabelHookTypes);
      this.isRenderPlayerNameAndScoreLabelModded = this.beforeRenderPlayerNameAndScoreLabelHooks != null || this.overrideRenderPlayerNameAndScoreLabelHooks != null || this.afterRenderPlayerNameAndScoreLabelHooks != null;
      this.beforeRenderPlayerScaleHooks = this.create(beforeRenderPlayerScaleHookTypes);
      this.overrideRenderPlayerScaleHooks = this.create(overrideRenderPlayerScaleHookTypes);
      this.afterRenderPlayerScaleHooks = this.create(afterRenderPlayerScaleHookTypes);
      this.isRenderPlayerScaleModded = this.beforeRenderPlayerScaleHooks != null || this.overrideRenderPlayerScaleHooks != null || this.afterRenderPlayerScaleHooks != null;
      this.beforeRenderPlayerSleepHooks = this.create(beforeRenderPlayerSleepHookTypes);
      this.overrideRenderPlayerSleepHooks = this.create(overrideRenderPlayerSleepHookTypes);
      this.afterRenderPlayerSleepHooks = this.create(afterRenderPlayerSleepHookTypes);
      this.isRenderPlayerSleepModded = this.beforeRenderPlayerSleepHooks != null || this.overrideRenderPlayerSleepHooks != null || this.afterRenderPlayerSleepHooks != null;
      this.beforeRenderSpecialsHooks = this.create(beforeRenderSpecialsHookTypes);
      this.overrideRenderSpecialsHooks = this.create(overrideRenderSpecialsHookTypes);
      this.afterRenderSpecialsHooks = this.create(afterRenderSpecialsHookTypes);
      this.isRenderSpecialsModded = this.beforeRenderSpecialsHooks != null || this.overrideRenderSpecialsHooks != null || this.afterRenderSpecialsHooks != null;
      this.beforeRenderSwingProgressHooks = this.create(beforeRenderSwingProgressHookTypes);
      this.overrideRenderSwingProgressHooks = this.create(overrideRenderSwingProgressHookTypes);
      this.afterRenderSwingProgressHooks = this.create(afterRenderSwingProgressHookTypes);
      this.isRenderSwingProgressModded = this.beforeRenderSwingProgressHooks != null || this.overrideRenderSwingProgressHooks != null || this.afterRenderSwingProgressHooks != null;
      this.beforeRotatePlayerHooks = this.create(beforeRotatePlayerHookTypes);
      this.overrideRotatePlayerHooks = this.create(overrideRotatePlayerHookTypes);
      this.afterRotatePlayerHooks = this.create(afterRotatePlayerHookTypes);
      this.isRotatePlayerModded = this.beforeRotatePlayerHooks != null || this.overrideRotatePlayerHooks != null || this.afterRotatePlayerHooks != null;
      this.beforeSetArmorModelHooks = this.create(beforeSetArmorModelHookTypes);
      this.overrideSetArmorModelHooks = this.create(overrideSetArmorModelHookTypes);
      this.afterSetArmorModelHooks = this.create(afterSetArmorModelHookTypes);
      this.isSetArmorModelModded = this.beforeSetArmorModelHooks != null || this.overrideSetArmorModelHooks != null || this.afterSetArmorModelHooks != null;
      this.beforeSetPassArmorModelHooks = this.create(beforeSetPassArmorModelHookTypes);
      this.overrideSetPassArmorModelHooks = this.create(overrideSetPassArmorModelHookTypes);
      this.afterSetPassArmorModelHooks = this.create(afterSetPassArmorModelHookTypes);
      this.isSetPassArmorModelModded = this.beforeSetPassArmorModelHooks != null || this.overrideSetPassArmorModelHooks != null || this.afterSetPassArmorModelHooks != null;
      this.beforeSetRenderManagerHooks = this.create(beforeSetRenderManagerHookTypes);
      this.overrideSetRenderManagerHooks = this.create(overrideSetRenderManagerHookTypes);
      this.afterSetRenderManagerHooks = this.create(afterSetRenderManagerHookTypes);
      this.isSetRenderManagerModded = this.beforeSetRenderManagerHooks != null || this.overrideSetRenderManagerHooks != null || this.afterSetRenderManagerHooks != null;
      this.beforeSetRenderPassModelHooks = this.create(beforeSetRenderPassModelHookTypes);
      this.overrideSetRenderPassModelHooks = this.create(overrideSetRenderPassModelHookTypes);
      this.afterSetRenderPassModelHooks = this.create(afterSetRenderPassModelHookTypes);
      this.isSetRenderPassModelModded = this.beforeSetRenderPassModelHooks != null || this.overrideSetRenderPassModelHooks != null || this.afterSetRenderPassModelHooks != null;
      this.beforeUpdateIconsHooks = this.create(beforeUpdateIconsHookTypes);
      this.overrideUpdateIconsHooks = this.create(overrideUpdateIconsHookTypes);
      this.afterUpdateIconsHooks = this.create(afterUpdateIconsHookTypes);
      this.isUpdateIconsModded = this.beforeUpdateIconsHooks != null || this.overrideUpdateIconsHooks != null || this.afterUpdateIconsHooks != null;
   }

   private void attachRenderPlayerBase(String id) {
      RenderPlayerBase toAttach = this.createRenderPlayerBase(id);
      toAttach.beforeBaseAttach(true);
      this.allBaseObjects.put(id, toAttach);
      this.updateRenderPlayerBases();
      toAttach.afterBaseAttach(true);
   }

   private void detachRenderPlayerBase(String id) {
      RenderPlayerBase toDetach = (RenderPlayerBase)this.allBaseObjects.get(id);
      toDetach.beforeBaseDetach(true);
      this.allBaseObjects.remove(id);
      this.updateRenderPlayerBases();
      toDetach.afterBaseDetach(true);
   }

   private RenderPlayerBase[] create(List types) {
      if (types.isEmpty()) {
         return null;
      } else {
         RenderPlayerBase[] result = new RenderPlayerBase[types.size()];

         for(int i = 0; i < result.length; ++i) {
            result[i] = this.getRenderPlayerBase((String)types.get(i));
         }

         return result;
      }
   }

   private void beforeLocalConstructing() {
      if (this.beforeLocalConstructingHooks != null) {
         for(int i = this.beforeLocalConstructingHooks.length - 1; i >= 0; --i) {
            this.beforeLocalConstructingHooks[i].beforeLocalConstructing();
         }
      }

      this.beforeLocalConstructingHooks = null;
   }

   private void afterLocalConstructing() {
      if (this.afterLocalConstructingHooks != null) {
         for(int i = 0; i < this.afterLocalConstructingHooks.length; ++i) {
            this.afterLocalConstructingHooks[i].afterLocalConstructing();
         }
      }

      this.afterLocalConstructingHooks = null;
   }

   public RenderPlayerBase getRenderPlayerBase(String id) {
      return (RenderPlayerBase)this.allBaseObjects.get(id);
   }

   public Set getRenderPlayerBaseIds() {
      return this.unmodifiableAllBaseIds;
   }

   public Object dynamic(String key, Object[] parameters) {
      key = key.replace('.', '_').replace(' ', '_');
      this.executeAll(key, parameters, beforeDynamicHookTypes, beforeDynamicHookMethods, true);
      Object result = this.dynamicOverwritten(key, parameters, (RenderPlayerBase)null);
      this.executeAll(key, parameters, afterDynamicHookTypes, afterDynamicHookMethods, false);
      return result;
   }

   public Object dynamicOverwritten(String key, Object[] parameters, RenderPlayerBase overwriter) {
      List overrideIds = (List)overrideDynamicHookTypes.get(key);
      String id = null;
      if (overrideIds != null) {
         if (overwriter != null) {
            id = (String)this.baseObjectsToId.get(overwriter);
            int index = overrideIds.indexOf(id);
            if (index > 0) {
               id = (String)overrideIds.get(index - 1);
            } else {
               id = null;
            }
         } else if (overrideIds.size() > 0) {
            id = (String)overrideIds.get(overrideIds.size() - 1);
         }
      }

      Map methodMap;
      if (id == null) {
         id = (String)keysToVirtualIds.get(key);
         if (id == null) {
            return null;
         }

         methodMap = virtualDynamicHookMethods;
      } else {
         methodMap = overrideDynamicHookMethods;
      }

      Map methods = (Map)methodMap.get(((Constructor)allBaseConstructors.get(id)).getDeclaringClass());
      if (methods == null) {
         return null;
      } else {
         Method method = (Method)methods.get(key);
         return methods == null ? null : this.execute(this.getRenderPlayerBase(id), method, parameters);
      }
   }

   private void executeAll(String key, Object[] parameters, Map dynamicHookTypes, Map dynamicHookMethods, boolean reverse) {
      List beforeIds = (List)dynamicHookTypes.get(key);
      if (beforeIds != null) {
         int i = reverse ? beforeIds.size() - 1 : 0;

         while(true) {
            if (reverse) {
               if (i < 0) {
                  break;
               }
            } else if (i >= beforeIds.size()) {
               break;
            }

            String id = (String)beforeIds.get(i);
            RenderPlayerBase base = this.getRenderPlayerBase(id);
            Class type = base.getClass();
            Map methods = (Map)dynamicHookMethods.get(type);
            if (methods != null) {
               Method method = (Method)methods.get(key);
               if (method != null) {
                  this.execute(base, method, parameters);
               }
            }

            i += reverse ? -1 : 1;
         }

      }
   }

   private Object execute(RenderPlayerBase base, Method method, Object[] parameters) {
      try {
         return method.invoke(base, parameters);
      } catch (Exception var5) {
         throw new RuntimeException("Exception while invoking dynamic method", var5);
      }
   }

   public static boolean doRenderLabel(IRenderPlayerAPI target, EntityLivingBase paramEntityLivingBase) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      boolean _result;
      if (renderPlayerAPI != null && renderPlayerAPI.isDoRenderLabelModded) {
         _result = renderPlayerAPI.doRenderLabel(paramEntityLivingBase);
      } else {
         _result = target.localDoRenderLabel(paramEntityLivingBase);
      }

      return _result;
   }

   private boolean doRenderLabel(EntityLivingBase paramEntityLivingBase) {
      if (this.beforeDoRenderLabelHooks != null) {
         for(int i = this.beforeDoRenderLabelHooks.length - 1; i >= 0; --i) {
            this.beforeDoRenderLabelHooks[i].beforeDoRenderLabel(paramEntityLivingBase);
         }
      }

      boolean _result;
      if (this.overrideDoRenderLabelHooks != null) {
         _result = this.overrideDoRenderLabelHooks[this.overrideDoRenderLabelHooks.length - 1].doRenderLabel(paramEntityLivingBase);
      } else {
         _result = this.renderPlayer.localDoRenderLabel(paramEntityLivingBase);
      }

      if (this.afterDoRenderLabelHooks != null) {
         for(int i = 0; i < this.afterDoRenderLabelHooks.length; ++i) {
            this.afterDoRenderLabelHooks[i].afterDoRenderLabel(paramEntityLivingBase);
         }
      }

      return _result;
   }

   protected RenderPlayerBase GetOverwrittenDoRenderLabel(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideDoRenderLabelHooks.length; ++i) {
         if (this.overrideDoRenderLabelHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideDoRenderLabelHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void doRenderShadowAndFire(IRenderPlayerAPI target, Entity paramEntity, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isDoRenderShadowAndFireModded) {
         renderPlayerAPI.doRenderShadowAndFire(paramEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
      } else {
         target.localDoRenderShadowAndFire(paramEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
      }

   }

   private void doRenderShadowAndFire(Entity paramEntity, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
      int i;
      if (this.beforeDoRenderShadowAndFireHooks != null) {
         for(i = this.beforeDoRenderShadowAndFireHooks.length - 1; i >= 0; --i) {
            this.beforeDoRenderShadowAndFireHooks[i].beforeDoRenderShadowAndFire(paramEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
         }
      }

      if (this.overrideDoRenderShadowAndFireHooks != null) {
         this.overrideDoRenderShadowAndFireHooks[this.overrideDoRenderShadowAndFireHooks.length - 1].doRenderShadowAndFire(paramEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
      } else {
         this.renderPlayer.localDoRenderShadowAndFire(paramEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
      }

      if (this.afterDoRenderShadowAndFireHooks != null) {
         for(i = 0; i < this.afterDoRenderShadowAndFireHooks.length; ++i) {
            this.afterDoRenderShadowAndFireHooks[i].afterDoRenderShadowAndFire(paramEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenDoRenderShadowAndFire(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideDoRenderShadowAndFireHooks.length; ++i) {
         if (this.overrideDoRenderShadowAndFireHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideDoRenderShadowAndFireHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static int getColorMultiplier(IRenderPlayerAPI target, EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      int _result;
      if (renderPlayerAPI != null && renderPlayerAPI.isGetColorMultiplierModded) {
         _result = renderPlayerAPI.getColorMultiplier(paramEntityLivingBase, paramFloat1, paramFloat2);
      } else {
         _result = target.localGetColorMultiplier(paramEntityLivingBase, paramFloat1, paramFloat2);
      }

      return _result;
   }

   private int getColorMultiplier(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2) {
      int _result;
      if (this.beforeGetColorMultiplierHooks != null) {
         for(_result = this.beforeGetColorMultiplierHooks.length - 1; _result >= 0; --_result) {
            this.beforeGetColorMultiplierHooks[_result].beforeGetColorMultiplier(paramEntityLivingBase, paramFloat1, paramFloat2);
         }
      }

      if (this.overrideGetColorMultiplierHooks != null) {
         _result = this.overrideGetColorMultiplierHooks[this.overrideGetColorMultiplierHooks.length - 1].getColorMultiplier(paramEntityLivingBase, paramFloat1, paramFloat2);
      } else {
         _result = this.renderPlayer.localGetColorMultiplier(paramEntityLivingBase, paramFloat1, paramFloat2);
      }

      if (this.afterGetColorMultiplierHooks != null) {
         for(int i = 0; i < this.afterGetColorMultiplierHooks.length; ++i) {
            this.afterGetColorMultiplierHooks[i].afterGetColorMultiplier(paramEntityLivingBase, paramFloat1, paramFloat2);
         }
      }

      return _result;
   }

   protected RenderPlayerBase GetOverwrittenGetColorMultiplier(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideGetColorMultiplierHooks.length; ++i) {
         if (this.overrideGetColorMultiplierHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideGetColorMultiplierHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static float getDeathMaxRotation(IRenderPlayerAPI target, EntityLivingBase paramEntityLivingBase) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      float _result;
      if (renderPlayerAPI != null && renderPlayerAPI.isGetDeathMaxRotationModded) {
         _result = renderPlayerAPI.getDeathMaxRotation(paramEntityLivingBase);
      } else {
         _result = target.localGetDeathMaxRotation(paramEntityLivingBase);
      }

      return _result;
   }

   private float getDeathMaxRotation(EntityLivingBase paramEntityLivingBase) {
      if (this.beforeGetDeathMaxRotationHooks != null) {
         for(int i = this.beforeGetDeathMaxRotationHooks.length - 1; i >= 0; --i) {
            this.beforeGetDeathMaxRotationHooks[i].beforeGetDeathMaxRotation(paramEntityLivingBase);
         }
      }

      float _result;
      if (this.overrideGetDeathMaxRotationHooks != null) {
         _result = this.overrideGetDeathMaxRotationHooks[this.overrideGetDeathMaxRotationHooks.length - 1].getDeathMaxRotation(paramEntityLivingBase);
      } else {
         _result = this.renderPlayer.localGetDeathMaxRotation(paramEntityLivingBase);
      }

      if (this.afterGetDeathMaxRotationHooks != null) {
         for(int i = 0; i < this.afterGetDeathMaxRotationHooks.length; ++i) {
            this.afterGetDeathMaxRotationHooks[i].afterGetDeathMaxRotation(paramEntityLivingBase);
         }
      }

      return _result;
   }

   protected RenderPlayerBase GetOverwrittenGetDeathMaxRotation(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideGetDeathMaxRotationHooks.length; ++i) {
         if (this.overrideGetDeathMaxRotationHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideGetDeathMaxRotationHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static FontRenderer getFontRendererFromRenderManager(IRenderPlayerAPI target) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      FontRenderer _result;
      if (renderPlayerAPI != null && renderPlayerAPI.isGetFontRendererFromRenderManagerModded) {
         _result = renderPlayerAPI.getFontRendererFromRenderManager();
      } else {
         _result = target.localGetFontRendererFromRenderManager();
      }

      return _result;
   }

   private FontRenderer getFontRendererFromRenderManager() {
      if (this.beforeGetFontRendererFromRenderManagerHooks != null) {
         for(int i = this.beforeGetFontRendererFromRenderManagerHooks.length - 1; i >= 0; --i) {
            this.beforeGetFontRendererFromRenderManagerHooks[i].beforeGetFontRendererFromRenderManager();
         }
      }

      FontRenderer _result;
      if (this.overrideGetFontRendererFromRenderManagerHooks != null) {
         _result = this.overrideGetFontRendererFromRenderManagerHooks[this.overrideGetFontRendererFromRenderManagerHooks.length - 1].getFontRendererFromRenderManager();
      } else {
         _result = this.renderPlayer.localGetFontRendererFromRenderManager();
      }

      if (this.afterGetFontRendererFromRenderManagerHooks != null) {
         for(int i = 0; i < this.afterGetFontRendererFromRenderManagerHooks.length; ++i) {
            this.afterGetFontRendererFromRenderManagerHooks[i].afterGetFontRendererFromRenderManager();
         }
      }

      return _result;
   }

   protected RenderPlayerBase GetOverwrittenGetFontRendererFromRenderManager(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideGetFontRendererFromRenderManagerHooks.length; ++i) {
         if (this.overrideGetFontRendererFromRenderManagerHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideGetFontRendererFromRenderManagerHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static ResourceLocation getResourceLocationFromPlayer(IRenderPlayerAPI target, AbstractClientPlayer paramAbstractClientPlayer) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      ResourceLocation _result;
      if (renderPlayerAPI != null && renderPlayerAPI.isGetResourceLocationFromPlayerModded) {
         _result = renderPlayerAPI.getResourceLocationFromPlayer(paramAbstractClientPlayer);
      } else {
         _result = target.localGetResourceLocationFromPlayer(paramAbstractClientPlayer);
      }

      return _result;
   }

   private ResourceLocation getResourceLocationFromPlayer(AbstractClientPlayer paramAbstractClientPlayer) {
      if (this.beforeGetResourceLocationFromPlayerHooks != null) {
         for(int i = this.beforeGetResourceLocationFromPlayerHooks.length - 1; i >= 0; --i) {
            this.beforeGetResourceLocationFromPlayerHooks[i].beforeGetResourceLocationFromPlayer(paramAbstractClientPlayer);
         }
      }

      ResourceLocation _result;
      if (this.overrideGetResourceLocationFromPlayerHooks != null) {
         _result = this.overrideGetResourceLocationFromPlayerHooks[this.overrideGetResourceLocationFromPlayerHooks.length - 1].getResourceLocationFromPlayer(paramAbstractClientPlayer);
      } else {
         _result = this.renderPlayer.localGetResourceLocationFromPlayer(paramAbstractClientPlayer);
      }

      if (this.afterGetResourceLocationFromPlayerHooks != null) {
         for(int i = 0; i < this.afterGetResourceLocationFromPlayerHooks.length; ++i) {
            this.afterGetResourceLocationFromPlayerHooks[i].afterGetResourceLocationFromPlayer(paramAbstractClientPlayer);
         }
      }

      return _result;
   }

   protected RenderPlayerBase GetOverwrittenGetResourceLocationFromPlayer(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideGetResourceLocationFromPlayerHooks.length; ++i) {
         if (this.overrideGetResourceLocationFromPlayerHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideGetResourceLocationFromPlayerHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static float handleRotationFloat(IRenderPlayerAPI target, EntityLivingBase paramEntityLivingBase, float paramFloat) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      float _result;
      if (renderPlayerAPI != null && renderPlayerAPI.isHandleRotationFloatModded) {
         _result = renderPlayerAPI.handleRotationFloat(paramEntityLivingBase, paramFloat);
      } else {
         _result = target.localHandleRotationFloat(paramEntityLivingBase, paramFloat);
      }

      return _result;
   }

   private float handleRotationFloat(EntityLivingBase paramEntityLivingBase, float paramFloat) {
      if (this.beforeHandleRotationFloatHooks != null) {
         for(int i = this.beforeHandleRotationFloatHooks.length - 1; i >= 0; --i) {
            this.beforeHandleRotationFloatHooks[i].beforeHandleRotationFloat(paramEntityLivingBase, paramFloat);
         }
      }

      float _result;
      if (this.overrideHandleRotationFloatHooks != null) {
         _result = this.overrideHandleRotationFloatHooks[this.overrideHandleRotationFloatHooks.length - 1].handleRotationFloat(paramEntityLivingBase, paramFloat);
      } else {
         _result = this.renderPlayer.localHandleRotationFloat(paramEntityLivingBase, paramFloat);
      }

      if (this.afterHandleRotationFloatHooks != null) {
         for(int i = 0; i < this.afterHandleRotationFloatHooks.length; ++i) {
            this.afterHandleRotationFloatHooks[i].afterHandleRotationFloat(paramEntityLivingBase, paramFloat);
         }
      }

      return _result;
   }

   protected RenderPlayerBase GetOverwrittenHandleRotationFloat(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideHandleRotationFloatHooks.length; ++i) {
         if (this.overrideHandleRotationFloatHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideHandleRotationFloatHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static int inheritRenderPass(IRenderPlayerAPI target, EntityLivingBase paramEntityLivingBase, int paramInt, float paramFloat) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      int _result;
      if (renderPlayerAPI != null && renderPlayerAPI.isInheritRenderPassModded) {
         _result = renderPlayerAPI.inheritRenderPass(paramEntityLivingBase, paramInt, paramFloat);
      } else {
         _result = target.localInheritRenderPass(paramEntityLivingBase, paramInt, paramFloat);
      }

      return _result;
   }

   private int inheritRenderPass(EntityLivingBase paramEntityLivingBase, int paramInt, float paramFloat) {
      int _result;
      if (this.beforeInheritRenderPassHooks != null) {
         for(_result = this.beforeInheritRenderPassHooks.length - 1; _result >= 0; --_result) {
            this.beforeInheritRenderPassHooks[_result].beforeInheritRenderPass(paramEntityLivingBase, paramInt, paramFloat);
         }
      }

      if (this.overrideInheritRenderPassHooks != null) {
         _result = this.overrideInheritRenderPassHooks[this.overrideInheritRenderPassHooks.length - 1].inheritRenderPass(paramEntityLivingBase, paramInt, paramFloat);
      } else {
         _result = this.renderPlayer.localInheritRenderPass(paramEntityLivingBase, paramInt, paramFloat);
      }

      if (this.afterInheritRenderPassHooks != null) {
         for(int i = 0; i < this.afterInheritRenderPassHooks.length; ++i) {
            this.afterInheritRenderPassHooks[i].afterInheritRenderPass(paramEntityLivingBase, paramInt, paramFloat);
         }
      }

      return _result;
   }

   protected RenderPlayerBase GetOverwrittenInheritRenderPass(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideInheritRenderPassHooks.length; ++i) {
         if (this.overrideInheritRenderPassHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideInheritRenderPassHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void loadTexture(IRenderPlayerAPI target, ResourceLocation paramResourceLocation) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isLoadTextureModded) {
         renderPlayerAPI.loadTexture(paramResourceLocation);
      } else {
         target.localLoadTexture(paramResourceLocation);
      }

   }

   private void loadTexture(ResourceLocation paramResourceLocation) {
      int i;
      if (this.beforeLoadTextureHooks != null) {
         for(i = this.beforeLoadTextureHooks.length - 1; i >= 0; --i) {
            this.beforeLoadTextureHooks[i].beforeLoadTexture(paramResourceLocation);
         }
      }

      if (this.overrideLoadTextureHooks != null) {
         this.overrideLoadTextureHooks[this.overrideLoadTextureHooks.length - 1].loadTexture(paramResourceLocation);
      } else {
         this.renderPlayer.localLoadTexture(paramResourceLocation);
      }

      if (this.afterLoadTextureHooks != null) {
         for(i = 0; i < this.afterLoadTextureHooks.length; ++i) {
            this.afterLoadTextureHooks[i].afterLoadTexture(paramResourceLocation);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenLoadTexture(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideLoadTextureHooks.length; ++i) {
         if (this.overrideLoadTextureHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideLoadTextureHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void loadTextureOfEntity(IRenderPlayerAPI target, Entity paramEntity) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isLoadTextureOfEntityModded) {
         renderPlayerAPI.loadTextureOfEntity(paramEntity);
      } else {
         target.localLoadTextureOfEntity(paramEntity);
      }

   }

   private void loadTextureOfEntity(Entity paramEntity) {
      int i;
      if (this.beforeLoadTextureOfEntityHooks != null) {
         for(i = this.beforeLoadTextureOfEntityHooks.length - 1; i >= 0; --i) {
            this.beforeLoadTextureOfEntityHooks[i].beforeLoadTextureOfEntity(paramEntity);
         }
      }

      if (this.overrideLoadTextureOfEntityHooks != null) {
         this.overrideLoadTextureOfEntityHooks[this.overrideLoadTextureOfEntityHooks.length - 1].loadTextureOfEntity(paramEntity);
      } else {
         this.renderPlayer.localLoadTextureOfEntity(paramEntity);
      }

      if (this.afterLoadTextureOfEntityHooks != null) {
         for(i = 0; i < this.afterLoadTextureOfEntityHooks.length; ++i) {
            this.afterLoadTextureOfEntityHooks[i].afterLoadTextureOfEntity(paramEntity);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenLoadTextureOfEntity(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideLoadTextureOfEntityHooks.length; ++i) {
         if (this.overrideLoadTextureOfEntityHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideLoadTextureOfEntityHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void passSpecialRender(IRenderPlayerAPI target, EntityLivingBase paramEntityLivingBase, double paramDouble1, double paramDouble2, double paramDouble3) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isPassSpecialRenderModded) {
         renderPlayerAPI.passSpecialRender(paramEntityLivingBase, paramDouble1, paramDouble2, paramDouble3);
      } else {
         target.localPassSpecialRender(paramEntityLivingBase, paramDouble1, paramDouble2, paramDouble3);
      }

   }

   private void passSpecialRender(EntityLivingBase paramEntityLivingBase, double paramDouble1, double paramDouble2, double paramDouble3) {
      int i;
      if (this.beforePassSpecialRenderHooks != null) {
         for(i = this.beforePassSpecialRenderHooks.length - 1; i >= 0; --i) {
            this.beforePassSpecialRenderHooks[i].beforePassSpecialRender(paramEntityLivingBase, paramDouble1, paramDouble2, paramDouble3);
         }
      }

      if (this.overridePassSpecialRenderHooks != null) {
         this.overridePassSpecialRenderHooks[this.overridePassSpecialRenderHooks.length - 1].passSpecialRender(paramEntityLivingBase, paramDouble1, paramDouble2, paramDouble3);
      } else {
         this.renderPlayer.localPassSpecialRender(paramEntityLivingBase, paramDouble1, paramDouble2, paramDouble3);
      }

      if (this.afterPassSpecialRenderHooks != null) {
         for(i = 0; i < this.afterPassSpecialRenderHooks.length; ++i) {
            this.afterPassSpecialRenderHooks[i].afterPassSpecialRender(paramEntityLivingBase, paramDouble1, paramDouble2, paramDouble3);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenPassSpecialRender(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overridePassSpecialRenderHooks.length; ++i) {
         if (this.overridePassSpecialRenderHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overridePassSpecialRenderHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static boolean performStaticEntityRebuild(IRenderPlayerAPI target) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      boolean _result;
      if (renderPlayerAPI != null && renderPlayerAPI.isPerformStaticEntityRebuildModded) {
         _result = renderPlayerAPI.performStaticEntityRebuild();
      } else {
         _result = target.localPerformStaticEntityRebuild();
      }

      return _result;
   }

   private boolean performStaticEntityRebuild() {
      if (this.beforePerformStaticEntityRebuildHooks != null) {
         for(int i = this.beforePerformStaticEntityRebuildHooks.length - 1; i >= 0; --i) {
            this.beforePerformStaticEntityRebuildHooks[i].beforePerformStaticEntityRebuild();
         }
      }

      boolean _result;
      if (this.overridePerformStaticEntityRebuildHooks != null) {
         _result = this.overridePerformStaticEntityRebuildHooks[this.overridePerformStaticEntityRebuildHooks.length - 1].performStaticEntityRebuild();
      } else {
         _result = this.renderPlayer.localPerformStaticEntityRebuild();
      }

      if (this.afterPerformStaticEntityRebuildHooks != null) {
         for(int i = 0; i < this.afterPerformStaticEntityRebuildHooks.length; ++i) {
            this.afterPerformStaticEntityRebuildHooks[i].afterPerformStaticEntityRebuild();
         }
      }

      return _result;
   }

   protected RenderPlayerBase GetOverwrittenPerformStaticEntityRebuild(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overridePerformStaticEntityRebuildHooks.length; ++i) {
         if (this.overridePerformStaticEntityRebuildHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overridePerformStaticEntityRebuildHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void renderArrowsStuckInEntity(IRenderPlayerAPI target, EntityLivingBase paramEntityLivingBase, float paramFloat) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isRenderArrowsStuckInEntityModded) {
         renderPlayerAPI.renderArrowsStuckInEntity(paramEntityLivingBase, paramFloat);
      } else {
         target.localRenderArrowsStuckInEntity(paramEntityLivingBase, paramFloat);
      }

   }

   private void renderArrowsStuckInEntity(EntityLivingBase paramEntityLivingBase, float paramFloat) {
      int i;
      if (this.beforeRenderArrowsStuckInEntityHooks != null) {
         for(i = this.beforeRenderArrowsStuckInEntityHooks.length - 1; i >= 0; --i) {
            this.beforeRenderArrowsStuckInEntityHooks[i].beforeRenderArrowsStuckInEntity(paramEntityLivingBase, paramFloat);
         }
      }

      if (this.overrideRenderArrowsStuckInEntityHooks != null) {
         this.overrideRenderArrowsStuckInEntityHooks[this.overrideRenderArrowsStuckInEntityHooks.length - 1].renderArrowsStuckInEntity(paramEntityLivingBase, paramFloat);
      } else {
         this.renderPlayer.localRenderArrowsStuckInEntity(paramEntityLivingBase, paramFloat);
      }

      if (this.afterRenderArrowsStuckInEntityHooks != null) {
         for(i = 0; i < this.afterRenderArrowsStuckInEntityHooks.length; ++i) {
            this.afterRenderArrowsStuckInEntityHooks[i].afterRenderArrowsStuckInEntity(paramEntityLivingBase, paramFloat);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenRenderArrowsStuckInEntity(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideRenderArrowsStuckInEntityHooks.length; ++i) {
         if (this.overrideRenderArrowsStuckInEntityHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideRenderArrowsStuckInEntityHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void renderFirstPersonArm(IRenderPlayerAPI target, EntityPlayer paramEntityPlayer) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isRenderFirstPersonArmModded) {
         renderPlayerAPI.renderFirstPersonArm(paramEntityPlayer);
      } else {
         target.localRenderFirstPersonArm(paramEntityPlayer);
      }

   }

   private void renderFirstPersonArm(EntityPlayer paramEntityPlayer) {
      int i;
      if (this.beforeRenderFirstPersonArmHooks != null) {
         for(i = this.beforeRenderFirstPersonArmHooks.length - 1; i >= 0; --i) {
            this.beforeRenderFirstPersonArmHooks[i].beforeRenderFirstPersonArm(paramEntityPlayer);
         }
      }

      if (this.overrideRenderFirstPersonArmHooks != null) {
         this.overrideRenderFirstPersonArmHooks[this.overrideRenderFirstPersonArmHooks.length - 1].renderFirstPersonArm(paramEntityPlayer);
      } else {
         this.renderPlayer.localRenderFirstPersonArm(paramEntityPlayer);
      }

      if (this.afterRenderFirstPersonArmHooks != null) {
         for(i = 0; i < this.afterRenderFirstPersonArmHooks.length; ++i) {
            this.afterRenderFirstPersonArmHooks[i].afterRenderFirstPersonArm(paramEntityPlayer);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenRenderFirstPersonArm(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideRenderFirstPersonArmHooks.length; ++i) {
         if (this.overrideRenderFirstPersonArmHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideRenderFirstPersonArmHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void renderLivingLabel(IRenderPlayerAPI target, Entity paramEntity, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isRenderLivingLabelModded) {
         renderPlayerAPI.renderLivingLabel(paramEntity, paramString, paramDouble1, paramDouble2, paramDouble3, paramInt);
      } else {
         target.localRenderLivingLabel(paramEntity, paramString, paramDouble1, paramDouble2, paramDouble3, paramInt);
      }

   }

   private void renderLivingLabel(Entity paramEntity, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
      int i;
      if (this.beforeRenderLivingLabelHooks != null) {
         for(i = this.beforeRenderLivingLabelHooks.length - 1; i >= 0; --i) {
            this.beforeRenderLivingLabelHooks[i].beforeRenderLivingLabel(paramEntity, paramString, paramDouble1, paramDouble2, paramDouble3, paramInt);
         }
      }

      if (this.overrideRenderLivingLabelHooks != null) {
         this.overrideRenderLivingLabelHooks[this.overrideRenderLivingLabelHooks.length - 1].renderLivingLabel(paramEntity, paramString, paramDouble1, paramDouble2, paramDouble3, paramInt);
      } else {
         this.renderPlayer.localRenderLivingLabel(paramEntity, paramString, paramDouble1, paramDouble2, paramDouble3, paramInt);
      }

      if (this.afterRenderLivingLabelHooks != null) {
         for(i = 0; i < this.afterRenderLivingLabelHooks.length; ++i) {
            this.afterRenderLivingLabelHooks[i].afterRenderLivingLabel(paramEntity, paramString, paramDouble1, paramDouble2, paramDouble3, paramInt);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenRenderLivingLabel(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideRenderLivingLabelHooks.length; ++i) {
         if (this.overrideRenderLivingLabelHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideRenderLivingLabelHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void renderModel(IRenderPlayerAPI target, EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isRenderModelModded) {
         renderPlayerAPI.renderModel(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
      } else {
         target.localRenderModel(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
      }

   }

   private void renderModel(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
      int i;
      if (this.beforeRenderModelHooks != null) {
         for(i = this.beforeRenderModelHooks.length - 1; i >= 0; --i) {
            this.beforeRenderModelHooks[i].beforeRenderModel(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
         }
      }

      if (this.overrideRenderModelHooks != null) {
         this.overrideRenderModelHooks[this.overrideRenderModelHooks.length - 1].renderModel(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
      } else {
         this.renderPlayer.localRenderModel(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
      }

      if (this.afterRenderModelHooks != null) {
         for(i = 0; i < this.afterRenderModelHooks.length; ++i) {
            this.afterRenderModelHooks[i].afterRenderModel(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenRenderModel(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideRenderModelHooks.length; ++i) {
         if (this.overrideRenderModelHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideRenderModelHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void renderPlayer(IRenderPlayerAPI target, AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isRenderPlayerModded) {
         renderPlayerAPI.renderPlayer(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
      } else {
         target.localRenderPlayer(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
      }

   }

   private void renderPlayer(AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
      int i;
      if (this.beforeRenderPlayerHooks != null) {
         for(i = this.beforeRenderPlayerHooks.length - 1; i >= 0; --i) {
            this.beforeRenderPlayerHooks[i].beforeRenderPlayer(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
         }
      }

      if (this.overrideRenderPlayerHooks != null) {
         this.overrideRenderPlayerHooks[this.overrideRenderPlayerHooks.length - 1].renderPlayer(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
      } else {
         this.renderPlayer.localRenderPlayer(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
      }

      if (this.afterRenderPlayerHooks != null) {
         for(i = 0; i < this.afterRenderPlayerHooks.length; ++i) {
            this.afterRenderPlayerHooks[i].afterRenderPlayer(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenRenderPlayer(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideRenderPlayerHooks.length; ++i) {
         if (this.overrideRenderPlayerHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideRenderPlayerHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void renderPlayerNameAndScoreLabel(IRenderPlayerAPI target, AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat, double paramDouble4) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isRenderPlayerNameAndScoreLabelModded) {
         renderPlayerAPI.renderPlayerNameAndScoreLabel(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramString, paramFloat, paramDouble4);
      } else {
         target.localRenderPlayerNameAndScoreLabel(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramString, paramFloat, paramDouble4);
      }

   }

   private void renderPlayerNameAndScoreLabel(AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat, double paramDouble4) {
      int i;
      if (this.beforeRenderPlayerNameAndScoreLabelHooks != null) {
         for(i = this.beforeRenderPlayerNameAndScoreLabelHooks.length - 1; i >= 0; --i) {
            this.beforeRenderPlayerNameAndScoreLabelHooks[i].beforeRenderPlayerNameAndScoreLabel(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramString, paramFloat, paramDouble4);
         }
      }

      if (this.overrideRenderPlayerNameAndScoreLabelHooks != null) {
         this.overrideRenderPlayerNameAndScoreLabelHooks[this.overrideRenderPlayerNameAndScoreLabelHooks.length - 1].renderPlayerNameAndScoreLabel(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramString, paramFloat, paramDouble4);
      } else {
         this.renderPlayer.localRenderPlayerNameAndScoreLabel(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramString, paramFloat, paramDouble4);
      }

      if (this.afterRenderPlayerNameAndScoreLabelHooks != null) {
         for(i = 0; i < this.afterRenderPlayerNameAndScoreLabelHooks.length; ++i) {
            this.afterRenderPlayerNameAndScoreLabelHooks[i].afterRenderPlayerNameAndScoreLabel(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3, paramString, paramFloat, paramDouble4);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenRenderPlayerNameAndScoreLabel(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideRenderPlayerNameAndScoreLabelHooks.length; ++i) {
         if (this.overrideRenderPlayerNameAndScoreLabelHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideRenderPlayerNameAndScoreLabelHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void renderPlayerScale(IRenderPlayerAPI target, AbstractClientPlayer paramAbstractClientPlayer, float paramFloat) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isRenderPlayerScaleModded) {
         renderPlayerAPI.renderPlayerScale(paramAbstractClientPlayer, paramFloat);
      } else {
         target.localRenderPlayerScale(paramAbstractClientPlayer, paramFloat);
      }

   }

   private void renderPlayerScale(AbstractClientPlayer paramAbstractClientPlayer, float paramFloat) {
      int i;
      if (this.beforeRenderPlayerScaleHooks != null) {
         for(i = this.beforeRenderPlayerScaleHooks.length - 1; i >= 0; --i) {
            this.beforeRenderPlayerScaleHooks[i].beforeRenderPlayerScale(paramAbstractClientPlayer, paramFloat);
         }
      }

      if (this.overrideRenderPlayerScaleHooks != null) {
         this.overrideRenderPlayerScaleHooks[this.overrideRenderPlayerScaleHooks.length - 1].renderPlayerScale(paramAbstractClientPlayer, paramFloat);
      } else {
         this.renderPlayer.localRenderPlayerScale(paramAbstractClientPlayer, paramFloat);
      }

      if (this.afterRenderPlayerScaleHooks != null) {
         for(i = 0; i < this.afterRenderPlayerScaleHooks.length; ++i) {
            this.afterRenderPlayerScaleHooks[i].afterRenderPlayerScale(paramAbstractClientPlayer, paramFloat);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenRenderPlayerScale(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideRenderPlayerScaleHooks.length; ++i) {
         if (this.overrideRenderPlayerScaleHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideRenderPlayerScaleHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void renderPlayerSleep(IRenderPlayerAPI target, AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isRenderPlayerSleepModded) {
         renderPlayerAPI.renderPlayerSleep(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3);
      } else {
         target.localRenderPlayerSleep(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3);
      }

   }

   private void renderPlayerSleep(AbstractClientPlayer paramAbstractClientPlayer, double paramDouble1, double paramDouble2, double paramDouble3) {
      int i;
      if (this.beforeRenderPlayerSleepHooks != null) {
         for(i = this.beforeRenderPlayerSleepHooks.length - 1; i >= 0; --i) {
            this.beforeRenderPlayerSleepHooks[i].beforeRenderPlayerSleep(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3);
         }
      }

      if (this.overrideRenderPlayerSleepHooks != null) {
         this.overrideRenderPlayerSleepHooks[this.overrideRenderPlayerSleepHooks.length - 1].renderPlayerSleep(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3);
      } else {
         this.renderPlayer.localRenderPlayerSleep(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3);
      }

      if (this.afterRenderPlayerSleepHooks != null) {
         for(i = 0; i < this.afterRenderPlayerSleepHooks.length; ++i) {
            this.afterRenderPlayerSleepHooks[i].afterRenderPlayerSleep(paramAbstractClientPlayer, paramDouble1, paramDouble2, paramDouble3);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenRenderPlayerSleep(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideRenderPlayerSleepHooks.length; ++i) {
         if (this.overrideRenderPlayerSleepHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideRenderPlayerSleepHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void renderSpecials(IRenderPlayerAPI target, AbstractClientPlayer paramAbstractClientPlayer, float paramFloat) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isRenderSpecialsModded) {
         renderPlayerAPI.renderSpecials(paramAbstractClientPlayer, paramFloat);
      } else {
         target.localRenderSpecials(paramAbstractClientPlayer, paramFloat);
      }

   }

   private void renderSpecials(AbstractClientPlayer paramAbstractClientPlayer, float paramFloat) {
      int i;
      if (this.beforeRenderSpecialsHooks != null) {
         for(i = this.beforeRenderSpecialsHooks.length - 1; i >= 0; --i) {
            this.beforeRenderSpecialsHooks[i].beforeRenderSpecials(paramAbstractClientPlayer, paramFloat);
         }
      }

      if (this.overrideRenderSpecialsHooks != null) {
         this.overrideRenderSpecialsHooks[this.overrideRenderSpecialsHooks.length - 1].renderSpecials(paramAbstractClientPlayer, paramFloat);
      } else {
         this.renderPlayer.localRenderSpecials(paramAbstractClientPlayer, paramFloat);
      }

      if (this.afterRenderSpecialsHooks != null) {
         for(i = 0; i < this.afterRenderSpecialsHooks.length; ++i) {
            this.afterRenderSpecialsHooks[i].afterRenderSpecials(paramAbstractClientPlayer, paramFloat);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenRenderSpecials(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideRenderSpecialsHooks.length; ++i) {
         if (this.overrideRenderSpecialsHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideRenderSpecialsHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static float renderSwingProgress(IRenderPlayerAPI target, EntityLivingBase paramEntityLivingBase, float paramFloat) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      float _result;
      if (renderPlayerAPI != null && renderPlayerAPI.isRenderSwingProgressModded) {
         _result = renderPlayerAPI.renderSwingProgress(paramEntityLivingBase, paramFloat);
      } else {
         _result = target.localRenderSwingProgress(paramEntityLivingBase, paramFloat);
      }

      return _result;
   }

   private float renderSwingProgress(EntityLivingBase paramEntityLivingBase, float paramFloat) {
      if (this.beforeRenderSwingProgressHooks != null) {
         for(int i = this.beforeRenderSwingProgressHooks.length - 1; i >= 0; --i) {
            this.beforeRenderSwingProgressHooks[i].beforeRenderSwingProgress(paramEntityLivingBase, paramFloat);
         }
      }

      float _result;
      if (this.overrideRenderSwingProgressHooks != null) {
         _result = this.overrideRenderSwingProgressHooks[this.overrideRenderSwingProgressHooks.length - 1].renderSwingProgress(paramEntityLivingBase, paramFloat);
      } else {
         _result = this.renderPlayer.localRenderSwingProgress(paramEntityLivingBase, paramFloat);
      }

      if (this.afterRenderSwingProgressHooks != null) {
         for(int i = 0; i < this.afterRenderSwingProgressHooks.length; ++i) {
            this.afterRenderSwingProgressHooks[i].afterRenderSwingProgress(paramEntityLivingBase, paramFloat);
         }
      }

      return _result;
   }

   protected RenderPlayerBase GetOverwrittenRenderSwingProgress(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideRenderSwingProgressHooks.length; ++i) {
         if (this.overrideRenderSwingProgressHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideRenderSwingProgressHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void rotatePlayer(IRenderPlayerAPI target, AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2, float paramFloat3) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isRotatePlayerModded) {
         renderPlayerAPI.rotatePlayer(paramAbstractClientPlayer, paramFloat1, paramFloat2, paramFloat3);
      } else {
         target.localRotatePlayer(paramAbstractClientPlayer, paramFloat1, paramFloat2, paramFloat3);
      }

   }

   private void rotatePlayer(AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2, float paramFloat3) {
      int i;
      if (this.beforeRotatePlayerHooks != null) {
         for(i = this.beforeRotatePlayerHooks.length - 1; i >= 0; --i) {
            this.beforeRotatePlayerHooks[i].beforeRotatePlayer(paramAbstractClientPlayer, paramFloat1, paramFloat2, paramFloat3);
         }
      }

      if (this.overrideRotatePlayerHooks != null) {
         this.overrideRotatePlayerHooks[this.overrideRotatePlayerHooks.length - 1].rotatePlayer(paramAbstractClientPlayer, paramFloat1, paramFloat2, paramFloat3);
      } else {
         this.renderPlayer.localRotatePlayer(paramAbstractClientPlayer, paramFloat1, paramFloat2, paramFloat3);
      }

      if (this.afterRotatePlayerHooks != null) {
         for(i = 0; i < this.afterRotatePlayerHooks.length; ++i) {
            this.afterRotatePlayerHooks[i].afterRotatePlayer(paramAbstractClientPlayer, paramFloat1, paramFloat2, paramFloat3);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenRotatePlayer(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideRotatePlayerHooks.length; ++i) {
         if (this.overrideRotatePlayerHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideRotatePlayerHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static int setArmorModel(IRenderPlayerAPI target, AbstractClientPlayer paramAbstractClientPlayer, int paramInt, float paramFloat) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      int _result;
      if (renderPlayerAPI != null && renderPlayerAPI.isSetArmorModelModded) {
         _result = renderPlayerAPI.setArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
      } else {
         _result = target.localSetArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
      }

      return _result;
   }

   private int setArmorModel(AbstractClientPlayer paramAbstractClientPlayer, int paramInt, float paramFloat) {
      int _result;
      if (this.beforeSetArmorModelHooks != null) {
         for(_result = this.beforeSetArmorModelHooks.length - 1; _result >= 0; --_result) {
            this.beforeSetArmorModelHooks[_result].beforeSetArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
         }
      }

      if (this.overrideSetArmorModelHooks != null) {
         _result = this.overrideSetArmorModelHooks[this.overrideSetArmorModelHooks.length - 1].setArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
      } else {
         _result = this.renderPlayer.localSetArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
      }

      if (this.afterSetArmorModelHooks != null) {
         for(int i = 0; i < this.afterSetArmorModelHooks.length; ++i) {
            this.afterSetArmorModelHooks[i].afterSetArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
         }
      }

      return _result;
   }

   protected RenderPlayerBase GetOverwrittenSetArmorModel(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideSetArmorModelHooks.length; ++i) {
         if (this.overrideSetArmorModelHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideSetArmorModelHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void setPassArmorModel(IRenderPlayerAPI target, AbstractClientPlayer paramAbstractClientPlayer, int paramInt, float paramFloat) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isSetPassArmorModelModded) {
         renderPlayerAPI.setPassArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
      } else {
         target.localSetPassArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
      }

   }

   private void setPassArmorModel(AbstractClientPlayer paramAbstractClientPlayer, int paramInt, float paramFloat) {
      int i;
      if (this.beforeSetPassArmorModelHooks != null) {
         for(i = this.beforeSetPassArmorModelHooks.length - 1; i >= 0; --i) {
            this.beforeSetPassArmorModelHooks[i].beforeSetPassArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
         }
      }

      if (this.overrideSetPassArmorModelHooks != null) {
         this.overrideSetPassArmorModelHooks[this.overrideSetPassArmorModelHooks.length - 1].setPassArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
      } else {
         this.renderPlayer.localSetPassArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
      }

      if (this.afterSetPassArmorModelHooks != null) {
         for(i = 0; i < this.afterSetPassArmorModelHooks.length; ++i) {
            this.afterSetPassArmorModelHooks[i].afterSetPassArmorModel(paramAbstractClientPlayer, paramInt, paramFloat);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenSetPassArmorModel(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideSetPassArmorModelHooks.length; ++i) {
         if (this.overrideSetPassArmorModelHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideSetPassArmorModelHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void setRenderManager(IRenderPlayerAPI target, RenderManager paramRenderManager) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isSetRenderManagerModded) {
         renderPlayerAPI.setRenderManager(paramRenderManager);
      } else {
         target.localSetRenderManager(paramRenderManager);
      }

   }

   private void setRenderManager(RenderManager paramRenderManager) {
      int i;
      if (this.beforeSetRenderManagerHooks != null) {
         for(i = this.beforeSetRenderManagerHooks.length - 1; i >= 0; --i) {
            this.beforeSetRenderManagerHooks[i].beforeSetRenderManager(paramRenderManager);
         }
      }

      if (this.overrideSetRenderManagerHooks != null) {
         this.overrideSetRenderManagerHooks[this.overrideSetRenderManagerHooks.length - 1].setRenderManager(paramRenderManager);
      } else {
         this.renderPlayer.localSetRenderManager(paramRenderManager);
      }

      if (this.afterSetRenderManagerHooks != null) {
         for(i = 0; i < this.afterSetRenderManagerHooks.length; ++i) {
            this.afterSetRenderManagerHooks[i].afterSetRenderManager(paramRenderManager);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenSetRenderManager(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideSetRenderManagerHooks.length; ++i) {
         if (this.overrideSetRenderManagerHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideSetRenderManagerHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void setRenderPassModel(IRenderPlayerAPI target, ModelBase paramModelBase) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isSetRenderPassModelModded) {
         renderPlayerAPI.setRenderPassModel(paramModelBase);
      } else {
         target.localSetRenderPassModel(paramModelBase);
      }

   }

   private void setRenderPassModel(ModelBase paramModelBase) {
      int i;
      if (this.beforeSetRenderPassModelHooks != null) {
         for(i = this.beforeSetRenderPassModelHooks.length - 1; i >= 0; --i) {
            this.beforeSetRenderPassModelHooks[i].beforeSetRenderPassModel(paramModelBase);
         }
      }

      if (this.overrideSetRenderPassModelHooks != null) {
         this.overrideSetRenderPassModelHooks[this.overrideSetRenderPassModelHooks.length - 1].setRenderPassModel(paramModelBase);
      } else {
         this.renderPlayer.localSetRenderPassModel(paramModelBase);
      }

      if (this.afterSetRenderPassModelHooks != null) {
         for(i = 0; i < this.afterSetRenderPassModelHooks.length; ++i) {
            this.afterSetRenderPassModelHooks[i].afterSetRenderPassModel(paramModelBase);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenSetRenderPassModel(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideSetRenderPassModelHooks.length; ++i) {
         if (this.overrideSetRenderPassModelHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideSetRenderPassModelHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void updateIcons(IRenderPlayerAPI target, IIconRegister paramIIconRegister) {
      RenderPlayerAPI renderPlayerAPI = target.getRenderPlayerAPI();
      if (renderPlayerAPI != null && renderPlayerAPI.isUpdateIconsModded) {
         renderPlayerAPI.updateIcons(paramIIconRegister);
      } else {
         target.localUpdateIcons(paramIIconRegister);
      }

   }

   private void updateIcons(IIconRegister paramIIconRegister) {
      int i;
      if (this.beforeUpdateIconsHooks != null) {
         for(i = this.beforeUpdateIconsHooks.length - 1; i >= 0; --i) {
            this.beforeUpdateIconsHooks[i].beforeUpdateIcons(paramIIconRegister);
         }
      }

      if (this.overrideUpdateIconsHooks != null) {
         this.overrideUpdateIconsHooks[this.overrideUpdateIconsHooks.length - 1].updateIcons(paramIIconRegister);
      } else {
         this.renderPlayer.localUpdateIcons(paramIIconRegister);
      }

      if (this.afterUpdateIconsHooks != null) {
         for(i = 0; i < this.afterUpdateIconsHooks.length; ++i) {
            this.afterUpdateIconsHooks[i].afterUpdateIcons(paramIIconRegister);
         }
      }

   }

   protected RenderPlayerBase GetOverwrittenUpdateIcons(RenderPlayerBase overWriter) {
      for(int i = 0; i < this.overrideUpdateIconsHooks.length; ++i) {
         if (this.overrideUpdateIconsHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideUpdateIconsHooks[i - 1];
         }
      }

      return overWriter;
   }

   static {
      unmodifiableAllIds = Collections.unmodifiableSet(allBaseConstructors.keySet());
      allBaseBeforeLocalConstructingSuperiors = new Hashtable(0);
      allBaseBeforeLocalConstructingInferiors = new Hashtable(0);
      allBaseAfterLocalConstructingSuperiors = new Hashtable(0);
      allBaseAfterLocalConstructingInferiors = new Hashtable(0);
      allBaseBeforeDynamicSuperiors = new Hashtable(0);
      allBaseBeforeDynamicInferiors = new Hashtable(0);
      allBaseOverrideDynamicSuperiors = new Hashtable(0);
      allBaseOverrideDynamicInferiors = new Hashtable(0);
      allBaseAfterDynamicSuperiors = new Hashtable(0);
      allBaseAfterDynamicInferiors = new Hashtable(0);
      initialized = false;
   }
}
