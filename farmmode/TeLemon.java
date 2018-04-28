package farmmode;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TeLemon extends TileEntity {
   public int growth = 0;
   public int waterdeley = 0;

   public void func_145845_h() {
      if (!this.field_145850_b.field_72995_K) {
         if (this.field_145850_b.func_147439_a(this.field_145851_c, this.field_145848_d, this.field_145849_e) != ReqFarmItem.SeedLemon) {
            this.field_145850_b.func_147455_a(this.field_145851_c, this.field_145848_d, this.field_145849_e, (TileEntity)null);
         }

         if (this.field_145850_b.func_147439_a(this.field_145851_c, this.field_145848_d - 1, this.field_145849_e) != ReqFarmItem.BlockFarmA && this.field_145850_b.func_147439_a(this.field_145851_c, this.field_145848_d - 1, this.field_145849_e) != ReqFarmItem.BlockFarmB) {
            this.field_145850_b.func_147455_a(this.field_145851_c, this.field_145848_d, this.field_145849_e, (TileEntity)null);
            this.field_145850_b.func_147468_f(this.field_145851_c, this.field_145848_d, this.field_145849_e);
         }

         if (this.field_145850_b.func_147439_a(this.field_145851_c, this.field_145848_d - 1, this.field_145849_e) == ReqFarmItem.BlockFarmB) {
            int meta = this.field_145850_b.func_72805_g(this.field_145851_c, this.field_145848_d, this.field_145849_e);
            if (meta < 5) {
               ++this.growth;
               if (this.growth >= 12000) {
                  this.field_145850_b.func_72921_c(this.field_145851_c, this.field_145848_d, this.field_145849_e, meta + 1, 2);
                  this.growth = 0;
               }
            } else {
               this.growth = 0;
            }
         } else {
            this.growth = 0;
         }

         ++this.waterdeley;
         if (this.waterdeley >= 36000 && this.field_145850_b.func_147439_a(this.field_145851_c, this.field_145848_d - 1, this.field_145849_e) == ReqFarmItem.BlockFarmB) {
            this.waterdeley = 0;
            this.field_145850_b.func_147449_b(this.field_145851_c, this.field_145848_d - 1, this.field_145849_e, ReqFarmItem.BlockFarmA);
         }
      }

   }

   public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet) {
      this.func_145839_a(packet.func_148857_g());
   }

   public void func_145841_b(NBTTagCompound tagCompound) {
      super.func_145841_b(tagCompound);
      tagCompound.func_74768_a("growth", this.growth);
      tagCompound.func_74768_a("waterdeley", this.waterdeley);
   }

   public void func_145839_a(NBTTagCompound tagCompound) {
      super.func_145839_a(tagCompound);
      this.growth = tagCompound.func_74762_e("growth");
      this.waterdeley = tagCompound.func_74762_e("waterdeley");
   }
}
