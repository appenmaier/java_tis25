package model;

/**
 * A simple wrapper around a string array that provides a print method.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class StringArray {

   /** The underlying string array. */
   public String[] array;

   /**
    * Prints each element of {@link #array} on a separate line to standard output.
    */
   public void print() {
      for (String element : array) {
         System.out.println(element);
      }
   }

}
