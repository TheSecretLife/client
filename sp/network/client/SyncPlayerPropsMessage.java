package sp.network.client;

import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import sp.EntityCustomMobBase;
import sp.network.AbstractMessage;

public class SyncPlayerPropsMessage extends AbstractMessage.AbstractClientMessage {
   private NBTTagCompound data;
   private int id;
   private EntityLiving en;

   public SyncPlayerPropsMessage() {
   }

   public SyncPlayerPropsMessage(EntityLiving living, int id, NBTTagCompound customDataMob) {
      this.data = customDataMob;
      this.id = id;
      this.en = living;
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
      EntityCustomMobBase en = (EntityCustomMobBase)player.field_70170_p.func_73045_a(this.id);
      if (en != null) {
         en.func_70691_i(1.0E9F);
         en.func_70037_a(this.data);
      }

   }
}
