package animation.gobbob.mobends.client.gui;

import animation.gobbob.mobends.AnimatedEntity;
import animation.gobbob.mobends.MoBends;
import animation.gobbob.mobends.client.ClientProxy;
import animation.gobbob.mobends.pack.BendsAction;
import animation.gobbob.mobends.pack.BendsPack;
import animation.gobbob.mobends.pack.BendsTarget;
import animation.gobbob.mobends.pack.BendsVar;
import animation.gobbob.mobends.settings.SettingsBoolean;
import animation.gobbob.mobends.settings.SettingsNode;
import animation.gobbob.mobends.util.Color;
import animation.gobbob.mobends.util.Draw;
import animation.gobbob.mobends.util.EnumAxis;
import java.io.IOException;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.lang3.math.NumberUtils;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector2f;

public class GuiMBMenu extends GuiScreen {
   public static final ResourceLocation menuTitleTexture = new ResourceLocation("mobends", "textures/gui/menuTitle.png");
   public static final ResourceLocation displayBGTexture = new ResourceLocation("mobends", "textures/gui/displayBG.png");
   public static final ResourceLocation puzzle_animation = new ResourceLocation("mobends", "textures/gui/puzzle_animation.png");
   public static final ResourceLocation puzzle_model = new ResourceLocation("mobends", "textures/gui/puzzle_model.png");
   public static final ResourceLocation puzzle_action_set = new ResourceLocation("mobends", "textures/gui/puzzle_action_set.png");
   public static final ResourceLocation puzzle_action_add = new ResourceLocation("mobends", "textures/gui/puzzle_action_add.png");
   public static final ResourceLocation puzzle_action_substract = new ResourceLocation("mobends", "textures/gui/puzzle_action_substract.png");
   public static final ResourceLocation puzzle_action_multiply = new ResourceLocation("mobends", "textures/gui/puzzle_action_multiply.png");
   public static final ResourceLocation puzzle_mod = new ResourceLocation("mobends", "textures/gui/puzzle_mod.png");
   public static final ResourceLocation puzzle_add = new ResourceLocation("mobends", "textures/gui/puzzle_add.png");
   public static final ResourceLocation puzzle_delete = new ResourceLocation("mobends", "textures/gui/puzzle_delete.png");
   public static final ResourceLocation puzzle_rot = new ResourceLocation("mobends", "textures/gui/puzzle_rot.png");
   public static final ResourceLocation puzzle_scale = new ResourceLocation("mobends", "textures/gui/puzzle_scale.png");
   public static final ResourceLocation puzzle_prerot = new ResourceLocation("mobends", "textures/gui/puzzle_prerot.png");
   public static final ResourceLocation puzzle_mod_none = new ResourceLocation("mobends", "textures/gui/puzzle_mod_none.png");
   public static final ResourceLocation puzzle_mod_cos = new ResourceLocation("mobends", "textures/gui/puzzle_mod_cos.png");
   public static final ResourceLocation puzzle_mod_sin = new ResourceLocation("mobends", "textures/gui/puzzle_mod_sin.png");
   public static final ResourceLocation puzzle_mod_none_selected = new ResourceLocation("mobends", "textures/gui/puzzle_mod_none_selected.png");
   public static final ResourceLocation puzzle_mod_cos_selected = new ResourceLocation("mobends", "textures/gui/puzzle_mod_cos_selected.png");
   public static final ResourceLocation puzzle_mod_sin_selected = new ResourceLocation("mobends", "textures/gui/puzzle_mod_sin_selected.png");
   public static final ResourceLocation puzzle_calc_add = new ResourceLocation("mobends", "textures/gui/puzzle_calc_add.png");
   public static final ResourceLocation puzzle_calc_substract = new ResourceLocation("mobends", "textures/gui/puzzle_calc_substract.png");
   public static final ResourceLocation puzzle_calc_set = new ResourceLocation("mobends", "textures/gui/puzzle_calc_set.png");
   public static final ResourceLocation puzzle_calc_multiply = new ResourceLocation("mobends", "textures/gui/puzzle_calc_multiply.png");
   public static final ResourceLocation puzzle_calc_add_selected = new ResourceLocation("mobends", "textures/gui/puzzle_calc_add_selected.png");
   public static final ResourceLocation puzzle_calc_substract_selected = new ResourceLocation("mobends", "textures/gui/puzzle_calc_substract_selected.png");
   public static final ResourceLocation puzzle_calc_set_selected = new ResourceLocation("mobends", "textures/gui/puzzle_calc_set_selected.png");
   public static final ResourceLocation puzzle_calc_multiply_selected = new ResourceLocation("mobends", "textures/gui/puzzle_calc_multiply_selected.png");
   public float titleTransitionState = 0.0F;
   public boolean titleTransition = true;
   public float[] buttonPositions;
   public float buttonRevealState;
   public float leftBgState;
   public float presetWindowState;
   public float previewRotation;
   public boolean customizeWindow;
   public boolean settingsWindow;
   public boolean packsWindow;
   public int animatedEntityID;
   public int custom_currentAction;
   public int custom_currentChange;
   public float scroll_x;
   public float scroll_y;
   public boolean scrolling_x;
   public boolean scrolling_y;
   public GuiTextField custom_AnimationNameText;
   public GuiTextField custom_PackTitle;
   public GuiTextField custom_ModelNameText;
   public GuiTextField custom_CalcValueText;

   public GuiMBMenu() {
      this.buttonPositions = new float[AnimatedEntity.animatedEntities.length];
      this.buttonRevealState = 0.0F;
      this.leftBgState = 0.0F;
      this.presetWindowState = 0.0F;
      this.previewRotation = 0.0F;
      this.custom_currentAction = 0;
      this.custom_currentChange = 0;
      this.scroll_x = 0.0F;
      this.scroll_y = 0.0F;
      this.scrolling_x = false;
      this.scrolling_y = false;
      Keyboard.enableRepeatEvents(true);
      this.titleTransition = true;
      this.titleTransitionState = 0.0F;
   }

