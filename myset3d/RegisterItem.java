package myset3d;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class RegisterItem {
   public static final ArmorMaterial DataMaterialHelmet = EnumHelper.addArmorMaterial("HELMET", 33, new int[]{3, 8, 6, 3}, 12);
   public static final ArmorMaterial DataMaterialChest = EnumHelper.addArmorMaterial("CHEST", 33, new int[]{3, 8, 6, 3}, 12);
   public static final ArmorMaterial DataMaterialLeg = EnumHelper.addArmorMaterial("LEG", 33, new int[]{3, 8, 6, 3}, 12);
   public static final ArmorMaterial DataMaterialBoot = EnumHelper.addArmorMaterial("BOOT", 33, new int[]{3, 8, 6, 3}, 12);

   public static void reg() {
   }
}
