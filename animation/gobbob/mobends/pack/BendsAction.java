package animation.gobbob.mobends.pack;

import animation.gobbob.mobends.util.EnumAxis;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.MathHelper;

public class BendsAction {
   public String anim;
   public String model;
   public List calculations = new ArrayList();
   public BendsAction.EnumBoxProperty prop;
   public EnumAxis axis;
   public float smooth;
   public BendsAction.EnumModifier mod;
   public float visual_DeletePopUp;

   public BendsAction(String argAnim, String argModel, BendsAction.EnumBoxProperty argProp, EnumAxis argAxis, float argSmooth, float argNumber) {
      this.anim = argAnim;
      this.model = argModel;
      this.prop = argProp;
      this.axis = argAxis;
      this.smooth = argSmooth;
      this.visual_DeletePopUp = 0.0F;
   }

   public BendsAction() {
   }

   public BendsAction setModifier(BendsAction.EnumModifier argMod) {
      this.mod = argMod;
      return this;
   }

   public float getNumber(float in) {
      return BendsAction.Calculation.calculateAll(this.mod, in, this.calculations);
   }

   public static BendsAction.EnumOperator getOperatorFromSymbol(String symbol) {
      return symbol.equalsIgnoreCase("+=") ? BendsAction.EnumOperator.ADD : (symbol.equalsIgnoreCase("-=") ? BendsAction.EnumOperator.SUBSTRACT : (symbol.equalsIgnoreCase("==") ? BendsAction.EnumOperator.SET : (symbol.equalsIgnoreCase("*=") ? BendsAction.EnumOperator.MULTIPLY : BendsAction.EnumOperator.DIVIDE)));
   }

   public static enum EnumOperator {
      SET("SET", 0),
      ADD("ADD", 1),
      MULTIPLY("MULTIPLY", 2),
      DIVIDE("DIVIDE", 3),
      SUBSTRACT("SUBSTRACT", 4);

      private static final BendsAction.EnumOperator[] $VALUES = new BendsAction.EnumOperator[]{SET, ADD, MULTIPLY, DIVIDE, SUBSTRACT};

      private EnumOperator(String var11, int var21) {
      }
   }

   public static enum EnumModifier {
      COS("COS", 0),
      SIN("SIN", 1);

      private static final BendsAction.EnumModifier[] $VALUES = new BendsAction.EnumModifier[]{COS, SIN};

      private EnumModifier(String var11, int var21) {
      }
   }

   public static enum EnumBoxProperty {
      ROT("ROT", 0),
      SCALE("SCALE", 1),
      PREROT("PREROT", 2);

      private static final BendsAction.EnumBoxProperty[] $VALUES = new BendsAction.EnumBoxProperty[]{ROT, SCALE, PREROT};

      private EnumBoxProperty(String var11, int var21) {
      }
   }

   public static class Calculation {
      public BendsAction.EnumOperator operator;
      public float number;
      public String globalVar = null;

      public Calculation(BendsAction.EnumOperator argOperator, float argNumber) {
         this.operator = argOperator;
         this.number = argNumber;
      }

      public BendsAction.Calculation setGlobalVar(String argGlobalVar) {
         this.globalVar = argGlobalVar;
         return this;
      }

      public float calculate(float in) {
         float num = this.globalVar != null ? BendsVar.getGlobalVar(this.globalVar) : this.number;
         float out = 0.0F;
         if (this.operator == BendsAction.EnumOperator.ADD) {
            out = in + num;
         }

         if (this.operator == BendsAction.EnumOperator.SET) {
            out = num;
         }

         if (this.operator == BendsAction.EnumOperator.SUBSTRACT) {
            out = in - num;
         }

         if (this.operator == BendsAction.EnumOperator.MULTIPLY) {
            out = in * num;
         }

         if (this.operator == BendsAction.EnumOperator.DIVIDE) {
            out = in / num;
         }

         return out;
      }

      public static float calculateAll(BendsAction.EnumModifier mod, float in, List argCalc) {
         float out = in;

         for(int i = 0; i < argCalc.size(); ++i) {
            out = ((BendsAction.Calculation)argCalc.get(i)).calculate(out);
         }

         if (mod == BendsAction.EnumModifier.COS) {
            out = MathHelper.func_76134_b(out);
         }

         if (mod == BendsAction.EnumModifier.SIN) {
            out = MathHelper.func_76126_a(out);
         }

         return out;
      }
   }
}
