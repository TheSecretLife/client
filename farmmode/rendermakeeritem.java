package farmmode;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import org.lwjgl.opengl.GL11;

public class rendermakeeritem implements IItemRenderer {
   protected modelmakeer md = new modelmakeer();
   public static ResourceLocation tex = new ResourceLocation("fantasyland", "models/farm/makeer.png");

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
         float scale3 = 0.1F;
         GL11.glScalef(scale3, scale3, scale3);
         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(160.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(255.0F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(6.0F, 0.0F, -0.5F);
         Minecraft.func_71410_x().field_71446_o.func_110577_a(tex);
         this.md.func_78088_a((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
         GL11.glPopMatrix();
         break;
      case EQUIPPED_FIRST_PERSON:
         GL11.glPushMatrix();
         float scale = 0.15F;
         GL11.glScalef(scale, scale, scale);
         GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(185.0F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(1.0F, 1.5F, -1.58F);
         Minecraft.func_71410_x().field_71446_o.func_110577_a(tex);
         this.md.func_78088_a((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
         GL11.glPopMatrix();
         break;
      case ENTITY:
         GL11.glPushMatrix();
         float scale2 = 0.1F;
         GL11.glScalef(scale2, scale2, scale2);
         GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(0.5F, 0.5F, 0.0F);
         Minecraft.func_71410_x().field_71446_o.func_110577_a(tex);
         this.md.func_78088_a((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
         GL11.glPopMatrix();
      }

   }
}
