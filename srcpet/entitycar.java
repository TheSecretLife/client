package srcpet;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class entitycar extends EntityTameable {
   private final EntityAIControlledByPlayer aiControlledByPlayer;

   public entitycar(World world) {
      super(world);
      this.field_70714_bg.func_75776_a(0, new EntityAISwimming(this));
      this.field_70714_bg.func_75776_a(1, this.aiControlledByPlayer = new EntityAIControlledByPlayer(this, 1.0F));
   }

   public boolean func_70650_aV() {
      return true;
   }

   public void func_70903_f(boolean b) {
      super.func_70903_f(b);
   }

   public EntityAgeable func_90011_a(EntityAgeable age) {
      return null;
   }

   protected void func_110147_ax() {
      super.func_110147_ax();
      this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(1.0D);
      this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(100.0D);
   }

   public String getOwnerName() {
      return this.field_70180_af.func_75681_e(17);
   }

   public void setOwner(String zs) {
      this.field_70180_af.func_75692_b(17, zs);
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
            this.func_70659_e((float)this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e() - 0.75F);
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

   public void func_70014_b(NBTTagCompound tag) {
      super.func_70014_b(tag);
   }

   public void func_70037_a(NBTTagCompound tag) {
      super.func_70037_a(tag);
   }

   public boolean func_70097_a(DamageSource p_70097_1_, float p_70097_2_) {
      return false;
   }

   public void func_70071_h_() {
      if (this.func_70902_q() != null) {
         EntityPlayer p = (EntityPlayer)this.func_70902_q();
         data px = data.get(p);
         if (px.Car != null && px.Car.func_145782_y() != this.func_145782_y()) {
            this.func_70106_y();
         }
      } else {
         this.func_70106_y();
      }

      super.func_70071_h_();
   }

   protected boolean func_70692_ba() {
      return this.func_70902_q() == null;
   }
}
