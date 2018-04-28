package srcpet.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class modelpet9 extends ModelBase {
   private float wingspeed = 1.0F;
   ModelRenderer leftfootfront;
   ModelRenderer leftfootbase;
   ModelRenderer leftfootback;
   ModelRenderer leftfoottip;
   ModelRenderer leftshin;
   ModelRenderer leftcalf;
   ModelRenderer leftkneegaurd;
   ModelRenderer leftthigh;
   ModelRenderer rightfootfront;
   ModelRenderer rightfoottip;
   ModelRenderer rightfootbase;
   ModelRenderer rightfootback;
   ModelRenderer rightshin;
   ModelRenderer rightcalf;
   ModelRenderer rightkneegaurd;
   ModelRenderer rightthigh;
   ModelRenderer hips;
   ModelRenderer stomach;
   ModelRenderer chest;
   ModelRenderer neck;
   ModelRenderer head;
   ModelRenderer righttopspinebase;
   ModelRenderer lefttopspinebase;
   ModelRenderer righttopspinetip;
   ModelRenderer lefttopspinetip;
   ModelRenderer middlerightspinebase;
   ModelRenderer middleleftspinebase;
   ModelRenderer middleleftspinetip;
   ModelRenderer middlerightspinetip;
   ModelRenderer torso;
   ModelRenderer rightsholder;
   ModelRenderer leftsholder;
   ModelRenderer rightsholdergaurd;
   ModelRenderer sheildbase;
   ModelRenderer sheildtip;
   ModelRenderer rightupperarm;
   ModelRenderer rightlowerarm;
   ModelRenderer sheildend;
   ModelRenderer leftupperarm;
   ModelRenderer sholdergaurdtip;
   ModelRenderer cannonbase;
   ModelRenderer cannonend;
   ModelRenderer leftcannonpiece;
   ModelRenderer topcannonpiece;
   ModelRenderer rightcannonpiece;
   ModelRenderer bottomcannonpiece;
   ModelRenderer glowycannonbit1;
   ModelRenderer glowycannonbit2;
   ModelRenderer glowycannonbit3;
   ModelRenderer glowycannonbit4;
   ModelRenderer glowycannonbit5;
   ModelRenderer cannonammo;
   ModelRenderer lowerrightspinebase;
   ModelRenderer lowerleftspinebase;
   ModelRenderer lowerrightspinetip;
   ModelRenderer lowerleftspinetip;

   public modelpet9(float f1) {
      this.wingspeed = f1;
      this.field_78090_t = 512;
      this.field_78089_u = 512;
      this.leftfootfront = new ModelRenderer(this, 20, 50);
      this.leftfootfront.func_78789_a(-6.0F, 22.0F, -9.0F, 8, 5, 7);
      this.leftfootfront.func_78793_a(-8.0F, -3.0F, 6.0F);
      this.leftfootfront.func_78787_b(512, 512);
      this.leftfootfront.field_78809_i = true;
      this.setRotation(this.leftfootfront, 0.0F, 0.0F, 0.0F);
      this.leftfootbase = new ModelRenderer(this, 20, 100);
      this.leftfootbase.func_78789_a(-4.0F, 22.0F, -4.0F, 4, 5, 5);
      this.leftfootbase.func_78793_a(-8.0F, -3.0F, 6.0F);
      this.leftfootbase.func_78787_b(512, 512);
      this.leftfootbase.field_78809_i = true;
      this.setRotation(this.leftfootbase, 0.0F, 0.0F, 0.0F);
      this.leftfootback = new ModelRenderer(this, 20, 150);
      this.leftfootback.func_78789_a(-4.5F, 22.0F, 1.0F, 5, 5, 4);
      this.leftfootback.func_78793_a(-8.0F, -3.0F, 6.0F);
      this.leftfootback.func_78787_b(512, 512);
      this.leftfootback.field_78809_i = true;
      this.setRotation(this.leftfootback, 0.0F, 0.0F, 0.0F);
      this.leftfoottip = new ModelRenderer(this, 20, 200);
      this.leftfoottip.func_78789_a(-4.5F, 23.0F, -12.0F, 5, 4, 3);
      this.leftfoottip.func_78793_a(-8.0F, -3.0F, 6.0F);
      this.leftfoottip.func_78787_b(512, 512);
      this.leftfoottip.field_78809_i = true;
      this.setRotation(this.leftfoottip, 0.0F, 0.0F, 0.0F);
      this.leftshin = new ModelRenderer(this, 20, 250);
      this.leftshin.func_78789_a(-5.0F, 10.0F, -9.0F, 6, 13, 6);
      this.leftshin.func_78793_a(-8.0F, -3.0F, 6.0F);
      this.leftshin.func_78787_b(512, 512);
      this.leftshin.field_78809_i = true;
      this.setRotation(this.leftshin, 0.1745329F, 0.0F, 0.0F);
      this.leftcalf = new ModelRenderer(this, 20, 300);
      this.leftcalf.func_78789_a(-6.0F, 10.0F, -9.0F, 8, 8, 9);
      this.leftcalf.func_78793_a(-8.0F, -3.0F, 6.0F);
      this.leftcalf.func_78787_b(512, 512);
      this.leftcalf.field_78809_i = true;
      this.setRotation(this.leftcalf, 0.1745329F, 0.0F, 0.0F);
      this.leftkneegaurd = new ModelRenderer(this, 20, 350);
      this.leftkneegaurd.func_78789_a(-5.5F, 4.0F, -14.0F, 7, 7, 1);
      this.leftkneegaurd.func_78793_a(-8.0F, -3.0F, 6.0F);
      this.leftkneegaurd.func_78787_b(512, 512);
      this.leftkneegaurd.field_78809_i = true;
      this.setRotation(this.leftkneegaurd, 0.6283185F, 0.0F, 0.0F);
      this.leftthigh = new ModelRenderer(this, 20, 400);
      this.leftthigh.func_78789_a(-5.0F, 0.0F, -4.0F, 6, 13, 8);
      this.leftthigh.func_78793_a(-8.0F, -3.0F, 6.0F);
      this.leftthigh.func_78787_b(512, 512);
      this.leftthigh.field_78809_i = true;
      this.setRotation(this.leftthigh, -0.1745329F, 0.1745329F, 0.0F);
      this.rightfootfront = new ModelRenderer(this, 20, 450);
      this.rightfootfront.func_78789_a(0.0F, 22.0F, -9.0F, 8, 5, 7);
      this.rightfootfront.func_78793_a(5.0F, -3.0F, 6.0F);
      this.rightfootfront.func_78787_b(512, 512);
      this.rightfootfront.field_78809_i = true;
      this.setRotation(this.rightfootfront, 0.0F, 0.0F, 0.0F);
      this.rightfoottip = new ModelRenderer(this, 100, 50);
      this.rightfoottip.func_78789_a(1.5F, 23.0F, -12.0F, 5, 4, 3);
      this.rightfoottip.func_78793_a(5.0F, -3.0F, 6.0F);
      this.rightfoottip.func_78787_b(512, 512);
      this.rightfoottip.field_78809_i = true;
      this.setRotation(this.rightfoottip, 0.0F, 0.0F, 0.0F);
      this.rightfootbase = new ModelRenderer(this, 100, 150);
      this.rightfootbase.func_78789_a(2.0F, 22.0F, -4.0F, 4, 5, 5);
      this.rightfootbase.func_78793_a(5.0F, -3.0F, 6.0F);
      this.rightfootbase.func_78787_b(512, 512);
      this.rightfootbase.field_78809_i = true;
      this.setRotation(this.rightfootbase, 0.0F, 0.0F, 0.0F);
      this.rightfootback = new ModelRenderer(this, 100, 100);
      this.rightfootback.func_78789_a(1.5F, 22.0F, 1.0F, 5, 5, 4);
      this.rightfootback.func_78793_a(5.0F, -3.0F, 6.0F);
      this.rightfootback.func_78787_b(512, 512);
      this.rightfootback.field_78809_i = true;
      this.setRotation(this.rightfootback, 0.0F, 0.0F, 0.0F);
      this.rightshin = new ModelRenderer(this, 100, 200);
      this.rightshin.func_78789_a(1.0F, 10.0F, -9.0F, 6, 13, 6);
      this.rightshin.func_78793_a(5.0F, -3.0F, 6.0F);
      this.rightshin.func_78787_b(512, 512);
      this.rightshin.field_78809_i = true;
      this.setRotation(this.rightshin, 0.1745329F, 0.0F, 0.0F);
      this.rightcalf = new ModelRenderer(this, 100, 250);
      this.rightcalf.func_78789_a(0.0F, 10.0F, -10.0F, 8, 8, 9);
      this.rightcalf.func_78793_a(5.0F, -3.0F, 6.0F);
      this.rightcalf.func_78787_b(512, 512);
      this.rightcalf.field_78809_i = true;
      this.setRotation(this.rightcalf, 0.1745329F, 0.0F, 0.0F);
      this.rightkneegaurd = new ModelRenderer(this, 100, 300);
      this.rightkneegaurd.func_78789_a(0.5F, 4.0F, -15.0F, 7, 7, 1);
      this.rightkneegaurd.func_78793_a(5.0F, -3.0F, 6.0F);
      this.rightkneegaurd.func_78787_b(512, 512);
      this.rightkneegaurd.field_78809_i = true;
      this.setRotation(this.rightkneegaurd, 0.6283185F, 0.0F, 0.0F);
      this.rightthigh = new ModelRenderer(this, 100, 400);
      this.rightthigh.func_78789_a(0.0F, 0.0F, -5.0F, 6, 13, 8);
      this.rightthigh.func_78793_a(5.0F, -3.0F, 6.0F);
      this.rightthigh.func_78787_b(512, 512);
      this.rightthigh.field_78809_i = true;
      this.setRotation(this.rightthigh, -0.1745329F, -0.1745329F, 0.0F);
      this.rightthigh.field_78809_i = false;
      this.hips = new ModelRenderer(this, 100, 350);
      this.hips.func_78789_a(0.0F, 0.0F, 0.0F, 14, 7, 8);
      this.hips.func_78793_a(-8.0F, -3.0F, 2.0F);
      this.hips.func_78787_b(512, 512);
      this.hips.field_78809_i = true;
      this.setRotation(this.hips, 0.1396263F, 0.0F, 0.0F);
      this.stomach = new ModelRenderer(this, 100, 450);
      this.stomach.func_78789_a(0.0F, 0.0F, 0.0F, 12, 6, 7);
      this.stomach.func_78793_a(-7.0F, -9.0F, 2.0F);
      this.stomach.func_78787_b(512, 512);
      this.stomach.field_78809_i = true;
      this.setRotation(this.stomach, 0.1396263F, 0.0F, 0.0F);
      this.chest = new ModelRenderer(this, 200, 50);
      this.chest.func_78789_a(0.0F, 0.0F, 0.0F, 18, 12, 13);
      this.chest.func_78793_a(-10.0F, -23.0F, -4.0F);
      this.chest.func_78787_b(512, 512);
      this.chest.field_78809_i = true;
      this.setRotation(this.chest, 0.244346F, 0.0F, 0.0F);
      this.neck = new ModelRenderer(this, 200, 100);
      this.neck.func_78789_a(0.0F, 0.0F, 0.0F, 6, 7, 6);
      this.neck.func_78793_a(-4.0F, -22.0F, -7.0F);
      this.neck.func_78787_b(512, 512);
      this.neck.field_78809_i = true;
      this.setRotation(this.neck, 0.8726646F, 0.0F, 0.0F);
      this.head = new ModelRenderer(this, 200, 150);
      this.head.func_78789_a(-3.0F, -3.0F, -5.0F, 6, 6, 8);
      this.head.func_78793_a(-1.0F, -26.0F, -5.0F);
      this.head.func_78787_b(512, 512);
      this.head.field_78809_i = true;
      this.setRotation(this.head, 0.5235988F, 0.0F, 0.0F);
      this.righttopspinebase = new ModelRenderer(this, 200, 200);
      this.righttopspinebase.func_78789_a(0.0F, 0.0F, 0.0F, 2, 8, 2);
      this.righttopspinebase.func_78793_a(3.0F, -29.0F, 5.0F);
      this.righttopspinebase.func_78787_b(512, 512);
      this.righttopspinebase.field_78809_i = true;
      this.setRotation(this.righttopspinebase, -0.1396263F, 0.0F, 0.0F);
      this.lefttopspinebase = new ModelRenderer(this, 200, 250);
      this.lefttopspinebase.func_78789_a(0.0F, 0.0F, 0.0F, 2, 8, 2);
      this.lefttopspinebase.func_78793_a(-7.0F, -29.0F, 5.0F);
      this.lefttopspinebase.func_78787_b(512, 512);
      this.lefttopspinebase.field_78809_i = true;
      this.setRotation(this.lefttopspinebase, -0.1396263F, 0.0F, 0.0F);
      this.righttopspinetip = new ModelRenderer(this, 200, 300);
      this.righttopspinetip.func_78789_a(0.0F, 0.0F, 0.0F, 1, 8, 1);
      this.righttopspinetip.func_78793_a(3.5F, -35.0F, 8.0F);
      this.righttopspinetip.func_78787_b(512, 512);
      this.righttopspinetip.field_78809_i = true;
      this.setRotation(this.righttopspinetip, -0.3316126F, 0.0F, 0.0F);
      this.lefttopspinetip = new ModelRenderer(this, 200, 350);
      this.lefttopspinetip.func_78789_a(0.0F, 0.0F, 0.0F, 1, 8, 1);
      this.lefttopspinetip.func_78793_a(-6.5F, -35.0F, 8.0F);
      this.lefttopspinetip.func_78787_b(512, 512);
      this.lefttopspinetip.field_78809_i = true;
      this.setRotation(this.lefttopspinetip, -0.3316126F, 0.0F, 0.0F);
      this.middlerightspinebase = new ModelRenderer(this, 200, 400);
      this.middlerightspinebase.func_78789_a(0.0F, 0.0F, 0.0F, 2, 8, 2);
      this.middlerightspinebase.func_78793_a(-6.0F, -25.0F, 14.0F);
      this.middlerightspinebase.func_78787_b(512, 512);
      this.middlerightspinebase.field_78809_i = true;
      this.setRotation(this.middlerightspinebase, -0.6981317F, 0.0F, 0.0F);
      this.middleleftspinebase = new ModelRenderer(this, 200, 450);
      this.middleleftspinebase.func_78789_a(0.0F, 0.0F, 0.0F, 2, 8, 2);
      this.middleleftspinebase.func_78793_a(2.0F, -25.0F, 14.0F);
      this.middleleftspinebase.func_78787_b(512, 512);
      this.middleleftspinebase.field_78809_i = true;
      this.setRotation(this.middleleftspinebase, -0.6981317F, 0.0F, 0.0F);
      this.middleleftspinetip = new ModelRenderer(this, 300, 50);
      this.middleleftspinetip.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
      this.middleleftspinetip.func_78793_a(2.5F, -28.0F, 18.0F);
      this.middleleftspinetip.func_78787_b(512, 512);
      this.middleleftspinetip.field_78809_i = true;
      this.setRotation(this.middleleftspinetip, -0.7853982F, 0.0F, 0.0F);
      this.middlerightspinetip = new ModelRenderer(this, 300, 100);
      this.middlerightspinetip.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
      this.middlerightspinetip.func_78793_a(-5.5F, -28.0F, 18.0F);
      this.middlerightspinetip.func_78787_b(512, 512);
      this.middlerightspinetip.field_78809_i = true;
      this.setRotation(this.middlerightspinetip, -0.7853982F, 0.0F, 0.0F);
      this.torso = new ModelRenderer(this, 300, 150);
      this.torso.func_78789_a(0.0F, 0.0F, 0.0F, 14, 6, 10);
      this.torso.func_78793_a(-8.0F, -13.0F, 0.0F);
      this.torso.func_78787_b(512, 512);
      this.torso.field_78809_i = true;
      this.setRotation(this.torso, 0.1396263F, 0.0F, 0.0F);
      this.rightsholder = new ModelRenderer(this, 300, 200);
      this.rightsholder.func_78789_a(0.0F, -3.0F, -3.0F, 6, 6, 6);
      this.rightsholder.func_78793_a(7.0F, -18.0F, 4.0F);
      this.rightsholder.func_78787_b(512, 512);
      this.rightsholder.field_78809_i = true;
      this.setRotation(this.rightsholder, 0.0F, 0.0F, 0.0F);
      this.leftsholder = new ModelRenderer(this, 300, 250);
      this.leftsholder.func_78789_a(-6.0F, -3.0F, -3.0F, 6, 6, 6);
      this.leftsholder.func_78793_a(-9.0F, -18.0F, 4.0F);
      this.leftsholder.func_78787_b(512, 512);
      this.leftsholder.field_78809_i = true;
      this.setRotation(this.leftsholder, 0.0F, 0.0F, 0.0F);
      this.rightsholdergaurd = new ModelRenderer(this, 300, 300);
      this.rightsholdergaurd.func_78789_a(8.0F, -4.0F, -4.0F, 4, 12, 9);
      this.rightsholdergaurd.func_78793_a(7.0F, -18.0F, 4.0F);
      this.rightsholdergaurd.func_78787_b(512, 512);
      this.rightsholdergaurd.field_78809_i = true;
      this.setRotation(this.rightsholdergaurd, -0.20944F, 0.0F, 0.0F);
      this.sheildbase = new ModelRenderer(this, 300, 350);
      this.sheildbase.func_78789_a(8.0F, -4.0F, -30.0F, 3, 12, 19);
      this.sheildbase.func_78793_a(7.0F, -18.0F, 4.0F);
      this.sheildbase.func_78787_b(512, 512);
      this.sheildbase.field_78809_i = true;
      this.setRotation(this.sheildbase, 1.047198F, 0.0F, 0.0F);
      this.sheildtip = new ModelRenderer(this, 300, 400);
      this.sheildtip.func_78789_a(9.0F, -2.0F, -34.0F, 3, 8, 4);
      this.sheildtip.func_78793_a(6.0F, -18.0F, 4.0F);
      this.sheildtip.func_78787_b(512, 512);
      this.sheildtip.field_78809_i = true;
      this.setRotation(this.sheildtip, 1.047198F, 0.0F, 0.0F);
      this.rightupperarm = new ModelRenderer(this, 300, 450);
      this.rightupperarm.func_78789_a(3.0F, -1.0F, -4.0F, 6, 13, 6);
      this.rightupperarm.func_78793_a(7.0F, -18.0F, 4.0F);
      this.rightupperarm.func_78787_b(512, 512);
      this.rightupperarm.field_78809_i = true;
      this.setRotation(this.rightupperarm, -0.20944F, 0.0F, 0.0F);
      this.rightlowerarm = new ModelRenderer(this, 350, 50);
      this.rightlowerarm.func_78789_a(3.0F, 0.0F, -25.0F, 6, 6, 14);
      this.rightlowerarm.func_78793_a(7.0F, -18.0F, 4.0F);
      this.rightlowerarm.func_78787_b(512, 512);
      this.rightlowerarm.field_78809_i = true;
      this.setRotation(this.rightlowerarm, 1.047198F, 0.0F, 0.0F);
      this.sheildend = new ModelRenderer(this, 350, 100);
      this.sheildend.func_78789_a(8.0F, -1.0F, -11.0F, 3, 8, 4);
      this.sheildend.func_78793_a(7.0F, -18.0F, 4.0F);
      this.sheildend.func_78787_b(512, 512);
      this.sheildend.field_78809_i = true;
      this.setRotation(this.sheildend, 1.047198F, 0.0F, 0.0F);
      this.leftupperarm = new ModelRenderer(this, 350, 200);
      this.leftupperarm.func_78789_a(-9.0F, -1.0F, -4.0F, 6, 15, 6);
      this.leftupperarm.func_78793_a(-9.0F, -18.0F, 4.0F);
      this.leftupperarm.func_78787_b(512, 512);
      this.leftupperarm.field_78809_i = true;
      this.setRotation(this.leftupperarm, -0.20944F, 0.0F, 0.0F);
      this.sholdergaurdtip = new ModelRenderer(this, 350, 250);
      this.sholdergaurdtip.func_78789_a(10.0F, -3.0F, -7.0F, 2, 5, 3);
      this.sholdergaurdtip.func_78793_a(7.0F, -18.0F, 4.0F);
      this.sholdergaurdtip.func_78787_b(512, 512);
      this.sholdergaurdtip.field_78809_i = true;
      this.setRotation(this.sholdergaurdtip, -0.20944F, 0.0F, 0.0F);
      this.cannonbase = new ModelRenderer(this, 350, 300);
      this.cannonbase.func_78789_a(-4.0F, 0.0F, -4.0F, 8, 12, 8);
      this.cannonbase.func_78793_a(-15.0F, -5.0F, 1.0F);
      this.cannonbase.func_78787_b(512, 512);
      this.cannonbase.field_78809_i = true;
      this.setRotation(this.cannonbase, -0.6981317F, 0.0F, 0.0F);
      this.cannonend = new ModelRenderer(this, 350, 400);
      this.cannonend.func_78789_a(-3.0F, 11.0F, -3.0F, 6, 4, 6);
      this.cannonend.func_78793_a(-15.0F, -5.0F, 1.0F);
      this.cannonend.func_78787_b(512, 512);
      this.cannonend.field_78809_i = true;
      this.setRotation(this.cannonend, -0.6981317F, 0.0F, 0.0F);
      this.leftcannonpiece = new ModelRenderer(this, 20, 20);
      this.leftcannonpiece.func_78789_a(-5.0F, 11.0F, -1.5F, 3, 6, 3);
      this.leftcannonpiece.func_78793_a(-15.0F, -5.0F, 1.0F);
      this.leftcannonpiece.func_78787_b(512, 512);
      this.leftcannonpiece.field_78809_i = true;
      this.setRotation(this.leftcannonpiece, -0.6981317F, 0.0F, 0.0F);
      this.topcannonpiece = new ModelRenderer(this, 40, 20);
      this.topcannonpiece.func_78789_a(-1.5F, 11.0F, -5.0F, 3, 6, 3);
      this.topcannonpiece.func_78793_a(-15.0F, -5.0F, 1.0F);
      this.topcannonpiece.func_78787_b(512, 512);
      this.topcannonpiece.field_78809_i = true;
      this.setRotation(this.topcannonpiece, -0.6981317F, 0.0F, 0.0F);
      this.rightcannonpiece = new ModelRenderer(this, 80, 20);
      this.rightcannonpiece.func_78789_a(2.0F, 11.0F, -1.5F, 3, 6, 3);
      this.rightcannonpiece.func_78793_a(-15.0F, -5.0F, 1.0F);
      this.rightcannonpiece.func_78787_b(512, 512);
      this.rightcannonpiece.field_78809_i = true;
      this.setRotation(this.rightcannonpiece, -0.6981317F, 0.0F, 0.0F);
      this.bottomcannonpiece = new ModelRenderer(this, 100, 20);
      this.bottomcannonpiece.func_78789_a(-1.5F, 11.0F, 2.0F, 3, 6, 3);
      this.bottomcannonpiece.func_78793_a(-15.0F, -5.0F, 1.0F);
      this.bottomcannonpiece.func_78787_b(512, 512);
      this.bottomcannonpiece.field_78809_i = true;
      this.setRotation(this.bottomcannonpiece, -0.6981317F, 0.0F, 0.0F);
      this.glowycannonbit1 = new ModelRenderer(this, 150, 20);
      this.glowycannonbit1.func_78789_a(-3.5F, 0.0F, -11.0F, 2, 5, 2);
      this.glowycannonbit1.func_78793_a(-15.0F, -5.0F, 1.0F);
      this.glowycannonbit1.func_78787_b(512, 512);
      this.glowycannonbit1.field_78809_i = true;
      this.setRotation(this.glowycannonbit1, 0.1745329F, 0.0F, 0.0F);
      this.glowycannonbit2 = new ModelRenderer(this, 200, 20);
      this.glowycannonbit2.func_78789_a(1.5F, 0.0F, -11.0F, 2, 5, 2);
      this.glowycannonbit2.func_78793_a(-15.0F, -5.0F, 1.0F);
      this.glowycannonbit2.func_78787_b(512, 512);
      this.glowycannonbit2.field_78809_i = true;
      this.setRotation(this.glowycannonbit2, 0.1745329F, 0.0F, 0.0F);
      this.glowycannonbit3 = new ModelRenderer(this, 250, 20);
      this.glowycannonbit3.func_78789_a(-3.0F, -2.0F, -8.0F, 2, 5, 2);
      this.glowycannonbit3.func_78793_a(-15.0F, -5.0F, 1.0F);
      this.glowycannonbit3.func_78787_b(512, 512);
      this.glowycannonbit3.field_78809_i = true;
      this.setRotation(this.glowycannonbit3, 0.0872665F, 0.0F, 0.0F);
      this.glowycannonbit4 = new ModelRenderer(this, 300, 20);
      this.glowycannonbit4.func_78789_a(1.0F, -2.0F, -8.0F, 2, 5, 2);
      this.glowycannonbit4.func_78793_a(-15.0F, -5.0F, 1.0F);
      this.glowycannonbit4.func_78787_b(512, 512);
      this.glowycannonbit4.field_78809_i = true;
      this.setRotation(this.glowycannonbit4, 0.0872665F, 0.0F, 0.0F);
      this.glowycannonbit5 = new ModelRenderer(this, 350, 20);
      this.glowycannonbit5.func_78789_a(-1.0F, -5.0F, -5.0F, 2, 5, 2);
      this.glowycannonbit5.func_78793_a(-15.0F, -5.0F, 1.0F);
      this.glowycannonbit5.func_78787_b(512, 512);
      this.glowycannonbit5.field_78809_i = true;
      this.setRotation(this.glowycannonbit5, 0.0F, 0.0F, 0.0F);
      this.cannonammo = new ModelRenderer(this, 400, 400);
      this.cannonammo.func_78789_a(-6.0F, 3.0F, 0.0F, 5, 5, 5);
      this.cannonammo.func_78793_a(-15.0F, -5.0F, 1.0F);
      this.cannonammo.func_78787_b(512, 512);
      this.cannonammo.field_78809_i = true;
      this.setRotation(this.cannonammo, -0.6981317F, 0.0F, 0.0F);
      this.lowerrightspinebase = new ModelRenderer(this, 400, 450);
      this.lowerrightspinebase.func_78789_a(0.0F, 0.0F, 0.0F, 2, 8, 2);
      this.lowerrightspinebase.func_78793_a(4.0F, -19.0F, 15.0F);
      this.lowerrightspinebase.func_78787_b(512, 512);
      this.lowerrightspinebase.field_78809_i = true;
      this.setRotation(this.lowerrightspinebase, -1.047198F, 0.0F, 0.0F);
      this.lowerleftspinebase = new ModelRenderer(this, 360, 450);
      this.lowerleftspinebase.func_78789_a(0.0F, 0.0F, 0.0F, 2, 8, 2);
      this.lowerleftspinebase.func_78793_a(-8.0F, -19.0F, 15.0F);
      this.lowerleftspinebase.func_78787_b(512, 512);
      this.lowerleftspinebase.field_78809_i = true;
      this.setRotation(this.lowerleftspinebase, -1.047198F, 0.0F, 0.0F);
      this.lowerrightspinetip = new ModelRenderer(this, 250, 100);
      this.lowerrightspinetip.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
      this.lowerrightspinetip.func_78793_a(4.5F, -21.0F, 20.0F);
      this.lowerrightspinetip.func_78787_b(512, 512);
      this.lowerrightspinetip.field_78809_i = true;
      this.setRotation(this.lowerrightspinetip, -1.134464F, 0.0F, 0.0F);
      this.lowerleftspinetip = new ModelRenderer(this, 150, 100);
      this.lowerleftspinetip.func_78789_a(0.0F, 0.0F, 0.0F, 1, 7, 1);
      this.lowerleftspinetip.func_78793_a(-7.5F, -21.0F, 20.0F);
      this.lowerleftspinetip.func_78787_b(512, 512);
      this.lowerleftspinetip.field_78809_i = true;
      this.setRotation(this.lowerleftspinetip, -1.134464F, 0.0F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      GL11.glPushMatrix();
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      GL11.glTranslatef(0.0F, 1.5F, 0.0F);
      float newangle = 0.0F;
      float nextangle = 0.0F;
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      if ((double)f1 > 0.1D) {
         newangle = MathHelper.func_76134_b(f2 * 0.5F * this.wingspeed) * 3.141593F * 0.15F * f1;
      } else {
         newangle = 0.0F;
      }

      this.leftfootfront.field_78795_f = newangle;
      this.leftfootbase.field_78795_f = newangle;
      this.leftfootback.field_78795_f = newangle;
      this.leftfoottip.field_78795_f = newangle;
      this.leftshin.field_78795_f = newangle;
      this.leftcalf.field_78795_f = newangle + 0.175F;
      this.leftkneegaurd.field_78795_f = newangle + 0.63F;
      this.leftthigh.field_78795_f = newangle - 0.175F;
      this.rightfootfront.field_78795_f = -newangle;
      this.rightfoottip.field_78795_f = -newangle;
      this.rightfootbase.field_78795_f = -newangle;
      this.rightfootback.field_78795_f = -newangle;
      this.rightshin.field_78795_f = -newangle;
      this.rightcalf.field_78795_f = -newangle + 0.175F;
      this.rightkneegaurd.field_78795_f = -newangle + 0.63F;
      this.rightthigh.field_78795_f = -newangle - 0.175F;
      this.head.field_78796_g = (float)Math.toRadians((double)f3 / 1.5D);
      float amp = 0.7853982F;
      newangle = 0.0F;
      this.rightsholder.field_78795_f = -newangle;
      this.rightsholdergaurd.field_78795_f = -newangle - 0.21F;
      this.sheildbase.field_78795_f = -newangle + 1.047F;
      this.sheildtip.field_78795_f = -newangle + 1.047F;
      this.rightupperarm.field_78795_f = -newangle - 0.21F;
      this.rightlowerarm.field_78795_f = -newangle + 1.047F;
      this.sheildend.field_78795_f = -newangle + 1.04F;
      this.sholdergaurdtip.field_78795_f = -newangle - 0.21F;
      newangle = 0.0F;
      this.leftsholder.field_78795_f = -newangle;
      this.leftupperarm.field_78795_f = -newangle - 0.21F;
      this.cannonbase.field_78795_f = -newangle - 0.7F;
      this.cannonend.field_78795_f = -newangle - 0.7F;
      this.leftcannonpiece.field_78795_f = -newangle - 0.7F;
      this.topcannonpiece.field_78795_f = -newangle - 0.7F;
      this.rightcannonpiece.field_78795_f = -newangle - 0.7F;
      this.bottomcannonpiece.field_78795_f = -newangle - 0.7F;
      this.glowycannonbit1.field_78795_f = -newangle + 0.17F;
      this.glowycannonbit2.field_78795_f = -newangle + 0.17F;
      this.glowycannonbit3.field_78795_f = -newangle + 0.08F;
      this.glowycannonbit4.field_78795_f = -newangle + 0.08F;
      this.glowycannonbit5.field_78795_f = -newangle;
      this.cannonammo.field_78795_f = -newangle - 0.7F;
      double newposy = (double)((float)((double)this.leftsholder.field_78797_d + Math.cos((double)this.leftupperarm.field_78795_f) * 14.0D));
      double newposz = (double)((float)((double)this.leftsholder.field_78798_e + Math.sin((double)this.leftupperarm.field_78795_f) * 14.0D));
      this.cannonbase.field_78797_d = (float)newposy;
      this.cannonbase.field_78798_e = (float)newposz;
      this.cannonend.field_78797_d = (float)newposy;
      this.cannonend.field_78798_e = (float)newposz;
      this.leftcannonpiece.field_78797_d = (float)newposy;
      this.leftcannonpiece.field_78798_e = (float)newposz;
      this.topcannonpiece.field_78797_d = (float)newposy;
      this.topcannonpiece.field_78798_e = (float)newposz;
      this.rightcannonpiece.field_78797_d = (float)newposy;
      this.rightcannonpiece.field_78798_e = (float)newposz;
      this.bottomcannonpiece.field_78797_d = (float)newposy;
      this.bottomcannonpiece.field_78798_e = (float)newposz;
      this.glowycannonbit1.field_78797_d = (float)newposy;
      this.glowycannonbit1.field_78798_e = (float)newposz;
      this.glowycannonbit2.field_78797_d = (float)newposy;
      this.glowycannonbit2.field_78798_e = (float)newposz;
      this.glowycannonbit3.field_78797_d = (float)newposy;
      this.glowycannonbit3.field_78798_e = (float)newposz;
      this.glowycannonbit4.field_78797_d = (float)newposy;
      this.glowycannonbit4.field_78798_e = (float)newposz;
      this.glowycannonbit5.field_78797_d = (float)newposy;
      this.glowycannonbit5.field_78798_e = (float)newposz;
      this.cannonammo.field_78797_d = (float)newposy;
      this.cannonammo.field_78798_e = (float)newposz;
      this.leftfootfront.func_78785_a(f5);
      this.leftfootbase.func_78785_a(f5);
      this.leftfootback.func_78785_a(f5);
      this.leftfoottip.func_78785_a(f5);
      this.leftshin.func_78785_a(f5);
      this.leftcalf.func_78785_a(f5);
      this.leftkneegaurd.func_78785_a(f5);
      this.leftthigh.func_78785_a(f5);
      this.rightfootfront.func_78785_a(f5);
      this.rightfoottip.func_78785_a(f5);
      this.rightfootbase.func_78785_a(f5);
      this.rightfootback.func_78785_a(f5);
      this.rightshin.func_78785_a(f5);
      this.rightcalf.func_78785_a(f5);
      this.rightkneegaurd.func_78785_a(f5);
      this.rightthigh.func_78785_a(f5);
      this.hips.func_78785_a(f5);
      this.stomach.func_78785_a(f5);
      this.chest.func_78785_a(f5);
      this.neck.func_78785_a(f5);
      this.head.func_78785_a(f5);
      this.righttopspinebase.func_78785_a(f5);
      this.lefttopspinebase.func_78785_a(f5);
      this.righttopspinetip.func_78785_a(f5);
      this.lefttopspinetip.func_78785_a(f5);
      this.middlerightspinebase.func_78785_a(f5);
      this.middleleftspinebase.func_78785_a(f5);
      this.middleleftspinetip.func_78785_a(f5);
      this.middlerightspinetip.func_78785_a(f5);
      this.torso.func_78785_a(f5);
      this.rightsholder.func_78785_a(f5);
      this.leftsholder.func_78785_a(f5);
      this.rightsholdergaurd.func_78785_a(f5);
      this.sheildbase.func_78785_a(f5);
      this.sheildtip.func_78785_a(f5);
      this.rightupperarm.func_78785_a(f5);
      this.rightlowerarm.func_78785_a(f5);
      this.sheildend.func_78785_a(f5);
      this.leftupperarm.func_78785_a(f5);
      this.sholdergaurdtip.func_78785_a(f5);
      this.cannonbase.func_78785_a(f5);
      this.cannonend.func_78785_a(f5);
      this.leftcannonpiece.func_78785_a(f5);
      this.topcannonpiece.func_78785_a(f5);
      this.rightcannonpiece.func_78785_a(f5);
      this.bottomcannonpiece.func_78785_a(f5);
      this.glowycannonbit1.func_78785_a(f5);
      this.glowycannonbit2.func_78785_a(f5);
      this.glowycannonbit3.func_78785_a(f5);
      this.glowycannonbit4.func_78785_a(f5);
      this.glowycannonbit5.func_78785_a(f5);
      this.cannonammo.func_78785_a(f5);
      this.lowerrightspinebase.func_78785_a(f5);
      this.lowerleftspinebase.func_78785_a(f5);
      this.lowerrightspinetip.func_78785_a(f5);
      this.lowerleftspinetip.func_78785_a(f5);
      GL11.glPopMatrix();
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.field_78795_f = x;
      model.field_78796_g = y;
      model.field_78808_h = z;
   }
}
