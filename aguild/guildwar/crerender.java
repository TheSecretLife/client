package aguild.guildwar;

import aguild.importobj;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import utilities.sagaobj;

@SideOnly(Side.CLIENT)
public class crerender extends TileEntitySpecialRenderer {
   private final ResourceLocation tex1 = new ResourceLocation("aguild", "models/ccrystal.png");
   private final sagaobj model = (sagaobj)importobj.getObjModel("aguild:models/ccrystal.saga");
   Random rand = new Random();

   public void func_147500_a(TileEntity tileEntity, double x, double y, double z, float f) {
      int i = 0;
      if (tileEntity.func_145830_o()) {
         i = tileEntity.func_145832_p();
      }

      short short1 = false;
      if (i == 2) {
         short1 = false;
      }

      if (i == 3) {
         short1 = true;
      }

      if (i == 4) {
         short1 = true;
      }

      if (i == 5) {
         short1 = true;
      }

      Minecraft.func_71410_x().field_71446_o.func_110577_a(this.tex1);
      GL11.glPushMatrix();
      GL11.glColor4d(3.0D, 3.0D, 3.0D, 3.0D);
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      Minecraft.func_71410_x().field_71446_o.func_110577_a(this.tex1);
      GL11.glScalef(6.0F, 6.0F, 6.0F);
      GL11.glTranslatef(0.0F, -0.3F, 0.0F);
      GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
      this.model.renderAll();
      GL11.glPopMatrix();
   }
}
