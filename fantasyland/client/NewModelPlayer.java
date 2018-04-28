package fantasyland.client;

import cabalaccessorys.CustomSword;
import cabalaccessorys.RegisterItem;
import cabalaccessorys.mh;
import cabalaccessorys.api.TextureSetting;
import cabalaccessorys.client.GuestSide;
import cabalaccessorys.data.PlayerData;
import com.mojang.authlib.GameProfile;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fantasyland.monster.AssetManager;
import fantasyland.player.StoreData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import net.minecraftforge.client.event.RenderPlayerEvent.SetArmorModel;
import net.minecraftforge.client.event.RenderPlayerEvent.Specials.Post;
import net.minecraftforge.client.event.RenderPlayerEvent.Specials.Pre;
import net.minecraftforge.client.model.obj.GroupObject;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.opengl.GL11;
import utilities.SagaModelLoader;
import utilities.sagaobj;

public class NewModelPlayer extends RenderPlayer {
   public static final ResourceLocation TEXTUREs = new ResourceLocation("fantasyland", "models/dragonset/dragonset.png");
   public static ResourceLocation TEXTUREs2 = new ResourceLocation("fantasyland", "models/dragonset/headplayer.png");
   public static ResourceLocation skintexture = new ResourceLocation("fantasyland", "models/bskin.png");
   public static final sagaobj modelhead = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/dragonhelm2.saga");
   public static final ArrayList partmodelhead;
   public static final sagaobj modelhelm;
   public static final ArrayList partmodelhelm;
   public static final sagaobj modelguardhelm;
   public static final ArrayList partmodelguardhelm;
   public static final sagaobj modelflamehelm;
   public static final ArrayList partmodelflamehelm;
   public static final sagaobj modelarmor;
   public static final ArrayList partmodelarmor;
   public static final sagaobj modellarm;
   public static final ArrayList partmodellarm;
   public static final sagaobj modelrarm;
   public static final ArrayList partmodelrarm;
   public static final sagaobj modellleg;
   public static final ArrayList partmodellleg;
   public static final sagaobj modelrleg;
   public static final ArrayList partmodelrleg;
   public static final sagaobj modelguardarmor;
   public static final ArrayList partmodelguardarmor;
   public static final sagaobj modelguardLarm;
   public static final ArrayList partmodelguardLarm;
   public static final sagaobj modelguardRarm;
   public static final ArrayList partmodelguardRarm;
   public static final sagaobj modelguardLleg;
   public static final ArrayList partmodelguardLleg;
   public static final sagaobj modelguardRleg;
   public static final ArrayList partmodelguardRleg;
   public static final sagaobj modelflamearmor;
   public static final ArrayList partmodelflamearmor;
   public static final sagaobj modelflameLarm;
   public static final ArrayList partmodelflameLarm;
   public static final sagaobj modelflameRarm;
   public static final ArrayList partmodelflameRarm;
   public static final sagaobj modelflameLleg;
   public static final ArrayList partmodelflameLleg;
   public static final sagaobj modelflameRleg;
   public static final ArrayList partmodelflameRleg;
   public static final sagaobj modelflamecape;
   public static final ArrayList partmodelflamecape;
   public static final sagaobj modelhair1;
   public static final ArrayList parthair1;
   public static final sagaobj modelhair2;
   public static final ArrayList parthair2;
   public static final sagaobj modelhair3;
   public static final ArrayList parthair3;
   public static final sagaobj modelhair4;
   public static final ArrayList parthair4;
   public static final sagaobj modelhair5;
   public static final ArrayList parthair5;
   public static final sagaobj modelhair6;
   public static final ArrayList parthair6;
   public static final sagaobj modelhair7;
   public static final ArrayList parthair7;
   public static final sagaobj modelhair8;
   public static final ArrayList parthair8;
   public static final sagaobj modelhair9;
   public static final ArrayList parthair9;
   public static final sagaobj modelhair10;
   public static final ArrayList parthair10;
   public static final sagaobj modelghair1;
   public static final ArrayList partghair1;
   public static final sagaobj modelghair2;
   public static final ArrayList partghair2;
   public static final sagaobj modelghair3;
   public static final ArrayList partghair3;
   public static final sagaobj modelghair4;
   public static final ArrayList partghair4;
   public static final sagaobj modelghair5;
   public static final ArrayList partghair5;
   public static final sagaobj modelghair6;
   public static final ArrayList partghair6;
   public static final sagaobj modelghair7;
   public static final ArrayList partghair7;
   public static final sagaobj modelghair8;
   public static final ArrayList partghair8;
   public static final sagaobj modelghair9;
   public static final ArrayList partghair9;
   public static final sagaobj modelghair10;
   public static final ArrayList partghair10;
   public static final sagaobj modelghair11;
   public static final ArrayList partghair11;
   public static final sagaobj modelghair12;
   public static final ArrayList partghair12;
   public static final sagaobj modelghair13;
   public static final ArrayList partghair13;
   public static final sagaobj modelghair14;
   public static final ArrayList partghair14;
   public static final sagaobj modelghair15;
   public static final ArrayList partghair15;
   private ResourceLocation girltexbody = new ResourceLocation("fantasyland:models/girl/body.png");
   private ResourceLocation girltexarm = new ResourceLocation("fantasyland:models/girl/arm.png");
   private ResourceLocation girltexleg = new ResourceLocation("fantasyland:models/girl/leg.png");
   public static final sagaobj girlbody;
   public static final sagaobj girlrarm;
   public static final sagaobj girllarm;
   public static final sagaobj girlrleg;
   public static final sagaobj girllleg;
   private ResourceLocation texture;
   public static final sagaobj model_boy_head;
   public static final sagaobj model_boy_hair;
   public static final sagaobj model_boy_rarm;
   public static final sagaobj model_boy_larm;
   public static final sagaobj model_boy_rleg;
   public static final sagaobj model_boy_lleg;
   public static final sagaobj model_boy_body;
   public static final ResourceLocation set01atex;
   public static final ResourceLocation set01btex;
   public static final ResourceLocation set01ctex;
   public static final ResourceLocation set01dtex;
   public static final ResourceLocation set01etex;
   public static final sagaobj set01head;
   public static final ArrayList pset01head;
   public static final sagaobj set01body;
   public static final ArrayList pset01body;
   public static final sagaobj set01rarm;
   public static final ArrayList pset01rarm;
   public static final sagaobj set01larm;
   public static final ArrayList pset01larm;
   public static final sagaobj set01rleg;
   public static final ArrayList pset01rleg;
   public static final sagaobj set01lleg;
   public static final ArrayList pset01lleg;
   public static final ResourceLocation set06tex;
   public static final ResourceLocation set07tex;
   public static final ResourceLocation set08tex;
   public static final ResourceLocation set09tex;
   public static final ResourceLocation set10tex;
   public static final sagaobj set02head;
   public static final ArrayList pset02head;
   public static final sagaobj set02body;
   public static final ArrayList pset02body;
   public static final sagaobj set02rarm;
   public static final ArrayList pset02rarm;
   public static final sagaobj set02larm;
   public static final ArrayList pset02larm;
   public static final ResourceLocation set11tex;
   public static final ResourceLocation set12tex;
   public static final ResourceLocation set13tex;
   public static final ResourceLocation set14tex;
   public static final ResourceLocation set15tex;
   public static final sagaobj set03head;
   public static final ArrayList pset03head;
   public static final sagaobj set03body;
   public static final ArrayList pset03body;
   public static final sagaobj set03cape;
   public static final ArrayList pset03cape;
   public static final sagaobj set03rarm;
   public static final ArrayList pset03rarm;
   public static final sagaobj set03larm;
   public static final ArrayList pset03larm;
   public static final sagaobj set03rleg;
   public static final ArrayList pset03rleg;
   public static final sagaobj set03lleg;
   public static final ArrayList pset03lleg;
   public static final ResourceLocation set16tex;
   public static final ResourceLocation set17tex;
   public static final ResourceLocation set18tex;
   public static final ResourceLocation set19tex;
   public static final ResourceLocation set20tex;
   public static final sagaobj set04head;
   public static final ArrayList pset04head;
   public static final sagaobj set04body;
   public static final ArrayList pset04body;
   public static final sagaobj set04rarm;
   public static final ArrayList pset04rarm;
   public static final sagaobj set04larm;
   public static final ArrayList pset04larm;
   public static final ResourceLocation um1tex;
   public static final sagaobj um1md;
   public static final ArrayList pum1;
   public static final ResourceLocation um2tex;
   public static final sagaobj um2md;
   public static final ArrayList pum2;
   public static final ResourceLocation um3tex;
   public static final sagaobj um3md;
   public static final ArrayList pum3;
   public static final ResourceLocation um4tex;
   public static final sagaobj um4md;
   public static final ArrayList pum4;
   public static ModelRenderer leftarm;
   public static ModelRenderer rightleg;
   public static ModelRenderer leftleg;
   public static ModelRenderer head;
   public ModelRenderer body;
   public static ModelRenderer rightarm;
   public static ModelRenderer Wing01;
   public static ModelRenderer Wing02;
   public static ModelRenderer Shield;
   public static ModelRenderer Shape1;
   private sagaobj modelnewwing = (sagaobj)SagaModelLoader.loadModel(new ResourceLocation("cabalaccessorys", "models/newwing/model.saga"));
   private final ResourceLocation texwingold1 = new ResourceLocation("cabalaccessorys", "textures/modelwing/item.Wing01.png");
   private final ResourceLocation texwingold2 = new ResourceLocation("cabalaccessorys", "textures/modelwing/item.Wing02.png");
   private final ResourceLocation texwingold3 = new ResourceLocation("cabalaccessorys", "textures/modelwing/item.Wing03.png");
   private final ResourceLocation texwingold4 = new ResourceLocation("cabalaccessorys", "textures/modelwing/item.Wing04.png");
   private final ResourceLocation texwingold5 = new ResourceLocation("cabalaccessorys", "textures/modelwing/item.Wing05.png");
   private final ResourceLocation texwingold6 = new ResourceLocation("cabalaccessorys", "textures/modelwing/item.Wing06.png");
   private final ResourceLocation texwingold7 = new ResourceLocation("cabalaccessorys", "textures/modelwing/item.Wing07.png");
   private final ResourceLocation texwingold8 = new ResourceLocation("cabalaccessorys", "textures/modelwing/item.Wing08.png");
   private final ResourceLocation texwingold9 = new ResourceLocation("cabalaccessorys", "textures/modelwing/item.Wing09.png");
   private final ResourceLocation texwingold10 = new ResourceLocation("cabalaccessorys", "textures/modelwing/item.Wing10.png");
   private final ResourceLocation texwing1 = new ResourceLocation("cabalaccessorys", "models/newwing/1.png");
   private final ResourceLocation texwing2 = new ResourceLocation("cabalaccessorys", "models/newwing/2.png");
   private final ResourceLocation texwing3 = new ResourceLocation("cabalaccessorys", "models/newwing/3.png");
   private final ResourceLocation texwing4 = new ResourceLocation("cabalaccessorys", "models/newwing/4.png");
   private final ResourceLocation texwing5 = new ResourceLocation("cabalaccessorys", "models/newwing/5.png");
   private final ResourceLocation texwing6 = new ResourceLocation("cabalaccessorys", "models/newwing/6.png");
   private final ResourceLocation texwing7 = new ResourceLocation("cabalaccessorys", "models/newwing/7.png");
   private final ResourceLocation texwing8 = new ResourceLocation("cabalaccessorys", "models/newwing/8.png");
   private final ResourceLocation texwing9 = new ResourceLocation("cabalaccessorys", "models/newwing/9.png");
   private final ResourceLocation texwing10 = new ResourceLocation("cabalaccessorys", "models/newwing/10.png");
   private final ResourceLocation texwing11 = new ResourceLocation("cabalaccessorys", "models/newwing/11.png");
   private final ResourceLocation texwing12 = new ResourceLocation("cabalaccessorys", "models/newwing/12.png");
   private final ResourceLocation texwing13 = new ResourceLocation("cabalaccessorys", "models/newwing/13.png");
   private final ResourceLocation texwing14 = new ResourceLocation("cabalaccessorys", "models/newwing/14.png");
   private final ResourceLocation texwing15 = new ResourceLocation("cabalaccessorys", "models/newwing/15.png");
   private final ResourceLocation texwing16 = new ResourceLocation("cabalaccessorys", "models/newwing/16.png");
   private sagaobj modelnewbuff = (sagaobj)SagaModelLoader.loadModel(new ResourceLocation("cabalaccessorys", "models/newbuff/buff1.saga"));
   private sagaobj modelnewbuff2 = (sagaobj)SagaModelLoader.loadModel(new ResourceLocation("cabalaccessorys", "models/newbuff/buff2.saga"));
   private sagaobj modelnewbuff3 = (sagaobj)SagaModelLoader.loadModel(new ResourceLocation("cabalaccessorys", "models/newbuff/buff3.saga"));
   private sagaobj modelnewbuff4 = (sagaobj)SagaModelLoader.loadModel(new ResourceLocation("cabalaccessorys", "models/newbuff/buff4.saga"));
   private sagaobj modelnewbuff5 = (sagaobj)SagaModelLoader.loadModel(new ResourceLocation("cabalaccessorys", "models/newbuff/buff5.saga"));
   private sagaobj modelnewbuff6 = (sagaobj)SagaModelLoader.loadModel(new ResourceLocation("cabalaccessorys", "models/newbuff/buff6.saga"));
   private final ResourceLocation texbuff = new ResourceLocation("cabalaccessorys", "models/newbuff/buff1.png");
   private final ResourceLocation texbuff2 = new ResourceLocation("cabalaccessorys", "models/newbuff/buff2.png");
   private final ResourceLocation texbuff3 = new ResourceLocation("cabalaccessorys", "models/newbuff/buff3.png");
   private final ResourceLocation texbuff4 = new ResourceLocation("cabalaccessorys", "models/newbuff/buff4.png");
   private final ResourceLocation texbuff5 = new ResourceLocation("cabalaccessorys", "models/newbuff/buff5.png");
   private final ResourceLocation texbuff6 = new ResourceLocation("cabalaccessorys", "models/newbuff/buff6.png");
   @SideOnly(Side.CLIENT)
   public static final ModelBase mh;

