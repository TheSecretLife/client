package com.voidswrath.util;

public enum OS {
   LINUX("LINUX", 0),
   MACOS("MACOS", 1),
   SOLARIS("SOLARIS", 2),
   UNKNOWN("UNKNOWN", 3),
   WINDOWS("WINDOWS", 4);

   private static final OS[] ENUM$VALUES = new OS[]{LINUX, MACOS, SOLARIS, UNKNOWN, WINDOWS};

   private OS(String var11, int var21) {
   }
}
