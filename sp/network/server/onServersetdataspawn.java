package sp.network.server;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import sp.SpawnBlockTileEntity;
import sp.network.AbstractMessage;

public class onServersetdataspawn extends AbstractMessage.AbstractServerMessage {
   private String name;
   private int x;
   private int y;
   private int z;
   private int exp;
   private int hp;
   private int damage;
   private int money;
   private int level;
   private int count;
   private int countmax;

   public onServersetdataspawn() {
   }

   public onServersetdataspawn(String name, int x, int y, int z) {
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
      if (player.field_70170_p.func_147438_o(this.x, this.y, this.z) instanceof SpawnBlockTileEntity) {
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o(this.x, this.y, this.z)).func_145845_h();
         player.field_70170_p.func_147471_g(this.x, this.y, this.z);
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o(this.x, this.y, this.z)).func_70296_d();
      }

   }
}
