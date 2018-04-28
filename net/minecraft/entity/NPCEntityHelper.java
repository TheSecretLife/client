package net.minecraft.entity;

import net.minecraft.item.Item;

public class NPCEntityHelper {
   public static Item getDropItem(EntityLiving entity) {
      return entity.func_146068_u();
   }

   public static void setRecentlyHit(EntityLivingBase entity) {
      entity.field_70718_bc = 100;
   }
}
