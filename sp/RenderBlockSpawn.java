package sp;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import utilities.SagaModelLoader;
import utilities.sagaobj;

public class RenderBlockSpawn extends TileEntitySpecialRenderer {
   private sagaobj model = (sagaobj)SagaModelLoader.loadModel(new ResourceLocation("cabalaccessorys:models/blockspawn/block.saga"));
   private ResourceLocation texture = new ResourceLocation("cabalaccessorys:models/blockspawn/block.png");

   public void func_147500_a(TileEntity te, double x, double y, double z, float p_147500_8_) {
      SpawnBlockTileEntity tileEntity = (SpawnBlockTileEntity)te;
      if (Minecraft.func_71410_x().field_71439_g.field_71075_bZ.field_75098_d) {
         GL11.glDisable(2884);
         GL11.glDisable(2896);
         float size = 0.15F;
         GL11.glPushMatrix();
         Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texture);
         GL11.glTranslated(x + 0.5D, y + 0.5D, z + 0.5D);
         GL11.glScalef(size, size, size);
         if (te.field_145847_g == 4) {
            GL11.glRotatef((float)te.func_145832_p() * -22.0F, 0.0F, 1.0F, 0.0F);
         } else if (te.field_145847_g == 3) {
            GL11.glRotatef((float)te.func_145832_p(), 0.0F, 1.0F, 0.0F);
         } else if (te.field_145847_g == 2) {
            GL11.glRotatef((float)te.func_145832_p() * 46.0F, 0.0F, 1.0F, 0.0F);
         } else {
            GL11.glRotatef((float)te.func_145832_p() * -35.0F, 0.0F, 1.0F, 0.0F);
         }

         this.model.renderAll();
         GL11.glPopMatrix();
         String name = "" + EnumChatFormatting.GOLD + "Spawn " + tileEntity.mobname.replaceAll("&", "§");
         String lv = "" + EnumChatFormatting.GOLD + "Lv. " + tileEntity.level;
         float f = 0.5F;
         float f1 = 0.08F * f;
         FontRenderer fontrenderer = Minecraft.func_71410_x().field_71466_p;
         GL11.glPushMatrix();
         if (te.field_145847_g == 4) {
            GL11.glTranslated(x + 0.5D, y + 2.5D, z + 0.5099999904632568D);
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef((float)te.func_145832_p() * -22.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         } else if (te.field_145847_g == 3) {
            GL11.glTranslated(x + 0.5D, y + 2.5D, z + 0.5D);
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef((float)te.func_145832_p(), 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-180.0F, 0.0F, 1.0F, 0.0F);
         } else if (te.field_145847_g == 2) {
            GL11.glTranslated(x + 0.5D, y + 2.5D, z + 0.5099999904632568D);
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef((float)te.func_145832_p() * 46.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         } else {
            GL11.glTranslated(x + 0.5D, y + 2.5D, z + 0.5D);
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef((float)te.func_145832_p() * -35.0F, 0.0F, 1.0F, 0.0F);
         }

         GL11.glRotatef(-RenderManager.field_78727_a.field_78735_i, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(RenderManager.field_78727_a.field_78732_j, 1.0F, 0.0F, 0.0F);
         GL11.glScalef(-f1, -f1, f1);
         GL11.glDisable(2896);
         GL11.glTranslatef(0.0F, 0.25F / f1, 0.0F);
         GL11.glDepthMask(false);
         GL11.glEnable(3042);
         OpenGlHelper.func_148821_a(770, 771, 1, 0);
         Tessellator tessellator = Tessellator.field_78398_a;
         GL11.glDisable(3553);
         GL11.glEnable(3553);
         GL11.glDepthMask(true);
         fontrenderer.func_78276_b(name, -fontrenderer.func_78256_a(name) / 2, -20, 0);
         fontrenderer.func_78276_b(lv, -fontrenderer.func_78256_a(lv) / 2, -10, 0);
         GL11.glDisable(3042);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glPopMatrix();
         GL11.glEnable(2884);
         GL11.glEnable(2896);
      }

   }
}
