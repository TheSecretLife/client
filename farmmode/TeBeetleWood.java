package farmmode;

import java.util.List;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TeBeetleWood extends TileEntity {
   public String ownername = "";
   public String OwnerID = "";
   public boolean mother = false;
   public boolean father = false;
   public int sondeley = 0;

   public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet) {
      this.func_145839_a(packet.func_148857_g());
   }

   public void func_145841_b(NBTTagCompound tagCompound) {
      super.func_145841_b(tagCompound);
      tagCompound.func_74778_a("ownername", this.ownername);
      tagCompound.func_74778_a("OwnerID", this.OwnerID);
      tagCompound.func_74757_a("mother", this.mother);
      tagCompound.func_74757_a("father", this.father);
      tagCompound.func_74768_a("sondeley", this.sondeley);
   }

   public void func_145839_a(NBTTagCompound tagCompound) {
      super.func_145839_a(tagCompound);
      this.ownername = tagCompound.func_74779_i("ownername");
      this.OwnerID = tagCompound.func_74779_i("OwnerID");
      this.mother = tagCompound.func_74767_n("mother");
      this.father = tagCompound.func_74767_n("father");
      this.sondeley = tagCompound.func_74762_e("sondeley");
   }

   public void func_145845_h() {
      if (!this.field_145850_b.field_72995_K) {
         if (this.field_145850_b.func_147439_a(this.field_145851_c, this.field_145848_d, this.field_145849_e) != ReqBeetleItem.BeetleWood1) {
            this.field_145850_b.func_147455_a(this.field_145851_c, this.field_145848_d, this.field_145849_e, (TileEntity)null);
         }

         this.findbeetle();
         if (this.mother && this.father) {
            ++this.sondeley;
            if (this.sondeley >= 24000) {
               String name = this.ownername;
               String ownerID = this.OwnerID;
               this.sondeley = 0;
               this.field_145850_b.func_147449_b(this.field_145851_c, this.field_145848_d, this.field_145849_e, ReqBeetleItem.BeetleWood2);
               TeBeetleWood2 te = (TeBeetleWood2)this.field_145850_b.func_147438_o(this.field_145851_c, this.field_145848_d, this.field_145849_e);
               te.ownername = name;
               te.OwnerID = ownerID;
            }
         }
      }

   }

   public void findbeetle() {
      int radius = 10;
      List e = this.field_145850_b.func_72872_a(entitybeetle.class, AxisAlignedBB.func_72330_a((double)(this.field_145851_c - radius), (double)(this.field_145848_d - radius), (double)(this.field_145849_e - radius), (double)(this.field_145851_c + radius), (double)(this.field_145848_d + radius), (double)(this.field_145849_e + radius)));
      if (e.size() == 2) {
         for(int i = 0; i < e.size(); ++i) {
            entitybeetle em = (entitybeetle)e.get(i);
            if (em.type != 3 && em.type != 4 && em.type != 16) {
               this.father = true;
            } else {
               this.mother = true;
            }

            this.OwnerID = em.getOwnerName();
         }
      } else {
         this.mother = false;
         this.father = false;
      }

   }
}
