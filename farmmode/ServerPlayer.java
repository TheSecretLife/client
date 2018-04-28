package farmmode;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class ServerPlayer {
   public World world;
   Random rand = new Random();

   @SubscribeEvent
   public void CreatePlayer(EntityConstructing event) {
      if (event.entity instanceof EntityPlayer && StoreData.get((EntityPlayer)event.entity) == null) {
         StoreData.register((EntityPlayer)event.entity);
      }

   }

   @SubscribeEvent
   public void JoinWorld(EntityJoinWorldEvent event) {
      if (!event.entity.field_70170_p.field_72995_K && event.entity instanceof EntityPlayer) {
         StoreData.loadProxyData((EntityPlayer)event.entity);
         EntityPlayer player = (EntityPlayerMP)event.entity;
         StoreData var3 = StoreData.get(player);
      }

   }

   @SubscribeEvent
   public void Death(LivingDeathEvent event) {
      if (!event.entity.field_70170_p.field_72995_K && event.entity instanceof EntityPlayer) {
         EntityPlayer player = (EntityPlayerMP)event.entity;
         StoreData px = StoreData.get(player);
         StoreData.saveProxyData((EntityPlayer)event.entity);
      }

   }
}
