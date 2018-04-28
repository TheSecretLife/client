package cabalaccessorys.blockshop.npc;

import cabalaccessorys.Start;
import cabalaccessorys.blockbuy.npc.BlockBuyInventoryNPC;
import cabalaccessorys.data.PlayerData;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class npcentity extends EntityTameable {
   public final BlockBuyInventoryNPC BS = new BlockBuyInventoryNPC();
   public final BlockShopInventoryNPC SW = new BlockShopInventoryNPC();
   World world = null;
   public int price1 = 0;
   public int price2 = 0;
   public int price3 = 0;
   public int price4 = 0;
   public int price5 = 0;
   public int price6 = 0;
   public int money = 0;
   public boolean opensell = false;
   public String ownername = "";

   public npcentity(World x) {
      super(x);
      this.func_70105_a(2.0F, 2.0F);
      this.func_70903_f(false);
      this.func_94061_f(true);
   }

   public boolean func_70650_aV() {
      return true;
   }

   public void func_70903_f(boolean b) {
      super.func_70903_f(b);
   }

   protected void func_110147_ax() {
      super.func_110147_ax();
      this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.01D);
      this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(10000.0D);
   }

   public String getOwnerName() {
      return this.field_70180_af.func_75681_e(17);
   }

   public void setOwner(String zs) {
      this.field_70180_af.func_75692_b(17, zs);
   }

   public npcentity spawnBabyAnimal(EntityAgeable cs) {
      return new npcentity(this.field_70170_p);
   }

   public EntityAgeable func_90011_a(EntityAgeable bb) {
      return this.spawnBabyAnimal(bb);
   }

   public void func_70014_b(NBTTagCompound xw) {
      super.func_70014_b(xw);
      this.SW.writeToNBT(xw);
      this.BS.writeToNBT(xw);
      xw.func_74768_a("price1", this.price1);
      xw.func_74768_a("price2", this.price2);
      xw.func_74768_a("price3", this.price3);
      xw.func_74768_a("price4", this.price4);
      xw.func_74768_a("price5", this.price5);
      xw.func_74768_a("price6", this.price6);
      xw.func_74768_a("money", this.money);
      xw.func_74757_a("opensell", this.opensell);
      xw.func_74778_a("ownername", this.ownername);
   }

   public void func_70037_a(NBTTagCompound as) {
      super.func_70037_a(as);
      this.SW.readFromNBT(as);
      this.BS.readFromNBT(as);
      this.price1 = as.func_74762_e("price1");
      this.price2 = as.func_74762_e("price2");
      this.price3 = as.func_74762_e("price3");
      this.price4 = as.func_74762_e("price4");
      this.price5 = as.func_74762_e("price5");
      this.price6 = as.func_74762_e("price6");
      this.money = as.func_74762_e("money");
      this.opensell = as.func_74767_n("opensell");
      this.ownername = as.func_74779_i("ownername");
   }

   public boolean func_70085_c(EntityPlayer player) {
      ItemStack itemstack = player.field_71071_by.func_70448_g();
      PlayerData px = PlayerData.get(player);
      px.TeSop = this;
      if (!player.field_70170_p.field_72995_K && itemstack == null) {
         if (px.op && player.func_70093_af()) {
            this.func_70106_y();
         }

         px.TeSop = this;
         px.npcmoney = this.money;
         if (this.func_70909_n() && player.func_110124_au().toString().equalsIgnoreCase(this.getOwnerName())) {
            px.blockprice1 = this.price1;
            px.blockprice2 = this.price2;
            px.blockprice3 = this.price3;
            px.blockprice4 = this.price4;
            px.blockprice5 = this.price5;
            px.blockprice6 = this.price6;
            px.blockMoney = this.money;
            px.playerblockshop = this.opensell;
            player.openGui(Start.instance, Start.BsGOP, player.func_130014_f_(), (int)player.field_70165_t, (int)player.field_70163_u, (int)player.field_70161_v);
         } else if (this.opensell) {
            px.blockprice1 = this.price1;
            px.blockprice2 = this.price2;
            px.blockprice3 = this.price3;
            px.blockprice4 = this.price4;
            px.blockprice5 = this.price5;
            px.blockprice6 = this.price6;
            px.blockMoney = this.money;
            px.playerblockshop = this.opensell;
            ItemStack sell1 = this.SW.func_70301_a(0);
            ItemStack sell2 = this.SW.func_70301_a(1);
            ItemStack sell3 = this.SW.func_70301_a(2);
            ItemStack sell4 = this.SW.func_70301_a(3);
            ItemStack sell5 = this.SW.func_70301_a(4);
            ItemStack sell6 = this.SW.func_70301_a(5);
            if (sell1 != null) {
               this.BS.func_70299_a(0, sell1);
            } else {
               this.BS.func_70299_a(0, (ItemStack)null);
            }

            if (sell2 != null) {
               this.BS.func_70299_a(1, sell2);
            } else {
               this.BS.func_70299_a(1, (ItemStack)null);
            }

            if (sell3 != null) {
               this.BS.func_70299_a(2, sell3);
            } else {
               this.BS.func_70299_a(2, (ItemStack)null);
            }

            if (sell4 != null) {
               this.BS.func_70299_a(3, sell4);
            } else {
               this.BS.func_70299_a(3, (ItemStack)null);
            }

            if (sell5 != null) {
               this.BS.func_70299_a(4, sell5);
            } else {
               this.BS.func_70299_a(4, (ItemStack)null);
            }

            if (sell6 != null) {
               this.BS.func_70299_a(5, sell6);
            } else {
               this.BS.func_70299_a(5, (ItemStack)null);
            }

            player.openGui(Start.instance, Start.BBSGUIOP, player.func_130014_f_(), (int)player.field_70165_t, (int)player.field_70163_u, (int)player.field_70161_v);
         } else {
            player.func_145747_a(new ChatComponentText("§cNPC ยังไม่ได้เปิดร้านค้า"));
         }
      }

      return false;
   }

   public void func_70636_d() {
   }

   public boolean func_70097_a(DamageSource par1DamageSource, float par2) {
      return false;
   }
}
