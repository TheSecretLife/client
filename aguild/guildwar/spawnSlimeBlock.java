package aguild.guildwar;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class spawnSlimeBlock extends BlockContainer {
   public spawnSlimeBlock() {
      super(Material.field_151571_B);
      this.func_149676_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.func_149658_d("aguild:spawner");
      this.func_149711_c(-1.0F);
      this.func_149647_a(CreativeTabs.field_78037_j);
   }

   public TileEntity func_149915_a(World world, int par1) {
      return new spawnSlimeTE();
   }
}
