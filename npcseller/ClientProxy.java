package npcseller;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class ClientProxy extends CommonProxy {
   public EntityPlayer getPlayerEntity(MessageContext ctx) {
      return (EntityPlayer)(ctx.side.isClient() ? Minecraft.func_71410_x().field_71439_g : super.getPlayerEntity(ctx));
   }

   public final void render() {
      ClientRegistry.bindTileEntitySpecialRenderer(TileC.class, new RenderBlockNPC1());
      ClientRegistry.bindTileEntitySpecialRenderer(TileC2.class, new RenderBlockNPC2());
      ClientRegistry.bindTileEntitySpecialRenderer(TileC3.class, new RenderBlockNPC3());
   }
}
