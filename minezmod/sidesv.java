package minezmod;

import cpw.mods.fml.common.network.IGuiHandler;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class sidesv implements IGuiHandler {
   private static final Map eted = new HashMap();

   public void install() {
   }

   public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
      return null;
   }

   public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
      return null;
   }

   public static void saveData(String name, NBTTagCompound compound) {
      eted.put(name, compound);
   }

   public static NBTTagCompound loadData(String name) {
      return (NBTTagCompound)eted.remove(name);
   }
}
