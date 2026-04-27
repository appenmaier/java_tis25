package main;

import java.time.LocalDate;

import model.Flight;
import model.FlightConnection;
import model.LightBulb;
import model.Person;
import model.StringArray;
import model.TableLight;
import model.Vehicle;
import utility.StringArrayHelper;

/**
 * Object Oriented Programming
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D02_ObjectOrientedProgramming {

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      /* Attribute */
      FlightConnection connection1 = new FlightConnection();
      connection1.airline = "LH";
      connection1.connectionId = "0400";
      connection1.departureAirport = "FRA";
      connection1.arrivalAirport = "JFK";

      Flight flight1 = new Flight();
      flight1.flightConnection = connection1;
      flight1.flightDate = LocalDate.of(2026, 4, 23);
      flight1.flightPriceInEuro = 555.99;

      Flight flight2 = new Flight();
      flight2.flightConnection = connection1;
      flight2.flightDate = LocalDate.of(2026, 5, 18);
      flight2.flightPriceInEuro = 700.03;

      /* Methoden */
      String[] names = {"Hans", "Peter", "Lisa"};
      StringArrayHelper.print(names);

      StringArray names2 = new StringArray();
      names2.array = names;
      names2.print();

      /* Objekte */
      LightBulb redLightBulb = new LightBulb("Rot");
      LightBulb blueLightBulb = new LightBulb("Blau");
      LightBulb blueLightBulb2 = new LightBulb("Blau");

      TableLight light1 = new TableLight();
      System.out.println(light1.isShining() ? light1.getLightBulb().getColor() : "dunkel");
      light1.plugIn();
      light1.switchOn();
      light1.changeLightBulb(blueLightBulb);
      System.out.println(light1.isShining() ? light1.getLightBulb().getColor() : "dunkel");

      System.out.println(blueLightBulb == blueLightBulb2);
      System.out.println(blueLightBulb.equals(blueLightBulb2));

      System.out.println(new LightBulb("Grün"));
      System.out.println(new String("Hello World"));

      System.out.println(blueLightBulb.hashCode());
      System.out.println(blueLightBulb2.hashCode());

      Person person1 = new Person("Hans", 23, 'm', false);
      Person person2 = new Person("Hans", 23, 'm', false);

      System.out.println(person1.equals(person2));
      System.out.println(person1);
      System.out.println(person1.hashCode());
      System.out.println(person2.hashCode());
      System.out.println(person1.name());

      Vehicle vehicle1 = new Vehicle("Skoda", "Superb Combi");
      Vehicle vehicle2 = new Vehicle("Skoda", "Superb Combi");
      System.out.println(vehicle1.equals(vehicle2));
      System.out.println(vehicle1);
      System.out.println(vehicle1.hashCode());
      System.out.println(vehicle2.hashCode());
      System.out.println(vehicle1.getModel());
   }

}
