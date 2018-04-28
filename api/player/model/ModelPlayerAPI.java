package api.player.model;

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
import java.util.Random;
import java.util.Set;
import java.util.logging.Logger;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.TextureOffset;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public final class ModelPlayerAPI {
   private static final Class[] Class = new Class[]{ModelPlayerAPI.class};
   private static final Class[] Classes = new Class[]{ModelPlayerAPI.class, String.class};
   private static boolean isCreated;
   private static final Logger logger = Logger.getLogger("ModelPlayerAPI");
   private static List allInstances = new ArrayList();
   private static final Map EmptySortMap = Collections.unmodifiableMap(new HashMap());
   private static final List beforeGetRandomModelBoxHookTypes = new LinkedList();
   private static final List overrideGetRandomModelBoxHookTypes = new LinkedList();
   private static final List afterGetRandomModelBoxHookTypes = new LinkedList();
   private ModelPlayerBase[] beforeGetRandomModelBoxHooks;
   private ModelPlayerBase[] overrideGetRandomModelBoxHooks;
   private ModelPlayerBase[] afterGetRandomModelBoxHooks;
   public boolean isGetRandomModelBoxModded;
   private static final Map allBaseBeforeGetRandomModelBoxSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeGetRandomModelBoxInferiors = new Hashtable(0);
   private static final Map allBaseOverrideGetRandomModelBoxSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideGetRandomModelBoxInferiors = new Hashtable(0);
   private static final Map allBaseAfterGetRandomModelBoxSuperiors = new Hashtable(0);
   private static final Map allBaseAfterGetRandomModelBoxInferiors = new Hashtable(0);
   private static final List beforeGetTextureOffsetHookTypes = new LinkedList();
   private static final List overrideGetTextureOffsetHookTypes = new LinkedList();
   private static final List afterGetTextureOffsetHookTypes = new LinkedList();
   private ModelPlayerBase[] beforeGetTextureOffsetHooks;
   private ModelPlayerBase[] overrideGetTextureOffsetHooks;
   private ModelPlayerBase[] afterGetTextureOffsetHooks;
   public boolean isGetTextureOffsetModded;
   private static final Map allBaseBeforeGetTextureOffsetSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeGetTextureOffsetInferiors = new Hashtable(0);
   private static final Map allBaseOverrideGetTextureOffsetSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideGetTextureOffsetInferiors = new Hashtable(0);
   private static final Map allBaseAfterGetTextureOffsetSuperiors = new Hashtable(0);
   private static final Map allBaseAfterGetTextureOffsetInferiors = new Hashtable(0);
   private static final List beforeRenderHookTypes = new LinkedList();
   private static final List overrideRenderHookTypes = new LinkedList();
   private static final List afterRenderHookTypes = new LinkedList();
   private ModelPlayerBase[] beforeRenderHooks;
   private ModelPlayerBase[] overrideRenderHooks;
   private ModelPlayerBase[] afterRenderHooks;
   public boolean isRenderModded;
   private static final Map allBaseBeforeRenderSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeRenderInferiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderInferiors = new Hashtable(0);
   private static final Map allBaseAfterRenderSuperiors = new Hashtable(0);
   private static final Map allBaseAfterRenderInferiors = new Hashtable(0);
   private static final List beforeRenderCloakHookTypes = new LinkedList();
   private static final List overrideRenderCloakHookTypes = new LinkedList();
   private static final List afterRenderCloakHookTypes = new LinkedList();
   private ModelPlayerBase[] beforeRenderCloakHooks;
   private ModelPlayerBase[] overrideRenderCloakHooks;
   private ModelPlayerBase[] afterRenderCloakHooks;
   public boolean isRenderCloakModded;
   private static final Map allBaseBeforeRenderCloakSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeRenderCloakInferiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderCloakSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderCloakInferiors = new Hashtable(0);
   private static final Map allBaseAfterRenderCloakSuperiors = new Hashtable(0);
   private static final Map allBaseAfterRenderCloakInferiors = new Hashtable(0);
   private static final List beforeRenderEarsHookTypes = new LinkedList();
   private static final List overrideRenderEarsHookTypes = new LinkedList();
   private static final List afterRenderEarsHookTypes = new LinkedList();
   private ModelPlayerBase[] beforeRenderEarsHooks;
   private ModelPlayerBase[] overrideRenderEarsHooks;
   private ModelPlayerBase[] afterRenderEarsHooks;
   public boolean isRenderEarsModded;
   private static final Map allBaseBeforeRenderEarsSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeRenderEarsInferiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderEarsSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideRenderEarsInferiors = new Hashtable(0);
   private static final Map allBaseAfterRenderEarsSuperiors = new Hashtable(0);
   private static final Map allBaseAfterRenderEarsInferiors = new Hashtable(0);
   private static final List beforeSetLivingAnimationsHookTypes = new LinkedList();
   private static final List overrideSetLivingAnimationsHookTypes = new LinkedList();
   private static final List afterSetLivingAnimationsHookTypes = new LinkedList();
   private ModelPlayerBase[] beforeSetLivingAnimationsHooks;
   private ModelPlayerBase[] overrideSetLivingAnimationsHooks;
   private ModelPlayerBase[] afterSetLivingAnimationsHooks;
   public boolean isSetLivingAnimationsModded;
   private static final Map allBaseBeforeSetLivingAnimationsSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeSetLivingAnimationsInferiors = new Hashtable(0);
   private static final Map allBaseOverrideSetLivingAnimationsSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideSetLivingAnimationsInferiors = new Hashtable(0);
   private static final Map allBaseAfterSetLivingAnimationsSuperiors = new Hashtable(0);
   private static final Map allBaseAfterSetLivingAnimationsInferiors = new Hashtable(0);
   private static final List beforeSetRotationAnglesHookTypes = new LinkedList();
   private static final List overrideSetRotationAnglesHookTypes = new LinkedList();
   private static final List afterSetRotationAnglesHookTypes = new LinkedList();
   private ModelPlayerBase[] beforeSetRotationAnglesHooks;
   private ModelPlayerBase[] overrideSetRotationAnglesHooks;
   private ModelPlayerBase[] afterSetRotationAnglesHooks;
   public boolean isSetRotationAnglesModded;
   private static final Map allBaseBeforeSetRotationAnglesSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeSetRotationAnglesInferiors = new Hashtable(0);
   private static final Map allBaseOverrideSetRotationAnglesSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideSetRotationAnglesInferiors = new Hashtable(0);
   private static final Map allBaseAfterSetRotationAnglesSuperiors = new Hashtable(0);
   private static final Map allBaseAfterSetRotationAnglesInferiors = new Hashtable(0);
   private static final List beforeSetTextureOffsetHookTypes = new LinkedList();
   private static final List overrideSetTextureOffsetHookTypes = new LinkedList();
   private static final List afterSetTextureOffsetHookTypes = new LinkedList();
   private ModelPlayerBase[] beforeSetTextureOffsetHooks;
   private ModelPlayerBase[] overrideSetTextureOffsetHooks;
   private ModelPlayerBase[] afterSetTextureOffsetHooks;
   public boolean isSetTextureOffsetModded;
   private static final Map allBaseBeforeSetTextureOffsetSuperiors = new Hashtable(0);
   private static final Map allBaseBeforeSetTextureOffsetInferiors = new Hashtable(0);
   private static final Map allBaseOverrideSetTextureOffsetSuperiors = new Hashtable(0);
   private static final Map allBaseOverrideSetTextureOffsetInferiors = new Hashtable(0);
   private static final Map allBaseAfterSetTextureOffsetSuperiors = new Hashtable(0);
   private static final Map allBaseAfterSetTextureOffsetInferiors = new Hashtable(0);
   protected final IModelPlayerAPI modelPlayer;
   private final float paramFloat;
   private final String type;
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
   private ModelPlayerBase[] beforeLocalConstructingHooks;
   private ModelPlayerBase[] afterLocalConstructingHooks;
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
      register((String)id, (Class)baseClass, (ModelPlayerBaseSorting)null);
   }

   public static void register(String id, Class baseClass, ModelPlayerBaseSorting baseSorting) {
      try {
         register(baseClass, id, baseSorting);
      } catch (RuntimeException var4) {
         if (id != null) {
            log("Model Player: failed to register id '" + id + "'");
         } else {
            log("Model Player: failed to register ModelPlayerBase");
         }

         throw var4;
      }
   }

   private static void register(Class baseClass, String id, ModelPlayerBaseSorting baseSorting) {
      if (!isCreated) {
         try {
            Method mandatory = ModelPlayer.class.getMethod("getModelPlayerBase", String.class);
            if (mandatory.getReturnType() != ModelPlayerBase.class) {
               throw new NoSuchMethodException(ModelPlayerBase.class.getName() + " " + ModelPlayer.class.getName() + ".getModelPlayerBase(" + String.class.getName() + ")");
            }
         } catch (NoSuchMethodException var16) {
            String[] errorMessageParts = new String[]{"========================================", "The API \"Model Player\" version 1.0 of the mod \"Render Player API core 1.0\" can not be created!", "----------------------------------------", "Mandatory member method \"{0} getModelPlayerBase({3})\" not found in class \"{1}\".", "There are three scenarios this can happen:", "* Minecraft Forge is missing a Render Player API core which Minecraft version matches its own.", "  Download and install the latest Render Player API core for the Minecraft version you were trying to run.", "* The code of the class \"{2}\" of Render Player API core has been modified beyond recognition by another Minecraft Forge coremod.", "  Try temporary deinstallation of other core mods to find the culprit and deinstall it permanently to fix this specific problem.", "* Render Player API core has not been installed correctly.", "  Deinstall Render Player API core and install it again following the installation instructions in the readme file.", "========================================"};
            String baseModelPlayerClassName = ModelPlayerBase.class.getName();
            String targetClassName = ModelPlayer.class.getName();
            String targetClassFileName = targetClassName.replace(".", File.separator);
            String stringClassName = String.class.getName();

            for(int i = 0; i < errorMessageParts.length; ++i) {
               errorMessageParts[i] = MessageFormat.format(errorMessageParts[i], baseModelPlayerClassName, targetClassName, targetClassFileName, stringClassName);
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

         log("Model Player 1.0 Created");
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
                  throw new IllegalArgumentException("Can not find necessary constructor with one argument of type '" + ModelPlayerAPI.class.getName() + "' and eventually a second argument of type 'String' in the class '" + baseClass.getName() + "'", var15);
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
               addSorting(id, allBaseBeforeGetRandomModelBoxSuperiors, baseSorting.getBeforeGetRandomModelBoxSuperiors());
               addSorting(id, allBaseBeforeGetRandomModelBoxInferiors, baseSorting.getBeforeGetRandomModelBoxInferiors());
               addSorting(id, allBaseOverrideGetRandomModelBoxSuperiors, baseSorting.getOverrideGetRandomModelBoxSuperiors());
               addSorting(id, allBaseOverrideGetRandomModelBoxInferiors, baseSorting.getOverrideGetRandomModelBoxInferiors());
               addSorting(id, allBaseAfterGetRandomModelBoxSuperiors, baseSorting.getAfterGetRandomModelBoxSuperiors());
               addSorting(id, allBaseAfterGetRandomModelBoxInferiors, baseSorting.getAfterGetRandomModelBoxInferiors());
               addSorting(id, allBaseBeforeGetTextureOffsetSuperiors, baseSorting.getBeforeGetTextureOffsetSuperiors());
               addSorting(id, allBaseBeforeGetTextureOffsetInferiors, baseSorting.getBeforeGetTextureOffsetInferiors());
               addSorting(id, allBaseOverrideGetTextureOffsetSuperiors, baseSorting.getOverrideGetTextureOffsetSuperiors());
               addSorting(id, allBaseOverrideGetTextureOffsetInferiors, baseSorting.getOverrideGetTextureOffsetInferiors());
               addSorting(id, allBaseAfterGetTextureOffsetSuperiors, baseSorting.getAfterGetTextureOffsetSuperiors());
               addSorting(id, allBaseAfterGetTextureOffsetInferiors, baseSorting.getAfterGetTextureOffsetInferiors());
               addSorting(id, allBaseBeforeRenderSuperiors, baseSorting.getBeforeRenderSuperiors());
               addSorting(id, allBaseBeforeRenderInferiors, baseSorting.getBeforeRenderInferiors());
               addSorting(id, allBaseOverrideRenderSuperiors, baseSorting.getOverrideRenderSuperiors());
               addSorting(id, allBaseOverrideRenderInferiors, baseSorting.getOverrideRenderInferiors());
               addSorting(id, allBaseAfterRenderSuperiors, baseSorting.getAfterRenderSuperiors());
               addSorting(id, allBaseAfterRenderInferiors, baseSorting.getAfterRenderInferiors());
               addSorting(id, allBaseBeforeRenderCloakSuperiors, baseSorting.getBeforeRenderCloakSuperiors());
               addSorting(id, allBaseBeforeRenderCloakInferiors, baseSorting.getBeforeRenderCloakInferiors());
               addSorting(id, allBaseOverrideRenderCloakSuperiors, baseSorting.getOverrideRenderCloakSuperiors());
               addSorting(id, allBaseOverrideRenderCloakInferiors, baseSorting.getOverrideRenderCloakInferiors());
               addSorting(id, allBaseAfterRenderCloakSuperiors, baseSorting.getAfterRenderCloakSuperiors());
               addSorting(id, allBaseAfterRenderCloakInferiors, baseSorting.getAfterRenderCloakInferiors());
               addSorting(id, allBaseBeforeRenderEarsSuperiors, baseSorting.getBeforeRenderEarsSuperiors());
               addSorting(id, allBaseBeforeRenderEarsInferiors, baseSorting.getBeforeRenderEarsInferiors());
               addSorting(id, allBaseOverrideRenderEarsSuperiors, baseSorting.getOverrideRenderEarsSuperiors());
               addSorting(id, allBaseOverrideRenderEarsInferiors, baseSorting.getOverrideRenderEarsInferiors());
               addSorting(id, allBaseAfterRenderEarsSuperiors, baseSorting.getAfterRenderEarsSuperiors());
               addSorting(id, allBaseAfterRenderEarsInferiors, baseSorting.getAfterRenderEarsInferiors());
               addSorting(id, allBaseBeforeSetLivingAnimationsSuperiors, baseSorting.getBeforeSetLivingAnimationsSuperiors());
               addSorting(id, allBaseBeforeSetLivingAnimationsInferiors, baseSorting.getBeforeSetLivingAnimationsInferiors());
               addSorting(id, allBaseOverrideSetLivingAnimationsSuperiors, baseSorting.getOverrideSetLivingAnimationsSuperiors());
               addSorting(id, allBaseOverrideSetLivingAnimationsInferiors, baseSorting.getOverrideSetLivingAnimationsInferiors());
               addSorting(id, allBaseAfterSetLivingAnimationsSuperiors, baseSorting.getAfterSetLivingAnimationsSuperiors());
               addSorting(id, allBaseAfterSetLivingAnimationsInferiors, baseSorting.getAfterSetLivingAnimationsInferiors());
               addSorting(id, allBaseBeforeSetRotationAnglesSuperiors, baseSorting.getBeforeSetRotationAnglesSuperiors());
               addSorting(id, allBaseBeforeSetRotationAnglesInferiors, baseSorting.getBeforeSetRotationAnglesInferiors());
               addSorting(id, allBaseOverrideSetRotationAnglesSuperiors, baseSorting.getOverrideSetRotationAnglesSuperiors());
               addSorting(id, allBaseOverrideSetRotationAnglesInferiors, baseSorting.getOverrideSetRotationAnglesInferiors());
               addSorting(id, allBaseAfterSetRotationAnglesSuperiors, baseSorting.getAfterSetRotationAnglesSuperiors());
               addSorting(id, allBaseAfterSetRotationAnglesInferiors, baseSorting.getAfterSetRotationAnglesInferiors());
               addSorting(id, allBaseBeforeSetTextureOffsetSuperiors, baseSorting.getBeforeSetTextureOffsetSuperiors());
               addSorting(id, allBaseBeforeSetTextureOffsetInferiors, baseSorting.getBeforeSetTextureOffsetInferiors());
               addSorting(id, allBaseOverrideSetTextureOffsetSuperiors, baseSorting.getOverrideSetTextureOffsetSuperiors());
               addSorting(id, allBaseOverrideSetTextureOffsetInferiors, baseSorting.getOverrideSetTextureOffsetInferiors());
               addSorting(id, allBaseAfterSetTextureOffsetSuperiors, baseSorting.getAfterSetTextureOffsetSuperiors());
               addSorting(id, allBaseAfterSetTextureOffsetInferiors, baseSorting.getAfterSetTextureOffsetInferiors());
            }

            addMethod(id, baseClass, beforeLocalConstructingHookTypes, "beforeLocalConstructing", Float.TYPE);
            addMethod(id, baseClass, afterLocalConstructingHookTypes, "afterLocalConstructing", Float.TYPE);
            addMethod(id, baseClass, beforeGetRandomModelBoxHookTypes, "beforeGetRandomModelBox", Random.class);
            addMethod(id, baseClass, overrideGetRandomModelBoxHookTypes, "getRandomModelBox", Random.class);
            addMethod(id, baseClass, afterGetRandomModelBoxHookTypes, "afterGetRandomModelBox", Random.class);
            addMethod(id, baseClass, beforeGetTextureOffsetHookTypes, "beforeGetTextureOffset", String.class);
            addMethod(id, baseClass, overrideGetTextureOffsetHookTypes, "getTextureOffset", String.class);
            addMethod(id, baseClass, afterGetTextureOffsetHookTypes, "afterGetTextureOffset", String.class);
            addMethod(id, baseClass, beforeRenderHookTypes, "beforeRender", Entity.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, overrideRenderHookTypes, "render", Entity.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, afterRenderHookTypes, "afterRender", Entity.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, beforeRenderCloakHookTypes, "beforeRenderCloak", Float.TYPE);
            addMethod(id, baseClass, overrideRenderCloakHookTypes, "renderCloak", Float.TYPE);
            addMethod(id, baseClass, afterRenderCloakHookTypes, "afterRenderCloak", Float.TYPE);
            addMethod(id, baseClass, beforeRenderEarsHookTypes, "beforeRenderEars", Float.TYPE);
            addMethod(id, baseClass, overrideRenderEarsHookTypes, "renderEars", Float.TYPE);
            addMethod(id, baseClass, afterRenderEarsHookTypes, "afterRenderEars", Float.TYPE);
            addMethod(id, baseClass, beforeSetLivingAnimationsHookTypes, "beforeSetLivingAnimations", EntityLivingBase.class, Float.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, overrideSetLivingAnimationsHookTypes, "setLivingAnimations", EntityLivingBase.class, Float.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, afterSetLivingAnimationsHookTypes, "afterSetLivingAnimations", EntityLivingBase.class, Float.TYPE, Float.TYPE, Float.TYPE);
            addMethod(id, baseClass, beforeSetRotationAnglesHookTypes, "beforeSetRotationAngles", Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Entity.class);
            addMethod(id, baseClass, overrideSetRotationAnglesHookTypes, "setRotationAngles", Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Entity.class);
            addMethod(id, baseClass, afterSetRotationAnglesHookTypes, "afterSetRotationAngles", Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Entity.class);
            addMethod(id, baseClass, beforeSetTextureOffsetHookTypes, "beforeSetTextureOffset", String.class, Integer.TYPE, Integer.TYPE);
            addMethod(id, baseClass, overrideSetTextureOffsetHookTypes, "setTextureOffset", String.class, Integer.TYPE, Integer.TYPE);
            addMethod(id, baseClass, afterSetTextureOffsetHookTypes, "afterSetTextureOffset", String.class, Integer.TYPE, Integer.TYPE);
            addDynamicMethods(id, baseClass);
            addDynamicKeys(id, baseClass, beforeDynamicHookMethods, beforeDynamicHookTypes);
            addDynamicKeys(id, baseClass, overrideDynamicHookMethods, overrideDynamicHookTypes);
            addDynamicKeys(id, baseClass, afterDynamicHookMethods, afterDynamicHookTypes);
            initialize();
            Iterator var19 = allInstances.iterator();

            while(var19.hasNext()) {
               IModelPlayerAPI instance = (IModelPlayerAPI)var19.next();
               instance.getModelPlayerAPI().attachModelPlayerBase(id);
            }

            System.out.println("Model Player: registered " + id);
            logger.fine("Model Player: registered class '" + baseClass.getName() + "' with id '" + id + "'");
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
               IModelPlayerAPI instance = (IModelPlayerAPI)iterator.next();
               instance.getModelPlayerAPI().detachModelPlayerBase(id);
            }

            beforeLocalConstructingHookTypes.remove(id);
            afterLocalConstructingHookTypes.remove(id);
            allBaseBeforeGetRandomModelBoxSuperiors.remove(id);
            allBaseBeforeGetRandomModelBoxInferiors.remove(id);
            allBaseOverrideGetRandomModelBoxSuperiors.remove(id);
            allBaseOverrideGetRandomModelBoxInferiors.remove(id);
            allBaseAfterGetRandomModelBoxSuperiors.remove(id);
            allBaseAfterGetRandomModelBoxInferiors.remove(id);
            beforeGetRandomModelBoxHookTypes.remove(id);
            overrideGetRandomModelBoxHookTypes.remove(id);
            afterGetRandomModelBoxHookTypes.remove(id);
            allBaseBeforeGetTextureOffsetSuperiors.remove(id);
            allBaseBeforeGetTextureOffsetInferiors.remove(id);
            allBaseOverrideGetTextureOffsetSuperiors.remove(id);
            allBaseOverrideGetTextureOffsetInferiors.remove(id);
            allBaseAfterGetTextureOffsetSuperiors.remove(id);
            allBaseAfterGetTextureOffsetInferiors.remove(id);
            beforeGetTextureOffsetHookTypes.remove(id);
            overrideGetTextureOffsetHookTypes.remove(id);
            afterGetTextureOffsetHookTypes.remove(id);
            allBaseBeforeRenderSuperiors.remove(id);
            allBaseBeforeRenderInferiors.remove(id);
            allBaseOverrideRenderSuperiors.remove(id);
            allBaseOverrideRenderInferiors.remove(id);
            allBaseAfterRenderSuperiors.remove(id);
            allBaseAfterRenderInferiors.remove(id);
            beforeRenderHookTypes.remove(id);
            overrideRenderHookTypes.remove(id);
            afterRenderHookTypes.remove(id);
            allBaseBeforeRenderCloakSuperiors.remove(id);
            allBaseBeforeRenderCloakInferiors.remove(id);
            allBaseOverrideRenderCloakSuperiors.remove(id);
            allBaseOverrideRenderCloakInferiors.remove(id);
            allBaseAfterRenderCloakSuperiors.remove(id);
            allBaseAfterRenderCloakInferiors.remove(id);
            beforeRenderCloakHookTypes.remove(id);
            overrideRenderCloakHookTypes.remove(id);
            afterRenderCloakHookTypes.remove(id);
            allBaseBeforeRenderEarsSuperiors.remove(id);
            allBaseBeforeRenderEarsInferiors.remove(id);
            allBaseOverrideRenderEarsSuperiors.remove(id);
            allBaseOverrideRenderEarsInferiors.remove(id);
            allBaseAfterRenderEarsSuperiors.remove(id);
            allBaseAfterRenderEarsInferiors.remove(id);
            beforeRenderEarsHookTypes.remove(id);
            overrideRenderEarsHookTypes.remove(id);
            afterRenderEarsHookTypes.remove(id);
            allBaseBeforeSetLivingAnimationsSuperiors.remove(id);
            allBaseBeforeSetLivingAnimationsInferiors.remove(id);
            allBaseOverrideSetLivingAnimationsSuperiors.remove(id);
            allBaseOverrideSetLivingAnimationsInferiors.remove(id);
            allBaseAfterSetLivingAnimationsSuperiors.remove(id);
            allBaseAfterSetLivingAnimationsInferiors.remove(id);
            beforeSetLivingAnimationsHookTypes.remove(id);
            overrideSetLivingAnimationsHookTypes.remove(id);
            afterSetLivingAnimationsHookTypes.remove(id);
            allBaseBeforeSetRotationAnglesSuperiors.remove(id);
            allBaseBeforeSetRotationAnglesInferiors.remove(id);
            allBaseOverrideSetRotationAnglesSuperiors.remove(id);
            allBaseOverrideSetRotationAnglesInferiors.remove(id);
            allBaseAfterSetRotationAnglesSuperiors.remove(id);
            allBaseAfterSetRotationAnglesInferiors.remove(id);
            beforeSetRotationAnglesHookTypes.remove(id);
            overrideSetRotationAnglesHookTypes.remove(id);
            afterSetRotationAnglesHookTypes.remove(id);
            allBaseBeforeSetTextureOffsetSuperiors.remove(id);
            allBaseBeforeSetTextureOffsetInferiors.remove(id);
            allBaseOverrideSetTextureOffsetSuperiors.remove(id);
            allBaseOverrideSetTextureOffsetInferiors.remove(id);
            allBaseAfterSetTextureOffsetSuperiors.remove(id);
            allBaseAfterSetTextureOffsetInferiors.remove(id);
            beforeSetTextureOffsetHookTypes.remove(id);
            overrideSetTextureOffsetHookTypes.remove(id);
            afterSetTextureOffsetHookTypes.remove(id);
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
            log("ModelPlayerAPI: unregistered id '" + id + "'");
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
         boolean isOverridden = method.getDeclaringClass() != ModelPlayerBase.class;
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

   public static ModelPlayerAPI create(IModelPlayerAPI modelPlayer, float paramFloat, String type) {
      if (allBaseConstructors.size() > 0 && !initialized) {
         initialize();
      }

      return new ModelPlayerAPI(modelPlayer, paramFloat, type);
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

      sortBases(beforeGetRandomModelBoxHookTypes, allBaseBeforeGetRandomModelBoxSuperiors, allBaseBeforeGetRandomModelBoxInferiors, "beforeGetRandomModelBox");
      sortBases(overrideGetRandomModelBoxHookTypes, allBaseOverrideGetRandomModelBoxSuperiors, allBaseOverrideGetRandomModelBoxInferiors, "overrideGetRandomModelBox");
      sortBases(afterGetRandomModelBoxHookTypes, allBaseAfterGetRandomModelBoxSuperiors, allBaseAfterGetRandomModelBoxInferiors, "afterGetRandomModelBox");
      sortBases(beforeGetTextureOffsetHookTypes, allBaseBeforeGetTextureOffsetSuperiors, allBaseBeforeGetTextureOffsetInferiors, "beforeGetTextureOffset");
      sortBases(overrideGetTextureOffsetHookTypes, allBaseOverrideGetTextureOffsetSuperiors, allBaseOverrideGetTextureOffsetInferiors, "overrideGetTextureOffset");
      sortBases(afterGetTextureOffsetHookTypes, allBaseAfterGetTextureOffsetSuperiors, allBaseAfterGetTextureOffsetInferiors, "afterGetTextureOffset");
      sortBases(beforeRenderHookTypes, allBaseBeforeRenderSuperiors, allBaseBeforeRenderInferiors, "beforeRender");
      sortBases(overrideRenderHookTypes, allBaseOverrideRenderSuperiors, allBaseOverrideRenderInferiors, "overrideRender");
      sortBases(afterRenderHookTypes, allBaseAfterRenderSuperiors, allBaseAfterRenderInferiors, "afterRender");
      sortBases(beforeRenderCloakHookTypes, allBaseBeforeRenderCloakSuperiors, allBaseBeforeRenderCloakInferiors, "beforeRenderCloak");
      sortBases(overrideRenderCloakHookTypes, allBaseOverrideRenderCloakSuperiors, allBaseOverrideRenderCloakInferiors, "overrideRenderCloak");
      sortBases(afterRenderCloakHookTypes, allBaseAfterRenderCloakSuperiors, allBaseAfterRenderCloakInferiors, "afterRenderCloak");
      sortBases(beforeRenderEarsHookTypes, allBaseBeforeRenderEarsSuperiors, allBaseBeforeRenderEarsInferiors, "beforeRenderEars");
      sortBases(overrideRenderEarsHookTypes, allBaseOverrideRenderEarsSuperiors, allBaseOverrideRenderEarsInferiors, "overrideRenderEars");
      sortBases(afterRenderEarsHookTypes, allBaseAfterRenderEarsSuperiors, allBaseAfterRenderEarsInferiors, "afterRenderEars");
      sortBases(beforeSetLivingAnimationsHookTypes, allBaseBeforeSetLivingAnimationsSuperiors, allBaseBeforeSetLivingAnimationsInferiors, "beforeSetLivingAnimations");
      sortBases(overrideSetLivingAnimationsHookTypes, allBaseOverrideSetLivingAnimationsSuperiors, allBaseOverrideSetLivingAnimationsInferiors, "overrideSetLivingAnimations");
      sortBases(afterSetLivingAnimationsHookTypes, allBaseAfterSetLivingAnimationsSuperiors, allBaseAfterSetLivingAnimationsInferiors, "afterSetLivingAnimations");
      sortBases(beforeSetRotationAnglesHookTypes, allBaseBeforeSetRotationAnglesSuperiors, allBaseBeforeSetRotationAnglesInferiors, "beforeSetRotationAngles");
      sortBases(overrideSetRotationAnglesHookTypes, allBaseOverrideSetRotationAnglesSuperiors, allBaseOverrideSetRotationAnglesInferiors, "overrideSetRotationAngles");
      sortBases(afterSetRotationAnglesHookTypes, allBaseAfterSetRotationAnglesSuperiors, allBaseAfterSetRotationAnglesInferiors, "afterSetRotationAngles");
      sortBases(beforeSetTextureOffsetHookTypes, allBaseBeforeSetTextureOffsetSuperiors, allBaseBeforeSetTextureOffsetInferiors, "beforeSetTextureOffset");
      sortBases(overrideSetTextureOffsetHookTypes, allBaseOverrideSetTextureOffsetSuperiors, allBaseOverrideSetTextureOffsetInferiors, "overrideSetTextureOffset");
      sortBases(afterSetTextureOffsetHookTypes, allBaseAfterSetTextureOffsetSuperiors, allBaseAfterSetTextureOffsetInferiors, "afterSetTextureOffset");
      initialized = true;
   }

   public static ModelPlayer[] getAllInstances() {
      return (ModelPlayer[])allInstances.toArray(new ModelPlayer[allInstances.size()]);
   }

   public static void beforeLocalConstructing(IModelPlayerAPI modelPlayer, float paramFloat) {
      ModelPlayerAPI modelPlayerAPI = modelPlayer.getModelPlayerAPI();
      if (modelPlayerAPI != null) {
         modelPlayerAPI.load();
      }

      allInstances.add(modelPlayer);
      if (modelPlayerAPI != null) {
         modelPlayerAPI.beforeLocalConstructing(paramFloat);
      }

   }

   public static void afterLocalConstructing(IModelPlayerAPI modelPlayer, float paramFloat) {
      ModelPlayerAPI modelPlayerAPI = modelPlayer.getModelPlayerAPI();
      if (modelPlayerAPI != null) {
         modelPlayerAPI.afterLocalConstructing(paramFloat);
      }

   }

   public static ModelPlayerBase getModelPlayerBase(IModelPlayerAPI modelPlayer, String baseId) {
      ModelPlayerAPI modelPlayerAPI = modelPlayer.getModelPlayerAPI();
      return modelPlayerAPI != null ? modelPlayerAPI.getModelPlayerBase(baseId) : null;
   }

   public static Set getModelPlayerBaseIds(IModelPlayerAPI modelPlayer) {
      ModelPlayerAPI modelPlayerAPI = modelPlayer.getModelPlayerAPI();
      Set result = null;
      if (modelPlayerAPI != null) {
         result = modelPlayerAPI.getModelPlayerBaseIds();
      } else {
         result = Collections.emptySet();
      }

      return result;
   }

   public static float getExpandParameter(IModelPlayerAPI modelPlayer) {
      ModelPlayerAPI modelPlayerAPI = modelPlayer.getModelPlayerAPI();
      return modelPlayerAPI != null ? modelPlayerAPI.paramFloat : 0.0F;
   }

   public static String getModelPlayerType(IModelPlayerAPI modelPlayer) {
      ModelPlayerAPI modelPlayerAPI = modelPlayer.getModelPlayerAPI();
      return modelPlayerAPI != null && modelPlayerAPI.type != null ? modelPlayerAPI.type : "other";
   }

   public static Object dynamic(IModelPlayerAPI modelPlayer, String key, Object[] parameters) {
      ModelPlayerAPI modelPlayerAPI = modelPlayer.getModelPlayerAPI();
      return modelPlayerAPI != null ? modelPlayerAPI.dynamic(key, parameters) : null;
   }

   private static void sortBases(List list, Map allBaseSuperiors, Map allBaseInferiors, String methodName) {
      (new ModelPlayerBaseSorter(list, allBaseSuperiors, allBaseInferiors, methodName)).Sort();
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

   private ModelPlayerAPI(IModelPlayerAPI modelPlayer, float paramFloat, String type) {
      this.unmodifiableAllBaseIds = Collections.unmodifiableSet(this.allBaseObjects.keySet());
      this.modelPlayer = modelPlayer;
      this.paramFloat = paramFloat;
      this.type = type;
   }

   private void load() {
      Iterator iterator = allBaseConstructors.keySet().iterator();

      while(iterator.hasNext()) {
         String id = (String)iterator.next();
         ModelPlayerBase toAttach = this.createModelPlayerBase(id);
         toAttach.beforeBaseAttach(false);
         this.allBaseObjects.put(id, toAttach);
         this.baseObjectsToId.put(toAttach, id);
      }

      this.beforeLocalConstructingHooks = this.create(beforeLocalConstructingHookTypes);
      this.afterLocalConstructingHooks = this.create(afterLocalConstructingHookTypes);
      this.updateModelPlayerBases();
      iterator = this.allBaseObjects.keySet().iterator();

      while(iterator.hasNext()) {
         ((ModelPlayerBase)this.allBaseObjects.get(iterator.next())).afterBaseAttach(false);
      }

   }

   private ModelPlayerBase createModelPlayerBase(String id) {
      Constructor contructor = (Constructor)allBaseConstructors.get(id);

      try {
         ModelPlayerBase base;
         if (contructor.getParameterTypes().length == 1) {
            base = (ModelPlayerBase)contructor.newInstance(this);
         } else {
            base = (ModelPlayerBase)contructor.newInstance(this, id);
         }

         return base;
      } catch (Exception var5) {
         throw new RuntimeException("Exception while creating a ModelPlayerBase of type '" + contructor.getDeclaringClass() + "'", var5);
      }
   }

   private void updateModelPlayerBases() {
      this.beforeGetRandomModelBoxHooks = this.create(beforeGetRandomModelBoxHookTypes);
      this.overrideGetRandomModelBoxHooks = this.create(overrideGetRandomModelBoxHookTypes);
      this.afterGetRandomModelBoxHooks = this.create(afterGetRandomModelBoxHookTypes);
      this.isGetRandomModelBoxModded = this.beforeGetRandomModelBoxHooks != null || this.overrideGetRandomModelBoxHooks != null || this.afterGetRandomModelBoxHooks != null;
      this.beforeGetTextureOffsetHooks = this.create(beforeGetTextureOffsetHookTypes);
      this.overrideGetTextureOffsetHooks = this.create(overrideGetTextureOffsetHookTypes);
      this.afterGetTextureOffsetHooks = this.create(afterGetTextureOffsetHookTypes);
      this.isGetTextureOffsetModded = this.beforeGetTextureOffsetHooks != null || this.overrideGetTextureOffsetHooks != null || this.afterGetTextureOffsetHooks != null;
      this.beforeRenderHooks = this.create(beforeRenderHookTypes);
      this.overrideRenderHooks = this.create(overrideRenderHookTypes);
      this.afterRenderHooks = this.create(afterRenderHookTypes);
      this.isRenderModded = this.beforeRenderHooks != null || this.overrideRenderHooks != null || this.afterRenderHooks != null;
      this.beforeRenderCloakHooks = this.create(beforeRenderCloakHookTypes);
      this.overrideRenderCloakHooks = this.create(overrideRenderCloakHookTypes);
      this.afterRenderCloakHooks = this.create(afterRenderCloakHookTypes);
      this.isRenderCloakModded = this.beforeRenderCloakHooks != null || this.overrideRenderCloakHooks != null || this.afterRenderCloakHooks != null;
      this.beforeRenderEarsHooks = this.create(beforeRenderEarsHookTypes);
      this.overrideRenderEarsHooks = this.create(overrideRenderEarsHookTypes);
      this.afterRenderEarsHooks = this.create(afterRenderEarsHookTypes);
      this.isRenderEarsModded = this.beforeRenderEarsHooks != null || this.overrideRenderEarsHooks != null || this.afterRenderEarsHooks != null;
      this.beforeSetLivingAnimationsHooks = this.create(beforeSetLivingAnimationsHookTypes);
      this.overrideSetLivingAnimationsHooks = this.create(overrideSetLivingAnimationsHookTypes);
      this.afterSetLivingAnimationsHooks = this.create(afterSetLivingAnimationsHookTypes);
      this.isSetLivingAnimationsModded = this.beforeSetLivingAnimationsHooks != null || this.overrideSetLivingAnimationsHooks != null || this.afterSetLivingAnimationsHooks != null;
      this.beforeSetRotationAnglesHooks = this.create(beforeSetRotationAnglesHookTypes);
      this.overrideSetRotationAnglesHooks = this.create(overrideSetRotationAnglesHookTypes);
      this.afterSetRotationAnglesHooks = this.create(afterSetRotationAnglesHookTypes);
      this.isSetRotationAnglesModded = this.beforeSetRotationAnglesHooks != null || this.overrideSetRotationAnglesHooks != null || this.afterSetRotationAnglesHooks != null;
      this.beforeSetTextureOffsetHooks = this.create(beforeSetTextureOffsetHookTypes);
      this.overrideSetTextureOffsetHooks = this.create(overrideSetTextureOffsetHookTypes);
      this.afterSetTextureOffsetHooks = this.create(afterSetTextureOffsetHookTypes);
      this.isSetTextureOffsetModded = this.beforeSetTextureOffsetHooks != null || this.overrideSetTextureOffsetHooks != null || this.afterSetTextureOffsetHooks != null;
   }

   private void attachModelPlayerBase(String id) {
      ModelPlayerBase toAttach = this.createModelPlayerBase(id);
      toAttach.beforeBaseAttach(true);
      this.allBaseObjects.put(id, toAttach);
      this.updateModelPlayerBases();
      toAttach.afterBaseAttach(true);
   }

   private void detachModelPlayerBase(String id) {
      ModelPlayerBase toDetach = (ModelPlayerBase)this.allBaseObjects.get(id);
      toDetach.beforeBaseDetach(true);
      this.allBaseObjects.remove(id);
      this.updateModelPlayerBases();
      toDetach.afterBaseDetach(true);
   }

   private ModelPlayerBase[] create(List types) {
      if (types.isEmpty()) {
         return null;
      } else {
         ModelPlayerBase[] result = new ModelPlayerBase[types.size()];

         for(int i = 0; i < result.length; ++i) {
            result[i] = this.getModelPlayerBase((String)types.get(i));
         }

         return result;
      }
   }

   private void beforeLocalConstructing(float paramFloat) {
      if (this.beforeLocalConstructingHooks != null) {
         for(int i = this.beforeLocalConstructingHooks.length - 1; i >= 0; --i) {
            this.beforeLocalConstructingHooks[i].beforeLocalConstructing(paramFloat);
         }
      }

      this.beforeLocalConstructingHooks = null;
   }

   private void afterLocalConstructing(float paramFloat) {
      if (this.afterLocalConstructingHooks != null) {
         for(int i = 0; i < this.afterLocalConstructingHooks.length; ++i) {
            this.afterLocalConstructingHooks[i].afterLocalConstructing(paramFloat);
         }
      }

      this.afterLocalConstructingHooks = null;
   }

   public ModelPlayerBase getModelPlayerBase(String id) {
      return (ModelPlayerBase)this.allBaseObjects.get(id);
   }

   public Set getModelPlayerBaseIds() {
      return this.unmodifiableAllBaseIds;
   }

   public Object dynamic(String key, Object[] parameters) {
      key = key.replace('.', '_').replace(' ', '_');
      this.executeAll(key, parameters, beforeDynamicHookTypes, beforeDynamicHookMethods, true);
      Object result = this.dynamicOverwritten(key, parameters, (ModelPlayerBase)null);
      this.executeAll(key, parameters, afterDynamicHookTypes, afterDynamicHookMethods, false);
      return result;
   }

   public Object dynamicOverwritten(String key, Object[] parameters, ModelPlayerBase overwriter) {
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
         return methods == null ? null : this.execute(this.getModelPlayerBase(id), method, parameters);
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
            ModelPlayerBase base = this.getModelPlayerBase(id);
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

   private Object execute(ModelPlayerBase base, Method method, Object[] parameters) {
      try {
         return method.invoke(base, parameters);
      } catch (Exception var5) {
         throw new RuntimeException("Exception while invoking dynamic method", var5);
      }
   }

   public static ModelRenderer getRandomModelBox(IModelPlayerAPI target, Random paramRandom) {
      ModelPlayerAPI modelPlayerAPI = target.getModelPlayerAPI();
      ModelRenderer _result;
      if (modelPlayerAPI != null && modelPlayerAPI.isGetRandomModelBoxModded) {
         _result = modelPlayerAPI.getRandomModelBox(paramRandom);
      } else {
         _result = target.localGetRandomModelBox(paramRandom);
      }

      return _result;
   }

   private ModelRenderer getRandomModelBox(Random paramRandom) {
      if (this.beforeGetRandomModelBoxHooks != null) {
         for(int i = this.beforeGetRandomModelBoxHooks.length - 1; i >= 0; --i) {
            this.beforeGetRandomModelBoxHooks[i].beforeGetRandomModelBox(paramRandom);
         }
      }

      ModelRenderer _result;
      if (this.overrideGetRandomModelBoxHooks != null) {
         _result = this.overrideGetRandomModelBoxHooks[this.overrideGetRandomModelBoxHooks.length - 1].getRandomModelBox(paramRandom);
      } else {
         _result = this.modelPlayer.localGetRandomModelBox(paramRandom);
      }

      if (this.afterGetRandomModelBoxHooks != null) {
         for(int i = 0; i < this.afterGetRandomModelBoxHooks.length; ++i) {
            this.afterGetRandomModelBoxHooks[i].afterGetRandomModelBox(paramRandom);
         }
      }

      return _result;
   }

   protected ModelPlayerBase GetOverwrittenGetRandomModelBox(ModelPlayerBase overWriter) {
      for(int i = 0; i < this.overrideGetRandomModelBoxHooks.length; ++i) {
         if (this.overrideGetRandomModelBoxHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideGetRandomModelBoxHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static TextureOffset getTextureOffset(IModelPlayerAPI target, String paramString) {
      ModelPlayerAPI modelPlayerAPI = target.getModelPlayerAPI();
      TextureOffset _result;
      if (modelPlayerAPI != null && modelPlayerAPI.isGetTextureOffsetModded) {
         _result = modelPlayerAPI.getTextureOffset(paramString);
      } else {
         _result = target.localGetTextureOffset(paramString);
      }

      return _result;
   }

   private TextureOffset getTextureOffset(String paramString) {
      if (this.beforeGetTextureOffsetHooks != null) {
         for(int i = this.beforeGetTextureOffsetHooks.length - 1; i >= 0; --i) {
            this.beforeGetTextureOffsetHooks[i].beforeGetTextureOffset(paramString);
         }
      }

      TextureOffset _result;
      if (this.overrideGetTextureOffsetHooks != null) {
         _result = this.overrideGetTextureOffsetHooks[this.overrideGetTextureOffsetHooks.length - 1].getTextureOffset(paramString);
      } else {
         _result = this.modelPlayer.localGetTextureOffset(paramString);
      }

      if (this.afterGetTextureOffsetHooks != null) {
         for(int i = 0; i < this.afterGetTextureOffsetHooks.length; ++i) {
            this.afterGetTextureOffsetHooks[i].afterGetTextureOffset(paramString);
         }
      }

      return _result;
   }

   protected ModelPlayerBase GetOverwrittenGetTextureOffset(ModelPlayerBase overWriter) {
      for(int i = 0; i < this.overrideGetTextureOffsetHooks.length; ++i) {
         if (this.overrideGetTextureOffsetHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideGetTextureOffsetHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void render(IModelPlayerAPI target, Entity paramEntity, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
      ModelPlayerAPI modelPlayerAPI = target.getModelPlayerAPI();
      if (modelPlayerAPI != null && modelPlayerAPI.isRenderModded) {
         modelPlayerAPI.render(paramEntity, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
      } else {
         target.localRender(paramEntity, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
      }

   }

   private void render(Entity paramEntity, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
      int i;
      if (this.beforeRenderHooks != null) {
         for(i = this.beforeRenderHooks.length - 1; i >= 0; --i) {
            this.beforeRenderHooks[i].beforeRender(paramEntity, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
         }
      }

      if (this.overrideRenderHooks != null) {
         this.overrideRenderHooks[this.overrideRenderHooks.length - 1].render(paramEntity, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
      } else {
         this.modelPlayer.localRender(paramEntity, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
      }

      if (this.afterRenderHooks != null) {
         for(i = 0; i < this.afterRenderHooks.length; ++i) {
            this.afterRenderHooks[i].afterRender(paramEntity, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
         }
      }

   }

   protected ModelPlayerBase GetOverwrittenRender(ModelPlayerBase overWriter) {
      for(int i = 0; i < this.overrideRenderHooks.length; ++i) {
         if (this.overrideRenderHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideRenderHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void renderCloak(IModelPlayerAPI target, float paramFloat) {
      ModelPlayerAPI modelPlayerAPI = target.getModelPlayerAPI();
      if (modelPlayerAPI != null && modelPlayerAPI.isRenderCloakModded) {
         modelPlayerAPI.renderCloak(paramFloat);
      } else {
         target.localRenderCloak(paramFloat);
      }

   }

   private void renderCloak(float paramFloat) {
      int i;
      if (this.beforeRenderCloakHooks != null) {
         for(i = this.beforeRenderCloakHooks.length - 1; i >= 0; --i) {
            this.beforeRenderCloakHooks[i].beforeRenderCloak(paramFloat);
         }
      }

      if (this.overrideRenderCloakHooks != null) {
         this.overrideRenderCloakHooks[this.overrideRenderCloakHooks.length - 1].renderCloak(paramFloat);
      } else {
         this.modelPlayer.localRenderCloak(paramFloat);
      }

      if (this.afterRenderCloakHooks != null) {
         for(i = 0; i < this.afterRenderCloakHooks.length; ++i) {
            this.afterRenderCloakHooks[i].afterRenderCloak(paramFloat);
         }
      }

   }

   protected ModelPlayerBase GetOverwrittenRenderCloak(ModelPlayerBase overWriter) {
      for(int i = 0; i < this.overrideRenderCloakHooks.length; ++i) {
         if (this.overrideRenderCloakHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideRenderCloakHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void renderEars(IModelPlayerAPI target, float paramFloat) {
      ModelPlayerAPI modelPlayerAPI = target.getModelPlayerAPI();
      if (modelPlayerAPI != null && modelPlayerAPI.isRenderEarsModded) {
         modelPlayerAPI.renderEars(paramFloat);
      } else {
         target.localRenderEars(paramFloat);
      }

   }

   private void renderEars(float paramFloat) {
      int i;
      if (this.beforeRenderEarsHooks != null) {
         for(i = this.beforeRenderEarsHooks.length - 1; i >= 0; --i) {
            this.beforeRenderEarsHooks[i].beforeRenderEars(paramFloat);
         }
      }

      if (this.overrideRenderEarsHooks != null) {
         this.overrideRenderEarsHooks[this.overrideRenderEarsHooks.length - 1].renderEars(paramFloat);
      } else {
         this.modelPlayer.localRenderEars(paramFloat);
      }

      if (this.afterRenderEarsHooks != null) {
         for(i = 0; i < this.afterRenderEarsHooks.length; ++i) {
            this.afterRenderEarsHooks[i].afterRenderEars(paramFloat);
         }
      }

   }

   protected ModelPlayerBase GetOverwrittenRenderEars(ModelPlayerBase overWriter) {
      for(int i = 0; i < this.overrideRenderEarsHooks.length; ++i) {
         if (this.overrideRenderEarsHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideRenderEarsHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void setLivingAnimations(IModelPlayerAPI target, EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3) {
      ModelPlayerAPI modelPlayerAPI = target.getModelPlayerAPI();
      if (modelPlayerAPI != null && modelPlayerAPI.isSetLivingAnimationsModded) {
         modelPlayerAPI.setLivingAnimations(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3);
      } else {
         target.localSetLivingAnimations(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3);
      }

   }

   private void setLivingAnimations(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3) {
      int i;
      if (this.beforeSetLivingAnimationsHooks != null) {
         for(i = this.beforeSetLivingAnimationsHooks.length - 1; i >= 0; --i) {
            this.beforeSetLivingAnimationsHooks[i].beforeSetLivingAnimations(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3);
         }
      }

      if (this.overrideSetLivingAnimationsHooks != null) {
         this.overrideSetLivingAnimationsHooks[this.overrideSetLivingAnimationsHooks.length - 1].setLivingAnimations(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3);
      } else {
         this.modelPlayer.localSetLivingAnimations(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3);
      }

      if (this.afterSetLivingAnimationsHooks != null) {
         for(i = 0; i < this.afterSetLivingAnimationsHooks.length; ++i) {
            this.afterSetLivingAnimationsHooks[i].afterSetLivingAnimations(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3);
         }
      }

   }

   protected ModelPlayerBase GetOverwrittenSetLivingAnimations(ModelPlayerBase overWriter) {
      for(int i = 0; i < this.overrideSetLivingAnimationsHooks.length; ++i) {
         if (this.overrideSetLivingAnimationsHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideSetLivingAnimationsHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void setRotationAngles(IModelPlayerAPI target, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramEntity) {
      ModelPlayerAPI modelPlayerAPI = target.getModelPlayerAPI();
      if (modelPlayerAPI != null && modelPlayerAPI.isSetRotationAnglesModded) {
         modelPlayerAPI.setRotationAngles(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramEntity);
      } else {
         target.localSetRotationAngles(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramEntity);
      }

   }

   private void setRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramEntity) {
      int i;
      if (this.beforeSetRotationAnglesHooks != null) {
         for(i = this.beforeSetRotationAnglesHooks.length - 1; i >= 0; --i) {
            this.beforeSetRotationAnglesHooks[i].beforeSetRotationAngles(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramEntity);
         }
      }

      if (this.overrideSetRotationAnglesHooks != null) {
         this.overrideSetRotationAnglesHooks[this.overrideSetRotationAnglesHooks.length - 1].setRotationAngles(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramEntity);
      } else {
         this.modelPlayer.localSetRotationAngles(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramEntity);
      }

      if (this.afterSetRotationAnglesHooks != null) {
         for(i = 0; i < this.afterSetRotationAnglesHooks.length; ++i) {
            this.afterSetRotationAnglesHooks[i].afterSetRotationAngles(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramEntity);
         }
      }

   }

   protected ModelPlayerBase GetOverwrittenSetRotationAngles(ModelPlayerBase overWriter) {
      for(int i = 0; i < this.overrideSetRotationAnglesHooks.length; ++i) {
         if (this.overrideSetRotationAnglesHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideSetRotationAnglesHooks[i - 1];
         }
      }

      return overWriter;
   }

   public static void setTextureOffset(IModelPlayerAPI target, String paramString, int paramInt1, int paramInt2) {
      ModelPlayerAPI modelPlayerAPI = target.getModelPlayerAPI();
      if (modelPlayerAPI != null && modelPlayerAPI.isSetTextureOffsetModded) {
         modelPlayerAPI.setTextureOffset(paramString, paramInt1, paramInt2);
      } else {
         target.localSetTextureOffset(paramString, paramInt1, paramInt2);
      }

   }

   private void setTextureOffset(String paramString, int paramInt1, int paramInt2) {
      int i;
      if (this.beforeSetTextureOffsetHooks != null) {
         for(i = this.beforeSetTextureOffsetHooks.length - 1; i >= 0; --i) {
            this.beforeSetTextureOffsetHooks[i].beforeSetTextureOffset(paramString, paramInt1, paramInt2);
         }
      }

      if (this.overrideSetTextureOffsetHooks != null) {
         this.overrideSetTextureOffsetHooks[this.overrideSetTextureOffsetHooks.length - 1].setTextureOffset(paramString, paramInt1, paramInt2);
      } else {
         this.modelPlayer.localSetTextureOffset(paramString, paramInt1, paramInt2);
      }

      if (this.afterSetTextureOffsetHooks != null) {
         for(i = 0; i < this.afterSetTextureOffsetHooks.length; ++i) {
            this.afterSetTextureOffsetHooks[i].afterSetTextureOffset(paramString, paramInt1, paramInt2);
         }
      }

   }

   protected ModelPlayerBase GetOverwrittenSetTextureOffset(ModelPlayerBase overWriter) {
      for(int i = 0; i < this.overrideSetTextureOffsetHooks.length; ++i) {
         if (this.overrideSetTextureOffsetHooks[i] == overWriter) {
            if (i == 0) {
               return null;
            }

            return this.overrideSetTextureOffsetHooks[i - 1];
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
