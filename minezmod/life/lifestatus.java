package minezmod.life;

import cabalaccessorys.api.TextureSetting;
import cabalaccessorys.entity.headplayer.EntityHeadPlayer;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import minezmod.save;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Post;
import org.lwjgl.opengl.GL11;

public class lifestatus extends Gui {
   private Minecraft mc;
   private static final ResourceLocation closegui = new ResourceLocation("minezmod:textures/gui/closegui.png");
   private static final ResourceLocation tex_funbar = new ResourceLocation("minezmod:textures/gui/bar.png");
   private static final ResourceLocation foodicon = new ResourceLocation("minezmod:textures/gui/foodicon.png");
   private static final ResourceLocation hpbar = new ResourceLocation("minezmod:textures/gui/Barnew.png");
   private EntityHeadPlayer entity = null;

   public lifestatus(Minecraft mc) {
      this.mc = mc;
   }

   @SubscribeEvent(
      priority = EventPriority.NORMAL
   )
   public void onRenderExperienceBar(Post event) {
      if (event.type == ElementType.HOTBAR) {
         ScaledResolution scaledresolution = new ScaledResolution(this.mc, this.mc.field_71443_c, this.mc.field_71440_d);
         int k = scaledresolution.func_78326_a();
         int l = scaledresolution.func_78328_b();
         int hk = k / 2;
         save props = save.get(this.mc.field_71439_g);
         EntityPlayer player = this.mc.field_71439_g;
         if (props != null) {
            int xPos = false;
            int yPos = -150;
            GL11.glPushMatrix();
            GL11.glScalef(0.8F, 0.8F, 0.8F);
            GL11.glPushMatrix();
            GL11.glScalef(1.0F, 0.8F, 1.0F);
            this.mc.func_110434_K().func_110577_a(hpbar);
            TextureSetting.setblur();
            GL11.glEnable(3042);
            GL11.glDisable(2929);
            GL11.glDepthMask(false);
            GL11.glBlendFunc(770, 771);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(3008);
            this.func_73729_b(0, yPos + 145, 0, 0, 250, 70);
            int manabarwidth = (int)(player.func_110143_aJ() / player.func_110138_aP() * 168.0F);
            GL11.glPushMatrix();
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.func_73729_b(50, yPos + 153, 10, 80, manabarwidth, 20);
            GL11.glPopMatrix();
            int manabarwidth1 = 140;
            GL11.glPushMatrix();
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.func_73729_b(54, yPos + 174, 10, 110, manabarwidth1, 20);
            GL11.glPopMatrix();
            int j12 = player.func_71050_bK();
            if (j12 > 0) {
               int short1 = 100;
               int exp = (int)(player.field_71106_cc * (float)(short1 + 1));
               this.func_73729_b(34, yPos + 200, 11, 130, exp, 20);
            }

            if (this.entity == null) {
               this.entity = new EntityHeadPlayer(this.mc.field_71441_e);
            } else {
               renderplayer(32, 65, 20, -20.0F, 0.0F, this.entity);
            }

            GL11.glDisable(3042);
            GL11.glEnable(2929);
            GL11.glDepthMask(true);
            GL11.glPopMatrix();
            GL11.glDisable(3042);
            GL11.glEnable(2929);
            GL11.glDepthMask(true);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(0.7F, 0.7F, 0.7F);
            this.mc.field_71466_p.func_78276_b(EnumChatFormatting.WHITE + player.func_70005_c_(), 90, 34, 0);
            this.mc.field_71466_p.func_78276_b(EnumChatFormatting.WHITE + "" + player.func_71024_bL().func_75116_a() + "/20", 80, 23, 0);
            this.mc.field_71466_p.func_78276_b(EnumChatFormatting.WHITE + "" + (int)player.func_110143_aJ() + "/" + (int)player.func_110138_aP(), 65, 13, 0);
            this.mc.field_71466_p.func_78276_b(EnumChatFormatting.GOLD + "" + player.field_71068_ca, 15, 35, 0);
            GL11.glPopMatrix();
            this.mc.field_71466_p.func_78276_b(EnumChatFormatting.GOLD + "§aK เรียงสกิล §f/ §bH เปิด ปิดหมวก", 5, l - 25, 0);
         }
      }
   }

   public static void renderplayer(int p_147046_0_, int p_147046_1_, int p_147046_2_, float p_147046_3_, float p_147046_4_, EntityLivingBase p_147046_5_) {
      GL11.glEnable(2903);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)p_147046_0_, (float)p_147046_1_, 50.0F);
      GL11.glScalef((float)(-p_147046_2_), (float)p_147046_2_, (float)p_147046_2_);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      float f2 = p_147046_5_.field_70761_aq;
      float f3 = p_147046_5_.field_70177_z;
      float f4 = p_147046_5_.field_70125_A;
      float f5 = p_147046_5_.field_70758_at;
      float f6 = p_147046_5_.field_70759_as;
      GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
      RenderHelper.func_74519_b();
      GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-((float)Math.atan((double)(p_147046_4_ / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
      p_147046_5_.field_70761_aq = (float)Math.atan((double)(p_147046_3_ / 40.0F)) * 20.0F;
      p_147046_5_.field_70177_z = (float)Math.atan((double)(p_147046_3_ / 40.0F)) * 40.0F;
      p_147046_5_.field_70125_A = -((float)Math.atan((double)(p_147046_4_ / 40.0F))) * 20.0F;
      p_147046_5_.field_70759_as = p_147046_5_.field_70177_z;
      p_147046_5_.field_70758_at = p_147046_5_.field_70177_z;
      GL11.glTranslatef(0.0F, p_147046_5_.field_70129_M, 0.0F);
      RenderManager.field_78727_a.field_78735_i = 180.0F;
      RenderManager.field_78727_a.func_147940_a(p_147046_5_, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
      p_147046_5_.field_70761_aq = f2;
      p_147046_5_.field_70177_z = f3;
      p_147046_5_.field_70125_A = f4;
      p_147046_5_.field_70758_at = f5;
      p_147046_5_.field_70759_as = f6;
      GL11.glPopMatrix();
      RenderHelper.func_74518_a();
      GL11.glDisable(32826);
      OpenGlHelper.func_77473_a(OpenGlHelper.field_77476_b);
      GL11.glDisable(3553);
      OpenGlHelper.func_77473_a(OpenGlHelper.field_77478_a);
   }
}
