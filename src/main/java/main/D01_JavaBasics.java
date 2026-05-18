package main;

import java.util.Scanner;

/**
 * Demo 1: Demonstrates fundamental Java language elements including primitive data types,
 * user input, conditional statements, loops, string comparison, and arrays.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D01_JavaBasics {

   /**
    * Entry point of the demonstration.
    * Reads user input from the console and illustrates branching, loops, and array operations.
    *
    * @param args program arguments (not used)
    */
   public static void main(String[] args) {
      /* Data types and data objects */
      String firstName;
      String familyName;
      @SuppressWarnings("unused")
      String firstNameAndLastName;

      int age;
      double sizeInM;
      boolean isHappy;
      char gender;

      int length = "Hello World".length();
      char charAt7 = "Hello World".charAt(7);

      System.out.println(length);
      System.out.println(charAt7);

      @SuppressWarnings("resource")
      Scanner scanner = new Scanner(System.in);

      System.out.print("Please enter your first name: ");
      firstName = scanner.next();

      System.out.print("Please enter your last name: ");
      familyName = scanner.next();

      System.out.print("Please enter your age: ");
      age = scanner.nextInt();

      System.out.print("Please enter your height in metres: ");
      sizeInM = scanner.nextDouble();

      System.out.print("Please enter whether you are happy (true, false): ");
      isHappy = scanner.nextBoolean();

      System.out.print("Please enter your gender (m, f, d): ");
      gender = scanner.next().charAt(0);

      System.out.println(firstName);
      System.out.println(familyName);
      System.out.println(firstName + " " + familyName);
      System.out.printf("%S %S%n", firstName, familyName);
      System.out.println(age);
      System.out.println(sizeInM);
      System.out.println(isHappy);
      System.out.println(gender);

      /* Conditional statements */
      // Comparison operators: >, >=, <, <=, ==, !=
      // Logical operators: && (and), || (or), ! (not)
      if ((gender == 'm' || gender == 'M') && age >= 18) {
         System.out.println("Hello Mr " + familyName);
      } else if ((gender == 'f' || gender == 'F') && age >= 18) {
         System.out.println("Hello Ms " + familyName);
      } else {
         System.out.println("Hello " + firstName);
      }

      String genderText;
      if (gender == 'm' || gender == 'M') {
         genderText = "male";
      } else if (gender == 'f' || gender == 'F') {
         genderText = "female";
      } else {
         genderText = "diverse";
      }
      System.out.println(genderText);

      genderText = (gender == 'm' || gender == 'M') ? "male"
            : (gender == 'f' || gender == 'F') ? "female" : "diverse";
      System.out.println(genderText);

      System.out.println((gender == 'm' || gender == 'M') ? "male"
            : (gender == 'f' || gender == 'F') ? "female" : "diverse");

      /* Switch expressions */
      genderText = switch (gender) {
         case 'm', 'M' -> "male";
         case 'f', 'F' -> "female";
         default       -> "diverse";
      };
      System.out.println(genderText);

      /* Loops */
      int x = 1;
      while (x <= 10) {
         System.out.println(x);
         x++;
      }

      int z = 1;
      do {
         System.out.println(z);
         z++;
      } while (z <= 10);

      for (int i = 1; i <= 10; i++) {
         System.out.println(i);
      }

      while (true) {
         System.out.print("Exit loop? (true, false) ");
         if (scanner.nextBoolean()) {
            break;
         }
      }

      /* String comparison */
      String text = "Hello";
      System.out.print("Please enter the string \"Hello\": ");
      String input = scanner.next();
      if (text.equals(input)) {
         System.out.println("Well done");
      } else {
         System.out.println("No, that was incorrect");
         System.out.println(text);
         System.out.println(input);
      }

      /* Arrays */
      String[] names = new String[3];
      names[0] = "Hans";
      names[1] = "Peter";
      names[2] = "Lisa";
      System.out.println(names[1]);
      names[1] = "Petra";

      int[] numbers = {5, -2, 77, 1, 9, 0, -3};
      numbers[2] = 7;
      System.out.println(numbers[0]);
      System.out.println(numbers[numbers.length - 1]);

      int total = 0;
      for (int i = 0; i < numbers.length; i++) {
         int number = numbers[i];
         total += number;
      }
      System.out.println(total);

      total = 0;
      for (int number : numbers) {
         total += number;
      }
      System.out.println(total);
   }

}
