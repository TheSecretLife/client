package cabalaccessorys.blockshop;

import cabalaccessorys.client.GuestSide;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class sellermodel extends ModelBase {
   private ResourceLocation texture;
   ModelRenderer head;
   ModelRenderer body;
   ModelRenderer rightarm;
   ModelRenderer leftarm;
   ModelRenderer rightleg;
   ModelRenderer leftleg;

   public sellermodel() {
      this.field_78090_t = 64;
      this.field_78089_u = 32;
      this.head = new ModelRenderer(this, 0, 0);
      this.head.func_78789_a(-4.0F, -8.0F, -4.0F, 8, 8, 8);
      this.head.func_78793_a(0.0F, 0.0F, 0.0F);
      this.head.func_78787_b(64, 32);
      this.head.field_78809_i = true;
      this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
      this.body = new ModelRenderer(this, 16, 16);
      this.body.func_78789_a(-4.0F, 0.0F, -2.0F, 8, 12, 4);
      this.body.func_78793_a(0.0F, 0.0F, 0.0F);
      this.body.func_78787_b(64, 32);
      this.body.field_78809_i = true;
      this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
      this.rightarm = new ModelRenderer(this, 40, 16);
      this.rightarm.func_78789_a(-3.0F, -2.0F, -2.0F, 4, 12, 4);
      this.rightarm.func_78793_a(-5.0F, 2.0F, 0.0F);
      this.rightarm.func_78787_b(64, 32);
      this.rightarm.field_78809_i = true;
      this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
      this.leftarm = new ModelRenderer(this, 40, 16);
      this.leftarm.func_78789_a(-1.0F, -2.0F, -2.0F, 4, 12, 4);
      this.leftarm.func_78793_a(5.0F, 2.0F, 0.0F);
      this.leftarm.func_78787_b(64, 32);
      this.leftarm.field_78809_i = true;
      this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
      this.rightleg = new ModelRenderer(this, 0, 16);
      this.rightleg.func_78789_a(-2.0F, 0.0F, -2.0F, 4, 12, 4);
      this.rightleg.func_78793_a(-2.0F, 12.0F, 0.0F);
      this.rightleg.func_78787_b(64, 32);
      this.rightleg.field_78809_i = true;
      this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
      this.leftleg = new ModelRenderer(this, 0, 16);
      this.leftleg.func_78789_a(-2.0F, 0.0F, -2.0F, 4, 12, 4);
      this.leftleg.func_78793_a(2.0F, 12.0F, 0.0F);
      this.leftleg.func_78787_b(64, 32);
      this.leftleg.field_78809_i = true;
      this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      this.head.func_78785_a(f5);
      this.body.func_78785_a(f5);
      this.rightarm.func_78785_a(f5);
      this.leftarm.func_78785_a(f5);
      this.rightleg.func_78785_a(f5);
      this.leftleg.func_78785_a(f5);
      this.texture = new ResourceLocation("cabalaccessorys:textures/shop.png");
      Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texture);
      GuestSide.shop.func_78088_a(entity, f, f1, f2, f3, f4, f5);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.field_78795_f = x;
      model.field_78796_g = y;
      model.field_78808_h = z;
   }

   public void setRotationAngles(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78087_a(f, f1, f2, f3, f4, f5, entity);
   }
}
