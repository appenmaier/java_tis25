package model;

import lombok.Data;

/**
 * Vehicle
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Data
public class Vehicle {

   private final String make;
   private final String model;
   private double speedInKmh;

}
