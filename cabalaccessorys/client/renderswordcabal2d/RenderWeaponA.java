package cabalaccessorys.client.renderswordcabal2d;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderWeaponA implements IItemRenderer {
   private Minecraft mc;

   public boolean handleRenderType(ItemStack item, ItemRenderType type) {
      return type == ItemRenderType.EQUIPPED || type == ItemRenderType.EQUIPPED_FIRST_PERSON;
   }

   public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
      return helper == ItemRendererHelper.EQUIPPED_BLOCK;
   }

   public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
      this.renderBigItem((EntityLivingBase)data[1], item);
   }

   public void renderBigItem(EntityLivingBase entity, ItemStack stack) {
      this.mc = Minecraft.func_71410_x();
      TextureManager texturemanager = this.mc.func_110434_K();
      IIcon icon = entity.func_70620_b(stack, 0);
      if (icon != null) {
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         texturemanager.func_110577_a(texturemanager.func_130087_a(stack.func_94608_d()));
         Tessellator tessellator = Tessellator.field_78398_a;
         float f = icon.func_94209_e();
         float f1 = icon.func_94212_f();
         float f2 = icon.func_94206_g();
         float f3 = icon.func_94210_h();
         float f4 = 0.0F;
         float f5 = 0.3F;
         GL11.glEnable(32826);
         GL11.glTranslatef(-f4, -f5, 0.0F);
         float f6 = 2.25F;
         GL11.glScalef(f6, f6, f6);
         GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
         ItemRenderer.func_78439_a(tessellator, f1, f2, f, f3, icon.func_94211_a(), icon.func_94216_b(), 0.0625F);
         GL11.glDisable(32826);
      }
   }
}
