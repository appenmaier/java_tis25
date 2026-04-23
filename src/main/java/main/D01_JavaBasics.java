package main;

import java.util.Scanner;

public class D01_JavaBasics {

   public static void main(String[] args) {
      /* Datentypen und Datenobjekte */
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

      /* Verzweigungen */
      // Vergleichsoperatoren: >, >=, <, <=, ==, !=
      // Logischer Operatoren: && (Und), || (Oder), ! (Verneinung)
      if ((gender == 'm' || gender == 'M') && age >= 18) {
         System.out.println("Hallo Herr " + familyName);
      } else if ((gender == 'w' || gender == 'W') && age >= 18) {
         System.out.println("Hallo Frau " + familyName);
      } else {
         System.out.println("Hallo " + firstName);
      }

      String genderText;
      if (gender == 'm' || gender == 'M') {
         genderText = "männlich";
      } else if (gender == 'w' || gender == 'W') {
         genderText = "weiblich";
      } else {
         genderText = "divers";
      }
      System.out.println(genderText);

      genderText = (gender == 'm' || gender == 'M') ? "männlich"
            : (gender == 'w' || gender == 'W') ? "weiblich" : "divers";
      System.out.println(genderText);

      System.out.println((gender == 'm' || gender == 'M') ? "männlich"
            : (gender == 'w' || gender == 'W') ? "weiblich" : "divers");

      /* Fallunterscheidungen */
      genderText = switch (gender) {
         case 'm', 'M' -> "männlich";
         case 'w', 'W' -> "weiblich";
         default       -> "divers";
      };
      System.out.println(genderText);

      /* Schleifen */
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
         System.out.print("Schleifen Beenden? (true, false) ");
         if (scanner.nextBoolean()) {
            break;
         }
      }
   }

}
