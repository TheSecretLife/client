package npcseller.container;

import cabalaccessorys.data.PlayerData;
import java.util.Random;
import java.util.Timer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import npcseller.TileC;
import npcseller.network.PacketDispatcher;
import npcseller.network.server.onServergetItem;
import org.lwjgl.opengl.GL11;

public class GuiContainerP extends GuiContainer {
   private IInventory playerInv;
   private TileC te;
   private boolean status = false;
   private boolean ongetitem = false;
   private int getitem = 0;
   private int t = 0;
   private ResourceLocation tex = new ResourceLocation("cabalaccessorys:textures/GuiNPCSHOPOP.png");
   private int price = 0;

   public GuiContainerP(IInventory playerInv, TileC te) {
      super(new ContainerP(playerInv, te));
      this.playerInv = playerInv;
      this.te = te;
      this.status = false;
      this.ongetitem = false;
      this.getitem = 0;
      this.price = 0;
      SlotCustom.select = 0;
   }

   public void func_73866_w_() {
      int w = this.field_146294_l / 2;
      int h = this.field_146295_m / 2;
      this.field_146292_n.clear();
      this.field_146292_n.add(new GuiButton(0, w + 100, h - 34, 40, 20, "ซื้อ"));
      this.field_146292_n.add(new GuiButton(1, w + 80, h + 50, 40, 20, "ยกเลิก"));
      SlotCustom.select = 0;
      Random r = new Random();
      int Low = 0;
      int High = 11;
      int Result = r.nextInt(High - Low) + Low;
      if (Result == 5) {
         this.getitem = 6;
      } else {
         this.getitem = Result;
      }

      super.func_73866_w_();
   }

   public void func_73863_a(int p_73863_1_, int p_73863_2_, float p_73863_3_) {
      ItemStack item = this.te.func_70301_a(SlotCustom.select);
      if (item != null) {
         NBTTagCompound nbt = item.field_77990_d;
         if (nbt == null) {
            nbt = new NBTTagCompound();
         }

         if (nbt.func_74764_b("price")) {
            this.price = nbt.func_74762_e("price");
         } else if (nbt.func_74764_b("point")) {
            this.price = nbt.func_74762_e("point");
         } else {
            this.price = 0;
         }
      }

      super.func_73863_a(p_73863_1_, p_73863_2_, p_73863_3_);
   }

   protected void func_146976_a(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_146297_k.field_71446_o.func_110577_a(this.tex);
      this.func_73729_b(this.field_146294_l / 2 - 100, this.field_146295_m / 2 - 80, 0, 0, 250, 200);
      PlayerData data = PlayerData.get(this.field_146297_k.field_71439_g);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_146289_q.func_78276_b("§f" + data.Money, this.field_146294_l / 2 - 65, this.field_146295_m / 2 - 9, 0);
      this.field_146289_q.func_78276_b("§f" + data.iconomypoint, this.field_146294_l / 2 + 25, this.field_146295_m / 2 - 9, 16777215);
      ItemStack item = this.te.func_70301_a(SlotCustom.select);
      if (item != null) {
         RenderHelper.func_74518_a();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         IIcon iicon1 = this.te.func_70301_a(SlotCustom.select).func_77954_c();
         if (item.func_77973_b() instanceof ItemBlock) {
            this.field_146297_k.field_71446_o.func_110577_a(TextureMap.field_110575_b);
         } else {
            this.field_146297_k.field_71446_o.func_110577_a(TextureMap.field_110576_c);
         }

         this.func_94065_a(this.field_146294_l / 2 + 110, this.field_146295_m / 2 - 70, iicon1, 16, 16);
         this.field_146289_q.func_78276_b("§fราคา " + this.price, this.field_146294_l / 2 + 100, this.field_146295_m / 2 - 45, 0);
      }

   }

   protected void func_146284_a(GuiButton p_146284_1_) {
      PlayerData data = PlayerData.get(this.field_146297_k.field_71439_g);
      if (p_146284_1_.field_146127_k == 0) {
         if (this.field_146297_k.field_71439_g.field_71071_by.func_70447_i() != -1) {
            ItemStack item = this.te.func_70301_a(SlotCustom.select);
            if (item != null) {
               NBTTagCompound nbt = item.field_77990_d;
               if (nbt == null) {
                  nbt = new NBTTagCompound();
               }

               Timer timer;
               if (nbt.func_74764_b("price")) {
                  if (data.Money >= nbt.func_74762_e("price")) {
                     if (TimerConfirm.getCountdown() == 0) {
                        timer = new Timer();
                        TimerConfirm.setCountdown(2);
                        timer.schedule(new TimerConfirm(), 0L, 1000L);
                        PacketDispatcher.sendToServer(new onServergetItem(this.te.func_70301_a(SlotCustom.select)));
                        this.field_146297_k.func_71381_h();
                     } else {
                        this.field_146297_k.field_71439_g.func_146105_b(new ChatComponentTranslation("§cคุณกดซื้อรัวเกินไป", new Object[0]));
                     }
                  } else {
                     this.field_146297_k.field_71439_g.func_146105_b(new ChatComponentTranslation("§cเงิน Gold มีไม่พอ", new Object[0]));
                     this.field_146297_k.func_71381_h();
                  }
               } else if (nbt.func_74764_b("point")) {
                  if (data.iconomypoint >= nbt.func_74762_e("point")) {
                     if (TimerConfirm.getCountdown() == 0) {
                        timer = new Timer();
                        TimerConfirm.setCountdown(2);
                        timer.schedule(new TimerConfirm(), 0L, 1000L);
                        PacketDispatcher.sendToServer(new onServergetItem(this.te.func_70301_a(SlotCustom.select)));
                        this.field_146297_k.func_71381_h();
                     } else {
                        this.field_146297_k.field_71439_g.func_146105_b(new ChatComponentTranslation("§cคุณกดซื้อรัวเกินไป", new Object[0]));
                     }
                  } else {
                     this.field_146297_k.field_71439_g.func_146105_b(new ChatComponentTranslation("§cเงิน Point มีไม่พอ", new Object[0]));
                     this.field_146297_k.func_71381_h();
                  }
               } else {
                  this.field_146297_k.field_71439_g.func_146105_b(new ChatComponentTranslation("§cไอเทมนี้ไม่ได้เซ็ตราคาขาย", new Object[0]));
                  this.field_146297_k.func_71381_h();
               }
            }
         } else {
            this.field_146297_k.field_71439_g.func_146105_b(new ChatComponentTranslation("§cช่องเก็บของเต็ม!", new Object[0]));
         }
      }

      if (p_146284_1_.field_146127_k == 1) {
         this.status = false;
         this.ongetitem = false;
         this.getitem = 0;
         this.field_146297_k.func_71381_h();
      }

      if (p_146284_1_.field_146127_k == 3) {
         this.status = false;
         this.ongetitem = false;
         this.getitem = 0;
         this.field_146297_k.field_71439_g.func_71053_j();
      }

   }

   public void func_146281_b() {
      super.func_146281_b();
      this.status = false;
      this.ongetitem = false;
      this.getitem = 0;
   }

   public boolean func_73868_f() {
      return false;
   }
}
