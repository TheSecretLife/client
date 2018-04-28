package aguild.guildwar;

import aguild.WorldData;
import aguild.mod;
import aguild.playerdata;
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class creblock extends BlockContainer {
   public creblock() {
      super(Material.field_151571_B);
      this.func_149676_a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
      this.func_149658_d("aguild:spawner");
      this.func_149711_c(-1.0F);
      this.func_149647_a(CreativeTabs.field_78037_j);
   }

   public TileEntity func_149915_a(World world, int par1) {
      return new blockguildentity();
   }

   public int func_149645_b() {
      return -1;
   }

   public boolean func_149662_c() {
      return false;
   }

   public boolean func_149686_d() {
      return false;
   }

   public void func_149699_a(World world, int x, int y, int z, EntityPlayer player) {
      Random rand = new Random();
      playerdata px = playerdata.get(player);
      if (!world.field_72995_K) {
         blockguildentity te = (blockguildentity)world.func_147438_o(x, y, z);
         if (te != null) {
            if (px.inguild) {
               if (te.HD > 0) {
                  int damage = px.damage;
                  if (damage <= 0) {
                     damage = rand.nextInt(10) + 10;
                  }

                  te.HD -= 1000;
                  if (te.HD <= 0) {
                     List players = MinecraftServer.func_71276_C().func_71203_ab().field_72404_b;
                     int i;
                     EntityPlayer target;
                     if (px.inguild) {
                        for(i = 0; i < players.size(); ++i) {
                           target = (EntityPlayer)players.get(i);
                           playerdata tx = playerdata.get(target);
                           if (tx.inguild && tx.guildname.equalsIgnoreCase(px.guildname) && target.field_71071_by.func_70447_i() >= 0) {
                              target.field_71071_by.func_70441_a(new ItemStack(mod.reward));
                              target.func_145747_a(new ChatComponentText("§aได้รับ §6ตราชนะสงคราม §aจากการชนะสงครามหินกิล"));
                              WorldData wdata = WorldData.forWorld(player.field_70170_p);
                              NBTTagCompound worldtag = wdata.getData();
                              String oriname = px.guildname;
                              String gname = px.guildname.toLowerCase();
                              int point = worldtag.func_74762_e("point" + gname);
                              worldtag.func_74768_a("point" + gname, point + 10);
                              worldtag.func_74757_a("warstats", false);
                              wdata.func_76185_a();
                              int npoint = worldtag.func_74762_e("point" + gname);
                              player.func_145747_a(new ChatComponentText("§eได้รับคะแนนกิล +§b10 §eคะแนนกิลตอนนี้คือ §6" + npoint));
                           }
                        }
                     }

                     for(i = 0; i < players.size(); ++i) {
                        target = (EntityPlayer)players.get(i);
                        target.func_145747_a(new ChatComponentText("§aกิล §6" + px.guildname + " §aชนะสงคราม"));
                     }

                     world.func_147468_f(x, y, z);
                     world.func_147455_a(x, y, z, (TileEntity)null);
                  } else {
                     player.func_145747_a(new ChatComponentText("§7คุณทำความเสียหายให้หินกิล ตอนนี้หินกิลเหลือ §eHP = §c" + te.HD));
                  }
               }
            } else {
               player.func_145747_a(new ChatComponentText("§cคุณไม่มีกิลไม่สามารถโจมตีหินกิลได้"));
            }
         }
      }

   }
}
