package srcpet;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import srcpet.entity.entitypet;

@Mod(
   modid = "srcpet",
   name = "ARK_RUST",
   version = "1.0"
)
public class mainclass {
   @SidedProxy(
      serverSide = "srcpet.server",
      clientSide = "srcpet.client"
   )
   public static server psx;
   @Instance("srcpet")
   public static mainclass ins;
   public static SimpleNetworkWrapper networkChannel;
   public static Item pet1;
   public static Item pet2;
   public static Item pet3;
   public static Item pet4;
   public static Item pet5;
   public static Item pet6;
   public static Item pet7;
   public static Item pet8;
   public static Item pet9;
   public static Item pet10;
   public static Item pet11;
   public static Item pet12;
   public static Item pet13;
   public static Item pet14;
   public static Item pet15;
   public static Item pet16;
   public static Item pet17;
   public static Item pet18;
   public static Item pet19;
   public static Item pet20;
   public static Item pet21;
   public static Item pet22;
   public static Item pet23;
   public static Item pet24;

   @EventHandler
   public void before(FMLPreInitializationEvent e) {
      networkChannel = NetworkRegistry.INSTANCE.newSimpleChannel("pxst");
      this.startpack();
   }

   @EventHandler
   public void now(FMLInitializationEvent e) {
      psx.reg();
      NetworkRegistry.INSTANCE.registerGuiHandler(this, new server());
      MinecraftForge.EVENT_BUS.register(new servertick());
      EntityRegistry.registerGlobalEntityID(entitypet.class, "Pet", EntityRegistry.findGlobalUniqueEntityId());
      pet1 = new itempet("pet1");
      GameRegistry.registerItem(pet1, "pet1");
      pet2 = new itempet("pet2");
      GameRegistry.registerItem(pet2, "pet2");
      pet3 = new itempet("pet3");
      GameRegistry.registerItem(pet3, "pet3");
      pet4 = new itempet("pet4");
      GameRegistry.registerItem(pet4, "pet4");
      pet5 = new itempet("pet5");
      GameRegistry.registerItem(pet5, "pet5");
      pet6 = new itempet("pet6");
      GameRegistry.registerItem(pet6, "pet6");
      pet7 = new itempet("pet7");
      GameRegistry.registerItem(pet7, "pet7");
      pet8 = new itempet("pet8");
      GameRegistry.registerItem(pet8, "pet8");
      pet9 = new itempet("pet9");
      GameRegistry.registerItem(pet9, "pet9");
      pet10 = new itempet("pet10");
      GameRegistry.registerItem(pet10, "pet10");
      pet11 = new itempet("pet11");
      GameRegistry.registerItem(pet11, "pet11");
      pet12 = new itempet("pet12");
      GameRegistry.registerItem(pet12, "pet12");
      pet13 = new itempet("pet13");
      GameRegistry.registerItem(pet13, "pet13");
      pet14 = new itempet("pet14");
      GameRegistry.registerItem(pet14, "pet14");
      pet15 = new itempet("pet15");
      GameRegistry.registerItem(pet15, "pet15");
      pet16 = new itempet("pet16");
      GameRegistry.registerItem(pet16, "pet16");
      pet17 = new itempet("pet17");
      GameRegistry.registerItem(pet17, "pet17");
      pet18 = new itempet("pet18");
      GameRegistry.registerItem(pet18, "pet18");
      pet19 = new itempet("pet19");
      GameRegistry.registerItem(pet19, "pet19");
      pet20 = new itempet("pet20");
      GameRegistry.registerItem(pet20, "pet20");
      pet21 = new itempet("pet21");
      GameRegistry.registerItem(pet21, "pet21");
      pet22 = new itempet("pet22");
      GameRegistry.registerItem(pet22, "pet22");
      pet23 = new itempet("pet23");
      GameRegistry.registerItem(pet23, "pet23");
      pet24 = new itempet("pet24");
      GameRegistry.registerItem(pet24, "pet24");
   }

   public void startpack() {
      networkChannel.registerMessage(packetdata.Handler.class, packetdata.class, 0, Side.CLIENT);
      networkChannel.registerMessage(packgui.Handler.class, packgui.class, 1, Side.SERVER);
   }
}
