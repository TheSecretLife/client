package sp;

import cabalaccessorys.data.PlayerData;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import partysystem.MainModParty;
import partysystem.entity.PartyData;

public class EntityCustomMobBase extends EntityMob implements IMob {
   private static final String __OBFID = "CL_00001692";
   public String entityname = "none";
   public String mobname = "none";
   public int exp = 1;
   public int level = 1;
   public int hp = 20;
   public int damage = 1;
   public int money = 1;
   public float movespeed = 0.3F;
   public int xx = 0;
   public int yy = 0;
   public int zz = 0;
   public int atk = 0;
   public String item1 = "-1,1,1";
   public String item2 = "-1,1,1";
   public String item3 = "-1,1,1";
   public String item4 = "-1,1,1";
   public String item5 = "-1,1,1";
   public String item6 = "-1,1,1";
   public String item7 = "-1,1,1";
   public String item8 = "-1,1,1";
   public String item9 = "-1,1,1";

   public EntityCustomMobBase(World p_i1738_1_) {
      super(p_i1738_1_);
      this.func_70105_a(1.0F, 2.0F);
      this.func_94061_f(true);
      this.func_70096_w().func_75682_a(23, this.item1 + "/" + this.item2 + "/" + this.item3 + "/" + this.item4 + "/" + this.item5 + "/" + this.item6 + "/" + this.item7 + "/" + this.item8 + "/" + this.item9);
      this.func_70096_w().func_75682_a(24, this.entityname + "," + this.mobname + "," + this.exp + "," + this.level + "," + this.hp + "," + this.damage + "," + this.money + "," + this.movespeed);
      this.func_70096_w().func_75682_a(25, this.xx + "," + this.yy + "," + this.zz + "," + this.atk);
      this.func_70691_i(9.9999998E12F);
   }

   public void func_70109_d(NBTTagCompound propertyData) {
      NBTTagCompound properties = new NBTTagCompound();
      properties.func_74768_a("exp", this.exp);
      properties.func_74768_a("level", this.level);
      properties.func_74768_a("hp", this.hp);
      properties.func_74768_a("money", this.money);
      properties.func_74768_a("damage", this.damage);
      properties.func_74776_a("movespeed", this.movespeed);
      properties.func_74778_a("entityname", this.entityname);
      properties.func_74778_a("mobname", this.mobname);
      properties.func_74768_a("xx", this.xx);
      properties.func_74768_a("yy", this.yy);
      properties.func_74768_a("zz", this.zz);
      properties.func_74768_a("atk", this.atk);
      properties.func_74778_a("item3", this.item1);
      properties.func_74778_a("item4", this.item2);
      properties.func_74778_a("item5", this.item3);
      properties.func_74778_a("item6", this.item4);
      properties.func_74778_a("item7", this.item5);
      properties.func_74778_a("item8", this.item6);
      properties.func_74778_a("item9", this.item7);
      properties.func_74778_a("item10", this.item8);
      properties.func_74778_a("item11", this.item9);
      propertyData.func_74782_a("CustomData", properties);
      super.func_70109_d(propertyData);
   }

   public void func_70020_e(NBTTagCompound propertyData) {
      NBTTagCompound properties = (NBTTagCompound)propertyData.func_74781_a("CustomData");
      this.exp = properties.func_74762_e("exp");
      this.level = properties.func_74762_e("level");
      this.hp = properties.func_74762_e("hp");
      this.money = properties.func_74762_e("money");
      this.damage = properties.func_74762_e("damage");
      this.movespeed = properties.func_74760_g("movespeed");
      this.entityname = properties.func_74779_i("entityname");
      this.mobname = properties.func_74779_i("mobname");
      this.xx = properties.func_74762_e("xx");
      this.yy = properties.func_74762_e("yy");
      this.zz = properties.func_74762_e("zz");
      this.atk = properties.func_74762_e("atk");
      this.item1 = properties.func_74779_i("item3");
      this.item2 = properties.func_74779_i("item4");
      this.item3 = properties.func_74779_i("item5");
      this.item4 = properties.func_74779_i("item6");
      this.item5 = properties.func_74779_i("item7");
      this.item6 = properties.func_74779_i("item8");
      this.item7 = properties.func_74779_i("item9");
      this.item8 = properties.func_74779_i("item10");
      this.item9 = properties.func_74779_i("item11");
      this.func_70096_w().func_75692_b(23, this.item1 + "/" + this.item2 + "/" + this.item3 + "/" + this.item4 + "/" + this.item5 + "/" + this.item6 + "/" + this.item7 + "/" + this.item8 + "/" + this.item9);
      this.func_70096_w().func_75692_b(24, this.entityname + "," + this.mobname + "," + this.exp + "," + this.level + "," + this.hp + "," + this.damage + "," + this.money + "," + this.movespeed);
      this.func_70096_w().func_75692_b(25, this.xx + "," + this.yy + "," + this.zz + "," + this.atk);
      super.func_70020_e(propertyData);
   }

