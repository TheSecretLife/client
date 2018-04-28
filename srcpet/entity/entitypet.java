package srcpet.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import srcpet.data;

public class entitypet extends EntityTameable {
   World world = null;
   private final EntityAIControlledByPlayer aiControlledByPlayer;
   public float speed = 0.0F;
   public int type = 0;

   public entitypet(World x) {
      super(x);
      this.func_70105_a(1.0F, 1.0F);
      this.func_70661_as().func_75491_a(true);
      this.field_70714_bg.func_75776_a(0, new EntityAISwimming(this));
      this.field_70714_bg.func_75776_a(1, new EntityAIAttackOnCollide(this, 1.0D, true));
      this.field_70714_bg.func_75776_a(2, new EntityAIFollowOwner(this, 1.0D, 3.0F, 3.0F));
      this.field_70714_bg.func_75776_a(3, this.aiControlledByPlayer = new EntityAIControlledByPlayer(this, 1.0F));
      this.field_70715_bh.func_75776_a(1, new EntityAIOwnerHurtByTarget(this));
      this.field_70715_bh.func_75776_a(2, new EntityAIOwnerHurtTarget(this));
      this.field_70715_bh.func_75776_a(3, new EntityAIHurtByTarget(this, true));
      this.func_70903_f(false);
      this.func_70096_w().func_75682_a(31, this.type);
   }

   public boolean func_70650_aV() {
      return true;
   }

   public void func_70903_f(boolean b) {
      super.func_70903_f(b);
   }

