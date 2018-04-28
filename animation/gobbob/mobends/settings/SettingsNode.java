package animation.gobbob.mobends.settings;

public abstract class SettingsNode {
   public static SettingsNode[] settings = new SettingsNode[]{(new SettingsBoolean("swordTrail", "Sword Trail")).setupDefault(true), new SettingsBoolean("dummy", "Dummy")};
   public String id;
   public String displayName;

   public SettingsNode() {
      this.id = "NULL";
      this.displayName = "NULL";
   }

   public SettingsNode(String argID, String argDisplayName) {
      this.id = argID;
      this.displayName = argDisplayName;
   }

   public static SettingsNode getSetting(String argID) {
      for(int i = 0; i < settings.length; ++i) {
         if (settings[i].id.equalsIgnoreCase(argID)) {
            return settings[i];
         }
      }

      return null;
   }
}
