package cabalaccessorys.client.renderswordcabal3d;

import cabalaccessorys.AssetManager;
import cabalaccessorys.RegisterItem;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import net.minecraftforge.client.model.obj.GroupObject;
import org.lwjgl.opengl.GL11;
import utilities.sagaobj;

public class RenderSword01 implements IItemRenderer {
   public static final ResourceLocation tex01 = new ResourceLocation("cabalaccessorys", "models/weapon/sw01.png");
   public final sagaobj md01 = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/weapon/sw01.saga");
   public final ArrayList p01;
   public static final ResourceLocation tex02 = new ResourceLocation("cabalaccessorys", "models/weapon/sw02.png");
   public final sagaobj md02;
   public final ArrayList p02;
   public static final ResourceLocation tex03 = new ResourceLocation("cabalaccessorys", "models/weapon/sw03.png");
   public final sagaobj md03;
   public final ArrayList p03;
   public static final ResourceLocation tex04 = new ResourceLocation("cabalaccessorys", "models/weapon/sw04.png");
   public final sagaobj md04;
   public final ArrayList p04;
   public static final ResourceLocation tex05 = new ResourceLocation("cabalaccessorys", "models/weapon/sw05.png");
   public final sagaobj md05;
   public final ArrayList p05;
   public static final ResourceLocation tex06 = new ResourceLocation("cabalaccessorys", "models/weapon/sw06.png");
   public final sagaobj md06;
   public final ArrayList p06;
   public static final ResourceLocation tex07 = new ResourceLocation("cabalaccessorys", "models/weapon/sw07.png");
   public final sagaobj md07;
   public final ArrayList p07;
   public static final ResourceLocation tex08 = new ResourceLocation("cabalaccessorys", "models/weapon/sw08.png");
   public final sagaobj md08;
   public final ArrayList p08;
   public static final ResourceLocation tex09 = new ResourceLocation("cabalaccessorys", "models/weapon/sw09.png");
   public final sagaobj md09;
   public final ArrayList p09;
   public static final ResourceLocation tex10 = new ResourceLocation("cabalaccessorys", "models/weapon/sw10.png");
   public final sagaobj md10;
   public final ArrayList p10;

   public RenderSword01() {
      this.p01 = this.md01.groupObjects;
      this.md02 = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/weapon/sw02.saga");
      this.p02 = this.md02.groupObjects;
      this.md03 = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/weapon/sw03.saga");
      this.p03 = this.md03.groupObjects;
      this.md04 = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/weapon/sw04.saga");
      this.p04 = this.md04.groupObjects;
      this.md05 = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/weapon/sw05.saga");
      this.p05 = this.md05.groupObjects;
      this.md06 = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/weapon/sw06.saga");
      this.p06 = this.md06.groupObjects;
      this.md07 = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/weapon/sw07.saga");
      this.p07 = this.md07.groupObjects;
      this.md08 = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/weapon/sw08.saga");
      this.p08 = this.md08.groupObjects;
      this.md09 = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/weapon/sw09.saga");
      this.p09 = this.md09.groupObjects;
      this.md10 = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/weapon/sw10.saga");
      this.p10 = this.md10.groupObjects;
   }

   public boolean handleRenderType(ItemStack item, ItemRenderType type) {
      switch(type) {
      case EQUIPPED:
      case EQUIPPED_FIRST_PERSON:
      case ENTITY:
         return true;
      default:
         return false;
      }
   }

