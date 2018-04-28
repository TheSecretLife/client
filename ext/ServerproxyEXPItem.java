package ext;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ServerproxyEXPItem implements IGuiHandler {
   private static final Map eted3 = new HashMap();

   public void registerRenderers() {
   }

   public static void storeEntityData(String name, NBTTagCompound compound) {
      eted3.put(name, compound);
   }

   public static NBTTagCompound getEntityData(String name) {
      return (NBTTagCompound)eted3.remove(name);
   }

   public EntityPlayer getPlayerEntity(MessageContext ctx) {
      return ctx.getServerHandler().field_147369_b;
   }

   public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
      return null;
   }

   public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
      return null;
   }
}
