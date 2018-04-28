package cabalaccessorys.api;

import org.lwjgl.opengl.GL11;

public class TextureSetting {
   public static void setblur() {
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
   }

   public static void setPixel() {
      GL11.glTexParameteri(3553, 10241, 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
   }
}
