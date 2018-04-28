package npcseller;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import npcseller.container.ContainerC;
import npcseller.container.ContainerC2;
import npcseller.container.ContainerC3;
import npcseller.container.ContainerP;
import npcseller.container.ContainerP2;
import npcseller.container.ContainerP3;
import npcseller.container.GuiContainerC;
import npcseller.container.GuiContainerC2;
import npcseller.container.GuiContainerC3;
import npcseller.container.GuiContainerP;
import npcseller.container.GuiContainerP2;
import npcseller.container.GuiContainerP3;

public class CommonProxy implements IGuiHandler {
   private static final Map eted3 = new HashMap();

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
      if (ID == Main.GUI_NPCPLAYER) {
         return new ContainerP(player.field_71071_by, (TileC)world.func_147438_o(x, y, z));
      } else if (ID == Main.GUI_NPCPLAYER2) {
         return new ContainerP2(player.field_71071_by, (TileC2)world.func_147438_o(x, y, z));
      } else if (ID == Main.GUI_NPCPLAYER3) {
         return new ContainerP3(player.field_71071_by, (TileC3)world.func_147438_o(x, y, z));
      } else if (ID == Main.GUI_SETITEM) {
         return new ContainerC(player.field_71071_by, (TileC)world.func_147438_o(x, y, z));
      } else if (ID == Main.GUI_SETITEM2) {
         return new ContainerC2(player.field_71071_by, (TileC2)world.func_147438_o(x, y, z));
      } else {
         return ID == Main.GUI_SETITEM3 ? new ContainerC3(player.field_71071_by, (TileC3)world.func_147438_o(x, y, z)) : null;
      }
   }

   public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
      if (ID == Main.GUI_NPCPLAYER) {
         return new GuiContainerP(player.field_71071_by, (TileC)world.func_147438_o(x, y, z));
      } else if (ID == Main.GUI_NPCPLAYER2) {
         return new GuiContainerP2(player.field_71071_by, (TileC2)world.func_147438_o(x, y, z));
      } else if (ID == Main.GUI_NPCPLAYER3) {
         return new GuiContainerP3(player.field_71071_by, (TileC3)world.func_147438_o(x, y, z));
      } else if (ID == Main.GUI_SETITEM) {
         return new GuiContainerC(player.field_71071_by, (TileC)world.func_147438_o(x, y, z));
      } else if (ID == Main.GUI_SETITEM2) {
         return new GuiContainerC2(player.field_71071_by, (TileC2)world.func_147438_o(x, y, z));
      } else {
         return ID == Main.GUI_SETITEM3 ? new GuiContainerC3(player.field_71071_by, (TileC3)world.func_147438_o(x, y, z)) : null;
      }
   }

   public void render() {
   }
}
