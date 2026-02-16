/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sistemadevehiculos;

/**
 *
 * @author Gilber Vido Matricula 2025-2008
 */
public class Main {

    /**
     * Esta clase Main es para probar los costructores y la calculadora
     */
    public static void main(String[] args) 
    {
        
        /**
         * Aqui llamo los constructores para que aparezca en consola
         */
        Vehiculo v1 = new Vehiculo(); 
        Vehiculo v2 = new Vehiculo("Ferrari", "Aventador"); 
        Vehiculo v3 = new Vehiculo(12345, "Chevrolet", "Camaro"); 

        System.out.println("Vehiculo 1: " + v2.getMarca() + " " + v2.getModelo());
        System.out.println("Vehiculo 2: " + v3.getPlaca() + " " + v3.getMarca() + " " + v3.getModelo());


        // Prueba de calcularMantenimiento
        System.out.println("Mantenimiento 9500 km: $" + v2.calcularMantenimiento(9500));
        System.out.println("Mantenimiento 20000 km: $" + v2.calcularMantenimiento(20000));
        System.out.println("Mantenimiento 15400 km, Premium: $" + v3.calcularMantenimiento(15400, "Premium"));
    }
}
    

