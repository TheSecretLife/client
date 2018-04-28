package animation.gobbob.mobends.pack;

import animation.gobbob.mobends.data.EntityData;

public class BendsVar {
   public static EntityData tempData;

   public static float getGlobalVar(String name) {
      return name.equalsIgnoreCase("ticks") ? (tempData == null ? 0.0F : tempData.ticks) : (name.equalsIgnoreCase("ticksAfterPunch") ? (tempData == null ? 0.0F : tempData.ticksAfterPunch) : Float.POSITIVE_INFINITY);
   }
}
