package cabalaccessorys.client;

import cabalaccessorys.RegisterItem;
import cabalaccessorys.data.PlayerData;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

public class EventHandlerItemTooltip {
   @SubscribeEvent
   public void onTooltip(ItemTooltipEvent event) {
      NBTTagCompound itemdata = event.itemStack.field_77990_d;
      if (itemdata == null) {
         itemdata = new NBTTagCompound();
      }

      PlayerData px = PlayerData.get(event.entityPlayer);
      int Attack = itemdata.func_74762_e("Attack");
      int Defend = itemdata.func_74762_e("Defend");
      int CriticalRate = itemdata.func_74762_e("CriticalRate");
      int CriticalDamage = itemdata.func_74762_e("CriticalDamage");
      int BloodSteal = itemdata.func_74762_e("BloodSteal");
      int Evasion = itemdata.func_74762_e("Evasion");
      int AttackAmp = itemdata.func_74762_e("AttackAmp");
      int ResistCriticalRate = itemdata.func_74762_e("ResistCriticalRate");
      int ResistBloodSteal = itemdata.func_74762_e("ResistBloodSteal");
      int Accuracy = itemdata.func_74762_e("Accuracy");
      int Piercing = itemdata.func_74762_e("Piercing");
      int ResistAttackAmp = itemdata.func_74762_e("ResistAttackAmp");
      int oAttack = itemdata.func_74762_e("oAttack");
      int oDefend = itemdata.func_74762_e("oDefend");
      int oCriticalRate = itemdata.func_74762_e("oCriticalRate");
      int oCriticalDamage = itemdata.func_74762_e("oCriticalDamage");
      int oBloodSteal = itemdata.func_74762_e("oBloodSteal");
      int oEvasion = itemdata.func_74762_e("oEvasion");
      int oAttackAmp = itemdata.func_74762_e("oAttackAmp");
      int oResistCriticalRate = itemdata.func_74762_e("oResistCriticalRate");
      int oResistBloodSteal = itemdata.func_74762_e("oResistBloodSteal");
      int oAccuracy = itemdata.func_74762_e("oAccuracy");
      int oPiercing = itemdata.func_74762_e("oPiercing");
      int oResistAttackAmp = itemdata.func_74762_e("oResistAttackAmp");
      int cAttack = itemdata.func_74762_e("cAttack");
      boolean slotop1 = itemdata.func_74767_n("slotop1");
      boolean slotop2 = itemdata.func_74767_n("slotop2");
      int Slot = itemdata.func_74762_e("Slot");
      int slotnum = itemdata.func_74762_e("slotnum");
      int LevelReq = itemdata.func_74762_e("LevelReq");
      boolean craft = itemdata.func_74767_n("craft");
      String owner = itemdata.func_74779_i("owner");
      if (itemdata.func_74764_b("LevelReq") && LevelReq > 0) {
         if (px.Level < LevelReq) {
            event.toolTip.add("§cต้องมี Level " + LevelReq + " ถึงจะใช้งานได้");
         } else {
            event.toolTip.add("§aคุณมี Level " + LevelReq + " หรือมากกว่า สามารถใช้งานได้");
         }
      }

      int job = itemdata.func_74762_e("job");
      if (itemdata.func_74764_b("job") && job > 0) {
         if (px.job == job) {
            event.toolTip.add("§aอาชีพของคุณใช้ได้");
         } else if (job == 1) {
            event.toolTip.add("§cอาชีพที่ต้องการ: §aWarrior");
         } else if (job == 2) {
            event.toolTip.add("§cอาชีพที่ต้องการ: §aViking");
         } else if (job == 3) {
            event.toolTip.add("§cอาชีพที่ต้องการ: §aAssassin");
         }
      }

      if (itemdata.func_74764_b("Slot") && Slot == 1) {
         if (slotnum == 2) {
            if (!slotop1 && !slotop2) {
               event.toolTip.add("§7█ █");
            } else if (slotop1 && !slotop2) {
               event.toolTip.add("§a█ §7█");
            } else if (!slotop1 && slotop2) {
               event.toolTip.add("§7█ §a█");
            } else {
               event.toolTip.add("§a█ █");
            }
         } else if (slotnum == 1) {
            if (!slotop1) {
               event.toolTip.add("§7█");
            } else {
               event.toolTip.add("§a█");
            }
         }
      }

      if (itemdata.func_74764_b("HP")) {
         event.toolTip.add("§7เลือด: §a" + itemdata.func_74762_e("HP"));
      }

      if (itemdata.func_74764_b("Attack") && Attack != 0) {
         event.toolTip.add("§7พลังโจมตี: §a" + (Attack - cAttack - oAttack));
      }

      if (itemdata.func_74764_b("cAttack") && cAttack != 0) {
         event.toolTip.add("§7พลังโจมตี: §a" + cAttack);
      }

      if (itemdata.func_74764_b("Defend") && Defend - oDefend != 0) {
         event.toolTip.add("§7ป้องกัน: §a" + (Defend - oDefend));
      }

      if (itemdata.func_74764_b("CriticalRate") && CriticalRate - oCriticalRate != 0) {
         event.toolTip.add("§7โอกาสคริติคอล: §a" + (CriticalRate - oCriticalRate));
      }

      if (itemdata.func_74764_b("CriticalDamage") && CriticalDamage - oCriticalDamage != 0) {
         event.toolTip.add("§7คริดาเมจ: §a" + (CriticalDamage - oCriticalDamage));
      }

      if (itemdata.func_74764_b("Evasion") && Evasion - oEvasion != 0) {
         event.toolTip.add("§7การหลบหลีก: §a" + (Evasion - oEvasion));
      }

      if (itemdata.func_74764_b("BloodSteal") && BloodSteal - oBloodSteal != 0) {
         event.toolTip.add("§7ดูดเลือด: §a" + (BloodSteal - oBloodSteal));
      }

      if (itemdata.func_74764_b("AttackAmp") && AttackAmp - oAttackAmp != 0) {
         event.toolTip.add("§7AttackAmp: §a" + (AttackAmp - oAttackAmp));
      }

      if (itemdata.func_74764_b("ResistCriticalRate") && ResistCriticalRate - oResistCriticalRate != 0) {
         event.toolTip.add("§7ต้านโอกาสคริ: §a" + (ResistCriticalRate - oResistCriticalRate));
      }

      if (itemdata.func_74764_b("ResistCriticalDamage")) {
         event.toolTip.add("§7ต้านการคริดาเมจ: §a" + itemdata.func_74762_e("ResistCriticalDamage"));
      }

      if (itemdata.func_74764_b("ResistPiercing")) {
         event.toolTip.add("§7ต้านสะท้อน: §a" + itemdata.func_74762_e("ResistPiercing"));
      }

      if (itemdata.func_74764_b("ResistBloodSteal") && ResistBloodSteal - oResistBloodSteal != 0) {
         event.toolTip.add("§7ต้านการดูดเลือด: §a" + (ResistBloodSteal - oResistBloodSteal));
      }

      if (itemdata.func_74764_b("Accuracy") && Accuracy - oAccuracy != 0) {
         event.toolTip.add("§7แม่นยำ: §a" + (Accuracy - oAccuracy));
      }

      if (itemdata.func_74764_b("Piercing") && Piercing - oPiercing != 0) {
         event.toolTip.add("§7สะท้อนดาเมจ: §a" + (Piercing - oPiercing));
      }

      if (itemdata.func_74764_b("ResistAttackAmp") && ResistAttackAmp - oResistAttackAmp != 0) {
         event.toolTip.add("§7ต้านความเสียหาย: §a" + (ResistAttackAmp - oResistAttackAmp));
      }

      if (itemdata.func_74764_b("oAttack") && oAttack != 0) {
         event.toolTip.add("§7Attack: §a" + oAttack);
      }

      if (itemdata.func_74764_b("oDefend") && oDefend != 0) {
         event.toolTip.add("§7ป้องกัน: §a" + oDefend);
      }

      if (itemdata.func_74764_b("oCriticalRate") && oCriticalRate != 0) {
         event.toolTip.add("§7โอกาสคริติคอล: §a" + oCriticalRate);
      }

      if (itemdata.func_74764_b("oCriticalDamage") && oCriticalDamage != 0) {
         event.toolTip.add("§7คริดาเมจ: §a" + oCriticalDamage);
      }

      if (itemdata.func_74764_b("oEvasion") && oEvasion != 0) {
         event.toolTip.add("§7การหลบหลีก: §a" + oEvasion);
      }

      if (itemdata.func_74764_b("oBloodSteal") && oBloodSteal != 0) {
         event.toolTip.add("§7ดูดเลือด: §a" + oBloodSteal);
      }

      if (itemdata.func_74764_b("oAttackAmp") && oAttackAmp != 0) {
         event.toolTip.add("§7AttackAmp: §a" + oAttackAmp);
      }

      if (itemdata.func_74764_b("oResistCriticalRate") && oResistCriticalRate != 0) {
         event.toolTip.add("§7ต้านโอกาสคริ: §a" + oResistCriticalRate);
      }

      if (itemdata.func_74764_b("oResistBloodSteal") && oResistBloodSteal != 0) {
         event.toolTip.add("§7ต้านการดูดเลือด: §a" + oResistBloodSteal);
      }

      if (itemdata.func_74764_b("oAccuracy") && oAccuracy != 0) {
         event.toolTip.add("§7แม่นยำ: §a" + oAccuracy);
      }

      if (itemdata.func_74764_b("oPiercing") && oPiercing != 0) {
         event.toolTip.add("§7สะท้อนดาเมจ: §a" + oPiercing);
      }

      if (itemdata.func_74764_b("oResistAttackAmp") && oResistAttackAmp != 0) {
         event.toolTip.add("§7ต้านความเสียหาย: §a" + oResistAttackAmp);
      }

      if (itemdata.func_74764_b("lore1")) {
         event.toolTip.add(itemdata.func_74779_i("lore").replaceAll("&", "§"));
      }

      if (itemdata.func_74764_b("lore2")) {
         event.toolTip.add(itemdata.func_74779_i("lore2").replaceAll("&", "§"));
      }

      if (itemdata.func_74764_b("lore3")) {
         event.toolTip.add(itemdata.func_74779_i("lore3").replaceAll("&", "§"));
      }

      if (itemdata.func_74764_b("lore4")) {
         event.toolTip.add(itemdata.func_74779_i("lore4").replaceAll("&", "§"));
      }

      if (itemdata.func_74764_b("lore5")) {
         event.toolTip.add(itemdata.func_74779_i("lore5").replaceAll("&", "§"));
      }

      if (itemdata.func_74764_b("lore6")) {
         event.toolTip.add(itemdata.func_74779_i("lore6").replaceAll("&", "§"));
      }

      if (itemdata.func_74764_b("lore7")) {
         event.toolTip.add(itemdata.func_74779_i("lore7").replaceAll("&", "§"));
      }

      if (itemdata.func_74764_b("lore8")) {
         event.toolTip.add(itemdata.func_74779_i("lore8").replaceAll("&", "§"));
      }

      if (itemdata.func_74764_b("lore9")) {
         event.toolTip.add(itemdata.func_74779_i("lore9").replaceAll("&", "§"));
      }

      if (itemdata.func_74764_b("lore10")) {
         event.toolTip.add(itemdata.func_74779_i("lore10").replaceAll("&", "§"));
      }

      if (itemdata.func_74764_b("money") && event.itemStack.func_77973_b() != RegisterItem.coin1) {
         event.toolTip.add("§6Gold: §b" + itemdata.func_74762_e("money"));
      }

      if (itemdata.func_74764_b("price")) {
         event.toolTip.add("§cราคา: §b" + itemdata.func_74762_e("price"));
      }

      if (itemdata.func_74764_b("point")) {
         event.toolTip.add("§cราคาพ้อย: §b" + itemdata.func_74762_e("point"));
      }

      if (itemdata.func_74764_b("percent") && event.entityPlayer.field_71075_bZ.field_75098_d) {
         event.toolTip.add("§cโอกาสดรอป: §b" + itemdata.func_74762_e("percent"));
      }

   }
}
