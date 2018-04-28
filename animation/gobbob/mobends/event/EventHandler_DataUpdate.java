package animation.gobbob.mobends.event;

import animation.gobbob.mobends.client.renderer.entity.RenderBendsPlayer;
import animation.gobbob.mobends.data.Data_Player;
import animation.gobbob.mobends.data.Data_Spider;
import animation.gobbob.mobends.data.Data_Zombie;
import animation.gobbob.mobends.util.BendsLogger;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.util.vector.Vector3f;

public class EventHandler_DataUpdate {
   @SubscribeEvent
   public void updateAnimations(RenderTickEvent event) {
      if (Minecraft.func_71410_x().field_71441_e != null) {
         int i;
         for(i = 0; i < Data_Player.dataList.size(); ++i) {
            ((Data_Player)Data_Player.dataList.get(i)).update(event.renderTickTime);
         }

         for(i = 0; i < Data_Zombie.dataList.size(); ++i) {
            ((Data_Zombie)Data_Zombie.dataList.get(i)).update(event.renderTickTime);
         }

         for(i = 0; i < Data_Spider.dataList.size(); ++i) {
            ((Data_Spider)Data_Spider.dataList.get(i)).update(event.renderTickTime);
         }
      }

   }

   @SubscribeEvent
   public void onClientTick(ClientTickEvent event) {
      if (Minecraft.func_71410_x().field_71441_e != null) {
         if (!(RenderManager.field_78727_a.field_78729_o.get(EntityPlayer.class) instanceof RenderBendsPlayer)) {
            RenderBendsPlayer i = new RenderBendsPlayer();
            RenderManager.field_78727_a.field_78729_o.put(EntityPlayer.class, i);
            i.func_76976_a(RenderManager.field_78727_a);
         }

         int var5;
         Entity entity;
         for(var5 = 0; var5 < Data_Player.dataList.size(); ++var5) {
            Data_Player data = (Data_Player)Data_Player.dataList.get(var5);
            entity = Minecraft.func_71410_x().field_71441_e.func_73045_a(data.entityID);
            if (entity != null) {
               if (!data.entityType.equalsIgnoreCase(entity.func_70005_c_())) {
                  Data_Player.dataList.remove(data);
                  Data_Player.add(new Data_Player(entity.func_145782_y()));
                  BendsLogger.log("Reset entity", BendsLogger.DEBUG);
               } else {
                  data.motion_prev.set(data.motion);
                  data.motion.x = (float)entity.field_70165_t - data.position.x;
                  data.motion.y = (float)entity.field_70163_u - data.position.y;
                  data.motion.z = (float)entity.field_70161_v - data.position.z;
                  data.position = new Vector3f((float)entity.field_70165_t, (float)entity.field_70163_u, (float)entity.field_70161_v);
               }
            } else {
               Data_Player.dataList.remove(data);
               BendsLogger.log("No entity", BendsLogger.DEBUG);
            }
         }

         for(var5 = 0; var5 < Data_Zombie.dataList.size(); ++var5) {
            Data_Zombie var6 = (Data_Zombie)Data_Zombie.dataList.get(var5);
            entity = Minecraft.func_71410_x().field_71441_e.func_73045_a(var6.entityID);
            if (entity != null) {
               if (!var6.entityType.equalsIgnoreCase(entity.func_70005_c_())) {
                  Data_Zombie.dataList.remove(var6);
                  Data_Zombie.add(new Data_Zombie(entity.func_145782_y()));
                  BendsLogger.log("Reset entity", BendsLogger.DEBUG);
               } else {
                  var6.motion_prev.set(var6.motion);
                  var6.motion.x = (float)entity.field_70165_t - var6.position.x;
                  var6.motion.y = (float)entity.field_70163_u - var6.position.y;
                  var6.motion.z = (float)entity.field_70161_v - var6.position.z;
                  var6.position = new Vector3f((float)entity.field_70165_t, (float)entity.field_70163_u, (float)entity.field_70161_v);
               }
            } else {
               Data_Zombie.dataList.remove(var6);
               BendsLogger.log("No entity", BendsLogger.DEBUG);
            }
         }

         for(var5 = 0; var5 < Data_Spider.dataList.size(); ++var5) {
            Data_Spider var7 = (Data_Spider)Data_Spider.dataList.get(var5);
            entity = Minecraft.func_71410_x().field_71441_e.func_73045_a(var7.entityID);
            if (entity != null) {
               if (!var7.entityType.equalsIgnoreCase(entity.func_70005_c_())) {
                  Data_Spider.dataList.remove(var7);
                  Data_Spider.add(new Data_Spider(entity.func_145782_y()));
                  BendsLogger.log("Reset entity", BendsLogger.DEBUG);
               } else {
                  var7.motion_prev.set(var7.motion);
                  var7.motion.x = (float)entity.field_70165_t - var7.position.x;
                  var7.motion.y = (float)entity.field_70163_u - var7.position.y;
                  var7.motion.z = (float)entity.field_70161_v - var7.position.z;
                  var7.position = new Vector3f((float)entity.field_70165_t, (float)entity.field_70163_u, (float)entity.field_70161_v);
               }
            } else {
               Data_Spider.dataList.remove(var7);
               BendsLogger.log("No entity", BendsLogger.DEBUG);
            }
         }
      }

   }
}