   public void func_70636_d() {
      this.func_82168_bl();
      float f = this.func_70013_c(1.0F);
      this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.8D);
      this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a((double)Integer.parseInt(this.func_70096_w().func_75681_e(24).split(",")[4]));
      this.func_110148_a(SharedMonsterAttributes.field_111265_b).func_111128_a(40.0D);
      this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a((double)Integer.parseInt(this.func_70096_w().func_75681_e(24).split(",")[5]));
      this.func_94061_f(true);
      this.func_94058_c(this.func_70096_w().func_75681_e(24).split(",")[1].replaceAll("&", "§"));
      if (Integer.parseInt(this.func_70096_w().func_75681_e(25).split(",")[3]) == 0) {
         this.func_70691_i(this.func_110138_aP());
      }

      if (!this.field_70170_p.field_72995_K && this.field_70789_a == null && this.field_70173_aa % 2400 == 0) {
         int x = Integer.parseInt(this.func_70096_w().func_75681_e(25).split(",")[0]);
         int y = Integer.parseInt(this.func_70096_w().func_75681_e(25).split(",")[1]);
         int z = Integer.parseInt(this.func_70096_w().func_75681_e(25).split(",")[2]);
         if (this.field_70170_p.func_147438_o(x, y, z) instanceof SpawnBlockTileEntity) {
            if (((SpawnBlockTileEntity)this.field_70170_p.func_147438_o(x, y, z)).count > 0) {
               --((SpawnBlockTileEntity)this.field_70170_p.func_147438_o(x, y, z)).count;
            }

            ((SpawnBlockTileEntity)this.field_70170_p.func_147438_o(x, y, z)).func_145845_h();
            this.field_70170_p.func_147471_g(x, y, z);
            ((SpawnBlockTileEntity)this.field_70170_p.func_147438_o(x, y, z)).func_70296_d();
         }

         this.func_70106_y();
      }

