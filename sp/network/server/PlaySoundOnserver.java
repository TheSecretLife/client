package sp.network.server;

import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import sp.network.AbstractMessage;

public class PlaySoundOnserver extends AbstractMessage.AbstractServerMessage {
   public double x;
   public double y;
   public double z;
   private int id;

   public PlaySoundOnserver() {
   }

   public PlaySoundOnserver(int id) {
      this.id = id;
   }

   protected void read(PacketBuffer buffer) {
      this.id = buffer.readInt();
   }

   protected void write(PacketBuffer buffer) {
      buffer.writeInt(this.id);
   }

   public void process(EntityPlayer player, Side side) {
      switch(this.id) {
      case 1:
         player.field_70170_p.func_72956_a(player, "soundsys:shortsword1", 0.7F, 1.0F);
         break;
      case 2:
         player.field_70170_p.func_72956_a(player, "soundsys:shortsword2", 0.7F, 1.0F);
         break;
      case 3:
         player.field_70170_p.func_72956_a(player, "soundsys:shortsword3", 0.7F, 1.0F);
         break;
      case 4:
         player.field_70170_p.func_72956_a(player, "soundsys:shortsword4", 0.7F, 1.0F);
         break;
      case 5:
         player.field_70170_p.func_72956_a(player, "soundsys:bow", 0.25F, 1.0F);
         break;
      case 6:
         player.field_70170_p.func_72956_a(player, "soundsys:hitmon1", 0.7F, 1.0F);
         break;
      case 7:
         player.field_70170_p.func_72956_a(player, "soundsys:hitmon2", 0.7F, 1.0F);
         break;
      case 8:
         player.field_70170_p.func_72956_a(player, "soundsys:hitmon3", 0.7F, 1.0F);
         break;
      case 9:
         player.field_70170_p.func_72956_a(player, "soundsys:hitmon4", 0.7F, 1.0F);
      }

   }
}
