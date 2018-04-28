package farmmode;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemFish extends Item {
   public ItemFish(String unlocalizedName) {
      this.func_77637_a(ModStart.EntityTab);
      this.func_77625_d(64);
      this.func_77655_b(unlocalizedName);
      this.func_111206_d("fantasyland:" + unlocalizedName);
   }

   public ItemStack func_77659_a(ItemStack stack, World world, EntityPlayer p) {
      NBTTagCompound nbt = stack.func_77978_p();
      if (nbt == null) {
         new NBTTagCompound();
      }

      if (!world.field_72995_K) {
         fish1entity e;
         if (stack.func_77973_b() == ReqFishItem.Fish01) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 0;
            e.type = 0;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish02) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 0;
            e.type = 1;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish03) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 0;
            e.type = 2;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish04) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 0;
            e.type = 3;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish05) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 0;
            e.type = 4;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish00) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 0;
            e.type = 5;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish06) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 1;
            e.type = 0;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish07) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 1;
            e.type = 1;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish08) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 1;
            e.type = 2;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish09) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 1;
            e.type = 3;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish10) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 1;
            e.type = 4;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish11) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 1;
            e.type = 5;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish12) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 2;
            e.type = 0;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish13) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 2;
            e.type = 1;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish14) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 2;
            e.type = 2;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish15) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 2;
            e.type = 3;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish16) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 2;
            e.type = 4;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish17) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 2;
            e.type = 5;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish18) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 3;
            e.type = 0;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish19) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 3;
            e.type = 1;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish20) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 3;
            e.type = 2;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish21) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 3;
            e.type = 3;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish22) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 3;
            e.type = 4;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish23) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 3;
            e.type = 5;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish24) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 4;
            e.type = 0;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish25) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 4;
            e.type = 1;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish26) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 4;
            e.type = 2;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish27) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 4;
            e.type = 3;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish28) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 4;
            e.type = 4;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish29) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 4;
            e.type = 5;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish30) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 5;
            e.type = 0;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish31) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 5;
            e.type = 1;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish32) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 5;
            e.type = 2;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish33) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 5;
            e.type = 3;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish34) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 5;
            e.type = 4;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish35) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 5;
            e.type = 5;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish36) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 6;
            e.type = 0;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish37) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 6;
            e.type = 1;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish38) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 6;
            e.type = 2;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish39) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 6;
            e.type = 3;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish40) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 6;
            e.type = 4;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         } else if (stack.func_77973_b() == ReqFishItem.Fish41) {
            e = new fish1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.tamed = true;
            e.fishtype = 6;
            e.type = 5;
            e.OwnerName = p.func_110124_au().toString();
            p.func_130014_f_().func_72838_d(e);
            e.func_70096_w().func_75692_b(30, e.type);
            e.func_70096_w().func_75692_b(31, e.fishtype);
            --stack.field_77994_a;
         }
      }

      return stack;
   }
}
