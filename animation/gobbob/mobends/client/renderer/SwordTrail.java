package animation.gobbob.mobends.client.renderer;

import animation.gobbob.mobends.client.ClientProxy;
import animation.gobbob.mobends.client.model.ModelRendererBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsPlayer;
import animation.gobbob.mobends.util.GUtil;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

public class SwordTrail {
   public List trailPartList = new ArrayList();

   public void reset() {
      this.trailPartList.clear();
   }

   public void render(ModelBendsPlayer model) {
      Minecraft.func_71410_x().field_71446_o.func_110577_a(ClientProxy.texture_NULL);
      GL11.glDepthFunc(515);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(2884);
      GL11.glDisable(2896);
      GL11.glHint(3152, 4354);
      GL11.glShadeModel(7425);
      GL11.glPushMatrix();
      GL11.glBegin(7);

      for(int i = 0; i < this.trailPartList.size(); ++i) {
         SwordTrail.TrailPart part = (SwordTrail.TrailPart)this.trailPartList.get(i);
         float alpha = part.ticksExisted / 5.0F;
         alpha = GUtil.max(alpha, 1.0F);
         alpha = 1.0F - alpha;
         GL11.glColor4f(1.0F, 1.0F, 1.0F, alpha);
         Vector3f[] point = new Vector3f[]{new Vector3f(0.0F, 0.0F, -8.0F + 8.0F * alpha), new Vector3f(0.0F, 0.0F, -8.0F - 8.0F * alpha)};
         GUtil.rotateX(point, part.itemRotation.getX());
         GUtil.rotateY(point, part.itemRotation.getY());
         GUtil.rotateZ(point, part.itemRotation.getZ());
         GUtil.translate(point, new Vector3f(-1.0F, -6.0F, 0.0F));
         GUtil.rotateX(point, part.foreArm.field_78795_f / 3.1415927F * 180.0F);
         GUtil.rotateY(point, part.foreArm.field_78796_g / 3.1415927F * 180.0F);
         GUtil.rotateZ(point, part.foreArm.field_78808_h / 3.1415927F * 180.0F);
         GUtil.rotateX(point, part.foreArm.pre_rotation.getX());
         GUtil.rotateY(point, part.foreArm.pre_rotation.getY());
         GUtil.rotateZ(point, -part.foreArm.pre_rotation.getZ());
         GUtil.translate(point, new Vector3f(0.0F, -4.0F, 0.0F));
         GUtil.rotateX(point, part.arm.field_78795_f / 3.1415927F * 180.0F);
         GUtil.rotateY(point, part.arm.field_78796_g / 3.1415927F * 180.0F);
         GUtil.rotateZ(point, part.arm.field_78808_h / 3.1415927F * 180.0F);
         GUtil.rotateX(point, part.arm.pre_rotation.getX());
         GUtil.rotateY(point, part.arm.pre_rotation.getY());
         GUtil.rotateZ(point, -part.arm.pre_rotation.getZ());
         GUtil.translate(point, new Vector3f(-5.0F, 10.0F, 0.0F));
         GUtil.rotateX(point, part.body.field_78795_f / 3.1415927F * 180.0F);
         GUtil.rotateY(point, part.body.field_78796_g / 3.1415927F * 180.0F);
         GUtil.rotateZ(point, part.body.field_78808_h / 3.1415927F * 180.0F);
         GUtil.rotateX(point, part.body.pre_rotation.getX());
         GUtil.rotateY(point, part.body.pre_rotation.getY());
         GUtil.rotateZ(point, part.body.pre_rotation.getZ());
         GUtil.translate(point, new Vector3f(0.0F, 12.0F, 0.0F));
         GUtil.rotateX(point, part.renderRotation.getX());
         GUtil.rotateY(point, part.renderRotation.getY());
         GUtil.translate(point, part.renderOffset);
         if (i > 0) {
            GL11.glVertex3f(point[1].x, point[1].y, point[1].z);
            GL11.glVertex3f(point[0].x, point[0].y, point[0].z);
            GL11.glVertex3f(point[0].x, point[0].y, point[0].z);
            GL11.glVertex3f(point[1].x, point[1].y, point[1].z);
         } else {
            GL11.glVertex3f(point[0].x, point[0].y, point[0].z);
            GL11.glVertex3f(point[1].x, point[1].y, point[1].z);
         }

         if (i == this.trailPartList.size() - 1) {
            GL11.glVertex3f(point[1].x, point[1].y, point[1].z);
            GL11.glVertex3f(point[0].x, point[0].y, point[0].z);
         }
      }

      GL11.glEnd();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glEnable(2884);
      GL11.glEnable(2896);
   }

   public void add(ModelBendsPlayer argModel) {
      SwordTrail.TrailPart newPart = new SwordTrail.TrailPart(argModel);
      newPart.body.sync((ModelRendererBends)argModel.field_78115_e);
      newPart.body.setPosition(argModel.field_78115_e.field_78800_c, argModel.field_78115_e.field_78797_d, argModel.field_78115_e.field_78798_e);
      newPart.body.setOffset(argModel.field_78115_e.field_82906_o, argModel.field_78115_e.field_82908_p, argModel.field_78115_e.field_82907_q);
      newPart.arm.sync((ModelRendererBends)argModel.field_78112_f);
      newPart.arm.setPosition(argModel.field_78112_f.field_78800_c, argModel.field_78112_f.field_78797_d, argModel.field_78112_f.field_78798_e);
      newPart.arm.setOffset(argModel.field_78112_f.field_82906_o, argModel.field_78112_f.field_82908_p, argModel.field_78112_f.field_82907_q);
      newPart.foreArm.sync((ModelRendererBends)argModel.bipedRightForeArm);
      newPart.foreArm.setPosition(argModel.bipedRightForeArm.field_78800_c, argModel.bipedRightForeArm.field_78797_d, argModel.bipedRightForeArm.field_78798_e);
      newPart.foreArm.setOffset(argModel.bipedRightForeArm.field_82906_o, argModel.bipedRightForeArm.field_82908_p, argModel.bipedRightForeArm.field_82907_q);
      newPart.renderOffset.set(argModel.renderOffset.vSmooth);
      newPart.renderRotation.set(argModel.renderRotation.vSmooth);
      newPart.itemRotation.set(argModel.renderItemRotation.vSmooth);
      this.trailPartList.add(newPart);
   }

   public void update(float argPartialTicks) {
      int i;
      for(i = 0; i < this.trailPartList.size(); ++i) {
         SwordTrail.TrailPart var10000 = (SwordTrail.TrailPart)this.trailPartList.get(i);
         var10000.ticksExisted += argPartialTicks;
      }

      for(i = 0; i < this.trailPartList.size(); ++i) {
         if (((SwordTrail.TrailPart)this.trailPartList.get(i)).ticksExisted > 20.0F) {
            this.trailPartList.remove(this.trailPartList.get(i));
         }
      }

   }

   public class TrailPart {
      public ModelRendererBends body;
      public ModelRendererBends arm;
      public ModelRendererBends foreArm;
      public Vector3f renderRotation = new Vector3f();
      public Vector3f renderOffset = new Vector3f();
      public Vector3f itemRotation = new Vector3f();
      float ticksExisted;

      public TrailPart(ModelBendsPlayer argModel) {
         this.body = new ModelRendererBends(argModel);
         this.arm = new ModelRendererBends(argModel);
         this.foreArm = new ModelRendererBends(argModel);
      }
   }
}
