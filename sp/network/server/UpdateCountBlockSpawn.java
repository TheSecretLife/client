package sp.network.server;

import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import sp.SpawnBlockTileEntity;
import sp.network.AbstractMessage;

public class UpdateCountBlockSpawn extends AbstractMessage.AbstractServerMessage {
   public double x;
   public double y;
   public double z;

   public UpdateCountBlockSpawn() {
   }

   public UpdateCountBlockSpawn(double d, double e, double f) {
      this.x = d;
      this.y = e;
      this.z = f;
   }

   protected void read(PacketBuffer buffer) {
      this.x = buffer.readDouble();
      this.y = buffer.readDouble();
      this.z = buffer.readDouble();
   }

   protected void write(PacketBuffer buffer) {
      buffer.writeDouble(this.x);
      buffer.writeDouble(this.y);
      buffer.writeDouble(this.z);
   }

   public void process(EntityPlayer player, Side side) {
      if (player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z) != null && player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z) instanceof SpawnBlockTileEntity) {
         if (((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).count > 0) {
            --((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).count;
         }

         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).func_145845_h();
         player.field_70170_p.func_147471_g((int)this.x, (int)this.y, (int)this.z);
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).func_70296_d();
      }

   }
}
