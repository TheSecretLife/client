package animation.gobbob.mobends.util;

public enum BendsLogger {
   INFO("INFO", 0),
   DEBUG("DEBUG", 1),
   ERROR("ERROR", 2);

   private static final BendsLogger[] $VALUES = new BendsLogger[]{INFO, DEBUG, ERROR};

   private BendsLogger(String var11, int var21) {
   }

   public static void log(String argText, BendsLogger argType) {
      if (argType != DEBUG) {
         System.out.println("(MO'BENDS - " + argType.name() + " ) " + argText);
      }

   }
}
