package farmmode;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class renderonion extends TileEntitySpecialRenderer {
   private final ModelBase Model1 = new ChiliLv1();
   private final ModelBase Model2 = new ChiliLv2();
   private final ModelBase Model3 = new ChiliLv3();
   private final ModelBase Model4 = new ChiliLv4();
   private final ModelBase Model5 = new OnionLv5();

   public void func_147500_a(TileEntity te, double x, double y, double z, float scale) {
      int i = 0;
      if (te.func_145830_o()) {
         i = te.func_145832_p();
      }

      ResourceLocation textures = new ResourceLocation("fantasyland:textures/model/blockOnion.png");
      if (i == 1) {
         GL11.glPushMatrix();
         GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
         Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
         GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
         this.Model1.func_78088_a((Entity)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
         GL11.glPopMatrix();
      } else if (i == 2) {
         GL11.glPushMatrix();
         GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
         Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
         GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
         this.Model2.func_78088_a((Entity)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
         GL11.glPopMatrix();
      } else if (i == 3) {
         GL11.glPushMatrix();
         GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
         Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
         GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
         this.Model3.func_78088_a((Entity)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
         GL11.glPopMatrix();
      } else if (i == 4) {
         GL11.glPushMatrix();
         GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
         Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
         GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
         this.Model4.func_78088_a((Entity)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
         GL11.glPopMatrix();
      } else if (i == 5) {
         GL11.glPushMatrix();
         GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
         Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
         GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
         this.Model5.func_78088_a((Entity)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
         GL11.glPopMatrix();
      }

   }
}