   public NewModelPlayer() {
      leftarm = new ModelRenderer(this.field_77109_a, 40, 16);
      leftarm.field_78809_i = true;
      leftarm.func_78789_a(-1.0F, -2.0F, -2.0F, 4, 12, 4);
      leftarm.func_78793_a(5.0F, 2.0F, 0.0F);
      leftarm.func_78787_b(64, 32);
      rightleg = new ModelRenderer(this.field_77109_a, 0, 16);
      rightleg.func_78789_a(-2.0F, 0.0F, -2.0F, 4, 12, 4);
      rightleg.func_78793_a(-2.0F, 12.0F, 0.0F);
      rightleg.func_78787_b(64, 32);
      rightleg.field_78809_i = true;
      leftleg = new ModelRenderer(this.field_77109_a, 0, 16);
      leftleg.field_78809_i = true;
      leftleg.func_78789_a(-2.0F, 0.0F, -2.0F, 4, 12, 4);
      leftleg.func_78793_a(2.0F, 12.0F, 0.0F);
      leftleg.func_78787_b(64, 32);
      head = new ModelRenderer(this.field_77109_a, 0, 0);
      head.func_78789_a(-4.0F, -8.0F, -4.0F, 8, 8, 8);
      head.func_78793_a(0.0F, 0.0F, 0.0F);
      head.func_78787_b(64, 32);
      head.field_78809_i = true;
      this.body = new ModelRenderer(this.field_77109_a, 16, 16);
      this.body.func_78789_a(-4.0F, 0.0F, -2.0F, 8, 12, 4);
      this.body.func_78793_a(0.0F, 0.0F, 0.0F);
      this.body.func_78787_b(64, 32);
      this.body.field_78809_i = true;
      rightarm = new ModelRenderer(this.field_77109_a, 40, 16);
      rightarm.func_78789_a(-3.0F, -2.0F, -2.0F, 4, 12, 4);
      rightarm.func_78793_a(-5.0F, 2.0F, 0.0F);
      rightarm.func_78787_b(64, 32);
      rightarm.field_78809_i = true;
      Wing01 = new ModelRenderer(this.field_77109_a, 0, 0);
      Wing01.func_78789_a(0.0F, 0.0F, 0.0F, 32, 26, 0);
      Wing01.func_78793_a(0.0F, -9.0F, 3.0F);
      Wing01.func_78787_b(64, 32);
      Wing01.field_78795_f = 0.0F;
      Wing01.field_78796_g = -0.2617994F;
      Wing01.field_78808_h = -0.0255982F;
      Wing01.field_78809_i = true;
      Wing02 = new ModelRenderer(this.field_77109_a, 0, 0);
      Wing02.func_78789_a(0.0F, 0.0F, 0.0F, 32, 26, 0);
      Wing02.func_78793_a(0.0F, -9.0F, 3.0F);
      Wing02.func_78787_b(64, 32);
      Wing02.field_78795_f = 0.0F;
      Wing02.field_78796_g = -2.879793F;
      Wing02.field_78808_h = 0.0F;
      Wing02.field_78809_i = true;
      Shield = new ModelRenderer(this.field_77109_a, 0, -14);
      Shield.func_78789_a(0.0F, 0.0F, -8.0F, 0, 20, 16);
      Shield.func_78793_a(10.0F, -1.0F, 0.0F);
      Shield.func_78787_b(64, 32);
      Shield.field_78795_f = 0.0F;
      Shield.field_78796_g = 0.0F;
      Shield.field_78808_h = 0.0F;
      Shield.field_78809_i = true;
      Shape1 = new ModelRenderer(this.field_77109_a, -7, 5);
      Shape1.func_78789_a(-10.0F, 0.0F, -10.0F, 20, 0, 20);
      Shape1.func_78793_a(0.0F, 23.9F, 0.0F);
      Shape1.func_78787_b(64, 32);
      Shape1.field_78795_f = 0.0F;
      Shape1.field_78796_g = 0.0F;
      Shape1.field_78808_h = 0.0F;
      Shape1.field_78809_i = true;
   }

   protected int func_77032_a(AbstractClientPlayer p_77032_1_, int p_77032_2_, float p_77032_3_) {
      ItemStack itemstack = p_77032_1_.field_71071_by.func_70440_f(3 - p_77032_2_);
      SetArmorModel event = new SetArmorModel(p_77032_1_, this, 3 - p_77032_2_, p_77032_3_, itemstack);
      MinecraftForge.EVENT_BUS.post(event);
      if (event.result != -1) {
         return event.result;
      } else {
         PlayerData ex = PlayerData.get(p_77032_1_);
         ItemStack set = ex.ei.func_70301_a(0);
         if (set == null && itemstack != null) {
            Item item = itemstack.func_77973_b();
            if (item instanceof ItemArmor) {
               ItemArmor itemarmor = (ItemArmor)item;
               this.func_110776_a(RenderBiped.getArmorResource(p_77032_1_, itemstack, p_77032_2_, (String)null));
               ModelBiped modelbiped = p_77032_2_ == 2 ? this.field_77111_i : this.field_77108_b;
               modelbiped.field_78116_c.field_78806_j = p_77032_2_ == 0;
               modelbiped.field_78114_d.field_78806_j = p_77032_2_ == 0;
               modelbiped.field_78115_e.field_78806_j = p_77032_2_ == 1 || p_77032_2_ == 2;
               modelbiped.field_78112_f.field_78806_j = p_77032_2_ == 1;
               modelbiped.field_78113_g.field_78806_j = p_77032_2_ == 1;
               modelbiped.field_78123_h.field_78806_j = p_77032_2_ == 2 || p_77032_2_ == 3;
               modelbiped.field_78124_i.field_78806_j = p_77032_2_ == 2 || p_77032_2_ == 3;
               modelbiped = ForgeHooksClient.getArmorModel(p_77032_1_, itemstack, p_77032_2_, modelbiped);
               this.func_77042_a(modelbiped);
               modelbiped.field_78095_p = this.field_77045_g.field_78095_p;
               modelbiped.field_78093_q = this.field_77045_g.field_78093_q;
               modelbiped.field_78091_s = this.field_77045_g.field_78091_s;
               int j = itemarmor.func_82814_b(itemstack);
               if (j != -1) {
                  float f1 = (float)(j >> 16 & 255) / 255.0F;
                  float f2 = (float)(j >> 8 & 255) / 255.0F;
                  float f3 = (float)(j & 255) / 255.0F;
                  GL11.glColor3f(f1, f2, f3);
                  if (itemstack.func_77948_v()) {
                     return 31;
                  }

                  return 16;
               }

               GL11.glColor3f(1.0F, 1.0F, 1.0F);
               if (itemstack.func_77948_v()) {
                  return 15;
               }

               return 1;
            }
         }

         return -1;
      }
   }

