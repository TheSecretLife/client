package farmmode;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public final class CreativeTab_Block extends CreativeTabs {
   public CreativeTab_Block(int par1, String par2Str) {
      super(par1, par2Str);
   }

   public String func_78024_c() {
      return "บล๊อกต่างๆ";
   }

   @SideOnly(Side.CLIENT)
   public Item func_78016_d() {
      return Items.field_151166_bC;
   }
}
