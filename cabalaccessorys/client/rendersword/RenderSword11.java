package cabalaccessorys.client.rendersword;

import cabalaccessorys.api.TextureSetting;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import org.lwjgl.opengl.GL11;
import utilities.SagaModelLoader;
import utilities.sagaobj;

@SideOnly(Side.CLIENT)
public class RenderSword11 implements IItemRenderer {
   private String modelfile = "cabalaccessorys:models/newweapon/sword11.saga";
   private String texturemodelfile = "cabalaccessorys:models/newweapon/sword11-texture.png";
   private sagaobj modelobj;
   private ResourceLocation tex;

   public boolean handleRenderType(ItemStack item, ItemRenderType type) {
      return true;
   }

   public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
      return type == ItemRenderType.ENTITY && (helper == ItemRendererHelper.ENTITY_BOBBING || helper == ItemRendererHelper.ENTITY_ROTATION);
   }

   public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
      if (this.modelobj == null) {
         this.modelobj = (sagaobj)SagaModelLoader.loadModel(new ResourceLocation(this.modelfile));
         this.tex = new ResourceLocation(this.texturemodelfile);
      } else {
         GL11.glDisable(2896);
         GL11.glDisable(2884);
         float size = 0.3F;
         Minecraft.func_71410_x().field_71446_o.func_110577_a(this.tex);
         TextureSetting.setblur();
         if (type == ItemRenderType.EQUIPPED) {
            GL11.glPushMatrix();
            GL11.glTranslatef(1.0F, 0.15F, 0.02F);
            GL11.glScalef(size, size, size);
            GL11.glRotatef(40.0F, 0.0F, 0.0F, 1.0F);
            this.modelobj.renderAll();
            GL11.glPopMatrix();
         } else if (type == ItemRenderType.INVENTORY) {
            GL11.glPushMatrix();
            GL11.glTranslatef(14.0F, 0.0F, -0.0F);
            GL11.glScalef(size * 9.0F, size * 9.0F, size * 9.0F);
            GL11.glRotatef(40.0F, 0.0F, 0.0F, 1.0F);
            this.modelobj.renderAll();
            GL11.glPopMatrix();
         } else if (type == ItemRenderType.EQUIPPED_FIRST_PERSON) {
            GL11.glPushMatrix();
            GL11.glTranslatef(0.9F, 0.2F, -0.0F);
            GL11.glScalef(size, size, size);
            GL11.glRotatef(30.0F, 0.0F, 0.0F, 1.0F);
            this.modelobj.renderAll();
            GL11.glPopMatrix();
         } else if (type == ItemRenderType.ENTITY) {
            GL11.glPushMatrix();
            GL11.glTranslatef(0.2F, -0.0F, 0.0F);
            GL11.glScalef(size / 2.0F, size / 2.0F, size / 2.0F);
            GL11.glRotatef(40.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            this.modelobj.renderAll();
            GL11.glPopMatrix();
         }

         GL11.glEnable(2896);
         GL11.glEnable(2884);
      }

   }
}
