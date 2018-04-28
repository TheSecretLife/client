package farmmode;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class StoreData implements IExtendedEntityProperties {
   public static final String Name = "fammda";
   private final EntityPlayer player;
   public int deleyuse = 0;

   public StoreData(EntityPlayer player) {
      this.player = player;
   }

   public static final void register(EntityPlayer player) {
      player.registerExtendedProperties("fammda", new StoreData(player));
   }

   public static final StoreData get(EntityPlayer player) {
      return (StoreData)player.getExtendedProperties("fammda");
   }

   public final void saveNBTData(NBTTagCompound compound) {
      NBTTagCompound properties = new NBTTagCompound();
      compound.func_74782_a("fammda", properties);
   }

   public final void loadNBTData(NBTTagCompound compound) {
      NBTTagCompound properties = (NBTTagCompound)compound.func_74781_a("fammda");
   }

   public void init(Entity entity, World world) {
   }

   private static final String getSaveKey(EntityPlayer player) {
      return player.func_70005_c_() + ":" + "fammda";
   }

   public static final void saveProxyData(EntityPlayer player) {
      NBTTagCompound savedData = new NBTTagCompound();
      get(player).saveNBTData(savedData);
      ServerProxy.storeEntityData(getSaveKey(player), savedData);
   }

   public static final void loadProxyData(EntityPlayer player) {
      StoreData playerData = get(player);
      NBTTagCompound savedData = ServerProxy.getEntityData(getSaveKey(player));
      if (savedData != null) {
         playerData.loadNBTData(savedData);
      }

      ModStart.networkChannel.sendTo(new Packet_SyncPlayerData(player), (EntityPlayerMP)player);
   }
}
