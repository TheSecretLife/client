package com.voidswrath.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Utilities {
   private static JSONObject object = null;
   private static List profileList = null;
   private static String selectedProfile = null;

   public static String getLocationForProfile(String profile) {
      JSONObject object = getProfileJSONObject();
      JSONObject profileObject = (JSONObject)((JSONObject)object.get("profiles")).get(profile);
      return !profileObject.containsKey("gameDir") ? OSInfo.getWorkingDirectory("minecraft").getAbsolutePath() : profileObject.get("gameDir").toString();
   }

   public static JSONObject getProfileJSONObject() {
      if (object == null) {
         File profileJsonFile = new File(OSInfo.getWorkingDirectory("minecraft"), "launcher_profiles.json");
         if (profileJsonFile.exists()) {
            JSONParser parser = new JSONParser();

            try {
               object = (JSONObject)parser.parse((Reader)(new InputStreamReader(new FileInputStream(profileJsonFile))));
            } catch (Exception var3) {
               var3.printStackTrace();
            }
         }
      }

      return object;
   }

   public static List getProfiles() {
      if (profileList == null) {
         profileList = new ArrayList();
         JSONObject object = getProfileJSONObject();
         if (object != null) {
            JSONObject profiles = (JSONObject)object.get("profiles");
            if (profiles != null) {
               Iterator var3 = profiles.keySet().iterator();

               while(var3.hasNext()) {
                  Object profile = var3.next();
                  profileList.add(profile.toString());
               }
            }
         }
      }

      return profileList;
   }

   public static String getSelectedProfile() {
      if (selectedProfile == null) {
         JSONObject object = getProfileJSONObject();
         if (object != null) {
            selectedProfile = object.get("selectedProfile").toString();
         }
      }

      return selectedProfile;
   }
}