   public void func_73866_w_() {
      super.func_73866_w_();
      this.field_146292_n.clear();
      if (this.customizeWindow | this.settingsWindow | this.packsWindow) {
         this.field_146292_n.add(new GuiButton(0, this.packsWindow ? this.field_146294_l - 70 : 10, this.field_146295_m - 30, 60, 20, "Back"));
      }

      if (!this.customizeWindow & !this.settingsWindow & !this.packsWindow) {
         this.field_146292_n.add(new GuiButton(1, -90 + (int)(this.leftBgState * 100.0F), this.field_146295_m - 30, 60, 20, "Settings"));
         this.field_146292_n.add(new GuiButton(3, this.field_146294_l - (int)(this.leftBgState * 100.0F) + 30, this.field_146295_m - 30, 60, 20, "Packs"));
      }

      int i;
      if (this.settingsWindow) {
         for(i = 0; i < SettingsNode.settings.length; ++i) {
            if (SettingsNode.settings[i] instanceof SettingsBoolean) {
               this.field_146292_n.add((new GuiToggleButton(10 + i, (int)((float)this.field_146294_l + this.presetWindowState * -500.0F + 20.0F), 50 + i * 25, ((SettingsBoolean)SettingsNode.settings[i]).data)).setTitle(SettingsNode.settings[i].displayName, 100));
            }
         }
      }

      if (this.customizeWindow) {
         this.field_146292_n.add((new GuiToggleButton(2, (int)((float)this.field_146294_l + this.presetWindowState * -500.0F + 10.0F), 163, AnimatedEntity.animatedEntities[this.animatedEntityID].animate)).setTitle("Animate", 88));
         if (this.getCurrentAction() != null) {
            this.field_146292_n.add(new GuiButton(4, (int)(this.getModelSelectionLoc().x + this.getModelSelectionSize().x - 40.0F), (int)this.getModelSelectionLoc().y + 95, 20, 20, "+"));
            GuiButton var2 = new GuiButton(5, (int)(this.getModelSelectionLoc().x + this.getModelSelectionSize().x - 20.0F), (int)this.getModelSelectionLoc().y + 95, 20, 20, "-");
            var2.field_146124_l = this.getCurrentAction().calculations.size() > 0;
            this.field_146292_n.add(var2);
         }
      }

      for(i = 0; i < AnimatedEntity.animatedEntities.length; ++i) {
         this.field_146292_n.add(new GuiButton(100 + i, (int)(this.buttonPositions[i] - 80.0F + this.presetWindowState * -100.0F), 70 + i * 25, 80, 20, AnimatedEntity.animatedEntities[i].displayName));
      }

      if (this.custom_AnimationNameText == null) {
         this.custom_AnimationNameText = new GuiTextField(this.field_146289_q, (int)(this.getModelSelectionLoc().x + 5.0F), (int)(this.getModelSelectionLoc().y + 5.0F + 10.0F), (int)(this.getModelSelectionSize().x - 10.0F), 15);
         if (this.getCurrentAction() != null) {
            this.custom_AnimationNameText.func_146180_a(this.getCurrentAction().anim);
         }
      } else {
         this.custom_AnimationNameText.field_146209_f = (int)(this.getModelSelectionLoc().x + 5.0F);
         this.custom_AnimationNameText.field_146210_g = (int)(this.getModelSelectionLoc().y + 5.0F + 10.0F);
      }

      if (this.custom_ModelNameText == null) {
         this.custom_ModelNameText = new GuiTextField(this.field_146289_q, (int)(this.getModelSelectionLoc().x + 5.0F), (int)(this.getModelSelectionLoc().y + 5.0F + 10.0F + 15.0F + 5.0F + 10.0F), (int)(this.getModelSelectionSize().x - 10.0F), 15);
         if (this.getCurrentAction() != null) {
            this.custom_ModelNameText.func_146180_a(this.getCurrentAction().model);
         }
      } else {
         this.custom_ModelNameText.field_146209_f = (int)(this.getModelSelectionLoc().x + 5.0F);
         this.custom_ModelNameText.field_146210_g = (int)(this.getModelSelectionLoc().y + 5.0F + 10.0F + 15.0F + 5.0F + 10.0F);
      }

      if (this.custom_CalcValueText == null) {
         this.custom_CalcValueText = new GuiTextField(this.field_146289_q, (int)(this.getModelSelectionLoc().x + 5.0F), (int)(this.getModelSelectionLoc().y + 90.0F + 10.0F + 5.0F + 10.0F + 5.0F), (int)(this.getModelSelectionSize().x - 10.0F - 32.0F), 15);
         if (this.getCurrentAction() != null && this.getCurrentCalculation() != null) {
            this.custom_CalcValueText.func_146180_a(this.getCurrentCalculation().globalVar != null ? this.getCurrentCalculation().globalVar : String.valueOf(this.getCurrentCalculation().number));
         }

         this.custom_CalcValueText.func_146196_d();
      } else {
         this.custom_CalcValueText.field_146218_h = (int)(this.getModelSelectionSize().x - 10.0F - 32.0F);
         this.custom_CalcValueText.field_146209_f = (int)(this.getModelSelectionLoc().x + 5.0F + 32.0F);
         this.custom_CalcValueText.field_146210_g = (int)(this.getModelSelectionLoc().y + 90.0F + 10.0F + 5.0F + 10.0F + 5.0F);
      }

      if (this.custom_PackTitle == null) {
         this.custom_PackTitle = new GuiTextField(this.field_146289_q, (int)(this.getActionWindowX() + 5.0F), 38, 150, 14);
         if (BendsPack.currentPack == 0) {
            this.custom_PackTitle.func_146180_a("Default");
         } else {
            this.custom_PackTitle.func_146180_a(BendsPack.getCurrentPack().displayName);
         }

         this.custom_PackTitle.func_146196_d();
      } else {
         this.custom_PackTitle.field_146218_h = 150;
         this.custom_PackTitle.field_146219_i = 14;
         this.custom_PackTitle.field_146209_f = (int)(this.getActionWindowX() + 5.0F);
         this.custom_PackTitle.field_146210_g = 38;
      }

   }

   protected void func_73869_a(char par1, int par2) {
      switch(par2) {
      case 1:
         this.close();
      default:
         if (this.customizeWindow) {
            if (this.custom_AnimationNameText.func_146206_l()) {
               this.custom_AnimationNameText.func_146201_a(par1, par2);
               this.assignAnimationToCurrentAction(this.custom_AnimationNameText.func_146179_b());
            } else if (this.custom_ModelNameText.func_146206_l()) {
               this.custom_ModelNameText.func_146201_a(par1, par2);
               ((BendsAction)BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.get(this.custom_currentAction)).model = this.custom_ModelNameText.func_146179_b();
            } else if (this.custom_CalcValueText.func_146206_l()) {
               this.custom_CalcValueText.func_146201_a(par1, par2);
               this.assignCalcValue(this.custom_CalcValueText.func_146179_b());
            } else if (this.custom_PackTitle.func_146206_l()) {
               this.custom_PackTitle.func_146201_a(par1, par2);
               if (BendsPack.currentPack == 0) {
                  this.createANewPack(this.custom_PackTitle.func_146179_b());
               }

               BendsPack.getCurrentPack().displayName = this.custom_PackTitle.func_146179_b();
            }
         }

      }
   }

   public void close() {
      Minecraft.func_71410_x().func_147108_a((GuiScreen)null);
   }

   public void func_146281_b() {
      Keyboard.enableRepeatEvents(false);
      MoBends.saveConfig();
      if (BendsPack.currentPack != 0) {
         try {
            BendsPack.getCurrentPack().save();
         } catch (IOException var2) {
            var2.printStackTrace();
         }
      }

   }

