package sp;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import sp.network.PacketDispatcher;
import sp.network.server.OpenGuiMessage;

public class GuiSettingSpawn extends GuiScreen {
   private GuiSettingSpawn.List ListGui;
   private java.util.List listdata;
   public int selectid = 0;
   private GuiTextField name;
   private GuiTextField lv;
   private GuiTextField exp;
   private GuiTextField money;
   private GuiTextField damage;
   private GuiTextField hp;

   public GuiSettingSpawn() {
      this.loadPreEntities();
   }

   public boolean func_73868_f() {
      return false;
   }

   public void func_73866_w_() {
      this.selectid = 0;
      this.ListGui = new GuiSettingSpawn.List();
      int w = this.field_146294_l / 2;
      int h = this.field_146295_m / 2;
      this.field_146292_n.clear();
      this.field_146292_n.add(new GuiButton(0, this.field_146294_l - 80, h - 34, 40, 20, "ตกลง"));
      this.field_146292_n.add(new GuiButton(1, this.field_146294_l - 80, h + 50, 40, 20, "ยกเลิก"));
      this.name = new GuiTextField(this.field_146297_k.field_71466_p, w - 50, 20, 120, 20);
      this.name.field_146219_i = 10;
      this.name.func_146195_b(true);
      this.lv = new GuiTextField(this.field_146297_k.field_71466_p, w + 100, 20, 120, 20);
      this.exp = new GuiTextField(this.field_146297_k.field_71466_p, w + 100, 40, 120, 20);
      this.money = new GuiTextField(this.field_146297_k.field_71466_p, w + 100, 60, 120, 20);
      this.damage = new GuiTextField(this.field_146297_k.field_71466_p, w - 50, 60, 120, 20);
      this.hp = new GuiTextField(this.field_146297_k.field_71466_p, w - 50, 40, 120, 20);
      this.lv.field_146219_i = 10;
      this.exp.field_146219_i = 10;
      this.money.field_146219_i = 10;
      this.damage.field_146219_i = 10;
      this.hp.field_146219_i = 10;
      super.func_73866_w_();
   }

   protected void func_73869_a(char par1, int par2) {
      super.func_73869_a(par1, par2);
      this.name.func_146201_a(par1, par2);
      this.lv.func_146201_a(par1, par2);
      this.exp.func_146201_a(par1, par2);
      this.money.func_146201_a(par1, par2);
      this.damage.func_146201_a(par1, par2);
      this.hp.func_146201_a(par1, par2);
   }

   private void loadPreEntities() {
      Map data = EntityList.field_75625_b;
      ArrayList list = new ArrayList();
      Iterator var3 = data.keySet().iterator();

      while(var3.hasNext()) {
         Object name = var3.next();
         Class c = (Class)data.get(name);

         try {
            if (EntityLiving.class.isAssignableFrom(c) && c.getConstructor(World.class) != null && !Modifier.isAbstract(c.getModifiers())) {
               list.add(name.toString());
            }
         } catch (SecurityException var7) {
            ;
         } catch (NoSuchMethodException var8) {
            ;
         }
      }

      this.listdata = list;
   }

   protected void func_146284_a(GuiButton p_146284_1_) {
      switch(p_146284_1_.field_146127_k) {
      case 0:
         if (!this.name.func_146179_b().isEmpty() && !this.lv.func_146179_b().isEmpty() && !this.exp.func_146179_b().isEmpty() && !this.money.func_146179_b().isEmpty() && !this.damage.func_146179_b().isEmpty() && !this.hp.func_146179_b().isEmpty()) {
            PacketDispatcher.sendToServer(new OpenGuiMessage(Integer.parseInt(this.lv.func_146179_b()), this.field_146297_k.field_71439_g.field_70165_t, this.field_146297_k.field_71439_g.field_70163_u, this.field_146297_k.field_71439_g.field_70161_v, (String)this.listdata.get(this.selectid), Integer.parseInt(this.exp.func_146179_b()), Integer.parseInt(this.hp.func_146179_b()), Integer.parseInt(this.money.func_146179_b()), Integer.parseInt(this.damage.func_146179_b()), this.name.func_146179_b()));
         } else {
            this.field_146297_k.field_71439_g.func_146105_b(new ChatComponentText("โปรดกรอกข้อมูลมอนสเตอร์ให้ครบทุกช่อง"));
         }
         break;
      case 1:
         this.field_146297_k.func_71381_h();
      }

   }

   public void func_146282_l() {
      super.func_146282_l();
   }

   public void func_73876_c() {
      super.func_73876_c();
      this.name.func_146178_a();
      this.lv.func_146178_a();
      this.exp.func_146178_a();
      this.hp.func_146178_a();
      this.money.func_146178_a();
      this.damage.func_146178_a();
   }

