package minezmod;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class serverrun {
   public World world;
   Random rand = new Random();

   @SubscribeEvent
   public void CreatePlayer(EntityConstructing event) {
      if (event.entity instanceof EntityPlayer && save.get((EntityPlayer)event.entity) == null) {
         save.register((EntityPlayer)event.entity);
      }

   }

   @SubscribeEvent
   public void JoinWorld(EntityJoinWorldEvent event) {
      if (!event.entity.field_70170_p.field_72995_K && event.entity instanceof EntityPlayer) {
         save.loadProxyData((EntityPlayer)event.entity);
      }

   }

   @SubscribeEvent
   public void Death(LivingDeathEvent event) {
      if (!event.entity.field_70170_p.field_72995_K && event.entity instanceof EntityPlayer) {
         EntityPlayer player = (EntityPlayer)event.entity;
         save loads = save.get(player);
         save.saveProxyData((EntityPlayer)event.entity);
      }

   }

   @SubscribeEvent
   public void UpdateTick(LivingUpdateEvent event) {
      if (!event.entity.field_70170_p.field_72995_K && event.entity instanceof EntityPlayer) {
         EntityPlayer player = (EntityPlayer)event.entity;
         save var3 = save.get(player);
      }

   }

   @SideOnly(Side.CLIENT)
   @SubscribeEvent
   public void OpenGui(RenderGameOverlayEvent event) {
      if (event.type.name() == "FOOD" || event.type.name() == "HEALTH") {
         event.setCanceled(true);
      }

   }
}
