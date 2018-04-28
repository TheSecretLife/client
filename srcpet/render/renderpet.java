package srcpet.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class renderpet extends RenderLiving {
   private static final ResourceLocation tex1 = new ResourceLocation("ajamigaslot:textures/pet/e1.png");
   private static final ResourceLocation tex2 = new ResourceLocation("ajamigaslot:textures/pet/e2.png");
   private static final ResourceLocation tex3 = new ResourceLocation("ajamigaslot:textures/pet/e3.png");
   private static final ResourceLocation tex4 = new ResourceLocation("ajamigaslot:textures/pet/e4.png");
   private static final ResourceLocation tex5 = new ResourceLocation("ajamigaslot:textures/pet/e5.png");
   private static final ResourceLocation tex6 = new ResourceLocation("ajamigaslot:textures/pet/e6.png");
   private static final ResourceLocation tex7 = new ResourceLocation("ajamigaslot:textures/pet/e7.png");
   private static final ResourceLocation tex8 = new ResourceLocation("ajamigaslot:textures/pet/e8.png");
   private static final ResourceLocation tex9 = new ResourceLocation("ajamigaslot:textures/pet/e9.png");
   private static final ResourceLocation tex10 = new ResourceLocation("ajamigaslot:textures/pet/e10.png");
   private static final ResourceLocation tex11 = new ResourceLocation("ajamigaslot:textures/pet/e11.png");
   private static final ResourceLocation tex12 = new ResourceLocation("ajamigaslot:textures/pet/e12.png");
   private static final ResourceLocation tex13 = new ResourceLocation("ajamigaslot:textures/pet/dog.png");
   private static final ResourceLocation tex14 = new ResourceLocation("ajamigaslot:textures/pet/fox.png");
   private static final ResourceLocation tex15 = new ResourceLocation("ajamigaslot:textures/pet/Golem.png");
   private static final ResourceLocation tex16 = new ResourceLocation("ajamigaslot:textures/pet/Scor.png");
   private static final ResourceLocation tex17 = new ResourceLocation("ajamigaslot:textures/pet/Ware.png");
   private static final ResourceLocation tex18 = new ResourceLocation("ajamigaslot:textures/pet/ho.png");
   private static final ResourceLocation tex19 = new ResourceLocation("cabalaccessorys:models/pet/archangel_hr/archangel_hr-light.png");
   private static final ResourceLocation tex20 = new ResourceLocation("cabalaccessorys:models/pet/grimreaper_hr/grimreaper_hr-dark.png");
   private static final ResourceLocation tex21 = new ResourceLocation("cabalaccessorys:models/pet/ifrit_hr/ifrit_hr-fire.png");
   private static final ResourceLocation tex22 = new ResourceLocation("cabalaccessorys:models/pet/northseaking/northseaking-dark.png");
   private static final ResourceLocation tex23 = new ResourceLocation("cabalaccessorys:models/pet/demonhunter_hr/demonhunter_hr-light.png");
   private static final ResourceLocation tex24 = new ResourceLocation("cabalaccessorys:models/pet/ghostarmor_hr/ghostarmor_hr-fire.png");

   public renderpet(ModelBase b, float x) {
      super(b, x);
   }

   protected ResourceLocation getCowTextures(Entity c) {
      if (c.func_70096_w().func_75679_c(31) == 1) {
         return tex1;
      } else if (c.func_70096_w().func_75679_c(31) == 2) {
         return tex2;
      } else if (c.func_70096_w().func_75679_c(31) == 3) {
         return tex3;
      } else if (c.func_70096_w().func_75679_c(31) == 4) {
         return tex4;
      } else if (c.func_70096_w().func_75679_c(31) == 5) {
         return tex5;
      } else if (c.func_70096_w().func_75679_c(31) == 6) {
         return tex6;
      } else if (c.func_70096_w().func_75679_c(31) == 7) {
         return tex7;
      } else if (c.func_70096_w().func_75679_c(31) == 8) {
         return tex8;
      } else if (c.func_70096_w().func_75679_c(31) == 9) {
         return tex9;
      } else if (c.func_70096_w().func_75679_c(31) == 10) {
         return tex10;
      } else if (c.func_70096_w().func_75679_c(31) == 11) {
         return tex11;
      } else if (c.func_70096_w().func_75679_c(31) == 12) {
         return tex12;
      } else if (c.func_70096_w().func_75679_c(31) == 13) {
         return tex13;
      } else if (c.func_70096_w().func_75679_c(31) == 14) {
         return tex14;
      } else if (c.func_70096_w().func_75679_c(31) == 15) {
         return tex15;
      } else if (c.func_70096_w().func_75679_c(31) == 16) {
         return tex16;
      } else if (c.func_70096_w().func_75679_c(31) == 17) {
         return tex17;
      } else if (c.func_70096_w().func_75679_c(31) == 18) {
         return tex18;
      } else if (c.func_70096_w().func_75679_c(31) == 19) {
         return tex19;
      } else if (c.func_70096_w().func_75679_c(31) == 20) {
         return tex20;
      } else if (c.func_70096_w().func_75679_c(31) == 21) {
         return tex21;
      } else if (c.func_70096_w().func_75679_c(31) == 22) {
         return tex22;
      } else if (c.func_70096_w().func_75679_c(31) == 23) {
         return tex23;
      } else {
         return c.func_70096_w().func_75679_c(31) == 24 ? tex24 : tex1;
      }
   }

   protected ResourceLocation func_110775_a(Entity z) {
      return this.getCowTextures(z);
   }
}
