package minezmod;

import minezmod.life.lifestatus;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class sidecl extends sidesv {
   private final Minecraft mine = Minecraft.func_71410_x();

   public void install() {
      MinecraftForge.EVENT_BUS.register(new lifestatus(this.mine));
   }
}
