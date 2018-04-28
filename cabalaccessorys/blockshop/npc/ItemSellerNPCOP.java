package cabalaccessorys.blockshop.npc;

import cabalaccessorys.RegisterItem;
import cabalaccessorys.Start;
import cabalaccessorys.data.PlayerData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSellerNPCOP extends Item {
   public ItemSellerNPCOP(String unlocalizedName) {
      this.func_77637_a(Start.ItemList);
      this.func_77625_d(1);
      this.func_77655_b(unlocalizedName);
      this.func_111206_d("cabalaccessorys:" + unlocalizedName);
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack st, EntityPlayer pl, List lt, boolean bl) {
      lt.add("§fใช้เรียก NPC ขายของสำหรับ OP");
   }

   public ItemStack func_77659_a(ItemStack stack, World world, EntityPlayer p) {
      PlayerData px = PlayerData.get(p);
      if (!p.field_70170_p.field_72995_K) {
         --stack.field_77994_a;
         if (stack.func_77973_b() == RegisterItem.SellerNPCOP1) {
            npcentity e = new npcentity(p.func_130014_f_());
            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            p.func_130014_f_().func_72838_d(e);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
         }
      }

      return stack;
   }
}
