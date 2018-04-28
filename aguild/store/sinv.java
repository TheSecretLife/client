package aguild.store;

import aguild.playerdata;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class sinv implements IInventory {
   private final String tagName = "sg";
   public static final int INV_SIZE = 27;
   ItemStack[] inventory = new ItemStack[27];
   public String guild = "";
   public int page = 0;
   public EntityPlayer player;

   public sinv(int pages) {
   }

   public int func_70302_i_() {
      return this.inventory.length;
   }

   public ItemStack func_70301_a(int slot) {
      return this.inventory[slot];
   }

   public ItemStack func_70298_a(int slot, int amount) {
      ItemStack stack = this.func_70301_a(slot);
      if (stack != null) {
         if (stack.field_77994_a > amount) {
            stack = stack.func_77979_a(amount);
            this.func_70296_d();
         } else {
            this.func_70299_a(slot, (ItemStack)null);
         }
      }

      return stack;
   }

   public ItemStack func_70304_b(int slot) {
      ItemStack stack = this.func_70301_a(slot);
      this.func_70299_a(slot, (ItemStack)null);
      return stack;
   }

   public void func_70299_a(int slot, ItemStack stack) {
      this.inventory[slot] = stack;
      if (stack != null && stack.field_77994_a > this.func_70297_j_()) {
         stack.field_77994_a = this.func_70297_j_();
      }

      this.func_70296_d();
   }

   public String func_145825_b() {
      return "guild " + this.guild + " / page " + this.page;
   }

   public boolean func_145818_k_() {
      return true;
   }

   public int func_70297_j_() {
      return 64;
   }

   public void func_70296_d() {
      for(int i = 0; i < this.func_70302_i_(); ++i) {
         if (this.func_70301_a(i) != null && this.func_70301_a(i).field_77994_a == 0) {
            this.inventory[i] = null;
         }
      }

   }

   public boolean func_70300_a(EntityPlayer player) {
      playerdata px = playerdata.get(player);
      this.player = player;
      return true;
   }

   public void func_70295_k_() {
   }

   public void func_70305_f() {
   }

   public boolean func_94041_b(int slot, ItemStack stack) {
      return stack.func_77973_b() instanceof ItemArmor;
   }

   public void writeToNBT(NBTTagCompound compound) {
      NBTTagList items = new NBTTagList();

      for(int i = 0; i < this.func_70302_i_(); ++i) {
         if (this.func_70301_a(i) != null) {
            NBTTagCompound item = new NBTTagCompound();
            item.func_74774_a("sg" + this.guild + this.page, (byte)i);
            this.func_70301_a(i).func_77955_b(item);
            items.func_74742_a(item);
         }
      }

      compound.func_74782_a("sg" + this.guild + this.page, items);
   }

   public void readFromNBT(NBTTagCompound compound) {
      NBTTagList items = compound.func_150295_c("sg" + this.guild + this.page, compound.func_74732_a());

      for(int i = 0; i < items.func_74745_c(); ++i) {
         NBTTagCompound item = items.func_150305_b(i);
         byte slot = item.func_74771_c("sg" + this.guild + this.page);
         if (slot >= 0 && slot < this.func_70302_i_()) {
            this.func_70299_a(slot, ItemStack.func_77949_a(item));
         }
      }

   }
}
