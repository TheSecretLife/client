package aguild;

import aguild.market.minv;
import aguild.store.sinv;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;
import net.minecraft.world.storage.MapStorage;

public class WorldData extends WorldSavedData {
   public static String key = "gumod";
   public sinv sinv1 = new sinv(1);
   public minv minv1 = new minv();
   public int page = 0;
   public String gname = "";
   private NBTTagCompound data = new NBTTagCompound();

   public static WorldData forWorld(World world) {
      MapStorage storage = world.field_72988_C;
      WorldData result = (WorldData)storage.func_75742_a(WorldData.class, key);
      if (result == null) {
         result = new WorldData(key);
         storage.func_75745_a(key, result);
      }

      return result;
   }

   public static WorldData forWorld(World world, String guild) {
      MapStorage storage = world.field_72988_C;
      WorldData result = (WorldData)storage.func_75742_a(WorldData.class, key + guild);
      if (result == null) {
         result = new WorldData(key + guild);
         storage.func_75745_a(key + guild, result);
      }

      return result;
   }

   public WorldData(String tagName) {
      super(tagName);
   }

   public void func_76184_a(NBTTagCompound compound) {
      this.data = compound.func_74775_l(key);
      this.sinv1.readFromNBT(this.data);
      this.minv1.readFromNBT(this.data);
   }

   public void func_76187_b(NBTTagCompound compound) {
      this.sinv1.writeToNBT(this.data);
      this.minv1.writeToNBT(this.data);
      compound.func_74782_a(key, this.data);
   }

   public NBTTagCompound getData() {
      return this.data;
   }
}
