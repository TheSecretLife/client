package sp;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class SpawnBlockTileEntity extends TileEntity implements IInventory {
   public String entityclassname = "";
   public String mobname = "";
   public int exp = 0;
   public int level = 0;
   public int hp = 0;
   public int damage = 0;
   public int money = 0;
   public int max = 0;
   public int range = 0;
   public int countmax = 11;
   public int count = 0;
   public int tick = 0;
   public boolean status = false;
   public boolean sp = false;
   Random rand = new Random();
   public int Radius = 20;
   Map pos = new HashMap();
   private ItemStack[] inventory = new ItemStack[this.func_70302_i_()];
   private String customName = "none";
   private String namenpc = "none";

   public Packet func_145844_m() {
      NBTTagCompound tag = new NBTTagCompound();
      this.func_145841_b(tag);
      return new S35PacketUpdateTileEntity(this.field_145851_c, this.field_145848_d, this.field_145849_e, this.field_145847_g, tag);
   }

   public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
      this.func_145839_a(pkt.func_148857_g());
   }

   public String getNamenpc() {
      return this.namenpc;
   }

   public void func_70296_d() {
      super.func_70296_d();
   }

   public String getCustomName() {
      return this.customName;
   }

   public void setCustomName(String customName) {
      this.customName = customName;
   }

   public int func_70302_i_() {
      return 36;
   }

   public String getName() {
      return this.hasCustomName() ? this.customName : "container.tutorial_tile_entity";
   }

   public boolean hasCustomName() {
      return this.customName != null && !this.customName.equals("");
   }

   public IChatComponent getDisplayName() {
      return (IChatComponent)(this.hasCustomName() ? new ChatComponentText(this.getName()) : new ChatComponentTranslation(this.getName(), new Object[0]));
   }

   public ItemStack func_70301_a(int index) {
      return index >= 0 && index < this.func_70302_i_() ? this.inventory[index] : null;
   }

   public ItemStack func_70298_a(int index, int count) {
      if (this.func_70301_a(index) != null) {
         ItemStack itemstack;
         if (this.func_70301_a(index).field_77994_a <= count) {
            itemstack = this.func_70301_a(index);
            this.func_70299_a(index, (ItemStack)null);
            this.func_70296_d();
            return itemstack;
         } else {
            itemstack = this.func_70301_a(index).func_77979_a(count);
            if (this.func_70301_a(index).field_77994_a <= 0) {
               this.func_70299_a(index, (ItemStack)null);
            } else {
               this.func_70299_a(index, this.func_70301_a(index));
            }

            this.func_70296_d();
            return itemstack;
         }
      } else {
         return null;
      }
   }

   public ItemStack func_70304_b(int index) {
      ItemStack stack = this.func_70301_a(index);
      this.func_70299_a(index, (ItemStack)null);
      return stack;
   }

   public void func_70299_a(int index, ItemStack stack) {
      if (index >= 0 && index < this.func_70302_i_()) {
         if (stack != null && stack.field_77994_a > this.func_70297_j_()) {
            stack.field_77994_a = this.func_70297_j_();
         }

         if (stack != null && stack.field_77994_a == 0) {
            stack = null;
         }

         this.inventory[index] = stack;
         this.func_70296_d();
      }
   }

   public String func_145825_b() {
      return this.hasCustomName() ? this.customName : "container.tutorial_tile_entity";
   }

   public boolean func_145818_k_() {
      return this.customName != null && !this.customName.equals("");
   }

   public int func_70297_j_() {
      return 64;
   }

   public boolean func_70300_a(EntityPlayer p_70300_1_) {
      if (this.field_145850_b == null) {
         return true;
      } else if (this.field_145850_b.func_147438_o(this.field_145851_c, this.field_145848_d, this.field_145849_e) != this) {
         return false;
      } else {
         return p_70300_1_.func_70092_e((double)this.field_145851_c + 0.5D, (double)this.field_145848_d + 0.5D, (double)this.field_145849_e + 0.5D) <= 64.0D;
      }
   }

   public void func_70295_k_() {
   }

   public void func_70305_f() {
   }

   public boolean func_94041_b(int p_94041_1_, ItemStack p_94041_2_) {
      return true;
   }

   public int getField(int id) {
      return 0;
   }

   public void setField(int id, int value) {
   }

   public int getFieldCount() {
      return 0;
   }

   public void clear() {
      for(int i = 0; i < this.func_70302_i_(); ++i) {
         this.func_70299_a(i, (ItemStack)null);
      }

   }

   public void setNamenpc(String namenpc) {
      this.namenpc = namenpc;
   }

   public void func_145841_b(NBTTagCompound nbt) {
      super.func_145841_b(nbt);
      NBTTagList list = new NBTTagList();

      for(int i = 0; i < this.func_70302_i_(); ++i) {
         if (this.func_70301_a(i) != null) {
            NBTTagCompound stackTag = new NBTTagCompound();
            stackTag.func_74774_a("SlotItem", (byte)i);
            this.func_70301_a(i).func_77955_b(stackTag);
            list.func_74742_a(stackTag);
         }
      }

      nbt.func_74782_a("SpawnMonster", list);
      nbt.func_74778_a("CustomName", this.getCustomName());
      nbt.func_74778_a("namenpc", this.getNamenpc());
      nbt.func_74768_a("exp", this.exp);
      nbt.func_74768_a("hp", this.hp);
      nbt.func_74768_a("damage", this.damage);
      nbt.func_74768_a("money", this.money);
      nbt.func_74768_a("level", this.level);
      nbt.func_74768_a("max", this.max);
      nbt.func_74768_a("range", this.range);
      nbt.func_74778_a("mobname", this.mobname);
      nbt.func_74778_a("entityclassname", this.entityclassname);
      nbt.func_74768_a("count", this.count);
      nbt.func_74768_a("countmax", this.countmax);
      nbt.func_74757_a("status", this.status);
      nbt.func_74757_a("sp", this.sp);
      nbt.func_74768_a("tick", this.tick);
   }

   public void func_145839_a(NBTTagCompound nbt) {
      super.func_145839_a(nbt);
      NBTTagList list = nbt.func_150295_c("SpawnMonster", 10);

      for(int i = 0; i < list.func_74745_c(); ++i) {
         NBTTagCompound stackTag = list.func_150305_b(i);
         int slot = stackTag.func_74771_c("SlotItem") & 255;
         this.func_70299_a(slot, ItemStack.func_77949_a(stackTag));
      }

      this.setCustomName(nbt.func_74779_i("CustomName"));
      this.setNamenpc(nbt.func_74779_i("namenpc"));
      this.exp = nbt.func_74762_e("exp");
      this.hp = nbt.func_74762_e("hp");
      this.damage = nbt.func_74762_e("damage");
      this.money = nbt.func_74762_e("money");
      this.level = nbt.func_74762_e("level");
      this.range = nbt.func_74762_e("range");
      this.max = nbt.func_74762_e("max");
      this.mobname = nbt.func_74779_i("mobname");
      this.entityclassname = nbt.func_74779_i("entityclassname");
      this.count = nbt.func_74762_e("count");
      this.countmax = nbt.func_74762_e("countmax");
      this.status = nbt.func_74767_n("status");
      this.sp = nbt.func_74767_n("sp");
      this.tick = nbt.func_74762_e("tick");
   }

   public void func_145845_h() {
      if (!this.field_145850_b.field_72995_K && this.status) {
         ++this.tick;
         int upX = this.rand.nextInt(this.Radius) - this.Radius / 2;
         int upZ = this.rand.nextInt(this.Radius) - this.Radius / 2;
         int upY = this.rand.nextInt(20) - 10;
         if (this.pos.size() <= 11 && this.field_145850_b.func_147437_c(this.field_145851_c + upX, this.field_145848_d + upY, this.field_145849_e + upZ) && !this.field_145850_b.func_147437_c(this.field_145851_c + upX, this.field_145848_d + upY - 1, this.field_145849_e + upZ) && this.field_145850_b.func_147437_c(this.field_145851_c + upX, this.field_145848_d + upY + 1, this.field_145849_e + upZ) && this.field_145850_b.func_147437_c(this.field_145851_c + upX, this.field_145848_d + upY + 2, this.field_145849_e + upZ) && this.field_145850_b.func_147437_c(this.field_145851_c + upX, this.field_145848_d + upY + 3, this.field_145849_e + upZ) && this.field_145850_b.func_147437_c(this.field_145851_c + upX + 1, this.field_145848_d + upY, this.field_145849_e + upZ) && this.field_145850_b.func_147437_c(this.field_145851_c + upX - 1, this.field_145848_d + upY, this.field_145849_e + upZ) && this.field_145850_b.func_147437_c(this.field_145851_c + upX, this.field_145848_d + upY, this.field_145849_e + upZ + 1) && this.field_145850_b.func_147437_c(this.field_145851_c + upX, this.field_145848_d + upY, this.field_145849_e + upZ - 1) && this.field_145850_b.func_147439_a(this.field_145851_c + upX, this.field_145848_d + upY, this.field_145849_e + upZ) != Blocks.field_150355_j && this.field_145850_b.func_147439_a(this.field_145851_c + upX, this.field_145848_d + upY, this.field_145849_e + upZ) != Blocks.field_150353_l && this.field_145850_b.func_147439_a(this.field_145851_c + upX, this.field_145848_d + upY, this.field_145849_e + upZ) != Blocks.field_150362_t && this.field_145850_b.func_147439_a(this.field_145851_c + upX, this.field_145848_d + upY, this.field_145849_e + upZ) != Blocks.field_150361_u) {
            for(int i = 1; i < 11; ++i) {
               if (this.pos.get("pos" + i) == null) {
                  this.pos.put("pos" + i, this.field_145851_c + upX + "," + (this.field_145848_d + upY) + "," + (this.field_145849_e + upZ));
                  break;
               }
            }
         }

         if (this.count == 1 || this.count <= 0) {
            this.sp = true;
         }

         if (this.count < 5 && this.tick % 6000 == 0) {
            this.sp = true;
            this.count = 1;
         }

         if (this.sp && this.tick % 200 == 0 && this.count < this.countmax) {
            World world = this.field_145850_b;
            EntityCustomMobBase en = new EntityCustomMobBase(world);
            int max = 10;
            int min = 1;
            Random rn = new Random();
            int value = min + rn.nextInt(max);
            if (this.pos.get("pos" + value) != null) {
               en.func_70107_b(Double.parseDouble(((String)this.pos.get("pos" + value)).split(",")[0]), Double.parseDouble(((String)this.pos.get("pos" + value)).split(",")[1]), Double.parseDouble(((String)this.pos.get("pos" + value)).split(",")[2]));
            }

            NBTTagCompound nbt = en.getEntityData();
            en.entityname = this.entityclassname;
            en.damage = this.damage;
            en.hp = this.hp;
            en.exp = this.exp;
            en.level = this.level;
            en.money = this.money;
            en.mobname = this.mobname;
            en.movespeed = 0.3F;
            en.xx = this.field_145851_c;
            en.yy = this.field_145848_d;
            en.zz = this.field_145849_e;
            en.atk = 0;
            ++this.count;
            if (this.count >= 10) {
               this.sp = false;
            }

            if (this.inventory[3] != null) {
               if (this.inventory[3].func_77942_o()) {
                  if (this.inventory[3].field_77990_d.func_74764_b("percent")) {
                     en.item1 = Item.func_150891_b(this.inventory[3].func_77973_b()) + "," + this.inventory[3].field_77994_a + "," + this.inventory[3].field_77990_d.func_74762_e("percent");
                  } else {
                     en.item1 = Item.func_150891_b(this.inventory[3].func_77973_b()) + "," + this.inventory[3].field_77994_a + ",100";
                  }
               } else {
                  en.item1 = Item.func_150891_b(this.inventory[3].func_77973_b()) + "," + this.inventory[3].field_77994_a + ",100";
               }
            }

            if (this.inventory[4] != null) {
               if (this.inventory[4].func_77942_o()) {
                  if (this.inventory[4].field_77990_d.func_74764_b("percent")) {
                     en.item2 = Item.func_150891_b(this.inventory[4].func_77973_b()) + "," + this.inventory[4].field_77994_a + "," + this.inventory[4].field_77990_d.func_74762_e("percent");
                  } else {
                     en.item2 = Item.func_150891_b(this.inventory[4].func_77973_b()) + "," + this.inventory[4].field_77994_a + ",100";
                  }
               } else {
                  en.item2 = Item.func_150891_b(this.inventory[4].func_77973_b()) + "," + this.inventory[4].field_77994_a + ",100";
               }
            }

            if (this.inventory[5] != null) {
               if (this.inventory[5].func_77942_o()) {
                  if (this.inventory[5].field_77990_d.func_74764_b("percent")) {
                     en.item3 = Item.func_150891_b(this.inventory[5].func_77973_b()) + "," + this.inventory[5].field_77994_a + "," + this.inventory[5].field_77990_d.func_74762_e("percent");
                  } else {
                     en.item3 = Item.func_150891_b(this.inventory[5].func_77973_b()) + "," + this.inventory[5].field_77994_a + ",100";
                  }
               } else {
                  en.item3 = Item.func_150891_b(this.inventory[5].func_77973_b()) + "," + this.inventory[5].field_77994_a + ",100";
               }
            }

            if (this.inventory[6] != null) {
               if (this.inventory[6].func_77942_o()) {
                  if (this.inventory[6].field_77990_d.func_74764_b("percent")) {
                     en.item4 = Item.func_150891_b(this.inventory[6].func_77973_b()) + "," + this.inventory[6].field_77994_a + "," + this.inventory[6].field_77990_d.func_74762_e("percent");
                  } else {
                     en.item4 = Item.func_150891_b(this.inventory[6].func_77973_b()) + "," + this.inventory[6].field_77994_a + ",100";
                  }
               } else {
                  en.item4 = Item.func_150891_b(this.inventory[6].func_77973_b()) + "," + this.inventory[6].field_77994_a + ",100";
               }
            }

            if (this.inventory[7] != null) {
               if (this.inventory[7].func_77942_o()) {
                  if (this.inventory[7].field_77990_d.func_74764_b("percent")) {
                     en.item5 = Item.func_150891_b(this.inventory[7].func_77973_b()) + "," + this.inventory[7].field_77994_a + "," + this.inventory[7].field_77990_d.func_74762_e("percent");
                  } else {
                     en.item5 = Item.func_150891_b(this.inventory[7].func_77973_b()) + "," + this.inventory[7].field_77994_a + ",100";
                  }
               } else {
                  en.item5 = Item.func_150891_b(this.inventory[7].func_77973_b()) + "," + this.inventory[7].field_77994_a + ",100";
               }
            }

            if (this.inventory[8] != null) {
               if (this.inventory[8].func_77942_o()) {
                  if (this.inventory[8].field_77990_d.func_74764_b("percent")) {
                     en.item6 = Item.func_150891_b(this.inventory[8].func_77973_b()) + "," + this.inventory[8].field_77994_a + "," + this.inventory[8].field_77990_d.func_74762_e("percent");
                  } else {
                     en.item6 = Item.func_150891_b(this.inventory[8].func_77973_b()) + "," + this.inventory[8].field_77994_a + ",100";
                  }
               } else {
                  en.item6 = Item.func_150891_b(this.inventory[8].func_77973_b()) + "," + this.inventory[8].field_77994_a + ",100";
               }
            }

            if (this.inventory[9] != null) {
               if (this.inventory[9].func_77942_o()) {
                  if (this.inventory[9].field_77990_d.func_74764_b("percent")) {
                     en.item7 = Item.func_150891_b(this.inventory[9].func_77973_b()) + "," + this.inventory[9].field_77994_a + "," + this.inventory[9].field_77990_d.func_74762_e("percent");
                  } else {
                     en.item7 = Item.func_150891_b(this.inventory[9].func_77973_b()) + "," + this.inventory[9].field_77994_a + ",100";
                  }
               } else {
                  en.item7 = Item.func_150891_b(this.inventory[9].func_77973_b()) + "," + this.inventory[9].field_77994_a + ",100";
               }
            }

            if (this.inventory[10] != null) {
               if (this.inventory[10].func_77942_o()) {
                  if (this.inventory[10].field_77990_d.func_74764_b("percent")) {
                     en.item8 = Item.func_150891_b(this.inventory[10].func_77973_b()) + "," + this.inventory[10].field_77994_a + "," + this.inventory[10].field_77990_d.func_74762_e("percent");
                  } else {
                     en.item8 = Item.func_150891_b(this.inventory[10].func_77973_b()) + "," + this.inventory[10].field_77994_a + ",100";
                  }
               } else {
                  en.item8 = Item.func_150891_b(this.inventory[10].func_77973_b()) + "," + this.inventory[10].field_77994_a + ",100";
               }
            }

            if (this.inventory[11] != null) {
               if (this.inventory[11].func_77942_o()) {
                  if (this.inventory[11].field_77990_d.func_74764_b("percent")) {
                     en.item9 = Item.func_150891_b(this.inventory[11].func_77973_b()) + "," + this.inventory[11].field_77994_a + "," + this.inventory[11].field_77990_d.func_74762_e("percent");
                  } else {
                     en.item9 = Item.func_150891_b(this.inventory[11].func_77973_b()) + "," + this.inventory[11].field_77994_a + ",100";
                  }
               } else {
                  en.item9 = Item.func_150891_b(this.inventory[11].func_77973_b()) + "," + this.inventory[11].field_77994_a + ",100";
               }
            }

            en.func_70691_i(en.func_110138_aP());
            world.func_72838_d(en);
            en.func_70691_i(en.func_110138_aP());
         }
      }

   }

   public boolean canUpdate() {
      return true;
   }
}
