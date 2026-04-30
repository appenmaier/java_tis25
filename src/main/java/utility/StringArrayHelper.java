package utility;

/**
 * Utility class providing helper methods for string arrays.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class StringArrayHelper {

   /**
    * Prints each element of the given array on a separate line to standard output.
    *
    * @param array the string array to print
    */
   public static void print(String[] array) {
      for (String element : array) {
         System.out.println(element);
      }
   }

}
