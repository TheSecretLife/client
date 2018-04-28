package com.voidswrath.modinstaller;

public class ProgressbarUpdater implements Runnable {
   final String newText;
   final boolean Max;
   final int value;

   public ProgressbarUpdater(String newText, boolean Max, int value) {
      this.newText = newText;
      this.Max = Max;
      this.value = value;
   }

   public void run() {
      if (this.value == -1) {
         Main.instance.progressBar.setValue(0);
         Main.instance.progressBar.setIndeterminate(true);
      } else {
         Main.instance.progressBar.setIndeterminate(false);
         if (this.value == -2) {
            Main.instance.progressBar.setValue(Main.instance.progressBar.getMaximum());
         } else if (this.Max) {
            Main.instance.progressBar.setMaximum(this.value);
         } else {
            Main.instance.progressBar.setValue(this.value);
         }
      }

      if (this.newText != null) {
         Main.instance.progressBar.setString(this.newText);
      }

   }
}
