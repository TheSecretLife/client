package aguild.gui;

import aguild.mod;
import aguild.playerdata;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class guibuff extends GuiScreen {
   EntityPlayer player = null;
   private static final ResourceLocation tex = new ResourceLocation("aguild:textures/gui/buffguild.png");
   private static final ResourceLocation tex2 = new ResourceLocation("aguild:textures/gui/bgui2.png");
   private static final ResourceLocation tex3 = new ResourceLocation("aguild:textures/gui/bgui3.png");
   private static final ResourceLocation tex4 = new ResourceLocation("aguild:textures/gui/bgui4.png");
   private static final ResourceLocation tex5 = new ResourceLocation("aguild:textures/gui/bgui5.png");
   private static final ResourceLocation tex6 = new ResourceLocation("aguild:textures/gui/bgui6.png");
   private static final ResourceLocation texwar = new ResourceLocation("aguild:textures/gui/winwar.png");

   public guibuff(EntityPlayer player) {
      this.player = player;
   }

   public void func_73866_w_() {
   }

   public void func_73863_a(int par1, int par2, float par3) {
      this.func_146276_q_();
      super.func_73863_a(par1, par2, par3);
      playerdata px = playerdata.get(this.player);
      this.field_146289_q.func_78276_b("§0Guild Lv §9" + px.guildlv, this.field_146294_l / 2 - 40, this.field_146295_m / 2 - 40, 0);
      if (px.guildlv < 10) {
         this.field_146289_q.func_78276_b("§0EXP §3" + px.guildexp + "§0/§3" + px.guildlv * 300, this.field_146294_l / 2 - 40, this.field_146295_m / 2 - 28, 0);
      } else {
         this.field_146289_q.func_78276_b("§0EXP §3----§0/§3----", this.field_146294_l / 2 - 40, this.field_146295_m / 2 - 28, 0);
      }

      this.field_146292_n.clear();
      this.field_146292_n.add(new GuiButton(0, this.field_146294_l / 2 - 30, this.field_146295_m / 2 + 50, 60, 20, "กลับไปเมนูกิล"));
   }

   public void func_146276_q_() {
      this.func_146270_b(0);
      playerdata px = playerdata.get(this.player);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      if (px.guildlv < 2) {
         this.field_146297_k.func_110434_K().func_110577_a(tex);
      } else if (px.guildlv < 4) {
         this.field_146297_k.func_110434_K().func_110577_a(tex2);
      } else if (px.guildlv < 6) {
         this.field_146297_k.func_110434_K().func_110577_a(tex3);
      } else if (px.guildlv < 7) {
         this.field_146297_k.func_110434_K().func_110577_a(tex4);
      } else if (px.guildlv < 10) {
         this.field_146297_k.func_110434_K().func_110577_a(tex5);
      } else {
         this.field_146297_k.func_110434_K().func_110577_a(tex6);
      }

      this.func_73729_b(this.field_146294_l / 2 - 80, this.field_146295_m / 2 - 80, 0, 0, 250, 300);
      if (px.winwar) {
         this.field_146297_k.func_110434_K().func_110577_a(texwar);
         this.func_73729_b(this.field_146294_l / 2 - 80, this.field_146295_m / 2 - 80, 0, 0, 250, 300);
      }

   }

   protected void func_146284_a(GuiButton button) {
      playerdata px = playerdata.get(this.player);
      if (button.field_146127_k == 0 && px.inguild) {
         this.player.func_71053_j();
         this.player.openGui(mod.instance, 1, this.player.field_70170_p, (int)this.player.field_70165_t, (int)this.player.field_70163_u, (int)this.player.field_70161_v);
      }

   }
}
