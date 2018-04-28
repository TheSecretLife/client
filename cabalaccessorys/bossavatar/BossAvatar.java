package cabalaccessorys.bossavatar;

import cabalaccessorys.RegisterItem;
import cabalaccessorys.Start;
import cabalaccessorys.client.GuestSide;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class BossAvatar extends ItemArmor {
   public static ArmorMaterial Armor = EnumHelper.addArmorMaterial("Armor", 2000, new int[]{0, 0, 0, 0}, 30);

   public BossAvatar(String unlocalizedName, String textureName, int type) {
      super(Armor, 0, type);
      this.func_77655_b(unlocalizedName);
      this.func_77637_a(Start.ItemList);
   }

   @SideOnly(Side.CLIENT)
   public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
      return "cabalaccessorys:textures/monster/mon07.png";
   }

   @SideOnly(Side.CLIENT)
   public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
      ModelBiped armorModel = null;
      if (itemStack.func_77973_b() == RegisterItem.BossAvatar1) {
         armorModel = GuestSide.avatar1;
      }

      if (armorModel != null) {
         armorModel.field_78116_c.field_78807_k = armorSlot == 1;
         armorModel.field_78114_d.field_78807_k = armorSlot == 1;
         armorModel.field_78115_e.field_78807_k = armorSlot == 1;
         armorModel.field_78112_f.field_78807_k = armorSlot == 1;
         armorModel.field_78113_g.field_78807_k = armorSlot == 1;
         armorModel.field_78123_h.field_78807_k = armorSlot == 1;
         armorModel.field_78124_i.field_78807_k = armorSlot == 1;
         armorModel.field_78117_n = entityLiving.func_70093_af();
         armorModel.field_78093_q = entityLiving.func_70115_ae();
         armorModel.field_78091_s = entityLiving.func_70631_g_();
         return armorModel;
      } else {
         return null;
      }
   }
}
