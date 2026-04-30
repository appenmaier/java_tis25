package model;

/**
 * Represents a scheduled flight connection between two airports.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class FlightConnection {

   /* Attribute */
   /** The IATA airline code (e.g., {@code "LH"} for Lufthansa). */
   public String airline;

   /** The unique identifier for this connection (e.g., {@code "0400"}). */
   public String connectionId;

   /** The IATA code of the departure airport (e.g., {@code "FRA"}). */
   public String departureAirport;

   /** The IATA code of the arrival airport (e.g., {@code "JFK"}). */
   public String arrivalAirport;

}
