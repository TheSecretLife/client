package myset3d;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class CustomRender extends ModelBiped {
   public void func_78088_a(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
      super.func_78088_a(p_78088_1_, p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_);
   }

   public void func_78087_a(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_) {
      super.func_78087_a(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, p_78087_7_);
   }

   public static void rotationpart(ModelRenderer part) {
      GL11.glTranslatef(part.field_78800_c * 0.0625F, part.field_78797_d * 0.0625F, part.field_78798_e * 0.0625F);
      if (part.field_78808_h != 0.0F) {
         GL11.glRotatef(part.field_78808_h * 57.295776F, 0.0F, 0.0F, 1.0F);
      }

      if (part.field_78796_g != 0.0F) {
         GL11.glRotatef(part.field_78796_g * 57.295776F, 0.0F, 1.0F, 0.0F);
      }

      if (part.field_78795_f != 0.0F) {
         GL11.glRotatef(part.field_78795_f * 57.295776F, 1.0F, 0.0F, 0.0F);
      }

   }
}
