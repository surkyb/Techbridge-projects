/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeVehiculo;

/**
 * Clase principal para probar la clase Vehiculo.
 * Crea vehículos con distintos constructores y muestra resultados de
 * los métodos calcularMantenimiento().
 * @author SurkyBaez
 */
public class SistemaDeVehiculo {

    public static void main(String[] args) {
        // Prueba de constructores
        Vehiculo v1 = new Vehiculo(); // por defecto
        Vehiculo v2 = new Vehiculo("Toyota", "Corolla"); // básico
        Vehiculo v3 = new Vehiculo(12345, "Honda", "Civic"); // completo

        System.out.println("Vehiculo básico: " + v2.getMarca() + " " + v2.getModelo());
        System.out.println("Vehiculo completo: " + v3.getPlaca() + " " + v3.getMarca() + " " + v3.getModelo());


        // Prueba de calcularMantenimiento
        System.out.println("Mantenimiento 8000 km: $" + v2.calcularMantenimiento(8000));
        System.out.println("Mantenimiento 12000 km: $" + v2.calcularMantenimiento(12000));
        System.out.println("Mantenimiento 8000 km, elaborado: $" + v3.calcularMantenimiento(8000, "elaborado"));
    }
}