      super.func_70636_d();
   }

   public void func_70071_h_() {
      super.func_70071_h_();
   }

   protected String func_145776_H() {
      return "game.hostile.swim";
   }

   protected String func_145777_O() {
      return "game.hostile.swim.splash";
   }

   protected Entity func_70782_k() {
      EntityPlayer entityplayer = this.field_70170_p.func_72856_b(this, 16.0D);
      return null;
   }

   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
      if (Integer.parseInt(this.func_70096_w().func_75681_e(25).split(",")[3]) == 0) {
         this.atk = 1;
         this.func_70096_w().func_75692_b(25, this.xx + "," + this.yy + "," + this.zz + "," + 1);
      }

      Entity entity = par1DamageSource.func_76346_g();
      if (this.field_70153_n != entity && this.field_70154_o != entity && entity != this) {
         this.field_70789_a = entity;
      }

      return super.func_70097_a(par1DamageSource, par2);
   }

   protected String func_70621_aR() {
      return "game.hostile.hurt";
   }

   protected String func_70673_aS() {
      return "game.hostile.die";
   }

   protected String func_146067_o(int p_146067_1_) {
      return p_146067_1_ > 4 ? "game.hostile.hurt.fall.big" : "game.hostile.hurt.fall.small";
   }

   public boolean func_70652_k(Entity p_70652_1_) {
      float f = (float)Integer.parseInt(this.func_70096_w().func_75681_e(24).split(",")[5]);
      int i = 0;
      if (p_70652_1_ instanceof EntityLivingBase) {
         f += EnchantmentHelper.func_77512_a(this, (EntityLivingBase)p_70652_1_);
         i += EnchantmentHelper.func_77507_b(this, (EntityLivingBase)p_70652_1_);
      }

      boolean flag = p_70652_1_.func_70097_a(DamageSource.func_76358_a(this), f);
      if (flag) {
         if (i > 0) {
            p_70652_1_.func_70024_g((double)(-MathHelper.func_76126_a(this.field_70177_z * 3.1415927F / 180.0F) * (float)i * 0.5F), 0.1D, (double)(MathHelper.func_76134_b(this.field_70177_z * 3.1415927F / 180.0F) * (float)i * 0.5F));
            this.field_70159_w *= 0.6D;
            this.field_70179_y *= 0.6D;
         }

         int j = EnchantmentHelper.func_90036_a(this);
         if (j > 0) {
            p_70652_1_.func_70015_d(j * 4);
         }

         if (p_70652_1_ instanceof EntityLivingBase) {
            EnchantmentHelper.func_151384_a((EntityLivingBase)p_70652_1_, this);
         }

         EnchantmentHelper.func_151385_b(this, p_70652_1_);
      }

      return flag;
   }

   protected void func_70785_a(Entity p_70785_1_, float p_70785_2_) {
      if (this.field_70724_aR <= 0 && p_70785_2_ < 2.0F && p_70785_1_.field_70121_D.field_72337_e > this.field_70121_D.field_72338_b && p_70785_1_.field_70121_D.field_72338_b < this.field_70121_D.field_72337_e) {
         this.field_70724_aR = 20;
         this.func_70652_k(p_70785_1_);
      }

   }

   public float func_70783_a(int p_70783_1_, int p_70783_2_, int p_70783_3_) {
      return 0.5F - this.field_70170_p.func_72801_o(p_70783_1_, p_70783_2_, p_70783_3_);
   }

   protected boolean func_70814_o() {
      int i = MathHelper.func_76128_c(this.field_70165_t);
      int j = MathHelper.func_76128_c(this.field_70121_D.field_72338_b);
      int k = MathHelper.func_76128_c(this.field_70161_v);
      if (this.field_70170_p.func_72972_b(EnumSkyBlock.Sky, i, j, k) > this.field_70146_Z.nextInt(32)) {
         return false;
      } else {
         int l = this.field_70170_p.func_72957_l(i, j, k);
         if (this.field_70170_p.func_72911_I()) {
            int i1 = this.field_70170_p.field_73008_k;
            this.field_70170_p.field_73008_k = 10;
            l = this.field_70170_p.func_72957_l(i, j, k);
            this.field_70170_p.field_73008_k = i1;
         }

         return l <= this.field_70146_Z.nextInt(8);
      }
   }

   public boolean func_70601_bi() {
      return this.field_70170_p.field_73013_u != EnumDifficulty.PEACEFUL && this.func_70814_o() && super.func_70601_bi();
   }

   protected void func_110147_ax() {
      super.func_110147_ax();
   }

   protected boolean func_146066_aG() {
      return true;
   }

   protected void func_70628_a(boolean bo, int loot) {
      if (this.field_70717_bb != null && !this.field_70170_p.field_72995_K) {
         PlayerData data = PlayerData.get(this.field_70717_bb);
         PartyData DATA = PartyData.get(this.field_70717_bb);
         int monlv = Integer.parseInt(this.func_70096_w().func_75681_e(24).split(",")[3]);
         int minp = data.Level - 7;
         int maxp = data.Level + 7;
         int value;
         if (maxp >= monlv && minp <= monlv) {
            if (!DATA.PartyName.equalsIgnoreCase("") && !DATA.PartyName.isEmpty()) {
               MainModParty.config.load();
               String[] member = MainModParty.config.get(DATA.PartyName.toLowerCase(), "Member", "").getString().split(",");
               int EXP = Integer.parseInt(this.func_70096_w().func_75681_e(24).split(",")[2]);
               if (member.length > 1) {
                  String[] var10 = member;
                  int var11 = member.length;

                  for(value = 0; value < var11; ++value) {
                     String aMember = var10[value];
                     EntityPlayer player = MinecraftServer.func_71276_C().func_71203_ab().func_152612_a(aMember);
                     if (player != null) {
                        int range = 20;
                        List en = this.field_70170_p.func_72872_a(EntityPlayer.class, AxisAlignedBB.func_72330_a(this.field_70165_t - (double)range, this.field_70163_u - (double)range, this.field_70161_v - (double)range, this.field_70165_t + (double)range, this.field_70163_u + (double)range, this.field_70161_v + (double)range));
                        Iterator var17 = en.iterator();

                        while(var17.hasNext()) {
                           EntityPlayer anEn = (EntityPlayer)var17.next();
                           if (anEn.equals(player)) {
                              PlayerData pxp = PlayerData.get(anEn);
                              if (EXP / member.length > 0) {
                                 anEn.func_71023_q(EXP / member.length);
                                 anEn.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §eท่านได้รับ §f" + EXP / member.length + " §eEXP"));
                              } else {
                                 anEn.func_71023_q(1);
                                 anEn.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §eท่านได้รับ §f1 §eEXP"));
                              }

                              if (Integer.parseInt(this.func_70096_w().func_75681_e(24).split(",")[6]) / member.length > 0) {
                                 pxp.Money += Integer.parseInt(this.func_70096_w().func_75681_e(24).split(",")[6]) / member.length;
                                 anEn.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §eท่านได้รับ §f" + Integer.parseInt(this.func_70096_w().func_75681_e(24).split(",")[6]) / member.length + " §eGold"));
                              } else {
                                 ++pxp.Money;
                                 anEn.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §eท่านได้รับ §f1 §eGold"));
                              }
                              break;
                           }
                        }
                     }
                  }
               }
            } else {
               PlayerData px = PlayerData.get(this.field_70717_bb);
               this.field_70717_bb.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §eท่านได้รับ §f" + Integer.parseInt(this.func_70096_w().func_75681_e(24).split(",")[2]) + " §eEXP"));
               this.field_70717_bb.func_145747_a(new ChatComponentText("§f[§aระบบ§f] §eท่านได้รับ §f" + Integer.parseInt(this.func_70096_w().func_75681_e(24).split(",")[6]) + " §eGold"));
               this.field_70717_bb.func_71023_q(Integer.parseInt(this.func_70096_w().func_75681_e(24).split(",")[2]));
               px.Money += Integer.parseInt(this.func_70096_w().func_75681_e(24).split(",")[6]);
            }
         } else {
            this.field_70717_bb.func_145747_a(new ChatComponentTranslation("§f[§aระบบ§f] §cตัวละครของคุณเลเวลห่างจากมอนสเตอร์ 7 เลเวล", new Object[0]));
         }

         int max = 100;
         int min = 1;
         if (this.field_70717_bb.field_71071_by.func_70447_i() >= 0) {
            ItemStack item;
            Random rn;
            if (Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[0].split(",")[0])) != null) {
               item = new ItemStack(Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[0].split(",")[0])), Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[0].split(",")[1]));
               rn = new Random();
               value = min + rn.nextInt(max);
               if (value < Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[0].split(",")[2])) {
                  this.getitemparty(DATA, item, this.field_70717_bb);
               }
            }

            if (Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[1].split(",")[0])) != null) {
               item = new ItemStack(Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[1].split(",")[0])), Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[1].split(",")[1]));
               rn = new Random();
               value = min + rn.nextInt(max);
               if (value < Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[1].split(",")[2])) {
                  this.getitemparty(DATA, item, this.field_70717_bb);
               }
            }

            if (Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[2].split(",")[0])) != null) {
               item = new ItemStack(Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[2].split(",")[0])), Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[2].split(",")[1]));
               rn = new Random();
               value = min + rn.nextInt(max);
               if (value < Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[2].split(",")[2])) {
                  this.getitemparty(DATA, item, this.field_70717_bb);
               }
            }

            if (Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[3].split(",")[0])) != null) {
               item = new ItemStack(Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[3].split(",")[0])), Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[3].split(",")[1]));
               rn = new Random();
               value = min + rn.nextInt(max);
               if (value < Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[3].split(",")[2])) {
                  this.getitemparty(DATA, item, this.field_70717_bb);
               }
            }

            if (Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[4].split(",")[0])) != null) {
               item = new ItemStack(Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[4].split(",")[0])), Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[4].split(",")[1]));
               rn = new Random();
               value = min + rn.nextInt(max);
               if (value < Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[4].split(",")[2])) {
                  this.getitemparty(DATA, item, this.field_70717_bb);
               }
            }

            if (Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[5].split(",")[0])) != null) {
               item = new ItemStack(Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[5].split(",")[0])), Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[5].split(",")[1]));
               rn = new Random();
               value = min + rn.nextInt(max);
               if (value < Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[5].split(",")[2])) {
                  this.getitemparty(DATA, item, this.field_70717_bb);
               }
            }

            if (Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[6].split(",")[0])) != null) {
               item = new ItemStack(Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[6].split(",")[0])), Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[6].split(",")[1]));
               rn = new Random();
               value = min + rn.nextInt(max);
               if (value < Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[6].split(",")[2])) {
                  this.getitemparty(DATA, item, this.field_70717_bb);
               }
            }

            if (Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[7].split(",")[0])) != null) {
               item = new ItemStack(Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[7].split(",")[0])), Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[7].split(",")[1]));
               rn = new Random();
               value = min + rn.nextInt(max);
               if (value < Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[7].split(",")[2])) {
                  this.getitemparty(DATA, item, this.field_70717_bb);
               }
            }

            if (Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[8].split(",")[0])) != null) {
               item = new ItemStack(Item.func_150899_d(Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[8].split(",")[0])), Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[8].split(",")[1]));
               rn = new Random();
               value = min + rn.nextInt(max);
               if (value < Integer.parseInt(this.func_70096_w().func_75681_e(23).split("/")[8].split(",")[2])) {
                  this.getitemparty(DATA, item, this.field_70717_bb);
               }
            }
         } else {
            this.field_70717_bb.func_145747_a(new ChatComponentTranslation("§f[§aระบบ§f] §cช่องเก็บของในตัวไม่พอคุณจะไม่ได้รับไอเทม", new Object[0]));
         }
      }

   }

   public void getitemparty(PartyData DATA, ItemStack item, EntityPlayer player) {
      if (!this.field_70170_p.field_72995_K) {
         int range = 20;
         if (!DATA.PartyName.equalsIgnoreCase("") && !DATA.PartyName.isEmpty()) {
            MainModParty.config.load();
            if (MainModParty.config.get(DATA.PartyName.toLowerCase(), "PickupType", "").getBoolean()) {
               String[] member = MainModParty.config.get(DATA.PartyName.toLowerCase(), "Member", "").getString().split(",");

               for(int i = 0; i < member.length; ++i) {
                  EntityPlayer p = MinecraftServer.func_71276_C().func_71203_ab().func_152612_a(member[i]);
                  if (p != null) {
                     List en = this.field_70170_p.func_72872_a(EntityPlayer.class, AxisAlignedBB.func_72330_a(this.field_70165_t - (double)range, this.field_70163_u - (double)range, this.field_70161_v - (double)range, this.field_70165_t + (double)range, this.field_70163_u + (double)range, this.field_70161_v + (double)range));

                     for(int j = 0; j < en.size(); ++j) {
                        if (((EntityPlayer)en.get(j)).equals(p)) {
                           Random rnitm = new Random();
                           int rr = rnitm.nextInt(en.size() - 1 - 0 + 1) + 0;
                           if (rr == j) {
                              ((EntityPlayer)en.get(j)).field_71071_by.func_70441_a(item);
                              ((EntityPlayer)en.get(j)).field_71069_bz.func_75142_b();
                           }
                           break;
                        }
                     }
                  }
               }
            }
         } else {
            player.field_71071_by.func_70441_a(item);
            player.field_71069_bz.func_75142_b();
         }
      }

   }

   public void func_110163_bv() {
      super.func_110163_bv();
   }

   protected boolean func_70692_ba() {
      return false;
   }

   public void func_70106_y() {
      super.func_70106_y();
   }
}
