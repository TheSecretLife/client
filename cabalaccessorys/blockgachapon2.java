package cabalaccessorys;

import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class blockgachapon2 extends BlockContainer {
   Random rand = new Random();

   public blockgachapon2(String name) {
      super(Material.field_151571_B);
      this.func_149675_a(true);
      this.func_149676_a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
      this.func_149658_d("cabalaccessorys:" + name);
      this.func_149722_s();
      this.func_149663_c(name);
      this.func_149647_a(Start.ItemList);
   }

   public TileEntity func_149915_a(World w, int i) {
      return new tegacha2();
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

   public void func_149689_a(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
      EntityPlayer Player = (EntityPlayer)par5EntityLivingBase;
      byte b0 = 0;
      int l = MathHelper.func_76128_c((double)(par5EntityLivingBase.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      if (l == 0) {
         b0 = 2;
      }

      if (l == 1) {
         b0 = 5;
      }

      if (l == 2) {
         b0 = 3;
      }

      if (l == 3) {
         b0 = 4;
      }

      par1World.func_72921_c(par2, par3, par4, b0, 2);
   }

   public boolean func_149727_a(World world, int i, int j, int k, EntityPlayer Player, int l, float m, float n, float o) {
      if (!world.field_72995_K) {
         ItemStack hand = Player.func_70694_bm();
         if (hand != null && hand.func_77973_b() == RegisterItem.gacoin2) {
            if (Player.field_71071_by.func_70447_i() >= 0) {
               --hand.field_77994_a;
               ItemStack item = null;
               int ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.sw01a);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.sw02a);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 20) {
                  item = new ItemStack(RegisterItem.sw03a);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 20) {
                  item = new ItemStack(RegisterItem.sw04a);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 20) {
                  item = new ItemStack(RegisterItem.sw05a);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 20) {
                  item = new ItemStack(RegisterItem.sw06a);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 10) {
                  item = new ItemStack(RegisterItem.sw07a);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 10) {
                  item = new ItemStack(RegisterItem.sw08a);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 10) {
                  item = new ItemStack(RegisterItem.sw09a);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 10) {
                  item = new ItemStack(RegisterItem.sw10a);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Helm01);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Chest01);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Leg01);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Boot01);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Helm02);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Chest02);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Leg02);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Boot02);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Helm03);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Chest03);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Leg03);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Boot03);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Helm04);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Chest04);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Leg04);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Boot04);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Helm05);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Chest05);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Leg05);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               ch = this.rand.nextInt(100) + 1;
               if (ch <= 30) {
                  item = new ItemStack(RegisterItem.Boot05);
                  Player.field_71071_by.func_70441_a(item);
                  Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
                  return false;
               }

               item = new ItemStack(RegisterItem.sw01a);
               Player.field_71071_by.func_70441_a(item);
               Player.func_145747_a(new ChatComponentText("§aสุ่มได้ไอเทม " + item.func_82833_r()));
               return false;
            }

            Player.func_145747_a(new ChatComponentText("§cไม่มีช่องว่างสำหรับรับไอเทม"));
         } else {
            Player.func_145747_a(new ChatComponentText("§cไม่มีไอเทม GachaCoin 2"));
         }
      }

      return false;
   }
}
