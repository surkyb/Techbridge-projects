/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_vehiculos;

/**
 *
 * @author Joshua Abreu
 */
public class Prueba {
    public static void main(String[] args) {
        // Se crea un vehículo usando el constructor que recibe solo la placa
        Vehiculo vehiculo1 = new Vehiculo("CK7M34L");
        
        // Se crea un vehículo usando el constructor completo
        Vehiculo vehiculo2 = new Vehiculo("LMU20M1", "Toyota", "Corolla");
        
        // Se crea un vehículo usando el constructor sin parámetros
        Vehiculo vehiculo3 = new Vehiculo();
        
        // Muestra el costo de mantenimiento del primer vehículo
        System.out.println("Precio 1");
        System.out.println(vehiculo1.calcularMantenimiento(8000));
        
        // Muestra el costo de mantenimiento del segundo vehículo
        System.out.println("\nPrecio 2");
        System.out.println(vehiculo2.calcularMantenimiento(12000, "completo"));
        
        // Muestra el costo de mantenimiento del tercer vehículo
        System.out.println("\nPrecio 3");
        System.out.println(vehiculo3.calcularMantenimiento(15000, "basico", "sucio"));
    }
    
}
