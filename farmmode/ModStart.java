package farmmode;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
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
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;

@Mod(
   modid = "farmmode",
   name = "FARM",
   version = "1.0"
)
public class ModStart {
   @SidedProxy(
      serverSide = "farmmode.ServerProxy",
      clientSide = "farmmode.ClientProxy"
   )
   public static ServerProxy sproxy;
   @Instance("farmmode")
   public static ModStart instance;
   public static SimpleNetworkWrapper networkChannel;
   public static CreativeTabs BlockTab = new CreativeTab_Block(CreativeTabs.getNextID(), "BlockTab");
   public static CreativeTabs EntityTab = new CreativeTab_Entity(CreativeTabs.getNextID(), "EntityTab");
   public static CreativeTabs PlantTab = new CreativeTab_Plant(CreativeTabs.getNextID(), "PlantTab");

   @EventHandler
   public void preStart(FMLPreInitializationEvent e) {
      networkChannel = NetworkRegistry.INSTANCE.newSimpleChannel("famm");
      this.startpack();
   }

   @EventHandler
   public void Start(FMLInitializationEvent e) {
      ReqBeeItem.its();
      ReqFishItem.its();
      ReqBeetleItem.its();
      ReqFarmItem.its();
      MinecraftForge.EVENT_BUS.register(new ServerPlayer());
      NetworkRegistry.INSTANCE.registerGuiHandler(this, new ServerProxy());
      sproxy.reg();
      int red = 16711680;
      int orange = 16762880;
      EntityRegistry.registerGlobalEntityID(fish1entity.class, "IndyFish", EntityRegistry.findGlobalUniqueEntityId(), red, orange);
      EntityRegistry.registerGlobalEntityID(beetle1entity.class, "IndyBeetle", EntityRegistry.findGlobalUniqueEntityId(), red, orange);
      EntityRegistry.registerGlobalEntityID(entityworm.class, "Worm", EntityRegistry.findGlobalUniqueEntityId(), red, orange);
      BiomeGenBase[] allBiomes = (BiomeGenBase[])Iterators.toArray(Iterators.filter(Iterators.forArray(BiomeGenBase.func_150565_n()), Predicates.notNull()), BiomeGenBase.class);
      EntityRegistry.addSpawn(entitybeetle.class, 7, 1, 1, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.field_76782_w});
      EntityRegistry.addSpawn(fish1entity.class, 1, 1, 1, EnumCreatureType.waterCreature, allBiomes);
      GameRegistry.registerTileEntity(TeBeetleWood.class, "TeBeetleWood");
      GameRegistry.registerTileEntity(TeBeetleWood2.class, "TeBeetleWood2");
      GameRegistry.registerTileEntity(TeChili.class, "TeChili");
      GameRegistry.registerTileEntity(TeOnion.class, "TeOnion");
      GameRegistry.registerTileEntity(TeTomato.class, "TeTomato");
      GameRegistry.registerTileEntity(TeLemon.class, "TeLemon");
   }

   public void startpack() {
      networkChannel.registerMessage(Packet_SyncPlayerData.Handler.class, Packet_SyncPlayerData.class, 0, Side.CLIENT);
   }
}
