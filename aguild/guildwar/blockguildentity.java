package aguild.guildwar;

import java.util.Random;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class blockguildentity extends TileEntity {
   Random rand = new Random();
   public int HD = 10000;

   public void func_145845_h() {
      if (!this.field_145850_b.field_72995_K && this.HD == 0) {
         this.field_145850_b.func_147468_f(this.field_145851_c, this.field_145848_d, this.field_145849_e);
         this.field_145850_b.func_147455_a(this.field_145851_c, this.field_145848_d, this.field_145849_e, (TileEntity)null);
      }

   }

   public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet) {
      this.func_145839_a(packet.func_148857_g());
   }

   public void func_145841_b(NBTTagCompound tagCompound) {
      super.func_145841_b(tagCompound);
      tagCompound.func_74768_a("HD", this.HD);
   }

   public void func_145839_a(NBTTagCompound tagCompound) {
      super.func_145839_a(tagCompound);
      this.HD = tagCompound.func_74762_e("HD");
   }
}
