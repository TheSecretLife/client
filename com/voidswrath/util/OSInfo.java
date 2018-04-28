package com.voidswrath.util;

import java.io.File;

public class OSInfo {
   private static OS PLATFORM;
   private static int[] $SWITCH_TABLE$com$voidswrath$util$OS;

   public static OS getPlatform() {
      if (PLATFORM == null) {
         String str = System.getProperty("os.name").toLowerCase();
         if (str.contains("win")) {
            PLATFORM = OS.WINDOWS;
         } else if (str.contains("mac")) {
            PLATFORM = OS.MACOS;
         } else if (str.contains("solaris")) {
            PLATFORM = OS.SOLARIS;
         } else if (str.contains("sunos")) {
            PLATFORM = OS.SOLARIS;
         } else if (str.contains("linux")) {
            PLATFORM = OS.LINUX;
         } else if (str.contains("unix")) {
            PLATFORM = OS.LINUX;
         } else {
            PLATFORM = OS.UNKNOWN;
         }
      }

      return PLATFORM;
   }

   public static File getWorkingDirectory(String installDir) {
      System.getProperty("user.home", ".");
      String str1 = System.getProperty("user.home", ".");
      File localFile;
      switch($SWITCH_TABLE$com$voidswrath$util$OS()[getPlatform().ordinal()]) {
      case 1:
      case 3:
         localFile = new File(str1, '.' + installDir + File.separator);
         break;
      case 2:
         localFile = new File(str1, "Library" + File.separator + "Application Support" + File.separator + installDir + File.separator);
         break;
      case 4:
      default:
         localFile = new File(str1, installDir + File.separator);
         break;
      case 5:
         String str2 = System.getenv("APPDATA");
         String str3 = str2 != null ? str2 : str1;
         localFile = new File(str3, '.' + installDir + File.separator);
      }

      if (!localFile.exists() && !localFile.mkdirs()) {
         throw new RuntimeException("The working directory could not be created: " + localFile);
      } else {
         return localFile;
      }
   }

   static int[] $SWITCH_TABLE$com$voidswrath$util$OS() {
      if ($SWITCH_TABLE$com$voidswrath$util$OS != null) {
         return $SWITCH_TABLE$com$voidswrath$util$OS;
      } else {
         int[] var0 = new int[OS.values().length];

         try {
            var0[OS.LINUX.ordinal()] = 1;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            var0[OS.MACOS.ordinal()] = 2;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            var0[OS.SOLARIS.ordinal()] = 3;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            var0[OS.UNKNOWN.ordinal()] = 4;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            var0[OS.WINDOWS.ordinal()] = 5;
         } catch (NoSuchFieldError var2) {
            ;
         }

         $SWITCH_TABLE$com$voidswrath$util$OS = var0;
         return var0;
      }
   }
}
