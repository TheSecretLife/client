package api.player.forge;

import api.player.model.ModelPlayerClassVisitor;
import api.player.render.RenderPlayerClassVisitor;
import java.util.Hashtable;
import java.util.Map;
import java.util.Stack;
import net.minecraft.launchwrapper.IClassTransformer;

public class RenderPlayerAPITransformer implements IClassTransformer {
   public byte[] transform(String name, String transformedName, byte[] bytes) {
      if (transformedName.equals("net.minecraft.client.renderer.entity.RenderPlayer")) {
         Stack models = new Stack();
         models.push("api/player/model/ModelPlayer:armor");
         models.push("api/player/model/ModelPlayer:chestplate");
         models.push("api/player/model/ModelPlayer:main");
         Map renderConstructorReplacements = new Hashtable();
         renderConstructorReplacements.put("bhm", models);
         renderConstructorReplacements.put("net/minecraft/client/model/ModelBiped", models);
         return RenderPlayerClassVisitor.transform(bytes, RenderPlayerAPIPlugin.isObfuscated, renderConstructorReplacements);
      } else {
         return transformedName.equals("api.player.model.ModelPlayer") ? ModelPlayerClassVisitor.transform(bytes, RenderPlayerAPIPlugin.isObfuscated) : bytes;
      }
   }
}
