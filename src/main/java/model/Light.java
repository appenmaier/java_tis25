package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Abstract base class for all types of lights.
 *
 * <p>
 * Manages the on/off switch state and declares {@link #isShining()} for subclasses to define
 * their specific conditions for producing light.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
@Getter
@ToString
@EqualsAndHashCode
public abstract class Light {

   /** Indicates whether the light is currently switched on. */
   private boolean isOn;

   /**
    * Switches the light on.
    */
   public void switchOn() {
      isOn = true;
   }

   /**
    * Switches the light off.
    */
   public final void switchOff() {
      isOn = false;
   }

   /**
    * Returns whether the light is currently producing light.
    *
    * @return {@code true} if shining; {@code false} otherwise
    */
   public abstract boolean isShining();

}
