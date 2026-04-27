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

   public LightBulb(String color) {
      this.color = color;
   }

   public LightBulb() {
      color = "warmweiß";
   }

   public String getColor() {
      return color;
   }

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