   public void func_73876_c() {
      this.func_73866_w_();
      this.previewRotation += 2.0F;
      int mouseX = Mouse.getEventX() * this.field_146294_l / this.field_146297_k.field_71443_c;
      int mouseY = this.field_146295_m - Mouse.getEventY() * this.field_146295_m / this.field_146297_k.field_71440_d - 1;
      if (this.presetWindowState > 0.0F & this.customizeWindow) {
         this.custom_AnimationNameText.func_146178_a();
         this.custom_ModelNameText.func_146178_a();
         this.custom_CalcValueText.func_146178_a();
         this.custom_PackTitle.func_146178_a();
         if (mouseY > 60 & (float)mouseY < 60.0F + this.getActionWindowHeight()) {
            String varAnim = "";
            int displayIndex = 0;
            if (BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id) != null) {
               for(int i = 0; i < BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.size(); ++i) {
                  BendsAction action = (BendsAction)BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.get(i);
                  if (!action.anim.equalsIgnoreCase(varAnim)) {
                     if (displayIndex > 0) {
                        ++displayIndex;
                     }

                     varAnim = action.anim;
                     ++displayIndex;
                  }

                  if ((float)mouseX >= this.getActionWindowX() + 10.0F & (float)mouseY >= (float)(65 + displayIndex * 18) + this.getYScrollAmount() & (float)mouseY <= (float)(65 + displayIndex * 18 + 18) + this.getYScrollAmount()) {
                     if (action.visual_DeletePopUp < 1.0F) {
                        action.visual_DeletePopUp += 0.2F;
                     }
                  } else if (action.visual_DeletePopUp > 0.0F) {
                     action.visual_DeletePopUp -= 0.2F;
                  }

                  ++displayIndex;
               }

               ++displayIndex;
            }
         }
      }

      if (this.scrolling_y) {
         this.scroll_y = (float)(mouseY - 60) / this.getActionWindowHeight() * (this.getActualActionWindowHeight() / this.getActionWindowHeight());
         if (this.scroll_y > 1.0F) {
            this.scroll_y = 1.0F;
         }

         if (this.scroll_y < 0.0F) {
            this.scroll_y = 0.0F;
         }
      }

