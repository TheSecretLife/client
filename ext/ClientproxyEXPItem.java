package ext;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import ext.event.EventKeypressInventory;
import ext.event.EventKeypressInventoryClose;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

public class ClientproxyEXPItem extends ServerproxyEXPItem {
   public void registerRenderers() {
      FMLCommonHandler.instance().bus().register(new EventKeypressInventory());
      MinecraftForge.EVENT_BUS.register(new EventKeypressInventoryClose());
   }

   public EntityPlayer getPlayerEntity(MessageContext ctx) {
      return (EntityPlayer)(ctx.side.isClient() ? Minecraft.func_71410_x().field_71439_g : super.getPlayerEntity(ctx));
   }
}
