package aguild;

import cabalaccessorys.data.PlayerData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import utilities.SagaModelLoader;
import utilities.sagaobj;

@SideOnly(Side.CLIENT)
public class NameTagRenderer extends Gui {
   public Minecraft mc = Minecraft.func_71410_x();
   public ResourceLocation tag;
   private static final ResourceLocation b0 = new ResourceLocation("aguild:textures/gui/test.png");
   private sagaobj modelbar = (sagaobj)SagaModelLoader.loadModel(new ResourceLocation("aguild", "models/headbar.saga"));
   private ResourceLocation tex = new ResourceLocation("aguild", "models/bartex.png");
   private static ResourceLocation GuildEmblem;
   private URL guildUrl = null;
   private BufferedImage image = null;

   public void renderNameTag(EntityPlayer entity, float x, float y, float z) {
      if (this.mc.field_71415_G) {
         playerdata px = playerdata.get(entity);
         FontRenderer fontRenderer = this.mc.field_71466_p;
         float f = 1.6F;
         float f1 = 0.016666668F * f;
         GL11.glPushMatrix();
         GL11.glDisable(2884);
         GL11.glDisable(2896);
         GL11.glEnable(3042);
         OpenGlHelper.func_148821_a(770, 771, 1, 0);
         float sizebar = 0.8F;
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.6F);
         GL11.glTranslated((double)x, (double)(y + entity.field_70131_O + 0.5F), (double)z);
         GL11.glRotatef(-RenderManager.field_78727_a.field_78735_i, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(RenderManager.field_78727_a.field_78732_j * 0.8F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glTranslated(0.0D, 0.05999999865889549D, 0.75D);
         GL11.glScalef(sizebar, sizebar - 0.2F, sizebar);
         this.mc.field_71446_o.func_110577_a(this.tex);
         this.modelbar.renderOnly("bg");
         float hp = entity.func_110143_aJ() / entity.func_110138_aP() * 1.0F;
         GL11.glScalef(sizebar, sizebar + 0.21F, hp);
         this.modelbar.renderOnly("hp");
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glDisable(2884);
         GL11.glDisable(2896);
         GL11.glEnable(3042);
         OpenGlHelper.func_148821_a(770, 771, 1, 0);
         float sizebar2 = 0.8F;
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.6F);
         GL11.glTranslated((double)x, (double)(y + entity.field_70131_O + 0.5F), (double)z);
         GL11.glRotatef(-RenderManager.field_78727_a.field_78735_i, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(RenderManager.field_78727_a.field_78732_j * 0.8F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glTranslated(0.0D, 0.05999999865889549D, 0.75D);
         GL11.glScalef(sizebar, sizebar - 0.2F, sizebar);
         this.mc.field_71446_o.func_110577_a(this.tex);
         float food = (float)entity.func_71024_bL().func_75116_a() / 20.0F * 1.0F;
         GL11.glScalef(sizebar, sizebar + 0.21F, food);
         this.modelbar.renderOnly("food");
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         GL11.glTranslated((double)x, (double)(y + entity.field_70131_O + 0.7F), (double)z);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-RenderManager.field_78727_a.field_78735_i, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-RenderManager.field_78727_a.field_78732_j, 1.0F, 0.0F, 0.0F);
         GL11.glScalef(-f1, -f1, f1);
         GL11.glDisable(2896);
         GL11.glDepthMask(false);
         GL11.glDisable(2929);
         GL11.glEnable(3042);
         PlayerData data = PlayerData.get(entity);
         String name = "";
         if (entity.func_70096_w().func_75679_c(3) != 0) {
            name = "§c" + entity.func_70005_c_();
         } else {
            name = "§f" + entity.func_70005_c_();
         }

         String lvl = " §f[§aLV." + entity.func_70096_w().func_75679_c(15) + "§f]";
         String party = "§f[§c" + px.guildname + "§f]";
         fontRenderer.func_78276_b(name, -fontRenderer.func_78256_a(name) / 2, -15, 10526880);
         fontRenderer.func_78276_b(lvl, -67, -3, 10526880);
         this.mc.field_71446_o.func_110577_a(field_110324_m);
         GL11.glEnable(2929);
         GL11.glDepthMask(true);
         fontRenderer.func_78276_b(name, -fontRenderer.func_78256_a(name) / 2, -15, -1);
         if (!px.guildname.equalsIgnoreCase("")) {
            fontRenderer.func_78276_b(party, -fontRenderer.func_78256_a(party) / 2, -25, -1);
         }

         if (px.host) {
            fontRenderer.func_78276_b("♚", -fontRenderer.func_78256_a(party), -25, -410800);
            fontRenderer.func_78276_b("♚", fontRenderer.func_78256_a(party) - 8, -25, -410800);
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(2896);
         GL11.glDisable(3042);
         GL11.glPopMatrix();
      }

   }

   public void setpic(EntityPlayer entity) {
      playerdata var2 = playerdata.get(entity);

      try {
         this.guildUrl = new URL("http://oi59.tinypic.com/mkdxe.jpg");
         this.image = ImageIO.read(this.guildUrl);
         GuildEmblem = this.mc.func_110434_K().func_110578_a("ModControl.Graph", new DynamicTexture(this.image));
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }
}
