package farmmode;

import cpw.mods.fml.common.network.IGuiHandler;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ServerProxy implements IGuiHandler {
   private static final Map eted = new HashMap();

   public static void storeEntityData(String name, NBTTagCompound compound) {
      eted.put(name, compound);
   }

   public static NBTTagCompound getEntityData(String name) {
      return (NBTTagCompound)eted.remove(name);
   }

   public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
      return null;
   }

   public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
      return null;
   }

   public void reg() {
   }
}
