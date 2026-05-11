package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Represents a battery-powered flash light that consumes energy each time it is switched on.
 *
 * <p>
 * The flash light only shines when it is switched on and still has remaining energy. It can be
 * recharged to full capacity via {@link #recharge()}.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public final class FlashLight extends Light {

   /** The current energy level, ranging from {@code 0.0} (empty) to {@code 1.0} (full). */
   private double energyLevel;

   /**
    * Creates a fully charged flash light.
    */
   public FlashLight() {
      energyLevel = 1.0;
   }

   /**
    * Switches the flash light on and consumes {@code 0.1} units of energy if available.
    */
   @Override
   public void switchOn() {
      if (energyLevel >= 0.1) {
         energyLevel -= 0.1;
      }
      super.switchOn();
   }

   // public void switchOff() {
   // isOn = false;
   // }

   /**
    * Recharges the flash light to full energy.
    */
   public void recharge() {
      energyLevel = 1.0;
   }

   /**
    * Returns whether the flash light is currently producing light.
    *
    * @return {@code true} if switched on and energy level is above zero; {@code false} otherwise
    */
   @Override
   public boolean isShining() {
      return isOn() && energyLevel > 0;
   }

}
