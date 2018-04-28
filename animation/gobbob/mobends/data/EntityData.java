package animation.gobbob.mobends.data;

import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import org.lwjgl.util.vector.Vector3f;

public class EntityData {
   public int entityID;
   public String entityType;
   public ModelBase model;
   public Vector3f position = new Vector3f();
   public Vector3f motion_prev = new Vector3f();
   public Vector3f motion = new Vector3f();
   public float ticks = 0.0F;
   public float ticksPerFrame = 0.0F;
   public float lastTicks = 0.0F;
   public float lastTicksPerFrame = 0.0F;
   public boolean updatedThisFrame = false;
   public float ticksAfterLiftoff = 0.0F;
   public float ticksAfterTouchdown = 0.0F;
   public float ticksAfterPunch = 0.0F;
   public boolean alreadyPunched = false;
   public boolean onGround;

   public EntityData(int argEntityID) {
      this.entityID = argEntityID;
      if (Minecraft.func_71410_x().field_71441_e.func_73045_a(argEntityID) != null) {
         this.entityType = Minecraft.func_71410_x().field_71441_e.func_73045_a(argEntityID).func_70005_c_();
      } else {
         this.entityType = "NULL";
      }

      this.model = null;
   }

   public boolean canBeUpdated() {
      return !this.updatedThisFrame;
   }

   public boolean calcOnGround() {
      Entity entity = Minecraft.func_71410_x().field_71441_e.func_73045_a(this.entityID);
      if (entity == null) {
         return false;
      } else {
         AxisAlignedBB axisalignedbb = entity.field_70121_D.func_72329_c();
         double var1 = (double)(this.position.y + this.motion.y);
         List list = entity.field_70170_p.func_72945_a(entity, entity.field_70121_D.func_72321_a(0.0D, -0.0010000000474974513D, 0.0D));
         byte i = 0;
         return i < list.size();
      }
   }

   public boolean isOnGround() {
      return this.onGround;
   }

   public void update(float argPartialTicks) {
      if (this.getEntity() != null) {
         this.ticksPerFrame = (float)Minecraft.func_71410_x().field_71439_g.field_70173_aa + argPartialTicks - this.ticks;
         this.ticks = (float)Minecraft.func_71410_x().field_71439_g.field_70173_aa + argPartialTicks;
         this.updatedThisFrame = false;
         if (this.calcOnGround() & !this.onGround) {
            this.onTouchdown();
            this.onGround = true;
         }

         if (!this.calcOnGround() & this.onGround | (this.motion_prev.y <= 0.0F && this.motion.y - this.motion_prev.y > 0.4F && this.ticksAfterLiftoff > 2.0F)) {
            this.onLiftoff();
            this.onGround = false;
         }

         if (this.getEntity().field_70733_aJ > 0.0F) {
            if (!this.alreadyPunched) {
               this.onPunch();
               this.alreadyPunched = true;
            }
         } else {
            this.alreadyPunched = false;
         }

         if (!this.isOnGround()) {
            this.ticksAfterLiftoff += this.ticksPerFrame;
         }

         if (this.isOnGround()) {
            this.ticksAfterTouchdown += this.ticksPerFrame;
         }

         this.ticksAfterPunch += this.ticksPerFrame;
      }

   }

   public EntityLivingBase getEntity() {
      return Minecraft.func_71410_x().field_71441_e.func_73045_a(this.entityID) instanceof EntityLivingBase ? (EntityLivingBase)Minecraft.func_71410_x().field_71441_e.func_73045_a(this.entityID) : null;
   }

   public void onTouchdown() {
      this.ticksAfterTouchdown = 0.0F;
   }

   public void onLiftoff() {
      this.ticksAfterLiftoff = 0.0F;
   }

   public void onPunch() {
      this.ticksAfterPunch = 0.0F;
   }
}
