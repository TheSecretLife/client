package aguild;

import java.util.Arrays;
import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;

public class guildchat extends CommandBase {
   public String func_71517_b() {
      return "y";
   }

   public String func_71518_a(ICommandSender sender) {
      return "gchat";
   }

   public int func_82362_a() {
      return 0;
   }

   public boolean func_71519_b(ICommandSender sender) {
      return true;
   }

   public void func_71515_b(ICommandSender sender, String[] args) {
      EntityPlayer player = func_71521_c(sender);
      NBTTagCompound playerNBT = player.getEntityData();
      playerdata px = playerdata.get(player);
      List players = MinecraftServer.func_71276_C().func_71203_ab().field_72404_b;
      if (px.inguild) {
         for(int i = 0; i < players.size(); ++i) {
            EntityPlayer target = (EntityPlayer)players.get(i);
            playerdata tx = playerdata.get(target);
            if (px.guildname.equalsIgnoreCase(tx.guildname)) {
               String chatText = "§f[§6" + px.guildname + "§f] §f<§e" + player.getDisplayName() + "§f> §a" + Arrays.toString(args).replace(",", "").replace("[", "").replace("]", "").trim();
               target.func_145747_a(new ChatComponentTranslation(chatText, new Object[0]));
            }
         }
      } else {
         player.func_145747_a(new ChatComponentText("§cคุณไม่สามารถแชทกิลได้ เพราะไม่มีกิล"));
      }

   }
}
