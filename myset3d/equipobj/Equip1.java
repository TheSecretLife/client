package myset3d.equipobj;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import myset3d.Clientproxy;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class Equip1 extends ItemArmor {
   public Equip1(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_, String name, String displayname) {
      super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
      this.func_77655_b(name);
      this.func_111206_d("myset3d:" + name);
      GameRegistry.registerItem(this, name);
      LanguageRegistry.addName(this, displayname);
   }

   @SideOnly(Side.CLIENT)
   public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
      ModelBiped armorModel = (ModelBiped)Clientproxy.Models.get(itemStack.func_77973_b());
      if (armorModel != null) {
         armorModel.field_78116_c.field_78806_j = armorSlot == 1;
         armorModel.field_78114_d.field_78806_j = armorSlot == 1;
         armorModel.field_78115_e.field_78806_j = armorSlot == 1;
         armorModel.field_78112_f.field_78806_j = armorSlot == 1;
         armorModel.field_78113_g.field_78806_j = armorSlot == 1;
         armorModel.field_78123_h.field_78806_j = armorSlot == 1;
         armorModel.field_78124_i.field_78806_j = armorSlot == 1;
         armorModel.field_78118_o = false;
         armorModel.field_78117_n = entityLiving.func_70093_af();
         armorModel.field_78093_q = entityLiving.func_70115_ae();
         armorModel.field_78091_s = entityLiving.func_70631_g_();
         ItemStack itemstack1 = ((EntityPlayer)entityLiving).field_71071_by.func_70448_g();
         EntityPlayer player = (EntityPlayer)entityLiving;
         armorModel.field_78120_m = itemstack1 != null ? 1 : 0;
         if (itemstack1 != null) {
            armorModel.field_78120_m = 1;
            if (player.func_71052_bv() > 0) {
               EnumAction enumAction = itemstack1.func_77975_n();
               if (enumAction == EnumAction.bow) {
                  armorModel.field_78118_o = true;
               }

               if (enumAction == EnumAction.block) {
                  armorModel.field_78120_m = 3;
               }
            }
         }
      }

      return armorModel;
   }
}
