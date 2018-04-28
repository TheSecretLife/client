package utilities;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.client.model.IModelCustomLoader;
import net.minecraftforge.client.model.ModelFormatException;

public class SagaLoader implements IModelCustomLoader {
   private static final String[] types = new String[]{"saga"};

   public String getType() {
      return "SAGA model";
   }

   public String[] getSuffixes() {
      return types;
   }

   public IModelCustom loadInstance(ResourceLocation resource) throws ModelFormatException {
      return new sagaobj(resource);
   }
}
