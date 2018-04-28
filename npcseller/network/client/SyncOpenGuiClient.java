package npcseller.network.client;

import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import npcseller.Main;
import npcseller.network.AbstractMessage;

public class SyncOpenGuiClient extends AbstractMessage.AbstractClientMessage {
   private int id;

   public SyncOpenGuiClient() {
   }

   public SyncOpenGuiClient(EntityPlayer player, int id) {
      this.id = id;
   }

   protected void read(PacketBuffer buffer) throws IOException {
      this.id = buffer.readInt();
   }

   protected void write(PacketBuffer buffer) throws IOException {
      buffer.writeInt(this.id);
   }

   public void process(EntityPlayer player, Side side) {
      player.openGui(Main.instance, 1, player.field_70170_p, (int)player.field_70165_t, (int)player.field_70163_u, (int)player.field_70161_v);
   }
}
