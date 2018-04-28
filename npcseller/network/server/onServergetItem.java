package npcseller.network.server;

import cabalaccessorys.Start;
import cabalaccessorys.SynPacNewket;
import cabalaccessorys.data.PlayerData;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ChatComponentTranslation;
import npcseller.network.AbstractMessage;

public class onServergetItem extends AbstractMessage.AbstractServerMessage {
   private ItemStack itemget;

   public onServergetItem() {
   }

   public onServergetItem(ItemStack it1) {
      this.itemget = it1;
   }

   protected void read(PacketBuffer buffer) throws IOException {
      this.itemget = buffer.func_150791_c();
   }

   protected void write(PacketBuffer buffer) throws IOException {
      buffer.func_150788_a(this.itemget);
   }

   public void process(EntityPlayer player, Side side) {
      PlayerData data = PlayerData.get(player);
      NBTTagCompound nbt = this.itemget.field_77990_d;
      if (nbt.func_74764_b("price")) {
         if (data.Money >= nbt.func_74762_e("price")) {
            data.Money -= nbt.func_74762_e("price");
            nbt.func_82580_o("price");
            player.field_71071_by.func_70441_a(this.itemget);
            player.field_71069_bz.func_75142_b();
            PlayerData.saveProxyData(player);
            Start.networkChannel.sendTo(new SynPacNewket(player), (EntityPlayerMP)player);
            System.out.println("PLAYER " + player.func_70005_c_() + " buy item " + this.itemget.func_82833_r());
            player.func_146105_b(new ChatComponentTranslation("§bซื้อของเรียบร้อยแล้ว โปรดตรวจสอบของในช่องกระเป๋า", new Object[0]));
         } else {
            player.func_146105_b(new ChatComponentTranslation("§cเงิน Gold มีไม่พอ", new Object[0]));
         }
      } else if (nbt.func_74764_b("point")) {
         if (data.iconomypoint >= nbt.func_74762_e("point")) {
            data.iconomypoint -= nbt.func_74762_e("point");
            nbt.func_82580_o("point");
            player.field_71071_by.func_70441_a(this.itemget);
            player.field_71069_bz.func_75142_b();
            PlayerData.saveProxyData(player);
            Start.networkChannel.sendTo(new SynPacNewket(player), (EntityPlayerMP)player);
            System.out.println("PLAYER " + player.func_70005_c_() + " buy item with point" + this.itemget.func_82833_r());
            player.func_146105_b(new ChatComponentTranslation("§bซื้อของเรียบร้อยแล้ว โปรดตรวจสอบของในช่องกระเป๋า", new Object[0]));
         } else {
            player.func_146105_b(new ChatComponentTranslation("§cเงิน Point มีไม่พอ", new Object[0]));
         }
      }

   }
}
