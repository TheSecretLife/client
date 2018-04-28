package api.player.render;

import java.util.Map;
import java.util.Stack;
import org.objectweb.asm.MethodVisitor;

public final class RenderPlayerConstructorVisitor extends MethodVisitor {
   private final boolean isObfuscated;
   private final Map constructorReplacements;

   public RenderPlayerConstructorVisitor(MethodVisitor paramMethodVisitor, boolean isObfuscated, Map constructorReplacements) {
      super(262144, paramMethodVisitor);
      this.isObfuscated = isObfuscated;
      this.constructorReplacements = constructorReplacements;
   }

   public void visitTypeInsn(int opcode, String type) {
      if (opcode == 187 && this.constructorReplacements != null && this.constructorReplacements.containsKey(type)) {
         Stack replacementOwnerList = (Stack)this.constructorReplacements.get(type);
         if (!replacementOwnerList.isEmpty()) {
            type = (String)replacementOwnerList.peek();
         }

         int typeSeparatorIndex = type.indexOf(":");
         if (typeSeparatorIndex > 0) {
            type = type.substring(0, typeSeparatorIndex);
         }
      }

      super.visitTypeInsn(opcode, type);
   }

   public void visitMethodInsn(int opcode, String owner, String name, String desc) {
      if (name.equals("<init>") && this.constructorReplacements != null && this.constructorReplacements.containsKey(owner)) {
         Stack replacementOwnerList = (Stack)this.constructorReplacements.get(owner);
         if (!replacementOwnerList.isEmpty()) {
            owner = (String)replacementOwnerList.pop();
         }

         int typeSeparatorIndex = owner.indexOf(":");
         if (typeSeparatorIndex > 0) {
            this.mv.visitLdcInsn(owner.substring(typeSeparatorIndex + 1));
            owner = owner.substring(0, typeSeparatorIndex);
            int resultSeparatorIndex = desc.indexOf(")");
            desc = desc.substring(0, resultSeparatorIndex) + "Ljava/lang/String;" + desc.substring(resultSeparatorIndex);
         }
      }

      super.visitMethodInsn(opcode, owner, name, desc);
      if (name.equals("<init>") && owner.equals(this.isObfuscated ? "boh" : "net/minecraft/client/renderer/entity/RendererLivingEntity")) {
         this.mv.visitVarInsn(25, 0);
         this.mv.visitVarInsn(25, 0);
         this.mv.visitMethodInsn(184, "api/player/render/RenderPlayerAPI", "create", "(Lapi/player/render/IRenderPlayerAPI;)Lapi/player/render/RenderPlayerAPI;");
         this.mv.visitFieldInsn(181, this.isObfuscated ? "bop" : "net/minecraft/client/renderer/entity/RenderPlayer", "renderPlayerAPI", "Lapi/player/render/RenderPlayerAPI;");
         this.mv.visitVarInsn(25, 0);
         this.mv.visitMethodInsn(184, "api/player/render/RenderPlayerAPI", "beforeLocalConstructing", "(Lapi/player/render/IRenderPlayerAPI;)V");
      }

   }

   public void visitInsn(int opcode) {
      if (opcode == 177) {
         this.mv.visitVarInsn(25, 0);
         this.mv.visitMethodInsn(184, "api/player/render/RenderPlayerAPI", "afterLocalConstructing", "(Lapi/player/render/IRenderPlayerAPI;)V");
      }

      super.visitInsn(opcode);
   }
}
