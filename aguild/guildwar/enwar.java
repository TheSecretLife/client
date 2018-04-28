package aguild.guildwar;

import aguild.playerdata;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class enwar extends EntityTameable {
   World world = null;
   public int x = 0;
   public int y = 0;
   public int z = 0;

   public enwar(World x) {
      super(x);
      this.func_70105_a(1.0F, 4.0F);
      this.func_94061_f(true);
   }

   public boolean func_70650_aV() {
      return false;
   }

   protected void func_110147_ax() {
      super.func_110147_ax();
      this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(1.0E-4D);
      this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(10000.0D);
      this.func_110148_a(SharedMonsterAttributes.field_111266_c).func_111128_a(10000.0D);
   }

   public String getOwnerName() {
      return this.field_70180_af.func_75681_e(17);
   }

   public void setOwner(String zs) {
      this.field_70180_af.func_75692_b(17, zs);
   }

   public enwar spawnBabyAnimal(EntityAgeable cs) {
      return new enwar(this.field_70170_p);
   }

   public String getEntityName() {
      return "War Crystal (" + (int)this.func_110143_aJ() + "/" + (int)this.func_110138_aP() + ")";
   }

   public void func_70014_b(NBTTagCompound data) {
      super.func_70014_b(data);
      data.func_74768_a("x", this.x);
      data.func_74768_a("y", this.y);
      data.func_74768_a("z", this.z);
   }

   public void func_70037_a(NBTTagCompound data) {
      super.func_70037_a(data);
      this.x = data.func_74762_e("x");
      this.y = data.func_74762_e("y");
      this.z = data.func_74762_e("z");
   }

   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
      if (par1DamageSource.func_76346_g() != null) {
         if (par1DamageSource.func_76346_g() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)par1DamageSource.func_76346_g();
            playerdata px = playerdata.get(player);
            if (px.inguild) {
               return super.func_70097_a(par1DamageSource, par2);
            } else {
               player.func_145747_a(new ChatComponentText("§cคุณไม่มีกิลไม่สามารถโจมตีหินกิลได้"));
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean func_70652_k(Entity xz) {
      return false;
   }

   public void func_70071_h_() {
      super.func_70071_h_();
      if (!this.field_70170_p.field_72995_K) {
         this.func_94058_c("War Crystal (" + (int)this.func_110143_aJ() + "/" + (int)this.func_110138_aP() + ")");
         if (this.field_70173_aa % 10 == 1) {
            this.func_70634_a((double)this.x, (double)this.y, (double)this.z);
            this.field_70143_R = 0.0F;
         }
      }

   }

   protected boolean func_70692_ba() {
      return false;
   }

   public EntityAgeable func_90011_a(EntityAgeable p_90011_1_) {
      return null;
   }
}
