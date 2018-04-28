package aguild;

import aguild.gui.congui;
import aguild.gui.cregui;
import aguild.gui.guibuff;
import aguild.gui.guienemy;
import aguild.gui.guientext;
import aguild.gui.ingui;
import aguild.gui.namegui;
import aguild.market.mda;
import aguild.market.mgui;
import aguild.market.prgui;
import aguild.store.sda;
import aguild.store.sgui;
import cpw.mods.fml.common.network.IGuiHandler;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class proxyserver implements IGuiHandler {
   private static final Map tag = new HashMap();

   public void run() {
   }

   public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
      playerdata px = playerdata.get(player);
      if (ID == 1) {
         return null;
      } else {
         WorldData wdata;
         if (ID == 6) {
            if (px.inguild) {
               wdata = WorldData.forWorld(player.field_70170_p, px.guildname);
               NBTTagCompound comp = new NBTTagCompound();
               comp = comp.func_74775_l(WorldData.key + px.guildname);
               wdata.func_76184_a(comp);
               return new sda(player, player.field_71071_by, wdata.sinv1);
            } else {
               return null;
            }
         } else if (ID == 10) {
            if (px.inguild) {
               wdata = WorldData.forWorld(player.field_70170_p);
               return new mda(player, player.field_71071_by, wdata.minv1);
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
      playerdata px = playerdata.get(player);
      if (ID == 1) {
         mod.network.sendToServer(new packetclick(5, "", 0));
         return new cregui(player);
      } else if (ID == 3) {
         return new namegui(player);
      } else if (ID == 4) {
         return new ingui(player);
      } else if (ID == 5) {
         return new congui(player);
      } else {
         WorldData wdata;
         if (ID == 6) {
            if (px.inguild) {
               wdata = WorldData.forWorld(player.field_70170_p, px.guildname);
               return new sgui(player, player.field_71071_by, wdata.sinv1);
            } else {
               return null;
            }
         } else if (ID == 7) {
            mod.network.sendToServer(new packetclick(5, "", 0));
            return new guibuff(player);
         } else if (ID == 8) {
            mod.network.sendToServer(new packetclick(5, "", 0));
            return new guienemy(player);
         } else if (ID == 9) {
            mod.network.sendToServer(new packetclick(5, "", 0));
            return new guientext(player);
         } else if (ID == 10) {
            mod.network.sendToServer(new packetclick(5, "", 0));
            if (px.inguild) {
               wdata = WorldData.forWorld(player.field_70170_p);
               return new mgui(player, player.field_71071_by, wdata.minv1);
            } else {
               return null;
            }
         } else {
            return ID == 11 ? new prgui(player) : null;
         }
      }
   }

   public static void savePlayerdata(String name, NBTTagCompound compound) {
      tag.put(name, compound);
   }

   public static NBTTagCompound getPlayerData(String name) {
      return (NBTTagCompound)tag.remove(name);
   }
}
