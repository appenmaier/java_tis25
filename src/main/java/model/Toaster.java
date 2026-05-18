package model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Represents a toaster that can be plugged into and unplugged from a power outlet.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
@ToString
@EqualsAndHashCode
public class Toaster implements WiredDevice {

   /**
    * Plugs the toaster into a power outlet.
    */
   @Override
   public void plugIn() {
      System.out.println("plugged in");
   }

   /**
    * Unplugs the toaster from the power outlet.
    */
   @Override
   public void pullThePlug() {
      System.out.println("unplugged");
   }

}
