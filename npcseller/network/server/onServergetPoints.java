package npcseller.network.server;

import cabalaccessorys.data.PlayerData;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import npcseller.network.AbstractMessage;

public class onServergetPoints extends AbstractMessage.AbstractServerMessage {
   private int p;

   public onServergetPoints() {
   }

   public onServergetPoints(int it1) {
      this.p = it1;
   }

   protected void read(PacketBuffer buffer) throws IOException {
      this.p = buffer.readInt();
   }

   protected void write(PacketBuffer buffer) throws IOException {
      buffer.writeInt(this.p);
   }

   public void process(EntityPlayer player, Side side) {
      PlayerData data = PlayerData.get(player);
      data.iconomypoint = this.p;
      PlayerData.saveProxyData(player);
      PlayerData.loadProxyData(player);
   }
}
