package farmmode;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBugTame extends Item {
   public ItemBugTame(String unlocalizedName) {
      this.func_77637_a(ModStart.EntityTab);
      this.func_77625_d(1);
      this.func_77655_b(unlocalizedName);
      this.func_111206_d("fantasyland:" + unlocalizedName);
      this.func_77664_n();
      this.func_77656_e(10);
   }

   public ItemStack func_77659_a(ItemStack stack, World world, EntityPlayer p) {
      p.func_71038_i();
      return stack;
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack st, EntityPlayer pl, List lt, boolean bl) {
      lt.add("§7เอาไว้จับแมลง หรือช้อนปลา");
      lt.add("§7คลิกขวาเพื่อจับ");
   }
}