   protected void func_73864_a(int x, int y, int btn) {
      super.func_73864_a(x, y, btn);
      this.name.func_146192_a(x, y, btn);
      this.lv.func_146192_a(x, y, btn);
      this.exp.func_146192_a(x, y, btn);
      this.hp.func_146192_a(x, y, btn);
      this.money.func_146192_a(x, y, btn);
      this.damage.func_146192_a(x, y, btn);
   }

   public void func_73863_a(int p_73863_1_, int p_73863_2_, float p_73863_3_) {
      this.func_146276_q_();
      this.ListGui.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
      this.func_73732_a(this.field_146289_q, "Set Spawn Monster", this.field_146294_l / 2, 2, 16777215);
      Entity en = EntityList.func_75620_a((String)this.listdata.get(this.selectid), Minecraft.func_71410_x().field_71441_e);
      if (en != null) {
         int w = this.field_146294_l / 2;
         int h = this.field_146295_m / 2;
         GL11.glDisable(2884);
         GL11.glDisable(2896);
         RenderHelper.func_74519_b();
         drawentity(this.field_146294_l / 6, (int)((double)this.field_146295_m / 1.3D), 50, 0.0F, 0.0F, (EntityLivingBase)en);
         this.field_146289_q.func_78276_b("ชื่อ ", w - 70, 20, 16777215);
         this.field_146289_q.func_78276_b("HP ", w - 70, 40, 16777215);
         this.field_146289_q.func_78276_b("ดาเมจ ", w - 70, 60, 16777215);
         this.field_146289_q.func_78276_b("Lv ", w + 80, 20, 16777215);
         this.field_146289_q.func_78276_b("Exp ", w + 80, 40, 16777215);
         this.field_146289_q.func_78276_b("เงิน ", w + 80, 60, 16777215);
      }

      this.name.func_146194_f();
      this.lv.func_146194_f();
      this.exp.func_146194_f();
      this.hp.func_146194_f();
      this.money.func_146194_f();
      this.damage.func_146194_f();
      if (!this.lv.func_146179_b().matches("^[-0-9]+")) {
         this.lv.func_146180_a("");
      } else if (!this.exp.func_146179_b().matches("^[-0-9]+")) {
         this.exp.func_146180_a("");
      } else if (!this.money.func_146179_b().matches("^[-0-9]+")) {
         this.money.func_146180_a("");
      } else if (!this.hp.func_146179_b().matches("^[-0-9]+")) {
         this.hp.func_146180_a("");
      } else if (!this.damage.func_146179_b().matches("^[-0-9]+")) {
         this.damage.func_146180_a("");
      }

      super.func_73863_a(p_73863_1_, p_73863_2_, p_73863_3_);
   }

   public static void drawentity(int p_147046_0_, int p_147046_1_, int p_147046_2_, float p_147046_3_, float p_147046_4_, EntityLivingBase p_147046_5_) {
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
      GL11.glRotatef((float)Minecraft.func_71410_x().field_71439_g.field_70173_aa, 0.0F, 1.0F, 0.0F);
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

   @SideOnly(Side.CLIENT)
   class List extends GuiNewSlot {
      private static final String __OBFID = "CL_00000715";

      public List() {
         super(GuiSettingSpawn.this.field_146297_k, GuiSettingSpawn.this.field_146294_l, GuiSettingSpawn.this.field_146295_m, 80, GuiSettingSpawn.this.field_146295_m - 40, GuiSettingSpawn.this.field_146289_q.field_78288_b + 1);
      }

      protected int getSize() {
         return GuiSettingSpawn.this.listdata.size();
      }

      protected void elementClicked(int p_148144_1_, boolean p_148144_2_, int p_148144_3_, int p_148144_4_) {
         System.out.println("index " + p_148144_1_);
         GuiSettingSpawn.this.selectid = p_148144_1_;
      }

      protected boolean isSelected(int p_148131_1_) {
         return true;
      }

      protected void drawBackground() {
      }

      protected void drawSlot(int p_148126_1_, int p_148126_2_, int p_148126_3_, int p_148126_4_, Tessellator p_148126_5_, int p_148126_6_, int p_148126_7_) {
         if (GuiSettingSpawn.this.listdata.get(p_148126_1_) != null) {
            GuiSettingSpawn.this.field_146289_q.func_78276_b((String)GuiSettingSpawn.this.listdata.get(p_148126_1_), this.width / 2, p_148126_3_, 16777215);
         }

      }

      protected int getScrollBarX() {
         return this.width / 2 + 100;
      }
   }
}
