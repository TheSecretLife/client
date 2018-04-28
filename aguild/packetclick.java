package aguild;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;

public class packetclick extends packetmod {
   public static int Slot;
   public static String st1;
   public static Random rand = new Random();
   public static int int1;

   public packetclick(int guiID, String st1, int i1) {
      Slot = guiID;
      st1 = st1;
      int1 = i1;
   }

   public packetclick() {
      this(0, "", 0);
   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(int1);
      buf.writeInt(Slot);
      ByteBufUtils.writeUTF8String(buf, st1);
   }

   public void fromBytes(ByteBuf buf) {
      int1 = buf.readInt();
      Slot = buf.readInt();
      st1 = ByteBufUtils.readUTF8String(buf);
   }

   public static class Handler implements IMessageHandler {
      public IMessage onMessage(packetclick message, MessageContext ctx) {
         EntityPlayer player = ctx.getServerHandler().field_147369_b;
         playerdata px = playerdata.get(player);
         WorldData wdata = WorldData.forWorld(player.field_70170_p);
         NBTTagCompound worldtag = wdata.getData();
         if (!player.field_70170_p.field_72995_K) {
            String gname;
            String gname;
            String oriname;
            String gname;
            String ihaswar;
            String mem04;
            String name;
            String mem06;
            String mem07;
            String mem08;
            String mem09;
            String mem10;
            String mem11;
            String mem12;
            String mem13;
            String mem14;
            String mem15;
            String mem16;
            String mem17;
            String mem18;
            String mem19;
            String mem20;
            String mem21;
            String mem22;
            String mem23;
            String mem24;
            String mem25;
            String mem26;
            String mem27;
            String mem28;
            String mem29;
            if (packetclick.Slot == 1) {
               if (px.inguild) {
                  if (px.host) {
                     gname = px.guildname;
                     gname = px.guildname.toLowerCase();
                     worldtag.func_82580_o("guild" + gname);
                     worldtag.func_82580_o("host" + gname);
                     worldtag.func_82580_o("mem01" + gname);
                     worldtag.func_82580_o("mem02" + gname);
                     worldtag.func_82580_o("mem03" + gname);
                     worldtag.func_82580_o("mem04" + gname);
                     worldtag.func_82580_o("mem05" + gname);
                     worldtag.func_82580_o("mem06" + gname);
                     worldtag.func_82580_o("mem07" + gname);
                     worldtag.func_82580_o("mem08" + gname);
                     worldtag.func_82580_o("mem09" + gname);
                     worldtag.func_82580_o("mem10" + gname);
                     worldtag.func_82580_o("mem11" + gname);
                     worldtag.func_82580_o("mem12" + gname);
                     worldtag.func_82580_o("mem13" + gname);
                     worldtag.func_82580_o("mem14" + gname);
                     worldtag.func_82580_o("mem15" + gname);
                     worldtag.func_82580_o("mem16" + gname);
                     worldtag.func_82580_o("mem17" + gname);
                     worldtag.func_82580_o("mem18" + gname);
                     worldtag.func_82580_o("mem19" + gname);
                     worldtag.func_82580_o("mem20" + gname);
                     worldtag.func_82580_o("mem21" + gname);
                     worldtag.func_82580_o("mem22" + gname);
                     worldtag.func_82580_o("mem23" + gname);
                     worldtag.func_82580_o("mem24" + gname);
                     worldtag.func_82580_o("mem25" + gname);
                     worldtag.func_82580_o("mem26" + gname);
                     worldtag.func_82580_o("mem27" + gname);
                     worldtag.func_82580_o("mem28" + gname);
                     worldtag.func_82580_o("mem29" + gname);
                     oriname = worldtag.func_74779_i("enemy" + gname);
                     worldtag.func_82580_o("enemy" + oriname);
                     worldtag.func_82580_o("enemy" + gname);
                     wdata.func_76185_a();
                     mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
                     wdata.func_76185_a();
                     px.inguild = false;
                     px.host = false;
                     px.guildname = "";
                     player.func_145747_a(new ChatComponentText("§aสลายกิล §6" + gname + " §aสำเร็จแล้ว"));
                  } else {
                     gname = px.guildname;
                     gname = px.guildname.toLowerCase();
                     oriname = worldtag.func_74779_i("mem01" + gname);
                     gname = worldtag.func_74779_i("mem02" + gname);
                     ihaswar = worldtag.func_74779_i("mem03" + gname);
                     mem04 = worldtag.func_74779_i("mem04" + gname);
                     name = worldtag.func_74779_i("mem05" + gname);
                     mem06 = worldtag.func_74779_i("mem06" + gname);
                     mem07 = worldtag.func_74779_i("mem07" + gname);
                     mem08 = worldtag.func_74779_i("mem08" + gname);
                     mem09 = worldtag.func_74779_i("mem09" + gname);
                     mem10 = worldtag.func_74779_i("mem10" + gname);
                     mem11 = worldtag.func_74779_i("mem11" + gname);
                     mem12 = worldtag.func_74779_i("mem12" + gname);
                     mem13 = worldtag.func_74779_i("mem13" + gname);
                     mem14 = worldtag.func_74779_i("mem14" + gname);
                     mem15 = worldtag.func_74779_i("mem15" + gname);
                     mem16 = worldtag.func_74779_i("mem16" + gname);
                     mem17 = worldtag.func_74779_i("mem17" + gname);
                     mem18 = worldtag.func_74779_i("mem18" + gname);
                     mem19 = worldtag.func_74779_i("mem19" + gname);
                     mem20 = worldtag.func_74779_i("mem20" + gname);
                     mem21 = worldtag.func_74779_i("mem21" + gname);
                     mem22 = worldtag.func_74779_i("mem22" + gname);
                     mem23 = worldtag.func_74779_i("mem23" + gname);
                     mem24 = worldtag.func_74779_i("mem24" + gname);
                     mem25 = worldtag.func_74779_i("mem25" + gname);
                     mem26 = worldtag.func_74779_i("mem26" + gname);
                     mem27 = worldtag.func_74779_i("mem27" + gname);
                     mem28 = worldtag.func_74779_i("mem28" + gname);
                     mem29 = worldtag.func_74779_i("mem29" + gname);
                     if (player.func_70005_c_().equalsIgnoreCase(oriname)) {
                        worldtag.func_82580_o("mem01" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(gname)) {
                        worldtag.func_82580_o("mem02" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(ihaswar)) {
                        worldtag.func_82580_o("mem03" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem04)) {
                        worldtag.func_82580_o("mem04" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(name)) {
                        worldtag.func_82580_o("mem05" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem06)) {
                        worldtag.func_82580_o("mem06" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem07)) {
                        worldtag.func_82580_o("mem07" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem08)) {
                        worldtag.func_82580_o("mem08" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem09)) {
                        worldtag.func_82580_o("mem09" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem10)) {
                        worldtag.func_82580_o("mem10" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem11)) {
                        worldtag.func_82580_o("mem11" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem12)) {
                        worldtag.func_82580_o("mem12" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem13)) {
                        worldtag.func_82580_o("mem13" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem14)) {
                        worldtag.func_82580_o("mem14" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem15)) {
                        worldtag.func_82580_o("mem15" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem16)) {
                        worldtag.func_82580_o("mem16" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem17)) {
                        worldtag.func_82580_o("mem17" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem18)) {
                        worldtag.func_82580_o("mem18" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem19)) {
                        worldtag.func_82580_o("mem19" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem20)) {
                        worldtag.func_82580_o("mem20" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem21)) {
                        worldtag.func_82580_o("mem21" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem22)) {
                        worldtag.func_82580_o("mem22" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem23)) {
                        worldtag.func_82580_o("mem23" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem24)) {
                        worldtag.func_82580_o("mem24" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem25)) {
                        worldtag.func_82580_o("mem25" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem26)) {
                        worldtag.func_82580_o("mem26" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem27)) {
                        worldtag.func_82580_o("mem27" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem28)) {
                        worldtag.func_82580_o("mem28" + gname);
                     } else if (player.func_70005_c_().equalsIgnoreCase(mem29)) {
                        worldtag.func_82580_o("mem29" + gname);
                     }

                     px.inguild = false;
                     px.host = false;
                     px.guildname = "";
                     wdata.func_76185_a();
                  }

                  mod.network.sendToAllAround(new packetplayerdata(player), new TargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 50.0D));
                  mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
               }
            } else if (packetclick.Slot == 2) {
               if (px.inguild) {
                  gname = px.guildname.toLowerCase();
                  gname = worldtag.func_74779_i("host" + gname);
                  oriname = worldtag.func_74779_i("mem01" + gname);
                  gname = worldtag.func_74779_i("mem02" + gname);
                  ihaswar = worldtag.func_74779_i("mem03" + gname);
                  mem04 = worldtag.func_74779_i("mem04" + gname);
                  name = worldtag.func_74779_i("mem05" + gname);
                  mem06 = worldtag.func_74779_i("mem06" + gname);
                  mem07 = worldtag.func_74779_i("mem07" + gname);
                  mem08 = worldtag.func_74779_i("mem08" + gname);
                  mem09 = worldtag.func_74779_i("mem09" + gname);
                  mem10 = worldtag.func_74779_i("mem10" + gname);
                  mem11 = worldtag.func_74779_i("mem11" + gname);
                  mem12 = worldtag.func_74779_i("mem12" + gname);
                  mem13 = worldtag.func_74779_i("mem13" + gname);
                  mem14 = worldtag.func_74779_i("mem14" + gname);
                  mem15 = worldtag.func_74779_i("mem15" + gname);
                  mem16 = worldtag.func_74779_i("mem16" + gname);
                  mem17 = worldtag.func_74779_i("mem17" + gname);
                  mem18 = worldtag.func_74779_i("mem18" + gname);
                  mem19 = worldtag.func_74779_i("mem19" + gname);
                  mem20 = worldtag.func_74779_i("mem20" + gname);
                  mem21 = worldtag.func_74779_i("mem21" + gname);
                  mem22 = worldtag.func_74779_i("mem22" + gname);
                  mem23 = worldtag.func_74779_i("mem23" + gname);
                  mem24 = worldtag.func_74779_i("mem24" + gname);
                  mem25 = worldtag.func_74779_i("mem25" + gname);
                  mem26 = worldtag.func_74779_i("mem26" + gname);
                  mem27 = worldtag.func_74779_i("mem27" + gname);
                  mem28 = worldtag.func_74779_i("mem28" + gname);
                  mem29 = worldtag.func_74779_i("mem29" + gname);
                  if (px.host && player.func_70005_c_().equalsIgnoreCase(gname)) {
                     if (!oriname.equalsIgnoreCase("") && !gname.equalsIgnoreCase("") && !ihaswar.equalsIgnoreCase("") && !mem04.equalsIgnoreCase("") && !name.equalsIgnoreCase("") && !mem06.equalsIgnoreCase("") && !mem07.equalsIgnoreCase("") && !mem08.equalsIgnoreCase("") && !mem09.equalsIgnoreCase("") && !mem10.equalsIgnoreCase("") && !mem11.equalsIgnoreCase("") && !mem12.equalsIgnoreCase("") && !mem13.equalsIgnoreCase("") && !mem14.equalsIgnoreCase("") && !mem15.equalsIgnoreCase("") && !mem16.equalsIgnoreCase("") && !mem17.equalsIgnoreCase("") && !mem18.equalsIgnoreCase("") && !mem19.equalsIgnoreCase("") && !mem20.equalsIgnoreCase("") && !mem21.equalsIgnoreCase("") && !mem22.equalsIgnoreCase("") && !mem23.equalsIgnoreCase("") && !mem24.equalsIgnoreCase("") && !mem25.equalsIgnoreCase("") && !mem26.equalsIgnoreCase("") && !mem27.equalsIgnoreCase("") && !mem28.equalsIgnoreCase("") && !mem29.equalsIgnoreCase("")) {
                        player.func_145747_a(new ChatComponentText("§cกิลของท่านเต็มแล้ว"));
                     } else if (px.cdinvite == 0) {
                        if (player.field_70170_p.func_73045_a(packetclick.int1) != null && player.field_70170_p.func_73045_a(packetclick.int1) instanceof EntityPlayer) {
                           EntityPlayer target = (EntityPlayer)player.field_70170_p.func_73045_a(packetclick.int1);
                           if (target.func_70005_c_().equalsIgnoreCase(packetclick.st1)) {
                              playerdata tx = playerdata.get(target);
                              if (!tx.inguild) {
                                 px.cdinvite = 200;
                                 tx.inviter = player;
                                 px.joiner = target;
                                 tx.guildname = px.guildname;
                                 player.func_145747_a(new ChatComponentText("§aส่งคำเชิญไปยังผู้เล่น §6" + packetclick.st1));
                                 mod.network.sendTo(new packetclient(target, 1, 0, "", ""), (EntityPlayerMP)target);
                                 mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
                                 mod.network.sendTo(new packetplayerdata(target), (EntityPlayerMP)target);
                                 mod.network.sendToAllAround(new packetplayerdata(player), new TargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 50.0D));
                                 mod.network.sendToAllAround(new packetplayerdata(target), new TargetPoint(target.field_71093_bK, target.field_70165_t, target.field_70163_u, target.field_70161_v, 50.0D));
                              } else {
                                 player.func_145747_a(new ChatComponentText("§cผู้เล่น §6" + packetclick.st1 + "§c มีกิลอยู่แล้ว"));
                              }
                           } else {
                              player.func_145747_a(new ChatComponentText("§cเกิดความผิดพลาด ไม่มีผู้เล่น §6" + packetclick.st1));
                           }
                        }
                     } else {
                        player.func_145747_a(new ChatComponentText("§cกรุณารอ Cooldown ในการชวน เหลืออีก §e" + px.cdinvite / 20 + " §cวินาที"));
                     }
                  } else {
                     player.func_145747_a(new ChatComponentText("§cเกิดความผิดพลาด คุณไม่ใช่เจ้าของกิล"));
                  }
               }
            } else if (packetclick.Slot == 3) {
               if (player.field_71071_by.func_146028_b(mod.iguild)) {
                  gname = packetclick.st1;
                  gname = packetclick.st1.toLowerCase();
                  oriname = worldtag.func_74779_i("guild" + gname);
                  if (oriname.equalsIgnoreCase("")) {
                     px.inguild = true;
                     px.host = true;
                     px.guildname = gname;
                     worldtag.func_74778_a("guild" + gname, gname);
                     worldtag.func_74778_a("host" + gname, player.func_70005_c_());
                     wdata.func_76185_a();
                     player.func_145747_a(new ChatComponentText("§aสร้างกิล §6" + gname + " §aสำเร็จแล้ว"));
                     player.field_71071_by.func_146026_a(mod.iguild);
                  } else {
                     player.func_145747_a(new ChatComponentText("§cมีกิลชื่อ §e" + gname + " §cแล้ว"));
                     player.func_145747_a(new ChatComponentText("§cกรุณาใช้ชื่ออื่น"));
                  }

                  mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
                  mod.network.sendToAllAround(new packetplayerdata(player), new TargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 50.0D));
               } else {
                  player.func_145747_a(new ChatComponentText("§cต้องมีไอเทม §6หินกิล §cในการสร้างกิล"));
               }
            } else if (packetclick.Slot == 5) {
               if (px.inguild) {
                  gname = px.guildname.toLowerCase();
                  px.ghost = worldtag.func_74779_i("host" + gname);
                  px.mem01 = worldtag.func_74779_i("mem01" + gname);
                  px.mem02 = worldtag.func_74779_i("mem02" + gname);
                  px.mem03 = worldtag.func_74779_i("mem03" + gname);
                  px.mem04 = worldtag.func_74779_i("mem04" + gname);
                  px.mem05 = worldtag.func_74779_i("mem05" + gname);
                  px.mem06 = worldtag.func_74779_i("mem06" + gname);
                  px.mem07 = worldtag.func_74779_i("mem07" + gname);
                  px.mem08 = worldtag.func_74779_i("mem08" + gname);
                  px.mem09 = worldtag.func_74779_i("mem09" + gname);
                  px.mem10 = worldtag.func_74779_i("mem10" + gname);
                  px.mem11 = worldtag.func_74779_i("mem11" + gname);
                  px.mem12 = worldtag.func_74779_i("mem12" + gname);
                  px.mem13 = worldtag.func_74779_i("mem13" + gname);
                  px.mem14 = worldtag.func_74779_i("mem14" + gname);
                  px.mem15 = worldtag.func_74779_i("mem15" + gname);
                  px.mem16 = worldtag.func_74779_i("mem16" + gname);
                  px.mem17 = worldtag.func_74779_i("mem17" + gname);
                  px.mem18 = worldtag.func_74779_i("mem18" + gname);
                  px.mem19 = worldtag.func_74779_i("mem19" + gname);
                  px.mem20 = worldtag.func_74779_i("mem20" + gname);
                  px.mem21 = worldtag.func_74779_i("mem21" + gname);
                  px.mem22 = worldtag.func_74779_i("mem22" + gname);
                  px.mem23 = worldtag.func_74779_i("mem23" + gname);
                  px.mem24 = worldtag.func_74779_i("mem24" + gname);
                  px.mem25 = worldtag.func_74779_i("mem25" + gname);
                  px.mem26 = worldtag.func_74779_i("mem26" + gname);
                  px.mem27 = worldtag.func_74779_i("mem27" + gname);
                  px.mem28 = worldtag.func_74779_i("mem28" + gname);
                  px.mem29 = worldtag.func_74779_i("mem29" + gname);
                  px.guildlv = worldtag.func_74762_e("lv" + gname);
                  px.guildexp = worldtag.func_74762_e("exp" + gname);
                  px.winwar = worldtag.func_74767_n("winwar" + gname);
                  px.enemy = worldtag.func_74779_i("enemy" + gname);
                  px.point = worldtag.func_74762_e("point" + gname);
               } else {
                  px.ghost = "";
                  px.mem01 = "";
                  px.mem02 = "";
                  px.mem03 = "";
                  px.mem04 = "";
                  px.mem05 = "";
                  px.mem06 = "";
                  px.mem07 = "";
                  px.mem08 = "";
                  px.mem09 = "";
               }

               mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
               mod.network.sendToAllAround(new packetplayerdata(player), new TargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 50.0D));
            } else {
               playerdata tx;
               if (packetclick.Slot == 6) {
                  if (!px.inguild) {
                     if (px.inviter != null) {
                        tx = playerdata.get(px.inviter);
                        gname = tx.guildname.toLowerCase();
                        oriname = worldtag.func_74779_i("mem01" + gname);
                        gname = worldtag.func_74779_i("mem02" + gname);
                        ihaswar = worldtag.func_74779_i("mem03" + gname);
                        mem04 = worldtag.func_74779_i("mem04" + gname);
                        name = worldtag.func_74779_i("mem05" + gname);
                        mem06 = worldtag.func_74779_i("mem06" + gname);
                        mem07 = worldtag.func_74779_i("mem07" + gname);
                        mem08 = worldtag.func_74779_i("mem08" + gname);
                        mem09 = worldtag.func_74779_i("mem09" + gname);
                        mem10 = worldtag.func_74779_i("mem10" + gname);
                        mem11 = worldtag.func_74779_i("mem11" + gname);
                        mem12 = worldtag.func_74779_i("mem12" + gname);
                        mem13 = worldtag.func_74779_i("mem13" + gname);
                        mem14 = worldtag.func_74779_i("mem14" + gname);
                        mem15 = worldtag.func_74779_i("mem15" + gname);
                        mem16 = worldtag.func_74779_i("mem16" + gname);
                        mem17 = worldtag.func_74779_i("mem17" + gname);
                        mem18 = worldtag.func_74779_i("mem18" + gname);
                        mem19 = worldtag.func_74779_i("mem19" + gname);
                        mem20 = worldtag.func_74779_i("mem20" + gname);
                        mem21 = worldtag.func_74779_i("mem21" + gname);
                        mem22 = worldtag.func_74779_i("mem22" + gname);
                        mem23 = worldtag.func_74779_i("mem23" + gname);
                        mem24 = worldtag.func_74779_i("mem24" + gname);
                        mem25 = worldtag.func_74779_i("mem25" + gname);
                        mem26 = worldtag.func_74779_i("mem26" + gname);
                        mem27 = worldtag.func_74779_i("mem27" + gname);
                        mem28 = worldtag.func_74779_i("mem28" + gname);
                        mem29 = worldtag.func_74779_i("mem29" + gname);
                        if (oriname.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem01" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (gname.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem02" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (ihaswar.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem03" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem04.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem04" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (name.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem05" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem06.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem06" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem07.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem07" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem08.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem08" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem09.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem09" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem10.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem10" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem11.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem11" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem12.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem12" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem13.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem13" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem14.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem14" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem15.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem15" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem16.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem16" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem17.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem17" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem18.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem18" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem19.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem19" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem20.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem20" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem21.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem21" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem22.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem22" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem23.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem23" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem24.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem24" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem25.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem25" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem26.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem26" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem27.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem27" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem28.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem28" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else if (mem29.equalsIgnoreCase("")) {
                           px.inguild = true;
                           px.guildname = tx.guildname;
                           worldtag.func_74778_a("mem29" + gname, player.func_70005_c_());
                           wdata.func_76185_a();
                           player.func_145747_a(new ChatComponentText("§aเข้าร่วมกิล §d" + tx.guildname + " §aแล้ว"));
                        } else {
                           player.func_145747_a(new ChatComponentText("§cกิลดังกล่าวเต็มแล้ว ยกเลิกคำเชิญ"));
                        }

                        mod.network.sendTo(new packetclient(player, 2, 0, "", ""), (EntityPlayerMP)player);
                        mod.network.sendTo(new packetclient(px.inviter, 2, 0, "", ""), (EntityPlayerMP)px.inviter);
                        mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
                        mod.network.sendTo(new packetplayerdata(px.inviter), (EntityPlayerMP)px.inviter);
                        mod.network.sendToAllAround(new packetplayerdata(player), new TargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 50.0D));
                        mod.network.sendToAllAround(new packetplayerdata(px.inviter), new TargetPoint(px.inviter.field_71093_bK, px.inviter.field_70165_t, px.inviter.field_70163_u, px.inviter.field_70161_v, 50.0D));
                     } else {
                        player.func_145747_a(new ChatComponentText("§cคนเชิญไม่อยู่ในระยะแล้ว ยกเลิกการเชิญ"));
                     }
                  } else {
                     player.func_145747_a(new ChatComponentText("§cเกิดข้อผิดพลาด มีกิลอยู่แล้ว"));
                  }
               } else if (packetclick.Slot == 7) {
                  if (px.inviter != null) {
                     tx = playerdata.get(px.inviter);
                     px.inviter = null;
                     tx.joiner = null;
                     px.guildname = "";
                  }
               } else if (packetclick.Slot >= 8 && packetclick.Slot <= 16) {
                  gname = px.guildname.toLowerCase();
                  gname = worldtag.func_74779_i("host" + gname);
                  oriname = worldtag.func_74779_i("mem01" + gname);
                  gname = worldtag.func_74779_i("mem02" + gname);
                  ihaswar = worldtag.func_74779_i("mem03" + gname);
                  mem04 = worldtag.func_74779_i("mem04" + gname);
                  name = worldtag.func_74779_i("mem05" + gname);
                  mem06 = worldtag.func_74779_i("mem06" + gname);
                  mem07 = worldtag.func_74779_i("mem07" + gname);
                  mem08 = worldtag.func_74779_i("mem08" + gname);
                  mem09 = worldtag.func_74779_i("mem09" + gname);
                  mem10 = worldtag.func_74779_i("mem10" + gname);
                  mem11 = worldtag.func_74779_i("mem11" + gname);
                  mem12 = worldtag.func_74779_i("mem12" + gname);
                  mem13 = worldtag.func_74779_i("mem13" + gname);
                  mem14 = worldtag.func_74779_i("mem14" + gname);
                  mem15 = worldtag.func_74779_i("mem15" + gname);
                  mem16 = worldtag.func_74779_i("mem16" + gname);
                  mem17 = worldtag.func_74779_i("mem17" + gname);
                  mem18 = worldtag.func_74779_i("mem18" + gname);
                  mem19 = worldtag.func_74779_i("mem19" + gname);
                  mem20 = worldtag.func_74779_i("mem20" + gname);
                  mem21 = worldtag.func_74779_i("mem21" + gname);
                  mem22 = worldtag.func_74779_i("mem22" + gname);
                  mem23 = worldtag.func_74779_i("mem23" + gname);
                  mem24 = worldtag.func_74779_i("mem24" + gname);
                  mem25 = worldtag.func_74779_i("mem25" + gname);
                  mem26 = worldtag.func_74779_i("mem26" + gname);
                  mem27 = worldtag.func_74779_i("mem27" + gname);
                  mem28 = worldtag.func_74779_i("mem28" + gname);
                  mem29 = worldtag.func_74779_i("mem29" + gname);
                  if (px.host && player.func_70005_c_().equalsIgnoreCase(gname)) {
                     if (packetclick.Slot == 8) {
                        worldtag.func_82580_o("mem01" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + oriname + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 9) {
                        worldtag.func_82580_o("mem02" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + gname + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 10) {
                        worldtag.func_82580_o("mem03" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + ihaswar + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 11) {
                        worldtag.func_82580_o("mem04" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem04 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 12) {
                        worldtag.func_82580_o("mem05" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + name + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 13) {
                        worldtag.func_82580_o("mem06" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem06 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 14) {
                        worldtag.func_82580_o("mem07" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem07 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 15) {
                        worldtag.func_82580_o("mem08" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem08 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 16) {
                        worldtag.func_82580_o("mem09" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem09 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 19) {
                        worldtag.func_82580_o("mem10" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem10 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 20) {
                        worldtag.func_82580_o("mem11" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem11 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 21) {
                        worldtag.func_82580_o("mem12" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem12 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 22) {
                        worldtag.func_82580_o("mem13" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem13 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 23) {
                        worldtag.func_82580_o("mem14" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem14 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 24) {
                        worldtag.func_82580_o("mem15" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem15 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 25) {
                        worldtag.func_82580_o("mem16" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem16 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 26) {
                        worldtag.func_82580_o("mem17" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem17 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 27) {
                        worldtag.func_82580_o("mem18" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem18 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 28) {
                        worldtag.func_82580_o("mem19" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem19 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 29) {
                        worldtag.func_82580_o("mem20" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem20 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 30) {
                        worldtag.func_82580_o("mem21" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem21 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 31) {
                        worldtag.func_82580_o("mem22" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem22 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 32) {
                        worldtag.func_82580_o("mem23" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem23 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 33) {
                        worldtag.func_82580_o("mem24" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem24 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 34) {
                        worldtag.func_82580_o("mem25" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem25 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 35) {
                        worldtag.func_82580_o("mem26" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem26 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 36) {
                        worldtag.func_82580_o("mem27" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem27 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 37) {
                        worldtag.func_82580_o("mem28" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem28 + "§e ออกจากกิลแล้ว"));
                     } else if (packetclick.Slot == 38) {
                        worldtag.func_82580_o("mem29" + gname);
                        player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem29 + "§e ออกจากกิลแล้ว"));
                     }

                     wdata.func_76185_a();
                     if (px.inguild) {
                        px.ghost = worldtag.func_74779_i("host" + gname);
                        px.mem01 = worldtag.func_74779_i("mem01" + gname);
                        px.mem02 = worldtag.func_74779_i("mem02" + gname);
                        px.mem03 = worldtag.func_74779_i("mem03" + gname);
                        px.mem04 = worldtag.func_74779_i("mem04" + gname);
                        px.mem05 = worldtag.func_74779_i("mem05" + gname);
                        px.mem06 = worldtag.func_74779_i("mem06" + gname);
                        px.mem07 = worldtag.func_74779_i("mem07" + gname);
                        px.mem08 = worldtag.func_74779_i("mem08" + gname);
                        px.mem09 = worldtag.func_74779_i("mem09" + gname);
                        px.mem10 = worldtag.func_74779_i("mem10" + gname);
                        px.mem11 = worldtag.func_74779_i("mem11" + gname);
                        px.mem12 = worldtag.func_74779_i("mem12" + gname);
                        px.mem13 = worldtag.func_74779_i("mem13" + gname);
                        px.mem14 = worldtag.func_74779_i("mem14" + gname);
                        px.mem15 = worldtag.func_74779_i("mem15" + gname);
                        px.mem16 = worldtag.func_74779_i("mem16" + gname);
                        px.mem17 = worldtag.func_74779_i("mem17" + gname);
                        px.mem18 = worldtag.func_74779_i("mem18" + gname);
                        px.mem19 = worldtag.func_74779_i("mem19" + gname);
                        px.mem20 = worldtag.func_74779_i("mem20" + gname);
                        px.mem21 = worldtag.func_74779_i("mem21" + gname);
                        px.mem22 = worldtag.func_74779_i("mem22" + gname);
                        px.mem23 = worldtag.func_74779_i("mem23" + gname);
                        px.mem24 = worldtag.func_74779_i("mem24" + gname);
                        px.mem25 = worldtag.func_74779_i("mem25" + gname);
                        px.mem26 = worldtag.func_74779_i("mem26" + gname);
                        px.mem27 = worldtag.func_74779_i("mem27" + gname);
                        px.mem28 = worldtag.func_74779_i("mem28" + gname);
                        px.mem29 = worldtag.func_74779_i("mem29" + gname);
                     } else {
                        px.ghost = "";
                        px.mem01 = "";
                        px.mem02 = "";
                        px.mem03 = "";
                        px.mem04 = "";
                        px.mem05 = "";
                        px.mem06 = "";
                        px.mem07 = "";
                        px.mem08 = "";
                        px.mem09 = "";
                     }

                     mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
                     mod.network.sendToAllAround(new packetplayerdata(player), new TargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 50.0D));
                  } else {
                     player.func_145747_a(new ChatComponentText("§cเกิดข้อผิดพลาด ไม่ใช่หัวหน้ากิล"));
                  }
               } else if (packetclick.Slot == 17) {
                  boolean home = worldtag.func_74767_n("canhome");
                  if (px.inguild && px.host) {
                     if (home) {
                        gname = px.guildname.toLowerCase();
                        worldtag.func_74768_a("mapid" + gname, player.field_71093_bK);
                        worldtag.func_74768_a("x" + gname, (int)player.field_70165_t);
                        worldtag.func_74768_a("y" + gname, (int)player.field_70163_u);
                        worldtag.func_74768_a("z" + gname, (int)player.field_70161_v);
                        wdata.func_76185_a();
                        player.func_145747_a(new ChatComponentText("§aเซ็ตบ้านกิลสำหรับโลก " + player.field_70170_p.func_72912_H().func_76065_j()));
                        player.func_145747_a(new ChatComponentText("§eที่ตำแหน่ง §dX§f" + (int)player.field_70165_t + " §dY§f" + (int)player.field_70163_u + " §dZ§f" + (int)player.field_70161_v));
                     } else {
                        player.func_145747_a(new ChatComponentText("§cโลกนี้ไม่สามารถเซ็ตบ้านกิลได้"));
                     }
                  } else {
                     player.func_145747_a(new ChatComponentText("§cเกิดข้อผิดพลาด ไม่ใช่หัวหน้ากิล"));
                  }
               } else {
                  int point;
                  if (packetclick.Slot == 18) {
                     if (px.inguild) {
                        gname = px.guildname.toLowerCase();
                        int mapid = worldtag.func_74762_e("mapid" + gname);
                        int x = worldtag.func_74762_e("x" + gname);
                        int y = worldtag.func_74762_e("y" + gname);
                        point = worldtag.func_74762_e("z" + gname);
                        if (x != 0 && y != 0 && point != 0) {
                           if (player.field_71093_bK != mapid) {
                              player.func_71027_c(mapid);
                              player.field_70143_R = 0.0F;
                           }

                           player.func_70634_a((double)x, (double)y, (double)point);
                           player.field_70143_R = 0.0F;
                           player.func_145747_a(new ChatComponentText("§aเดินทางถึงบ้านกิลแล้ว"));
                           player.func_145747_a(new ChatComponentText("§eที่ตำแหน่ง §dX§f" + (int)player.field_70165_t + " §dY§f" + (int)player.field_70163_u + " §dZ§f" + (int)player.field_70161_v));
                        } else {
                           player.func_145747_a(new ChatComponentText("§cโลกนี้ไม่มีบ้านกิล"));
                        }
                     } else {
                        player.func_145747_a(new ChatComponentText("§cคุณไม่มีกิล"));
                     }
                  } else if (packetclick.Slot >= 19 && packetclick.Slot <= 38) {
                     gname = px.guildname.toLowerCase();
                     gname = worldtag.func_74779_i("host" + gname);
                     oriname = worldtag.func_74779_i("mem01" + gname);
                     gname = worldtag.func_74779_i("mem02" + gname);
                     ihaswar = worldtag.func_74779_i("mem03" + gname);
                     mem04 = worldtag.func_74779_i("mem04" + gname);
                     name = worldtag.func_74779_i("mem05" + gname);
                     mem06 = worldtag.func_74779_i("mem06" + gname);
                     mem07 = worldtag.func_74779_i("mem07" + gname);
                     mem08 = worldtag.func_74779_i("mem08" + gname);
                     mem09 = worldtag.func_74779_i("mem09" + gname);
                     mem10 = worldtag.func_74779_i("mem10" + gname);
                     mem11 = worldtag.func_74779_i("mem11" + gname);
                     mem12 = worldtag.func_74779_i("mem12" + gname);
                     mem13 = worldtag.func_74779_i("mem13" + gname);
                     mem14 = worldtag.func_74779_i("mem14" + gname);
                     mem15 = worldtag.func_74779_i("mem15" + gname);
                     mem16 = worldtag.func_74779_i("mem16" + gname);
                     mem17 = worldtag.func_74779_i("mem17" + gname);
                     mem18 = worldtag.func_74779_i("mem18" + gname);
                     mem19 = worldtag.func_74779_i("mem19" + gname);
                     mem20 = worldtag.func_74779_i("mem20" + gname);
                     mem21 = worldtag.func_74779_i("mem21" + gname);
                     mem22 = worldtag.func_74779_i("mem22" + gname);
                     mem23 = worldtag.func_74779_i("mem23" + gname);
                     mem24 = worldtag.func_74779_i("mem24" + gname);
                     mem25 = worldtag.func_74779_i("mem25" + gname);
                     mem26 = worldtag.func_74779_i("mem26" + gname);
                     mem27 = worldtag.func_74779_i("mem27" + gname);
                     mem28 = worldtag.func_74779_i("mem28" + gname);
                     mem29 = worldtag.func_74779_i("mem29" + gname);
                     if (px.host && player.func_70005_c_().equalsIgnoreCase(gname)) {
                        if (packetclick.Slot == 8) {
                           worldtag.func_82580_o("mem01" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + oriname + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 9) {
                           worldtag.func_82580_o("mem02" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + gname + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 10) {
                           worldtag.func_82580_o("mem03" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + ihaswar + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 11) {
                           worldtag.func_82580_o("mem04" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem04 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 12) {
                           worldtag.func_82580_o("mem05" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + name + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 13) {
                           worldtag.func_82580_o("mem06" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem06 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 14) {
                           worldtag.func_82580_o("mem07" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem07 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 15) {
                           worldtag.func_82580_o("mem08" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem08 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 16) {
                           worldtag.func_82580_o("mem09" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem09 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 19) {
                           worldtag.func_82580_o("mem10" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem10 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 20) {
                           worldtag.func_82580_o("mem11" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem11 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 21) {
                           worldtag.func_82580_o("mem12" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem12 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 22) {
                           worldtag.func_82580_o("mem13" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem13 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 23) {
                           worldtag.func_82580_o("mem14" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem14 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 24) {
                           worldtag.func_82580_o("mem15" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem15 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 25) {
                           worldtag.func_82580_o("mem16" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem16 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 26) {
                           worldtag.func_82580_o("mem17" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem17 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 27) {
                           worldtag.func_82580_o("mem18" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem18 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 28) {
                           worldtag.func_82580_o("mem19" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem19 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 29) {
                           worldtag.func_82580_o("mem20" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem20 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 30) {
                           worldtag.func_82580_o("mem21" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem21 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 31) {
                           worldtag.func_82580_o("mem22" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem22 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 32) {
                           worldtag.func_82580_o("mem23" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem23 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 33) {
                           worldtag.func_82580_o("mem24" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem24 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 34) {
                           worldtag.func_82580_o("mem25" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem25 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 35) {
                           worldtag.func_82580_o("mem26" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem26 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 36) {
                           worldtag.func_82580_o("mem27" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem27 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 37) {
                           worldtag.func_82580_o("mem28" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem28 + "§e ออกจากกิลแล้ว"));
                        } else if (packetclick.Slot == 38) {
                           worldtag.func_82580_o("mem29" + gname);
                           player.func_145747_a(new ChatComponentText("§eไล่ผู้เล่น §6" + mem29 + "§e ออกจากกิลแล้ว"));
                        }

                        wdata.func_76185_a();
                        if (px.inguild) {
                           px.ghost = worldtag.func_74779_i("host" + gname);
                           px.mem01 = worldtag.func_74779_i("mem01" + gname);
                           px.mem02 = worldtag.func_74779_i("mem02" + gname);
                           px.mem03 = worldtag.func_74779_i("mem03" + gname);
                           px.mem04 = worldtag.func_74779_i("mem04" + gname);
                           px.mem05 = worldtag.func_74779_i("mem05" + gname);
                           px.mem06 = worldtag.func_74779_i("mem06" + gname);
                           px.mem07 = worldtag.func_74779_i("mem07" + gname);
                           px.mem08 = worldtag.func_74779_i("mem08" + gname);
                           px.mem09 = worldtag.func_74779_i("mem09" + gname);
                           px.mem10 = worldtag.func_74779_i("mem10" + gname);
                           px.mem11 = worldtag.func_74779_i("mem11" + gname);
                           px.mem12 = worldtag.func_74779_i("mem12" + gname);
                           px.mem13 = worldtag.func_74779_i("mem13" + gname);
                           px.mem14 = worldtag.func_74779_i("mem14" + gname);
                           px.mem15 = worldtag.func_74779_i("mem15" + gname);
                           px.mem16 = worldtag.func_74779_i("mem16" + gname);
                           px.mem17 = worldtag.func_74779_i("mem17" + gname);
                           px.mem18 = worldtag.func_74779_i("mem18" + gname);
                           px.mem19 = worldtag.func_74779_i("mem19" + gname);
                           px.mem20 = worldtag.func_74779_i("mem20" + gname);
                           px.mem21 = worldtag.func_74779_i("mem21" + gname);
                           px.mem22 = worldtag.func_74779_i("mem22" + gname);
                           px.mem23 = worldtag.func_74779_i("mem23" + gname);
                           px.mem24 = worldtag.func_74779_i("mem24" + gname);
                           px.mem25 = worldtag.func_74779_i("mem25" + gname);
                           px.mem26 = worldtag.func_74779_i("mem26" + gname);
                           px.mem27 = worldtag.func_74779_i("mem27" + gname);
                           px.mem28 = worldtag.func_74779_i("mem28" + gname);
                           px.mem29 = worldtag.func_74779_i("mem29" + gname);
                        } else {
                           px.ghost = "";
                           px.mem01 = "";
                           px.mem02 = "";
                           px.mem03 = "";
                           px.mem04 = "";
                           px.mem05 = "";
                           px.mem06 = "";
                           px.mem07 = "";
                           px.mem08 = "";
                           px.mem09 = "";
                        }

                        mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
                        mod.network.sendToAllAround(new packetplayerdata(player), new TargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 50.0D));
                     } else {
                        player.func_145747_a(new ChatComponentText("§cเกิดข้อผิดพลาด ไม่ใช่หัวหน้ากิล"));
                     }
                  } else if (packetclick.Slot == 39) {
                     if (px.page > 0) {
                        --px.page;
                        mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
                     }
                  } else if (packetclick.Slot == 40) {
                     if (px.page < 2) {
                        ++px.page;
                        mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
                     }
                  } else if (packetclick.Slot == 50) {
                     if (px.inguild) {
                        mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
                        player.openGui(mod.instance, 6, player.field_70170_p, (int)player.field_70165_t, (int)player.field_70163_u, (int)player.field_70161_v);
                     }
                  } else if (packetclick.Slot == 51) {
                     if (px.inguild) {
                        if (px.host) {
                           if (px.cdwar == 0) {
                              gname = px.guildname;
                              gname = px.guildname.toLowerCase();
                              oriname = packetclick.st1.toLowerCase();
                              gname = worldtag.func_74779_i("enemy" + oriname);
                              ihaswar = worldtag.func_74779_i("enemy" + gname);
                              if (gname.equalsIgnoreCase("")) {
                                 if (ihaswar.equalsIgnoreCase("")) {
                                    px.cdwar = 36000;
                                    worldtag.func_74778_a("enemy" + oriname, gname);
                                    worldtag.func_74778_a("enemy" + gname, oriname);
                                    player.func_145747_a(new ChatComponentText("§eประกาศสงครามกับกิล §c" + oriname));
                                 } else {
                                    player.func_145747_a(new ChatComponentText("§eกิลของท่านมีสงครามอยู่กับกิล §c" + ihaswar + " §eประกาศซ้อนไม่ได้"));
                                 }
                              } else {
                                 player.func_145747_a(new ChatComponentText("§eกิล §c" + oriname + " §eมีสงครามอยู่ ประกาศซ้อนไม่ได้"));
                              }

                              wdata.func_76185_a();
                           } else {
                              player.func_145747_a(new ChatComponentText("§eท่านเพิ่งประกาศสงครามไป ต้องรอ §c" + px.cdwar / 20 / 60 + " §eนาทีถึงจะประกาศได้อีกครั้ง"));
                           }
                        }

                        mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
                        mod.network.sendToAllAround(new packetplayerdata(player), new TargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 50.0D));
                     }
                  } else if (packetclick.Slot == 52) {
                     if (px.inguild && px.host) {
                        gname = px.guildname;
                        gname = px.guildname.toLowerCase();
                        oriname = worldtag.func_74779_i("enemy" + gname);
                        worldtag.func_82580_o("enemy" + oriname);
                        worldtag.func_82580_o("enemy" + gname);
                        wdata.func_76185_a();
                        player.func_145747_a(new ChatComponentText("§eสงบศึกแล้ว"));
                        mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
                        mod.network.sendToAllAround(new packetplayerdata(player), new TargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 50.0D));
                     }
                  } else if (packetclick.Slot == 61) {
                     if (px.inguild) {
                        mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
                        player.openGui(mod.instance, 10, player.field_70170_p, (int)player.field_70165_t, (int)player.field_70163_u, (int)player.field_70161_v);
                     }
                  } else {
                     ItemStack item;
                     NBTTagCompound itemdata;
                     if (packetclick.Slot == 62) {
                        item = wdata.minv1.func_70301_a(px.slotid);
                        if (item != null) {
                           itemdata = item.func_77978_p();
                           if (itemdata == null) {
                              itemdata = new NBTTagCompound();
                           }

                           itemdata.func_74768_a("price", packetclick.int1);
                           oriname = itemdata.func_74779_i("name");
                           if (oriname.equalsIgnoreCase("")) {
                              itemdata.func_74778_a("name", item.func_82833_r());
                           }

                           item.func_77982_d(itemdata);
                           gname = itemdata.func_74779_i("name");
                           item.func_151001_c(gname + " §c[ §ePrice: §z" + packetclick.int1 + "§c ]");
                        }
                     } else if (packetclick.Slot == 63) {
                        item = wdata.minv1.func_70301_a(packetclick.int1);
                        if (item != null) {
                           itemdata = item.func_77978_p();
                           if (itemdata == null) {
                              itemdata = new NBTTagCompound();
                           }

                           oriname = px.guildname;
                           gname = px.guildname.toLowerCase();
                           point = worldtag.func_74762_e("point" + gname);
                           int price = itemdata.func_74762_e("price");
                           if (point >= price) {
                              if (player.field_71071_by.func_70447_i() >= 0) {
                                 player.func_145747_a(new ChatComponentText("§aซื้อไอเทมสำเร็จแล้ว ด้วยคะแนนกิล §z" + price + " §aคะแนน"));
                                 name = itemdata.func_74779_i("name");
                                 worldtag.func_74768_a("point" + gname, point - price);
                                 wdata.func_76185_a();
                                 px.point = worldtag.func_74762_e("point" + gname);
                                 ItemStack nitem = new ItemStack(item.func_77973_b());
                                 NBTTagCompound nidata = nitem.func_77978_p();
                                 if (nidata == null) {
                                    nidata = new NBTTagCompound();
                                 }

                                 nidata.func_82580_o("name");
                                 nidata.func_82580_o("price");
                                 nitem.func_77982_d(nidata);
                                 nitem.func_151001_c(name);
                                 player.field_71071_by.func_70441_a(nitem);
                              } else {
                                 player.func_145747_a(new ChatComponentText("§cช่องเก็บไอเทมเต็ม"));
                              }

                              mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
                           } else {
                              player.func_145747_a(new ChatComponentText("§eกิลของคุณ มีคะแนนกิล ไม่ถึง §c" + price + " §eคะแนน"));
                           }
                        }
                     }
                  }
               }
            }
         }

         return null;
      }
   }
}
