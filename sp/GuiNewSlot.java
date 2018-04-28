package sp;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public abstract class GuiNewSlot {
   private final Minecraft mc;
   public int width;
   public int height;
   public int top;
   public int bottom;
   public int right;
   public int left;
   public final int slotHeight;
   private int scrollUpButtonID;
   private int scrollDownButtonID;
   protected int mouseX;
   protected int mouseY;
   protected boolean field_148163_i = true;
   private float initialClickY = -2.0F;
   private float scrollMultiplier;
   private float amountScrolled;
   private int selectedElement = -1;
   private long lastClicked;
   private boolean showSelectionBox = false;
   private boolean hasListHeader;
   public int headerPadding;
   private boolean field_148164_v = true;
   private static final String __OBFID = "CL_00000679";

   public GuiNewSlot(Minecraft p_i1052_1_, int p_i1052_2_, int p_i1052_3_, int p_i1052_4_, int p_i1052_5_, int p_i1052_6_) {
      this.mc = p_i1052_1_;
      this.width = p_i1052_2_;
      this.height = p_i1052_3_;
      this.top = p_i1052_4_;
      this.bottom = p_i1052_5_;
      this.slotHeight = p_i1052_6_;
      this.left = 0;
      this.right = p_i1052_2_;
   }

   public void func_148122_a(int p_148122_1_, int p_148122_2_, int p_148122_3_, int p_148122_4_) {
      this.width = p_148122_1_;
      this.height = p_148122_2_;
      this.top = p_148122_3_;
      this.bottom = p_148122_4_;
      this.left = 0;
      this.right = p_148122_1_;
   }

   public void setShowSelectionBox(boolean p_148130_1_) {
      this.showSelectionBox = p_148130_1_;
   }

   protected void setHasListHeader(boolean p_148133_1_, int p_148133_2_) {
      this.hasListHeader = p_148133_1_;
      this.headerPadding = p_148133_2_;
      if (!p_148133_1_) {
         this.headerPadding = 0;
      }

   }

   protected abstract int getSize();

   protected abstract void elementClicked(int var1, boolean var2, int var3, int var4);

   protected abstract boolean isSelected(int var1);

   protected int getContentHeight() {
      return this.getSize() * this.slotHeight + this.headerPadding;
   }

   protected abstract void drawBackground();

   protected abstract void drawSlot(int var1, int var2, int var3, int var4, Tessellator var5, int var6, int var7);

   protected void drawListHeader(int p_148129_1_, int p_148129_2_, Tessellator p_148129_3_) {
   }

   protected void func_148132_a(int p_148132_1_, int p_148132_2_) {
   }

   protected void func_148142_b(int p_148142_1_, int p_148142_2_) {
   }

   public int func_148124_c(int p_148124_1_, int p_148124_2_) {
      int k = this.left + this.width / 2 - this.getListWidth() / 2;
      int l = this.left + this.width / 2 + this.getListWidth() / 2;
      int i1 = p_148124_2_ - this.top - this.headerPadding + (int)this.amountScrolled - 4;
      int j1 = i1 / this.slotHeight;
      return p_148124_1_ < this.getScrollBarX() && p_148124_1_ >= k && p_148124_1_ <= l && j1 >= 0 && i1 >= 0 && j1 < this.getSize() ? j1 : -1;
   }

   public void registerScrollButtons(int p_148134_1_, int p_148134_2_) {
      this.scrollUpButtonID = p_148134_1_;
      this.scrollDownButtonID = p_148134_2_;
   }

   private void bindAmountScrolled() {
      int i = this.func_148135_f();
      if (i < 0) {
         i /= 2;
      }

      if (!this.field_148163_i && i < 0) {
         i = 0;
      }

      if (this.amountScrolled < 0.0F) {
         this.amountScrolled = 0.0F;
      }

      if (this.amountScrolled > (float)i) {
         this.amountScrolled = (float)i;
      }

   }

   public int func_148135_f() {
      return this.getContentHeight() - (this.bottom - this.top - 4);
   }

   public int getAmountScrolled() {
      return (int)this.amountScrolled;
   }

   public boolean func_148141_e(int p_148141_1_) {
      return p_148141_1_ >= this.top && p_148141_1_ <= this.bottom;
   }

   public void scrollBy(int p_148145_1_) {
      this.amountScrolled += (float)p_148145_1_;
      this.bindAmountScrolled();
      this.initialClickY = -2.0F;
   }

   public void actionPerformed(GuiButton p_148147_1_) {
      if (p_148147_1_.field_146124_l) {
         if (p_148147_1_.field_146127_k == this.scrollUpButtonID) {
            this.amountScrolled -= (float)(this.slotHeight * 2 / 3);
            this.initialClickY = -2.0F;
            this.bindAmountScrolled();
         } else if (p_148147_1_.field_146127_k == this.scrollDownButtonID) {
            this.amountScrolled += (float)(this.slotHeight * 2 / 3);
            this.initialClickY = -2.0F;
            this.bindAmountScrolled();
         }
      }

   }

   public void drawScreen(int p_148128_1_, int p_148128_2_, float p_148128_3_) {
      this.mouseX = p_148128_1_;
      this.mouseY = p_148128_2_;
      int k = this.getSize();
      int l = this.getScrollBarX();
      int i1 = l + 6;
      int l1;
      int i2;
      int k2;
      int i3;
      int l2;
      if (p_148128_1_ > this.left && p_148128_1_ < this.right && p_148128_2_ > this.top && p_148128_2_ < this.bottom) {
         if (Mouse.isButtonDown(0) && this.func_148125_i()) {
            if (this.initialClickY == -1.0F) {
               boolean flag1 = true;
               if (p_148128_2_ >= this.top && p_148128_2_ <= this.bottom) {
                  int k1 = this.width / 2 - this.getListWidth() / 2;
                  l1 = this.width / 2 + this.getListWidth() / 2;
                  i2 = p_148128_2_ - this.top - this.headerPadding + (int)this.amountScrolled - 4;
                  l2 = i2 / this.slotHeight;
                  if (p_148128_1_ >= k1 && p_148128_1_ <= l1 && l2 >= 0 && i2 >= 0 && l2 < k) {
                     boolean flag = l2 == this.selectedElement && Minecraft.func_71386_F() - this.lastClicked < 250L;
                     this.elementClicked(l2, flag, p_148128_1_, p_148128_2_);
                     this.selectedElement = l2;
                     this.lastClicked = Minecraft.func_71386_F();
                  } else if (p_148128_1_ >= k1 && p_148128_1_ <= l1 && i2 < 0) {
                     this.func_148132_a(p_148128_1_ - k1, p_148128_2_ - this.top + (int)this.amountScrolled - 4);
                     flag1 = false;
                  }

                  if (p_148128_1_ >= l && p_148128_1_ <= i1) {
                     this.scrollMultiplier = -1.0F;
                     i3 = this.func_148135_f();
                     if (i3 < 1) {
                        i3 = 1;
                     }

                     k2 = (int)((float)((this.bottom - this.top) * (this.bottom - this.top)) / (float)this.getContentHeight());
                     if (k2 < 32) {
                        k2 = 32;
                     }

                     if (k2 > this.bottom - this.top - 8) {
                        k2 = this.bottom - this.top - 8;
                     }

                     this.scrollMultiplier /= (float)(this.bottom - this.top - k2) / (float)i3;
                  } else {
                     this.scrollMultiplier = 1.0F;
                  }

                  if (flag1) {
                     this.initialClickY = (float)p_148128_2_;
                  } else {
                     this.initialClickY = -2.0F;
                  }
               } else {
                  this.initialClickY = -2.0F;
               }
            } else if (this.initialClickY >= 0.0F) {
               this.amountScrolled -= ((float)p_148128_2_ - this.initialClickY) * this.scrollMultiplier;
               this.initialClickY = (float)p_148128_2_;
            }
         } else {
            for(; !this.mc.field_71474_y.field_85185_A && Mouse.next(); this.mc.field_71462_r.func_146274_d()) {
               int j1 = Mouse.getEventDWheel();
               if (j1 != 0) {
                  if (j1 > 0) {
                     j1 = -1;
                  } else if (j1 < 0) {
                     j1 = 1;
                  }

                  this.amountScrolled += (float)(j1 * this.slotHeight / 2);
               }
            }

            this.initialClickY = -1.0F;
         }
      }

      this.bindAmountScrolled();
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      Tessellator tessellator = Tessellator.field_78398_a;
      this.drawContainerBackground(tessellator);
      l1 = this.left + this.width / 2 - this.getListWidth() / 2 + 2;
      i2 = this.top + 4 - (int)this.amountScrolled;
      if (this.hasListHeader) {
         this.drawListHeader(l1, i2, tessellator);
      }

      this.drawSelectionBox(l1, i2, p_148128_1_, p_148128_2_);
      byte b0 = 4;
      this.overlayBackground(0, this.top, 255, 255);
      this.overlayBackground(this.bottom, this.height, 255, 255);
      GL11.glEnable(3042);
      OpenGlHelper.func_148821_a(770, 771, 0, 1);
      GL11.glShadeModel(7425);
      GL11.glDisable(3553);
      tessellator.func_78382_b();
      tessellator.func_78384_a(0, 0);
      tessellator.func_78374_a((double)this.left, (double)(this.top + b0), 0.0D, 0.0D, 1.0D);
      tessellator.func_78374_a((double)this.right, (double)(this.top + b0), 0.0D, 1.0D, 1.0D);
      tessellator.func_78384_a(0, 255);
      tessellator.func_78374_a((double)this.right, (double)this.top, 0.0D, 1.0D, 0.0D);
      tessellator.func_78374_a((double)this.left, (double)this.top, 0.0D, 0.0D, 0.0D);
      tessellator.func_78381_a();
      tessellator.func_78382_b();
      tessellator.func_78384_a(0, 255);
      tessellator.func_78374_a((double)this.left, (double)this.bottom, 0.0D, 0.0D, 1.0D);
      tessellator.func_78374_a((double)this.right, (double)this.bottom, 0.0D, 1.0D, 1.0D);
      tessellator.func_78384_a(0, 0);
      tessellator.func_78374_a((double)this.right, (double)(this.bottom - b0), 0.0D, 1.0D, 0.0D);
      tessellator.func_78374_a((double)this.left, (double)(this.bottom - b0), 0.0D, 0.0D, 0.0D);
      tessellator.func_78381_a();
      i3 = this.func_148135_f();
      if (i3 > 0) {
         k2 = (this.bottom - this.top) * (this.bottom - this.top) / this.getContentHeight();
         if (k2 < 32) {
            k2 = 32;
         }

         if (k2 > this.bottom - this.top - 8) {
            k2 = this.bottom - this.top - 8;
         }

         l2 = (int)this.amountScrolled * (this.bottom - this.top - k2) / i3 + this.top;
         if (l2 < this.top) {
            l2 = this.top;
         }

         tessellator.func_78382_b();
         tessellator.func_78384_a(0, 255);
         tessellator.func_78374_a((double)l, (double)this.bottom, 0.0D, 0.0D, 1.0D);
         tessellator.func_78374_a((double)i1, (double)this.bottom, 0.0D, 1.0D, 1.0D);
         tessellator.func_78374_a((double)i1, (double)this.top, 0.0D, 1.0D, 0.0D);
         tessellator.func_78374_a((double)l, (double)this.top, 0.0D, 0.0D, 0.0D);
         tessellator.func_78381_a();
         tessellator.func_78382_b();
         tessellator.func_78384_a(8421504, 255);
         tessellator.func_78374_a((double)l, (double)(l2 + k2), 0.0D, 0.0D, 1.0D);
         tessellator.func_78374_a((double)i1, (double)(l2 + k2), 0.0D, 1.0D, 1.0D);
         tessellator.func_78374_a((double)i1, (double)l2, 0.0D, 1.0D, 0.0D);
         tessellator.func_78374_a((double)l, (double)l2, 0.0D, 0.0D, 0.0D);
         tessellator.func_78381_a();
         tessellator.func_78382_b();
         tessellator.func_78384_a(12632256, 255);
         tessellator.func_78374_a((double)l, (double)(l2 + k2 - 1), 0.0D, 0.0D, 1.0D);
         tessellator.func_78374_a((double)(i1 - 1), (double)(l2 + k2 - 1), 0.0D, 1.0D, 1.0D);
         tessellator.func_78374_a((double)(i1 - 1), (double)l2, 0.0D, 1.0D, 0.0D);
         tessellator.func_78374_a((double)l, (double)l2, 0.0D, 0.0D, 0.0D);
         tessellator.func_78381_a();
      }

      this.func_148142_b(p_148128_1_, p_148128_2_);
      GL11.glEnable(3553);
      GL11.glShadeModel(7424);
      GL11.glEnable(3008);
      GL11.glDisable(3042);
   }

   public void func_148143_b(boolean p_148143_1_) {
      this.field_148164_v = p_148143_1_;
   }

   public boolean func_148125_i() {
      return this.field_148164_v;
   }

   public int getListWidth() {
      return 220;
   }

   protected void drawSelectionBox(int p_148120_1_, int p_148120_2_, int p_148120_3_, int p_148120_4_) {
      int i1 = this.getSize();
      Tessellator tessellator = Tessellator.field_78398_a;

      for(int j1 = 0; j1 < i1; ++j1) {
         int k1 = p_148120_2_ + j1 * this.slotHeight + this.headerPadding;
         int l1 = this.slotHeight - 4;
         if (k1 <= this.bottom && k1 + l1 >= this.top) {
            if (this.showSelectionBox && this.isSelected(j1)) {
               int i2 = this.left + (this.width / 2 - this.getListWidth() / 2);
               int j2 = this.left + this.width / 2 + this.getListWidth() / 2;
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               GL11.glDisable(3553);
               tessellator.func_78382_b();
               tessellator.func_78378_d(8421504);
               tessellator.func_78374_a((double)i2, (double)(k1 + l1 + 2), 0.0D, 0.0D, 1.0D);
               tessellator.func_78374_a((double)j2, (double)(k1 + l1 + 2), 0.0D, 1.0D, 1.0D);
               tessellator.func_78374_a((double)j2, (double)(k1 - 2), 0.0D, 1.0D, 0.0D);
               tessellator.func_78374_a((double)i2, (double)(k1 - 2), 0.0D, 0.0D, 0.0D);
               tessellator.func_78378_d(0);
               tessellator.func_78374_a((double)(i2 + 1), (double)(k1 + l1 + 1), 0.0D, 0.0D, 1.0D);
               tessellator.func_78374_a((double)(j2 - 1), (double)(k1 + l1 + 1), 0.0D, 1.0D, 1.0D);
               tessellator.func_78374_a((double)(j2 - 1), (double)(k1 - 1), 0.0D, 1.0D, 0.0D);
               tessellator.func_78374_a((double)(i2 + 1), (double)(k1 - 1), 0.0D, 0.0D, 0.0D);
               tessellator.func_78381_a();
               GL11.glEnable(3553);
            }

            this.drawSlot(j1, p_148120_1_, k1, l1, tessellator, p_148120_3_, p_148120_4_);
         }
      }

   }

   protected int getScrollBarX() {
      return this.width / 2 + 124;
   }

   private void overlayBackground(int p_148136_1_, int p_148136_2_, int p_148136_3_, int p_148136_4_) {
      Tessellator tessellator = Tessellator.field_78398_a;
      this.mc.func_110434_K().func_110577_a(Gui.field_110325_k);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float f = 32.0F;
      tessellator.func_78382_b();
      tessellator.func_78384_a(4210752, p_148136_4_);
      tessellator.func_78374_a((double)this.left, (double)p_148136_2_, 0.0D, 0.0D, (double)((float)p_148136_2_ / f));
      tessellator.func_78374_a((double)(this.left + this.width * 2), (double)p_148136_2_, 0.0D, (double)((float)this.width * 2.0F / f), (double)((float)p_148136_2_ / f));
      tessellator.func_78384_a(4210752, p_148136_3_);
      tessellator.func_78374_a((double)(this.left + this.width * 2), (double)p_148136_1_, 0.0D, (double)((float)this.width * 2.0F / f), (double)((float)p_148136_1_ / f));
      tessellator.func_78374_a((double)this.left, (double)p_148136_1_, 0.0D, 0.0D, (double)((float)p_148136_1_ / f));
      tessellator.func_78381_a();
   }

   public void setSlotXBoundsFromLeft(int p_148140_1_) {
      this.left = p_148140_1_;
      this.right = p_148140_1_ + this.width;
   }

   public int getSlotHeight() {
      return this.slotHeight;
   }

   protected void drawContainerBackground(Tessellator tessellator) {
   }
}