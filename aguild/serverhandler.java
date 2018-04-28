package aguild;

import aguild.guildwar.enwar;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerEvent.StartTracking;

public class serverhandler {
   private Random rand = new Random();

   @SubscribeEvent
   public void onregis(EntityConstructing event) {
      if (event.entity instanceof EntityPlayer && playerdata.get((EntityPlayer)event.entity) == null) {
         playerdata.register((EntityPlayer)event.entity);
      }

   }

   @SubscribeEvent
   public void joinworld(EntityJoinWorldEvent event) {
      if (event.entity instanceof EntityPlayer) {
         EntityPlayer player = (EntityPlayer)event.entity;
         if (!player.field_70170_p.field_72995_K) {
            playerdata.loadProxyData(player);
         }
      }

   }

   @SubscribeEvent
   public void deathevent(LivingDeathEvent event) {
      EntityPlayer player;
      if (event.entity instanceof EntityPlayer) {
         player = (EntityPlayer)event.entity;
         if (!player.field_70170_p.field_72995_K) {
            playerdata.saveProxyData((EntityPlayer)event.entity);
         }
      }

      if (event.source.func_76346_g() instanceof EntityPlayer) {
         player = (EntityPlayer)event.source.func_76346_g();
         playerdata px = playerdata.get(player);
         if (!player.field_70170_p.field_72995_K) {
            WorldData wdata;
            NBTTagCompound worldtag;
            String oriname;
            String gname;
            int nlv;
            int lv;
            if (px.inguild && event.entityLiving instanceof EntityPlayer) {
               wdata = WorldData.forWorld(player.field_70170_p);
               worldtag = wdata.getData();
               oriname = px.guildname;
               gname = px.guildname.toLowerCase();
               nlv = worldtag.func_74762_e("point" + gname);
               worldtag.func_74768_a("point" + gname, nlv + 1);
               wdata.func_76185_a();
               lv = worldtag.func_74762_e("point" + gname);
               player.func_145747_a(new ChatComponentText("§eได้รับคะแนนกิล +§b1 §eคะแนนกิลตอนนี้คือ §6" + lv));
            }

            if (px.cdwar > 0) {
               --px.cdwar;
            }

            if (px.inguild) {
               wdata = WorldData.forWorld(player.field_70170_p);
               worldtag = wdata.getData();
               oriname = px.guildname;
               gname = px.guildname.toLowerCase();
               int i;
               if (event.entityLiving instanceof EntityPlayer || event.entityLiving instanceof enwar) {
                  nlv = worldtag.func_74762_e("exp" + gname);
                  worldtag.func_74768_a("exp" + gname, nlv + 3);
                  lv = worldtag.func_74762_e("lv" + gname);
                  i = worldtag.func_74762_e("exp" + gname);
                  if (i >= lv * 300) {
                     worldtag.func_74768_a("exp" + gname, 0);
                     worldtag.func_74768_a("lv" + gname, lv + 1);
                  }
               }

               wdata.func_76185_a();
               if (px.openbuff) {
                  nlv = worldtag.func_74762_e("lv" + gname);
                  if (nlv == 10) {
                     player.func_70691_i(player.func_110138_aP() / 10.0F);
                     player.func_145747_a(new ChatComponentText("§7ฟื้นฟูเลือด 10% จากการฆ่าศัตรู เพราะบัฟกิล Lv10"));
                  }
               }

               int npoint;
               if (event.entityLiving != null && event.entityLiving instanceof EntityPlayer) {
                  EntityPlayer target = (EntityPlayer)event.entityLiving;
                  playerdata tx = playerdata.get(target);
                  String enemy = worldtag.func_74779_i("enemy" + gname);
                  if (tx.inguild && tx.guildname.equalsIgnoreCase(enemy)) {
                     npoint = worldtag.func_74762_e("exp" + gname);
                     int kexp = worldtag.func_74762_e("exp" + enemy);
                     if (npoint > 2 && kexp > 2) {
                        worldtag.func_74768_a("exp" + gname, npoint + 2);
                        worldtag.func_74768_a("exp" + enemy, kexp - 2);
                        wdata.func_76185_a();
                        player.func_145747_a(new ChatComponentText("§aได้รับแต้ม §eEXP Guild +2 §aจากการฆ่ากิลศัตรู"));
                        target.func_145747_a(new ChatComponentText("§cเสียแต้ม §eEXP Guild -2 §cจากการถูกกิลศัตรูฆ่า"));
                     } else {
                        player.func_145747_a(new ChatComponentText("§cไม่ได้รับแต้ม EXP Guild เพราะกิลท่านหรือศัตรู มี exp น้อยกว่า 2 แต้ม"));
                     }
                  }
               }

               if (event.entityLiving != null && event.entityLiving instanceof enwar) {
                  enwar en = (enwar)event.entityLiving;
                  List players = MinecraftServer.func_71276_C().func_71203_ab().field_72404_b;
                  EntityPlayer target;
                  if (px.inguild) {
                     for(i = 0; i < players.size(); ++i) {
                        target = (EntityPlayer)players.get(i);
                        playerdata tx = playerdata.get(target);
                        if (tx.inguild && tx.guildname.equalsIgnoreCase(px.guildname) && target.field_71071_by.func_70447_i() >= 0) {
                           target.field_71071_by.func_70441_a(new ItemStack(mod.reward));
                           target.func_145747_a(new ChatComponentText("§aได้รับ §6ตราชนะสงคราม §aจากการชนะสงครามหินกิล"));
                        }
                     }

                     i = worldtag.func_74762_e("point" + gname);
                     worldtag.func_74768_a("point" + gname, i + 5);
                     worldtag.func_74757_a("warstats", false);
                     wdata.func_76185_a();
                     npoint = worldtag.func_74762_e("point" + gname);
                     player.func_145747_a(new ChatComponentText("§eได้รับคะแนนกิล +§b5 §eคะแนนกิลตอนนี้คือ §6" + npoint));
                  }

                  for(i = 0; i < players.size(); ++i) {
                     target = (EntityPlayer)players.get(i);
                     target.func_145747_a(new ChatComponentText("§aกิล §6" + px.guildname + " §aชนะสงคราม"));
                  }
               }
            }
         }
      }

   }