   protected void func_110147_ax() {
      super.func_110147_ax();
      this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.5D);
      this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(100.0D);
   }

   public String getOwnerName() {
      return this.field_70180_af.func_75681_e(17);
   }

   public void setOwner(String zs) {
      this.field_70180_af.func_75692_b(17, zs);
   }

   public entitypet spawnBabyAnimal(EntityAgeable cs) {
      return new entitypet(this.field_70170_p);
   }

   public EntityAgeable func_90011_a(EntityAgeable bb) {
      return this.spawnBabyAnimal(bb);
   }

   public void func_70014_b(NBTTagCompound xw) {
      super.func_70014_b(xw);
   }

   public void func_70037_a(NBTTagCompound as) {
      super.func_70037_a(as);
   }

   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
      return false;
   }

   public boolean func_70652_k(Entity xz) {
      return xz.func_70097_a(DamageSource.func_76358_a(this), 5.0F);
   }

   public void func_70071_h_() {
      if (!this.field_70170_p.field_72995_K) {
         this.func_70096_w().func_75692_b(31, this.type);
         if (this.func_70902_q() != null) {
            EntityPlayer p = (EntityPlayer)this.func_70902_q();
            data px = data.get(p);
            if (px.Pet != null && px.Pet.func_145782_y() != this.func_145782_y()) {
               this.func_70106_y();
            }
         } else {
            this.func_70106_y();
         }
      }

      if (this.func_70096_w().func_75679_c(31) == 1) {
         this.func_70105_a(1.5F, 1.6F);
      } else if (this.func_70096_w().func_75679_c(31) == 2) {
         this.func_70105_a(1.5F, 1.5F);
      } else if (this.func_70096_w().func_75679_c(31) == 3) {
         this.func_70105_a(1.5F, 2.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 4) {
         this.func_70105_a(1.0F, 1.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 5) {
         this.func_70105_a(1.0F, 1.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 6) {
         this.func_70105_a(1.0F, 3.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 7) {
         this.func_70105_a(1.0F, 1.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 8) {
         this.func_70105_a(1.0F, 1.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 9) {
         this.func_70105_a(1.0F, 2.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 10) {
         this.func_70105_a(1.0F, 3.5F);
      } else if (this.func_70096_w().func_75679_c(31) == 11) {
         this.func_70105_a(1.0F, 2.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 12) {
         this.func_70105_a(1.0F, 3.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 13) {
         this.func_70105_a(1.0F, 1.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 14) {
         this.func_70105_a(1.0F, 1.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 15) {
         this.func_70105_a(1.0F, 1.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 16) {
         this.func_70105_a(1.0F, 1.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 17) {
         this.func_70105_a(1.0F, 2.2F);
      } else if (this.func_70096_w().func_75679_c(31) == 18) {
         this.func_70105_a(1.0F, 1.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 19) {
         this.func_70105_a(1.0F, 1.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 20) {
         this.func_70105_a(1.0F, 1.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 21) {
         this.func_70105_a(1.0F, 1.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 22) {
         this.func_70105_a(1.0F, 1.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 23) {
         this.func_70105_a(1.0F, 1.0F);
      } else if (this.func_70096_w().func_75679_c(31) == 24) {
         this.func_70105_a(1.0F, 1.0F);
      }

      super.func_70071_h_();
   }

   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
      if (!this.field_70170_p.field_72995_K) {
         data px = data.get(par1EntityPlayer);
         if (this.func_70909_n()) {
            if (par1EntityPlayer.func_110124_au().toString().equalsIgnoreCase(this.getOwnerName())) {
               par1EntityPlayer.func_70078_a(this);
            } else {
               par1EntityPlayer.func_145747_a(new ChatComponentText("§cคุณไม่ใช่เจ้าของรถคันนี้"));
            }
         }
      }

      return false;
   }

   public EntityAIControlledByPlayer getAIControlledByPlayer() {
      return this.aiControlledByPlayer;
   }

   public void func_70612_e(float par1, float par2) {
      if (this.field_70153_n != null) {
         this.field_70126_B = this.field_70177_z = this.field_70153_n.field_70177_z;
         this.field_70125_A = this.field_70153_n.field_70125_A * 0.5F;
         this.func_70101_b(this.field_70177_z, this.field_70125_A);
         this.field_70759_as = this.field_70761_aq = this.field_70177_z;
         par1 = ((EntityLivingBase)this.field_70153_n).field_70702_br * 0.5F;
         par2 = ((EntityLivingBase)this.field_70153_n).field_70701_bs;
         if (par2 <= 0.0F) {
            par2 *= 0.25F;
         }

         this.field_70138_W = 1.0F;
         this.field_70747_aH = this.func_70689_ay() * 0.1F;
         if (!this.field_70170_p.field_72995_K) {
            this.func_70659_e((float)this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e());
            super.func_70612_e(par1, par2);
         }

         this.field_70722_aY = this.field_70721_aZ;
         double d0 = this.field_70165_t - this.field_70169_q;
         double d1 = this.field_70161_v - this.field_70166_s;
         float f4 = MathHelper.func_76133_a(d0 * d0 + d1 * d1) * 4.0F;
         if (f4 > 1.0F) {
            f4 = 1.0F;
         }

         this.field_70721_aZ += (f4 - this.field_70721_aZ) * 0.4F;
         this.field_70754_ba += this.field_70721_aZ;
      } else {
         this.field_70138_W = 0.5F;
         this.field_70747_aH = 0.02F;
         super.func_70612_e(par1, par2);
      }

   }

   public void func_70043_V() {
      super.func_70043_V();
      if (this.func_70096_w().func_75679_c(31) == 6) {
         float f = MathHelper.func_76126_a(this.field_70761_aq * 3.1415927F / 180.0F);
         float f1 = MathHelper.func_76134_b(this.field_70761_aq * 3.1415927F / 180.0F);
         float f2 = 0.7F;
         float f3 = 0.0F;
         this.field_70153_n.func_70107_b(this.field_70165_t + (double)(f2 * f), this.field_70163_u + this.func_70042_X() + this.field_70153_n.func_70033_W() + (double)f3, this.field_70161_v - (double)(f2 * f1));
         if (this.field_70153_n instanceof EntityLivingBase) {
            ((EntityLivingBase)this.field_70153_n).field_70761_aq = this.field_70761_aq;
         }
      }

   }
}
