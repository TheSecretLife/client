package sp.network.server;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import sp.SpawnBlockTileEntity;
import sp.network.AbstractMessage;

public class OpenGuiMessage extends AbstractMessage.AbstractServerMessage {
   public double x;
   public double y;
   public double z;
   private int id;
   private int exp;
   private int hp;
   private int money;
   private int damage;
   private String name;
   private String mobname;

   public OpenGuiMessage() {
   }

   public OpenGuiMessage(int id, double d, double e, double f, String nn, int xp, int hp, int money, int dm, String mn) {
      this.id = id;
      this.x = d;
      this.y = e;
      this.z = f;
      this.exp = xp;
      this.name = nn;
      this.hp = hp;
      this.money = money;
      this.damage = dm;
      this.mobname = mn;
   }

   protected void read(PacketBuffer buffer) {
      this.id = buffer.readInt();
      this.x = buffer.readDouble();
      this.y = buffer.readDouble();
      this.z = buffer.readDouble();
      this.name = ByteBufUtils.readUTF8String(buffer);
      this.exp = buffer.readInt();
      this.hp = buffer.readInt();
      this.money = buffer.readInt();
      this.damage = buffer.readInt();
      this.mobname = ByteBufUtils.readUTF8String(buffer);
   }

   protected void write(PacketBuffer buffer) {
      buffer.writeInt(this.id);
      buffer.writeDouble(this.x);
      buffer.writeDouble(this.y);
      buffer.writeDouble(this.z);
      ByteBufUtils.writeUTF8String(buffer, this.name);
      buffer.writeInt(this.exp);
      buffer.writeInt(this.hp);
      buffer.writeInt(this.money);
      buffer.writeInt(this.damage);
      ByteBufUtils.writeUTF8String(buffer, this.mobname);
   }

   public void process(EntityPlayer player, Side side) {
      if (player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z) instanceof SpawnBlockTileEntity) {
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).setNamenpc(this.name);
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).entityclassname = this.name;
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).mobname = this.mobname;
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).exp = this.exp;
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).level = this.id;
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).hp = this.hp;
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).damage = this.damage;
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).money = this.money;
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).max = 11;
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).range = 20;
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).countmax = 11;
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).count = 1;
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).status = true;
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).func_145845_h();
         player.field_70170_p.func_147471_g((int)this.x, (int)this.y, (int)this.z);
         ((SpawnBlockTileEntity)player.field_70170_p.func_147438_o((int)this.x, (int)this.y, (int)this.z)).func_70296_d();
      }

   }
}
