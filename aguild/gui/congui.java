package aguild.gui;

import aguild.mod;
import aguild.packetclick;
import aguild.playerdata;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class congui extends GuiScreen {
   EntityPlayer player = null;
   private static final ResourceLocation tex = new ResourceLocation("aguild:textures/gui/congui.png");

   public congui(EntityPlayer player) {
      this.player = player;
   }

   public void func_73866_w_() {
   }

   public void func_73863_a(int par1, int par2, float par3) {
      this.func_146276_q_();
      super.func_73863_a(par1, par2, par3);
      playerdata px = playerdata.get(this.player);
      this.field_146292_n.clear();
      this.field_146292_n.add(new GuiButton(0, this.field_146294_l / 2 - 40, this.field_146295_m / 2 - 15, 40, 20, "§aเข้าร่วม"));
      this.field_146292_n.add(new GuiButton(1, this.field_146294_l / 2 + 2, this.field_146295_m / 2 - 15, 40, 20, "§4ปฏิเสธ"));
      this.field_146289_q.func_78276_b("§0หัวหน้ากิล §9" + px.guildname, this.field_146294_l / 2 - 45, this.field_146295_m / 2 - 40, 0);
      this.field_146289_q.func_78276_b("§0ชวนคุญเข้าร่วมกิล", this.field_146294_l / 2 - 30, this.field_146295_m / 2 - 30, 0);
   }

   public void func_146276_q_() {
      this.func_146270_b(0);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_146297_k.func_110434_K().func_110577_a(tex);
      this.func_73729_b(this.field_146294_l / 2 - 80, this.field_146295_m / 2 - 80, 0, 0, 250, 300);
   }

   public void func_146278_c(int p_146278_1_) {
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      Tessellator tessellator = Tessellator.field_78398_a;
      this.field_146297_k.func_110434_K().func_110577_a(field_110325_k);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float f = 32.0F;
      tessellator.func_78382_b();
      tessellator.func_78378_d(4210752);
      tessellator.func_78374_a(0.0D, (double)this.field_146295_m, 0.0D, 0.0D, (double)((float)this.field_146295_m / f + (float)p_146278_1_));
      tessellator.func_78374_a((double)this.field_146294_l, (double)this.field_146295_m, 0.0D, (double)((float)this.field_146294_l / f), (double)((float)this.field_146295_m / f + (float)p_146278_1_));
      tessellator.func_78374_a((double)this.field_146294_l, 0.0D, 0.0D, (double)((float)this.field_146294_l / f), (double)p_146278_1_);
      tessellator.func_78374_a(0.0D, 0.0D, 0.0D, 0.0D, (double)p_146278_1_);
      tessellator.func_78381_a();
   }

   protected void func_146284_a(GuiButton button) {
      if (button.field_146127_k == 0) {
         mod.network.sendToServer(new packetclick(6, "", 0));
         this.player.func_71053_j();
      } else if (button.field_146127_k == 1) {
         mod.network.sendToServer(new packetclick(7, "", 0));
         this.player.func_71053_j();
      }

   }
}
