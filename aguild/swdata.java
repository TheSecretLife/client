package aguild;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;
import net.minecraft.world.storage.MapStorage;

public class swdata extends WorldSavedData {
   public static String key = "swmod";
   private NBTTagCompound data = new NBTTagCompound();

   public static swdata forWorld(World world) {
      MapStorage storage = world.perWorldStorage;
      swdata result = (swdata)storage.func_75742_a(swdata.class, key);
      if (result == null) {
         result = new swdata(key);
         storage.func_75745_a(key, result);
      }

      return result;
   }

   public swdata(String tagName) {
      super(tagName);
   }

   public void func_76184_a(NBTTagCompound compound) {
      this.data = compound.func_74775_l(key);
   }

   public void func_76187_b(NBTTagCompound compound) {
      compound.func_74782_a(key, this.data);
   }

   public NBTTagCompound getData() {
      return this.data;
   }
}