   @SubscribeEvent
   public void Living(LivingUpdateEvent event) {
      if (event.entity instanceof EntityPlayer) {
         World world = event.entity.field_70170_p;
         EntityPlayer player = (EntityPlayer)event.entity;
         playerdata px = playerdata.get(player);
         if (px.cdinvite > 0) {
            --px.cdinvite;
         }

         if (!world.field_72995_K) {
            px.openbuff = true;
            WorldData wdata = WorldData.forWorld(world);
            NBTTagCompound worldtag = wdata.getData();
            String oriname = px.guildname;
            String gname = px.guildname.toLowerCase();
            String cname = worldtag.func_74779_i("guild" + gname);
            String chost = worldtag.func_74779_i("host" + gname);
            String mem01 = worldtag.func_74779_i("mem01" + gname);
            String mem02 = worldtag.func_74779_i("mem02" + gname);
            String mem03 = worldtag.func_74779_i("mem03" + gname);
            String mem04 = worldtag.func_74779_i("mem04" + gname);
            String mem05 = worldtag.func_74779_i("mem05" + gname);
            String mem06 = worldtag.func_74779_i("mem06" + gname);
            String mem07 = worldtag.func_74779_i("mem07" + gname);
            String mem08 = worldtag.func_74779_i("mem08" + gname);
            String mem09 = worldtag.func_74779_i("mem09" + gname);
            String mem10 = worldtag.func_74779_i("mem10" + gname);
            String mem11 = worldtag.func_74779_i("mem11" + gname);
            String mem12 = worldtag.func_74779_i("mem12" + gname);
            String mem13 = worldtag.func_74779_i("mem13" + gname);
            String mem14 = worldtag.func_74779_i("mem14" + gname);
            String mem15 = worldtag.func_74779_i("mem15" + gname);
            String mem16 = worldtag.func_74779_i("mem16" + gname);
            String mem17 = worldtag.func_74779_i("mem17" + gname);
            String mem18 = worldtag.func_74779_i("mem18" + gname);
            String mem19 = worldtag.func_74779_i("mem19" + gname);
            String mem20 = worldtag.func_74779_i("mem20" + gname);
            String mem21 = worldtag.func_74779_i("mem21" + gname);
            String mem22 = worldtag.func_74779_i("mem22" + gname);
            String mem23 = worldtag.func_74779_i("mem23" + gname);
            String mem24 = worldtag.func_74779_i("mem24" + gname);
            String mem25 = worldtag.func_74779_i("mem25" + gname);
            String mem26 = worldtag.func_74779_i("mem26" + gname);
            String mem27 = worldtag.func_74779_i("mem27" + gname);
            String mem28 = worldtag.func_74779_i("mem28" + gname);
            String mem29 = worldtag.func_74779_i("mem29" + gname);
            int lv = worldtag.func_74762_e("lv" + gname);
            int exp = worldtag.func_74762_e("exp" + gname);
            if (exp >= lv * 300) {
               worldtag.func_74768_a("exp" + gname, 0);
               worldtag.func_74768_a("lv" + gname, lv + 1);
            }

            worldtag.func_74767_n("winwar" + gname);
            if (px.inguild) {
               if (px.openbuff) {
                  if (lv >= 2) {
                     player.func_70690_d(new PotionEffect(Potion.field_76422_e.func_76396_c(), 20, 1));
                  }

                  if (lv >= 4) {
                     player.func_70690_d(new PotionEffect(Potion.field_76424_c.func_76396_c(), 20, 1));
                  }
               }

               if (cname.equalsIgnoreCase(gname)) {
                  if (px.host) {
                     if (!player.func_70005_c_().equalsIgnoreCase(chost)) {
                        px.inguild = false;
                        px.host = false;
                        px.guildname = "";
                     }
                  } else if (!mem01.equalsIgnoreCase(player.func_70005_c_()) && !mem02.equalsIgnoreCase(player.func_70005_c_()) && !mem03.equalsIgnoreCase(player.func_70005_c_()) && !mem04.equalsIgnoreCase(player.func_70005_c_()) && !mem05.equalsIgnoreCase(player.func_70005_c_()) && !mem06.equalsIgnoreCase(player.func_70005_c_()) && !mem07.equalsIgnoreCase(player.func_70005_c_()) && !mem08.equalsIgnoreCase(player.func_70005_c_()) && !mem09.equalsIgnoreCase(player.func_70005_c_()) && !mem10.equalsIgnoreCase(player.func_70005_c_()) && !mem11.equalsIgnoreCase(player.func_70005_c_()) && !mem12.equalsIgnoreCase(player.func_70005_c_()) && !mem13.equalsIgnoreCase(player.func_70005_c_()) && !mem14.equalsIgnoreCase(player.func_70005_c_()) && !mem15.equalsIgnoreCase(player.func_70005_c_()) && !mem16.equalsIgnoreCase(player.func_70005_c_()) && !mem17.equalsIgnoreCase(player.func_70005_c_()) && !mem18.equalsIgnoreCase(player.func_70005_c_()) && !mem19.equalsIgnoreCase(player.func_70005_c_()) && !mem20.equalsIgnoreCase(player.func_70005_c_()) && !mem21.equalsIgnoreCase(player.func_70005_c_()) && !mem22.equalsIgnoreCase(player.func_70005_c_()) && !mem23.equalsIgnoreCase(player.func_70005_c_()) && !mem24.equalsIgnoreCase(player.func_70005_c_()) && !mem25.equalsIgnoreCase(player.func_70005_c_()) && !mem26.equalsIgnoreCase(player.func_70005_c_()) && !mem27.equalsIgnoreCase(player.func_70005_c_()) && !mem28.equalsIgnoreCase(player.func_70005_c_()) && !mem29.equalsIgnoreCase(player.func_70005_c_())) {
                     px.inguild = false;
                     px.host = false;
                     px.guildname = "";
                  }
               } else {
                  px.inguild = false;
                  px.host = false;
                  px.guildname = "";
               }
            }
         }
      }

   }

