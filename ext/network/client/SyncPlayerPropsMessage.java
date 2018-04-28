package ext.network.client;

import cpw.mods.fml.relauncher.Side;
import ext.network.AbstractMessage;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;

public class SyncPlayerPropsMessage extends AbstractMessage.AbstractClientMessage {
   private NBTTagCompound data;
   private int id;

   public SyncPlayerPropsMessage() {
   }

   public SyncPlayerPropsMessage(EntityPlayer player, int id) {
      this.data = new NBTTagCompound();
      this.id = id;
   }

   protected void read(PacketBuffer buffer) throws IOException {
      this.data = buffer.func_150793_b();
      this.id = buffer.readInt();
   }

   protected void write(PacketBuffer buffer) throws IOException {
      buffer.func_150786_a(this.data);
      buffer.writeInt(this.id);
   }

   public void process(EntityPlayer player, Side side) {
   }
}
