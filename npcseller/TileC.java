package npcseller;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
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

public class TileC extends TileEntity implements IInventory {
   private ItemStack[] inventory = new ItemStack[this.func_70302_i_()];
   private String customName = "none";
   private String namenpc = "none";

   public String getNamenpc() {
      return this.namenpc;
   }

   public void func_145845_h() {
      super.func_145845_h();
   }

   public void func_70296_d() {
      super.func_70296_d();
   }

   public Packet func_145844_m() {
      NBTTagCompound tag = new NBTTagCompound();
      this.func_145841_b(tag);
      return new S35PacketUpdateTileEntity(this.field_145851_c, this.field_145848_d, this.field_145849_e, this.field_145847_g, tag);
   }

   public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
      this.func_145839_a(pkt.func_148857_g());
   }

   public void setNamenpc(String namenpc) {
      this.namenpc = namenpc;
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

   public void func_145841_b(NBTTagCompound nbt) {
      super.func_145841_b(nbt);
      NBTTagList list = new NBTTagList();

      for(int i = 0; i < this.func_70302_i_(); ++i) {
         if (this.func_70301_a(i) != null) {
            NBTTagCompound stackTag = new NBTTagCompound();
            stackTag.func_74774_a("SlotCasino", (byte)i);
            this.func_70301_a(i).func_77955_b(stackTag);
            list.func_74742_a(stackTag);
         }
      }

      nbt.func_74782_a("ItemsCasino", list);
      nbt.func_74778_a("CustomName", this.getCustomName());
      nbt.func_74778_a("namenpc", this.getNamenpc());
   }

   public void func_145839_a(NBTTagCompound nbt) {
      super.func_145839_a(nbt);
      NBTTagList list = nbt.func_150295_c("ItemsCasino", 10);

      for(int i = 0; i < list.func_74745_c(); ++i) {
         NBTTagCompound stackTag = list.func_150305_b(i);
         int slot = stackTag.func_74771_c("SlotCasino") & 255;
         this.func_70299_a(slot, ItemStack.func_77949_a(stackTag));
      }

      this.setCustomName(nbt.func_74779_i("CustomName"));
      this.setNamenpc(nbt.func_74779_i("namenpc"));
   }
}
