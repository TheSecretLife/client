package ext.network;

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

public class cs extends Gui {
   public static Minecraft mc;
   private static final ResourceLocation closegui = new ResourceLocation("expireditem:check.png");

   public cs(Minecraft mc) {
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
         String checkIP = "103.58.149.111:25565";
         Minecraft mc = FMLClientHandler.instance().getClient();
         if (mc.func_71356_B()) {
            mc.func_110434_K().func_110577_a(closegui);
            this.func_73729_b(0, 0, 0, 0, 1000, 1000);
            if (mc.field_71439_g.field_70173_aa % 300 == 1) {
               mc.func_71400_g();
            }

            if (MouseClickCheck()) {
               mc.func_71400_g();
            }
         } else {
            serverIP = mc.func_147104_D().field_78845_b;
            if (!serverIP.equalsIgnoreCase(checkIP)) {
               mc.func_110434_K().func_110577_a(closegui);
               this.func_73729_b(0, 0, 0, 0, 1000, 1000);
               if (mc.field_71439_g.field_70173_aa % 300 == 1) {
                  mc.func_71400_g();
               }

               if (MouseClickCheck()) {
                  mc.func_71400_g();
               }
            }
         }

      }
   }
}
