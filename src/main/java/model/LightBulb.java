package model;

import java.util.Objects;

/**
 * Represents a light bulb that can be inserted into a {@link TableLight}.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class LightBulb {

   /** The color of the light emitted by this bulb (e.g., "warm white", "daylight"). */
   private final String color;

   /**
    * Creates a light bulb with the given light color.
    *
    * @param color the color of the emitted light
    */
   public LightBulb(String color) {
      this.color = color;
   }

   /**
    * Creates a light bulb with the default color {@code "warmweiß"}.
    */
   public LightBulb() {
      color = "warmweiß";
   }

   /**
    * Returns the color of the light emitted by this bulb.
    *
    * @return the light color
    */
   public String getColor() {
      return color;
   }

   /**
    * Indicates whether this bulb is equal to the given bulb.
    * Two bulbs are equal if they emit the same color.
    *
    * @param otherLightBulb the bulb to compare with
    * @return {@code true} if both bulbs have the same color; {@code false} otherwise
    */
   public boolean equals(LightBulb otherLightBulb) {
      return this.color.equals(otherLightBulb.color);
   }

   @Override
   public String toString() {
      return "LightBulb [color=" + color + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(color);
   }

}
