package cabalaccessorys.api;

import java.util.List;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class MathUtil {
   public static final double D2R = 0.017453292519943295D;
   public static final double R2D = 57.29577951308232D;

   public static float sin360(float arg) {
      return MathHelper.func_76126_a(arg / 180.0F * 3.1415927F);
   }

   public static float cos360(float arg) {
      return MathHelper.func_76134_b(arg / 180.0F * 3.1415927F);
   }

   public static float clamp(float value, float min, float max) {
      if (value < min) {
         return min;
      } else {
         return value > max ? max : value;
      }
   }

   public static int clamp(int value, int min, int max) {
      if (value < min) {
         return min;
      } else {
         return value > max ? max : value;
      }
   }

   public static int randomInt(Random rand, int min, int max) {
      return max >= min ? min + rand.nextInt(max - min + 1) : max + rand.nextInt(min - max + 1);
   }

   public static float randomFloat(Random rand, float min, float max) {
      return min + rand.nextFloat() * (max - min);
   }

   public static MathUtil.Vec2 polarOffsetXZ(double x, double z, double radius, double angle) {
      x += radius * Math.cos(angle);
      z += radius * Math.sin(angle);
      return new MathUtil.Vec2(x, z);
   }

   public static MovingObjectPosition traceVector(World world, Vec3 src, Vec3 direction, double distance, int steps, Entity ent, EntityLivingBase shooter) {
      direction = direction.func_72432_b();

      for(int i = 0; i < steps; ++i) {
         Vec3 src2 = Vec3.func_72443_a(src.field_72450_a, src.field_72448_b, src.field_72449_c);
         Vec3 dst = src.func_72441_c(direction.field_72450_a * distance, direction.field_72448_b * distance, direction.field_72449_c * distance);
         Vec3 dst2 = Vec3.func_72443_a(dst.field_72450_a, dst.field_72448_b, dst.field_72449_c);
         MovingObjectPosition movingobjectposition = world.func_72933_a(src, dst);
         Entity entity = null;
         double minX;
         double maxX;
         if (src2.field_72450_a < dst2.field_72450_a) {
            minX = src2.field_72450_a;
            maxX = dst2.field_72450_a;
         } else {
            maxX = src2.field_72450_a;
            minX = dst2.field_72450_a;
         }

         double minY;
         double maxY;
         if (src2.field_72448_b < dst2.field_72448_b) {
            minY = src2.field_72448_b;
            maxY = dst2.field_72448_b;
         } else {
            maxY = src2.field_72448_b;
            minY = dst2.field_72448_b;
         }

         double minZ;
         double maxZ;
         if (src2.field_72449_c < dst2.field_72449_c) {
            minZ = src2.field_72449_c;
            maxZ = dst2.field_72449_c;
         } else {
            maxZ = src2.field_72449_c;
            minZ = dst2.field_72449_c;
         }

         AxisAlignedBB box = AxisAlignedBB.func_72330_a(minX, minY, minZ, maxX, maxY, maxZ).func_72314_b(1.0D, 1.0D, 1.0D);
         List list = world.func_72839_b(ent, box);
         double d0 = 0.0D;
         MovingObjectPosition mop = null;

         for(int j = 0; j < list.size(); ++j) {
            Entity entity2 = (Entity)list.get(j);
            if (entity2.func_70067_L() && !entity2.field_70128_L && entity2 != shooter) {
               float f = 0.3F;
               AxisAlignedBB axisalignedbb = entity2.field_70121_D.func_72314_b(0.30000001192092896D, 0.30000001192092896D, 0.30000001192092896D);
               MovingObjectPosition movingobjectposition2 = axisalignedbb.func_72327_a(src2, dst2);
               if (movingobjectposition2 != null) {
                  double d2 = src2.func_72438_d(movingobjectposition2.field_72307_f);
                  if (d2 < d0 || d0 == 0.0D) {
                     entity = entity2;
                     mop = movingobjectposition2;
                     d0 = d2;
                  }
               }
            }
         }

         if (entity != null) {
            movingobjectposition = new MovingObjectPosition(entity, mop.field_72307_f);
         }

         if (movingobjectposition != null) {
            return movingobjectposition;
         }

         src = Vec3.func_72443_a(dst.field_72450_a, dst.field_72448_b, dst.field_72449_c);
      }

      return null;
   }

   public static int abs(int i) {
      return i < 0 ? -i : i;
   }

   public static float interpolateRotation(float par1, float par2, float partialTickTime) {
      float f3;
      for(f3 = par2 - par1; f3 < -180.0F; f3 += 360.0F) {
         ;
      }

      while(f3 >= 180.0F) {
         f3 -= 360.0F;
      }

      return par1 + partialTickTime * f3;
   }

   public static void rotateAroundX(Vec3 vec, double angle) {
      double dc = Math.cos(angle);
      double ds = Math.sin(angle);
      double d0 = vec.field_72450_a;
      double d2 = vec.field_72448_b * dc + vec.field_72449_c * ds;
      double d3 = vec.field_72449_c * dc - vec.field_72448_b * ds;
      vec.field_72450_a = d0;
      vec.field_72448_b = d2;
      vec.field_72449_c = d3;
   }

   public static void rotateAroundY(Vec3 vec, double angle) {
      double dc = Math.cos(angle);
      double ds = Math.sin(angle);
      double d0 = vec.field_72450_a * dc + vec.field_72449_c * ds;
      double d2 = vec.field_72448_b;
      double d3 = vec.field_72449_c * dc - vec.field_72450_a * ds;
      vec.field_72450_a = d0;
      vec.field_72448_b = d2;
      vec.field_72449_c = d3;
   }

   public static void rotateAroundZ(Vec3 vec, double angle) {
      double dc = Math.cos(angle);
      double ds = Math.sin(angle);
      double d0 = vec.field_72450_a * dc + vec.field_72448_b * ds;
      double d2 = vec.field_72448_b * dc - vec.field_72450_a * ds;
      double d3 = vec.field_72449_c;
      vec.field_72450_a = d0;
      vec.field_72448_b = d2;
      vec.field_72449_c = d3;
   }

   public static class Vec2 {
      public double x;
      public double y;

      public Vec2(double x, double y) {
         this.x = x;
         this.y = y;
      }

      public double lenSquared() {
         return this.x * this.x + this.y * this.y;
      }

      public double len() {
         return Math.sqrt(this.lenSquared());
      }

      public void normalize() {
         double len = this.len();
         if (len > 0.0D) {
            double f = 1.0D / len;
            this.x *= f;
            this.y *= f;
         }

      }

      public MathUtil.Vec2 getNormalized() {
         double len = this.len();
         if (len > 0.0D) {
            double f = 1.0D / len;
            return new MathUtil.Vec2(this.x * f, this.y * f);
         } else {
            return new MathUtil.Vec2(0.0D, 0.0D);
         }
      }

      public static MathUtil.Vec2 substract(MathUtil.Vec2 A, MathUtil.Vec2 B) {
         return new MathUtil.Vec2(B.x - A.x, B.y - A.y);
      }

      public static MathUtil.Vec2 add(MathUtil.Vec2 A, MathUtil.Vec2 B) {
         return new MathUtil.Vec2(B.x + A.x, B.y + A.y);
      }

      public MathUtil.Vec2 getVecTo(MathUtil.Vec2 endpoint) {
         return substract(endpoint, this);
      }

      public MathUtil.Vec2 getVecFrom(MathUtil.Vec2 startpoint) {
         return substract(this, startpoint);
      }

      public double dot(MathUtil.Vec2 other) {
         return this.x * other.x + this.y * other.y;
      }

      public MathUtil.Vec2 getRotated(float degree) {
         double ynew = this.y * (double)MathUtil.cos360(degree) - this.x * (double)MathUtil.sin360(degree);
         double xnew = this.y * (double)MathUtil.sin360(degree) + this.x * (double)MathUtil.cos360(degree);
         return new MathUtil.Vec2(xnew, ynew);
      }

      /** @deprecated */
      @Deprecated
      public static double getAngleBetween(MathUtil.Vec2 A, MathUtil.Vec2 B) {
         MathUtil.Vec2 vec1 = A.getNormalized();
         MathUtil.Vec2 vec2 = B.getNormalized();
         return Math.acos(vec1.dot(vec2) / 180.0D * 3.1415927410125732D);
      }
   }
}
