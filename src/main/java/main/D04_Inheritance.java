package main;

import java.util.ArrayList;

import model.FlashLight;
import model.Light;
import model.LightBulb;
import model.TableLight;
import model.Toaster;
import model.WiredDevice;

/**
 * Demo 4: Demonstrates inheritance, polymorphism, upcasting, downcasting, and interfaces
 * using a light-device class hierarchy.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D04_Inheritance {

   /**
    * Entry point of the demonstration.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      /* Ansatz ohne Verberung */
      ArrayList<TableLight> tableLights = new ArrayList<>();
      tableLights.add(new TableLight());
      tableLights.add(new TableLight());
      tableLights.add(new TableLight());

      for (TableLight t : tableLights) {
         t.switchOn();
         t.plugIn();
         System.out.println(t);
         System.out.println(t.isShining());
      }

      ArrayList<FlashLight> flashLights = new ArrayList<>();
      flashLights.add(new FlashLight());
      flashLights.add(new FlashLight());

      for (FlashLight f : flashLights) {
         f.switchOn();
         System.out.println(f);
         System.out.println(f.isShining());
      }

      System.out.println();

      /* Ansatz mit Vererbung */
      ArrayList<Light> lights = new ArrayList<>();
      lights.add(new TableLight()); // Upcast
      lights.add(new TableLight()); // Upcast
      lights.add(new TableLight()); // Upcast
      lights.add(new FlashLight()); // Upcast
      lights.add(new FlashLight()); // Upcast

      for (Light l : lights) {
         l.switchOn(); // Dynamische Polymorphie

         if (l instanceof TableLight) {
            TableLight t = (TableLight) l; // Downcast
            t.changeLightBulb(new LightBulb());
            t.plugIn();
         }

         if (l instanceof FlashLight f) { // Downcast
            f.recharge();
         }

         System.out.println(l); // Statische und Dynamische Polymorphie
         System.out.println(l.isShining()); // Statische und Dynamische Polymorphie
      }

      System.out.println();

      /* Schnittstellen (Interfaces) */
      ArrayList<WiredDevice> devices = new ArrayList<>();
      devices.add(new TableLight()); // Upcast
      devices.add(new Toaster()); // Upcast

      for (WiredDevice w : devices) {
         w.plugIn(); // Polymorphie

         if (w instanceof TableLight) {
            TableLight t = (TableLight) w; // Downcast
            t.changeLightBulb(new LightBulb());
            t.switchOn();
         }

         System.out.println(w);
      }
   }

}
