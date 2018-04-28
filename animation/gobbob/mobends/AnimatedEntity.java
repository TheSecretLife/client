package animation.gobbob.mobends;

import animation.gobbob.mobends.animation.Animation;
import animation.gobbob.mobends.animation.player.Animation_Attack;
import animation.gobbob.mobends.animation.player.Animation_Axe;
import animation.gobbob.mobends.animation.player.Animation_Bow;
import animation.gobbob.mobends.animation.player.Animation_Jump;
import animation.gobbob.mobends.animation.player.Animation_Mining;
import animation.gobbob.mobends.animation.player.Animation_Riding;
import animation.gobbob.mobends.animation.player.Animation_Sneak;
import animation.gobbob.mobends.animation.player.Animation_Sprint;
import animation.gobbob.mobends.animation.player.Animation_Stand;
import animation.gobbob.mobends.animation.player.Animation_Swimming;
import animation.gobbob.mobends.animation.player.Animation_Walk;
import animation.gobbob.mobends.client.renderer.entity.RenderBendsPlayer;
import animation.gobbob.mobends.client.renderer.entity.RenderBendsSpider;
import animation.gobbob.mobends.client.renderer.entity.RenderBendsZombie;
import animation.gobbob.mobends.util.BendsLogger;
import cpw.mods.fml.client.registry.RenderingRegistry;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class AnimatedEntity {
   public static AnimatedEntity[] animatedEntities;
   public String id;
   public String displayName;
   public Entity entity;
   public Class entityClass;
   public Render renderer;
   public List animations = new ArrayList();
   public boolean animate = true;

   public AnimatedEntity(String argID, String argDisplayName, Entity argEntity, Class argClass, Render argRenderer) {
      this.id = argID;
      this.displayName = argDisplayName;
      this.entityClass = argClass;
      this.renderer = argRenderer;
      this.entity = argEntity;
      this.animate = true;
   }

   public AnimatedEntity add(Animation argGroup) {
      this.animations.add(argGroup);
      return this;
   }

   public static void registerRendering() {
      for(int i = 0; i < animatedEntities.length; ++i) {
         if (animatedEntities[i].animate) {
            RenderingRegistry.registerEntityRenderingHandler(animatedEntities[i].entityClass, animatedEntities[i].renderer);
         }
      }

      BendsLogger.log("Registering Animated Entities...", BendsLogger.INFO);
   }

   public Animation get(String argName) {
      for(int i = 0; i < this.animations.size(); ++i) {
         if (((Animation)this.animations.get(i)).getName().equalsIgnoreCase(argName)) {
            return (Animation)this.animations.get(i);
         }
      }

      return null;
   }

   public static AnimatedEntity getByEntity(Entity argEntity) {
      for(int i = 0; i < animatedEntities.length; ++i) {
         if (animatedEntities[i].entityClass.isInstance(argEntity)) {
            return animatedEntities[i];
         }
      }

      return null;
   }

   static {
      animatedEntities = new AnimatedEntity[]{(new AnimatedEntity("player", "Player", Minecraft.func_71410_x().field_71439_g, EntityPlayer.class, new RenderBendsPlayer())).add(new Animation_Stand()).add(new Animation_Walk()).add(new Animation_Sneak()).add(new Animation_Sprint()).add(new Animation_Jump()).add(new Animation_Attack()).add(new Animation_Swimming()).add(new Animation_Bow()).add(new Animation_Riding()).add(new Animation_Mining()).add(new Animation_Axe()), (new AnimatedEntity("zombie", "Zombie", new EntityZombie((World)null), EntityZombie.class, new RenderBendsZombie())).add(new animation.gobbob.mobends.animation.zombie.Animation_Stand()).add(new animation.gobbob.mobends.animation.zombie.Animation_Walk()), new AnimatedEntity("spider", "Spider", new EntitySpider((World)null), EntitySpider.class, new RenderBendsSpider())};
   }
}
