package farmmode;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class CreativeTab_Plant extends CreativeTabs {
   public CreativeTab_Plant(int par1, String par2Str) {
      super(par1, par2Str);
   }

   public String func_78024_c() {
      return "ไอเทมพืช";
   }

   @SideOnly(Side.CLIENT)
   public Item func_78016_d() {
      return ReqFarmItem.Water;
   }
}
