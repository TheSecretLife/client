package srcpet;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itempet extends Item {
   public itempet(String unlocalizedName) {
      this.func_77637_a(CreativeTabs.field_78040_i);
      this.func_77625_d(1);
      this.func_77655_b(unlocalizedName);
      this.func_111206_d("srcpet:" + unlocalizedName);
   }
}
