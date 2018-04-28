package aguild;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IModelCustom;
import utilities.SagaModelLoader;

public class importobj {
   public static Map textures = new HashMap();
   public static Map icons = new HashMap();
   public static Map iconGroups = new HashMap();
   public static Map sounds = new HashMap();
   public static Map models = new HashMap();
   public static Map objModels = new HashMap();

   public static void addTexture(String name) {
      name = name.toLowerCase();
      textures.put(name, new ResourceLocation(name));
   }

   public static void addModel(String name, ModelBase model) {
      name = name.toLowerCase();
      models.put(name, model);
   }

   public static void addObjModel(String name) {
      name = name.toLowerCase();
      objModels.put(name, SagaModelLoader.loadModel(new ResourceLocation(name)));
   }

   public static IModelCustom getObjModel(String name) {
      name = name.toLowerCase();
      if (!objModels.containsKey(name)) {
         addObjModel(name);
      }

      return (IModelCustom)objModels.get(name);
   }
}
