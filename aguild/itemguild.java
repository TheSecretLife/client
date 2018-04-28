package aguild;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class itemguild extends Item {
   public itemguild(String unlocalizedName) {
      this.func_77637_a(CreativeTabs.field_78037_j);
      this.func_77625_d(1);
      this.func_77655_b(unlocalizedName);
      this.func_111206_d("aguild:" + unlocalizedName);
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack st, EntityPlayer pl, List lt, boolean bl) {
      lt.add("§fใช้ในการสร้างกิล");
   }
}
