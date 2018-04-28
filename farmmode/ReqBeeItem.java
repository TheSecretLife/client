package farmmode;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ReqBeeItem {
   public static Item BugTame;

   public static void its() {
      BugTame = new ItemBugTame("BugTame");
      GameRegistry.registerItem(BugTame, "BugTame");
   }
}
