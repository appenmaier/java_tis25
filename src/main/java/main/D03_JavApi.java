package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import model.LightBulb;
import model.Person;
import model.PlugType;
import model.TableLight;

/**
 * Demo class for the Java standard library.
 *
 * <p>
 * Demonstrates the use of commonly used Java API classes: mathematical calculations,
 * pseudo-random numbers, linked lists, date/time handling, system properties,
 * file reading, and enumerations.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D03_JavApi {

   @SuppressWarnings("unused")
   public static void main(String[] args) throws FileNotFoundException {
      /* Mathematische Berechnungen */
      int a = 5, b = 3;
      System.out.println(a + b);
      System.out.println(a - b);
      System.out.println(a * b);
      System.out.println((a / b) + " Rest " + (a % b));
      System.out.println((double) a / b);

      int i1 = (int) 5.6;
      double d1 = 5;

      System.out.println(i1);
      System.out.println(d1);

      System.out.println(Math.sqrt(64));

      /* Pseudozufallszahlen */
      Random random = new Random();

      for (int i = 0; i < 100; i++) {
         int randomNumber = random.nextInt(1, 7);
         System.out.println(randomNumber);
      }

      /* Listen */
      LinkedList<String> names = new LinkedList<>();

      System.out.println(names);

      names.add("Max");
      names.add("Peter");
      names.add(1, "Lisa");
      names.addFirst("Heidi");

      System.out.println(names);

      names.remove("Peter");

      for (int i = 0; i < names.size(); i++) {
         String name = names.get(i);
         System.out.println(name.toUpperCase());
      }

      for (String name : names) {
         System.out.println(name.toLowerCase());
      }

      /* Datums- und Zeitangaben */
      LocalDate date = LocalDate.of(2028, 4, 29);
      LocalTime time = LocalTime.of(15, 42);
      LocalDateTime dateAndTime = LocalDateTime.now();

      System.out.println(date.getDayOfWeek());
      System.out.println(date.getDayOfYear());
      System.out.println(date.getMonth());
      System.out.println(dateAndTime.getHour());
      System.out.println(dateAndTime.getMinute());

      long start = System.currentTimeMillis();
      for (int i = 0; i < 100; i++) {
         int randomNumber = random.nextInt(1, 7);
         System.out.println(randomNumber);
      }
      long end = System.currentTimeMillis();
      System.out.println(end - start + "ms");

      /* Systemeigenschaften */
      System.out.println(System.getProperty("file.separator"));
      System.out.println(System.getProperty("user.dir"));
      System.out.println(System.getProperty("user.home"));

      Properties properties = System.getProperties();
      System.out.println(properties);

      /* Auslesen von Dateien */
      // String path = "C:\\Users\\D054906\\git\\java_tis25\\src\\main\\resources\\persons.txt";
      String path = "src/main/resources/persons.txt";
      File file = new File(path);
      System.out.println(file.exists());

      ArrayList<Person> persons = new ArrayList<>();

      Scanner scanner = new Scanner(file);

      while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         String[] tokens = line.split(";");

         String name = tokens[0];
         char gender = tokens[1].charAt(0);
         int age = Integer.parseInt(tokens[2]);
         boolean isHappy = Boolean.parseBoolean(tokens[3]);

         Person person = new Person(name, age, gender, isHappy);
         persons.add(person);
      }

      scanner.close();

      System.out.println(persons);

      Integer x = Integer.parseInt("5");
      int z = x;

      /* Aufzählungen (Enumerations) */
      PlugType typeI = PlugType.TYPE_I;

      ArrayList<TableLight> lights = new ArrayList<>();

      lights.add(new TableLight());
      lights.add(new TableLight(new LightBulb("rot")));
      lights.add(new TableLight());

      int total = 0;
      for (TableLight t : lights) {
         if (t.getPlugType().equals(PlugType.TYPE_F)) {
            total++;
         }
      }
      System.out.println(total);
   }

}
