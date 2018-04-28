package farmmode;

import net.minecraft.item.Item;

public class ItemPlant extends Item {
   public ItemPlant(String unlocalizedName) {
      this.func_77637_a(ModStart.PlantTab);
      this.func_77625_d(64);
      this.func_77655_b(unlocalizedName);
      this.func_111206_d("fantasyland:" + unlocalizedName);
   }
}
