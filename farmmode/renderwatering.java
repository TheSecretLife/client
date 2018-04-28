package farmmode;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import org.lwjgl.opengl.GL11;

public class renderwatering implements IItemRenderer {
   protected wateringpot md = new wateringpot();

   public boolean handleRenderType(ItemStack item, ItemRenderType type) {
      switch(type) {
      case EQUIPPED:
      case EQUIPPED_FIRST_PERSON:
      case ENTITY:
         return true;
      default:
         return false;
      }
   }

   public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
      return false;
   }

   public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
      switch(type) {
      case EQUIPPED:
         GL11.glPushMatrix();
         float scale3 = 0.65F;
         GL11.glScalef(scale3, scale3, scale3);
         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(185.0F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(-0.02F, 0.0F, -1.08F);
         Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland:textures/model/water.png"));
         this.md.func_78088_a((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
         GL11.glPopMatrix();
         break;
      case EQUIPPED_FIRST_PERSON:
         GL11.glPushMatrix();
         float scale = 0.65F;
         GL11.glScalef(scale, scale, scale);
         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(225.0F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(-0.02F, -0.5F, -1.28F);
         Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland:textures/model/water.png"));
         this.md.func_78088_a((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
         GL11.glPopMatrix();
         break;
      case ENTITY:
         GL11.glPushMatrix();
         float scale2 = 1.0F;
         GL11.glScalef(scale2, scale2, scale2);
         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(275.0F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(-0.02F, -1.5F, 0.0F);
         Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland:textures/model/water.png"));
         this.md.func_78088_a((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
         GL11.glPopMatrix();
      }

   }
}
