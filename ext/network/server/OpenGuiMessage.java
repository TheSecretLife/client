package ext.network.server;

import cpw.mods.fml.relauncher.Side;
import ext.network.AbstractMessage;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;

public class OpenGuiMessage extends AbstractMessage.AbstractServerMessage {
   private int id;
   public double r;
   public double g;
   public double b;
   Random rand = new Random();

   public OpenGuiMessage() {
   }

   public OpenGuiMessage(int id) {
      this.id = id;
   }

   protected void read(PacketBuffer buffer) {
      this.id = buffer.readInt();
   }

   protected void write(PacketBuffer buffer) {
      buffer.writeInt(this.id);
   }

   public void process(EntityPlayer player, Side side) {
   }

   public void getCheckItem(ItemStack item, EntityPlayer player, int slotnumber) {
   }
}
