package farmmode;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ReqFarmItem {
   public static Item Water;
   public static Item Chili;
   public static Item Tomato;
   public static Item Lemon;
   public static Item Onion;
   public static Block BlockFarmA;
   public static Block BlockFarmB;
   public static Block SeedChili;
   public static Block SeedTomato;
   public static Block SeedLemon;
   public static Block SeedOnion;

   public static void its() {
      Water = new ItemWaterPlant("Water");
      GameRegistry.registerItem(Water, "Water");
      Chili = new ItemPlant("Chili");
      GameRegistry.registerItem(Chili, "Chili");
      Onion = new ItemPlant("Onion");
      GameRegistry.registerItem(Onion, "Onion");
      Tomato = new ItemPlant("Tomato");
      GameRegistry.registerItem(Tomato, "Tomato");
      Lemon = new ItemPlant("Lemon");
      GameRegistry.registerItem(Lemon, "Lemon");
      BlockFarmA = (new blockFarmA()).func_149663_c("BlockFarmA");
      GameRegistry.registerBlock(BlockFarmA, "BlockFarmA");
      BlockFarmB = (new blockFarmB()).func_149663_c("BlockFarmB");
      GameRegistry.registerBlock(BlockFarmB, "BlockFarmB");
      SeedChili = (new blockChiliPlant()).func_149663_c("SeedChili");
      GameRegistry.registerBlock(SeedChili, "SeedChili");
      SeedOnion = (new blockOnionPlant()).func_149663_c("SeedOnion");
      GameRegistry.registerBlock(SeedOnion, "SeedOnion");
      SeedTomato = (new blockTomatoPlant()).func_149663_c("SeedTomato");
      GameRegistry.registerBlock(SeedTomato, "SeedTomato");
      SeedLemon = (new blockLemonPlant()).func_149663_c("SeedLemon");
      GameRegistry.registerBlock(SeedLemon, "SeedLemon");
   }
}
