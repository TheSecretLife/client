package farmmode;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ReqBeetleItem {
   public static Item bt01;
   public static Item bt02;
   public static Item bt03;
   public static Item bt04;
   public static Item bt05;
   public static Item bt06;
   public static Item bt07;
   public static Item bt08;
   public static Item bt09;
   public static Item bt10;
   public static Item bt11;
   public static Item bt12;
   public static Item bt13;
   public static Item bt14;
   public static Item bt15;
   public static Item bt16;
   public static Item bt17;
   public static Block BeetleWood1;
   public static Block BeetleWood2;

   public static void its() {
      BeetleWood1 = (new BlockBeetlewood()).func_149663_c("BeetleWood1");
      GameRegistry.registerBlock(BeetleWood1, "BeetleWood1");
      BeetleWood2 = (new BlockBeetlewood2()).func_149663_c("BeetleWood2");
      GameRegistry.registerBlock(BeetleWood2, "BeetleWood2");
      bt01 = new ItemBeetle("bt01");
      GameRegistry.registerItem(bt01, "bt01");
      bt02 = new ItemBeetle("bt02");
      GameRegistry.registerItem(bt02, "bt02");
      bt03 = new ItemBeetle("bt03");
      GameRegistry.registerItem(bt03, "bt03");
      bt04 = new ItemBeetle("bt04");
      GameRegistry.registerItem(bt04, "bt04");
      bt05 = new ItemBeetle("bt05");
      GameRegistry.registerItem(bt05, "bt05");
      bt06 = new ItemBeetle("bt06");
      GameRegistry.registerItem(bt06, "bt06");
      bt07 = new ItemBeetle("bt07");
      GameRegistry.registerItem(bt07, "bt07");
      bt08 = new ItemBeetle("bt08");
      GameRegistry.registerItem(bt08, "bt08");
      bt09 = new ItemBeetle("bt09");
      GameRegistry.registerItem(bt09, "bt09");
      bt10 = new ItemBeetle("bt10");
      GameRegistry.registerItem(bt10, "bt10");
      bt11 = new ItemBeetle("bt11");
      GameRegistry.registerItem(bt11, "bt11");
      bt12 = new ItemBeetle("bt12");
      GameRegistry.registerItem(bt12, "bt12");
      bt13 = new ItemBeetle("bt13");
      GameRegistry.registerItem(bt13, "bt13");
      bt14 = new ItemBeetle("bt14");
      GameRegistry.registerItem(bt14, "bt14");
      bt15 = new ItemBeetle("bt15");
      GameRegistry.registerItem(bt15, "bt15");
      bt16 = new ItemBeetle("bt16");
      GameRegistry.registerItem(bt16, "bt16");
      bt17 = new ItemBeetle("bt17");
      GameRegistry.registerItem(bt17, "bt17");
   }
}
