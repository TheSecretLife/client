package srcpet;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import srcpet.entity.entitypet;

public class data implements IExtendedEntityProperties {
   public static final String Name = "pxstdatas";
   private final EntityPlayer player;
   public boolean open = false;
   public int deleyms = 0;
   public int cooldown = 0;
   public final cinv PlayerInv_I = new cinv();
   public entitypet Pet = null;
   public entitycar Car = null;
   public String wingid = "empty";

   public data(EntityPlayer player) {
      this.player = player;
   }

   public static final void register(EntityPlayer player) {
      player.registerExtendedProperties("pxstdatas", new data(player));
   }

   public static final data get(EntityPlayer player) {
      return (data)player.getExtendedProperties("pxstdatas");
   }

   public final void saveNBTData(NBTTagCompound compound) {
      NBTTagCompound properties = new NBTTagCompound();
      this.PlayerInv_I.writeToNBT(properties);
      properties.func_74757_a("open", this.open);
      properties.func_74778_a("wingid", this.wingid);
      compound.func_74782_a("pxstdatas", properties);
   }

   public final void loadNBTData(NBTTagCompound compound) {
      NBTTagCompound properties = (NBTTagCompound)compound.func_74781_a("pxstdatas");
      this.PlayerInv_I.readFromNBT(properties);
      this.open = properties.func_74767_n("open");
      this.wingid = properties.func_74779_i("wingid");
   }

   public void init(Entity entity, World world) {
   }

   private static final String getSaveKey(EntityPlayer player) {
      return player.func_70005_c_() + ":" + "pxstdatas";
   }

   public static final void saveProxyData(EntityPlayer player) {
      NBTTagCompound savedData = new NBTTagCompound();
      get(player).saveNBTData(savedData);
      server.storeEntityData(getSaveKey(player), savedData);
   }

   public static final void loadProxyData(EntityPlayer player) {
      data playerData = get(player);
      NBTTagCompound savedData = server.getEntityData(getSaveKey(player));
      if (savedData != null) {
         playerData.loadNBTData(savedData);
      }

      mainclass.networkChannel.sendTo(new packetdata(player), (EntityPlayerMP)player);
   }

   public void petcall(EntityPlayer p) {
      data px = get(p);
      ItemStack sl = px.PlayerInv_I.func_70301_a(0);
      if (!p.field_70170_p.field_72995_K) {
         if (px.Pet != null) {
            px.Pet.func_70106_y();
         }

         if (sl != null) {
            entitypet e = new entitypet(p.func_130014_f_());
            if (sl.func_77973_b() == mainclass.pet1) {
               e.type = 1;
            } else if (sl.func_77973_b() == mainclass.pet2) {
               e.type = 2;
            } else if (sl.func_77973_b() == mainclass.pet3) {
               e.type = 3;
            } else if (sl.func_77973_b() == mainclass.pet4) {
               e.type = 4;
            } else if (sl.func_77973_b() == mainclass.pet5) {
               e.type = 5;
            } else if (sl.func_77973_b() == mainclass.pet6) {
               e.type = 6;
            } else if (sl.func_77973_b() == mainclass.pet7) {
               e.type = 7;
            } else if (sl.func_77973_b() == mainclass.pet8) {
               e.type = 8;
            } else if (sl.func_77973_b() == mainclass.pet9) {
               e.type = 9;
            } else if (sl.func_77973_b() == mainclass.pet10) {
               e.type = 10;
            } else if (sl.func_77973_b() == mainclass.pet11) {
               e.type = 11;
            } else if (sl.func_77973_b() == mainclass.pet12) {
               e.type = 12;
            } else if (sl.func_77973_b() == mainclass.pet13) {
               e.type = 13;
            } else if (sl.func_77973_b() == mainclass.pet14) {
               e.type = 14;
            } else if (sl.func_77973_b() == mainclass.pet15) {
               e.type = 15;
            } else if (sl.func_77973_b() == mainclass.pet16) {
               e.type = 16;
            } else if (sl.func_77973_b() == mainclass.pet17) {
               e.type = 17;
            } else if (sl.func_77973_b() == mainclass.pet18) {
               e.type = 18;
            } else if (sl.func_77973_b() == mainclass.pet19) {
               e.type = 19;
            } else if (sl.func_77973_b() == mainclass.pet20) {
               e.type = 20;
            } else if (sl.func_77973_b() == mainclass.pet21) {
               e.type = 21;
            } else if (sl.func_77973_b() == mainclass.pet22) {
               e.type = 22;
            } else if (sl.func_77973_b() == mainclass.pet23) {
               e.type = 23;
            } else if (sl.func_77973_b() == mainclass.pet24) {
               e.type = 24;
            }

            e.func_70107_b(p.field_70165_t, p.field_70163_u, p.field_70161_v);
            e.func_70903_f(true);
            e.setOwner(p.func_110124_au().toString());
            p.func_130014_f_().func_72838_d(e);
            px.Pet = e;
            e.func_70096_w().func_75692_b(31, e.type);
         } else if (px.Pet != null) {
            px.Pet.func_70106_y();
         }
      }

   }
}
