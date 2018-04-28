package npcseller;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import npcseller.network.PacketDispatcher;

@Mod(
   modid = "npcseller",
   name = "npcseller",
   version = "1.0"
)
public class Main {
   public static final String MOD_ID = "npcseller";
   @SidedProxy(
      serverSide = "npcseller.CommonProxy",
      clientSide = "npcseller.ClientProxy"
   )
   public static CommonProxy proxy;
   private static int modGuiIndex = 10;
   public static final int GUI_SETITEM;
   public static final int GUI_SETITEM2;
   public static final int GUI_SETITEM3;
   public static final int GUI_NPCPLAYER;
   public static final int GUI_NPCPLAYER2;
   public static final int GUI_NPCPLAYER3;
   public static CreativeTabs BlockTab;
   public static Block npc1;
   public static Block npc2;
   public static Block npc3;
   @Instance("npcseller")
   public static Main instance;

   @EventHandler
   public void preload(FMLPreInitializationEvent e) {
      PacketDispatcher.registerPackets();
   }

   @EventHandler
   public void load(FMLInitializationEvent e) {
      proxy.render();
      NetworkRegistry.INSTANCE.registerGuiHandler(this, new CommonProxy());
      npc1 = (new BlockC()).func_149663_c("npc1").func_149658_d("cabalaccessorys:npc1");
      GameRegistry.registerBlock(npc1, "npc1");
      GameRegistry.registerTileEntity(TileC.class, "npc1");
      LanguageRegistry.addName(npc1, "NPC ขายของ 1");
      npc2 = (new BlockC2()).func_149663_c("npc2").func_149658_d("cabalaccessorys:npc2");
      GameRegistry.registerBlock(npc2, "npc2");
      GameRegistry.registerTileEntity(TileC2.class, "npc2");
      LanguageRegistry.addName(npc2, "NPC ขายของ 3");
      npc3 = (new BlockC3()).func_149663_c("npc3").func_149658_d("cabalaccessorys:npc3");
      GameRegistry.registerBlock(npc3, "npc3");
      GameRegistry.registerTileEntity(TileC3.class, "npc3");
      LanguageRegistry.addName(npc3, "NPC ขายของ 3");
   }

   static {
      GUI_SETITEM = modGuiIndex++;
      GUI_SETITEM2 = modGuiIndex++;
      GUI_SETITEM3 = modGuiIndex++;
      GUI_NPCPLAYER = modGuiIndex++;
      GUI_NPCPLAYER2 = modGuiIndex++;
      GUI_NPCPLAYER3 = modGuiIndex++;
      BlockTab = new CreativeTabs("TabNPC") {
         @SideOnly(Side.CLIENT)
         public Item func_78016_d() {
            return Items.field_151153_ao;
         }

         public String func_78024_c() {
            return "NPC ขายของ";
         }
      };
   }
}
