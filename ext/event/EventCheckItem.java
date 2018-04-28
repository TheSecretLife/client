package ext.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class EventCheckItem {
   @SubscribeEvent
   public void onEntityJoinWorldItem(EntityJoinWorldEvent e) {
      if (e.entity != null && e.entity instanceof EntityPlayer && !e.entity.field_70170_p.field_72995_K) {
         ;
      }

   }

   @SubscribeEvent
   public void onDeathItem(LivingDeathEvent e) {
      if (e.entity != null && e.entity instanceof EntityPlayer && !e.entity.field_70170_p.field_72995_K) {
         ;
      }

   }

   @SubscribeEvent
   public void onLivingsUpdateItem(LivingUpdateEvent e) {
      if (e.entity != null && e.entity instanceof EntityPlayer && !e.entity.field_70170_p.field_72995_K) {
         ;
      }

   }

   public void getCheckItem(ItemStack item, EntityPlayer player, int slotnumber) {
   }
}