      if (!Mouse.isButtonDown(0)) {
         this.scrolling_x = false;
         this.scrolling_y = false;
      }

   }

   protected void func_73864_a(int x, int y, int p_73864_3_) {
      if (this.packsWindow) {
         for(int varAnim = 0; varAnim < BendsPack.bendsPacks.size(); ++varAnim) {
            if ((float)x > (float)this.field_146294_l + this.presetWindowState * -250.0F + 10.0F & (float)x < (float)this.field_146294_l + this.presetWindowState * -250.0F + 10.0F + 200.0F & y > varAnim * 70 + 30 & y < varAnim * 70 + 30 + 64) {
               if (varAnim != BendsPack.currentPack && BendsPack.currentPack != 0) {
                  try {
                     BendsPack.getCurrentPack().save();
                  } catch (IOException var12) {
                     var12.printStackTrace();
                  }
               }

               BendsPack.currentPack = varAnim;
               this.custom_PackTitle.func_146180_a(BendsPack.getCurrentPack().displayName);

               try {
                  BendsPack.getCurrentPack().apply();
               } catch (IOException var11) {
                  var11.printStackTrace();
               }
            }
         }
      }

      if (this.presetWindowState > 0.0F & this.customizeWindow) {
         this.custom_AnimationNameText.func_146192_a(x, y, p_73864_3_);
         this.custom_ModelNameText.func_146192_a(x, y, p_73864_3_);
         this.custom_PackTitle.func_146192_a(x, y, p_73864_3_);
         if (this.getActualActionWindowHeight() > this.getActionWindowHeight() && (float)x > this.getActionWindowX() + 500.0F - 128.0F - 20.0F - 10.0F & (float)x < this.getActionWindowX() + 500.0F - 128.0F - 20.0F - 10.0F + 10.0F & y > 60 & (float)y < 60.0F + this.getActionWindowHeight()) {
            this.scrolling_y = true;
         }

         if (this.getCurrentAction() != null) {
            if (y > this.custom_ModelNameText.field_146210_g + 15 + 5 + 10 & y < this.custom_ModelNameText.field_146210_g + 15 + 5 + 10 + 10) {
               if ((float)x > this.getModelSelectionLoc().x + 5.0F & (float)x < this.getModelSelectionLoc().x + 5.0F + 18.0F) {
                  this.getCurrentAction().mod = null;
               }

               if ((float)x > this.getModelSelectionLoc().x + 5.0F + 18.0F & (float)x < this.getModelSelectionLoc().x + 5.0F + 36.0F) {
                  this.getCurrentAction().mod = BendsAction.EnumModifier.COS;
               }

               if ((float)x > this.getModelSelectionLoc().x + 5.0F + 36.0F & (float)x < this.getModelSelectionLoc().x + 5.0F + 54.0F) {
                  this.getCurrentAction().mod = BendsAction.EnumModifier.SIN;
               }
            }

            if (this.getCurrentCalculation() != null) {
               if (y > this.custom_ModelNameText.field_146210_g + 60 & y < this.custom_ModelNameText.field_146210_g + 60 + 10) {
                  if ((float)x > this.getModelSelectionLoc().x + 5.0F & (float)x < this.getModelSelectionLoc().x + 5.0F + 10.0F) {
                     this.getCurrentCalculation().operator = BendsAction.EnumOperator.ADD;
                  }

                  if ((float)x > this.getModelSelectionLoc().x + 5.0F + 10.0F & (float)x < this.getModelSelectionLoc().x + 5.0F + 20.0F) {
                     this.getCurrentCalculation().operator = BendsAction.EnumOperator.SUBSTRACT;
                  }

                  if ((float)x > this.getModelSelectionLoc().x + 5.0F + 20.0F & (float)x < this.getModelSelectionLoc().x + 5.0F + 30.0F) {
                     this.getCurrentCalculation().operator = BendsAction.EnumOperator.MULTIPLY;
                  }

                  if ((float)x > this.getModelSelectionLoc().x + 5.0F + 30.0F & (float)x < this.getModelSelectionLoc().x + 5.0F + 40.0F) {
                     this.getCurrentCalculation().operator = BendsAction.EnumOperator.SET;
                  }
               }

               this.custom_CalcValueText.func_146192_a(x, y, p_73864_3_);
            }
         }

         if ((BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id) == null || BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.size() <= 0) && (float)x >= this.getActionWindowX() & (float)x <= this.getActionWindowX() + 16.0F & (float)y >= 65.0F + this.getYScrollAmount() & (float)y <= 65.0F + this.getYScrollAmount() + 16.0F) {
            if (BendsPack.currentPack == 0) {
               this.createANewPack("Untitled");
            }

            this.addNewDefaultAction("all");
         }

         if (y > 60 & (float)y < 60.0F + this.getActionWindowHeight()) {
            String var12 = "";
            int displayIndex = 0;
            if (BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id) != null) {
               for(int i = 0; i < BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.size(); ++i) {
                  BendsAction action = (BendsAction)BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.get(i);
                  if (!action.anim.equalsIgnoreCase(var12)) {
                     if (displayIndex > 0) {
                        if ((float)x >= this.getActionWindowX() + 10.0F & (float)x <= this.getActionWindowX() + 10.0F + 16.0F & (float)y >= (float)(65 + displayIndex * 18) + this.getYScrollAmount() & (float)y <= (float)(65 + displayIndex * 18) + this.getYScrollAmount() + 16.0F) {
                           this.addNewDefaultAction(var12);
                        }

                        ++displayIndex;
                     }

                     var12 = action.anim;
                     ++displayIndex;
                  }

                  if (action != null && (float)x > this.getActionWindowX() + 10.0F & (float)y > (float)(65 + displayIndex * 18) + this.getYScrollAmount() & (float)y < (float)(65 + displayIndex * 18 + 16) + this.getYScrollAmount()) {
                     if ((float)x > this.getActionWindowX() + 10.0F & (float)x < this.getActionWindowX() + 10.0F + 20.0F) {
                        if (action.prop == BendsAction.EnumBoxProperty.PREROT) {
                           action.prop = BendsAction.EnumBoxProperty.ROT;
                        } else if (action.prop == BendsAction.EnumBoxProperty.ROT) {
                           action.prop = BendsAction.EnumBoxProperty.SCALE;
                        } else if (action.prop == BendsAction.EnumBoxProperty.SCALE) {
                           action.prop = BendsAction.EnumBoxProperty.PREROT;
                        }
                     }

                     if ((float)x > this.getActionWindowX() + 10.0F + 20.0F & (float)x < this.getActionWindowX() + 10.0F + 31.0F) {
                        if (action.axis == null) {
                           action.axis = EnumAxis.X;
                        } else if (action.axis == EnumAxis.X) {
                           action.axis = EnumAxis.Y;
                        } else if (action.axis == EnumAxis.Y) {
                           action.axis = EnumAxis.Z;
                        } else if (action.axis == EnumAxis.Z) {
                           action.axis = null;
                        }
                     }

                     this.custom_currentAction = i;
                     this.custom_currentChange = 0;
                     this.custom_AnimationNameText.func_146180_a(((BendsAction)BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.get(this.custom_currentAction)).anim);
                     this.custom_ModelNameText.func_146180_a(((BendsAction)BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.get(this.custom_currentAction)).model);
                     if (this.getCurrentCalculation() != null) {
                        this.custom_CalcValueText.func_146180_a(this.getCurrentCalculation().globalVar != null ? this.getCurrentCalculation().globalVar : String.valueOf(this.getCurrentCalculation().number));
                        this.custom_CalcValueText.func_146196_d();
                     }

                     for(int s = 0; s < action.calculations.size(); ++s) {
                        BendsAction.Calculation calculation = (BendsAction.Calculation)action.calculations.get(s);
                        ResourceLocation var10001 = calculation.operator == BendsAction.EnumOperator.ADD ? puzzle_action_add : (calculation.operator == BendsAction.EnumOperator.SUBSTRACT ? puzzle_action_substract : (calculation.operator == BendsAction.EnumOperator.SET ? puzzle_action_set : puzzle_action_multiply));
                        Minecraft.func_71410_x().field_71446_o.func_110577_a(var10001);
                        if ((float)x > this.getActionWindowX() + 10.0F + 31.0F + 64.0F - 7.0F + (float)(action.mod != null ? 25 : 0) + (float)(s * 57) & (float)x < this.getActionWindowX() + 10.0F + 31.0F + 64.0F - 7.0F + (float)(action.mod != null ? 25 : 0) + (float)(s * 57) + 64.0F - 7.0F) {
                           this.custom_currentChange = s;
                           this.custom_CalcValueText.func_146180_a(this.getCurrentCalculation().globalVar != null ? this.getCurrentCalculation().globalVar : String.valueOf(this.getCurrentCalculation().number));
                           this.custom_CalcValueText.func_146196_d();
                        }
                     }

                     if ((float)x > this.getActionWindowX() + 10.0F + 31.0F + 64.0F - 7.0F + (float)(action.mod != null ? 25 : 0) + (float)(action.calculations.size() * 57) & (float)x < this.getActionWindowX() + 10.0F + 31.0F + 64.0F - 7.0F + (float)(action.mod != null ? 25 : 0) + (float)(action.calculations.size() * 57) + 32.0F) {
                        BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.remove(i);
                        if (i <= this.custom_currentAction && this.custom_currentAction > 0) {
                           --this.custom_currentAction;
                        }

                        --i;
                     }
                  }

                  ++displayIndex;
               }

               if ((float)x >= this.getActionWindowX() + 10.0F & (float)x <= this.getActionWindowX() + 10.0F + 16.0F & (float)y >= (float)(65 + displayIndex * 18) + this.getYScrollAmount() & (float)y <= (float)(65 + displayIndex * 18) + this.getYScrollAmount() + 16.0F) {
                  this.addNewDefaultAction(var12);
               }

               ++displayIndex;
            }
         }
      }

      super.func_73864_a(x, y, p_73864_3_);
   }

   public void createANewPack(String string) {
      BendsPack newPack = new BendsPack();
      newPack.filename = null;
      newPack.displayName = string;
      newPack.author = Minecraft.func_71410_x().field_71439_g.func_70005_c_();
      newPack.description = "A custom pack made by " + Minecraft.func_71410_x().field_71439_g.func_70005_c_() + ".";
      BendsPack.bendsPacks.add(newPack);
      BendsPack.currentPack = BendsPack.bendsPacks.size() - 1;
      this.custom_PackTitle.func_146180_a(newPack.displayName);
   }

   protected void func_146284_a(GuiButton par1GuiButton) {
      if (par1GuiButton.field_146127_k >= 100) {
         this.animatedEntityID = par1GuiButton.field_146127_k - 100;
         this.customizeWindow = true;
      } else if (par1GuiButton.field_146127_k >= 10) {
         int s = 0;

         for(int i = 0; i < SettingsNode.settings.length; ++i) {
            if (SettingsNode.settings[i] instanceof SettingsBoolean) {
               if (s == par1GuiButton.field_146127_k - 10) {
                  ((SettingsBoolean)SettingsNode.settings[i]).data = !((SettingsBoolean)SettingsNode.settings[i]).data;
                  break;
               }

               ++s;
            }
         }
      }

      switch(par1GuiButton.field_146127_k) {
      case 0:
         this.customizeWindow = false;
         this.settingsWindow = false;
         this.packsWindow = false;
         break;
      case 1:
         this.settingsWindow = true;
         break;
      case 2:
         AnimatedEntity.animatedEntities[this.animatedEntityID].animate = !AnimatedEntity.animatedEntities[this.animatedEntityID].animate;
         break;
      case 3:
         this.packsWindow = true;
         break;
      case 4:
         this.getCurrentAction().calculations.add(new BendsAction.Calculation(BendsAction.EnumOperator.SET, 0.0F));
         this.custom_currentChange = this.getCurrentAction().calculations.size() - 1;
         break;
      case 5:
         this.getCurrentAction().calculations.remove(this.getCurrentCalculation());
         --this.custom_currentChange;
         if (this.custom_currentChange < 0) {
            this.custom_currentChange = 0;
         }
      }

   }

   public void func_73863_a(int par1, int par2, float par3) {
      GL11.glDisable(2896);
      GL11.glEnable(3042);
      float color;
      if (this.titleTransition) {
         this.titleTransitionState += (128.0F - this.titleTransitionState) / 5.0F;
      } else {
         this.titleTransitionState += (100.0F - this.titleTransitionState) / 7.0F;

         for(color = 0.0F; color < (float)this.buttonPositions.length; ++color) {
            if (this.buttonRevealState >= color / (float)this.buttonPositions.length) {
               this.buttonPositions[(int)color] += (90.0F - this.buttonPositions[(int)color]) / 4.0F;
            }
         }

         this.buttonRevealState += 0.05F;
         this.leftBgState += (1.0F - this.leftBgState) / 4.0F;
      }

      if (this.titleTransitionState > 126.0F) {
         this.titleTransition = false;
      }

      if (this.customizeWindow | this.settingsWindow | this.packsWindow) {
         this.presetWindowState += (1.0F - this.presetWindowState) / 4.0F;
      } else {
         this.presetWindowState += (0.0F - this.presetWindowState) / 4.0F;
      }

      GL11.glPushMatrix();
      Minecraft.func_71410_x().field_71446_o.func_110577_a(ClientProxy.texture_NULL);
      Draw.rectangle_xgradient(-this.leftBgState * -100.0F - 100.0F + this.presetWindowState * -100.0F, 0.0F, 100.0F, (float)this.field_146295_m, new Color(0.0F, 0.0F, 0.0F, 0.7F), new Color(0.0F, 0.0F, 0.0F, 0.3F));
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.5F);
      Draw.rectangle(-this.leftBgState * -105.0F - 105.0F + this.presetWindowState * -105.0F + 100.0F, 0.0F, 5.0F, (float)this.field_146295_m);
      GL11.glPopMatrix();
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      this.field_146297_k.field_71446_o.func_110577_a(menuTitleTexture);
      Draw.rectangle((float)(this.field_146294_l / 2 - 64) + this.presetWindowState * (float)(-this.field_146294_l / 2 + 80), this.titleTransitionState - 100.0F, 128.0F, 64.0F);
      if (this.presetWindowState > 0.0F) {
         GL11.glPushMatrix();
         Minecraft.func_71410_x().field_71446_o.func_110577_a(ClientProxy.texture_NULL);
         GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.5F);
         color = this.packsWindow ? 250.0F : 500.0F;
         Draw.rectangle((float)this.field_146294_l + this.presetWindowState * -color, 0.0F, color, 20.0F);
         Draw.rectangle((float)this.field_146294_l + this.presetWindowState * -color, 25.0F, color, (float)this.field_146295_m);
         GL11.glPopMatrix();
      }

      if (this.presetWindowState > 0.0F & this.customizeWindow) {
         this.displayCustomizeWindow();
      }

      String var10;
      if (this.presetWindowState > 0.0F & this.settingsWindow) {
         var10 = "Settings";
         this.func_73731_b(this.field_146289_q, var10, (int)((float)this.field_146294_l + this.presetWindowState * -500.0F + 250.0F - (float)(this.field_146289_q.func_78256_a(var10) / 2)), 5, 16777215);
      }

      int i;
      if (this.presetWindowState > 0.0F & this.packsWindow) {
         var10 = "Packs";
         this.func_73731_b(this.field_146289_q, var10, (int)((float)this.field_146294_l + this.presetWindowState * -250.0F + 125.0F - (float)(this.field_146289_q.func_78256_a(var10) / 2)), 5, 16777215);

         for(i = 0; i < BendsPack.bendsPacks.size(); ++i) {
            ArrayList text = new ArrayList();
            text.add("");
            int var1 = 0;
            int lineLength = 0;

            int s;
            for(s = 0; s < ((BendsPack)BendsPack.bendsPacks.get(i)).description.length(); ++lineLength) {
               text.set(var1, (String)text.get(var1) + ((BendsPack)BendsPack.bendsPacks.get(i)).description.charAt(s));
               if ((float)this.field_146289_q.func_78256_a((String)text.get(var1)) * 0.5F > 128.0F && ((BendsPack)BendsPack.bendsPacks.get(i)).description.charAt(s) == ' ') {
                  lineLength = 0;
                  ++var1;
                  text.add("");
               }

               ++s;
            }

            GL11.glPushMatrix();
            Minecraft.func_71410_x().field_71446_o.func_110577_a(ClientProxy.texture_NULL);
            GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.5F);
            if (i != BendsPack.currentPack) {
               Draw.rectangle((float)this.field_146294_l + this.presetWindowState * -250.0F + 10.0F, (float)(i * 70 + 30), 200.0F, 64.0F);
            } else {
               Draw.rectangle_xgradient((float)this.field_146294_l + this.presetWindowState * -250.0F + 10.0F, (float)(i * 70 + 30), 200.0F, 64.0F, new Color(0.0F, 0.0F, 0.0F, 0.5F), new Color(0.1F, 1.0F, 0.1F, 0.5F));
            }

            int var10003 = (int)((float)this.field_146294_l + this.presetWindowState * -250.0F + 10.0F) + 5;
            this.func_73731_b(this.field_146289_q, ((BendsPack)BendsPack.bendsPacks.get(i)).displayName, var10003, i * 70 + 30 + 5, 16777215);
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((int)((float)this.field_146294_l + this.presetWindowState * -250.0F + 10.0F) + 5), (float)(i * 70 + 30 + 5 + 10), 0.0F);
            GL11.glScalef(0.5F, 0.5F, 0.5F);
            this.func_73731_b(this.field_146289_q, "By " + ((BendsPack)BendsPack.bendsPacks.get(i)).author, 0, 0, 7829367);

            for(s = 0; s < text.size(); ++s) {
               this.func_73731_b(this.field_146289_q, (String)text.get(s), 0, 20 + s * 10, 16777215);
            }

            GL11.glPopMatrix();
            GL11.glPopMatrix();
         }
      }

      i = 47121212;
      super.func_73863_a(par1, par2, par3);
   }

   public void renderLivingEntity(int argX, int argY, int scale, EntityLivingBase par5EntityLivingBase) {
      GL11.glEnable(2903);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)argX, (float)argY, 50.0F);
      GL11.glScalef((float)(-scale), (float)scale, (float)scale);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(this.previewRotation, 0.0F, 1.0F, 0.0F);
      float f2 = par5EntityLivingBase.field_70761_aq;
      float f3 = par5EntityLivingBase.field_70177_z;
      float f4 = par5EntityLivingBase.field_70125_A;
      float f5 = par5EntityLivingBase.field_70758_at;
      float f6 = par5EntityLivingBase.field_70759_as;
      GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      RenderHelper.func_74519_b();
      GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
      par5EntityLivingBase.field_70761_aq = 0.0F;
      par5EntityLivingBase.field_70177_z = 0.0F;
      par5EntityLivingBase.field_70125_A = 0.0F;
      par5EntityLivingBase.field_70759_as = par5EntityLivingBase.field_70177_z;
      par5EntityLivingBase.field_70758_at = par5EntityLivingBase.field_70177_z;
      GL11.glTranslatef(0.0F, par5EntityLivingBase.field_70129_M, 0.0F);
      RenderManager.field_78727_a.field_78735_i = 180.0F;
      par5EntityLivingBase.field_70701_bs = 1.0F;
      RenderManager.field_78727_a.func_147940_a(par5EntityLivingBase, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
      par5EntityLivingBase.field_70761_aq = f2;
      par5EntityLivingBase.field_70177_z = f3;
      par5EntityLivingBase.field_70125_A = f4;
      par5EntityLivingBase.field_70758_at = f5;
      par5EntityLivingBase.field_70759_as = f6;
      GL11.glPopMatrix();
      RenderHelper.func_74518_a();
      GL11.glDisable(32826);
      OpenGlHelper.func_77473_a(OpenGlHelper.field_77476_b);
      GL11.glDisable(3553);
      OpenGlHelper.func_77473_a(OpenGlHelper.field_77478_a);
   }

   public boolean func_73868_f() {
      return true;
   }

   public void displayCustomizeWindow() {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      String title = "Animation Customization";
      this.func_73732_a(this.field_146289_q, title, (int)((float)this.field_146294_l + this.presetWindowState * -500.0F + 250.0F), 5, 16777215);
      GL11.glPushMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_146297_k.field_71446_o.func_110577_a(displayBGTexture);
      Draw.rectangle((float)this.field_146294_l + this.presetWindowState * -500.0F + 10.0F, 35.0F, 128.0F, 128.0F);
      GL11.glPopMatrix();
      if (AnimatedEntity.animatedEntities[this.animatedEntityID].id == "player") {
         this.renderLivingEntity((int)((float)this.field_146294_l + this.presetWindowState * -500.0F + 10.0F + 64.0F), 150, 50, Minecraft.func_71410_x().field_71439_g);
      } else {
         AnimatedEntity.animatedEntities[this.animatedEntityID].entity.field_70170_p = Minecraft.func_71410_x().field_71441_e;
         this.renderLivingEntity((int)((float)this.field_146294_l + this.presetWindowState * -500.0F + 10.0F + 64.0F), 150, 50, (EntityLivingBase)AnimatedEntity.animatedEntities[this.animatedEntityID].entity);
      }

      String warning = "* to see the changes after toggling the animations ON or OFF, restart your game.";
      this.func_73731_b(this.field_146289_q, warning, (int)((float)this.field_146294_l + this.presetWindowState * -500.0F + 20.0F), this.field_146295_m - 20, 16777215);
      GL11.glPushMatrix();
      Minecraft.func_71410_x().field_71446_o.func_110577_a(ClientProxy.texture_NULL);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.5F);
      Draw.rectangle(this.getModelSelectionLoc().x, this.getModelSelectionLoc().y, this.getModelSelectionSize().x, this.getModelSelectionSize().y);
      GL11.glPopMatrix();
      if (this.getCurrentAction() != null) {
         this.func_73731_b(this.field_146289_q, "Animation:", this.custom_AnimationNameText.field_146209_f, this.custom_AnimationNameText.field_146210_g - 10, 16777215);
         this.func_73731_b(this.field_146289_q, "Model:", this.custom_ModelNameText.field_146209_f, this.custom_ModelNameText.field_146210_g - 10, 16777215);
         this.func_73731_b(this.field_146289_q, "Modifier:", this.custom_ModelNameText.field_146209_f, this.custom_ModelNameText.field_146210_g - 10 + 15 + 5 + 10, 16777215);
         this.custom_AnimationNameText.func_146194_f();
         this.custom_ModelNameText.func_146194_f();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glPushMatrix();
         Minecraft.func_71410_x().field_71446_o.func_110577_a(this.getCurrentAction().mod == null ? puzzle_mod_none_selected : puzzle_mod_none);
         Draw.rectangle(this.getModelSelectionLoc().x + 5.0F, (float)(this.custom_ModelNameText.field_146210_g + 15 + 5 + 10), 32.0F, 16.0F);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         Minecraft.func_71410_x().field_71446_o.func_110577_a(this.getCurrentAction().mod == BendsAction.EnumModifier.COS ? puzzle_mod_cos_selected : puzzle_mod_cos);
         Draw.rectangle(this.getModelSelectionLoc().x + 5.0F + 18.0F, (float)(this.custom_ModelNameText.field_146210_g + 15 + 5 + 10), 32.0F, 16.0F);
         GL11.glPopMatrix();
         GL11.glPushMatrix();
         Minecraft.func_71410_x().field_71446_o.func_110577_a(this.getCurrentAction().mod == BendsAction.EnumModifier.SIN ? puzzle_mod_sin_selected : puzzle_mod_sin);
         Draw.rectangle(this.getModelSelectionLoc().x + 5.0F + 36.0F, (float)(this.custom_ModelNameText.field_146210_g + 15 + 5 + 10), 32.0F, 16.0F);
         GL11.glPopMatrix();
         this.func_73731_b(this.field_146289_q, "Calculation:", this.custom_ModelNameText.field_146209_f, this.custom_ModelNameText.field_146210_g - 10 + 60, 16777215);
         if (this.getCurrentCalculation() != null) {
            this.func_73731_b(this.field_146289_q, "Value:", this.custom_ModelNameText.field_146209_f, this.custom_ModelNameText.field_146210_g + 15 + 5 + 60 - 1, this.isValidCalcValue(this.custom_CalcValueText.func_146179_b()) ? 16777215 : 16711680);
            GL11.glPushMatrix();
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.getCurrentCalculation().operator == BendsAction.EnumOperator.ADD ? puzzle_calc_add_selected : puzzle_calc_add);
            Draw.rectangle(this.getModelSelectionLoc().x + 5.0F, (float)(this.custom_ModelNameText.field_146210_g + 60), 16.0F, 16.0F);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.getCurrentCalculation().operator == BendsAction.EnumOperator.SUBSTRACT ? puzzle_calc_substract_selected : puzzle_calc_substract);
            Draw.rectangle(this.getModelSelectionLoc().x + 5.0F + 10.0F, (float)(this.custom_ModelNameText.field_146210_g + 60), 16.0F, 16.0F);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.getCurrentCalculation().operator == BendsAction.EnumOperator.MULTIPLY ? puzzle_calc_multiply_selected : puzzle_calc_multiply);
            Draw.rectangle(this.getModelSelectionLoc().x + 5.0F + 20.0F, (float)(this.custom_ModelNameText.field_146210_g + 60), 16.0F, 16.0F);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.getCurrentCalculation().operator == BendsAction.EnumOperator.SET ? puzzle_calc_set_selected : puzzle_calc_set);
            Draw.rectangle(this.getModelSelectionLoc().x + 5.0F + 30.0F, (float)(this.custom_ModelNameText.field_146210_g + 60), 16.0F, 16.0F);
            GL11.glPopMatrix();
            this.custom_CalcValueText.func_146194_f();
         }
      }

      GL11.glPushMatrix();
      GL11.glEnable(3042);
      Minecraft.func_71410_x().field_71446_o.func_110577_a(ClientProxy.texture_NULL);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.7F);
      Draw.rectangle(this.getActionWindowX(), 35.0F, 342.0F, 20.0F);
      Draw.rectangle(this.getActionWindowX(), 60.0F, 342.0F, this.getActionWindowHeight());
      GL11.glPopMatrix();
      if (this.getActualActionWindowHeight() > this.getActionWindowHeight()) {
         GL11.glPushMatrix();
         Minecraft.func_71410_x().field_71446_o.func_110577_a(ClientProxy.texture_NULL);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         Draw.rectangle(this.getActionWindowX() + 500.0F - 128.0F - 20.0F - 10.0F, 60.0F + this.scroll_y * (this.getActualActionWindowHeight() - this.getActionWindowHeight()) * (this.getActionWindowHeight() / this.getActualActionWindowHeight()), 10.0F, this.getActionWindowHeight() * (this.getActionWindowHeight() / this.getActualActionWindowHeight()));
         GL11.glPopMatrix();
      }

      this.custom_PackTitle.func_146194_f();
      float scale = (float)(Minecraft.func_71410_x().field_71443_c / this.field_146294_l);
      GL11.glViewport((int)((float)Minecraft.func_71410_x().field_71443_c + (float)((int)(this.presetWindowState * -500.0F + 10.0F + 128.0F + 10.0F)) * scale), (int)(30.0F * scale), (int)(342.0F * scale), (int)((float)Minecraft.func_71410_x().field_71440_d + -90.0F * scale));
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho((double)((float)this.field_146294_l + this.presetWindowState * -500.0F + 10.0F + 128.0F + 10.0F), (double)((float)this.field_146294_l + this.presetWindowState * -500.0F + 10.0F + 128.0F + 10.0F + 500.0F - 128.0F - 20.0F - 10.0F), (double)(60 + this.field_146295_m - 25 - 40 - 25), 60.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      String varAnim = "";
      int displayIndex = 0;
      if (BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id) != null && BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.size() > 0) {
         for(int res = 0; res < BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.size(); ++res) {
            BendsAction action = (BendsAction)BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.get(res);
            if (!action.anim.equalsIgnoreCase(varAnim)) {
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               if (displayIndex > 0) {
                  Minecraft.func_71410_x().field_71446_o.func_110577_a(puzzle_add);
                  Draw.rectangle(this.getActionWindowX() + 10.0F, (float)(65 + displayIndex * 18) + this.getYScrollAmount(), 16.0F, 16.0F);
                  ++displayIndex;
               }

               Minecraft.func_71410_x().field_71446_o.func_110577_a(puzzle_animation);
               Draw.rectangle(this.getActionWindowX(), (float)(65 + displayIndex * 18) + this.getYScrollAmount(), 128.0F, 16.0F);
               this.func_73731_b(this.field_146289_q, action.anim, (int)(this.getActionWindowX() + 5.0F), (int)((float)(69 + displayIndex * 18) + this.getYScrollAmount()), 16777215);
               varAnim = action.anim;
               ++displayIndex;
            }

            if (this.custom_currentAction == res) {
               GL11.glPushMatrix();
               GL11.glTranslatef(0.0F, 0.0F, 0.0F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(ClientProxy.texture_NULL);
               Draw.rectangle_xgradient(this.getActionWindowX() + 10.0F - 5.0F, (float)(65 + displayIndex * 18) + this.getYScrollAmount() - 1.0F, (float)(88 + (action.mod != null ? 25 : 0) + action.calculations.size() * 57 - 16 - 16) + 23.0F * action.visual_DeletePopUp + 50.0F + 5.0F, 18.0F, new Color(1.0F, 0.7F, 0.2F, 0.2F), new Color(1.0F, 0.7F, 0.2F, 1.0F));
               GL11.glPopMatrix();
            }

            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            ResourceLocation var10001 = action.prop == BendsAction.EnumBoxProperty.ROT ? puzzle_rot : (action.prop == BendsAction.EnumBoxProperty.SCALE ? puzzle_scale : puzzle_prerot);
            Minecraft.func_71410_x().field_71446_o.func_110577_a(var10001);
            Draw.rectangle(this.getActionWindowX() + 10.0F, (float)(65 + displayIndex * 18) + this.getYScrollAmount(), 32.0F, 16.0F);
            if (action != null) {
               Minecraft.func_71410_x().field_71446_o.func_110577_a(puzzle_delete);
               Draw.rectangle(this.getActionWindowX() + 10.0F + 31.0F + 64.0F - 7.0F + (float)(action.mod != null ? 25 : 0) + (float)(action.calculations.size() * 57) - 16.0F - 16.0F + 23.0F * action.visual_DeletePopUp, (float)(65 + displayIndex * 18) + this.getYScrollAmount(), 32.0F, 16.0F);
               this.func_73731_b(this.field_146289_q, action.axis == EnumAxis.X ? "x" : (action.axis == EnumAxis.Y ? "y" : (action.axis == EnumAxis.Z ? "z" : "?")), (int)(this.getActionWindowX() + 10.0F + 22.0F), (int)((float)(69 + displayIndex * 18) + this.getYScrollAmount()), 16777215);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(puzzle_model);
               Draw.rectangle(this.getActionWindowX() + 10.0F + 31.0F, (float)(65 + displayIndex * 18) + this.getYScrollAmount(), 64.0F, 16.0F);
               this.func_73731_b(this.field_146289_q, action.model, (int)(this.getActionWindowX() + 5.0F + 10.0F + 31.0F), (int)((float)(69 + displayIndex * 18) + this.getYScrollAmount()), 16777215);
               if (action.mod != null) {
                  Minecraft.func_71410_x().field_71446_o.func_110577_a(puzzle_mod);
                  Draw.rectangle(this.getActionWindowX() + 10.0F + 31.0F + 64.0F - 7.0F, (float)(65 + displayIndex * 18) + this.getYScrollAmount(), 32.0F, 16.0F);
                  this.func_73731_b(this.field_146289_q, action.mod == BendsAction.EnumModifier.COS ? "cos" : "sin", (int)(this.getActionWindowX() + 10.0F + 31.0F + 64.0F - 7.0F + 5.0F), (int)((float)(69 + displayIndex * 18) + this.getYScrollAmount()), 16777215);
               }

               for(int s = 0; s < action.calculations.size(); ++s) {
                  BendsAction.Calculation calculation = (BendsAction.Calculation)action.calculations.get(s);
                  var10001 = calculation.operator == BendsAction.EnumOperator.ADD ? puzzle_action_add : (calculation.operator == BendsAction.EnumOperator.SUBSTRACT ? puzzle_action_substract : (calculation.operator == BendsAction.EnumOperator.SET ? puzzle_action_set : puzzle_action_multiply));
                  Minecraft.func_71410_x().field_71446_o.func_110577_a(var10001);
                  GL11.glPushMatrix();
                  if (this.custom_currentChange != s | this.custom_currentAction != res) {
                     GL11.glColor4f(0.7F, 0.7F, 0.7F, 1.0F);
                  } else {
                     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                  }

                  Draw.rectangle(this.getActionWindowX() + 10.0F + 31.0F + 64.0F - 7.0F + (float)(action.mod != null ? 25 : 0) + (float)(s * 57), (float)(65 + displayIndex * 18) + this.getYScrollAmount(), 64.0F, 16.0F);
                  GL11.glPopMatrix();
                  this.func_73731_b(this.field_146289_q, "" + (calculation.globalVar != null ? calculation.globalVar : calculation.number), (int)(this.getActionWindowX() + 10.0F + 31.0F + 64.0F - 7.0F + (float)(action.mod != null ? 25 : 0)) + s * 57 + 20, (int)((float)(69 + displayIndex * 18) + this.getYScrollAmount()), 16777215);
               }
            }

            ++displayIndex;
         }

         Minecraft.func_71410_x().field_71446_o.func_110577_a(puzzle_add);
         Draw.rectangle(this.getActionWindowX() + 10.0F, (float)(65 + displayIndex * 18) + this.getYScrollAmount(), 16.0F, 16.0F);
         ++displayIndex;
      } else {
         GL11.glPushMatrix();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         Minecraft.func_71410_x().field_71446_o.func_110577_a(puzzle_add);
         Draw.rectangle(this.getActionWindowX(), (float)(65 + displayIndex * 18) + this.getYScrollAmount(), 16.0F, 16.0F);
         GL11.glPopMatrix();
      }

      GL11.glViewport(0, 0, Minecraft.func_71410_x().field_71443_c, Minecraft.func_71410_x().field_71440_d);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      ScaledResolution var10 = new ScaledResolution(this.field_146297_k, Minecraft.func_71410_x().field_71443_c, Minecraft.func_71410_x().field_71440_d);
      GL11.glOrtho(0.0D, (double)var10.func_78326_a(), (double)var10.func_78328_b(), 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
   }

   public float getActualActionWindowHeight() {
      String varAnim = "";
      int displayIndex = 0;
      if (BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id) != null) {
         for(int i = 0; i < BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.size(); ++i) {
            BendsAction action = (BendsAction)BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.get(i);
            if (!action.anim.equalsIgnoreCase(varAnim)) {
               if (displayIndex > 0) {
                  ++displayIndex;
               }

               varAnim = action.anim;
               ++displayIndex;
            }

            ++displayIndex;
         }

         ++displayIndex;
      }

      ++displayIndex;
      return (float)(displayIndex * 18);
   }

   public float getActionWindowHeight() {
      return (float)(this.field_146295_m - 25 - 40 - 25);
   }

   public float getYScrollAmount() {
      return -this.scroll_y * (this.getActualActionWindowHeight() - this.getActionWindowHeight());
   }

   public float getActionWindowX() {
      return this.getPropertiesWindowX() + 10.0F + 128.0F + 10.0F + 5.0F;
   }

   public float getPropertiesWindowX() {
      return (float)this.field_146294_l + this.presetWindowState * -this.getPropertiesWindowWidth();
   }

   public float getPropertiesWindowWidth() {
      return this.packsWindow ? 250.0F : 500.0F;
   }

   public Vector2f getModelSelectionLoc() {
      return new Vector2f(this.getPropertiesWindowX() + 10.0F, 200.0F);
   }

   public Vector2f getModelSelectionSize() {
      return new Vector2f(128.0F, 200.0F);
   }

   public void assignAnimationToCurrentAction(String argAnim) {
      BendsTarget target = BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id);
      if (target != null) {
         BendsAction action = (BendsAction)target.actions.get(this.custom_currentAction);
         if (!argAnim.equalsIgnoreCase(action.anim)) {
            target.actions.remove(this.custom_currentAction);
            action.anim = argAnim;
            int newIndex = 0;
            ArrayList newActionList = new ArrayList();
            boolean done = false;
            boolean properAnim = false;

            for(int i = 0; i < target.actions.size(); ++i) {
               if (((BendsAction)target.actions.get(i)).anim.equalsIgnoreCase(argAnim)) {
                  properAnim = true;
               } else if (properAnim & !done) {
                  newActionList.add(action);
                  done = true;
                  newIndex = i;
               }

               newActionList.add(target.actions.get(i));
            }

            if (!done) {
               newActionList.add(action);
               newIndex = newActionList.size() - 1;
            }

            target.actions = newActionList;
            this.custom_currentAction = newIndex;
         }
      }

   }

   public boolean isValidCalcValue(String value) {
      return value == null | value.isEmpty() ? false : (NumberUtils.isNumber(value) ? true : BendsVar.getGlobalVar(value) != Float.POSITIVE_INFINITY);
   }

   public void assignCalcValue(String value) {
      if (this.isValidCalcValue(value)) {
         if (this.getCurrentCalculation() != null) {
            if (NumberUtils.isNumber(value)) {
               this.getCurrentCalculation().globalVar = null;
               System.out.println(value + " = " + Float.valueOf(value));
               this.getCurrentCalculation().number = Float.valueOf(value).floatValue();
            } else {
               this.getCurrentCalculation().globalVar = value;
            }
         }
      } else {
         this.getCurrentCalculation().globalVar = null;
         this.getCurrentCalculation().number = 0.0F;
      }

   }

   public BendsAction getCurrentAction() {
      return BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id) == null ? null : (this.custom_currentAction < BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.size() ? (BendsAction)BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.get(this.custom_currentAction) : null);
   }

   public BendsAction.Calculation getCurrentCalculation() {
      return this.getCurrentAction() != null && this.getCurrentAction().calculations.size() > 0 ? (BendsAction.Calculation)this.getCurrentAction().calculations.get(this.custom_currentChange) : null;
   }

   public void addNewDefaultAction(String argAnim) {
      if (BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id) == null) {
         BendsPack.targets.add(new BendsTarget(AnimatedEntity.animatedEntities[this.animatedEntityID].id));
      }

      BendsAction action = new BendsAction(argAnim, "", BendsAction.EnumBoxProperty.ROT, (EnumAxis)null, 0.3F, 1.0F);
      BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.add(action);
      this.custom_currentAction = BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.size() - 1;
      action.anim = "NULL";
      this.assignAnimationToCurrentAction(argAnim);
      if (this.custom_currentAction > 0) {
         action.model = ((BendsAction)BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.get(this.custom_currentAction - 1)).model;
         action.prop = ((BendsAction)BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.get(this.custom_currentAction - 1)).prop;
         action.axis = ((BendsAction)BendsPack.getTargetByID(AnimatedEntity.animatedEntities[this.animatedEntityID].id).actions.get(this.custom_currentAction - 1)).axis;
      }

   }
}
