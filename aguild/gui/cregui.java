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

public class cregui extends GuiScreen {
   EntityPlayer player = null;
   private static final ResourceLocation tex = new ResourceLocation("aguild:textures/gui/cregui.png");
   private static final ResourceLocation tex2 = new ResourceLocation("aguild:textures/gui/cregui2.png");
   private static final ResourceLocation tex3 = new ResourceLocation("aguild:textures/gui/cregui3.png");

   public cregui(EntityPlayer player) {
      this.player = player;
   }

   public void func_73866_w_() {
   }

   public void func_73863_a(int par1, int par2, float par3) {
      this.func_146276_q_();
      super.func_73863_a(par1, par2, par3);
      playerdata px = playerdata.get(this.player);
      this.field_146292_n.clear();
      String bt1 = "";
      if (!px.inguild) {
         bt1 = "§fสร้างกิล";
      } else if (!px.host) {
         bt1 = "§cออกกิล";
      } else {
         bt1 = "§cสลายกิล";
      }

      this.field_146292_n.add(new GuiButton(0, this.field_146294_l / 2 + 50, this.field_146295_m / 2 - 90, 60, 20, bt1));
      if (px.host) {
         if (px.inguild) {
            this.field_146292_n.add(new GuiButton(1, this.field_146294_l / 2 + 50, this.field_146295_m / 2 - 70, 60, 20, "§fเชิญสมาชิก"));
            this.field_146292_n.add(new GuiButton(11, this.field_146294_l / 2 + 50, this.field_146295_m / 2 - 50, 60, 20, "§fเซ็ตบ้านกิล"));
            this.field_146292_n.add(new GuiButton(12, this.field_146294_l / 2 + 50, this.field_146295_m / 2 - 30, 60, 20, "§fไปบ้านกิล"));
            this.field_146292_n.add(new GuiButton(50, this.field_146294_l / 2 + 50, this.field_146295_m / 2 - 10, 60, 20, "§fคลังกิล"));
            this.field_146292_n.add(new GuiButton(51, this.field_146294_l / 2 + 50, this.field_146295_m / 2 + 10, 60, 20, "§fบัฟกิล"));
            this.field_146292_n.add(new GuiButton(52, this.field_146294_l / 2 + 50, this.field_146295_m / 2 + 30, 60, 20, "§fกิลศัตรู"));
            this.field_146292_n.add(new GuiButton(53, this.field_146294_l / 2 + 50, this.field_146295_m / 2 + 50, 60, 20, "§fร้านค้ากิล"));
         }
      } else if (px.inguild) {
         this.field_146292_n.add(new GuiButton(12, this.field_146294_l / 2 + 50, this.field_146295_m / 2 - 70, 60, 20, "§fไปบ้านกิล"));
         this.field_146292_n.add(new GuiButton(50, this.field_146294_l / 2 + 50, this.field_146295_m / 2 - 50, 60, 20, "§fคลังกิล"));
         this.field_146292_n.add(new GuiButton(51, this.field_146294_l / 2 + 50, this.field_146295_m / 2 - 30, 60, 20, "§fบัฟกิล"));
         this.field_146292_n.add(new GuiButton(52, this.field_146294_l / 2 + 50, this.field_146295_m / 2 - 10, 60, 20, "§fกิลศัตรู"));
      }

      if (px.page == 1 || px.page == 2) {
         this.field_146292_n.add(new GuiButton(39, this.field_146294_l / 2 - 85, this.field_146295_m / 2 + 104, 35, 10, "§f<--"));
      }

      if (px.page == 1 || px.page == 0) {
         this.field_146292_n.add(new GuiButton(40, this.field_146294_l / 2 - 7, this.field_146295_m / 2 + 104, 35, 10, "§f-->"));
      }

      this.field_146289_q.func_78276_b("§aPage " + (px.page + 1), this.field_146294_l / 2 - 45, this.field_146295_m / 2 + 105, 0);
      if (!px.inguild) {
         this.field_146289_q.func_78276_b("§4No Guild", this.field_146294_l / 2 - 50, this.field_146295_m / 2 - 85, 0);
         this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 68, 0);
         this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 52, 0);
         this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 35, 0);
         this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 18, 0);
         this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 1, 0);
         this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16, 0);
         this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 17, 0);
         this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 34, 0);
         this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 51, 0);
         this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 68, 0);
      } else {
         this.field_146289_q.func_78276_b("§9" + px.guildname, this.field_146294_l / 2 - 50, this.field_146295_m / 2 - 85, 0);
         if (px.page == 0) {
            this.field_146289_q.func_78276_b("§3" + px.ghost, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 68, 0);
            if (px.mem01.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 52, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem01, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 52, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(2, this.field_146294_l / 2 + 10, this.field_146295_m / 2 - 52, 15, 10, "§c-"));
               }
            }

            if (px.mem02.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 35, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem02, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 35, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(3, this.field_146294_l / 2 + 10, this.field_146295_m / 2 - 35, 15, 10, "§c-"));
               }
            }

            if (px.mem03.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 18, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem03, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 18, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(4, this.field_146294_l / 2 + 10, this.field_146295_m / 2 - 18, 15, 10, "§c-"));
               }
            }

            if (px.mem04.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 1, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem04, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 1, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(5, this.field_146294_l / 2 + 10, this.field_146295_m / 2 - 1, 15, 10, "§c-"));
               }
            }

            if (px.mem05.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem05, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(6, this.field_146294_l / 2 + 10, this.field_146295_m / 2 + 16, 15, 10, "§c-"));
               }
            }

            if (px.mem06.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 17, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem06, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 17, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(7, this.field_146294_l / 2 + 10, this.field_146295_m / 2 + 16 + 17, 15, 10, "§c-"));
               }
            }

            if (px.mem07.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 34, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem07, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 34, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(8, this.field_146294_l / 2 + 10, this.field_146295_m / 2 + 16 + 34, 15, 10, "§c-"));
               }
            }

            if (px.mem08.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 51, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem08, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 51, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(9, this.field_146294_l / 2 + 10, this.field_146295_m / 2 + 16 + 51, 15, 10, "§c-"));
               }
            }

            if (px.mem09.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 68, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem09, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 68, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(10, this.field_146294_l / 2 + 10, this.field_146295_m / 2 + 16 + 68, 15, 10, "§c-"));
               }
            }
         } else if (px.page == 1) {
            if (px.mem10.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 68, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem10, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 68, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(17, this.field_146294_l / 2 + 10, this.field_146295_m / 2 - 68, 15, 10, "§c-"));
               }
            }

            if (px.mem11.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 52, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem11, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 52, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(18, this.field_146294_l / 2 + 10, this.field_146295_m / 2 - 52, 15, 10, "§c-"));
               }
            }

            if (px.mem12.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 35, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem12, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 35, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(19, this.field_146294_l / 2 + 10, this.field_146295_m / 2 - 35, 15, 10, "§c-"));
               }
            }

            if (px.mem13.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 18, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem13, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 18, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(20, this.field_146294_l / 2 + 10, this.field_146295_m / 2 - 18, 15, 10, "§c-"));
               }
            }

            if (px.mem14.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 1, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem14, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 1, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(21, this.field_146294_l / 2 + 10, this.field_146295_m / 2 - 1, 15, 10, "§c-"));
               }
            }

            if (px.mem15.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem15, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(22, this.field_146294_l / 2 + 10, this.field_146295_m / 2 + 16, 15, 10, "§c-"));
               }
            }

            if (px.mem16.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 17, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem16, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 17, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(23, this.field_146294_l / 2 + 10, this.field_146295_m / 2 + 16 + 17, 15, 10, "§c-"));
               }
            }

            if (px.mem17.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 34, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem17, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 34, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(24, this.field_146294_l / 2 + 10, this.field_146295_m / 2 + 16 + 34, 15, 10, "§c-"));
               }
            }

            if (px.mem18.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 51, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem18, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 51, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(25, this.field_146294_l / 2 + 10, this.field_146295_m / 2 + 16 + 51, 15, 10, "§c-"));
               }
            }

            if (px.mem19.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 68, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem19, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 68, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(26, this.field_146294_l / 2 + 10, this.field_146295_m / 2 + 16 + 68, 15, 10, "§c-"));
               }
            }
         } else if (px.page == 2) {
            if (px.mem20.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 68, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem20, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 68, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(27, this.field_146294_l / 2 + 10, this.field_146295_m / 2 - 68, 15, 10, "§c-"));
               }
            }

            if (px.mem21.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 52, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem21, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 52, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(28, this.field_146294_l / 2 + 10, this.field_146295_m / 2 - 52, 15, 10, "§c-"));
               }
            }

            if (px.mem22.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 35, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem22, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 35, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(29, this.field_146294_l / 2 + 10, this.field_146295_m / 2 - 35, 15, 10, "§c-"));
               }
            }

            if (px.mem23.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 18, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem23, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 18, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(30, this.field_146294_l / 2 + 10, this.field_146295_m / 2 - 18, 15, 10, "§c-"));
               }
            }

            if (px.mem24.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 1, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem24, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 1, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(31, this.field_146294_l / 2 + 10, this.field_146295_m / 2 - 1, 15, 10, "§c-"));
               }
            }

            if (px.mem25.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem25, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(32, this.field_146294_l / 2 + 10, this.field_146295_m / 2 + 16, 15, 10, "§c-"));
               }
            }

            if (px.mem26.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 17, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem26, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 17, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(33, this.field_146294_l / 2 + 10, this.field_146295_m / 2 + 16 + 17, 15, 10, "§c-"));
               }
            }

            if (px.mem27.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 34, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem27, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 34, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(34, this.field_146294_l / 2 + 10, this.field_146295_m / 2 + 16 + 34, 15, 10, "§c-"));
               }
            }

            if (px.mem28.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 51, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem28, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 51, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(35, this.field_146294_l / 2 + 10, this.field_146295_m / 2 + 16 + 51, 15, 10, "§c-"));
               }
            }

            if (px.mem29.equalsIgnoreCase("")) {
               this.field_146289_q.func_78276_b("§0ว่าง", this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 68, 0);
            } else {
               this.field_146289_q.func_78276_b("§3" + px.mem29, this.field_146294_l / 2 - 65, this.field_146295_m / 2 + 16 + 68, 0);
               if (px.host) {
                  this.field_146292_n.add(new GuiButton(36, this.field_146294_l / 2 + 10, this.field_146295_m / 2 + 16 + 68, 15, 10, "§c-"));
               }
            }
         }
      }

   }

   public void func_146276_q_() {
      this.func_146270_b(0);
      playerdata px = playerdata.get(this.player);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      if (px.page == 0) {
         this.field_146297_k.func_110434_K().func_110577_a(tex);
      } else if (px.page == 1) {
         this.field_146297_k.func_110434_K().func_110577_a(tex2);
      } else if (px.page == 2) {
         this.field_146297_k.func_110434_K().func_110577_a(tex3);
      } else {
         this.field_146297_k.func_110434_K().func_110577_a(tex);
      }

      this.func_73729_b(this.field_146294_l / 2 - 110, this.field_146295_m / 2 - 125, 0, 0, 200, 240);
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
      playerdata px = playerdata.get(this.player);
      if (button.field_146127_k == 0) {
         if (!px.inguild) {
            this.player.openGui(mod.instance, 3, this.player.field_70170_p, (int)this.player.field_70165_t, (int)this.player.field_70163_u, (int)this.player.field_70161_v);
         } else {
            mod.network.sendToServer(new packetclick(1, "", 0));
         }
      } else if (button.field_146127_k == 1) {
         this.player.openGui(mod.instance, 4, this.player.field_70170_p, (int)this.player.field_70165_t, (int)this.player.field_70163_u, (int)this.player.field_70161_v);
      } else if (button.field_146127_k >= 1 && button.field_146127_k <= 10) {
         mod.network.sendToServer(new packetclick(button.field_146127_k + 6, "", 0));
      } else if (button.field_146127_k == 11) {
         this.player.func_71053_j();
         mod.network.sendToServer(new packetclick(17, "", 0));
      } else if (button.field_146127_k == 12) {
         this.player.func_71053_j();
         mod.network.sendToServer(new packetclick(18, "", 0));
      } else if (button.field_146127_k >= 17 && button.field_146127_k <= 36) {
         mod.network.sendToServer(new packetclick(button.field_146127_k + 6, "", 0));
      } else if (button.field_146127_k == 39) {
         mod.network.sendToServer(new packetclick(39, "", 0));
      } else if (button.field_146127_k == 40) {
         mod.network.sendToServer(new packetclick(40, "", 0));
      } else if (button.field_146127_k == 50) {
         this.player.func_71053_j();
         mod.network.sendToServer(new packetclick(50, "", 0));
      } else if (button.field_146127_k == 51) {
         this.player.func_71053_j();
         this.player.openGui(mod.instance, 7, this.player.field_70170_p, (int)this.player.field_70165_t, (int)this.player.field_70163_u, (int)this.player.field_70161_v);
      } else if (button.field_146127_k == 52) {
         this.player.func_71053_j();
         this.player.openGui(mod.instance, 8, this.player.field_70170_p, (int)this.player.field_70165_t, (int)this.player.field_70163_u, (int)this.player.field_70161_v);
      } else if (button.field_146127_k == 53) {
         mod.network.sendToServer(new packetclick(5, "", 0));
         this.player.func_71053_j();
         mod.network.sendToServer(new packetclick(61, "", 0));
      }

   }
}
