package api.player.model;

import org.objectweb.asm.MethodVisitor;

public final class ModelPlayerConstructorVisitor extends MethodVisitor {
   private final boolean isObfuscated;

   public ModelPlayerConstructorVisitor(MethodVisitor paramMethodVisitor, boolean isObfuscated) {
      super(262144, paramMethodVisitor);
      this.isObfuscated = isObfuscated;
   }

   public void visitMethodInsn(int opcode, String owner, String name, String desc) {
      if (this.isObfuscated && name.equals("<init>") && owner.equals("net/minecraft/client/model/ModelBiped")) {
         owner = "bhm";
      }

      super.visitMethodInsn(opcode, owner, name, desc);
      if (name.equals("<init>") && owner.equals(this.isObfuscated ? "bhm" : "net/minecraft/client/model/ModelBiped")) {
         this.mv.visitVarInsn(25, 0);
         this.mv.visitVarInsn(25, 0);
         this.mv.visitVarInsn(23, 1);
         this.mv.visitVarInsn(25, 2);
         this.mv.visitMethodInsn(184, "api/player/model/ModelPlayerAPI", "create", "(Lapi/player/model/IModelPlayerAPI;FLjava/lang/String;)Lapi/player/model/ModelPlayerAPI;");
         this.mv.visitFieldInsn(181, "api/player/model/ModelPlayer", "modelPlayerAPI", "Lapi/player/model/ModelPlayerAPI;");
         this.mv.visitVarInsn(25, 0);
         this.mv.visitIntInsn(23, 1);
         this.mv.visitMethodInsn(184, "api/player/model/ModelPlayerAPI", "beforeLocalConstructing", "(Lapi/player/model/IModelPlayerAPI;F)V");
      }

   }

   public void visitInsn(int opcode) {
      if (opcode == 177) {
         this.mv.visitVarInsn(25, 0);
         this.mv.visitIntInsn(23, 1);
         this.mv.visitMethodInsn(184, "api/player/model/ModelPlayerAPI", "afterLocalConstructing", "(Lapi/player/model/IModelPlayerAPI;F)V");
      }

      super.visitInsn(opcode);
   }
}
