package npcseller.container;

import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import npcseller.TileC;
import npcseller.network.PacketDispatcher;
import npcseller.network.server.onServersetname;
import org.lwjgl.opengl.GL11;

public class GuiContainerC extends GuiContainer {
   private IInventory playerInv;
   private TileC te;
   private ResourceLocation tex = new ResourceLocation("cabalaccessorys:textures/GuiSHOPOP.png");
   private GuiTextField name;

   public void func_73866_w_() {
      super.func_73866_w_();
      int w = this.field_146294_l / 2;
      int h = this.field_146295_m / 2;
      this.name = new GuiTextField(this.field_146297_k.field_71466_p, w - 30, h - 100, 150, 20);
      this.name.func_146203_f(30);
      this.name.field_146219_i = 20;
      this.name.func_146195_b(true);
      this.name.func_146180_a(this.te.getNamenpc());
   }

   protected void func_73869_a(char par1, int par2) {
      super.func_73869_a(par1, par2);
      this.name.func_146201_a(par1, par2);
   }

   public void func_73863_a(int p_73863_1_, int p_73863_2_, float p_73863_3_) {
      super.func_73863_a(p_73863_1_, p_73863_2_, p_73863_3_);
      this.name.func_146194_f();
   }

   public void func_146282_l() {
      super.func_146282_l();
   }

   protected void func_73864_a(int x, int y, int btn) {
      super.func_73864_a(x, y, btn);
      this.name.func_146192_a(x, y, btn);
   }

   public void func_146281_b() {
      super.func_146281_b();
      PacketDispatcher.sendToServer(new onServersetname(this.name.func_146179_b(), this.te.field_145851_c, this.te.field_145848_d, this.te.field_145849_e));
      this.te.setNamenpc(this.name.func_146179_b());
      this.te.func_145845_h();
      this.field_146297_k.field_71441_e.func_147471_g(this.te.field_145851_c, this.te.field_145848_d, this.te.field_145849_e);
      this.te.func_70296_d();
   }

   public void func_73876_c() {
      super.func_73876_c();
      this.name.func_146178_a();
   }

   public GuiContainerC(IInventory playerInv, TileC te) {
      super(new ContainerC(playerInv, te));
      this.playerInv = playerInv;
      this.te = te;
      this.field_146999_f = 250;
      this.field_147000_g = 166;
   }

   protected void func_146976_a(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_146297_k.func_110434_K().func_110577_a(this.tex);
      this.func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f, this.field_147000_g);
   }

   protected void func_146979_b(int mouseX, int mouseY) {
   }
}
