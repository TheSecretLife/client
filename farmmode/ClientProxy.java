package farmmode;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends ServerProxy {
   private final Minecraft mc = Minecraft.func_71410_x();
   @SideOnly(Side.CLIENT)
   public static final ModelBase fish2 = new modelfishA();
   @SideOnly(Side.CLIENT)
   public static final ModelBase fish3 = new modelfishB();
   @SideOnly(Side.CLIENT)
   public static final ModelBase fish4 = new fish02model();
   @SideOnly(Side.CLIENT)
   public static final ModelBase fish5 = new fish03model();
   @SideOnly(Side.CLIENT)
   public static final ModelBase fish6 = new fish04model();
   @SideOnly(Side.CLIENT)
   public static final ModelBase fish7 = new fish05model();

   public void reg() {
      MinecraftForge.EVENT_BUS.register(new lockmod(this.mc));
      RenderingRegistry.registerEntityRenderingHandler(fish1entity.class, new fish1render(new fish1model(1.0F), 1.0F));
      RenderingRegistry.registerEntityRenderingHandler(beetle1entity.class, new beetle1render(new beetle1model(0.0F), 1.0F));
      RenderingRegistry.registerEntityRenderingHandler(entityworm.class, new renderworm(new Worm(), 1.0F));
      MinecraftForgeClient.registerItemRenderer(ReqBeeItem.BugTame, new renderbugtame());
      MinecraftForgeClient.registerItemRenderer(ReqFarmItem.Water, new renderwatering());
      ClientRegistry.bindTileEntitySpecialRenderer(TeBeetleWood.class, new renderbtwood1());
      ClientRegistry.bindTileEntitySpecialRenderer(TeBeetleWood2.class, new renderbtwood2());
      ClientRegistry.bindTileEntitySpecialRenderer(TeChili.class, new renderChili());
      ClientRegistry.bindTileEntitySpecialRenderer(TeOnion.class, new renderonion());
      ClientRegistry.bindTileEntitySpecialRenderer(TeTomato.class, new rendertomato());
      ClientRegistry.bindTileEntitySpecialRenderer(TeLemon.class, new renderlemon());
   }
}
