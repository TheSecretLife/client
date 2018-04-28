package api.player.render;

import net.minecraft.client.renderer.entity.RenderPlayer;

public interface IRenderPlayerAPI extends IRenderPlayer {
   RenderPlayerAPI getRenderPlayerAPI();

   RenderPlayer getRenderPlayer();
}
