package farmmode;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entityworm extends EntityTameable {
   public int adultdeley = 0;
   public String ownername = "";

   public entityworm(World p_i1604_1_) {
      super(p_i1604_1_);
      this.func_70105_a(1.0F, 1.0F);
      this.func_70903_f(false);
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

   public boolean attackEntityAsMob(Entity en, float p_70785_2_) {
      return false;
   }

   public boolean func_70097_a(DamageSource damger, float num) {
      return false;
   }

   public void func_70014_b(NBTTagCompound tag) {
      super.func_70014_b(tag);
      tag.func_74768_a("adultdeley", this.adultdeley);
      tag.func_74778_a("ownername", this.ownername);
   }

   public void func_70037_a(NBTTagCompound tag) {
      super.func_70037_a(tag);
      this.adultdeley = tag.func_74762_e("adultdeley");
      this.ownername = tag.func_74779_i("ownername");
   }

   public void func_70071_h_() {
      super.func_70071_h_();
      if (!this.field_70170_p.field_72995_K) {
         ++this.adultdeley;
         if (this.adultdeley >= 18000) {
            int chance = this.field_70146_Z.nextInt(190) + 1;
            beetle1entity e;
            int color;
            if (chance >= 1 && chance <= 30) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               color = this.field_70146_Z.nextInt(100) + 1;
               e.type = 15;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance >= 31 && chance <= 60) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               e.type = 17;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance >= 61 && chance <= 80) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               e.type = 13;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance >= 81 && chance <= 100) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               e.type = 14;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance >= 101 && chance <= 120) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               e.type = 2;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance >= 121 && chance <= 140) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               e.type = 6;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance >= 141 && chance <= 150) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               e.type = 5;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance >= 151 && chance <= 160) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               e.type = 9;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance >= 161 && chance <= 170) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               e.type = 11;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance >= 171 && chance <= 175) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               e.type = 3;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance >= 176 && chance <= 180) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               e.type = 4;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance >= 181 && chance <= 185) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               e.type = 16;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance == 186) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               e.type = 1;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance == 187) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               e.type = 7;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance == 188) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               e.type = 8;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance == 189) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.ownername = this.ownername;
               e.type = 10;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            } else if (chance == 190) {
               e = new beetle1entity(this.field_70170_p);
               e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
               this.field_70170_p.func_72838_d(e);
               e.func_70903_f(true);
               e.setOwner(this.getOwnerName());
               e.type = 12;
               e.ownername = this.ownername;
               color = this.field_70146_Z.nextInt(100) + 1;
               if (color >= 1 && color >= 50) {
                  e.beetletype = 0;
               } else if (color >= 51 && color >= 80) {
                  e.beetletype = 1;
               } else if (color >= 81 && color >= 90) {
                  e.beetletype = 2;
               } else if (color >= 91 && color >= 96) {
                  e.beetletype = 3;
               } else if (color >= 97 && color >= 100) {
                  e.beetletype = 4;
               }
            }

            this.adultdeley = 0;
            this.func_70106_y();
         }
      }

   }

   public boolean func_70085_c(EntityPlayer par1EntityPlayer) {
      if (!this.field_70170_p.field_72995_K) {
         if (this.func_70909_n()) {
            par1EntityPlayer.func_145747_a(new ChatComponentText(this.getOwnerName() + " §eเป็นเจ้าของด้วง"));
         } else {
            par1EntityPlayer.func_145747_a(new ChatComponentText("§eยังไม่มีเจ้าของ"));
         }
      }

      return false;
   }
}
