package minezmod;

import minezmod.lanch.localplayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class save implements IExtendedEntityProperties {
   public static final String Name = "saveplay";
   private final EntityPlayer player;

   public save(EntityPlayer player) {
      this.player = player;
   }

   public static final void register(EntityPlayer player) {
      player.registerExtendedProperties("saveplay", new save(player));
   }

   public static final save get(EntityPlayer player) {
      return (save)player.getExtendedProperties("saveplay");
   }

   public final void saveNBTData(NBTTagCompound compound) {
      NBTTagCompound saves = new NBTTagCompound();
      compound.func_74782_a("saveplay", saves);
   }

   public final void loadNBTData(NBTTagCompound compound) {
      NBTTagCompound loads = (NBTTagCompound)compound.func_74781_a("saveplay");
   }

   public void init(Entity entity, World world) {
   }

   private static final String getSaveKey(EntityPlayer player) {
      return player.func_70005_c_() + ":" + "saveplay";
   }

   public static final void saveProxyData(EntityPlayer player) {
      NBTTagCompound savedData = new NBTTagCompound();
      get(player).saveNBTData(savedData);
      sidesv.saveData(getSaveKey(player), savedData);
   }

   public static final void loadProxyData(EntityPlayer player) {
      save playerData = get(player);
      NBTTagCompound savedData = sidesv.loadData(getSaveKey(player));
      if (savedData != null) {
         playerData.loadNBTData(savedData);
      }

      amod.lanch.sendTo(new localplayer(player), (EntityPlayerMP)player);
   }
}
