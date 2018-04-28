package aguild.guildwar;

import aguild.WorldData;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;

public class spawnSlimeTE extends TileEntity {
   Random rand = new Random();
   public int spawndeley = 0;
   public boolean succes = false;

   public void func_145845_h() {
      if (!this.field_145850_b.field_72995_K) {
         WorldData data = WorldData.forWorld(this.field_145850_b);
         NBTTagCompound tag = data.getData();
         int h = tag.func_74762_e("time_h");
         int htime = this.field_145850_b.func_83015_S().getTime().getHours();
         if (htime == h && !this.succes) {
            int killradius = 10;
            List buglist = this.field_145850_b.func_72872_a(enwar.class, AxisAlignedBB.func_72330_a((double)(this.field_145851_c - killradius), (double)(this.field_145848_d - killradius), (double)(this.field_145849_e - killradius), (double)(this.field_145851_c + killradius), (double)(this.field_145848_d + killradius), (double)(this.field_145849_e + killradius)));
            enwar e;
            if (!buglist.isEmpty() && buglist.get(0) != null) {
               e = (enwar)buglist.get(0);
            } else {
               this.succes = true;
               e = new enwar(this.field_145850_b);
               e.func_70107_b((double)this.field_145851_c, (double)(this.field_145848_d + 1), (double)this.field_145849_e);
               this.field_145850_b.func_72838_d(e);
               e.func_70107_b((double)this.field_145851_c, (double)(this.field_145848_d + 1), (double)this.field_145849_e);
               e.x = this.field_145851_c;
               e.y = this.field_145848_d + 1;
               e.z = this.field_145849_e;
               tag.func_74757_a("warstats", true);
               data.func_76185_a();
               List players = MinecraftServer.func_71276_C().func_71203_ab().field_72404_b;

               for(int i = 0; i < players.size(); ++i) {
                  EntityPlayer target = (EntityPlayer)players.get(i);
                  target.func_145747_a(new ChatComponentText("§6หินกิล เกิดแล้ว !"));
               }
            }
         }

         if ((htime < h || htime > h) && this.succes) {
            this.succes = false;
         }
      }

   }

   public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet) {
      this.func_145839_a(packet.func_148857_g());
   }

   public void func_145841_b(NBTTagCompound tagCompound) {
      super.func_145841_b(tagCompound);
      tagCompound.func_74768_a("spawndeley", this.spawndeley);
      tagCompound.func_74757_a("succes", this.succes);
   }

   public void func_145839_a(NBTTagCompound tagCompound) {
      super.func_145839_a(tagCompound);
      this.spawndeley = tagCompound.func_74762_e("spawndeley");
      this.succes = tagCompound.func_74767_n("succes");
   }
}
