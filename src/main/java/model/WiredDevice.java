package model;

/**
 * Interface for devices that connect to a power outlet via a cable.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public interface WiredDevice {

   /**
    * Plugs the device into a power outlet.
    */
   void plugIn();

   /**
    * Unplugs the device from the power outlet.
    */
   void pullThePlug();

}
