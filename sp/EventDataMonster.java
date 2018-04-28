package sp;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.event.entity.player.PlayerPickupXpEvent;
import sp.network.PacketDispatcher;
import sp.network.client.SyncPlayerPropsMessage;

public class EventDataMonster {
   @SubscribeEvent
   public void onEXPDrop(PlayerPickupXpEvent e) {
   }

   @SubscribeEvent
   public void onMonDead(LivingDeathEvent e) {
      if (!e.entityLiving.field_70170_p.field_72995_K && e.entityLiving instanceof EntityCustomMobBase) {
         if (e.source.func_76364_f() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)e.source.func_76364_f();
            int x = Integer.parseInt(e.entityLiving.func_70096_w().func_75681_e(25).split(",")[0]);
            int y = Integer.parseInt(e.entityLiving.func_70096_w().func_75681_e(25).split(",")[1]);
            int z = Integer.parseInt(e.entityLiving.func_70096_w().func_75681_e(25).split(",")[2]);
            if (player.field_70170_p.func_147438_o(x, y, z) instanceof SpawnBlockTileEntity) {
               if (((SpawnBlockTileEntity)player.field_70170_p.func_147438_o(x, y, z)).count > 0) {
                  --((SpawnBlockTileEntity)player.field_70170_p.func_147438_o(x, y, z)).count;
               }

               ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o(x, y, z)).func_145845_h();
               player.field_70170_p.func_147471_g(x, y, z);
               ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o(x, y, z)).func_70296_d();
            }
         } else {
            System.out.println("OK");
         }
      }

   }

   @SubscribeEvent
   public void onEntityJoinWorld(EntityJoinWorldEvent e) {
      if (!e.entity.field_70170_p.field_72995_K && e.entity instanceof EntityCustomMobBase) {
         ((EntityCustomMobBase)e.entity).func_70096_w().func_75692_b(23, ((EntityCustomMobBase)e.entity).item1 + "/" + ((EntityCustomMobBase)e.entity).item2 + "/" + ((EntityCustomMobBase)e.entity).item3 + "/" + ((EntityCustomMobBase)e.entity).item4 + "/" + ((EntityCustomMobBase)e.entity).item5 + "/" + ((EntityCustomMobBase)e.entity).item6 + "/" + ((EntityCustomMobBase)e.entity).item7 + "/" + ((EntityCustomMobBase)e.entity).item8 + "/" + ((EntityCustomMobBase)e.entity).item9);
         ((EntityCustomMobBase)e.entity).func_70096_w().func_75692_b(24, ((EntityCustomMobBase)e.entity).entityname + "," + ((EntityCustomMobBase)e.entity).mobname + "," + ((EntityCustomMobBase)e.entity).exp + "," + ((EntityCustomMobBase)e.entity).level + "," + ((EntityCustomMobBase)e.entity).hp + "," + ((EntityCustomMobBase)e.entity).damage + "," + ((EntityCustomMobBase)e.entity).money + "," + ((EntityCustomMobBase)e.entity).movespeed);
         ((EntityCustomMobBase)e.entity).func_70096_w().func_75692_b(25, ((EntityCustomMobBase)e.entity).xx + "," + ((EntityCustomMobBase)e.entity).yy + "," + ((EntityCustomMobBase)e.entity).zz + "," + ((EntityCustomMobBase)e.entity).atk);
         NBTTagCompound properties = new NBTTagCompound();
         properties.func_74768_a("exp", ((EntityCustomMobBase)e.entity).exp);
         properties.func_74768_a("level", ((EntityCustomMobBase)e.entity).level);
         properties.func_74768_a("hp", ((EntityCustomMobBase)e.entity).hp);
         properties.func_74768_a("money", ((EntityCustomMobBase)e.entity).money);
         properties.func_74768_a("damage", ((EntityCustomMobBase)e.entity).damage);
         properties.func_74776_a("movespeed", ((EntityCustomMobBase)e.entity).movespeed);
         properties.func_74778_a("entityname", ((EntityCustomMobBase)e.entity).entityname);
         properties.func_74778_a("mobname", ((EntityCustomMobBase)e.entity).mobname);
         properties.func_74768_a("xx", ((EntityCustomMobBase)e.entity).xx);
         properties.func_74768_a("yy", ((EntityCustomMobBase)e.entity).yy);
         properties.func_74768_a("zz", ((EntityCustomMobBase)e.entity).zz);
         properties.func_74778_a("item3", ((EntityCustomMobBase)e.entity).item1);
         properties.func_74778_a("item4", ((EntityCustomMobBase)e.entity).item2);
         properties.func_74778_a("item5", ((EntityCustomMobBase)e.entity).item3);
         properties.func_74778_a("item6", ((EntityCustomMobBase)e.entity).item4);
         properties.func_74778_a("item7", ((EntityCustomMobBase)e.entity).item5);
         properties.func_74778_a("item8", ((EntityCustomMobBase)e.entity).item6);
         properties.func_74778_a("item9", ((EntityCustomMobBase)e.entity).item7);
         properties.func_74778_a("item10", ((EntityCustomMobBase)e.entity).item8);
         properties.func_74778_a("item11", ((EntityCustomMobBase)e.entity).item9);
         properties.func_74768_a("atk", ((EntityCustomMobBase)e.entity).atk);
         ((EntityCustomMobBase)e.entity).func_70691_i(1.0E12F);
         PacketDispatcher.sendToAllAround(new SyncPlayerPropsMessage((EntityLiving)e.entity, e.entity.func_145782_y(), properties), e.entity.field_70170_p.field_73011_w.field_76574_g, e.entity.field_70165_t, e.entity.field_70163_u, e.entity.field_70161_v, 50.0D);
      }

   }

   @SubscribeEvent
   public void onSpawn(LivingSpawnEvent e) {
      if (e.entity instanceof EntityCustomMobBase) {
         ((EntityCustomMobBase)e.entity).func_70691_i(1.0E12F);
         ((EntityCustomMobBase)e.entity).func_70606_j(((EntityCustomMobBase)e.entity).func_110138_aP());
      }

   }
}