   public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
      return false;
   }

   public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
      float scale1 = 1.45F;
      float scale2 = 1.45F;
      float scale3 = 1.6F;
      switch(type) {
      case EQUIPPED:
      case EQUIPPED_FIRST_PERSON:
      case ENTITY:
         Iterator var7;
         GroupObject part;
         if (item.func_77973_b() == RegisterItem.sw001) {
            scale1 = 1.45F;
            scale2 = 1.45F;
            scale3 = 1.6F;
            GL11.glPushMatrix();
            GL11.glScalef(scale1, scale2, scale3);
            GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, 0.05F, -0.65F);
            Minecraft.func_71410_x().field_71446_o.func_110577_a(tex01);
            var7 = this.p01.iterator();

            while(var7.hasNext()) {
               part = (GroupObject)var7.next();
               part.render();
            }

            GL11.glPopMatrix();
         } else if (item.func_77973_b() == RegisterItem.sw002) {
            scale1 = 0.85F;
            scale2 = 0.85F;
            scale3 = 1.05F;
            GL11.glPushMatrix();
            GL11.glScalef(scale1, scale2, scale3);
            GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, 0.25F, -1.0F);
            Minecraft.func_71410_x().field_71446_o.func_110577_a(tex02);
            var7 = this.p02.iterator();

            while(var7.hasNext()) {
               part = (GroupObject)var7.next();
               part.render();
            }

            GL11.glPopMatrix();
         } else if (item.func_77973_b() == RegisterItem.sw003) {
            scale1 = 0.85F;
            scale2 = 0.85F;
            scale3 = 1.05F;
            GL11.glPushMatrix();
            GL11.glScalef(scale1, scale2, scale3);
            GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.05F, 0.45F, -0.95F);
            Minecraft.func_71410_x().field_71446_o.func_110577_a(tex03);
            var7 = this.p03.iterator();

            while(var7.hasNext()) {
               part = (GroupObject)var7.next();
               part.render();
            }

            GL11.glPopMatrix();
         } else if (item.func_77973_b() == RegisterItem.sw004) {
            scale1 = 0.65F;
            scale2 = 0.65F;
            scale3 = 0.65F;
            GL11.glPushMatrix();
            GL11.glScalef(scale1, scale2, scale3);
            GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.05F, 0.45F, -1.25F);
            Minecraft.func_71410_x().field_71446_o.func_110577_a(tex04);
            var7 = this.p04.iterator();

            while(var7.hasNext()) {
               part = (GroupObject)var7.next();
               part.render();
            }

            GL11.glPopMatrix();
         } else if (item.func_77973_b() == RegisterItem.sw005) {
            scale1 = 0.95F;
            scale2 = 0.95F;
            scale3 = 0.95F;
            GL11.glPushMatrix();
            GL11.glScalef(scale1, scale2, scale3);
            GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.05F, 0.3F, -0.9F);
            Minecraft.func_71410_x().field_71446_o.func_110577_a(tex05);
            var7 = this.p05.iterator();

            while(var7.hasNext()) {
               part = (GroupObject)var7.next();
               part.render();
            }

            GL11.glPopMatrix();
         } else if (item.func_77973_b() == RegisterItem.sw006) {
            scale1 = 0.95F;
            scale2 = 0.95F;
            scale3 = 0.95F;
            GL11.glPushMatrix();
            GL11.glScalef(scale1, scale2, scale3);
            GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.05F, 0.3F, -0.9F);
            Minecraft.func_71410_x().field_71446_o.func_110577_a(tex06);
            var7 = this.p06.iterator();

            while(var7.hasNext()) {
               part = (GroupObject)var7.next();
               part.render();
            }

            GL11.glPopMatrix();
         } else if (item.func_77973_b() == RegisterItem.sw007) {
            scale1 = 0.85F;
            scale2 = 0.85F;
            scale3 = 0.85F;
            GL11.glPushMatrix();
            GL11.glScalef(scale1, scale2, scale3);
            GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.05F, 0.3F, -0.9F);
            Minecraft.func_71410_x().field_71446_o.func_110577_a(tex07);
            var7 = this.p07.iterator();

            while(var7.hasNext()) {
               part = (GroupObject)var7.next();
               part.render();
            }

            GL11.glPopMatrix();
         } else if (item.func_77973_b() == RegisterItem.sw008) {
            scale1 = 0.95F;
            scale2 = 0.95F;
            scale3 = 0.95F;
            GL11.glPushMatrix();
            GL11.glScalef(scale1, scale2, scale3);
            GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.05F, 0.45F, -0.8F);
            Minecraft.func_71410_x().field_71446_o.func_110577_a(tex08);
            var7 = this.p08.iterator();

            while(var7.hasNext()) {
               part = (GroupObject)var7.next();
               part.render();
            }

            GL11.glPopMatrix();
         } else if (item.func_77973_b() == RegisterItem.sw009) {
            scale1 = 0.8F;
            scale2 = 0.8F;
            scale3 = 0.8F;
            GL11.glPushMatrix();
            GL11.glScalef(scale1, scale2, scale3);
            GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.05F, 0.5F, -1.0F);
            Minecraft.func_71410_x().field_71446_o.func_110577_a(tex09);
            var7 = this.p09.iterator();

            while(var7.hasNext()) {
               part = (GroupObject)var7.next();
               part.render();
            }

            GL11.glPopMatrix();
         } else if (item.func_77973_b() == RegisterItem.sw010) {
            scale1 = 1.35F;
            scale2 = 1.35F;
            scale3 = 1.35F;
            GL11.glPushMatrix();
            GL11.glScalef(scale1, scale2, scale3);
            GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.05F, 0.3F, -0.6F);
            Minecraft.func_71410_x().field_71446_o.func_110577_a(tex10);
            var7 = this.p10.iterator();

            while(var7.hasNext()) {
               part = (GroupObject)var7.next();
               part.render();
            }

            GL11.glPopMatrix();
         }
      default:
      }
   }
}
