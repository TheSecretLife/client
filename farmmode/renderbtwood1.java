package farmmode;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class renderbtwood1 extends TileEntitySpecialRenderer {
   private final Wood Model = new Wood();

   private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
      int meta = world.func_72805_g(x, y, z);
      GL11.glPushMatrix();
      GL11.glRotatef((float)(meta * -90), 0.0F, 0.0F, 1.0F);
      GL11.glPopMatrix();
   }

   public void func_147500_a(TileEntity te, double x, double y, double z, float scale) {
      int i = 0;
      if (te.func_145830_o()) {
         i = te.func_145832_p();
      }

      short short1 = 0;
      if (i == 2) {
         short1 = 0;
      }

      if (i == 3) {
         short1 = 180;
      }

      if (i == 4) {
         short1 = -90;
      }

      if (i == 5) {
         short1 = 90;
      }

      ResourceLocation textures = new ResourceLocation("fantasyland:textures/model/Wood1.png");
      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef((float)short1, 0.0F, 1.0F, 0.0F);
      this.Model.func_78088_a((Entity)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }
}
