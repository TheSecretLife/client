package animation.gobbob.mobends.customarmor;

import animation.gobbob.mobends.client.model.ModelCustomArmor;
import animation.gobbob.mobends.client.model.ModelRendererBends;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;

public class ArmorConverter {
   public static CustomArmor convert(float argModelBuffnes, ModelBiped original, String argTexture) {
      ModelCustomArmor newModel = new ModelCustomArmor(argModelBuffnes, 0.0F, original.field_78090_t, original.field_78089_u);
      newModel.field_78115_e = convertBox((ModelRendererBends)newModel.field_78115_e, original.field_78115_e);
      newModel.field_78122_k = convertBox((ModelRendererBends)newModel.field_78122_k, original.field_78122_k);
      newModel.field_78121_j = convertBox((ModelRendererBends)newModel.field_78121_j, original.field_78121_j);
      newModel.field_78116_c = convertBox((ModelRendererBends)newModel.field_78116_c, original.field_78116_c);
      newModel.field_78114_d = convertBox((ModelRendererBends)newModel.field_78114_d, original.field_78114_d);
      newModel.field_78113_g = convertBox((ModelRendererBends)newModel.field_78113_g, original.field_78113_g);
      newModel.field_78124_i = convertBox((ModelRendererBends)newModel.field_78115_e, original.field_78115_e);
      newModel.field_78112_f = convertBox((ModelRendererBends)newModel.field_78115_e, original.field_78115_e);
      newModel.field_78123_h = convertBox((ModelRendererBends)newModel.field_78115_e, original.field_78115_e);
      CustomArmor newArmor = new CustomArmor(newModel, argTexture);
      return newArmor;
   }

   public static ModelRendererBends convertBox(ModelRendererBends argBox, ModelRenderer argOld) {
      if (argOld.field_78805_m != null) {
         for(int i = 0; i < argOld.field_78805_m.size(); ++i) {
            argBox.field_78805_m.add(argOld.field_78805_m.get(i));
         }
      }

      return argBox;
   }
}
