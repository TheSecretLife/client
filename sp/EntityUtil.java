package sp;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.passive.EntityChicken;

public class EntityUtil {
   public static void Copy(EntityLivingBase copied, EntityLivingBase entity) {
      entity.field_70170_p = copied.field_70170_p;
      entity.field_70725_aQ = copied.field_70725_aQ;
      entity.field_70140_Q = copied.field_70140_Q;
      entity.field_70141_P = copied.field_70140_Q;
      entity.field_70122_E = copied.field_70122_E;
      entity.field_82151_R = copied.field_82151_R;
      entity.field_70701_bs = copied.field_70701_bs;
      entity.field_70702_br = copied.field_70702_br;
      entity.func_70107_b(copied.field_70165_t, copied.field_70163_u, copied.field_70161_v);
      entity.field_70121_D.func_72328_c(copied.field_70121_D);
      entity.field_70169_q = copied.field_70169_q;
      entity.field_70167_r = copied.field_70167_r;
      entity.field_70166_s = copied.field_70166_s;
      entity.field_70159_w = copied.field_70159_w;
      entity.field_70181_x = copied.field_70181_x;
      entity.field_70179_y = copied.field_70179_y;
      entity.field_70177_z = copied.field_70177_z;
      entity.field_70125_A = copied.field_70125_A;
      entity.field_70126_B = copied.field_70126_B;
      entity.field_70127_C = copied.field_70127_C;
      entity.field_70759_as = copied.field_70759_as;
      entity.field_70758_at = copied.field_70758_at;
      entity.field_70760_ar = copied.field_70760_ar;
      entity.field_70726_aT = copied.field_70726_aT;
      entity.field_70727_aS = copied.field_70727_aS;
      entity.field_70761_aq = copied.field_70761_aq;
      entity.field_70142_S = copied.field_70142_S;
      entity.field_70137_T = copied.field_70137_T;
      entity.field_70136_U = copied.field_70136_U;
      entity.field_70721_aZ = copied.field_70721_aZ;
      entity.field_70722_aY = copied.field_70722_aY;
      entity.field_70754_ba = copied.field_70754_ba;
      entity.field_70733_aJ = copied.field_70733_aJ;
      entity.field_70732_aI = copied.field_70732_aI;
      entity.field_82175_bq = copied.field_82175_bq;
      entity.field_110158_av = copied.field_110158_av;
      entity.field_70173_aa = copied.field_70173_aa;
      if (entity instanceof EntityDragon) {
         entity.field_70177_z += 180.0F;
      }

      if (entity instanceof EntityChicken) {
         ((EntityChicken)entity).field_70883_f = copied.field_70122_E ? 0.0F : 1.0F;
      }

      for(int i = 0; i < 5; ++i) {
         entity.func_70062_b(i, copied.func_71124_b(i));
      }

   }
}
