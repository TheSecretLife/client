package aguild;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderLivingEvent.Specials.Pre;

public class clientHandler {
   private boolean rendername;
   public Minecraft mc = Minecraft.func_71410_x();
   public EntityLiving lastEntity;
   @SideOnly(Side.CLIENT)
   public NameTagRenderer nameTagRenderer = new NameTagRenderer();

   @SubscribeEvent
   @SideOnly(Side.CLIENT)
   public void onRenderLiving(Pre event) {
      if (event.entity instanceof EntityPlayer) {
         EntityPlayer player = (EntityPlayer)event.entity;
         event.setCanceled(true);
         this.nameTagRenderer.renderNameTag(player, (float)event.x, (float)event.y, (float)event.z);
      }

   }
}
