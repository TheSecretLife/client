package aguild.gui;

import aguild.playerdata;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Post;
import org.lwjgl.opengl.GL11;

public class newscreengui extends Gui {
   private Minecraft mc;
   private static final ResourceLocation b0 = new ResourceLocation("aguild:textures/gui/b0.png");
   private static final ResourceLocation b1 = new ResourceLocation("aguild:textures/gui/b2.png");
   private static final ResourceLocation b2 = new ResourceLocation("aguild:textures/gui/b3.png");
   private static final ResourceLocation b3 = new ResourceLocation("aguild:textures/gui/b4.png");
   private static final ResourceLocation b4 = new ResourceLocation("aguild:textures/gui/b5.png");
   private static final ResourceLocation b5 = new ResourceLocation("aguild:textures/gui/b6.png");

   public newscreengui(Minecraft mc) {
      this.mc = mc;
   }

   @SubscribeEvent(
      priority = EventPriority.NORMAL
   )
   public void onRenderExperienceBar(Post event) {
      if (event.type == ElementType.HOTBAR) {
         ScaledResolution scaledresolution = new ScaledResolution(this.mc, this.mc.field_71443_c, this.mc.field_71440_d);
         int k = scaledresolution.func_78326_a();
         int l = scaledresolution.func_78328_b();
         int hk = k / 2;
         playerdata px = playerdata.get(this.mc.field_71439_g);
         EntityPlayer player = this.mc.field_71439_g;
         int xPos = false;
         int yPos = true;
         if (px.guildlv < 2) {
            this.mc.func_110434_K().func_110577_a(b0);
         } else if (px.guildlv < 4) {
            this.mc.func_110434_K().func_110577_a(b1);
         } else if (px.guildlv < 6) {
            this.mc.func_110434_K().func_110577_a(b2);
         } else if (px.guildlv < 8) {
            this.mc.func_110434_K().func_110577_a(b3);
         } else if (px.guildlv < 10) {
            this.mc.func_110434_K().func_110577_a(b4);
         } else if (px.guildlv == 10) {
            this.mc.func_110434_K().func_110577_a(b5);
         }

         GL11.glPushMatrix();
         GL11.glEnable(3042);
         GL11.glDisable(2929);
         GL11.glDepthMask(false);
         GL11.glBlendFunc(770, 771);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.func_73729_b(k - 100, l - 55, 0, 0, 200, 30);
         GL11.glDisable(3042);
         GL11.glEnable(2929);
         GL11.glDepthMask(true);
         GL11.glPopMatrix();
      }
   }
}
