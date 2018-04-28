package farmmode;

import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class fish1entity extends entitywater {
   public fish1entity(World world) {
      super(world);
      this.func_70105_a(1.0F, 1.0F);
      this.item = 1;
   }

   public void func_70071_h_() {
      super.func_70071_h_();
      if (!this.field_70170_p.field_72995_K) {
         if (!this.tamed && !this.typed) {
            this.typed = true;
            int chance = this.field_70146_Z.nextInt(100) + 1;
            if (chance <= 30) {
               this.fishtype = 0;
            } else if (chance <= 55) {
               this.fishtype = 3;
            } else if (chance <= 75) {
               this.fishtype = 4;
            } else if (chance <= 85) {
               this.fishtype = 5;
            } else if (chance <= 92) {
               this.fishtype = 6;
            } else if (chance <= 98) {
               this.fishtype = 2;
            } else if (chance <= 100) {
               this.fishtype = 1;
            }

            int chance2 = this.field_70146_Z.nextInt(100) + 1;
            if (chance2 <= 40) {
               this.type = 0;
            } else if (chance2 <= 70) {
               this.type = 1;
            } else if (chance2 <= 85) {
               this.type = 2;
            } else if (chance2 <= 95) {
               this.type = 3;
            } else if (chance2 <= 98) {
               this.type = 4;
            } else if (chance2 <= 100) {
               this.type = 5;
            }
         }

         this.func_70096_w().func_75692_b(30, this.type);
         this.func_70096_w().func_75692_b(31, this.fishtype);
         if (this.Age < 0) {
            ++this.Age;
         } else {
            this.baby = false;
         }

         this.func_70096_w().func_75692_b(22, this.Age);
         List en = this.field_70170_p.func_72872_a(fish1entity.class, AxisAlignedBB.func_72330_a(this.field_70165_t - 5.0D, this.field_70163_u - 5.0D, this.field_70161_v - 5.0D, this.field_70165_t + 5.0D, this.field_70163_u + 5.0D, this.field_70161_v + 5.0D));
         fish1entity em1;
         if (en.size() == 2) {
            em1 = (fish1entity)en.get(0);
            fish1entity em2 = (fish1entity)en.get(1);
            if (em1.fishtype == em2.fishtype && !em1.baby && !em2.baby && em1.tamed && em2.tamed) {
               this.havemate = true;
            } else {
               this.havemate = false;
            }
         } else {
            this.havemate = false;
         }

         if (this.havemate && en.size() == 2 && !this.baby) {
            em1 = (fish1entity)en.get(1);
            int ttt = em1.fishtype;
            ++this.sondeley;
            if (this.sondeley >= 18000) {
               this.sondeley = 0;
               if (this.FindFood(this.field_70165_t, this.field_70163_u, this.field_70161_v, 5)) {
                  int chance = this.field_70146_Z.nextInt(3);
                  if (chance == 0) {
                     entitywater e = new fish1entity(this.field_70170_p);
                     int chance2 = this.field_70146_Z.nextInt(100) + 1;
                     if (chance2 >= 1 && chance2 <= 50) {
                        e.type = 0;
                     } else if (chance2 >= 51 && chance2 <= 70) {
                        e.type = 1;
                     } else if (chance2 >= 71 && chance2 <= 85) {
                        e.type = 2;
                     } else if (chance2 >= 86 && chance2 <= 95) {
                        e.type = 3;
                     } else if (chance2 >= 96 && chance2 <= 99) {
                        e.type = 4;
                     } else if (chance2 == 100) {
                        e.type = 5;
                     }

                     e.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
                     e.tamed = true;
                     e.baby = true;
                     e.fishtype = ttt;
                     e.Age = -36000;
                     e.OwnerName = this.OwnerName;
                     this.field_70170_p.func_72838_d(e);
                  }
               }
            }
         } else {
            this.sondeley = 0;
         }
      }

   }
}
