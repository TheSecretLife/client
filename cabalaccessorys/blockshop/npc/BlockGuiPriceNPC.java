package cabalaccessorys.blockshop.npc;

import cabalaccessorys.OpenGuiNewPacket;
import cabalaccessorys.Start;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class BlockGuiPriceNPC extends GuiScreen {
   private GuiTextField textbox;
   EntityPlayer Player = null;
   int price;
   public int sprice;

   public BlockGuiPriceNPC(EntityPlayer player, int setprice) {
      this.Player = player;
      this.sprice = setprice;
   }

   public void func_73866_w_() {
      this.textbox = new GuiTextField(this.field_146289_q, this.field_146294_l / 2 - 68, this.field_146295_m / 2 - 46, 137, 20);
      this.textbox.func_146203_f(9);
      this.textbox.func_146195_b(true);
   }

   protected void func_73869_a(char par1, int par2) {
      this.textbox.func_146201_a(par1, par2);
      if (par2 != 18 || !this.textbox.func_146206_l()) {
         super.func_73869_a(par1, par2);
      }

   }

   public void func_73876_c() {
      super.func_73876_c();
      this.textbox.func_146178_a();
   }

   public void func_73863_a(int par1, int par2, float par3) {
      this.func_146276_q_();
      this.textbox.func_146194_f();
      super.func_73863_a(par1, par2, par3);
      this.field_146292_n.clear();
      this.field_146292_n.add(new GuiButton(0, this.field_146294_l / 2 - 68, this.field_146295_m / 2 - 26, 30, 15, "ตกลง"));
      this.field_146289_q.func_78276_b("§fตั้งราคาไอเทมแล้วกดตกลง", this.field_146294_l / 2 - 68, this.field_146295_m / 2 - 70, 16777215);
   }

   protected void func_73864_a(int x, int y, int btn) {
      super.func_73864_a(x, y, btn);
      this.textbox.func_146192_a(x, y, btn);
   }

   public int getValue() {
      if (this.textbox.func_146179_b().length() > 0) {
         try {
            this.price = Integer.parseInt(this.textbox.func_146179_b());
         } catch (NumberFormatException var2) {
            this.setValue(0);
         }
      } else {
         this.price = 0;
      }

      return this.price;
   }

   public void setValue(int val) {
      this.textbox.func_146180_a(Integer.toString(val));
      this.price = val;
   }

   protected void func_146284_a(GuiButton button) {
      if (button.field_146127_k == 0) {
         EntityPlayer p = this.Player;
         this.getValue();
         if (this.price != 0) {
            p.func_71053_j();
            Start.networkChannel.sendToServer(new OpenGuiNewPacket(Start.BsG));
         } else {
            p.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §cต้องใส่ตัวเลขเพื่อตั้งราคาไอเทม"));
         }
      }

   }
}