   protected void func_77029_c(AbstractClientPlayer p_77029_1_, float p_77029_2_) {
      Pre event = new Pre(p_77029_1_, this, p_77029_2_);
      if (!MinecraftForge.EVENT_BUS.post(event)) {
         GL11.glColor3f(1.0F, 1.0F, 1.0F);
         super.func_85093_e(p_77029_1_, p_77029_2_);
         ItemStack itemstack = p_77029_1_.field_71071_by.func_70440_f(3);
         float f2;
         if (itemstack != null && event.renderHelmet) {
            GL11.glPushMatrix();
            this.field_77109_a.field_78116_c.func_78794_c(0.0625F);
            if (!(itemstack.func_77973_b() instanceof ItemBlock)) {
               if (itemstack.func_77973_b() == Items.field_151144_bL) {
                  f2 = 1.0625F;
                  GL11.glScalef(f2, -f2, -f2);
                  GameProfile gameprofile = null;
                  if (itemstack.func_77942_o()) {
                     NBTTagCompound nbttagcompound = itemstack.func_77978_p();
                     if (nbttagcompound.func_150297_b("SkullOwner", 10)) {
                        gameprofile = NBTUtil.func_152459_a(nbttagcompound.func_74775_l("SkullOwner"));
                     } else if (nbttagcompound.func_150297_b("SkullOwner", 8) && !StringUtils.func_151246_b(nbttagcompound.func_74779_i("SkullOwner"))) {
                        gameprofile = new GameProfile((UUID)null, nbttagcompound.func_74779_i("SkullOwner"));
                     }
                  }

                  TileEntitySkullRenderer.field_147536_b.func_152674_a(-0.5F, 0.0F, -0.5F, 1, 180.0F, itemstack.func_77960_j(), gameprofile);
               }
            } else {
               IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(itemstack, ItemRenderType.EQUIPPED);
               boolean is3D = customRenderer != null && customRenderer.shouldUseRenderHelper(ItemRenderType.EQUIPPED, itemstack, ItemRendererHelper.BLOCK_3D);
               if (is3D || RenderBlocks.func_147739_a(Block.func_149634_a(itemstack.func_77973_b()).func_149645_b())) {
                  f2 = 0.625F;
                  GL11.glTranslatef(0.0F, -0.25F, 0.0F);
                  GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                  GL11.glScalef(f2, -f2, -f2);
               }

               this.field_76990_c.field_78721_f.func_78443_a(p_77029_1_, itemstack, 0);
            }

            GL11.glPopMatrix();
         }

         float f4;
         if (p_77029_1_.func_70005_c_().equals("deadmau5") && p_77029_1_.func_152123_o()) {
            this.func_110776_a(p_77029_1_.func_110306_p());

            for(int j = 0; j < 2; ++j) {
               f4 = p_77029_1_.field_70126_B + (p_77029_1_.field_70177_z - p_77029_1_.field_70126_B) * p_77029_2_ - (p_77029_1_.field_70760_ar + (p_77029_1_.field_70761_aq - p_77029_1_.field_70760_ar) * p_77029_2_);
               float f10 = p_77029_1_.field_70127_C + (p_77029_1_.field_70125_A - p_77029_1_.field_70127_C) * p_77029_2_;
               GL11.glPushMatrix();
               GL11.glRotatef(f4, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(f10, 1.0F, 0.0F, 0.0F);
               GL11.glTranslatef(0.375F * (float)(j * 2 - 1), 0.0F, 0.0F);
               GL11.glTranslatef(0.0F, -0.375F, 0.0F);
               GL11.glRotatef(-f10, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(-f4, 0.0F, 1.0F, 0.0F);
               f2 = 1.3333334F;
               GL11.glScalef(f2, f2, f2);
               this.field_77109_a.func_78110_b(0.0625F);
               GL11.glPopMatrix();
            }
         }

         boolean flag = p_77029_1_.func_152122_n();
         flag = event.renderCape && flag;
         if (flag && !p_77029_1_.func_82150_aj() && !p_77029_1_.func_82238_cc()) {
            this.func_110776_a(p_77029_1_.func_110303_q());
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 0.0F, 0.125F);
            double d3 = p_77029_1_.field_71091_bM + (p_77029_1_.field_71094_bP - p_77029_1_.field_71091_bM) * (double)p_77029_2_ - (p_77029_1_.field_70169_q + (p_77029_1_.field_70165_t - p_77029_1_.field_70169_q) * (double)p_77029_2_);
            double d4 = p_77029_1_.field_71096_bN + (p_77029_1_.field_71095_bQ - p_77029_1_.field_71096_bN) * (double)p_77029_2_ - (p_77029_1_.field_70167_r + (p_77029_1_.field_70163_u - p_77029_1_.field_70167_r) * (double)p_77029_2_);
            double d0 = p_77029_1_.field_71097_bO + (p_77029_1_.field_71085_bR - p_77029_1_.field_71097_bO) * (double)p_77029_2_ - (p_77029_1_.field_70166_s + (p_77029_1_.field_70161_v - p_77029_1_.field_70166_s) * (double)p_77029_2_);
            f4 = p_77029_1_.field_70760_ar + (p_77029_1_.field_70761_aq - p_77029_1_.field_70760_ar) * p_77029_2_;
            double d1 = (double)MathHelper.func_76126_a(f4 * 3.1415927F / 180.0F);
            double d2 = (double)(-MathHelper.func_76134_b(f4 * 3.1415927F / 180.0F));
            float f5 = (float)d4 * 10.0F;
            if (f5 < -6.0F) {
               f5 = -6.0F;
            }

            if (f5 > 32.0F) {
               f5 = 32.0F;
            }

            float f6 = (float)(d3 * d1 + d0 * d2) * 100.0F;
            float f7 = (float)(d3 * d2 - d0 * d1) * 100.0F;
            if (f6 < 0.0F) {
               f6 = 0.0F;
            }

            float f8 = p_77029_1_.field_71107_bF + (p_77029_1_.field_71109_bG - p_77029_1_.field_71107_bF) * p_77029_2_;
            f5 += MathHelper.func_76126_a((p_77029_1_.field_70141_P + (p_77029_1_.field_70140_Q - p_77029_1_.field_70141_P) * p_77029_2_) * 6.0F) * 32.0F * f8;
            if (p_77029_1_.func_70093_af()) {
               f5 += 25.0F;
            }

            GL11.glRotatef(6.0F + f6 / 2.0F + f5, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(f7 / 2.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-f7 / 2.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            this.field_77109_a.func_78111_c(0.0625F);
            GL11.glPopMatrix();
         }

         ItemStack itemstack1 = p_77029_1_.field_71071_by.func_70448_g();
         if (itemstack1 != null && event.renderItem) {
            GL11.glPushMatrix();
            this.field_77109_a.field_78112_f.func_78794_c(0.0625F);
            if (itemstack1.func_77973_b() instanceof CustomSword) {
               GL11.glTranslatef(-0.0625F, 0.3275F, 0.0625F);
            } else {
               GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
            }

            if (p_77029_1_.field_71104_cf != null) {
               itemstack1 = new ItemStack(Items.field_151055_y);
            }

            EnumAction enumaction = null;
            if (p_77029_1_.func_71052_bv() > 0) {
               enumaction = itemstack1.func_77975_n();
            }

            IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(itemstack1, ItemRenderType.EQUIPPED);
            boolean is3D = customRenderer != null && customRenderer.shouldUseRenderHelper(ItemRenderType.EQUIPPED, itemstack1, ItemRendererHelper.BLOCK_3D);
            if (is3D || itemstack1.func_77973_b() instanceof ItemBlock && RenderBlocks.func_147739_a(Block.func_149634_a(itemstack1.func_77973_b()).func_149645_b())) {
               f2 = 0.5F;
               GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
               f2 *= 0.75F;
               GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
               GL11.glScalef(-f2, -f2, f2);
            } else if (itemstack1.func_77973_b() == Items.field_151031_f) {
               f2 = 0.625F;
               GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
               GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
               GL11.glScalef(f2, -f2, f2);
               GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            } else if (itemstack1.func_77973_b().func_77662_d()) {
               f2 = 0.625F;
               if (itemstack1.func_77973_b().func_77629_n_()) {
                  GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
                  GL11.glTranslatef(0.0F, -0.125F, 0.0F);
               }

               if (p_77029_1_.func_71052_bv() > 0 && enumaction == EnumAction.block) {
                  GL11.glTranslatef(0.05F, 0.0F, -0.1F);
                  GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
                  GL11.glRotatef(-10.0F, 1.0F, 0.0F, 0.0F);
                  GL11.glRotatef(-60.0F, 0.0F, 0.0F, 1.0F);
               }

               GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
               GL11.glScalef(f2, -f2, f2);
               GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            } else {
               f2 = 0.375F;
               GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
               GL11.glScalef(f2, f2, f2);
               GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
               GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
            }

            int k;
            float f3;
            float f12;
            if (itemstack1.func_77973_b().func_77623_v()) {
               for(k = 0; k < itemstack1.func_77973_b().getRenderPasses(itemstack1.func_77960_j()); ++k) {
                  int i = itemstack1.func_77973_b().func_82790_a(itemstack1, k);
                  f12 = (float)(i >> 16 & 255) / 255.0F;
                  f3 = (float)(i >> 8 & 255) / 255.0F;
                  f4 = (float)(i & 255) / 255.0F;
                  GL11.glColor4f(f12, f3, f4, 1.0F);
                  this.field_76990_c.field_78721_f.func_78443_a(p_77029_1_, itemstack1, k);
               }
            } else {
               k = itemstack1.func_77973_b().func_82790_a(itemstack1, 0);
               float f11 = (float)(k >> 16 & 255) / 255.0F;
               f12 = (float)(k >> 8 & 255) / 255.0F;
               f3 = (float)(k & 255) / 255.0F;
               GL11.glColor4f(f11, f12, f3, 1.0F);
               this.field_76990_c.field_78721_f.func_78443_a(p_77029_1_, itemstack1, 0);
            }

            GL11.glPopMatrix();
         }

         MinecraftForge.EVENT_BUS.post(new Post(p_77029_1_, this, p_77029_2_));
      }
   }

   public void func_82441_a(EntityPlayer p_82441_1_) {
      Minecraft.func_71410_x().field_71446_o.func_110577_a(skintexture);
      super.func_82441_a(p_82441_1_);
   }

   protected void func_77036_a(EntityLivingBase p_77036_1_, float p_77036_2_, float p_77036_3_, float p_77036_4_, float p_77036_5_, float p_77036_6_, float p_77036_7_) {
      super.field_77109_a.func_78087_a(p_77036_2_, p_77036_3_, p_77036_4_, p_77036_5_, p_77036_6_, p_77036_7_, p_77036_1_);
      setPart(this.body, this.field_77109_a.field_78115_e);
      setPart(rightarm, this.field_77109_a.field_78112_f);
      setPart(leftarm, this.field_77109_a.field_78113_g);
      setPart(rightleg, this.field_77109_a.field_78123_h);
      setPart(leftleg, this.field_77109_a.field_78124_i);
      EntityPlayer player = (EntityPlayer)p_77036_1_;
      StoreData px = StoreData.get(player);
      float newangle = 0.0F;
      newangle = p_77036_4_ * 0.15F % 6.283186F;
      newangle = Math.abs(newangle);
      Shape1.field_78796_g = newangle;
      Shape1.field_78796_g = (float)((double)newangle + 0.7853981633974483D);
      Shield.field_78795_f = this.field_77109_a.field_78113_g.field_78795_f;
      Shield.field_78796_g = this.field_77109_a.field_78113_g.field_78796_g;
      Shield.field_78808_h = this.field_77109_a.field_78113_g.field_78808_h;
      PlayerData ex = PlayerData.get(player);
      ItemStack umb = ex.ei.func_70301_a(4);
      if (!player.func_70096_w().func_75681_e(5).equalsIgnoreCase("NoBag")) {
         GL11.glPushMatrix();
         this.texture = new ResourceLocation("cabalaccessorys:textures/access/Bag_" + player.func_70096_w().func_75681_e(5) + ".png");
         Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texture);
         GL11.glScalef(1.3F, 1.3F, 1.3F);
         GL11.glTranslatef(0.0F, 0.02F, 0.0F);
         mh.func_78088_a(p_77036_1_, p_77036_2_, p_77036_3_, p_77036_4_, p_77036_5_, p_77036_6_, p_77036_7_);
         GL11.glPopMatrix();
      }

      float animate;
      if (!player.func_70096_w().func_75681_e(2).equalsIgnoreCase("empty")) {
         animate = MathHelper.func_76134_b((float)player.field_70173_aa * 0.1662F + 3.1415927F + 3.1415927F) * 220.0F * 0.5F * 0.2F + 3.7F + 0.2F;
         float size = 0.7F;
         GL11.glPushMatrix();
         GL11.glScalef(size, size, size);
         this.rotationpart(this.field_77109_a.field_78115_e);
         GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.8F, -0.1F);
         String var15 = player.func_70096_w().func_75681_e(2);
         byte var16 = -1;
         switch(var15.hashCode()) {
         case -1731990873:
            if (var15.equals("item.Wing01")) {
               var16 = 0;
            }
            break;
         case -1731990872:
            if (var15.equals("item.Wing02")) {
               var16 = 1;
            }
            break;
         case -1731990871:
            if (var15.equals("item.Wing03")) {
               var16 = 2;
            }
            break;
         case -1731990870:
            if (var15.equals("item.Wing04")) {
               var16 = 3;
            }
            break;
         case -1731990869:
            if (var15.equals("item.Wing05")) {
               var16 = 4;
            }
            break;
         case -1731990868:
            if (var15.equals("item.Wing06")) {
               var16 = 5;
            }
            break;
         case -1731990867:
            if (var15.equals("item.Wing07")) {
               var16 = 6;
            }
            break;
         case -1731990866:
            if (var15.equals("item.Wing08")) {
               var16 = 7;
            }
            break;
         case -1731990865:
            if (var15.equals("item.Wing09")) {
               var16 = 8;
            }
            break;
         case -1731990843:
            if (var15.equals("item.Wing10")) {
               var16 = 9;
            }
            break;
         case -306966513:
            if (var15.equals("item.newWing10")) {
               var16 = 19;
            }
            break;
         case -306966512:
            if (var15.equals("item.newWing11")) {
               var16 = 20;
            }
            break;
         case -306966511:
            if (var15.equals("item.newWing12")) {
               var16 = 21;
            }
            break;
         case -306966510:
            if (var15.equals("item.newWing13")) {
               var16 = 22;
            }
            break;
         case -306966509:
            if (var15.equals("item.newWing14")) {
               var16 = 23;
            }
            break;
         case -306966508:
            if (var15.equals("item.newWing15")) {
               var16 = 24;
            }
            break;
         case -306966507:
            if (var15.equals("item.newWing16")) {
               var16 = 25;
            }
            break;
         case 128645185:
            if (var15.equals("item.newWing1")) {
               var16 = 10;
            }
            break;
         case 128645186:
            if (var15.equals("item.newWing2")) {
               var16 = 11;
            }
            break;
         case 128645187:
            if (var15.equals("item.newWing3")) {
               var16 = 12;
            }
            break;
         case 128645188:
            if (var15.equals("item.newWing4")) {
               var16 = 13;
            }
            break;
         case 128645189:
            if (var15.equals("item.newWing5")) {
               var16 = 14;
            }
            break;
         case 128645190:
            if (var15.equals("item.newWing6")) {
               var16 = 15;
            }
            break;
         case 128645191:
            if (var15.equals("item.newWing7")) {
               var16 = 16;
            }
            break;
         case 128645192:
            if (var15.equals("item.newWing8")) {
               var16 = 17;
            }
            break;
         case 128645193:
            if (var15.equals("item.newWing9")) {
               var16 = 18;
            }
         }

         switch(var16) {
         case 0:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwingold1);
            break;
         case 1:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwingold2);
            break;
         case 2:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwingold3);
            break;
         case 3:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwingold4);
            break;
         case 4:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwingold5);
            break;
         case 5:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwingold6);
            break;
         case 6:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwingold7);
            GL11.glTranslatef(0.0F, 0.3F, 0.0F);
            break;
         case 7:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwingold8);
            break;
         case 8:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwingold9);
            break;
         case 9:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwingold10);
            break;
         case 10:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing1);
            GL11.glTranslatef(0.0F, 0.4F, 0.0F);
            break;
         case 11:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing2);
            break;
         case 12:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing3);
            break;
         case 13:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing4);
            break;
         case 14:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing5);
            break;
         case 15:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing6);
            break;
         case 16:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing7);
            GL11.glTranslatef(0.0F, 0.4F, 0.0F);
            break;
         case 17:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing8);
            GL11.glTranslatef(0.0F, 0.2F, 0.0F);
            break;
         case 18:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing9);
            break;
         case 19:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing10);
            GL11.glTranslatef(0.0F, 0.4F, 0.0F);
            break;
         case 20:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing11);
            GL11.glTranslatef(0.0F, 0.4F, 0.0F);
            break;
         case 21:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing12);
            break;
         case 22:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing13);
            GL11.glTranslatef(0.0F, 0.4F, -0.1F);
            break;
         case 23:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing14);
            GL11.glTranslatef(0.0F, 0.4F, 0.0F);
            break;
         case 24:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing15);
            GL11.glTranslatef(0.0F, 0.4F, 0.0F);
            break;
         case 25:
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texwing16);
         }

         TextureSetting.setblur();
         GL11.glRotatef(animate, 0.0F, 1.0F, 0.0F);
         this.modelnewwing.renderOnly("leftwing");
         GL11.glRotatef(animate, 0.0F, -1.0F, 0.0F);
         GL11.glRotatef(-animate, 0.0F, 1.0F, 0.0F);
         this.modelnewwing.renderOnly("rightwing");
         GL11.glPopMatrix();
      }

      this.texture = new ResourceLocation("cabalaccessorys:textures/shield/" + player.func_70096_w().func_75681_e(25) + ".png");
      Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texture);
      Shield.func_78785_a(p_77036_7_);
      GL11.glDisable(2896);
      if (player.field_70122_E && !player.func_70096_w().func_75681_e(26).equalsIgnoreCase("empty")) {
         if (player.func_70096_w().func_75681_e(26).contains("ar")) {
            this.texture = new ResourceLocation("cabalaccessorys:textures/buff/" + player.func_70096_w().func_75681_e(26) + ".png");
            Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texture);
            GL11.glPushMatrix();
            GL11.glScalef(1.5F, 1.0F, 1.5F);
            Shape1.func_78785_a(p_77036_7_);
            GL11.glPopMatrix();
         } else {
            GL11.glPushMatrix();
            animate = 0.7F;
            GL11.glScalef(animate, animate, animate);
            GL11.glTranslatef(0.0F, 2.0F, 0.0F);
            GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef((float)player.field_70173_aa * 6.0F, 0.0F, 1.0F, 0.0F);
            String var18 = player.func_70096_w().func_75681_e(26);
            byte var21 = -1;
            switch(var18.hashCode()) {
            case 139153689:
               if (var18.equals("item.newbuff1")) {
                  var21 = 0;
               }
               break;
            case 139153690:
               if (var18.equals("item.newbuff2")) {
                  var21 = 1;
               }
               break;
            case 139153691:
               if (var18.equals("item.newbuff3")) {
                  var21 = 2;
               }
               break;
            case 139153692:
               if (var18.equals("item.newbuff4")) {
                  var21 = 3;
               }
               break;
            case 139153693:
               if (var18.equals("item.newbuff5")) {
                  var21 = 4;
               }
               break;
            case 139153694:
               if (var18.equals("item.newbuff6")) {
                  var21 = 5;
               }
            }

            switch(var21) {
            case 0:
               Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texbuff);
               TextureSetting.setblur();
               this.modelnewbuff.renderAll();
               break;
            case 1:
               Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texbuff2);
               TextureSetting.setblur();
               this.modelnewbuff2.renderAll();
               break;
            case 2:
               Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texbuff3);
               TextureSetting.setblur();
               this.modelnewbuff3.renderAll();
               break;
            case 3:
               Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texbuff4);
               TextureSetting.setblur();
               this.modelnewbuff4.renderAll();
               break;
            case 4:
               Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texbuff5);
               TextureSetting.setblur();
               this.modelnewbuff5.renderAll();
               break;
            case 5:
               Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texbuff6);
               TextureSetting.setblur();
               this.modelnewbuff6.renderAll();
            }

            GL11.glPopMatrix();
         }
      }

      GL11.glEnable(2896);
      if (umb != null) {
         leftarm.field_78795_f = 24.7F;
         Iterator var17;
         GroupObject part;
         if (umb.func_77973_b() == RegisterItem.um1) {
            var17 = pum1.iterator();

            while(var17.hasNext()) {
               part = (GroupObject)var17.next();
               GL11.glPushMatrix();
               Minecraft.func_71410_x().field_71446_o.func_110577_a(um1tex);
               this.rotationpart(this.field_77109_a.field_78115_e);
               GL11.glColor3d(3.0D, 3.0D, 3.0D);
               GL11.glScalef(1.0F, 1.0F, 1.0F);
               GL11.glTranslatef(0.3F, 0.6F, -0.5F);
               GL11.glRotatef(160.0F, 1.0F, 0.0F, 0.0F);
               part.render();
               GL11.glColor3d(1.0D, 1.0D, 1.0D);
               GL11.glPopMatrix();
            }
         } else if (umb.func_77973_b() == RegisterItem.um2) {
            var17 = pum2.iterator();

            while(var17.hasNext()) {
               part = (GroupObject)var17.next();
               GL11.glPushMatrix();
               Minecraft.func_71410_x().field_71446_o.func_110577_a(um2tex);
               this.rotationpart(this.field_77109_a.field_78115_e);
               GL11.glColor3d(3.0D, 3.0D, 3.0D);
               GL11.glScalef(1.0F, 1.0F, 1.0F);
               GL11.glTranslatef(0.3F, 0.6F, -0.5F);
               GL11.glRotatef(160.0F, 1.0F, 0.0F, 0.0F);
               part.render();
               GL11.glColor3d(1.0D, 1.0D, 1.0D);
               GL11.glPopMatrix();
            }
         } else if (umb.func_77973_b() == RegisterItem.um3) {
            var17 = pum3.iterator();

            while(var17.hasNext()) {
               part = (GroupObject)var17.next();
               GL11.glPushMatrix();
               Minecraft.func_71410_x().field_71446_o.func_110577_a(um3tex);
               this.rotationpart(this.field_77109_a.field_78115_e);
               GL11.glColor3d(3.0D, 3.0D, 3.0D);
               GL11.glScalef(1.0F, 1.0F, 1.0F);
               GL11.glTranslatef(0.3F, 0.6F, -0.5F);
               GL11.glRotatef(160.0F, 1.0F, 0.0F, 0.0F);
               part.render();
               GL11.glColor3d(1.0D, 1.0D, 1.0D);
               GL11.glPopMatrix();
            }
         } else if (umb.func_77973_b() == RegisterItem.um4) {
            var17 = pum4.iterator();

            while(var17.hasNext()) {
               part = (GroupObject)var17.next();
               GL11.glPushMatrix();
               Minecraft.func_71410_x().field_71446_o.func_110577_a(um4tex);
               this.rotationpart(this.field_77109_a.field_78115_e);
               GL11.glColor3d(3.0D, 3.0D, 3.0D);
               GL11.glScalef(1.0F, 1.0F, 1.0F);
               GL11.glTranslatef(0.3F, 0.6F, -0.5F);
               GL11.glRotatef(160.0F, 1.0F, 0.0F, 0.0F);
               part.render();
               GL11.glColor3d(1.0D, 1.0D, 1.0D);
               GL11.glPopMatrix();
            }
         }
      }

      if (player.func_70096_w().func_75679_c(10) == 9999) {
         this.texture = new ResourceLocation("cabalaccessorys:textures/shop.png");
         Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texture);
         GuestSide.shop.func_78088_a(p_77036_1_, p_77036_2_, p_77036_3_, p_77036_4_, p_77036_5_, p_77036_6_, p_77036_7_);
      }

      if (player.func_70096_w().func_75679_c(10) != 9999 && player.func_70096_w().func_75679_c(11) == 1) {
         this.texture = new ResourceLocation("cabalaccessorys:textures/capella.png");
         Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texture);
         GuestSide.faction.func_78088_a(p_77036_1_, p_77036_2_, p_77036_3_, p_77036_4_, p_77036_5_, p_77036_6_, p_77036_7_);
      }

      if (player.func_70096_w().func_75679_c(10) != 9999 && player.func_70096_w().func_75679_c(11) == 2) {
         this.texture = new ResourceLocation("cabalaccessorys:textures/procyon.png");
         Minecraft.func_71410_x().field_71446_o.func_110577_a(this.texture);
         GuestSide.faction.func_78088_a(p_77036_1_, p_77036_2_, p_77036_3_, p_77036_4_, p_77036_5_, p_77036_6_, p_77036_7_);
      }

      if (px.Sex == 0) {
         if (px.Hair == 0) {
            TEXTUREs2 = new ResourceLocation("fantasyland", "models/dragonset/headplayer_" + player.func_70096_w().func_75679_c(30) + ".png");
            skintexture = new ResourceLocation("fantasyland", "models/bskin.png");
         } else {
            TEXTUREs2 = new ResourceLocation("fantasyland", "models/dragonset/headplayer2_" + player.func_70096_w().func_75679_c(30) + ".png");
            skintexture = new ResourceLocation("fantasyland", "models/bskin.png");
         }
      } else if (px.Hair == 0) {
         TEXTUREs2 = new ResourceLocation("fantasyland", "models/dragonset/headplayerg_" + player.func_70096_w().func_75679_c(30) + ".png");
         skintexture = new ResourceLocation("fantasyland", "models/gskin.png");
      } else {
         TEXTUREs2 = new ResourceLocation("fantasyland", "models/dragonset/headplayerg2_" + player.func_70096_w().func_75679_c(30) + ".png");
         skintexture = new ResourceLocation("fantasyland", "models/gskin.png");
      }

      GL11.glPushMatrix();
      Minecraft.func_71410_x().field_71446_o.func_110577_a(skintexture);
      GL11.glDisable(2896);
      this.BodyRender(p_77036_7_);
      rightleg.func_78785_a(p_77036_7_);
      leftleg.func_78785_a(p_77036_7_);
      GL11.glPopMatrix();
      ItemStack set = ex.ei.func_70301_a(0);
      if (set != null) {
         if (set.func_77973_b() != RegisterItem.set21 && set.func_77973_b() != RegisterItem.set22 && set.func_77973_b() != RegisterItem.set23 && set.func_77973_b() != RegisterItem.set24 && set.func_77973_b() != RegisterItem.set25 && set.func_77973_b() != RegisterItem.set26 && set.func_77973_b() != RegisterItem.set27 && set.func_77973_b() != RegisterItem.set28 && set.func_77973_b() != RegisterItem.set29 && set.func_77973_b() != RegisterItem.set30) {
            this.FaceRender();
         }
      } else {
         this.FaceRender();
      }

      this.SetFashionRender(player);
   }

   private void SetFashionRender(EntityPlayer player) {
      PlayerData ex = PlayerData.get(player);
      ItemStack set = ex.ei.func_70301_a(0);
      Iterator var4;
      GroupObject part;
      if (set != null && set.func_77973_b() == RegisterItem.set01 || set != null && set.func_77973_b() == RegisterItem.set02 || set != null && set.func_77973_b() == RegisterItem.set03 || set != null && set.func_77973_b() == RegisterItem.set04 || set != null && set.func_77973_b() == RegisterItem.set05) {
         if (set.func_77973_b() == RegisterItem.set01) {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(set01atex);
         } else if (set.func_77973_b() == RegisterItem.set02) {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(set01btex);
         } else if (set.func_77973_b() == RegisterItem.set03) {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(set01ctex);
         } else if (set.func_77973_b() == RegisterItem.set04) {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(set01dtex);
         } else if (set.func_77973_b() == RegisterItem.set05) {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(set01etex);
         }

         var4 = pset01body.iterator();

         while(var4.hasNext()) {
            part = (GroupObject)var4.next();
            GL11.glPushMatrix();
            this.rotationpart(this.field_77109_a.field_78115_e);
            GL11.glColor3d(3.0D, 3.0D, 3.0D);
            GL11.glScalef(1.2F, 1.2F, 1.3F);
            GL11.glTranslatef(-0.0F, -0.07F, 0.06F);
            GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            part.render();
            GL11.glColor3d(1.0D, 1.0D, 1.0D);
            GL11.glPopMatrix();
         }

         var4 = pset01rarm.iterator();

         while(var4.hasNext()) {
            part = (GroupObject)var4.next();
            GL11.glPushMatrix();
            this.rotationpart(this.field_77109_a.field_78112_f);
            GL11.glColor3d(3.0D, 3.0D, 3.0D);
            GL11.glScalef(1.3F, 1.3F, 1.5F);
            GL11.glTranslatef(0.1F, -0.2F, -0.07F);
            GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            part.render();
            GL11.glColor3d(1.0D, 1.0D, 1.0D);
            GL11.glPopMatrix();
         }

         var4 = pset01larm.iterator();

         while(var4.hasNext()) {
            part = (GroupObject)var4.next();
            GL11.glPushMatrix();
            this.rotationpart(this.field_77109_a.field_78113_g);
            GL11.glColor3d(3.0D, 3.0D, 3.0D);
            GL11.glScalef(1.3F, 1.3F, 1.5F);
            GL11.glTranslatef(-0.06F, -0.2F, -0.0F);
            GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            part.render();
            GL11.glColor3d(1.0D, 1.0D, 1.0D);
            GL11.glPopMatrix();
         }

         var4 = pset01rleg.iterator();

         while(var4.hasNext()) {
            part = (GroupObject)var4.next();
            GL11.glPushMatrix();
            this.rotationpart(this.field_77109_a.field_78115_e);
            GL11.glColor3d(3.0D, 3.0D, 3.0D);
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            GL11.glTranslatef(-0.15F, 0.6F, -0.07F);
            GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            part.render();
            GL11.glColor3d(1.0D, 1.0D, 1.0D);
            GL11.glPopMatrix();
         }

         var4 = pset01lleg.iterator();

         while(var4.hasNext()) {
            part = (GroupObject)var4.next();
            GL11.glPushMatrix();
            this.rotationpart(this.field_77109_a.field_78115_e);
            GL11.glColor3d(3.0D, 3.0D, 3.0D);
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            GL11.glTranslatef(0.15F, 0.6F, -0.07F);
            GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            part.render();
            GL11.glColor3d(1.0D, 1.0D, 1.0D);
            GL11.glPopMatrix();
         }
      } else if ((set == null || set.func_77973_b() != RegisterItem.set06) && (set == null || set.func_77973_b() != RegisterItem.set07) && (set == null || set.func_77973_b() != RegisterItem.set08) && (set == null || set.func_77973_b() != RegisterItem.set09) && (set == null || set.func_77973_b() != RegisterItem.set10)) {
         if (set != null && set.func_77973_b() == RegisterItem.set11 || set != null && set.func_77973_b() == RegisterItem.set12 || set != null && set.func_77973_b() == RegisterItem.set13 || set != null && set.func_77973_b() == RegisterItem.set14 || set != null && set.func_77973_b() == RegisterItem.set15) {
            if (set.func_77973_b() == RegisterItem.set11) {
               Minecraft.func_71410_x().field_71446_o.func_110577_a(set11tex);
            } else if (set.func_77973_b() == RegisterItem.set12) {
               Minecraft.func_71410_x().field_71446_o.func_110577_a(set12tex);
            } else if (set.func_77973_b() == RegisterItem.set13) {
               Minecraft.func_71410_x().field_71446_o.func_110577_a(set13tex);
            } else if (set.func_77973_b() == RegisterItem.set14) {
               Minecraft.func_71410_x().field_71446_o.func_110577_a(set14tex);
            } else if (set.func_77973_b() == RegisterItem.set15) {
               Minecraft.func_71410_x().field_71446_o.func_110577_a(set15tex);
            }

            var4 = pset03body.iterator();

            while(var4.hasNext()) {
               part = (GroupObject)var4.next();
               GL11.glPushMatrix();
               this.rotationpart(this.field_77109_a.field_78115_e);
               GL11.glColor3d(3.0D, 3.0D, 3.0D);
               GL11.glScalef(1.0F, 0.8F, 1.0F);
               GL11.glTranslatef(-0.0F, -0.07F, 0.0F);
               GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
               part.render();
               GL11.glColor3d(1.0D, 1.0D, 1.0D);
               GL11.glPopMatrix();
            }

            var4 = pset03cape.iterator();

            while(var4.hasNext()) {
               part = (GroupObject)var4.next();
               GL11.glPushMatrix();
               this.rotationpart(this.field_77109_a.field_78115_e);
               GL11.glColor3d(3.0D, 3.0D, 3.0D);
               GL11.glScalef(0.8F, 0.8F, 0.8F);
               GL11.glTranslatef(-0.0F, -0.07F, 0.3F);
               GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
               part.render();
               GL11.glColor3d(1.0D, 1.0D, 1.0D);
               GL11.glPopMatrix();
            }

            var4 = pset03rarm.iterator();

            while(var4.hasNext()) {
               part = (GroupObject)var4.next();
               GL11.glPushMatrix();
               this.rotationpart(this.field_77109_a.field_78112_f);
               GL11.glColor3d(3.0D, 3.0D, 3.0D);
               GL11.glScalef(0.7F, 0.7F, 0.7F);
               GL11.glTranslatef(-0.0F, -0.1F, -0.0F);
               GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
               part.render();
               GL11.glColor3d(1.0D, 1.0D, 1.0D);
               GL11.glPopMatrix();
            }

            var4 = pset03larm.iterator();

            while(var4.hasNext()) {
               part = (GroupObject)var4.next();
               GL11.glPushMatrix();
               this.rotationpart(this.field_77109_a.field_78113_g);
               GL11.glColor3d(3.0D, 3.0D, 3.0D);
               GL11.glScalef(0.7F, 0.7F, 0.7F);
               GL11.glTranslatef(0.0F, -0.1F, 0.0F);
               GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
               part.render();
               GL11.glColor3d(1.0D, 1.0D, 1.0D);
               GL11.glPopMatrix();
            }

            var4 = pset03rleg.iterator();

            while(var4.hasNext()) {
               part = (GroupObject)var4.next();
               GL11.glPushMatrix();
               this.rotationpart(this.field_77109_a.field_78115_e);
               GL11.glColor3d(3.0D, 3.0D, 3.0D);
               GL11.glScalef(1.0F, 1.0F, 1.0F);
               GL11.glTranslatef(-0.15F, 0.6F, -0.07F);
               GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
               part.render();
               GL11.glColor3d(1.0D, 1.0D, 1.0D);
               GL11.glPopMatrix();
            }

            var4 = pset03lleg.iterator();

            while(var4.hasNext()) {
               part = (GroupObject)var4.next();
               GL11.glPushMatrix();
               this.rotationpart(this.field_77109_a.field_78115_e);
               GL11.glColor3d(3.0D, 3.0D, 3.0D);
               GL11.glScalef(1.0F, 1.0F, 1.0F);
               GL11.glTranslatef(0.15F, 0.6F, -0.07F);
               GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
               part.render();
               GL11.glColor3d(1.0D, 1.0D, 1.0D);
               GL11.glPopMatrix();
            }
         } else if (set != null && set.func_77973_b() == RegisterItem.set16 || set != null && set.func_77973_b() == RegisterItem.set17 || set != null && set.func_77973_b() == RegisterItem.set18 || set != null && set.func_77973_b() == RegisterItem.set19 || set != null && set.func_77973_b() == RegisterItem.set20) {
            if (set.func_77973_b() == RegisterItem.set16) {
               Minecraft.func_71410_x().field_71446_o.func_110577_a(set16tex);
            } else if (set.func_77973_b() == RegisterItem.set17) {
               Minecraft.func_71410_x().field_71446_o.func_110577_a(set17tex);
            } else if (set.func_77973_b() == RegisterItem.set18) {
               Minecraft.func_71410_x().field_71446_o.func_110577_a(set18tex);
            } else if (set.func_77973_b() == RegisterItem.set19) {
               Minecraft.func_71410_x().field_71446_o.func_110577_a(set19tex);
            } else if (set.func_77973_b() == RegisterItem.set20) {
               Minecraft.func_71410_x().field_71446_o.func_110577_a(set20tex);
            }

            var4 = pset04body.iterator();

            while(var4.hasNext()) {
               part = (GroupObject)var4.next();
               GL11.glPushMatrix();
               this.rotationpart(this.field_77109_a.field_78115_e);
               GL11.glColor3d(3.0D, 3.0D, 3.0D);
               GL11.glScalef(0.85F, 0.7F, 1.0F);
               GL11.glTranslatef(-0.0F, -0.0F, 0.0F);
               GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
               part.render();
               GL11.glColor3d(1.0D, 1.0D, 1.0D);
               GL11.glPopMatrix();
            }

            var4 = pset04rarm.iterator();

            while(var4.hasNext()) {
               part = (GroupObject)var4.next();
               GL11.glPushMatrix();
               this.rotationpart(this.field_77109_a.field_78112_f);
               GL11.glColor3d(3.0D, 3.0D, 3.0D);
               GL11.glScalef(0.7F, 0.8F, 1.0F);
               GL11.glTranslatef(0.23F, -0.15F, -0.06F);
               GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
               part.render();
               GL11.glColor3d(1.0D, 1.0D, 1.0D);
               GL11.glPopMatrix();
            }

            var4 = pset04larm.iterator();

            while(var4.hasNext()) {
               part = (GroupObject)var4.next();
               GL11.glPushMatrix();
               this.rotationpart(this.field_77109_a.field_78113_g);
               GL11.glColor3d(3.0D, 3.0D, 3.0D);
               GL11.glScalef(0.7F, 0.8F, 1.0F);
               GL11.glTranslatef(-0.23F, -0.15F, -0.06F);
               GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
               part.render();
               GL11.glColor3d(1.0D, 1.0D, 1.0D);
               GL11.glPopMatrix();
            }
         }
      } else {
         if (set.func_77973_b() == RegisterItem.set06) {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(set06tex);
         } else if (set.func_77973_b() == RegisterItem.set07) {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(set07tex);
         } else if (set.func_77973_b() == RegisterItem.set08) {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(set08tex);
         } else if (set.func_77973_b() == RegisterItem.set09) {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(set09tex);
         } else if (set.func_77973_b() == RegisterItem.set10) {
            Minecraft.func_71410_x().field_71446_o.func_110577_a(set10tex);
         }

         var4 = pset02body.iterator();

         while(var4.hasNext()) {
            part = (GroupObject)var4.next();
            GL11.glPushMatrix();
            this.rotationpart(this.field_77109_a.field_78115_e);
            GL11.glColor3d(3.0D, 3.0D, 3.0D);
            GL11.glScalef(1.8F, 1.5F, 1.8F);
            GL11.glTranslatef(-0.0F, -0.0F, -0.035F);
            GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            part.render();
            GL11.glColor3d(1.0D, 1.0D, 1.0D);
            GL11.glPopMatrix();
         }

         var4 = pset02rarm.iterator();

         while(var4.hasNext()) {
            part = (GroupObject)var4.next();
            GL11.glPushMatrix();
            this.rotationpart(this.field_77109_a.field_78113_g);
            GL11.glColor3d(3.0D, 3.0D, 3.0D);
            GL11.glScalef(1.4F, 1.4F, 1.6F);
            GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            part.render();
            GL11.glColor3d(1.0D, 1.0D, 1.0D);
            GL11.glPopMatrix();
         }

         var4 = pset02larm.iterator();

         while(var4.hasNext()) {
            part = (GroupObject)var4.next();
            GL11.glPushMatrix();
            this.rotationpart(this.field_77109_a.field_78112_f);
            GL11.glColor3d(3.0D, 3.0D, 3.0D);
            GL11.glScalef(1.4F, 1.4F, 1.6F);
            GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            part.render();
            GL11.glColor3d(1.0D, 1.0D, 1.0D);
            GL11.glPopMatrix();
         }
      }

   }

   private void BodyRender(float p_77036_7_) {
      this.body.func_78785_a(p_77036_7_);
      leftarm.func_78785_a(p_77036_7_);
      rightarm.func_78785_a(p_77036_7_);
   }

   private void FaceRender() {
      Iterator var1 = partmodelhead.iterator();

      while(var1.hasNext()) {
         GroupObject part = (GroupObject)var1.next();
         GL11.glPushMatrix();
         GL11.glColor3d(3.0D, 3.0D, 3.0D);
         GL11.glScalef(0.7F, 0.7F, 0.7F);
         Minecraft.func_71410_x().field_71446_o.func_110577_a(TEXTUREs2);
         TextureSetting.setblur();
         this.rotationpart(this.field_77109_a.field_78116_c);
         GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
         GL11.glTranslatef(0.0F, 0.5F, 0.0F);
         part.render();
         GL11.glPopMatrix();
      }

   }

   private void HairRender(StoreData px) {
      GL11.glPushMatrix();
      GL11.glScalef(0.7F, 0.7F, 0.7F);
      this.rotationpart(this.field_77109_a.field_78115_e);
      this.rotationpart(this.field_77109_a.field_78116_c);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.4F, 0.0F);
      Iterator var2;
      GroupObject parthair;
      if (px.Hair == 1) {
         if (px.Sex == 0) {
            var2 = parthair1.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.9F, 1.0F, 0.9F);
               GL11.glTranslatef(0.0F, -0.2F, 0.0F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/hair1_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         } else {
            var2 = partghair1.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.85F, 1.0F, 1.0F);
               GL11.glTranslatef(-0.04F, -0.15F, 0.05F);
               GL11.glRotated(-10.0D, 1.0D, 0.0D, 0.0D);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair1_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         }
      } else if (px.Hair == 2) {
         if (px.Sex == 0) {
            var2 = parthair2.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.9F, 1.05F, 0.9F);
               GL11.glTranslatef(0.0F, -0.25F, 0.0F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/hair2_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         } else {
            var2 = partghair2.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.85F, 1.0F, 0.8F);
               GL11.glTranslatef(0.0F, -0.25F, 0.0F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair2_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         }
      } else if (px.Hair == 3) {
         if (px.Sex == 0) {
            var2 = parthair3.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.9F, 1.05F, 0.9F);
               GL11.glTranslatef(0.0F, -0.25F, 0.0F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/hair3_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         } else {
            var2 = partghair3.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.75F, 0.8F, 0.7F);
               GL11.glRotated(-15.0D, 1.0D, 0.0D, 0.0D);
               GL11.glTranslatef(0.0F, 0.15F, -0.15F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair3_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         }
      } else if (px.Hair == 4) {
         if (px.Sex == 0) {
            var2 = parthair4.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.8F, 1.15F, 0.9F);
               GL11.glTranslatef(0.0F, -0.25F, 0.01F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/hair4_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         } else {
            var2 = partghair4.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.85F, 1.05F, 0.8F);
               GL11.glTranslatef(0.03F, -0.35F, -0.09F);
               GL11.glRotated(5.0D, 1.0D, 0.0D, 0.0D);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair4_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         }
      } else if (px.Hair == 5) {
         if (px.Sex == 0) {
            var2 = parthair5.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.75F, 0.8F, 0.9F);
               GL11.glTranslatef(0.0F, -0.35F, -0.2F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/hair5_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         } else {
            var2 = partghair5.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.85F, 0.9F, 0.9F);
               GL11.glTranslatef(0.04F, -0.3F, -0.13F);
               GL11.glRotated(5.0D, 1.0D, 0.0D, 0.0D);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair5_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         }
      } else if (px.Hair == 6) {
         if (px.Sex == 0) {
            var2 = parthair6.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.85F, 0.85F, 0.85F);
               GL11.glTranslatef(0.1F, -0.35F, -0.1F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/hair6_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         } else {
            var2 = partghair6.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.8F, 0.9F, 0.8F);
               GL11.glTranslatef(0.06F, -0.32F, -0.08F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair6_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         }
      } else if (px.Hair == 7) {
         if (px.Sex == 0) {
            var2 = parthair7.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(1.0F, 1.0F, 1.0F);
               GL11.glTranslatef(0.0F, -0.45F, -0.05F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/hair7_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         } else {
            var2 = partghair7.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.8F, 1.0F, 0.8F);
               GL11.glTranslatef(0.06F, 0.15F, -0.08F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair7_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         }
      } else if (px.Hair == 8) {
         if (px.Sex == 0) {
            var2 = parthair8.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.85F, 0.85F, 0.85F);
               GL11.glTranslatef(0.0F, -0.65F, -0.05F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/hair8_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         } else {
            var2 = partghair8.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.8F, 0.8F, 0.8F);
               GL11.glTranslatef(0.06F, 0.3F, 0.1F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair8_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         }
      } else if (px.Hair == 9) {
         if (px.Sex == 0) {
            var2 = parthair9.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.85F, 0.85F, 0.85F);
               GL11.glTranslatef(0.0F, -0.65F, -0.05F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/hair9_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         } else {
            var2 = partghair9.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(1.1F, 1.1F, 1.1F);
               GL11.glTranslatef(0.0F, -0.05F, 0.0F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair9_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         }
      } else if (px.Hair == 10) {
         if (px.Sex == 0) {
            var2 = parthair10.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(1.5F, 1.6F, 1.5F);
               GL11.glTranslatef(0.0F, -0.45F, -0.1F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/hair10_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         } else {
            var2 = partghair10.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(1.3F, 1.2F, 1.1F);
               GL11.glTranslatef(0.02F, -0.07F, -0.02F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair10_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         }
      } else if (px.Hair == 11) {
         if (px.Sex == 0) {
            var2 = partghair11.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(1.0F, 1.05F, 0.9F);
               GL11.glTranslatef(0.02F, -0.03F, 0.1F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair11_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         } else {
            var2 = partghair11.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(1.0F, 1.05F, 0.9F);
               GL11.glTranslatef(0.02F, -0.03F, 0.1F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair11_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         }
      } else if (px.Hair == 12) {
         if (px.Sex == 0) {
            var2 = partghair12.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(1.0F, 1.05F, 0.9F);
               GL11.glTranslatef(0.02F, -0.03F, 0.1F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair12_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         } else {
            var2 = partghair12.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(1.0F, 1.05F, 0.9F);
               GL11.glTranslatef(0.02F, -0.03F, 0.1F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair12_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         }
      } else if (px.Hair == 13) {
         if (px.Sex == 0) {
            var2 = partghair13.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(1.0F, 1.05F, 0.9F);
               GL11.glTranslatef(0.02F, -0.03F, 0.1F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair13_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         } else {
            var2 = partghair13.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(1.0F, 1.05F, 0.9F);
               GL11.glTranslatef(0.02F, -0.03F, 0.1F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair13_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         }
      } else if (px.Hair == 14) {
         if (px.Sex == 0) {
            var2 = partghair14.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.9F, 0.9F, 0.9F);
               GL11.glTranslatef(0.02F, -0.0F, 0.1F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair14_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         } else {
            var2 = partghair14.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(0.9F, 0.9F, 0.9F);
               GL11.glTranslatef(0.02F, -0.0F, 0.1F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair14_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         }
      } else if (px.Hair == 15) {
         if (px.Sex == 0) {
            var2 = partghair15.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(1.0F, 1.05F, 0.9F);
               GL11.glTranslatef(0.02F, -0.03F, 0.1F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair15_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         } else {
            var2 = partghair15.iterator();

            while(var2.hasNext()) {
               parthair = (GroupObject)var2.next();
               GL11.glPushMatrix();
               GL11.glScalef(1.0F, 1.05F, 0.9F);
               GL11.glTranslatef(0.02F, -0.03F, 0.1F);
               Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("fantasyland", "models/hair/ghair15_" + px.HairColor + ".png"));
               TextureSetting.setblur();
               parthair.render();
               GL11.glPopMatrix();
            }
         }
      }

      GL11.glPopMatrix();
   }

   private static void setPart(ModelRenderer body, ModelRenderer modelBipedMain) {
      body.field_78795_f = modelBipedMain.field_78795_f;
      body.field_78796_g = modelBipedMain.field_78796_g;
      body.field_78808_h = modelBipedMain.field_78808_h;
      body.field_78800_c = modelBipedMain.field_78800_c;
      body.field_78797_d = modelBipedMain.field_78797_d;
      body.field_78798_e = modelBipedMain.field_78798_e;
   }

   public void rotate(float rotX, float rotY, float rotZ) {
      GL11.glRotatef(rotX, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(rotY, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(rotZ, 0.0F, 0.0F, 1.0F);
   }

   public void rotate(float rotation, float angleX, float angleY, float angleZ) {
      GL11.glRotatef(rotation, angleX, angleY, angleZ);
   }

   public void translate(float posX, float posY, float posZ) {
      GL11.glTranslatef(posX, posY, posZ);
   }

   public void scale(float scaleX, float scaleY, float scaleZ) {
      GL11.glScalef(scaleX, scaleY, scaleZ);
   }

   public void rotationpart(ModelRenderer part) {
      GL11.glTranslatef(part.field_78800_c * 0.0625F, part.field_78797_d * 0.0625F, part.field_78798_e * 0.0625F);
      if (part.field_78808_h != 0.0F) {
         GL11.glRotatef(part.field_78808_h * 57.295776F, 0.0F, 0.0F, 1.0F);
      }

      if (part.field_78796_g != 0.0F) {
         GL11.glRotatef(part.field_78796_g * 57.295776F, 0.0F, 1.0F, 0.0F);
      }

      if (part.field_78795_f != 0.0F) {
         GL11.glRotatef(part.field_78795_f * 57.295776F, 1.0F, 0.0F, 0.0F);
      }

   }

   static {
      partmodelhead = modelhead.groupObjects;
      modelhelm = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/dragonhelm.saga");
      partmodelhelm = modelhelm.groupObjects;
      modelguardhelm = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/guardhelm.saga");
      partmodelguardhelm = modelguardhelm.groupObjects;
      modelflamehelm = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/flameHelm.saga");
      partmodelflamehelm = modelflamehelm.groupObjects;
      modelarmor = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/dragonchest.saga");
      partmodelarmor = modelarmor.groupObjects;
      modellarm = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/dragonLarm.saga");
      partmodellarm = modellarm.groupObjects;
      modelrarm = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/dragonRarm.saga");
      partmodelrarm = modelrarm.groupObjects;
      modellleg = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/dragonLleg.saga");
      partmodellleg = modellleg.groupObjects;
      modelrleg = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/dragonRleg.saga");
      partmodelrleg = modelrleg.groupObjects;
      modelguardarmor = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/guardchest.saga");
      partmodelguardarmor = modelguardarmor.groupObjects;
      modelguardLarm = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/guardLarm.saga");
      partmodelguardLarm = modelguardLarm.groupObjects;
      modelguardRarm = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/guardRarm.saga");
      partmodelguardRarm = modelguardRarm.groupObjects;
      modelguardLleg = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/guardLleg.saga");
      partmodelguardLleg = modelguardLleg.groupObjects;
      modelguardRleg = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/guardRleg.saga");
      partmodelguardRleg = modelguardRleg.groupObjects;
      modelflamearmor = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/flameChest.saga");
      partmodelflamearmor = modelflamearmor.groupObjects;
      modelflameLarm = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/flameLarm.saga");
      partmodelflameLarm = modelflameLarm.groupObjects;
      modelflameRarm = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/flameRarm.saga");
      partmodelflameRarm = modelflameRarm.groupObjects;
      modelflameLleg = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/flameLleg.saga");
      partmodelflameLleg = modelflameLleg.groupObjects;
      modelflameRleg = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/flameRleg.saga");
      partmodelflameRleg = modelflameRleg.groupObjects;
      modelflamecape = (sagaobj)AssetManager.getObjModel("fantasyland:models/dragonset/flameCape.saga");
      partmodelflamecape = modelflamecape.groupObjects;
      modelhair1 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/hair1.saga");
      parthair1 = modelhair1.groupObjects;
      modelhair2 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/hair2.saga");
      parthair2 = modelhair2.groupObjects;
      modelhair3 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/hair3.saga");
      parthair3 = modelhair3.groupObjects;
      modelhair4 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/hair4.saga");
      parthair4 = modelhair4.groupObjects;
      modelhair5 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/hair5.saga");
      parthair5 = modelhair5.groupObjects;
      modelhair6 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/hair6.saga");
      parthair6 = modelhair6.groupObjects;
      modelhair7 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/hair7.saga");
      parthair7 = modelhair7.groupObjects;
      modelhair8 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/hair8.saga");
      parthair8 = modelhair8.groupObjects;
      modelhair9 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/hair9.saga");
      parthair9 = modelhair9.groupObjects;
      modelhair10 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/hair10.saga");
      parthair10 = modelhair10.groupObjects;
      modelghair1 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/ghair1.saga");
      partghair1 = modelghair1.groupObjects;
      modelghair2 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/ghair2.saga");
      partghair2 = modelghair2.groupObjects;
      modelghair3 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/ghair3.saga");
      partghair3 = modelghair3.groupObjects;
      modelghair4 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/ghair4.saga");
      partghair4 = modelghair4.groupObjects;
      modelghair5 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/ghair5.saga");
      partghair5 = modelghair5.groupObjects;
      modelghair6 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/ghair6.saga");
      partghair6 = modelghair6.groupObjects;
      modelghair7 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/ghair7.saga");
      partghair7 = modelghair7.groupObjects;
      modelghair8 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/ghair8.saga");
      partghair8 = modelghair8.groupObjects;
      modelghair9 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/ghair9.saga");
      partghair9 = modelghair9.groupObjects;
      modelghair10 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/ghair10.saga");
      partghair10 = modelghair10.groupObjects;
      modelghair11 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/ghair11.saga");
      partghair11 = modelghair11.groupObjects;
      modelghair12 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/ghair12.saga");
      partghair12 = modelghair12.groupObjects;
      modelghair13 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/ghair13.saga");
      partghair13 = modelghair13.groupObjects;
      modelghair14 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/ghair14.saga");
      partghair14 = modelghair14.groupObjects;
      modelghair15 = (sagaobj)AssetManager.getObjModel("fantasyland:models/hair/ghair15.saga");
      partghair15 = modelghair15.groupObjects;
      girlbody = (sagaobj)AssetManager.getObjModel("fantasyland:models/girl/body.saga");
      girlrarm = (sagaobj)AssetManager.getObjModel("fantasyland:models/girl/rarm.saga");
      girllarm = (sagaobj)AssetManager.getObjModel("fantasyland:models/girl/larm.saga");
      girlrleg = (sagaobj)AssetManager.getObjModel("fantasyland:models/girl/rleg.saga");
      girllleg = (sagaobj)AssetManager.getObjModel("fantasyland:models/girl/lleg.saga");
      model_boy_head = (sagaobj)AssetManager.getObjModel("fantasyland:models/boy/head.saga");
      model_boy_hair = (sagaobj)AssetManager.getObjModel("fantasyland:models/boy/hair.saga");
      model_boy_rarm = (sagaobj)AssetManager.getObjModel("fantasyland:models/boy/rarm.saga");
      model_boy_larm = (sagaobj)AssetManager.getObjModel("fantasyland:models/boy/larm.saga");
      model_boy_rleg = (sagaobj)AssetManager.getObjModel("fantasyland:models/boy/rleg.saga");
      model_boy_lleg = (sagaobj)AssetManager.getObjModel("fantasyland:models/boy/lleg.saga");
      model_boy_body = (sagaobj)AssetManager.getObjModel("fantasyland:models/boy/body.saga");
      set01atex = new ResourceLocation("cabalaccessorys", "models/armor/set01/set1a.png");
      set01btex = new ResourceLocation("cabalaccessorys", "models/armor/set01/set1b.png");
      set01ctex = new ResourceLocation("cabalaccessorys", "models/armor/set01/set1c.png");
      set01dtex = new ResourceLocation("cabalaccessorys", "models/armor/set01/set1d.png");
      set01etex = new ResourceLocation("cabalaccessorys", "models/armor/set01/set1e.png");
      set01head = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set01/head.saga");
      pset01head = set01head.groupObjects;
      set01body = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set01/body.saga");
      pset01body = set01body.groupObjects;
      set01rarm = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set01/rarm.saga");
      pset01rarm = set01rarm.groupObjects;
      set01larm = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set01/larm.saga");
      pset01larm = set01larm.groupObjects;
      set01rleg = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set01/rleg.saga");
      pset01rleg = set01rleg.groupObjects;
      set01lleg = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set01/lleg.saga");
      pset01lleg = set01lleg.groupObjects;
      set06tex = new ResourceLocation("cabalaccessorys", "models/armor/set02/set06.png");
      set07tex = new ResourceLocation("cabalaccessorys", "models/armor/set02/set07.png");
      set08tex = new ResourceLocation("cabalaccessorys", "models/armor/set02/set08.png");
      set09tex = new ResourceLocation("cabalaccessorys", "models/armor/set02/set09.png");
      set10tex = new ResourceLocation("cabalaccessorys", "models/armor/set02/set10.png");
      set02head = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set02/head.saga");
      pset02head = set02head.groupObjects;
      set02body = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set02/body.saga");
      pset02body = set02body.groupObjects;
      set02rarm = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set02/rarm.saga");
      pset02rarm = set02rarm.groupObjects;
      set02larm = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set02/larm.saga");
      pset02larm = set02larm.groupObjects;
      set11tex = new ResourceLocation("cabalaccessorys", "models/armor/set03/set11.png");
      set12tex = new ResourceLocation("cabalaccessorys", "models/armor/set03/set12.png");
      set13tex = new ResourceLocation("cabalaccessorys", "models/armor/set03/set13.png");
      set14tex = new ResourceLocation("cabalaccessorys", "models/armor/set03/set14.png");
      set15tex = new ResourceLocation("cabalaccessorys", "models/armor/set03/set15.png");
      set03head = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set03/head.saga");
      pset03head = set03head.groupObjects;
      set03body = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set03/body.saga");
      pset03body = set03body.groupObjects;
      set03cape = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set03/cape.saga");
      pset03cape = set03cape.groupObjects;
      set03rarm = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set03/rarm.saga");
      pset03rarm = set03rarm.groupObjects;
      set03larm = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set03/larm.saga");
      pset03larm = set03larm.groupObjects;
      set03rleg = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set03/rleg.saga");
      pset03rleg = set03rleg.groupObjects;
      set03lleg = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set03/lleg.saga");
      pset03lleg = set03lleg.groupObjects;
      set16tex = new ResourceLocation("cabalaccessorys", "models/armor/set04/set16.png");
      set17tex = new ResourceLocation("cabalaccessorys", "models/armor/set04/set17.png");
      set18tex = new ResourceLocation("cabalaccessorys", "models/armor/set04/set18.png");
      set19tex = new ResourceLocation("cabalaccessorys", "models/armor/set04/set19.png");
      set20tex = new ResourceLocation("cabalaccessorys", "models/armor/set04/set20.png");
      set04head = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set04/head.saga");
      pset04head = set04head.groupObjects;
      set04body = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set04/body.saga");
      pset04body = set04body.groupObjects;
      set04rarm = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set04/rarm.saga");
      pset04rarm = set04rarm.groupObjects;
      set04larm = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/armor/set04/larm.saga");
      pset04larm = set04larm.groupObjects;
      um1tex = new ResourceLocation("cabalaccessorys", "models/etc/umbrella1open.png");
      um1md = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/etc/umbrella1open.saga");
      pum1 = um1md.groupObjects;
      um2tex = new ResourceLocation("cabalaccessorys", "models/etc/umbrella2open.png");
      um2md = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/etc/umbrella2open.saga");
      pum2 = um2md.groupObjects;
      um3tex = new ResourceLocation("cabalaccessorys", "models/etc/umbrella3open.png");
      um3md = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/etc/umbrella3open.saga");
      pum3 = um3md.groupObjects;
      um4tex = new ResourceLocation("cabalaccessorys", "models/etc/umbrella4open.png");
      um4md = (sagaobj)AssetManager.getObjModel("cabalaccessorys:models/etc/umbrella4open.saga");
      pum4 = um4md.groupObjects;
      mh = new mh();
   }
}
