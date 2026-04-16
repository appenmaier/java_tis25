package main;

import java.util.Scanner;

public class D01_JavaBasics {

   public static void main(String[] args) {
      String firstName;
      String familyName;
      String firstNameAndLastName;

      int age;
      double sizeInM;
      boolean isHappy;
      char gender;

      int length = "Hello World".length();
      char charAt7 = "Hello World".charAt(7);

      System.out.println(length);
      System.out.println(charAt7);

      Scanner scanner = new Scanner(System.in);

      System.out.print("Gib bitte Deinen Vornamen ein: ");
      firstName = scanner.next();

      System.out.print("Gib bitte Deinen Nachnamen ein: ");
      familyName = scanner.next();

      System.out.print("Gib bitte Dein Alter ein: ");
      age = scanner.nextInt();

      System.out.print("Gib bitte Deine Größe in Meter ein: ");
      sizeInM = scanner.nextDouble();

      System.out.print("Gib bitte ein, ob Du glücklich bist (true, false): ");
      isHappy = scanner.nextBoolean();

      System.out.print("Gib bitte Dein Geschlecht ein (m, w, d): ");
      gender = scanner.next().charAt(0);

      System.out.println(firstName);
      System.out.println(familyName);
      System.out.println(firstName + " " + familyName);
      System.out.printf("%S %S%n", firstName, familyName);
      System.out.println(age);
      System.out.println(sizeInM);
      System.out.println(isHappy);
      System.out.println(gender);
   }

}
