package npcseller.network.server;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import npcseller.TileC;
import npcseller.TileC2;
import npcseller.TileC3;
import npcseller.network.AbstractMessage;

public class onServersetname extends AbstractMessage.AbstractServerMessage {
   private String name;
   private int x;
   private int y;
   private int z;

   public onServersetname() {
   }

   public onServersetname(String name, int x, int y, int z) {
      this.name = name;
      this.x = x;
      this.y = y;
      this.z = z;
   }

   protected void read(PacketBuffer buffer) throws IOException {
      this.name = ByteBufUtils.readUTF8String(buffer);
      this.x = buffer.readInt();
      this.y = buffer.readInt();
      this.z = buffer.readInt();
   }

   protected void write(PacketBuffer buffer) throws IOException {
      ByteBufUtils.writeUTF8String(buffer, this.name);
      buffer.writeInt(this.x);
      buffer.writeInt(this.y);
      buffer.writeInt(this.z);
   }

   public void process(EntityPlayer player, Side side) {
      if (player.field_70170_p.func_147438_o(this.x, this.y, this.z) instanceof TileC) {
         ((TileC)player.field_70170_p.func_147438_o(this.x, this.y, this.z)).setNamenpc(this.name);
         ((TileC)player.field_70170_p.func_147438_o(this.x, this.y, this.z)).func_145845_h();
         player.field_70170_p.func_147471_g(this.x, this.y, this.z);
         ((TileC)player.field_70170_p.func_147438_o(this.x, this.y, this.z)).func_70296_d();
      }

      if (player.field_70170_p.func_147438_o(this.x, this.y, this.z) instanceof TileC2) {
         ((TileC2)player.field_70170_p.func_147438_o(this.x, this.y, this.z)).setNamenpc(this.name);
         ((TileC2)player.field_70170_p.func_147438_o(this.x, this.y, this.z)).func_145845_h();
         player.field_70170_p.func_147471_g(this.x, this.y, this.z);
         ((TileC2)player.field_70170_p.func_147438_o(this.x, this.y, this.z)).func_70296_d();
      }

      if (player.field_70170_p.func_147438_o(this.x, this.y, this.z) instanceof TileC3) {
         ((TileC3)player.field_70170_p.func_147438_o(this.x, this.y, this.z)).setNamenpc(this.name);
         ((TileC3)player.field_70170_p.func_147438_o(this.x, this.y, this.z)).func_145845_h();
         player.field_70170_p.func_147471_g(this.x, this.y, this.z);
         ((TileC3)player.field_70170_p.func_147438_o(this.x, this.y, this.z)).func_70296_d();
      }

   }
}