   @SubscribeEvent
   public void incomingPlayer(StartTracking event) {
      if (event.target != null && event.target instanceof EntityPlayer) {
         EntityPlayer player = (EntityPlayer)event.target;
         playerdata data = playerdata.get(player);
         if (!player.field_70170_p.field_72995_K && event.entityPlayer != null) {
            mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)event.entityPlayer);
         }
      }

   }

   @SubscribeEvent
   public void PlayerDamage(LivingHurtEvent evt) {
      EntityPlayer player;
      playerdata px;
      if (evt.entityLiving != null && evt.entityLiving instanceof EntityPlayer) {
         player = (EntityPlayer)evt.entityLiving;
         px = playerdata.get(player);
         if (px.inguild && px.openbuff) {
            int def = 0;
            if (px.guildlv >= 6) {
               def = (int)(evt.ammount / 10.0F);
               if (player.field_70170_p.field_72995_K) {
                  player.func_145747_a(new ChatComponentText("§7ป้องกันพลังโจมตี จากบัฟกิลได้ 10%"));
               }
            }

            if (px.winwar) {
               def += (int)(evt.ammount / 10.0F);
            }

            evt.ammount -= (float)def;
            if (evt.ammount < 0.0F) {
               evt.ammount = 0.0F;
            }
         }
      }

      if (evt.source.func_76346_g() != null && evt.source.func_76346_g() instanceof EntityPlayer) {
         player = (EntityPlayer)evt.source.func_76346_g();
         px = playerdata.get(player);
         if (!player.field_70170_p.field_72995_K) {
            px.damage = (int)evt.ammount;
         }
      }

   }

   @SubscribeEvent
   public void attack(AttackEntityEvent evt) {
      EntityPlayer player = evt.entityPlayer;
      playerdata px = playerdata.get(player);
      if (px.inguild) {
         WorldData wdata = WorldData.forWorld(player.field_70170_p);
         NBTTagCompound worldtag = wdata.getData();
         String oriname = px.guildname;
         String gname = px.guildname.toLowerCase();
         int lv = worldtag.func_74762_e("lv" + gname);
         worldtag.func_74762_e("exp" + gname);
         boolean win = worldtag.func_74767_n("winwar" + gname);
         int damage = true;
         int damage;
         if (px.openbuff) {
            if (lv >= 8) {
               damage = 11;
               if (player.field_70170_p.field_72995_K) {
                  player.func_145747_a(new ChatComponentText("§7พลังโจมตีพื้นฐาน +10 จากบัฟกิล"));
               }
            } else {
               damage = 1;
            }

            if (win) {
               damage += 10;
            }
         } else {
            damage = 1;
         }

         player.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a((double)damage);
      } else {
         player.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(1.0D);
      }

   }
}
