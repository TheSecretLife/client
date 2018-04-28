package farmmode;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget.Sorter;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public abstract class entitywater extends EntityWaterMob {
   private float factor1 = 0.0F;
   private float factor2 = 0.0F;
   private float randomSpeed = 0.0F;
   private float randomVecX = 0.0F;
   private float randomVecY = 0.0F;
   private float randomVecZ = 0.0F;
   protected int mobInterval = 30;
   protected float mobSpeed = 0.2F;
   public String OwnerName = "";
   public boolean tamed = false;
   public boolean typed = false;
   public int Age = 0;
   public boolean baby = false;
   public int item = 0;
   public boolean havemate = false;
   public int sondeley = 0;
   public int type = 0;
   public int fishtype = 0;

   public entitywater(World var1) {
      super(var1);
      this.factor2 = 1.0F / (this.field_70146_Z.nextFloat() + 1.0F) * 0.2F;
      this.func_70096_w().func_75682_a(22, Integer.valueOf(0));
      this.func_70096_w().func_75682_a(30, this.type);
      this.func_70096_w().func_75682_a(31, this.fishtype);
   }

   protected int getAttackStrength() {
      return 0;
   }

   protected boolean canAttackEntity(Entity var1) {
      return var1 instanceof EntityLiving && this.field_70130_N > var1.field_70130_N && this.field_70131_O >= var1.field_70131_O;
   }

   protected Entity findEntityToAttack() {
      List var1 = this.field_70170_p.func_72839_b(this, this.field_70121_D.func_72314_b(10.0D, 6.0D, 10.0D));
      Collections.sort(var1, new Sorter(this));
      Iterator var2 = var1.iterator();

      Entity var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (Entity)var2.next();
      } while(!var3.func_70090_H() || !this.canAttackEntity(var3));

      return var3;
   }

   public void func_70108_f(Entity var1) {
      super.func_70108_f(var1);
      if (this.field_70789_a == var1 && this.getAttackStrength() != 0) {
         this.field_70724_aR = 30;
         this.field_70789_a.func_70097_a(DamageSource.func_76358_a(this), (float)this.getAttackStrength());
      }

   }

   public void func_70636_d() {
      super.func_70636_d();
      this.factor1 += this.factor2;
      if (this.factor1 > 6.2831855F) {
         this.factor1 -= 6.2831855F;
         if (this.field_70146_Z.nextInt(10) == 0) {
            this.factor2 = 1.0F / (this.field_70146_Z.nextFloat() + 1.0F) * 0.2F;
         }
      }

      float var1;
      if (this.func_70090_H() && this.field_70153_n == null) {
         if (this.factor1 < 3.1415927F) {
            var1 = this.factor1 / 3.1415927F;
            if ((double)var1 > 0.75D) {
               this.randomSpeed = 1.0F;
            }
         } else {
            this.randomSpeed *= 0.95F;
         }

         if (!this.field_70170_p.field_72995_K) {
            this.field_70159_w = (double)(this.randomVecX * this.randomSpeed);
            this.field_70181_x = (double)(this.randomVecY * this.randomSpeed);
            this.field_70179_y = (double)(this.randomVecZ * this.randomSpeed);
         }

         this.field_70761_aq += (-((float)Math.atan2(this.field_70159_w, this.field_70179_y)) * 180.0F / 3.1415927F - this.field_70761_aq) * 0.1F;
         this.field_70177_z = this.field_70761_aq;
         var1 = MathHelper.func_76133_a(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
         if (var1 > 0.07F) {
            this.field_70125_A = (float)Math.atan2(this.field_70181_x, (double)var1) * 180.0F / 3.1415927F;
         }
      } else if (this.field_70153_n != null && this.func_70090_H()) {
         if (this.factor1 < 3.1415927F) {
            var1 = this.factor1 / 3.1415927F;
            if ((double)var1 > 0.75D) {
               this.randomSpeed = 1.0F;
            }
         } else {
            this.randomSpeed *= 0.95F;
         }

         if (!this.field_70170_p.field_72995_K) {
            if (this.field_70170_p.func_147439_a(MathHelper.func_76128_c(this.field_70165_t), (int)this.field_70163_u + 1, MathHelper.func_76128_c(this.field_70161_v)) == Blocks.field_150355_j) {
               this.field_70181_x = (double)(this.randomVecY * this.randomSpeed + 0.02F);
            } else {
               this.field_70181_x = (double)(this.randomVecY * this.randomSpeed - 0.03F);
            }
         }

         this.field_70761_aq += (-((float)Math.atan2(this.field_70159_w, this.field_70179_y)) * 180.0F / 3.1415927F - this.field_70761_aq) * 0.1F;
         this.field_70177_z = this.field_70761_aq;
      } else {
         this.field_70159_w = 0.0D;
         this.field_70181_x -= 0.08D;
         this.field_70181_x *= 0.9800000190734863D;
         this.field_70179_y = 0.0D;
         if (!this.func_70090_H()) {
            this.field_70125_A = 0.0F;
            if (this.field_70122_E && this.field_70146_Z.nextInt(30) == 0) {
               if (this.field_70153_n != null) {
                  this.field_70181_x = 0.0D;
               } else {
                  this.field_70181_x = 0.30000001192092896D;
               }

               this.field_70159_w = (double)(-0.4F + this.field_70146_Z.nextFloat() * 0.8F);
               this.field_70179_y = (double)(-0.4F + this.field_70146_Z.nextFloat() * 0.8F);
            }
         }
      }

   }

   protected void func_70626_be() {
      ++this.field_70708_bq;
      if (this.field_70708_bq == 0) {
         this.randomVecX = this.randomVecY = this.randomVecZ = 0.0F;
      } else if (this.field_70146_Z.nextInt(this.mobInterval) == 0 || !this.field_70171_ac || this.field_70132_H || this.randomVecX == 0.0F && this.randomVecY == 0.0F && this.randomVecZ == 0.0F && this.field_70153_n == null) {
         if (this.field_70789_a != null && this.field_70724_aR <= 0) {
            if (this.field_70789_a != null) {
               if (!this.field_70789_a.field_70128_L && this.field_70789_a.func_70090_H() && this.func_70032_d(this.field_70789_a) <= 10.0F && this.field_70724_aR <= 0) {
                  this.randomVecX = (float)Math.signum(this.field_70789_a.field_70165_t - this.field_70165_t) * this.mobSpeed;
                  this.randomVecY = (float)Math.signum(this.field_70789_a.field_70163_u - this.field_70163_u) * 0.1F;
                  this.randomVecZ = (float)Math.signum(this.field_70789_a.field_70161_v - this.field_70161_v) * this.mobSpeed;
                  if (!(this.field_70789_a instanceof EntityLiving)) {
                     this.randomVecY -= 0.12F;
                     if (this.field_70789_a instanceof EntityFishHook && this.func_70032_d(this.field_70789_a) < 1.0F) {
                        EntityFishHook var2 = (EntityFishHook)this.field_70789_a;
                        this.field_70789_a = null;
                        if (var2.field_146043_c == null) {
                           this.func_70097_a(DamageSource.func_76356_a(var2, var2.field_146042_b), 0.0F);
                           var2.field_146043_c = this;
                           var2.field_146042_b.func_71064_a(StatList.field_75933_B, 1);
                        }
                     }
                  }
               } else {
                  this.field_70789_a = null;
               }
            }
         } else {
            float var1 = this.field_70146_Z.nextFloat() * 3.1415927F * 2.0F;
            this.randomVecX = MathHelper.func_76134_b(var1) * this.mobSpeed;
            this.randomVecY = -0.1F + this.field_70146_Z.nextFloat() * 0.2F;
            this.randomVecZ = MathHelper.func_76126_a(var1) * this.mobSpeed;
            if (this.getAttackStrength() > 0) {
               this.field_70789_a = this.findEntityToAttack();
            }
         }
      }

   }

   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
      ItemStack hand = par1EntityPlayer.field_71071_by.func_70448_g();
      StoreData px = StoreData.get(par1EntityPlayer);
      Item drop = null;
      if (this.fishtype == 0) {
         if (this.type == 0) {
            drop = ReqFishItem.Fish01;
         } else if (this.type == 1) {
            drop = ReqFishItem.Fish02;
         } else if (this.type == 2) {
            drop = ReqFishItem.Fish03;
         } else if (this.type == 3) {
            drop = ReqFishItem.Fish04;
         } else if (this.type == 4) {
            drop = ReqFishItem.Fish05;
         } else if (this.type == 5) {
            drop = ReqFishItem.Fish00;
         }
      } else if (this.fishtype == 1) {
         if (this.type == 0) {
            drop = ReqFishItem.Fish06;
         } else if (this.type == 1) {
            drop = ReqFishItem.Fish07;
         } else if (this.type == 2) {
            drop = ReqFishItem.Fish08;
         } else if (this.type == 3) {
            drop = ReqFishItem.Fish09;
         } else if (this.type == 4) {
            drop = ReqFishItem.Fish10;
         } else if (this.type == 5) {
            drop = ReqFishItem.Fish11;
         }
      } else if (this.fishtype == 2) {
         if (this.type == 0) {
            drop = ReqFishItem.Fish12;
         } else if (this.type == 1) {
            drop = ReqFishItem.Fish13;
         } else if (this.type == 2) {
            drop = ReqFishItem.Fish14;
         } else if (this.type == 3) {
            drop = ReqFishItem.Fish15;
         } else if (this.type == 4) {
            drop = ReqFishItem.Fish16;
         } else if (this.type == 5) {
            drop = ReqFishItem.Fish17;
         }
      } else if (this.fishtype == 3) {
         if (this.type == 0) {
            drop = ReqFishItem.Fish18;
         } else if (this.type == 1) {
            drop = ReqFishItem.Fish19;
         } else if (this.type == 2) {
            drop = ReqFishItem.Fish20;
         } else if (this.type == 3) {
            drop = ReqFishItem.Fish21;
         } else if (this.type == 4) {
            drop = ReqFishItem.Fish22;
         } else if (this.type == 5) {
            drop = ReqFishItem.Fish23;
         }
      } else if (this.fishtype == 4) {
         if (this.type == 0) {
            drop = ReqFishItem.Fish24;
         } else if (this.type == 1) {
            drop = ReqFishItem.Fish25;
         } else if (this.type == 2) {
            drop = ReqFishItem.Fish26;
         } else if (this.type == 3) {
            drop = ReqFishItem.Fish27;
         } else if (this.type == 4) {
            drop = ReqFishItem.Fish28;
         } else if (this.type == 5) {
            drop = ReqFishItem.Fish29;
         }
      } else if (this.fishtype == 5) {
         if (this.type == 0) {
            drop = ReqFishItem.Fish30;
         } else if (this.type == 1) {
            drop = ReqFishItem.Fish31;
         } else if (this.type == 2) {
            drop = ReqFishItem.Fish32;
         } else if (this.type == 3) {
            drop = ReqFishItem.Fish33;
         } else if (this.type == 4) {
            drop = ReqFishItem.Fish34;
         } else if (this.type == 5) {
            drop = ReqFishItem.Fish35;
         }
      } else if (this.fishtype == 6) {
         if (this.type == 0) {
            drop = ReqFishItem.Fish36;
         } else if (this.type == 1) {
            drop = ReqFishItem.Fish37;
         } else if (this.type == 2) {
            drop = ReqFishItem.Fish38;
         } else if (this.type == 3) {
            drop = ReqFishItem.Fish39;
         } else if (this.type == 4) {
            drop = ReqFishItem.Fish40;
         } else if (this.type == 5) {
            drop = ReqFishItem.Fish41;
         }
      }

      if (!this.field_70170_p.field_72995_K) {
         if (this.tamed) {
            if (par1EntityPlayer.func_110124_au().toString().equalsIgnoreCase(this.OwnerName)) {
               if (hand != null && hand.func_77973_b() == ReqBeeItem.BugTame) {
                  if (!this.baby) {
                     this.func_145779_a(drop, 1);
                     this.func_70106_y();
                     hand.func_77972_a(1, par1EntityPlayer);
                  } else {
                     par1EntityPlayer.func_145747_a(new ChatComponentText("§cจับลูกปลาไม่ได้"));
                  }
               } else if (this.havemate) {
                  par1EntityPlayer.func_145747_a(new ChatComponentText("§eพร้อมจะผสมพันธุ์แล้ว"));
               } else {
                  par1EntityPlayer.func_145747_a(new ChatComponentText("§cไม่พร้อมผสมพันธุ์"));
               }
            } else {
               par1EntityPlayer.func_145747_a(new ChatComponentText("§cปลามีเจ้าของแล้ว"));
            }
         } else if (hand != null && hand.func_77973_b() == ReqBeeItem.BugTame) {
            if (!this.baby) {
               int chance = this.field_70146_Z.nextInt(100) + 1;
               if (chance <= 5) {
                  this.func_145779_a(drop, 1);
                  this.func_70106_y();
                  par1EntityPlayer.func_145747_a(new ChatComponentText("§aจับปลาได้แล้ว"));
               } else {
                  this.func_70106_y();
                  par1EntityPlayer.func_145747_a(new ChatComponentText("§cจับไม่สำเร็จ ปลาหนีไปแล้ว"));
               }

               hand.func_77972_a(1, par1EntityPlayer);
            } else {
               par1EntityPlayer.func_145747_a(new ChatComponentText("§cจับลูกปลาไม่ได้"));
            }
         }
      }

      return false;
   }

   public void func_70014_b(NBTTagCompound tag) {
      super.func_70014_b(tag);
      tag.func_74778_a("OwnerName", this.OwnerName);
      tag.func_74757_a("tamed", this.tamed);
      tag.func_74757_a("baby", this.baby);
      tag.func_74757_a("typed", this.typed);
      tag.func_74757_a("havemate", this.havemate);
      tag.func_74768_a("item", this.item);
      tag.func_74768_a("type", this.type);
      tag.func_74768_a("fishtype", this.fishtype);
      tag.func_74768_a("Age", this.Age);
      tag.func_74768_a("sondeley", this.sondeley);
   }

   public void func_70037_a(NBTTagCompound tag) {
      super.func_70037_a(tag);
      this.OwnerName = tag.func_74779_i("OwnerName");
      this.tamed = tag.func_74767_n("tamed");
      this.baby = tag.func_74767_n("baby");
      this.typed = tag.func_74767_n("typed");
      this.havemate = tag.func_74767_n("havemate");
      this.item = tag.func_74762_e("item");
      this.Age = tag.func_74762_e("Age");
      this.type = tag.func_74762_e("type");
      this.fishtype = tag.func_74762_e("fishtype");
      this.sondeley = tag.func_74762_e("sondeley");
      this.func_70096_w().func_75692_b(30, this.type);
      this.func_70096_w().func_75692_b(31, this.fishtype);
   }

   public boolean func_70097_a(DamageSource p_70097_1_, float p_70097_2_) {
      Entity entity = p_70097_1_.func_76346_g();
      return (entity == null || !(entity instanceof EntityPlayer)) && (entity == null || !(entity instanceof EntityArrow)) ? super.func_70097_a(p_70097_1_, p_70097_2_) : false;
   }

   public boolean FindFood(double x, double y, double z, int r) {
      for(double x1 = (double)(-r); x1 < (double)r; ++x1) {
         for(double y1 = (double)(-r); y1 < (double)r; ++y1) {
            for(double z1 = (double)(-r); z1 < (double)r; ++z1) {
               double dist = (double)MathHelper.func_76133_a(x1 * x1 + y1 * y1 + z1 * z1);
               if (dist <= (double)r) {
                  Block blockatcords = this.field_70170_p.func_147439_a((int)x + (int)x1, (int)y + (int)y1, (int)z + (int)z1);
                  if (blockatcords instanceof BlockSeaPlant) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }
}
