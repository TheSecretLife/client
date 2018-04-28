package farmmode;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public abstract class entitybeetle extends EntityTameable {
   public int beetletype = 0;
   public String Name = "";
   public String ownername = "";
   public int health = 100;
   public int targettrack = 0;
   private PathEntity entitypath;
   public int type = 17;

   public entitybeetle(World world) {
      super(world);
      this.field_70124_G = false;
      this.func_70105_a(1.0F, 1.0F);
      this.func_70903_f(false);
      this.func_70096_w().func_75682_a(22, Integer.valueOf(0));
      this.func_70096_w().func_75682_a(23, Integer.valueOf(0));
      this.func_70096_w().func_75682_a(31, this.type);
   }

   public EntityAgeable func_90011_a(EntityAgeable p_90011_1_) {
      return null;
   }

   public void func_70903_f(boolean b) {
      super.func_70903_f(b);
   }

   public String getOwnerName() {
      return this.field_70180_af.func_75681_e(17);
   }

   public void setOwner(String zs) {
      this.field_70180_af.func_75692_b(17, zs);
   }

   protected void func_70069_a(float f) {
   }

   protected void func_110147_ax() {
      super.func_110147_ax();
      this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(100.0D);
   }

   public boolean func_70601_bi() {
      return super.func_70601_bi();
   }

   public boolean func_70617_f_() {
      return false;
   }

   public void func_70612_e(float f, float f1) {
      double d1;
      if (this.func_70072_I()) {
         d1 = this.field_70163_u;
         this.func_70060_a(f, f1, 0.02F);
         this.func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
         this.field_70159_w *= 0.800000011920929D;
         this.field_70181_x *= 0.800000011920929D;
         this.field_70179_y *= 0.800000011920929D;
      } else if (this.func_70058_J()) {
         d1 = this.field_70163_u;
         this.func_70060_a(f, f1, 0.02F);
         this.func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
         this.field_70159_w *= 0.5D;
         this.field_70181_x *= 0.5D;
         this.field_70179_y *= 0.5D;
      } else {
         float f2 = 0.91F;
         if (this.field_70122_E) {
            f2 = 0.5460001F;
            Block block = this.field_70170_p.func_147439_a(MathHelper.func_76128_c(this.field_70165_t), MathHelper.func_76128_c(this.field_70121_D.field_72338_b) - 1, MathHelper.func_76128_c(this.field_70161_v));
            if (block != Blocks.field_150350_a) {
               f2 = block.field_149765_K * 0.91F;
            }
         }

         float f3 = 0.162771F / (f2 * f2 * f2);
         this.func_70060_a(f, f1, this.field_70122_E ? 0.1F * f3 : 0.02F);
         f2 = 0.91F;
         if (this.field_70122_E) {
            f2 = 0.5460001F;
            Block block = this.field_70170_p.func_147439_a(MathHelper.func_76128_c(this.field_70165_t), MathHelper.func_76128_c(this.field_70121_D.field_72338_b) - 1, MathHelper.func_76128_c(this.field_70161_v));
            if (block != Blocks.field_150350_a) {
               f2 = block.field_149765_K * 0.91F;
            }
         }

         this.func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
         this.field_70159_w *= (double)f2;
         this.field_70181_x *= (double)f2;
         this.field_70179_y *= (double)f2;
         if (this.field_70123_F) {
            this.field_70181_x = 0.2D;
         }

         if (this.field_70146_Z.nextInt(30) == 0) {
            this.field_70181_x = -0.25D;
         }
      }

      d1 = this.field_70165_t - this.field_70169_q;
      double d3 = this.field_70161_v - this.field_70166_s;
      float f4 = MathHelper.func_76133_a(d1 * d1 + d3 * d3) * 4.0F;
      if (f4 > 1.0F) {
         f4 = 1.0F;
      }

   }

   protected void func_70626_be() {
      this.field_70787_b = false;
      float f = 16.0F;
      if (this.field_70789_a == null) {
         List buglist = this.field_70170_p.func_72872_a(entitybeetle.class, AxisAlignedBB.func_72330_a(this.field_70165_t - 10.0D, this.field_70163_u - 10.0D, this.field_70161_v - 10.0D, this.field_70165_t + 10.0D, this.field_70163_u + 10.0D, this.field_70161_v + 10.0D));
         if (!buglist.isEmpty() && buglist.get(0) != null && buglist.get(0) != this && buglist.get(0) != this) {
            entitybeetle bugtarget = (entitybeetle)buglist.get(0);
            if (bugtarget.func_70909_n() && bugtarget.func_70902_q() != null) {
               if (bugtarget.func_70902_q() != this.func_70902_q()) {
                  this.field_70789_a = (Entity)buglist.get(0);
               } else {
                  this.field_70789_a = null;
               }
            } else {
               this.field_70789_a = (Entity)buglist.get(0);
            }
         }
      } else if (!this.field_70789_a.func_70089_S()) {
         this.field_70789_a = null;
      } else {
         if (this.field_70789_a != null) {
            this.entitypath = this.field_70170_p.func_72865_a(this, this.field_70789_a, f, true, false, false, true);
         }

         float f1 = this.field_70789_a.func_70032_d(this);
         if (this.func_70685_l(this.field_70789_a)) {
            this.attackEntityAsMob(this.field_70789_a, f1);
            this.field_70789_a = null;
         }
      }

      if (!this.field_70787_b && this.field_70789_a != null && (this.entitypath == null || this.field_70146_Z.nextInt(10) == 0)) {
         this.entitypath = this.field_70170_p.func_72865_a(this, this.field_70789_a, f, true, false, false, true);
      } else if (this.entitypath == null && this.field_70146_Z.nextInt(80) == 0 || this.field_70146_Z.nextInt(80) == 0) {
         boolean flag = false;
         int j = -1;
         int k = -1;
         int l = -1;
         float f2 = -99999.0F;

         for(int i1 = 0; i1 < 10; ++i1) {
            int j1 = MathHelper.func_76128_c(this.field_70165_t + (double)this.field_70146_Z.nextInt(13) - 6.0D);
            int k1 = MathHelper.func_76128_c(this.field_70163_u + (double)this.field_70146_Z.nextInt(7) - 3.0D);
            int l1 = MathHelper.func_76128_c(this.field_70161_v + (double)this.field_70146_Z.nextInt(13) - 6.0D);
            float f3 = this.func_70783_a(j1, k1, l1);
            if (f3 > f2) {
               f2 = f3;
               j = j1;
               k = k1;
               l = l1;
               flag = true;
            }
         }

         if (flag) {
            this.entitypath = this.field_70170_p.func_72844_a(this, j, k, l, 10.0F, true, false, false, true);
         }
      }

      int i = MathHelper.func_76128_c(this.field_70121_D.field_72338_b);
      boolean flag1 = this.func_70072_I();
      boolean flag2 = this.func_70058_J();
      this.field_70125_A = 0.0F;
      if (this.entitypath != null && this.field_70146_Z.nextInt(100) != 0) {
         Vec3 vec3d = this.entitypath.func_75878_a(this);
         double d1 = (double)(this.field_70130_N * 2.0F);

         while(vec3d != null && vec3d.func_72445_d(this.field_70165_t, vec3d.field_72448_b, this.field_70161_v) < d1 * d1) {
            this.entitypath.func_75875_a();
            if (this.entitypath.func_75879_b()) {
               vec3d = null;
               this.entitypath = null;
            } else {
               vec3d = this.entitypath.func_75878_a(this);
            }
         }

         this.field_70703_bu = false;
         if (vec3d != null) {
            d1 = vec3d.field_72450_a - this.field_70165_t;
            double d2 = vec3d.field_72449_c - this.field_70161_v;
            double d3 = vec3d.field_72448_b - (double)i;
            float f4 = (float)(Math.atan2(d2, d1) * 180.0D / 3.141592741012573D) - 90.0F;
            float f5 = f4 - this.field_70177_z;

            for(this.field_70701_bs = (float)this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e(); f5 < -180.0F; f5 += 360.0F) {
               ;
            }

            while(f5 >= 180.0F) {
               f5 -= 360.0F;
            }

            if (f5 > 30.0F) {
               f5 = 30.0F;
            }

            if (f5 < -30.0F) {
               f5 = -30.0F;
            }

            this.field_70177_z += f5;
            if (this.field_70787_b && this.field_70789_a != null) {
               double d4 = this.field_70789_a.field_70165_t - this.field_70165_t;
               double d5 = this.field_70789_a.field_70161_v - this.field_70161_v;
               float f6 = this.field_70177_z;
               this.field_70177_z = (float)(Math.atan2(d5, d4) * 180.0D / 3.141592741012573D) - 90.0F;
               float f7 = (f6 - this.field_70177_z + 90.0F) * 3.141593F / 180.0F;
               this.field_70702_br = -MathHelper.func_76126_a(f7) * this.field_70701_bs * 1.0F;
               this.field_70701_bs = MathHelper.func_76134_b(f7) * this.field_70701_bs * 1.0F;
            }

            if (d3 > 0.0D) {
               this.field_70703_bu = true;
            }
         }

         if (this.field_70789_a != null) {
            this.func_70625_a(this.field_70789_a, 30.0F, 30.0F);
         }

         if (this.field_70123_F) {
            this.field_70703_bu = true;
         }

         if (this.field_70146_Z.nextFloat() < 0.8F && (flag1 || flag2)) {
            this.field_70703_bu = true;
         }

      } else {
         super.func_70626_be();
         this.entitypath = null;
      }
   }

   public void func_70071_h_() {
      super.func_70071_h_();
      if (!this.field_70170_p.field_72995_K) {
         this.func_70096_w().func_75692_b(22, this.beetletype);
         this.func_70096_w().func_75692_b(31, this.type);
         if (!this.field_70170_p.func_147437_c((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v) && this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v) != Blocks.field_150355_j && this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v) != Blocks.field_150329_H) {
            this.func_70096_w().func_75692_b(23, Integer.valueOf(0));
            this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.3D);
         } else {
            this.func_70096_w().func_75692_b(23, Integer.valueOf(1));
            this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(1.0D);
         }
      }

   }

   public boolean attackEntityAsMob(Entity en, float p_70785_2_) {
      return p_70785_2_ < 1.5F ? en.func_70097_a(DamageSource.func_76358_a(this), 5.0F) : false;
   }

   public boolean func_70097_a(DamageSource p_70097_1_, float p_70097_2_) {
      Entity entity = p_70097_1_.func_76346_g();
      return entity != null && !(entity instanceof EntityPlayer) && !(entity instanceof EntityArrow) ? super.func_70097_a(p_70097_1_, p_70097_2_) : false;
   }

   public void func_70014_b(NBTTagCompound tag) {
      super.func_70014_b(tag);
      tag.func_74768_a("beetletype", this.beetletype);
      tag.func_74778_a("Name", this.Name);
      tag.func_74778_a("ownername", this.ownername);
      tag.func_74768_a("health", this.health);
      tag.func_74768_a("type", this.type);
   }

   public void func_70037_a(NBTTagCompound tag) {
      super.func_70037_a(tag);
      this.beetletype = tag.func_74762_e("beetletype");
      this.Name = tag.func_74779_i("Name");
      this.ownername = tag.func_74779_i("ownername");
      this.health = tag.func_74762_e("health");
      this.type = tag.func_74762_e("type");
   }

   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
      ItemStack hand = par1EntityPlayer.field_71071_by.func_70448_g();
      StoreData px = StoreData.get(par1EntityPlayer);
      if (!this.field_70170_p.field_72995_K) {
         if (px.deleyuse == 0) {
            ItemStack drop;
            NBTTagCompound nbt;
            if (this.func_70909_n()) {
               if (par1EntityPlayer.func_110124_au().toString().equalsIgnoreCase(this.getOwnerName())) {
                  if (hand != null && hand.func_77973_b() == ReqBeeItem.BugTame) {
                     px.deleyuse = 20;
                     drop = null;
                     if (this.type == 1) {
                        drop = new ItemStack(ReqBeetleItem.bt01);
                     } else if (this.type == 2) {
                        drop = new ItemStack(ReqBeetleItem.bt02);
                     } else if (this.type == 3) {
                        drop = new ItemStack(ReqBeetleItem.bt03);
                     } else if (this.type == 4) {
                        drop = new ItemStack(ReqBeetleItem.bt04);
                     } else if (this.type == 5) {
                        drop = new ItemStack(ReqBeetleItem.bt05);
                     } else if (this.type == 6) {
                        drop = new ItemStack(ReqBeetleItem.bt06);
                     } else if (this.type == 7) {
                        drop = new ItemStack(ReqBeetleItem.bt07);
                     } else if (this.type == 8) {
                        drop = new ItemStack(ReqBeetleItem.bt08);
                     } else if (this.type == 9) {
                        drop = new ItemStack(ReqBeetleItem.bt09);
                     } else if (this.type == 10) {
                        drop = new ItemStack(ReqBeetleItem.bt10);
                     } else if (this.type == 11) {
                        drop = new ItemStack(ReqBeetleItem.bt11);
                     } else if (this.type == 12) {
                        drop = new ItemStack(ReqBeetleItem.bt12);
                     } else if (this.type == 13) {
                        drop = new ItemStack(ReqBeetleItem.bt13);
                     } else if (this.type == 14) {
                        drop = new ItemStack(ReqBeetleItem.bt14);
                     } else if (this.type == 15) {
                        drop = new ItemStack(ReqBeetleItem.bt15);
                     } else if (this.type == 16) {
                        drop = new ItemStack(ReqBeetleItem.bt16);
                     } else if (this.type == 17) {
                        drop = new ItemStack(ReqBeetleItem.bt17);
                     }

                     nbt = drop.func_77978_p();
                     if (nbt == null) {
                        nbt = new NBTTagCompound();
                     }

                     nbt.func_74768_a("type", this.beetletype);
                     drop.func_77982_d(nbt);
                     this.func_70099_a(drop, 1.0F);
                     this.func_70106_y();
                     hand.func_77972_a(1, par1EntityPlayer);
                  } else {
                     par1EntityPlayer.func_145747_a(new ChatComponentText(this.ownername + " §eเป็นเจ้าของด้วง"));
                  }
               } else {
                  par1EntityPlayer.func_145747_a(new ChatComponentText(this.ownername + " §eเป็นเจ้าของด้วง"));
               }
            } else if (hand != null && hand.func_77973_b() == ReqBeeItem.BugTame) {
               px.deleyuse = 20;
               drop = null;
               if (this.type == 1) {
                  drop = new ItemStack(ReqBeetleItem.bt01);
               } else if (this.type == 2) {
                  drop = new ItemStack(ReqBeetleItem.bt02);
               } else if (this.type == 3) {
                  drop = new ItemStack(ReqBeetleItem.bt03);
               } else if (this.type == 4) {
                  drop = new ItemStack(ReqBeetleItem.bt04);
               } else if (this.type == 5) {
                  drop = new ItemStack(ReqBeetleItem.bt05);
               } else if (this.type == 6) {
                  drop = new ItemStack(ReqBeetleItem.bt06);
               } else if (this.type == 7) {
                  drop = new ItemStack(ReqBeetleItem.bt07);
               } else if (this.type == 8) {
                  drop = new ItemStack(ReqBeetleItem.bt08);
               } else if (this.type == 9) {
                  drop = new ItemStack(ReqBeetleItem.bt09);
               } else if (this.type == 10) {
                  drop = new ItemStack(ReqBeetleItem.bt10);
               } else if (this.type == 11) {
                  drop = new ItemStack(ReqBeetleItem.bt11);
               } else if (this.type == 12) {
                  drop = new ItemStack(ReqBeetleItem.bt12);
               } else if (this.type == 13) {
                  drop = new ItemStack(ReqBeetleItem.bt13);
               } else if (this.type == 14) {
                  drop = new ItemStack(ReqBeetleItem.bt14);
               } else if (this.type == 15) {
                  drop = new ItemStack(ReqBeetleItem.bt15);
               } else if (this.type == 16) {
                  drop = new ItemStack(ReqBeetleItem.bt16);
               } else if (this.type == 17) {
                  drop = new ItemStack(ReqBeetleItem.bt17);
               }

               nbt = drop.func_77978_p();
               if (nbt == null) {
                  nbt = new NBTTagCompound();
               }

               nbt.func_74768_a("type", this.beetletype);
               drop.func_77982_d(nbt);
               this.func_70099_a(drop, 1.0F);
               this.func_70106_y();
               hand.func_77972_a(1, par1EntityPlayer);
            } else {
               par1EntityPlayer.func_145747_a(new ChatComponentText("§eยังไม่มีเจ้าของ"));
            }
         } else {
            par1EntityPlayer.func_145747_a(new ChatComponentText("§cกรุณาอย่าคลิกรัวเกินไป"));
         }
      }

      return false;
   }
}
