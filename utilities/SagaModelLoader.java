package utilities;

import com.google.common.collect.Maps;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Collection;
import java.util.Map;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.client.model.IModelCustomLoader;
import net.minecraftforge.client.model.ModelFormatException;
import net.minecraftforge.client.model.techne.TechneModelLoader;

@SideOnly(Side.CLIENT)
public class SagaModelLoader {
   private static Map instances = Maps.newHashMap();

   public static void registerModelHandler(IModelCustomLoader modelHandler) {
      String[] var1 = modelHandler.getSuffixes();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         String suffix = var1[var3];
         instances.put(suffix, modelHandler);
      }

   }

   public static IModelCustom loadModel(ResourceLocation resource) throws IllegalArgumentException, ModelFormatException {
      String name = resource.func_110623_a();
      int i = name.lastIndexOf(46);
      if (i == -1) {
         FMLLog.severe("The resource name %s is not valid", new Object[]{resource});
         throw new IllegalArgumentException("The resource name is not valid");
      } else {
         String suffix = name.substring(i + 1);
         IModelCustomLoader loader = (IModelCustomLoader)instances.get(suffix);
         if (loader == null) {
            FMLLog.severe("The resource name %s is not supported", new Object[]{resource});
            throw new IllegalArgumentException("The resource name is not supported");
         } else {
            return loader.loadInstance(resource);
         }
      }
   }

   public static Collection getSupportedSuffixes() {
      return instances.keySet();
   }

   static {
      registerModelHandler(new SagaLoader());
      registerModelHandler(new TechneModelLoader());
   }
}
