/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asignacion3_1;

/**
 *
 * @author Joshua Abreu
 */
public class Prueba {
    public static void main(String[] args) {
        // Se crea un objeto de la clase AutoMovil
        AutoMovil auto = new AutoMovil();
        // Se asignan valores a los atributos del AutoMovil
        auto.setMarca("Hyundai");
        auto.setModelo("Santa Fe");
        auto.setAnio(2019);
        auto.setColor("Gris");
        
        System.out.println("Marca: " + auto.getMarca());
        // Se llaman métodos del AutoMovil
        auto.frenar();
        auto.apagar();
        
        System.out.println("\n=== HONDA CIVIC ===");
        // Se crea un objeto de la clase HondaCivic
        HondaCivic honda = new HondaCivic();
        // Se asignan valores a los atributos heredados de AutoMovil
        honda.setMarca("Honda");
        honda.setModelo("Civic");
        honda.setAnio(2025);
        honda.setColor("Azul");
        
        System.out.println("Marca: " + honda.getMarca());
        // Se llaman los métodos sobrescritos en HondaCivic
        honda.frenar();
        honda.apagar();
    }
}
