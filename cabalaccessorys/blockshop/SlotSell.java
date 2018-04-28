package cabalaccessorys.blockshop;

import cabalaccessorys.data.PlayerData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;

public class SlotSell extends Slot {
   public int field_75225_a;
   public EntityPlayer player;

   SlotSell(BlockShopInventory par2IInventory, int par3, int par4, int par5, EntityPlayer player) {
      super(par2IInventory, par3, par4, par5);
      this.player = player;
      this.field_75225_a = par3;
   }

   public boolean func_82869_a(EntityPlayer par1EntityPlayer) {
      this.player = par1EntityPlayer;
      PlayerData px = PlayerData.get(par1EntityPlayer);
      if (!px.playerblockshop) {
         return super.func_82869_a(par1EntityPlayer);
      } else {
         if (!par1EntityPlayer.field_70170_p.field_72995_K) {
            par1EntityPlayer.func_145747_a(new ChatComponentText("§cกรุณาปิดร้านค้าก่อนแก้ไขไอเทม"));
         }

         return false;
      }
   }

   public boolean func_75214_a(ItemStack par1ItemStack) {
      if (par1ItemStack == null) {
         return true;
      } else {
         return par1ItemStack.func_77973_b() instanceof Item;
      }
   }

   public int func_75219_a() {
      return 64;
   }

   public ItemStack func_75209_a(int p_75209_1_) {
      return this.field_75224_c.func_70298_a(this.field_75225_a, p_75209_1_);
   }

   public void func_75215_d(ItemStack par1ItemStack) {
      if (this.field_75224_c != null) {
         this.field_75224_c.func_70299_a(this.field_75225_a, par1ItemStack);
      }

      this.func_75218_e();
   }

   public void func_75218_e() {
      this.field_75224_c.func_70296_d();
      PlayerData px = PlayerData.get(this.player);
      ItemStack sell1 = px.TeS.SW.func_70301_a(0);
      ItemStack sell2 = px.TeS.SW.func_70301_a(1);
      ItemStack sell3 = px.TeS.SW.func_70301_a(2);
      ItemStack sell4 = px.TeS.SW.func_70301_a(3);
      ItemStack sell5 = px.TeS.SW.func_70301_a(4);
      ItemStack sell6 = px.TeS.SW.func_70301_a(5);
      if (sell1 == null) {
         px.TeS.price1 = 0;
         px.blockprice1 = 0;
      }

      if (sell2 == null) {
         px.TeS.price2 = 0;
         px.blockprice2 = 0;
      }

      if (sell3 == null) {
         px.TeS.price3 = 0;
         px.blockprice3 = 0;
      }

      if (sell4 == null) {
         px.TeS.price4 = 0;
         px.blockprice4 = 0;
      }

      if (sell5 == null) {
         px.TeS.price5 = 0;
         px.blockprice5 = 0;
      }

      if (sell6 == null) {
         px.TeS.price6 = 0;
         px.blockprice6 = 0;
      }

   }
}
