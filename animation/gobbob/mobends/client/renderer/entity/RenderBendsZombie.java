package animation.gobbob.mobends.client.renderer.entity;

import animation.gobbob.mobends.MoBends;
import animation.gobbob.mobends.client.model.entity.ModelBendsZombie;
import animation.gobbob.mobends.client.model.entity.ModelBendsZombieVillager;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderBendsZombie extends RenderBiped {
   private static final ResourceLocation zombiePigmanTextures = new ResourceLocation("textures/entity/zombie_pigman.png");
   private static final ResourceLocation zombieTextures = new ResourceLocation("textures/entity/zombie/zombie.png");
   private static final ResourceLocation zombieVillagerTextures = new ResourceLocation("textures/entity/zombie/zombie_villager.png");
   private ModelBiped zombieRegularModel;
   private ModelBendsZombieVillager zombieVillagerModel;
   protected ModelBiped zombieRegularArmorChestplate;
   protected ModelBiped zombieRegularArmor;
   protected ModelBiped villagerRegularArmorChestplate;
   protected ModelBiped villagerRegularArmor;
   private int field_82431_q = 1;
   private static final String __OBFID = "CL_00001037";
   public int refreshModel = 0;

   public RenderBendsZombie() {
      super(new ModelBendsZombie(), 0.5F, 1.0F);
      this.zombieRegularModel = this.field_77071_a;
      this.zombieVillagerModel = new ModelBendsZombieVillager();
   }

   protected void func_82421_b() {
      this.field_82423_g = new ModelBendsZombie(1.0F, true);
      this.field_82425_h = new ModelBendsZombie(0.5F, true);
      this.zombieRegularArmorChestplate = this.field_82423_g;
      this.zombieRegularArmor = this.field_82425_h;
      this.villagerRegularArmorChestplate = new ModelBendsZombieVillager(1.0F, 0.0F, true);
      this.villagerRegularArmor = new ModelBendsZombieVillager(0.5F, 0.0F, true);
   }

   protected int shouldRenderPass(EntityZombie p_77032_1_, int p_77032_2_, float p_77032_3_) {
      this.func_82427_a(p_77032_1_);
      return super.func_77032_a(p_77032_1_, p_77032_2_, p_77032_3_);
   }

   public void doRender(EntityZombie p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
      if (this.refreshModel != MoBends.refreshModel) {
         this.field_77045_g = new ModelBendsZombie();
         this.field_77071_a = (ModelBendsZombie)this.field_77045_g;
         this.zombieRegularModel = this.field_77071_a;
         this.zombieVillagerModel = new ModelBendsZombieVillager();
         this.refreshModel = MoBends.refreshModel;
      }

      this.func_82427_a(p_76986_1_);
      super.func_76986_a(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
   }

   protected ResourceLocation getEntityTexture(EntityZombie p_110775_1_) {
      return p_110775_1_ instanceof EntityPigZombie ? zombiePigmanTextures : (p_110775_1_.func_82231_m() ? zombieVillagerTextures : zombieTextures);
   }

   protected void renderEquippedItems(EntityZombie p_77029_1_, float p_77029_2_) {
      this.func_82427_a(p_77029_1_);
      super.func_77029_c(p_77029_1_, p_77029_2_);
   }

   private void func_82427_a(EntityZombie p_82427_1_) {
      if (p_82427_1_.func_82231_m()) {
         if (this.field_82431_q != 10) {
            this.zombieVillagerModel = new ModelBendsZombieVillager();
            this.field_82431_q = 10;
            this.villagerRegularArmorChestplate = new ModelBendsZombieVillager(1.0F, 0.0F, true);
            this.villagerRegularArmor = new ModelBendsZombieVillager(0.5F, 0.0F, true);
         }

         this.field_77045_g = this.zombieVillagerModel;
         this.field_82423_g = this.villagerRegularArmorChestplate;
         this.field_82425_h = this.villagerRegularArmor;
      } else {
         this.field_77045_g = this.zombieRegularModel;
         this.field_82423_g = this.zombieRegularArmorChestplate;
         this.field_82425_h = this.zombieRegularArmor;
      }

      this.field_77071_a = (ModelBiped)this.field_77045_g;
   }

   protected void rotateCorpse(EntityZombie p_77043_1_, float p_77043_2_, float p_77043_3_, float p_77043_4_) {
      if (p_77043_1_.func_82230_o()) {
         p_77043_3_ += (float)(Math.cos((double)p_77043_1_.field_70173_aa * 3.25D) * 3.141592653589793D * 0.25D);
      }

      super.func_77043_a(p_77043_1_, p_77043_2_, p_77043_3_, p_77043_4_);
   }

   protected void func_77029_c(EntityLiving p_77029_1_, float p_77029_2_) {
      this.renderEquippedItems((EntityZombie)p_77029_1_, p_77029_2_);
   }

   protected ResourceLocation func_110775_a(EntityLiving p_110775_1_) {
      return this.getEntityTexture((EntityZombie)p_110775_1_);
   }

   public void func_76986_a(EntityLiving p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
      this.doRender((EntityZombie)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
   }

   protected int func_77032_a(EntityLiving p_77032_1_, int p_77032_2_, float p_77032_3_) {
      return this.shouldRenderPass((EntityZombie)p_77032_1_, p_77032_2_, p_77032_3_);
   }

   protected int func_77032_a(EntityLivingBase p_77032_1_, int p_77032_2_, float p_77032_3_) {
      return this.shouldRenderPass((EntityZombie)p_77032_1_, p_77032_2_, p_77032_3_);
   }

   protected void func_77029_c(EntityLivingBase p_77029_1_, float p_77029_2_) {
      this.renderEquippedItems((EntityZombie)p_77029_1_, p_77029_2_);
   }

   protected void func_77043_a(EntityLivingBase p_77043_1_, float p_77043_2_, float p_77043_3_, float p_77043_4_) {
      this.rotateCorpse((EntityZombie)p_77043_1_, p_77043_2_, p_77043_3_, p_77043_4_);
   }

   public void func_76986_a(EntityLivingBase p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
      this.doRender((EntityZombie)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
   }

   protected ResourceLocation func_110775_a(Entity p_110775_1_) {
      return this.getEntityTexture((EntityZombie)p_110775_1_);
   }

   public void func_76986_a(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
      this.doRender((EntityZombie)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
   }
}
