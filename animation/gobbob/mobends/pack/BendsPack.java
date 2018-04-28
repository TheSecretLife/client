package animation.gobbob.mobends.pack;

import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsPlayer;
import animation.gobbob.mobends.client.model.entity.ModelBendsSpider;
import animation.gobbob.mobends.client.model.entity.ModelBendsZombie;
import animation.gobbob.mobends.util.BendsLogger;
import animation.gobbob.mobends.util.EnumAxis;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.config.Configuration;

public class BendsPack {
   public static File bendsPacksDir;
   public static List bendsPacks = new ArrayList();
   public static int currentPack = 0;
   public String filename;
   public String displayName;
   public String author;
   public String description;
   public static List targets = new ArrayList();

   public void readBasicInfo(File file) throws IOException {
      this.filename = file.getName();
      BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()));

      for(String line = reader.readLine(); line != null; line = reader.readLine()) {
         BendsLogger.log(line, BendsLogger.DEBUG);
         if (line.startsWith("name:")) {
            this.displayName = formatStringData("name:", line);
         } else if (line.startsWith("author:")) {
            this.author = formatStringData("author:", line);
         } else if (line.startsWith("description:")) {
            this.description = formatStringData("description:", line);
         }
      }

      reader.close();
   }

   public void apply() throws IOException {
      if (this.filename == null) {
         targets.clear();
      } else {
         File file = new File(bendsPacksDir, this.filename);
         BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()));
         targets.clear();
         boolean override = false;
         String anim = "";

         for(String line = reader.readLine(); line != null; line = reader.readLine()) {
            if (line.startsWith("target")) {
               String i = formatStringData("target", line);
               targets.add(new BendsTarget(i.toLowerCase()));
               override = false;
            } else if (line.contains("anim")) {
               anim = formatStringData("anim", line);
            } else if (line.contains("override: true")) {
               override = true;
            } else if (line.contains("override: false")) {
               override = false;
            } else if (line.contains("@") && targets.size() > 0) {
               ((BendsTarget)targets.get(targets.size() - 1)).actions.add(getActionFromLine(anim, line));
            }
         }

         reader.close();

         for(int var10 = 0; var10 < targets.size(); ++var10) {
            System.out.println("Target: " + ((BendsTarget)targets.get(var10)).mob);

            for(int a = 0; a < ((BendsTarget)targets.get(var10)).actions.size(); ++a) {
               System.out.println("    Action: " + ((BendsAction)((BendsTarget)targets.get(var10)).actions.get(a)).anim + ", " + ((BendsAction)((BendsTarget)targets.get(var10)).actions.get(a)).model + ", " + ((BendsAction)((BendsTarget)targets.get(var10)).actions.get(a)).prop.name() + "-" + (((BendsAction)((BendsTarget)targets.get(var10)).actions.get(a)).axis != null ? ((BendsAction)((BendsTarget)targets.get(var10)).actions.get(a)).axis.name() : "null") + (((BendsAction)((BendsTarget)targets.get(var10)).actions.get(a)).mod != null ? ((BendsAction)((BendsTarget)targets.get(var10)).actions.get(a)).mod.name() : "null"));

               for(int c = 0; c < ((BendsAction)((BendsTarget)targets.get(var10)).actions.get(a)).calculations.size(); ++c) {
                  BendsAction.Calculation calc = (BendsAction.Calculation)((BendsAction)((BendsTarget)targets.get(var10)).actions.get(a)).calculations.get(c);
                  System.out.println("        Calc: " + calc.operator.name() + ", " + (calc.globalVar != null ? calc.globalVar : calc.number) + ", ");
               }
            }
         }
      }

   }

   public static void preInit(Configuration config) {
      bendsPacksDir = new File(Minecraft.func_71410_x().field_71412_D, "bendspacks");
      bendsPacksDir.mkdir();
      currentPack = config.get("General", "Current Pack", 0).getInt();

      try {
         initPacks();
         if (getCurrentPack() != null) {
            getCurrentPack().apply();
         }
      } catch (IOException var2) {
         var2.printStackTrace();
      }

   }

   public static void initPacks() throws IOException {
      File[] files = bendsPacksDir.listFiles();
      bendsPacks.clear();
      bendsPacks.add(getDefaultPack());
      File[] arr$ = files;
      int len$ = files.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         File file = arr$[i$];
         if (file.getAbsolutePath().endsWith(".bends")) {
            BendsLogger.log(file.getAbsolutePath(), BendsLogger.DEBUG);
            BendsPack pack = new BendsPack();
            pack.readBasicInfo(file);
            if (pack.filename != null & pack.displayName != null) {
               bendsPacks.add(pack);
            }
         }
      }

      if (currentPack > bendsPacks.size() - 1) {
         currentPack = bendsPacks.size() - 1;
      }

   }

   public static BendsPack getDefaultPack() {
      BendsPack defaultPack = new BendsPack();
      defaultPack.filename = null;
      defaultPack.displayName = "Default";
      defaultPack.author = "GoblinBob";
      defaultPack.description = "The default bends-pack suggested and made by GoblinBob, the creator of Mo' Bends.";
      return defaultPack;
   }

   public static String formatStringData(String header, String data) {
      data = data.replaceFirst(header, "");
      if (data.contains("\"")) {
         data = data.replaceAll("\"", "");
      }

      if (data.contains("{")) {
         data = data.replace("{", "");
      }

      data = data.trim();
      return data;
   }

   public static BendsPack getCurrentPack() {
      if (currentPack > bendsPacks.size() - 1) {
         currentPack = bendsPacks.size() - 1;
      }

      return (BendsPack)bendsPacks.get(currentPack);
   }

   public static BendsAction getActionFromLine(String anim, String line) {
      BendsAction action = new BendsAction();
      action.anim = anim;
      action.model = "";
      ArrayList calcs = new ArrayList();
      class Operation {
         public String operator = "";
         public String num = "";
         public String globalVar = null;
      }

      calcs.add(new Operation());
      int calc = 0;
      String smooth = "";
      int stage = 0;

      int i;
      for(i = 0; i < line.length(); ++i) {
         if (stage == 0) {
            if (line.charAt(i) == '@') {
               stage = 1;
            }
         } else if (stage == 1) {
            if (line.charAt(i) == ':') {
               ++stage;
            } else {
               action.model = action.model + line.charAt(i);
            }
         } else if (stage == 2) {
            if (line.charAt(i) == ' ') {
               ++stage;
            }
         } else {
            StringBuilder var10000;
            Operation var10002;
            if (stage == 3) {
               if (line.charAt(i) == ' ') {
                  ++stage;
               } else {
                  var10000 = new StringBuilder();
                  var10002 = (Operation)calcs.get(calc);
                  var10002.operator = var10000.append(var10002.operator).append(line.charAt(i)).toString();
               }
            } else if (stage == 4) {
               if (line.charAt(i) == ' ') {
                  ++stage;
               } else if (line.charAt(i) == '+' | line.charAt(i) == '-' | line.charAt(i) == '=' | line.charAt(i) == '*' | line.charAt(i) == '/') {
                  if (line.charAt(i + 1) == '=') {
                     calcs.add(new Operation());
                     ++calc;
                     ((Operation)calcs.get(calc)).operator = line.charAt(i) + "=";
                     ++i;
                  } else {
                     var10000 = new StringBuilder();
                     var10002 = (Operation)calcs.get(calc);
                     var10002.num = var10000.append(var10002.num).append(line.charAt(i)).toString();
                  }
               } else {
                  var10000 = new StringBuilder();
                  var10002 = (Operation)calcs.get(calc);
                  var10002.num = var10000.append(var10002.num).append(line.charAt(i)).toString();
               }
            } else if (stage == 5) {
               if (line.charAt(i) == ' ') {
                  ++stage;
               } else {
                  smooth = smooth + (line.charAt(i) == '#' ? "" : line.charAt(i));
               }
            }
         }
      }

      anim = anim.trim();

      for(i = 0; i < calcs.size(); ++i) {
         ((Operation)calcs.get(i)).num = ((Operation)calcs.get(i)).num.trim();
         if (((Operation)calcs.get(i)).num.contains(":cos:")) {
            action.mod = BendsAction.EnumModifier.COS;
            ((Operation)calcs.get(i)).num = ((Operation)calcs.get(i)).num.replaceAll(":cos:", "");
            ((Operation)calcs.get(i)).num = ((Operation)calcs.get(i)).num.trim();
         }

         if (((Operation)calcs.get(i)).num.contains(":sin:")) {
            action.mod = BendsAction.EnumModifier.SIN;
            ((Operation)calcs.get(i)).num = ((Operation)calcs.get(i)).num.replaceAll(":sin:", "");
            ((Operation)calcs.get(i)).num = ((Operation)calcs.get(i)).num.trim();
         }

         if (((Operation)calcs.get(i)).num.contains("$")) {
            ((Operation)calcs.get(i)).num = ((Operation)calcs.get(i)).num.replace("$", " ");
            ((Operation)calcs.get(i)).num = ((Operation)calcs.get(i)).num.trim();
            ((Operation)calcs.get(i)).globalVar = ((Operation)calcs.get(i)).num;
            ((Operation)calcs.get(i)).num = "0";
            System.out.println("Global Var Used: " + ((Operation)calcs.get(i)).globalVar);
         }

         ((Operation)calcs.get(i)).operator = ((Operation)calcs.get(i)).operator.trim();
         System.out.println("Number: " + ((Operation)calcs.get(i)).num + ", " + ((Operation)calcs.get(i)).operator + ";");
         System.out.println("Line: " + line);
         action.calculations.add((new BendsAction.Calculation(BendsAction.getOperatorFromSymbol(((Operation)calcs.get(i)).operator), Float.parseFloat(((Operation)calcs.get(i)).num))).setGlobalVar(((Operation)calcs.get(i)).globalVar));
      }

      if (line.contains(":rot:")) {
         action.prop = BendsAction.EnumBoxProperty.ROT;
      } else if (line.contains(":scale:")) {
         action.prop = BendsAction.EnumBoxProperty.SCALE;
      } else if (line.contains(":prerot:")) {
         action.prop = BendsAction.EnumBoxProperty.PREROT;
      }

      if (line.contains(":x")) {
         action.axis = EnumAxis.X;
      } else if (line.contains(":y")) {
         action.axis = EnumAxis.Y;
      } else if (line.contains(":z")) {
         action.axis = EnumAxis.Z;
      }

      action.smooth = Float.parseFloat(smooth);
      return action;
   }

   public static BendsTarget getTargetByID(String argID) {
      for(int i = 0; i < targets.size(); ++i) {
         if (((BendsTarget)targets.get(i)).mob.equalsIgnoreCase(argID)) {
            return (BendsTarget)targets.get(i);
         }
      }

      return null;
   }

   public static void animate(ModelBendsPlayer model, String target, String anim) {
      if (getTargetByID(target) != null) {
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78115_e, anim, "body");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78116_c, anim, "head");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78113_g, anim, "leftArm");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78112_f, anim, "rightArm");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78124_i, anim, "leftLeg");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78123_h, anim, "rightLeg");
         getTargetByID(target).applyToModel((ModelRendererBends)model.bipedLeftForeArm, anim, "leftForeArm");
         getTargetByID(target).applyToModel((ModelRendererBends)model.bipedRightForeArm, anim, "rightForeArm");
         getTargetByID(target).applyToModel((ModelRendererBends)model.bipedLeftForeLeg, anim, "leftForeLeg");
         getTargetByID(target).applyToModel((ModelRendererBends)model.bipedRightForeLeg, anim, "rightForeLeg");
      }

   }

   public static void animate(ModelBendsZombie model, String target, String anim) {
      if (getTargetByID(target) != null) {
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78115_e, anim, "body");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78116_c, anim, "head");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78113_g, anim, "leftArm");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78112_f, anim, "rightArm");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78124_i, anim, "leftLeg");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78123_h, anim, "rightLeg");
         getTargetByID(target).applyToModel((ModelRendererBends)model.bipedLeftForeArm, anim, "leftForeArm");
         getTargetByID(target).applyToModel((ModelRendererBends)model.bipedRightForeArm, anim, "rightForeArm");
         getTargetByID(target).applyToModel((ModelRendererBends)model.bipedLeftForeLeg, anim, "leftForeLeg");
         getTargetByID(target).applyToModel((ModelRendererBends)model.bipedRightForeLeg, anim, "rightForeLeg");
      }

   }

   public static void animate(ModelBendsSpider model, String target, String anim) {
      if (getTargetByID(target) != null) {
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78208_c, anim, "body");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78207_b, anim, "neck");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78209_a, anim, "head");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78205_d, anim, "leg1");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78206_e, anim, "leg2");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78203_f, anim, "leg3");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78204_g, anim, "leg4");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78212_h, anim, "leg5");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78213_i, anim, "leg6");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78210_j, anim, "leg7");
         getTargetByID(target).applyToModel((ModelRendererBends)model.field_78211_k, anim, "leg8");
         getTargetByID(target).applyToModel(model.spiderForeLeg1, anim, "foreLeg1");
         getTargetByID(target).applyToModel(model.spiderForeLeg2, anim, "foreLeg2");
         getTargetByID(target).applyToModel(model.spiderForeLeg3, anim, "foreLeg3");
         getTargetByID(target).applyToModel(model.spiderForeLeg4, anim, "foreLeg4");
         getTargetByID(target).applyToModel(model.spiderForeLeg5, anim, "foreLeg5");
         getTargetByID(target).applyToModel(model.spiderForeLeg6, anim, "foreLeg7");
         getTargetByID(target).applyToModel(model.spiderForeLeg7, anim, "foreLeg7");
         getTargetByID(target).applyToModel(model.spiderForeLeg8, anim, "foreLeg8");
      }

   }

   public void save() throws IOException {
      String tab = "\t";
      BendsLogger.log("Saving Pack " + this.displayName + "...", BendsLogger.DEBUG);
      if (this.filename == null) {
         this.filename = constructFilenameWithDisplayName(this.displayName);
      }

      for(int packFile = 0; packFile < targets.size(); ++packFile) {
         BendsLogger.log("    -" + ((BendsTarget)targets.get(packFile)).actions.size(), BendsLogger.DEBUG);
      }

      File var11 = new File(bendsPacksDir, this.filename + "");
      var11.createNewFile();
      BufferedWriter os = new BufferedWriter(new FileWriter(var11));
      os.write("name: \"" + this.displayName + "\"\n");
      os.write("author: \"" + this.author + "\"\n");
      os.write("description: \"" + this.description + "\"\n");
      os.newLine();

      for(int t = 0; t < targets.size(); ++t) {
         BendsTarget target = (BendsTarget)targets.get(t);
         os.write("target " + target.mob + " {\n");
         String anim = null;

         for(int a = 0; a < target.actions.size(); ++a) {
            BendsAction action = (BendsAction)target.actions.get(a);
            if (action.calculations.size() > 0) {
               if (anim == null || !anim.equalsIgnoreCase(action.anim)) {
                  if (anim != null) {
                     os.write(tab + "}\n");
                  }

                  os.write(tab + "anim " + action.anim + " {\n");
                  anim = action.anim;
               }

               os.write(tab + tab + "@" + action.model + ":" + (action.prop == BendsAction.EnumBoxProperty.ROT ? "rot" : (action.prop == BendsAction.EnumBoxProperty.SCALE ? "scale" : "prerot")) + ":" + (action.axis == EnumAxis.X ? "x" : (action.axis == EnumAxis.Y ? "y" : (action.axis == EnumAxis.Z ? "z" : ""))) + " ");

               for(int c = 0; c < action.calculations.size(); ++c) {
                  BendsAction.Calculation calc = (BendsAction.Calculation)action.calculations.get(c);
                  os.write(calc.operator == BendsAction.EnumOperator.SET ? "==" : (calc.operator == BendsAction.EnumOperator.ADD ? "+=" : (calc.operator == BendsAction.EnumOperator.SUBSTRACT ? "-=" : (calc.operator == BendsAction.EnumOperator.MULTIPLY ? "*=" : (calc.operator == BendsAction.EnumOperator.DIVIDE ? "/=" : "==")))));
                  if (c == 0) {
                     os.write(" " + (action.mod == BendsAction.EnumModifier.COS ? ":cos:" : (action.mod == BendsAction.EnumModifier.SIN ? ":sin:" : "")));
                  }

                  os.write(calc.globalVar == null ? "" + calc.number : "$" + calc.globalVar);
               }

               os.write(" #" + action.smooth);
               os.newLine();
               if (a == target.actions.size() - 1) {
                  os.write(tab + "}\n");
               }
            }
         }

         os.write("}\n\n");
      }

      os.close();
   }

   public static String constructFilenameWithDisplayName(String argName) {
      String filename = argName.toLowerCase();
      filename = filename.replace('.', ' ');
      filename = filename.trim();
      filename = filename.replace(" ", "_");
      return filename + ".bends";
   }
}
