package farmmode;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemBeetle extends Item {
   public ItemBeetle(String unlocalizedName) {
      this.func_77637_a(ModStart.EntityTab);
      this.func_77625_d(1);
      this.func_77655_b(unlocalizedName);
      this.func_111206_d("fantasyland:" + unlocalizedName);
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack st, EntityPlayer pl, List lt, boolean bl) {
      lt.add("§7คลิกชวาปล่อยด้วง");
      NBTTagCompound nbt = st.func_77978_p();
      if (nbt == null) {
         nbt = new NBTTagCompound();
      }

      if (nbt.func_74762_e("type") == 0) {
         lt.add("§7ด้วงสี §eปกติ");
      } else if (nbt.func_74762_e("type") == 1) {
         lt.add("§7ด้วงสี §dชมพู");
      } else if (nbt.func_74762_e("type") == 2) {
         lt.add("§7ด้วงสี §cแดง");
      } else if (nbt.func_74762_e("type") == 3) {
         lt.add("§7ด้วงสี §bฟ้า");
      } else if (nbt.func_74762_e("type") == 4) {
         lt.add("§7ด้วงสี §fขาว");
      }

   }

   public ItemStack func_77659_a(ItemStack stack, World world, EntityPlayer p) {
      --stack.field_77994_a;
      if (!world.field_72995_K) {
         NBTTagCompound nbt = stack.func_77978_p();
         if (nbt == null) {
            nbt = new NBTTagCompound();
         }

         beetle1entity e;
         if (stack.func_77973_b() == ReqBeetleItem.bt01) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 1;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt02) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 2;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt03) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 3;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt04) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 4;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt05) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 5;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt06) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 6;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt07) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 7;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt08) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 8;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt09) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 9;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt10) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 10;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt11) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 11;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt12) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 12;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt13) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 13;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt14) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 14;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt15) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 15;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt16) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 16;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         } else if (stack.func_77973_b() == ReqBeetleItem.bt17) {
            e = new beetle1entity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            e.type = 17;
            e.ownername = p.getDisplayName();
            e.beetletype = nbt.func_74762_e("type");
         }
      }

      return stack;
   }
}
