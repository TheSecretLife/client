package animation.gobbob.mobends.data;

import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsZombie;
import animation.gobbob.mobends.util.SmoothVector3f;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;

public class Data_Zombie extends EntityData {
   public static List dataList = new ArrayList();
   public ModelRendererBends head;
   public ModelRendererBends headwear;
   public ModelRendererBends body;
   public ModelRendererBends rightArm;
   public ModelRendererBends leftArm;
   public ModelRendererBends rightLeg;
   public ModelRendererBends leftLeg;
   public ModelRendererBends ears;
   public ModelRendererBends cloak;
   public ModelRendererBends rightForeArm;
   public ModelRendererBends leftForeArm;
   public ModelRendererBends rightForeLeg;
   public ModelRendererBends leftForeLeg;
   public SmoothVector3f renderOffset = new SmoothVector3f();
   public SmoothVector3f renderRotation = new SmoothVector3f();
   public int currentWalkingState = 0;
   public float ticksBeforeStateChange = 0.0F;

   public Data_Zombie(int argEntityID) {
      super(argEntityID);
   }

   public void syncModelInfo(ModelBendsZombie argModel) {
      if (this.head == null) {
         this.head = new ModelRendererBends(argModel);
      }

      this.head.sync((ModelRendererBends)argModel.field_78116_c);
      if (this.headwear == null) {
         this.headwear = new ModelRendererBends(argModel);
      }

      this.headwear.sync((ModelRendererBends)argModel.field_78114_d);
      if (this.body == null) {
         this.body = new ModelRendererBends(argModel);
      }

      this.body.sync((ModelRendererBends)argModel.field_78115_e);
      if (this.rightArm == null) {
         this.rightArm = new ModelRendererBends(argModel);
      }

      this.rightArm.sync((ModelRendererBends)argModel.field_78112_f);
      if (this.leftArm == null) {
         this.leftArm = new ModelRendererBends(argModel);
      }

      this.leftArm.sync((ModelRendererBends)argModel.field_78113_g);
      if (this.rightLeg == null) {
         this.rightLeg = new ModelRendererBends(argModel);
      }

      this.rightLeg.sync((ModelRendererBends)argModel.field_78123_h);
      if (this.leftLeg == null) {
         this.leftLeg = new ModelRendererBends(argModel);
      }

      this.leftLeg.sync((ModelRendererBends)argModel.field_78124_i);
      if (this.rightForeArm == null) {
         this.rightForeArm = new ModelRendererBends(argModel);
      }

      this.rightForeArm.sync((ModelRendererBends)argModel.bipedRightForeArm);
      if (this.leftForeArm == null) {
         this.leftForeArm = new ModelRendererBends(argModel);
      }

      this.leftForeArm.sync((ModelRendererBends)argModel.bipedLeftForeArm);
      if (this.rightForeLeg == null) {
         this.rightForeLeg = new ModelRendererBends(argModel);
      }

      this.rightForeLeg.sync((ModelRendererBends)argModel.bipedRightForeLeg);
      if (this.leftForeLeg == null) {
         this.leftForeLeg = new ModelRendererBends(argModel);
      }

      this.leftForeLeg.sync((ModelRendererBends)argModel.bipedLeftForeLeg);
      this.renderOffset.set(argModel.renderOffset);
      this.renderRotation.set(argModel.renderRotation);
   }

   public static void add(Data_Zombie argData) {
      dataList.add(argData);
   }

   public static Data_Zombie get(int argEntityID) {
      for(int newData = 0; newData < dataList.size(); ++newData) {
         if (((Data_Zombie)dataList.get(newData)).entityID == argEntityID) {
            return (Data_Zombie)dataList.get(newData);
         }
      }

      Data_Zombie var2 = new Data_Zombie(argEntityID);
      if (Minecraft.func_71410_x().field_71441_e.func_73045_a(argEntityID) != null) {
         dataList.add(var2);
      }

      return var2;
   }

   public void update(float argPartialTicks) {
      super.update(argPartialTicks);
      this.ticksBeforeStateChange -= argPartialTicks;
      if (this.ticksBeforeStateChange <= 0.0F) {
         Random random = new Random();
         this.currentWalkingState = random.nextInt(2);
         this.ticksBeforeStateChange = (float)(80 + random.nextInt(20));
      }

   }

   public void onLiftoff() {
      super.onLiftoff();
   }
}
