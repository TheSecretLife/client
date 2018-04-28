package fantasyland.client;

import cabalaccessorys.RegisterItem;
import cabalaccessorys.Start;
import cabalaccessorys.SynPacNewket;
import cabalaccessorys.data.PlayerData;
import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import fantasyland.ModStart;
import fantasyland.packet.Packet_Original;
import fantasyland.packet.Packet_SyncPlayerData;
import fantasyland.player.StoreData;
import io.netty.buffer.ByteBuf;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public class Packet_Umbrella extends Packet_Original {
   public static int GuiID;
   public static Random rand = new Random();

   public Packet_Umbrella(int guiID) {
      GuiID = guiID;
   }

   public Packet_Umbrella() {
      this(0);
   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(GuiID);
   }

   public void fromBytes(ByteBuf buf) {
      GuiID = buf.readInt();
   }

   public static class Handler implements IMessageHandler {
      public IMessage onMessage(Packet_Umbrella message, MessageContext ctx) {
         EntityPlayer player = ctx.getServerHandler().field_147369_b;
         StoreData px = StoreData.get(player);
         PlayerData data = PlayerData.get(player);
         int HairColor;
         if (Packet_Umbrella.GuiID == 2) {
            HairColor = px.Hair;
            if (px.Hair < 10) {
               px.Hair = HairColor + 1;
            } else {
               px.Hair = 0;
            }
         } else if (Packet_Umbrella.GuiID == 3) {
            HairColor = px.HairColor;
            if (px.HairColor < 4) {
               px.HairColor = HairColor + 1;
            } else {
               px.HairColor = 0;
            }
         } else if (Packet_Umbrella.GuiID == 4) {
            if (px.Face < 8) {
               ++px.Face;
            } else {
               px.Face = 0;
            }
         } else if (Packet_Umbrella.GuiID == 5) {
            px.Sex = 0;
         } else if (Packet_Umbrella.GuiID == 6) {
            px.StartSetFace = true;
            px.StartSetClass = true;
         } else if (Packet_Umbrella.GuiID == 7) {
            px.StartSetClass = true;
         } else if (Packet_Umbrella.GuiID == 8) {
            px.classplayer = "Warrior";
            data.job = 1;
            player.func_70096_w().func_75692_b(12, Integer.valueOf(1));
            px.StartSetClass = true;
            data.SK.func_70299_a(0, new ItemStack(RegisterItem.skillwa1));
            data.SK.func_70299_a(1, new ItemStack(RegisterItem.skillwa2));
            data.SK.func_70299_a(2, new ItemStack(RegisterItem.skillwa3));
            data.SK.func_70299_a(3, new ItemStack(RegisterItem.skillwa4));
         } else if (Packet_Umbrella.GuiID == 9) {
            px.classplayer = "Assassin";
            data.job = 3;
            player.func_70096_w().func_75692_b(12, Integer.valueOf(3));
            px.StartSetClass = true;
            data.SK.func_70299_a(0, new ItemStack(RegisterItem.skillas1));
            data.SK.func_70299_a(1, new ItemStack(RegisterItem.skillas2));
            data.SK.func_70299_a(2, new ItemStack(RegisterItem.skillas3));
            data.SK.func_70299_a(3, new ItemStack(RegisterItem.skillas4));
         } else if (Packet_Umbrella.GuiID == 10) {
            px.classplayer = "Viking";
            data.job = 2;
            player.func_70096_w().func_75692_b(12, Integer.valueOf(2));
            px.StartSetClass = true;
            data.SK.func_70299_a(0, new ItemStack(RegisterItem.skillvi1));
            data.SK.func_70299_a(1, new ItemStack(RegisterItem.skillvi2));
            data.SK.func_70299_a(2, new ItemStack(RegisterItem.skillvi3));
            data.SK.func_70299_a(3, new ItemStack(RegisterItem.skillvi4));
         } else if (Packet_Umbrella.GuiID == 11) {
            px.Sex = 1;
         }

         Start.networkChannel.sendTo(new SynPacNewket(player), (EntityPlayerMP)player);
         Start.networkChannel.sendToAllAround(new SynPacNewket(player), new TargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 50.0D));
         ModStart.networkChannel.sendToAllAround(new Packet_SyncPlayerData(player), new TargetPoint(player.field_71093_bK, player.field_70165_t, player.field_70163_u, player.field_70161_v, 50.0D));
         ModStart.networkChannel.sendTo(new Packet_SyncPlayerData(player), (EntityPlayerMP)player);
         return null;
      }
   }
}
