package model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Represents a table lamp that requires a power connection, a switch, and a {@link LightBulb} to
 * produce light.
 *
 * <p>
 * A table light only shines when all three conditions are met: it is plugged in, switched on, and
 * has a light bulb installed.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
@ToString
@EqualsAndHashCode
public class TableLight {

   /** Indicates whether the lamp is plugged into a power outlet. */
   private boolean isConnected;

   /** Indicates whether the lamp's switch is in the on position. */
   private boolean isOn;

   /** The light bulb currently installed in this lamp, or {@code null} if none. */
   private LightBulb lightBulb;

   private final PlugType plugType;

   /**
    * Creates a table light with the given light bulb pre-installed.
    *
    * @param lightBulb the light bulb to install initially
    */
   public TableLight(LightBulb lightBulb) {
      this.lightBulb = lightBulb;
      plugType = PlugType.TYPE_F;
   }

   /**
    * Creates a table light with no light bulb installed.
    */
   public TableLight() {
      plugType = PlugType.TYPE_F;
   }

   /**
    * Plugs the lamp into a power outlet.
    */
   public void plugIn() {
      isConnected = true;
   }

   /**
    * Unplugs the lamp from the power outlet.
    */
   public void pullThePlug() {
      isConnected = false;
   }

   /**
    * Turns the lamp's switch to the on position.
    */
   public void switchOn() {
      isOn = true;
   }

   /**
    * Turns the lamp's switch to the off position.
    */
   public void switchOff() {
      isOn = false;
   }

   /**
    * Replaces the currently installed light bulb with a new one.
    *
    * @param newLightBulb the new light bulb to install; may be {@code null} to remove the current
    *        bulb without replacing it
    * @return the previously installed light bulb, or {@code null} if none was installed
    */
   public LightBulb changeLightBulb(LightBulb newLightBulb) {
      LightBulb oldLightBulb = null;
      oldLightBulb = lightBulb;
      lightBulb = newLightBulb;
      return oldLightBulb;
   }

   /**
    * Determines whether the lamp is currently producing light.
    *
    * <p>
    * Returns {@code true} only if the lamp is plugged in, switched on, and has a light bulb
    * installed.
    *
    * @return {@code true} if the lamp is shining; {@code false} otherwise
    */
   public boolean isShining() {
      return isConnected && isOn && lightBulb != null;
   }

   /**
    * Returns the light bulb currently installed in this lamp.
    *
    * @return the installed {@link LightBulb}, or {@code null} if none is installed
    */
   public LightBulb getLightBulb() {
      return lightBulb;
   }

   /**
    * Returns whether the lamp is plugged into a power outlet.
    *
    * @return {@code true} if connected; {@code false} otherwise
    */
   public boolean isConnected() {
      return isConnected;
   }

   /**
    * Returns whether the lamp's switch is in the on position.
    *
    * @return {@code true} if switched on; {@code false} otherwise
    */
   public boolean isOn() {
      return isOn;
   }

   /**
    * Returns the plug type of this table light.
    *
    * @return the {@link PlugType} of this light
    */
   public PlugType getPlugType() {
      return plugType;
   }

}
