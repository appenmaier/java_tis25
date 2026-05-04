package model;

import lombok.Getter;
import lombok.ToString;

/**
 * Plug types with their associated description, standard, and region.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Getter
@ToString
public enum PlugType {

   /** European Schuko plug (CEE 7/4), commonly used in Germany and most of Europe. */
   TYPE_F("Type-F", "CEE7/4", "Europe"),

   /** Australian/New Zealand plug (AS/NZS 3112), commonly used in Australia and New Zealand. */
   TYPE_I("Type-I", "AS/NZS 3112", "ANZ");

   /** Human-readable name of the plug type. */
   private final String description;

   /** Technical standard that specifies this plug type. */
   private final String norm;

   /** Geographic region where this plug type is predominantly used. */
   private final String region;

   PlugType(String description, String norm, String region) {
      this.description = description;
      this.norm = norm;
      this.region = region;
   }

}
