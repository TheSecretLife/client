package aguild.gui;

import aguild.mod;
import aguild.packetclick;
import aguild.playerdata;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class guienemy extends GuiScreen {
   EntityPlayer player = null;
   private static final ResourceLocation tex = new ResourceLocation("aguild:textures/gui/engui.png");

   public guienemy(EntityPlayer player) {
      this.player = player;
   }

   public void func_73866_w_() {
   }

   public void func_73863_a(int par1, int par2, float par3) {
      this.func_146276_q_();
      super.func_73863_a(par1, par2, par3);
      playerdata px = playerdata.get(this.player);
      String color = "§7";
      String enm = "Not Enemy";
      if (!px.enemy.equalsIgnoreCase("")) {
         color = "§c";
         enm = px.enemy;
      }

      this.field_146289_q.func_78276_b(color + enm, this.field_146294_l / 2 - (enm.length() * 3 - 2), this.field_146295_m / 2 - 40, 0);
      this.field_146292_n.clear();
      this.field_146292_n.add(new GuiButton(0, this.field_146294_l / 2 + 5, this.field_146295_m / 2 + 10, 60, 20, "กลับไปเมนูกิล"));
      if (px.inguild && px.host) {
         this.field_146292_n.add(new GuiButton(1, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 10, 60, 20, "ทำสงคราม"));
         if (!px.enemy.equalsIgnoreCase("")) {
            this.field_146292_n.add(new GuiButton(2, this.field_146294_l / 2 - 30, this.field_146295_m / 2 + 32, 60, 20, "สงบศึก"));
         }
      }

   }

   public void func_146276_q_() {
      this.func_146270_b(0);
      playerdata px = playerdata.get(this.player);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_146297_k.func_110434_K().func_110577_a(tex);
      this.func_73729_b(this.field_146294_l / 2 - 80, this.field_146295_m / 2 - 80, 0, 0, 250, 300);
   }

   protected void func_146284_a(GuiButton button) {
      playerdata px = playerdata.get(this.player);
      if (button.field_146127_k == 0) {
         if (px.inguild) {
            this.player.func_71053_j();
            this.player.openGui(mod.instance, 1, this.player.field_70170_p, (int)this.player.field_70165_t, (int)this.player.field_70163_u, (int)this.player.field_70161_v);
         }
      } else if (button.field_146127_k == 1) {
         if (px.inguild) {
            this.player.func_71053_j();
            this.player.openGui(mod.instance, 9, this.player.field_70170_p, (int)this.player.field_70165_t, (int)this.player.field_70163_u, (int)this.player.field_70161_v);
         }
      } else if (button.field_146127_k == 2 && px.inguild) {
         this.player.func_71053_j();
         mod.network.sendToServer(new packetclick(52, "", 0));
      }

   }
}
