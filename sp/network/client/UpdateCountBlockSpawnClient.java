package sp.network.client;

import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import sp.network.AbstractMessage;
import sp.network.PacketDispatcher;
import sp.network.server.UpdateCountBlockSpawn;

public class UpdateCountBlockSpawnClient extends AbstractMessage.AbstractClientMessage {
   public double x;
   public double y;
   public double z;

   public UpdateCountBlockSpawnClient() {
   }

   public UpdateCountBlockSpawnClient(double d, double e, double f) {
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
      PacketDispatcher.sendToServer(new UpdateCountBlockSpawn(this.x, this.y, this.z));
   }
}
