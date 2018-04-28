package farmmode;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemFoodFish extends Item {
   public ItemFoodFish(String unlocalizedName) {
      this.func_77637_a(ModStart.EntityTab);
      this.func_77625_d(64);
      this.func_77655_b(unlocalizedName);
      this.func_111206_d("fantasyland:" + unlocalizedName);
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack st, EntityPlayer pl, List lt, boolean bl) {
      if (st.func_77973_b() == ReqFishItem.FishFood1) {
         lt.add("เหยื่อสำหรับตกปลาแมคคอเรล");
      } else if (st.func_77973_b() == ReqFishItem.FishFood2) {
         lt.add("เหยื่อสำหรับตกปลาโกลฟิช");
      } else if (st.func_77973_b() == ReqFishItem.FishFood3) {
         lt.add("เหยื่อสำหรับตกปลามูนฟิช");
      } else if (st.func_77973_b() == ReqFishItem.FishFood4) {
         lt.add("เหยื่อสำหรับตกปลาคานู");
      } else if (st.func_77973_b() == ReqFishItem.FishFood5) {
         lt.add("เหยื่อสำหรับตกปลาเพิร์ล");
      } else if (st.func_77973_b() == ReqFishItem.FishFood6) {
         lt.add("เหยื่อสำหรับตกปลานีโฒ");
      } else if (st.func_77973_b() == ReqFishItem.FishFood7) {
         lt.add("เหยื่อสำหรับตกปลากริลฟิช");
      }

   }
}
