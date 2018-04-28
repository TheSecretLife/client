package cabalaccessorys.api;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Post;

public class ck extends Gui {
   public static Minecraft mc;
   private static final ResourceLocation closegui = new ResourceLocation("/closegui.png");

   public ck(Minecraft mc) {
      mc = mc;
   }

   public static boolean MouseClickCheck() {
      return mc.field_71474_y.field_74312_F.func_151470_d();
   }

   @SubscribeEvent(
      priority = EventPriority.NORMAL
   )
   public void onRenderExperienceBar(Post event) {
      if (event.type == ElementType.HOTBAR) {
         EntityPlayer player = mc.field_71439_g;
         ScaledResolution scaledresolution = new ScaledResolution(mc, mc.field_71443_c, mc.field_71440_d);
         int k = scaledresolution.func_78326_a();
         int l = scaledresolution.func_78328_b();
         int hk = k / 2;
         String serverIP = "";
         String checkIP = "siamsaga.mc-thai.in.th:25565";
         Minecraft mc = FMLClientHandler.instance().getClient();
         if (mc.func_71356_B() && !mc.field_71439_g.func_70005_c_().equalsIgnoreCase("tester01")) {
            mc.func_110434_K().func_110577_a(closegui);
            this.func_73729_b(0, 0, 0, 0, 1000, 1000);
            if (mc.field_71439_g.field_70173_aa % 300 == 1) {
               mc.func_71400_g();
            }

            if (MouseClickCheck()) {
               mc.func_71400_g();
            }
         }

         if (!mc.func_71356_B()) {
            serverIP = mc.func_147104_D().field_78845_b;
            if (!serverIP.equalsIgnoreCase(checkIP) && !serverIP.equalsIgnoreCase("43.229.79.209:25565") && !serverIP.equalsIgnoreCase("43.229.79.209") && !serverIP.equalsIgnoreCase("siamsaga.mc-thai.in.th")) {
               mc.func_110434_K().func_110577_a(closegui);
               this.func_73729_b(0, 0, 0, 0, 1000, 1000);
               if (mc.field_71439_g.field_70173_aa % 300 == 1) {
                  mc.func_71400_g();
               }
            }
         } else {
            serverIP = "NotConnect";
         }

      }
   }
}
