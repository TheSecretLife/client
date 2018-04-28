package npcseller.container;

import java.util.TimerTask;

public class TimerConfirm extends TimerTask {
   public static int countdown = 0;

   public static int getCountdown() {
      return countdown;
   }

   public static void setCountdown(int countdown) {
      countdown = countdown;
   }

   public void run() {
      if (countdown != 0) {
         --countdown;
      } else {
         countdown = 0;
         this.cancel();
      }

   }
}
