package animation.gobbob.mobends.customarmor;

import animation.gobbob.mobends.client.model.ModelCustomArmor;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.model.ModelBiped;

public class CustomArmor {
   public static List armorList = new ArrayList();
   public ModelCustomArmor armorModel;
   public String texturePath;

   public static CustomArmor get(ModelBiped argOriginal, String argTexture, float argModelBuffnes) {
      for(int newArmor = 0; newArmor < armorList.size(); ++newArmor) {
         if (((CustomArmor)armorList.get(newArmor)).texturePath.equalsIgnoreCase(argTexture)) {
            return (CustomArmor)armorList.get(newArmor);
         }
      }

      CustomArmor var4 = ArmorConverter.convert(argModelBuffnes, argOriginal, argTexture);
      armorList.add(var4);
      return var4;
   }

   public CustomArmor() {
      this.armorModel = null;
      this.texturePath = null;
   }

   public CustomArmor(ModelCustomArmor argArmor, String argTexture) {
      this.armorModel = argArmor;
      this.texturePath = argTexture;
   }
}
