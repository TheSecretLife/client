package aguild;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class playerdata implements IExtendedEntityProperties {
   private static final String name = "guilddt";
   private final EntityPlayer player;
   public int cdinvite = 0;
   public boolean host = false;
   public boolean inguild = false;
   public String guildname = "";
   public String ghost = "";
   public String mem01 = "";
   public String mem02 = "";
   public String mem03 = "";
   public String mem04 = "";
   public String mem05 = "";
   public String mem06 = "";
   public String mem07 = "";
   public String mem08 = "";
   public String mem09 = "";
   public String mem10 = "";
   public String mem11 = "";
   public String mem12 = "";
   public String mem13 = "";
   public String mem14 = "";
   public String mem15 = "";
   public String mem16 = "";
   public String mem17 = "";
   public String mem18 = "";
   public String mem19 = "";
   public String mem20 = "";
   public String mem21 = "";
   public String mem22 = "";
   public String mem23 = "";
   public String mem24 = "";
   public String mem25 = "";
   public String mem26 = "";
   public String mem27 = "";
   public String mem28 = "";
   public String mem29 = "";
   public EntityPlayer inviter = null;
   public EntityPlayer joiner = null;
   public int page = 0;
   public int guildlv = 0;
   public int guildexp = 0;
   public boolean winwar = false;
   public boolean openbuff = false;
   public String enemy = "";
   public int cdwar = 0;
   public int slotid = 0;
   public int point = 0;
   public int damage = 0;

   public playerdata(EntityPlayer player) {
      this.player = player;
   }

   public void init(Entity entity, World world) {
   }

   public static final void register(EntityPlayer player) {
      player.registerExtendedProperties("guilddt", new playerdata(player));
   }

   public static final playerdata get(EntityPlayer player) {
      return (playerdata)player.getExtendedProperties("guilddt");
   }

   private static final String getSaveKey(EntityPlayer player) {
      return player.func_70005_c_() + ":" + "guilddt";
   }

   public static final void saveProxyData(EntityPlayer player) {
      NBTTagCompound savedData = new NBTTagCompound();
      get(player).saveNBTData(savedData);
      proxyserver.savePlayerdata(getSaveKey(player), savedData);
   }

   public static final void loadProxyData(EntityPlayer player) {
      playerdata playerData = get(player);
      NBTTagCompound savedData = proxyserver.getPlayerData(getSaveKey(player));
      if (savedData != null) {
         playerData.loadNBTData(savedData);
      }

      mod.network.sendTo(new packetplayerdata(player), (EntityPlayerMP)player);
   }

   public final void saveNBTData(NBTTagCompound compound) {
      NBTTagCompound data = new NBTTagCompound();
      data.func_74757_a("host", this.host);
      data.func_74757_a("inguild", this.inguild);
      data.func_74778_a("guildname", this.guildname);
      data.func_74778_a("ghost", this.ghost);
      data.func_74778_a("mem01", this.mem01);
      data.func_74778_a("mem02", this.mem02);
      data.func_74778_a("mem03", this.mem03);
      data.func_74778_a("mem04", this.mem04);
      data.func_74778_a("mem05", this.mem05);
      data.func_74778_a("mem06", this.mem06);
      data.func_74778_a("mem07", this.mem07);
      data.func_74778_a("mem08", this.mem08);
      data.func_74778_a("mem09", this.mem09);
      data.func_74778_a("mem10", this.mem10);
      data.func_74778_a("mem11", this.mem11);
      data.func_74778_a("mem12", this.mem12);
      data.func_74778_a("mem13", this.mem13);
      data.func_74778_a("mem14", this.mem14);
      data.func_74778_a("mem15", this.mem15);
      data.func_74778_a("mem16", this.mem16);
      data.func_74778_a("mem17", this.mem17);
      data.func_74778_a("mem18", this.mem18);
      data.func_74778_a("mem19", this.mem19);
      data.func_74778_a("mem20", this.mem20);
      data.func_74778_a("mem21", this.mem21);
      data.func_74778_a("mem22", this.mem22);
      data.func_74778_a("mem23", this.mem23);
      data.func_74778_a("mem24", this.mem24);
      data.func_74778_a("mem25", this.mem25);
      data.func_74778_a("mem26", this.mem26);
      data.func_74778_a("mem27", this.mem27);
      data.func_74778_a("mem28", this.mem28);
      data.func_74778_a("mem29", this.mem29);
      data.func_74768_a("cdinvite", this.cdinvite);
      data.func_74768_a("page", this.page);
      data.func_74768_a("guildlv", this.guildlv);
      data.func_74768_a("guildexp", this.guildexp);
      data.func_74757_a("winwar", this.winwar);
      data.func_74757_a("openbuff", this.openbuff);
      data.func_74778_a("enemy", this.enemy);
      data.func_74768_a("cdwar", this.cdwar);
      data.func_74768_a("slotid", this.slotid);
      data.func_74768_a("point", this.point);
      data.func_74768_a("damage", this.damage);
      compound.func_74782_a("guilddt", data);
   }

   public final void loadNBTData(NBTTagCompound compound) {
      NBTTagCompound data = (NBTTagCompound)compound.func_74781_a("guilddt");
      this.host = data.func_74767_n("host");
      this.inguild = data.func_74767_n("inguild");
      this.guildname = data.func_74779_i("guildname");
      this.ghost = data.func_74779_i("ghost");
      this.mem01 = data.func_74779_i("mem01");
      this.mem02 = data.func_74779_i("mem02");
      this.mem03 = data.func_74779_i("mem03");
      this.mem04 = data.func_74779_i("mem04");
      this.mem05 = data.func_74779_i("mem05");
      this.mem06 = data.func_74779_i("mem06");
      this.mem07 = data.func_74779_i("mem07");
      this.mem08 = data.func_74779_i("mem08");
      this.mem09 = data.func_74779_i("mem09");
      this.mem10 = data.func_74779_i("mem10");
      this.mem11 = data.func_74779_i("mem11");
      this.mem12 = data.func_74779_i("mem12");
      this.mem13 = data.func_74779_i("mem13");
      this.mem14 = data.func_74779_i("mem14");
      this.mem15 = data.func_74779_i("mem15");
      this.mem16 = data.func_74779_i("mem16");
      this.mem17 = data.func_74779_i("mem17");
      this.mem18 = data.func_74779_i("mem18");
      this.mem19 = data.func_74779_i("mem19");
      this.mem20 = data.func_74779_i("mem20");
      this.mem21 = data.func_74779_i("mem21");
      this.mem22 = data.func_74779_i("mem22");
      this.mem23 = data.func_74779_i("mem23");
      this.mem24 = data.func_74779_i("mem24");
      this.mem25 = data.func_74779_i("mem25");
      this.mem26 = data.func_74779_i("mem26");
      this.mem27 = data.func_74779_i("mem27");
      this.mem28 = data.func_74779_i("mem28");
      this.mem29 = data.func_74779_i("mem29");
      this.cdinvite = data.func_74762_e("cdinvite");
      this.page = data.func_74762_e("page");
      this.guildlv = data.func_74762_e("guildlv");
      this.guildexp = data.func_74762_e("guildexp");
      this.winwar = data.func_74767_n("winwar");
      this.openbuff = data.func_74767_n("openbuff");
      this.enemy = data.func_74779_i("enemy");
      this.cdwar = data.func_74762_e("cdwar");
      this.slotid = data.func_74762_e("slotid");
      this.point = data.func_74762_e("point");
      this.damage = data.func_74762_e("damage");
   }
}
